package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class C2J extends CWE {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public C2J(UserSession userSession, C38321qM c38321qM, boolean z, boolean z2) {
        super(c38321qM);
        JLN AtQ;
        String B4d;
        this.A00 = userSession;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = (!AbstractC166297by.A00(userSession, c38321qM) || (AtQ = c38321qM.A0C.AtQ()) == null || (B4d = AtQ.B4d()) == null || B4d.length() == 0) ? false : true;
    }
}
