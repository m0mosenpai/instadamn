package X;

import android.app.Activity;

/* renamed from: X.FbV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34998FbV {
    public static final C34998FbV A02 = new Object();
    public InterfaceC37102GWm A00;
    public InterfaceC37177GZo A01;

    public final void A00(Activity activity, InterfaceC37177GZo interfaceC37177GZo, Boolean bool) {
        InterfaceC37102GWm interfaceC37102GWm;
        InterfaceC37102GWm interfaceC37102GWm2;
        C11T.A00();
        activity.getClass();
        C11T.A00();
        if (this.A01 != null && (interfaceC37102GWm = this.A00) != null && ((C31736Dwp) interfaceC37102GWm).A03.get()) {
            C11T.A00();
            C11T.A00();
            if (this.A01 != null && (interfaceC37102GWm2 = this.A00) != null && ((C31736Dwp) interfaceC37102GWm2).A03.get()) {
                if (this.A01 != null) {
                    this.A01 = null;
                }
                InterfaceC37102GWm interfaceC37102GWm3 = this.A00;
                if (interfaceC37102GWm3 != null && ((C31736Dwp) interfaceC37102GWm3).A03.get()) {
                    C31736Dwp.A00((C31736Dwp) this.A00);
                    this.A00 = null;
                }
            }
        }
        this.A01 = interfaceC37177GZo;
        AbstractC27461Uz abstractC27461Uz = AbstractC27461Uz.getInstance();
        if (abstractC27461Uz != null && AbstractC14490oL.A0C(activity)) {
            InterfaceC37102GWm listenForSmsResponse = abstractC27461Uz.listenForSmsResponse(activity, true);
            this.A00 = listenForSmsResponse;
            ((C31736Dwp) listenForSmsResponse).A00 = new G9Z(activity, interfaceC37177GZo, this, bool);
        }
    }
}
