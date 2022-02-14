package wolfdev1.com.github.DiscordBotTemplate.events;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import org.jetbrains.annotations.NotNull;
import wolfdev1.com.github.DiscordBotTemplate.Config;

public class onReadyEvent extends ListenerAdapter
{
    @Override
    public void onReady(@NotNull ReadyEvent event) {
        //In this place, we are going to register our slash commands
        // so that when we start the bot they are updated and loaded
        // automatically
        Guild guild = event.getJDA().getGuildById(Config.GUILD_ID);
        //This will be our first command, and we will do the same way to add more commands.
        assert guild != null;
        guild.upsertCommand("ping", "¡Pong! This command shows you the latency between the API and the bot").queue();
        guild.upsertCommand("create-channel", "This command create a channel :scream:")
                        .addOption(OptionType.STRING, "channel", "Create a text channel by giving it a name", true).queue();
        guild.upsertCommand("create-category", "This command create a cateogry :scream:")
                                .addOption(OptionType.STRING, "category", "Create a category by giving it a name", true).queue();
        guild.upsertCommand("create-role", "This command create a role :scream:")
                                        .addOption(OptionType.STRING, "role", "Create a role by giving it a name and color", true).addOption(OptionType.STRING, "color", "The color of the role in HTML or HEX")
                                                .queue();
        guild.updateCommands().queue();
        System.out.println(event.getJDA().getSelfUser().getAsTag() + ": Slash commands have been updated correctly.");
    }
}
