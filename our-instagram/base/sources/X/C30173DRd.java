package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;

/* renamed from: X.DRd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30173DRd extends C0YY implements InterfaceC16660sJ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final long A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30173DRd(float f, float f2, float f3, int i, long j) {
        super(1);
        this.A03 = i;
        if (i != 0) {
            this.A02 = f;
            this.A00 = f2;
            this.A04 = j;
            this.A01 = f3;
        } else {
            this.A01 = f;
            this.A02 = f2;
            this.A04 = j;
            this.A00 = f3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A03) {
            case 0:
                InterfaceC1129057z interfaceC1129057z = (InterfaceC1129057z) obj;
                C14360o3.A0B(interfaceC1129057z, 0);
                float f = this.A01 / 2.0f;
                float f2 = this.A02 + f;
                interfaceC1129057z.AQf();
                long j = this.A04;
                float EqT = interfaceC1129057z.EqT(f2);
                float f3 = this.A00;
                long A00 = AbstractC119395aw.A00(f3, f3);
                C119815bf c119815bf = C119815bf.A00;
                interfaceC1129057z.AQe(null, c119815bf, EqT, 1.0f, 3, j, A00);
                long j2 = C1132359l.A01;
                interfaceC1129057z.AQe(null, c119815bf, interfaceC1129057z.EqT(f), 1.0f, 3, 4284409671L << 32, A00);
                return C0eB.A00;
            case 1:
                C137576Ld c137576Ld = (C137576Ld) obj;
                C14360o3.A0B(c137576Ld, 0);
                float A002 = (C5YC.A00(c137576Ld.A00.Bxc()) * 0.8333333f) + (this.A02 * c137576Ld.Awk());
                return c137576Ld.A00(new C30173DRd(this.A00, this.A01, A002, 0, this.A04));
            default:
                InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
                float f4 = this.A00;
                long j3 = this.A04;
                float f5 = this.A02;
                float f6 = this.A01;
                AnonymousClass585 A0C = AbstractC25233BEq.A0C(A0c);
                C5AN c5an = new C5AN();
                Paint paint = c5an.A01;
                if (!C119145aW.A01(f4, 0.0f)) {
                    paint.setMaskFilter(new BlurMaskFilter(A0c.EqT(f4), BlurMaskFilter.Blur.NORMAL));
                }
                paint.setColor(C5AC.A00(j3));
                float EqT2 = A0c.EqT(f5);
                long Bxc = A0c.Bxc();
                A0C.AR2(c5an, (-EqT2) / 3.0f, EqT2, C5YC.A02(Bxc) + EqT2, C5YC.A00(Bxc) + EqT2, A0c.EqT(f6), A0c.EqT(f6));
                return C0eB.A00;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30173DRd(float f, long j, float f2, float f3, int i) {
        super(1);
        this.A03 = 2;
        this.A00 = f;
        this.A04 = j;
        this.A02 = f2;
        this.A01 = f3;
    }
}
