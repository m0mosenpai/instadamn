package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MZJ {
    public static final MZI A05 = new Object();
    public final C2GT A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public final boolean A00() {
        if (AbstractC31178DnM.A1a(this.A04)) {
            return AbstractC166987dD.A1a(C2ST.A00(AnonymousClass191.A00, new PZB(this, (InterfaceC23621Ds) null, 10)));
        }
        return ((InterfaceC19630xq) this.A01.getValue()).getBoolean("display_source_as_search_subtitle", false);
    }

    public MZJ(UserSession userSession) {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new GSw(userSession, 18));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new GSw(userSession, 17));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new GSw(userSession, 15));
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new GSw(this, 16));
        this.A02 = A00;
        this.A00 = AbstractC31172DnG.A0E((InterfaceC19390xP) A00.getValue());
    }
}
