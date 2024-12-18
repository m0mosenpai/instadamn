package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Map;

/* renamed from: X.19l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C228319l extends AbstractC225918h {
    public C0RG A00 = null;
    public volatile AbstractC225918h A01 = new C228419m();

    public final synchronized AbstractC225918h A01() {
        return this.A01;
    }

    public static MobileConfigManagerHolderImpl A00(AbstractC225918h abstractC225918h) {
        while (abstractC225918h instanceof C228319l) {
            abstractC225918h = ((C228319l) abstractC225918h).A01();
        }
        if (!MobileConfigManagerHolderImpl.class.isInstance(abstractC225918h)) {
            abstractC225918h = null;
        }
        return (MobileConfigManagerHolderImpl) abstractC225918h;
    }

    @Override // X.AbstractC225918h
    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        this.A01.fetchNames(z, mobileConfigUpdateConfigsCallback);
    }

    @Override // X.AbstractC225918h
    public final String getDataDirPath() {
        return this.A01.getDataDirPath();
    }

    @Override // X.AbstractC225918h
    public final long getLastNormalUpdateTimestamp() {
        return this.A01.getLastNormalUpdateTimestamp();
    }

    @Override // X.AbstractC225918h
    public final AbstractC226118l getLatestHandle() {
        return this.A01.getLatestHandle();
    }

    @Override // X.AbstractC225918h
    public final C0U0 getOrCreateOverridesTable() {
        return this.A01.getOrCreateOverridesTable();
    }

    @Override // X.AbstractC225918h
    public final boolean isValid() {
        return this.A01.isValid();
    }

    @Override // X.AbstractC225918h
    public final void logAccessWithoutExposure(String str, String str2) {
        this.A01.logAccessWithoutExposure(str, str2);
    }

    @Override // X.AbstractC225918h
    public final void logConfigs(String str, EnumC72343Xbf enumC72343Xbf, Map map) {
        this.A01.logConfigs(str, enumC72343Xbf, map);
    }

    @Override // X.AbstractC225918h
    public final void logExposure(String str, long j, String str2, String str3) {
        this.A01.logExposure(str, j, str2, str3);
    }

    @Override // X.AbstractC225918h
    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return this.A01.registerConfigChangeListener(mobileConfigCxxChangeListener);
    }

    @Override // X.AbstractC225918h
    public final String syncFetchReason() {
        return this.A01.syncFetchReason();
    }

    @Override // X.AbstractC225918h
    public final boolean updateConfigs(C0U3 c0u3) {
        return this.A01.updateConfigs(c0u3);
    }

    @Override // X.AbstractC225918h
    public final boolean updateEmergencyPushConfigs() {
        return this.A01.updateEmergencyPushConfigs();
    }

    @Override // X.AbstractC225918h
    public final void logExposure(String str, long j, String str2) {
        this.A01.logExposure(str, 0L, "");
    }
}
