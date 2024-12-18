package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46862Da {
    public final InterfaceC09390do A00;
    public final boolean A01;

    public final C14090nZ A00(int i) {
        boolean z = this.A01;
        C12L c12l = C12L.A00;
        if (z) {
            return c12l.CPG(988755227, i);
        }
        return c12l.AOT(988755227, i);
    }

    public final Integer A01(int i) {
        int i2;
        if (this.A01) {
            InterfaceC09390do interfaceC09390do = this.A00;
            if (((Number) interfaceC09390do.getValue()).intValue() <= 19) {
                i2 = ((Number) interfaceC09390do.getValue()).intValue();
            } else if (i != 1) {
                i2 = -2;
                if (i != 2) {
                    i2 = 0;
                }
            } else {
                i2 = -8;
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public C46862Da(UserSession userSession) {
        this.A01 = C18U.A06(C06090Tz.A05, userSession, 36327486225660535L);
        this.A00 = AbstractC09440dt.A01(new C9E1(userSession, 20));
    }
}
