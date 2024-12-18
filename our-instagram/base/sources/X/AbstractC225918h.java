package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Map;

/* renamed from: X.18h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC225918h {
    public abstract void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    public abstract String getDataDirPath();

    public abstract long getLastNormalUpdateTimestamp();

    public abstract AbstractC226118l getLatestHandle();

    public abstract C0U0 getOrCreateOverridesTable();

    public abstract boolean isValid();

    public abstract void logAccessWithoutExposure(String str, String str2);

    public abstract void logConfigs(String str, EnumC72343Xbf enumC72343Xbf, Map map);

    public abstract void logExposure(String str, long j, String str2);

    public abstract void logExposure(String str, long j, String str2, String str3);

    public abstract boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener);

    public abstract String syncFetchReason();

    public abstract boolean updateConfigs(C0U3 c0u3);

    public abstract boolean updateEmergencyPushConfigs();
}
