package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DUF extends C0YY implements InterfaceC16620sF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DUF(Object obj, Object obj2, Object obj3, float f, int i, int i2, int i3) {
        super(2);
        this.A01 = i3;
        this.A04 = obj;
        this.A05 = obj2;
        this.A00 = f;
        this.A06 = obj3;
        this.A02 = i;
        this.A03 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A01) {
            case 0:
                AbstractC28460ChC.A03(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A05, (InterfaceC30797DgY) this.A04, (InterfaceC16620sF) this.A06, this.A00, AbstractC25225BEi.A04(this.A02), this.A03);
                break;
            case 1:
                AbstractC119635bM.A00(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A06, (C119625bL) this.A04, (C119565bE) this.A05, this.A00, AbstractC25225BEi.A04(this.A02), this.A03);
                break;
            default:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                AbstractC27618CGo.A00((Bitmap) this.A04, A0S, (C5AH) this.A05, (InterfaceC16820sZ) this.A06, this.A00, AbstractC25225BEi.A04(this.A02), this.A03);
                break;
        }
        return C0eB.A00;
    }
}
