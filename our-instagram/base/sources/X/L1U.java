package X;

import android.content.Context;
import android.view.ViewStub;

/* loaded from: classes8.dex */
public final class L1U {
    public final C57012jc A00;
    public final ViewStub A01;
    public final InterfaceC50487MQp A02;

    public L1U(ViewStub viewStub, InterfaceC50487MQp interfaceC50487MQp) {
        this.A01 = viewStub;
        this.A02 = interfaceC50487MQp;
        Context context = viewStub.getContext();
        KXR kxr = new KXR();
        kxr.A07 = context.getString(2131973898);
        kxr.A04 = context.getString(2131973917);
        kxr.A05 = context.getString(2131968948);
        this.A00 = new C57012jc(viewStub);
        AbstractC47890LDk.A00(viewStub, interfaceC50487MQp, kxr);
    }
}
