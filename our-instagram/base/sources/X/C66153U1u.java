package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.U1u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66153U1u {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    public final int A00() {
        boolean z;
        if (!AbstractC31178DnM.A1a(this.A02)) {
            UserSession userSession = this.A00;
            C14360o3.A0B(userSession, 0);
            if (C2TN.A00(userSession) || !AbstractC31178DnM.A1a(this.A01)) {
                MZI mzi = MZJ.A05;
                MZJ A00 = mzi.A00(userSession);
                if (AbstractC31178DnM.A1a(A00.A04)) {
                    z = ((Boolean) C2ST.A00(AnonymousClass191.A00, new PZB(A00, (InterfaceC23621Ds) null, 11))).booleanValue();
                } else {
                    z = ((InterfaceC19630xq) A00.A01.getValue()).getBoolean("bootstrap_override_enabled", false);
                }
                if (z) {
                    MZJ A002 = mzi.A00(userSession);
                    if (AbstractC31178DnM.A1a(A002.A04)) {
                        return ((Number) C2ST.A00(AnonymousClass191.A00, new PZB(A002, (InterfaceC23621Ds) null, 7))).intValue();
                    }
                    return ((InterfaceC19630xq) A002.A01.getValue()).getInt(MSV.A00(988), 3);
                }
            }
        }
        return (int) C18U.A01(C06090Tz.A05, this.A00, 36603674096571354L);
    }

    public final boolean A01() {
        return AbstractC31178DnM.A1a(this.A01);
    }

    public final boolean A02() {
        return AbstractC31178DnM.A1a(this.A02);
    }

    public C66153U1u(UserSession userSession) {
        this.A00 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new X2z(this, 22));
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new X2z(this, 21));
    }
}
