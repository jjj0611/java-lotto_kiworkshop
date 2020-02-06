package domain.lotto;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoFactory {

    private static final int MINIMUM_LOTTO_NUMBER = 1;
    private static final int MAXIMUM_LOTTO_NUMBER = 45;

    public static Lotto publishLotto() {
        return Lotto.from(getLottoNumbers());
    }

    private static Set<LottoNumber> getLottoNumbers() {
        return IntStream.rangeClosed(MINIMUM_LOTTO_NUMBER, MAXIMUM_LOTTO_NUMBER)
                .limit(6)
                .distinct()
                .mapToObj(LottoNumber::from)
                .collect(Collectors.toSet());
    }
}
