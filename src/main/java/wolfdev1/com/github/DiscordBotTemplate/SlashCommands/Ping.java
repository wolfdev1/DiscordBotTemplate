package wolfdev1.com.github.DiscordBotTemplate.SlashCommands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Ping extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event)
    {
        //In this part we tell the bot that if the command is equal to ping in this case, to execute the following actions
        if(event.getName().equals("ping"))
        {
            //We declare a discord embed to later send it to the client
                EmbedBuilder eb = new EmbedBuilder()
                        .setTitle("Pong!")
                        .setDescription("My ping is...")
                        .setColor(Color.WHITE);
                event.replyEmbeds(eb.build()).queue(embed -> {

                    if(event.getJDA().getGatewayPing() > 100) {
                        EmbedBuilder eb2 = new EmbedBuilder()
                                .setTitle("Pong!")
                                .setDescription("My ping is " + event.getJDA().getGatewayPing() + "ms")
                                .setColor(Color.decode("#ff4040"));
                        embed.editOriginalEmbeds(eb2.build()).queueAfter(2, TimeUnit.SECONDS);
                    }else{
                    if(event.getJDA().getGatewayPing() > 50) {
                        EmbedBuilder eb1 = new EmbedBuilder()
                                .setTitle("Pong!")
                                .setDescription("My ping is " + event.getJDA().getGatewayPing() + "ms")
                                .setColor(Color.decode("#ffd15e"));
                        embed.editOriginalEmbeds(eb1.build()).queueAfter(2, TimeUnit.SECONDS);
                        }else{
                        if(event.getJDA().getGatewayPing() < 50) {
                            EmbedBuilder eb3 = new EmbedBuilder()
                                    .setTitle("Pong!")
                                    .setDescription("My ping is " + event.getJDA().getGatewayPing() + "ms")
                                    .setColor(Color.decode("#95ff8a"));
                            embed.editOriginalEmbeds(eb3.build()).queueAfter(2, TimeUnit.SECONDS);
                        }
                    }
                    }
                });
                }
    }
}