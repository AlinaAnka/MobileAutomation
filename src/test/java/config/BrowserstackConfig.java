package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties"
})

public interface BrowserstackConfig extends Config {

    @Key("browserstack.url")
    String url();

    @Key("browserstack.userName")
    String userName();

    @Key("browserstack.accessKey")
    String accessKey();

    @Key("browserstack.app")
    String app();

    @Key("device.android")
    String androidDevice();

    @Key("os.android")
    String androidVersion();

    @Key("device.ios")
    String iosDevice();

    @Key("os.ios")
    String iosVersion();
}
