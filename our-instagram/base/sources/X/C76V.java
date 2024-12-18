package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.76V, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C76V {
    public final UserSession A00;
    public final C137096In A01;

    public final C42221xC A00(String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B("content://com.instagram.android.tam-attachment", 1);
        if (!str.startsWith("content://com.instagram.android.tam-attachment")) {
            return new C42221xC(C137776Lz.A00);
        }
        C137096In c137096In = this.A01;
        String A00 = c137096In.A00(str);
        if (!c137096In.A00.containsKey(LHB.A01(str)) && A00 != null) {
            return C42221xC.A09(A00);
        }
        return C42221xC.A09(str).A0J(new C48433Lbm(C137756Lx.A03.A01(this.A00, EnumC132075xi.A0b).A01)).A0G();
    }

    public C76V(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC137166Iv.A00(userSession);
    }
}
