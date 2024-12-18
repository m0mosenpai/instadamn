package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.Bm5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26422Bm5 extends AbstractC51572Yf {
    public final C25816BbX A00;
    public final String A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final int A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Float A0l = AbstractC25227BEk.A0l();
        C2XI A00 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, A0l);
        C2XI A0j = AbstractC25228BEl.A0j(c76223bS, 1.0f);
        Integer valueOf = Integer.valueOf(this.A04);
        Object A003 = AbstractC77183d4.A00(c76223bS, AbstractC25225BEi.A1E(AbstractC77183d4.A00(c76223bS, new ME7(31, A0j, this, A00, A002), new Object[]{valueOf}), 24), new Object[]{valueOf});
        AbstractC77313dH.A00(c76223bS, AbstractC25225BEi.A1E(A003, 23), new Object[]{A003, valueOf});
        C2XE c2xe = c76223bS.A05;
        Drawable drawable = c2xe.A0C.getDrawable(R.drawable.feed_like_big);
        if (drawable == null) {
            return null;
        }
        AbstractC166997dE.A1F(drawable, c76223bS.BoZ().A01(R.attr.feedLikeActiveColor));
        C75933ay c75933ay = C51722Yv.A02;
        C51722Yv A0A = AbstractC25234BEr.A0A(A002, null, new C9CV(A00, C05F.A1F));
        Integer num = C05F.A00;
        return AbstractC25234BEr.A0O(drawable, c2xe, C9CV.A00(C9CV.A00(AbstractC25234BEr.A0M(AbstractC25231BEo.A0X(A0j, A0A, num), C05F.A0N, 0, Double.doubleToRawLongBits(92.0d)), num, EnumC77683ds.CENTER, 3), C05F.A0Y, EnumC77933eL.ABSOLUTE, 3));
    }

    public C26422Bm5(C25816BbX c25816BbX, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        this.A00 = c25816BbX;
        this.A01 = str;
        this.A04 = i;
        this.A03 = interfaceC16660sJ;
        this.A02 = interfaceC16660sJ2;
    }
}
