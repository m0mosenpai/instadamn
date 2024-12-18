package X;

import android.graphics.drawable.GradientDrawable;
import com.instagram.genai.imageutils.MaskUtilsKt;

/* renamed from: X.DHy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29936DHy extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29936DHy(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A05 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        GradientDrawable gradientDrawable;
        int i2;
        if (this.A00 != 0) {
            C26589Bom c26589Bom = (C26589Bom) this.A05;
            if (!C18U.A06(C06090Tz.A06, c26589Bom.A03, 36315112425393172L)) {
                if (c26589Bom.A06) {
                    gradientDrawable = (GradientDrawable) this.A03;
                    i2 = this.A01;
                } else {
                    AbstractC25233BEq.A1C((C77123cy) this.A04);
                    gradientDrawable = (GradientDrawable) this.A03;
                    i2 = this.A02;
                }
                gradientDrawable.setColor(i2);
            }
        } else {
            int A0H = AbstractC166987dD.A0H(obj);
            for (int i3 = 0; i3 < this.A01; i3++) {
                int i4 = (this.A02 * i3) + A0H;
                boolean A0P = AbstractC009903n.A0P((int[]) this.A03, ((int[]) this.A05)[i4]);
                int[] iArr = (int[]) this.A04;
                if (A0P) {
                    i = MaskUtilsKt.A01;
                } else {
                    i = MaskUtilsKt.A00;
                }
                iArr[i4] = i;
            }
        }
        return C0eB.A00;
    }
}
