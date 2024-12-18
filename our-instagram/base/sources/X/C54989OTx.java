package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.OTx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54989OTx {
    public final Context A00;
    public final View A01;
    public final PJ5 A02;
    public final PJ4 A03;

    public static final void A00(InterfaceC174767qC interfaceC174767qC, YP5 yp5, int i, int i2) {
        interfaceC174767qC.setInitialCameraFacing(1);
        EnumC174667q0 enumC174667q0 = EnumC174667q0.HIGH;
        interfaceC174767qC.Ecy(new C212559bO(enumC174667q0, enumC174667q0, null));
        interfaceC174767qC.EbS(yp5.Ak1().getSurfaceTexture(), i, i2);
        interfaceC174767qC.AJS(new XW1(5, yp5, interfaceC174767qC), null, C81S.A00);
    }

    public C54989OTx(View view) {
        this.A01 = view;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A00 = A0L;
        PJ4 pj4 = new PJ4(A0L);
        pj4.A05.setText(AbstractC166997dE.A0p(A0L, 2131965389));
        this.A03 = pj4;
        this.A02 = new PJ5(A0L);
    }
}
