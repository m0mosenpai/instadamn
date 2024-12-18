package X;

import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes5.dex */
public final class BRO extends AbstractC51572Yf {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final boolean A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        if (this.A04) {
            C75933ay c75933ay = C51722Yv.A02;
            C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0n(C05F.A0Y, EnumC77933eL.ABSOLUTE));
            long j = this.A03;
            C51722Yv A00 = C9CU.A00(C9CU.A00(A0h, C05F.A0C, 1, j), C05F.A0N, 1, j);
            long doubleToRawLongBits = Double.doubleToRawLongBits(15.0d);
            C51722Yv A0G = AbstractC25234BEr.A0G(A00, AbstractC25227BEk.A0a(0, doubleToRawLongBits), 0, doubleToRawLongBits);
            C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
            C51722Yv A002 = C9CU.A00(C9CU.A00(null, C05F.A00, 0, Double.doubleToRawLongBits(24.5d)), C05F.A01, 0, Double.doubleToRawLongBits(22.0d));
            AbstractC25234BEr.A0q(AbstractC77623dm.A0E(A12, R.drawable.ff_heart_with_border), ImageView.ScaleType.FIT_XY, A12.A00, A12, A002);
            return AbstractC76963ci.A0I(A12, c76223bS, A0G);
        }
        float f = this.A00;
        float f2 = 20.0f;
        if (f >= 40.0f) {
            f2 = 28.0f;
        }
        float f3 = 4.0f;
        if (f >= 40.0f) {
            f3 = 5.0f;
        }
        float f4 = (f - f2) + f3;
        C75933ay c75933ay2 = C51722Yv.A02;
        C51722Yv A0h2 = AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0n(C05F.A0Y, EnumC77933eL.ABSOLUTE));
        long j2 = this.A03;
        C51722Yv A003 = C9CU.A00(C9CU.A00(A0h2, C05F.A0C, 1, j2), C05F.A0N, 1, j2);
        long A09 = AbstractC25225BEi.A09(f4);
        C51722Yv A0G2 = AbstractC25234BEr.A0G(A003, AbstractC25227BEk.A0a(0, A09), 0, A09);
        C2Z0 A122 = AbstractC25232BEp.A12(c76223bS);
        int i = this.A02;
        return AbstractC25227BEk.A0W(new C85463rb(ImageView.ScaleType.FIT_XY, AbstractC25234BEr.A0L(null, C05F.A00, 0, AbstractC25225BEi.A09(f2)), null, i, AbstractC77623dm.A03(A122, this.A01)), A122, c76223bS, A0G2);
    }

    public BRO(float f, int i, int i2, long j, boolean z) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = f;
        this.A04 = z;
        this.A03 = j;
    }
}
