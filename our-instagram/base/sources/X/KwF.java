package X;

import android.content.Context;
import android.view.ViewStub;

/* loaded from: classes8.dex */
public final class KwF {
    public final ViewStub A00;

    public KwF(ViewStub viewStub, InterfaceC50487MQp interfaceC50487MQp, String str, String str2) {
        this.A00 = viewStub;
        Context context = viewStub.getContext();
        KXR kxr = new KXR();
        kxr.A07 = str;
        kxr.A04 = str2;
        kxr.A05 = context.getString(2131960800);
        kxr.A01 = 0;
        AbstractC47890LDk.A00(viewStub, interfaceC50487MQp, kxr);
    }
}
