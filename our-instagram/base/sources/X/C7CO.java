package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7CO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7CO extends C7VI {
    public final InterfaceC09390do A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16610sE A02;

    public final C51702MsX A07() {
        UserSession userSession = super.A00.A00;
        if (C98Q.A00(userSession).A00(((C7U0) this.A01.invoke()).C7r().CCa(), 69) && AbstractC28415CgL.A03(userSession)) {
            return (C51702MsX) ((C44484Jlq) this.A00.getValue()).A02.getValue();
        }
        return null;
    }

    public C7CO(C7VG c7vg, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16610sE interfaceC16610sE) {
        super(c7vg);
        this.A01 = interfaceC16820sZ;
        this.A02 = interfaceC16610sE;
        this.A00 = new C60842q8(new C206829Dn(this, 12), new C9F7(43, c7vg, this), C149636oG.A00, new C0YZ(C44484Jlq.class));
    }
}
