package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Callback;

/* renamed from: X.T0h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64141T0h implements InterfaceC65362Tit {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Callback A03;
    public final /* synthetic */ SZN A04;

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        int A00;
        try {
            SZN szn = this.A04;
            C63309ShF c63309ShF = szn.A0L;
            int i = this.A02;
            int[] iArr = szn.A0P;
            c63309ShF.A07(i, iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            float f3 = this.A00;
            float f4 = this.A01;
            synchronized (c63309ShF) {
                View A002 = C63309ShF.A00(c63309ShF, i);
                if (A002 != null) {
                    A00 = C63358SiF.A00((ViewGroup) A002, C63358SiF.A01, f3, f4);
                } else {
                    throw new RuntimeException(AnonymousClass001.A0O("Could not find view with tag ", i));
                }
            }
            c63309ShF.A07(A00, iArr);
            this.A03.invoke(Integer.valueOf(A00), Float.valueOf(WF1.A00(iArr[0] - f)), Float.valueOf(WF1.A00(iArr[1] - f2)), Float.valueOf(AbstractC58321PtD.A04(iArr, 2)), Float.valueOf(AbstractC58321PtD.A04(iArr, 3)));
        } catch (R3C unused) {
            this.A03.invoke(new Object[0]);
        }
    }

    public C64141T0h(Callback callback, SZN szn, float f, float f2, int i) {
        this.A04 = szn;
        this.A02 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = callback;
    }
}
