package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.facebook.R;

/* renamed from: X.BlK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26375BlK extends AbstractC51572Yf {
    public final long A00;
    public final C23031Ai A01;
    public final boolean A02;

    public C26375BlK(C23031Ai c23031Ai, long j, boolean z) {
        C14360o3.A0B(c23031Ai, 3);
        this.A00 = j;
        this.A02 = z;
        this.A01 = c23031Ai;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51682Yq c51682Yq;
        C14360o3.A0B(c76223bS, 0);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        AbstractC166987dD.A1N(AbstractC77363dM.A00(c76223bS), paint, AbstractC53242c7.A0H(AbstractC77363dM.A00(c76223bS), R.attr.igds_color_separator_or_stroke_on_media));
        AbstractC166987dD.A1R(paint);
        C77123cy A00 = AbstractC77063cs.A00(c76223bS, DFV.A00);
        C51762Yz A002 = AbstractC77073ct.A00(c76223bS, DFU.A00);
        C0eB c0eB = C0eB.A00;
        AbstractC77313dH.A00(c76223bS, DH2.A01(A002, A00, this, 41), new Object[]{c0eB});
        C77123cy A003 = AbstractC77063cs.A00(c76223bS, DFS.A00);
        C51762Yz A004 = AbstractC77073ct.A00(c76223bS, DFT.A00);
        C29893DGh.A00(c76223bS, A003, A004, new Object[]{c0eB}, 18);
        C75933ay c75933ay = C51722Yv.A02;
        Integer num = C05F.A00;
        C51722Yv A005 = C9CV.A00(C9CV.A00(AbstractC25225BEi.A0h(null, AbstractC25228BEl.A0m(num, 0)), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3), num, EnumC77683ds.FLEX_END, 3);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        if (this.A02) {
            String A0F = AbstractC77623dm.A0F(A12, 2131955533);
            long A08 = AbstractC77623dm.A08(A12);
            C2XE c2xe = A12.A00;
            int A0A = AbstractC25230BEn.A0A(c2xe, A12);
            long A0D = AbstractC77623dm.A0D(A12, R.dimen.font_large);
            C51722Yv A0e = AbstractC25230BEn.A0e(C9CU.A00(AbstractC25233BEq.A0P(A004, c75933ay), C05F.A0A, 0, AbstractC77623dm.A0D(A12, R.dimen.ad4ad_button_left_right_margin)), num, DRT.A00(this, 29), null);
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F, 0);
            AbstractC25233BEq.A1B(A12, A0a, A0A, A0D);
            A0a.A0S(0);
            A0a.A0T(typeface);
            A0a.A0F();
            AbstractC25234BEr.A14(A12, A0a, AbstractC25228BEl.A08(A12, A08), A0D2);
            AbstractC25234BEr.A1G(A0a, num, false);
            A0a.A0M(1);
            AbstractC25233BEq.A1D(A0e, A0a, false);
            c51682Yq = A0a.A0A();
        } else {
            c51682Yq = null;
        }
        A12.A00(c51682Yq);
        AbstractC25234BEr.A0r(shapeDrawable, A12.A00, A12, AbstractC171007jr.A00(AbstractC25234BEr.A0I(AbstractC25230BEn.A0d(null, num, AbstractC166987dD.A09(A002.A03), 0), AbstractC25225BEi.A0n(C05F.A01, 0, AbstractC77623dm.A08(A12)), num, 3), 0.4f));
        return AbstractC76963ci.A04(A12, c76223bS, A005);
    }
}
