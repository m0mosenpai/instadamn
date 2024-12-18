package X;

import java.util.Date;

/* loaded from: classes9.dex */
public final class OXE {
    public static final OXE A00 = new Object();

    public final void A00(String str, String str2) {
        C14360o3.A0B(str2, 1);
        N0B.A00.A00("D", str, str2, null, new Date());
    }

    public final void A01(String str, String str2) {
        C14360o3.A0B(str2, 1);
        N0B.A00.A00("I", str, str2, null, new Date());
    }

    public final void A02(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        if (th == null) {
            C0K8.A0C(str, str2);
        } else {
            C0K8.A0G(str, str2, th);
        }
        N0B.A00.A00("E", str, str2, th, new Date());
    }

    public final void A03(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        if (th == null) {
            C0K8.A0D(str, str2);
        } else {
            C0K8.A0I(str, str2, th);
        }
        N0B.A00.A00("W", str, str2, th, new Date());
    }

    public final void A04(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        if (th == null) {
            C0K8.A0E(str, str2);
        } else {
            C0K8.A0K(str, str2, th);
        }
        N0B.A00.A00("WTF", str, str2, th, new Date());
    }
}
