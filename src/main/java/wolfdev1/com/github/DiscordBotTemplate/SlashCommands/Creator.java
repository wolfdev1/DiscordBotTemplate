package wolfdev1.com.github.DiscordBotTemplate.SlashCommands;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;

public class Creator extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {

                    if(event.getName().equals("create-channel"))
                    {
                        if(!Objects.requireNonNull(event.getMember()).hasPermission(Permission.KICK_MEMBERS))
                        {
                            event.reply("Only members of the moderation team can use this :rolling_eyes:").setEphemeral(true).queue();
                        }else{
                        Objects.requireNonNull(event.getGuild()).createTextChannel(event.getOptionsByName("channel").get(0).getAsString()).queue();
                        event.reply("The channel with the name **" + event.getOptionsByName("channel").get(0).getAsString() + "** has been created successfully").setEphemeral(true).queue();
                        }
                    }
                    else{
                        if(event.getName().equals("create-category"))
                        {
                            if(!Objects.requireNonNull(event.getMember()).hasPermission(Permission.KICK_MEMBERS))
                            {
                                event.reply("Only members of the moderation team can use this :rolling_eyes:").setEphemeral(true).queue();
                            }else{
                            Objects.requireNonNull(event.getGuild()).createCategory(event.getOptionsByName("category").get(0).getAsString()).queue();
                            event.reply(("The category with the name **" + event.getOptionsByName("category").get(0).getAsString() + "** has been created successfully")).setEphemeral(true).queue();
                            }
                        }
                        else{
                            if(event.getName().equals("create-role"))
                            {
                                if(!Objects.requireNonNull(event.getMember()).hasPermission(Permission.KICK_MEMBERS))
                                {
                                    event.reply("Only members of the moderation team can use this :rolling_eyes:").setEphemeral(true).queue();
                                }else{

                                String r = event.getOptionsByName("role").get(0).getAsString();
                                String c = event.getOptionsByName("color").get(0).getAsString();
                                if(c.isEmpty()) {
                                    Objects.requireNonNull(event.getGuild()).createRole().setName(r).queue();
                                    }
                                else
                                {
                                    try{
                                        Objects.requireNonNull(event.getGuild()).createRole().setName(r).setColor(Color.decode(c)).queue();
                                        event.reply("The role with the name has been created successfully **" + c + "**").setEphemeral(true).queue();
                                    }catch (Exception e) {
                                        event.reply("You must enter a valid html or hex code, you can get one by searching google for html color picker").setEphemeral(true).queue();
                                    }

                                    }
                                }
                            }
                        }
                    }
                }
            }
