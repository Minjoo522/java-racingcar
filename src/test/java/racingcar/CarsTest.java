package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("자동차들 생성 테스트")
class CarsTest {
    @DisplayName("자동차 중복 테스트")
    @Test
    void CarNameDuplicationTest() {
        assertThatThrownBy(() -> {
            List<Car> value = Arrays.asList(
                    new Car(new CarName("CAR")),
                    new Car(new CarName("CAR"))
            );
            Cars cars = new Cars(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("자동차 개수 테스트")
    @Test
    void MinimumCarAmountTest() {
        assertThatThrownBy(() -> {
            List<Car> value = Arrays.asList(
                    new Car(new CarName("CAR"))
            );
            Cars cars = new Cars(value);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}