package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7HO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7HO implements C7H3 {
    public final InterfaceC16820sZ A00;
    public final UserSession A01;
    public final InterfaceC160017Fn A02;
    public final AbstractC160207Gg A03;
    public final InterfaceC16820sZ A04;

    @Override // X.C7H3
    public final boolean Cp3(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        String str2;
        boolean z6;
        C14360o3.A0B(str, 4);
        if (!z) {
            return false;
        }
        UserSession userSession = this.A01;
        AbstractC160207Gg abstractC160207Gg = this.A03;
        if (abstractC160207Gg == null || abstractC160207Gg.A01() != C7FZ.A06 || str.length() <= 0 || !AbstractC001900j.A0a(str, abstractC160207Gg.A05(), false) || !AbstractC31268Doq.A09(userSession) || !AbstractC159377Cx.A00(userSession)) {
            return false;
        }
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        C2EE c2ee = (C2EE) interfaceC16820sZ.invoke();
        if (c2ee != null) {
            z5 = c2ee.CVQ();
        } else {
            z5 = false;
        }
        C2EE c2ee2 = (C2EE) interfaceC16820sZ.invoke();
        if (c2ee2 == null || (str2 = c2ee2.C7I()) == null) {
            str2 = "";
        }
        C2EE c2ee3 = (C2EE) interfaceC16820sZ.invoke();
        Boolean bool = null;
        if (c2ee3 != null) {
            bool = Boolean.valueOf(C4GR.A05(c2ee3.C7g()));
        }
        InterfaceC160017Fn interfaceC160017Fn = this.A02;
        Boolean valueOf = Boolean.valueOf(z5);
        if (bool != null) {
            z6 = bool.booleanValue();
        } else {
            z6 = false;
        }
        interfaceC160017Fn.FCA(valueOf, str2, new MHI(this, 11), z6);
        interfaceC160017Fn.Cnr(C05F.A15, true);
        return true;
    }

    public C7HO(UserSession userSession, InterfaceC160017Fn interfaceC160017Fn, AbstractC160207Gg abstractC160207Gg, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A02 = interfaceC160017Fn;
        this.A01 = userSession;
        this.A00 = interfaceC16820sZ;
        this.A04 = interfaceC16820sZ2;
        this.A03 = abstractC160207Gg;
    }
}
