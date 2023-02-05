package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.Assertions.*;

class BishopBlackTest {

    @Test
    void whenPositionIsTheSame() {
        BishopBlack bp = new BishopBlack(Cell.C8);
        Cell expected = Cell.C8;
        assertThat(bp.position()).isEqualTo(expected);
    }

    @Test
    void whenCopyIsCorrect() {
        BishopBlack bp = new BishopBlack(Cell.C8);
        Cell expected = Cell.A6;
        assertThat(bp.copy(Cell.A6).position()).isEqualTo(expected);
    }

    @Test
    void whenWayIsCorrect() {
        BishopBlack bp = new BishopBlack(Cell.C1);
        Cell[] cells = bp.way(Cell.G5);
        Cell expected = Cell.G5;
        assertThat(cells[3]).isEqualTo(expected);
    }
}
