package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.19m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C228419m extends AbstractC225918h {
    public AtomicReference A00 = new AtomicReference("");

    @Override // X.AbstractC225918h
    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
    }

    @Override // X.AbstractC225918h
    public final String getDataDirPath() {
        return "";
    }

    @Override // X.AbstractC225918h
    public final long getLastNormalUpdateTimestamp() {
        return 0L;
    }

    @Override // X.AbstractC225918h
    public final /* bridge */ /* synthetic */ AbstractC226118l getLatestHandle() {
        return null;
    }

    @Override // X.AbstractC225918h
    public final C0U0 getOrCreateOverridesTable() {
        return C19z.A01(new File(AnonymousClass001.A0R(null, "mc_overrides.json")));
    }

    @Override // X.AbstractC225918h
    public final boolean isValid() {
        return false;
    }

    @Override // X.AbstractC225918h
    public final void logAccessWithoutExposure(String str, String str2) {
    }

    @Override // X.AbstractC225918h
    public final void logConfigs(String str, EnumC72343Xbf enumC72343Xbf, Map map) {
    }

    @Override // X.AbstractC225918h
    public final void logExposure(String str, long j, String str2) {
    }

    @Override // X.AbstractC225918h
    public final void logExposure(String str, long j, String str2, String str3) {
    }

    @Override // X.AbstractC225918h
    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return false;
    }

    @Override // X.AbstractC225918h
    public final boolean updateEmergencyPushConfigs() {
        return false;
    }

    @Override // X.AbstractC225918h
    public final String syncFetchReason() {
        return AnonymousClass001.A0R("MobileConfigManagerHolderNoop: ", (String) this.A00.get());
    }

    @Override // X.AbstractC225918h
    public final boolean updateConfigs(C0U3 c0u3) {
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = c0u3.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
        return false;
    }
}
