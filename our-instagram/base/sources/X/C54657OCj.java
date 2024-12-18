package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OCj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54657OCj {
    public final C4QF A00;
    public final UserSession A01;
    public final InterfaceC09390do A04 = C57545PgJ.A01(this, 0);
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C57243PbR(this, 49));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C57243PbR(this, 48));

    public C54657OCj(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = new C4QF(new SharedPreferencesC19650xs(C1AT.A01(userSession).A04(C1AV.A16, C4QF.class)), "dcp_ig_models");
    }
}
