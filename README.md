# Discord SlashCommands Bot Template

This is an example of slash commands for discord,
written entirely in Java using Gradle as the library manager.

# Used Dependencies

- [JDA 5](https://github.com/DV8FromTheWorld/JDA) (Java Discord API)
- [Logback Classic](https://mvnrepository.com/artifact/ch.qos.logback/logback-classic)

# Ok, but what use is this to me?

The objective of this bot is just to clarify a 
little the doubts or even if you are new in this development 
of bots, you have where to take references

# I can try it?

Of course! The only thing you need to do is clone the repository to a local repository.

```
$ git clone https://github.com/wolfdev1/DiscordBotTemplate
```

# Now, how can I start the bot?

The only thing you need is to go to the main 
package and enter the Config.java file and modify
the GUILD_ID and the BOT_TOKEN, then they should only start the Bot.java class

```java
public class Config {
    public static String GUILD_ID = "Here your Guild Id";
    public static String BOT_TOKEN = "Here your token";
}
```

# How do I get my Guild Id?

In the computer client, on the icon of your server in the sidebar you will right click and copy id

![](https://github.com/wolfdev1/DiscordBotTemplate/blob/master/png/image.png?raw=true)
