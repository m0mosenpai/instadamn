package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IMF {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final java.util.Set A04;
    public final UserSession A05;

    public IMF(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A03 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A04 = AbstractC166987dD.A1H();
        this.A02 = interfaceC11380iw.getModuleName();
    }

    public final synchronized void A00() {
        try {
            java.util.Set set = this.A04;
            if (set.contains(528295024)) {
                C006802i.A0p.markerEnd(528295024, (short) 2);
                set.remove(528295024);
            }
        } finally {
        }
    }
}
