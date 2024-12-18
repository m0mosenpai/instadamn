package X;

import android.view.View;

/* renamed from: X.42B, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C42B {
    public static final void A00(C905441p c905441p, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        C14360o3.A0B(c905441p, 0);
        C14360o3.A0B(interfaceC16820sZ, 1);
        C57012jc c57012jc = c905441p.A00;
        if (z) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            A01.setVisibility(0);
            C0fQ.A00(new ViewOnClickListenerC23214AQy(interfaceC16820sZ), A01);
            return;
        }
        c57012jc.A03(8);
    }
}
