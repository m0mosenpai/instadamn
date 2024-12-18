package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1ZX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZX {
    public Throwable A00;
    public final C0f5 A01;
    public final UserSession A02;
    public final Integer A03;
    public final Map A04;

    public C1ZX(C0f6 c0f6, UserSession userSession, Integer num, int i, int i2, boolean z) {
        C14360o3.A0B(c0f6, 1);
        this.A03 = num;
        this.A02 = userSession;
        this.A04 = new LinkedHashMap();
        this.A01 = c0f6.AEr(Boolean.valueOf(z), C1ZY.A00(num), i, i2);
    }

    public final void A03(String str, String str2) {
        C14360o3.A0B(str2, 1);
        this.A01.ABW(str, str2);
        this.A04.put(str, str2);
    }

    public final void A00() {
        this.A01.report();
        C0K8.A0C("IgFunctionalErrorEvent", C1ZY.A00(this.A03));
        Throwable th = this.A00;
        if (th != null) {
            C0K8.A0C("IgFunctionalErrorEvent", String.valueOf(C2Ql.A00(th)));
        }
        for (Map.Entry entry : this.A04.entrySet()) {
            C0K8.A0C("IgFunctionalErrorEvent", AnonymousClass001.A0u("\t ", (String) entry.getKey(), " = ", (String) entry.getValue()));
        }
    }

    public final void A01(String str, int i) {
        this.A01.ABU(str, i);
        this.A04.put(str, String.valueOf(i));
    }

    public final void A02(String str, long j) {
        this.A01.ABV(str, j);
        this.A04.put(str, String.valueOf(j));
    }

    public final void A04(String str, boolean z) {
        this.A01.ABX(str, z);
        this.A04.put(str, String.valueOf(z));
    }

    public final void A05(Throwable th) {
        this.A00 = th;
        this.A01.ERI(th);
    }
}
