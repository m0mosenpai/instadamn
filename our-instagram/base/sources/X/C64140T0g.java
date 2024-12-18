package X;

import com.facebook.react.bridge.Callback;

/* renamed from: X.T0g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64140T0g implements InterfaceC65362Tit {
    public final int A00;
    public final Callback A01;
    public final /* synthetic */ SZN A02;

    @Override // X.InterfaceC65362Tit
    public final void ATI() {
        try {
            SZN szn = this.A02;
            C63309ShF c63309ShF = szn.A0L;
            int i = this.A00;
            int[] iArr = szn.A0P;
            c63309ShF.A07(i, iArr);
            float A04 = AbstractC58321PtD.A04(iArr, 0);
            float A042 = AbstractC58321PtD.A04(iArr, 1);
            this.A01.invoke(0, 0, Float.valueOf(AbstractC58321PtD.A04(iArr, 2)), Float.valueOf(AbstractC58321PtD.A04(iArr, 3)), Float.valueOf(A04), Float.valueOf(A042));
        } catch (R5M unused) {
            this.A01.invoke(new Object[0]);
        }
    }

    public C64140T0g(Callback callback, SZN szn, int i) {
        this.A02 = szn;
        this.A00 = i;
        this.A01 = callback;
    }
}
