package domain.lotto;

import java.util.Set;

public class Lotto {

    private static final int LOTTO_SIZE = 6;

    private Set<LottoNumber> lottoNumbers;

    public static Lotto from(Set<LottoNumber> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException();
        }
        return new Lotto(lottoNumbers);
    }

    private Lotto(Set<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    int match(Lotto targetLotto) {
        return (int) lottoNumbers.stream().filter(targetLotto::contains).count();
    }

    boolean contains(LottoNumber lottoNumber) {
        return lottoNumbers.contains(lottoNumber);
    }

    public Set<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }
}
