package X;

import android.text.style.ForegroundColorSpan;

/* loaded from: classes5.dex */
public abstract class CL9 {
    public static final void A00(BYS bys, C88 c88, InterfaceC16660sJ interfaceC16660sJ) {
        InterfaceC30923Dia A01 = AbstractC28337CeP.A01(bys.A00);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C28351CfB.A00(A01).EKE(c88, A01.CSM()));
        int length = bys.length();
        interfaceC16660sJ.invoke(bys);
        bys.setSpan(foregroundColorSpan, length, bys.length(), 17);
    }
}
