package config;

import org.aeonbits.owner.Config;

//@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:${env}.properties",
})
public interface DriverConfig extends Config {

    @Key("browserstack.user")

    String browserstackUser();

    @Key("browserstack.key")

    String browserstackKey();

    @Key("platformName")
    String platformName();

    @Key("deviceName")
    String deviceName();

    @Key("platformVersion")
    String platformVersion();

    @Key("app")
    String app();

    @Key("browserstack.url")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String browserstackUrl();

    @Key("projectName")
    @DefaultValue("automation_mobile")
    String projectName();

    @Key("buildName")
    String buildName();

    @Key("name")
    String name();
}
