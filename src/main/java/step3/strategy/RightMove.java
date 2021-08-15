package step3.strategy;

import step3.Position;

public class RightMove implements SideMoveStrategy {
    private final Position position;

    public RightMove(Position position) {
        this.position = position;
    }

    @Override
    public Position move() {
        return position.toRight();
    }
}
