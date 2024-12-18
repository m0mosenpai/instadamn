package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class LVS implements C94A {
    public C55713Oof A00;
    public final UserSession A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    public LVS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new C57545PgJ(this, 19));
        this.A03 = AbstractC09440dt.A00(enumC09460dv, new C57545PgJ(this, 18));
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A04, new C57545PgJ(this, 17));
    }

    @Override // X.C94A
    public final void cleanup() {
        this.A00 = null;
    }

    @Override // X.C94A
    public final void COI() {
        InterfaceC10260gi interfaceC10260gi;
        InterfaceC09390do interfaceC09390do = this.A04;
        if (((C55715Ooh) interfaceC09390do.getValue()).Car()) {
            UserSession userSession = this.A01;
            C73673Rt c73673Rt = new C73673Rt(AbstractC43592JPx.A0N(), 1028142044);
            c73673Rt.A00();
            C3SN A01 = new OVS(userSession).A01(c73673Rt, (C55715Ooh) interfaceC09390do.getValue(), (C3RU) this.A03.getValue());
            boolean z = A01.A02;
            if (z) {
                Object obj = A01.A00;
                if (obj != null) {
                    this.A00 = (C55713Oof) obj;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            InterfaceC10260gi interfaceC10260gi2 = ((C55715Ooh) interfaceC09390do.getValue()).A00;
            if ((interfaceC10260gi2 != null && interfaceC10260gi2.AhA(2342166780292705890L)) || ((interfaceC10260gi = ((C55715Ooh) interfaceC09390do.getValue()).A00) != null && interfaceC10260gi.AhA(36323771078946401L))) {
                ((LVR) this.A02.getValue()).COI();
            }
            c73673Rt.A04(z, A01.A01);
        }
    }
}
