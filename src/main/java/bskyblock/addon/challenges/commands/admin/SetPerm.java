/**
 *
 */
package bskyblock.addon.challenges.commands.admin;

import java.util.List;

import bskyblock.addon.challenges.ChallengesAddon;
import us.tastybento.bskyblock.api.commands.CompositeCommand;
import us.tastybento.bskyblock.api.user.User;

/**
 * @author tastybento
 *
 */
public class SetPerm extends CompositeCommand {

    /**
     * @param plugin
     * @param label
     * @param string
     */
    public SetPerm(ChallengesAddon plugin, String label, String... string) {
        super(plugin, label, string);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param parent
     * @param label
     * @param aliases
     */
    public SetPerm(CompositeCommand parent, String label, String... aliases) {
        super(parent, label, aliases);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param label
     * @param aliases
     */
    public SetPerm(String label, String... aliases) {
        super(label, aliases);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see us.tastybento.bskyblock.api.commands.BSBCommand#setup()
     */
    @Override
    public void setup() {
        // TODO Auto-generated method stub

    }

    /* (non-Javadoc)
     * @see us.tastybento.bskyblock.api.commands.BSBCommand#execute(us.tastybento.bskyblock.api.commands.User, java.util.List)
     */
    @Override
    public boolean execute(User user, String label, List<String> args) {
        // TODO Auto-generated method stub
        return false;
    }

}
