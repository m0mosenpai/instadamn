package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8SW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SW {
    public final InterfaceC09390do A00;
    public final UserSession A01;
    public final InterfaceC1810081c A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C174607pu.A00);

    public final BEF A00() {
        InterfaceC09390do interfaceC09390do;
        if (C2B0.A00(C05F.A04) && ((C1809981b) this.A02).A00.A00.ordinal() == 0) {
            interfaceC09390do = this.A03;
        } else {
            interfaceC09390do = this.A00;
        }
        return (BEF) interfaceC09390do.getValue();
    }

    public C8SW(UserSession userSession, InterfaceC1810081c interfaceC1810081c, InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC1810081c;
        this.A01 = userSession;
        this.A00 = AbstractC09440dt.A01(new C9ET(interfaceC16820sZ, 17));
    }
}
