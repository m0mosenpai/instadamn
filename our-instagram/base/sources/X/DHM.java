package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes5.dex */
public final class DHM extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DHM(Object obj, float f, int i) {
        super(1);
        this.A01 = i;
        this.A00 = f;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        switch (this.A01) {
            case 0:
                long A0N = AbstractC166987dD.A0N(obj);
                BTO bto = (BTO) this.A02;
                if (!AbstractC25230BEn.A1X(bto.A05)) {
                    long j = A0N / 1;
                    float f2 = this.A00;
                    C6LO c6lo = bto.A04;
                    if (c6lo.BPC() == Long.MIN_VALUE) {
                        c6lo.EYa(j);
                        AbstractC25227BEk.A1A(bto.A02.A00, true);
                    }
                    long BPC = j - c6lo.BPC();
                    boolean z = true;
                    if (f2 != 0.0f) {
                        BPC = C1H4.A02(BPC / f2);
                    }
                    if (bto.A01 == null) {
                        bto.A03.EYa(BPC);
                    }
                    if (f2 != 0.0f) {
                        z = false;
                    }
                    bto.A06(BPC, z);
                }
                return C0eB.A00;
            case 1:
                C28365CfP c28365CfP = (C28365CfP) obj;
                C14360o3.A0B(c28365CfP, 0);
                AnonymousClass583 anonymousClass583 = c28365CfP.A01;
                if (anonymousClass583 != null) {
                    if (anonymousClass583 == AnonymousClass583.Rtl) {
                        f = 1.0f - this.A00;
                    } else {
                        f = this.A00;
                    }
                    c28365CfP.A00(((CWW) this.A02).A08).A00 = f;
                    return C0eB.A00;
                }
                C14360o3.A0F("layoutDirection");
                throw C00O.createAndThrow();
            case 2:
                C28365CfP c28365CfP2 = (C28365CfP) obj;
                C14360o3.A0B(c28365CfP2, 0);
                c28365CfP2.A00(((CWW) this.A02).A08).A01 = this.A00;
                return C0eB.A00;
            case 3:
                InterfaceC1132159j A0b = AbstractC25228BEl.A0b(obj);
                float A03 = AbstractC25231BEo.A03(((C25246BFf) this.A02).A03);
                float f3 = this.A00;
                if (A03 < f3) {
                    A03 = f3;
                }
                A0b.EgG(A03);
                return C0eB.A00;
            case 4:
                throw AbstractC166987dD.A15("setName");
            case 5:
                Bitmap bitmap = (Bitmap) obj;
                C14360o3.A0B(bitmap, 0);
                Bitmap A0F = AbstractC167007dF.A0F(bitmap.getWidth(), bitmap.getHeight());
                Canvas canvas = new Canvas(A0F);
                float width = bitmap.getWidth();
                float f4 = this.A00;
                int i = ((int) (width / f4)) / 2;
                int height = ((int) (bitmap.getHeight() / f4)) / 2;
                canvas.drawBitmap(bitmap, new Rect((bitmap.getWidth() / 2) - i, (bitmap.getHeight() / 2) - height, (bitmap.getWidth() / 2) + i, (bitmap.getHeight() / 2) + height), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (Paint) null);
                AbstractC25225BEi.A1U(this.A02, A0F);
                return C0eB.A00;
            case 6:
                C9ZD c9zd = (C9ZD) obj;
                C14360o3.A0B(c9zd, 0);
                ((C23102AGo) this.A02).A01.A0l(c9zd.A03, this.A00);
                return C0eB.A00;
            default:
                C9ZD c9zd2 = (C9ZD) obj;
                C14360o3.A0B(c9zd2, 0);
                ((C23102AGo) this.A02).A01.A0m(c9zd2.A03, (this.A00 * c9zd2.A02) / r2.getIntrinsicHeight());
                return C0eB.A00;
        }
    }
}
