package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.1A8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A8 extends AbstractC225918h {
    public InterfaceC08830cm A00;
    public boolean A04;
    public final int A05;
    public final InterfaceC228919r A06;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final java.util.Set A09 = new HashSet();
    public final java.util.Set A08 = new HashSet();
    public final java.util.Set A07 = new HashSet();
    public C4GB A03 = null;
    public long[][] A01 = null;
    public C23091Ao A02 = null;

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
    public final boolean isValid() {
        return true;
    }

    @Override // X.AbstractC225918h
    public final void logConfigs(String str, EnumC72343Xbf enumC72343Xbf, Map map) {
    }

    @Override // X.AbstractC225918h
    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return false;
    }

    @Override // X.AbstractC225918h
    public final boolean updateEmergencyPushConfigs() {
        return false;
    }

    private String A00() {
        String str = this.A0A;
        int i = this.A05;
        String str2 = this.A0C;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.A0B;
        if (!str.endsWith("/")) {
            str = AnonymousClass001.A0R(str, "/");
        }
        return AnonymousClass001.A0R(str, C4G9.A00(i, str2, str3));
    }

    public static String A01(C1A8 c1a8) {
        int i = c1a8.A05;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("getGeneratedSchemaHash: %d is not a MobileConfigUnitType", Integer.valueOf(i)));
        }
        return c1a8.A06.Bqa(i);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.4GB] */
    @Override // X.AbstractC225918h
    public final AbstractC226118l getLatestHandle() {
        if (this.A04) {
            if (this.A02 == null) {
                String A04 = C4G9.A04(A00());
                if (!A04.isEmpty()) {
                    this.A02 = new C23091Ao(A04);
                }
            }
            return this.A02;
        }
        if (this.A03 == null) {
            final String A042 = C4G9.A04(A00());
            if (!A042.isEmpty()) {
                this.A03 = new AbstractC226018k(A042) { // from class: X.4GB
                    public final String A00;

                    @Override // X.AbstractC226118l
                    public final ByteBuffer getJavaByteBuffer() {
                        return AbstractC226018k.A00(this.A00);
                    }

                    {
                        this.A00 = A042;
                    }
                };
            }
        }
        return this.A03;
    }

    @Override // X.AbstractC225918h
    public final C0U0 getOrCreateOverridesTable() {
        File file = new File(AnonymousClass001.A0R(this.A0A, "mc_overrides.json"));
        C19z A01 = C19z.A01(file);
        if (this.A00 != null && file.exists()) {
            int i = this.A05;
            long[][] jArr = this.A01;
            InterfaceC08830cm interfaceC08830cm = this.A00;
            synchronized (A01) {
                Map map = A01.A08;
                Integer valueOf = Integer.valueOf(i);
                map.put(valueOf, jArr);
                A01.A07.put(valueOf, interfaceC08830cm);
                A01.A03();
            }
        }
        return A01;
    }

    @Override // X.AbstractC225918h
    public final void logAccessWithoutExposure(String str, String str2) {
        this.A07.add(new C4GE(str, 0L, "", str2));
    }

    @Override // X.AbstractC225918h
    public final void logExposure(String str, long j, String str2, String str3) {
        this.A08.add(new C4GE(str, j, str2, str3));
    }

    @Override // X.AbstractC225918h
    public final String syncFetchReason() {
        if (this.A01 != null) {
            return "MobileConfigJavaManager: Using translation table.";
        }
        return "MobileConfigJavaManager: No sync fetch was needed";
    }

    @Override // X.AbstractC225918h
    public final boolean updateConfigs(C0U3 c0u3) {
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = c0u3.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
        return false;
    }

    public C1A8(InterfaceC228919r interfaceC228919r, File file, String str, String str2, int i, int i2, boolean z) {
        this.A0A = C4G9.A02(file, i2);
        this.A0C = str;
        this.A05 = i;
        this.A06 = interfaceC228919r;
        this.A04 = z;
        this.A0B = str2;
    }

    @Override // X.AbstractC225918h
    public final void logExposure(String str, long j, String str2) {
        logExposure(str, 0L, "", "");
    }
}
