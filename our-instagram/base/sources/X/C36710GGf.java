package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GGf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36710GGf implements InterfaceC25208BDg {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public C36710GGf(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = userSession;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC25208BDg
    public final void onAccept() {
        C35031Fc4 c35031Fc4 = C35031Fc4.A00;
        UserSession userSession = this.A00;
        c35031Fc4.A00(userSession, null, "auto_crossposting");
        AbstractC167007dF.A0J().post(new GM7(this.A01));
        C196208mB.A03.A01(userSession, null, "upsell", true, true);
        C195918ld.A05.A01(userSession, null, "upsell", true, true);
    }

    @Override // X.InterfaceC25208BDg
    public final void onBloksRenderSuccess() {
        C35203Ffv.A01(this.A00, "auto_crossposting");
    }

    @Override // X.InterfaceC25208BDg
    public final void onDecline() {
        C35031Fc4.A00.A00(this.A00, null, "auto_crossposting");
        AbstractC167007dF.A0J().post(new GM9(this.A01));
    }

    @Override // X.InterfaceC25208BDg
    public final void onBloksFailure() {
        AbstractC167007dF.A0J().post(new GM8(this.A01));
    }
}
