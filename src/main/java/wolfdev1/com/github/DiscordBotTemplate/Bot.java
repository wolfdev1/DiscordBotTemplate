package wolfdev1.com.github.DiscordBotTemplate;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import wolfdev1.com.github.DiscordBotTemplate.SlashCommands.Creator;
import wolfdev1.com.github.DiscordBotTemplate.SlashCommands.Ping;
import wolfdev1.com.github.DiscordBotTemplate.events.onReadyEvent;

import javax.security.auth.login.LoginException;

public class Bot
{
    public static void main(String[] args) throws LoginException {
        JDA builder = JDABuilder.createDefault(Config.BOT_TOKEN)
                .setActivity(Activity.competing("CosoUHC"))
                .addEventListeners(new onReadyEvent())
                .addEventListeners(new Creator())
                .addEventListeners(new Ping())
                .build();

    }
}