package mcts;

import java.util.List;

public interface State<Action> {

    boolean isTerminal();

    List<Action> getAvailableActions();

    int getAgent();

    int getPreviousAgent();

    double getRewardFor(int agent);

    State<Action> takeAction(Action action);

    int getWinner();

}