package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.BitSet;

/* renamed from: X.Bm6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26423Bm6 extends AbstractC51572Yf {
    public final int A00;
    public final C2XI A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C26423Bm6(C2XI c2xi, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c2xi, 2);
        this.A04 = z;
        this.A01 = c2xi;
        this.A00 = i;
        this.A02 = z2;
        this.A03 = z3;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C9CU A0n;
        AbstractC50812Vc abstractC50812Vc;
        C14360o3.A0B(c76223bS, 0);
        C2XE c2xe = c76223bS.A05;
        Context context = c2xe.A0C;
        Drawable drawable = context.getDrawable(R.drawable.instagram_heart_pano_filled_24);
        if (drawable == null) {
            return null;
        }
        Drawable mutate = drawable.mutate();
        C14360o3.A07(mutate);
        AbstractC166997dE.A1F(mutate, c76223bS.BoZ().A01(R.attr.feedLikeActiveColor));
        C75933ay c75933ay = C51722Yv.A02;
        int A03 = AbstractC25232BEp.A03(context, c76223bS, R.attr.igds_color_transparent);
        Integer num = C05F.A00;
        C51722Yv A16 = AbstractC25232BEp.A16(null, num, AbstractC25225BEi.A0i(A03));
        EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
        Integer num2 = C05F.A0Y;
        C51722Yv A00 = C9CV.A00(A16, num2, enumC77933eL, 3);
        String A0F = AbstractC77623dm.A0F(c76223bS, 2131965099);
        Integer num3 = C05F.A0N;
        C51722Yv A002 = C9CV.A00(A00, num3, A0F, 0);
        Integer num4 = C05F.A01;
        C51722Yv A003 = C9CV.A00(A002, num4, "android.widget.Button", 0);
        boolean z = this.A02;
        C51722Yv c51722Yv = null;
        if (z) {
            long A0G = AbstractC25229BEm.A0G();
            c51722Yv = C9CU.A00(null, num3, 1, Double.doubleToRawLongBits(-3.0d));
            A0n = AbstractC25225BEi.A0n(num2, 1, A0G);
        } else {
            A0n = AbstractC25225BEi.A0n(num3, 1, Double.doubleToRawLongBits(-6.0d));
        }
        C51722Yv A004 = A003.A00(AbstractC25225BEi.A0h(c51722Yv, A0n));
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
        if (!this.A04) {
            C2XE c2xe2 = A0P.A00;
            if (z) {
                Context A0E = AbstractC25225BEi.A0E(c2xe2);
                BYC byc = new BYC(A0E, this.A00, A0E.getColor(R.color.facepile_inner_stroke_color), this.A03);
                long A0N = AbstractC25230BEn.A0N();
                abstractC50812Vc = AbstractC25234BEr.A0O(byc, c2xe2, C9CU.A00(C9CU.A00(null, num, 0, A0N), num4, 0, A0N));
            } else {
                C26279Bjm c26279Bjm = new C26279Bjm(new C26651Bpm(), c2xe2);
                c26279Bjm.A0A(20.0f);
                int i = this.A00;
                C26651Bpm c26651Bpm = c26279Bjm.A00;
                c26651Bpm.A00 = i;
                BitSet bitSet = c26279Bjm.A02;
                bitSet.set(0);
                AbstractC77733dx.A00(bitSet, c26279Bjm.A03, 2);
                c26279Bjm.A03();
                C14360o3.A0A(c26651Bpm);
                abstractC50812Vc = c26651Bpm;
            }
            A0P.A00(abstractC50812Vc);
            C2XI c2xi = this.A01;
            C51722Yv A0A = AbstractC25234BEr.A0A(c2xi, null, new C9CV(c2xi, C05F.A1F));
            long A0H = AbstractC25230BEn.A0H();
            AbstractC25234BEr.A0r(mutate, c2xe2, A0P, AbstractC25233BEq.A0V(AbstractC25233BEq.A0V(C9CU.A00(A0A, num, 0, A0H), AbstractC25225BEi.A0n(num4, 0, A0H), num, enumC77683ds, 3), AbstractC25225BEi.A0n(num4, 1, AbstractC25229BEm.A0G()), num2, enumC77933eL, 3));
        }
        return AbstractC76963ci.A01(A0P, c76223bS, A004);
    }
}
