package X;

import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.9ad, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212089ad extends AbstractC51572Yf {
    public final String A00;
    public final String A01;
    public final InterfaceC16610sE A02;
    public final boolean A03;
    public final C51722Yv A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        Float valueOf = Float.valueOf(1.0f);
        C2XI A00 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A002 = AbstractC80383iT.A00(c76223bS, valueOf);
        C2XI A003 = AbstractC80383iT.A00(c76223bS, valueOf);
        String str = this.A00;
        Object A004 = AbstractC77183d4.A00(c76223bS, new ME5(9, A003, A002, A00), new Object[]{str});
        C131325wL c131325wL = new C131325wL();
        AbstractC77313dH.A00(c76223bS, new C29899DGn(49, c131325wL, A004), new Object[]{str});
        C75933ay c75933ay = C51722Yv.A02;
        long A07 = AbstractC77623dm.A07(c76223bS);
        long A0C = AbstractC77623dm.A0C(c76223bS);
        C51722Yv A005 = C9CU.A00(null, C05F.A0u, 0, A07);
        Integer num = C05F.A1F;
        C51722Yv A006 = C9CV.A00(new C51722Yv(C9CU.A00(A005, num, 0, A0C), new C9CT(C05F.A0C, 0.0f, 1)), num, new BAO(14, c131325wL, this), 4).A00(this.A04);
        C2Z0 A0P = AbstractC167007dF.A0P(c76223bS.A05);
        long A072 = AbstractC77623dm.A07(A0P);
        Integer num2 = C05F.A00;
        C51722Yv A007 = C9CV.A00(C9CV.A00(C9CV.A00(new C51722Yv(new C51722Yv(new C51722Yv(C9CU.A00(C9CU.A00(C9CU.A00(null, num2, 0, A072), C05F.A01, 0, AbstractC77623dm.A07(A0P)), C05F.A0E, 0, AbstractC77623dm.A08(A0P)), new C9CV(A00, num)), new C9CV(A002, C05F.A1I)), new C9CV(A003, num2)), C05F.A06, Boolean.valueOf(this.A03), 4), num2, EnumC77683ds.CENTER, 3), C05F.A0N, AbstractC77623dm.A0F(A0P, 2131965099), 0);
        int A02 = AbstractC77623dm.A02(A0P, R.attr.glyphColorSecondary);
        int A022 = AbstractC77623dm.A02(A0P, R.attr.feedLikeActiveColor);
        A0P.A00(new C78133ef(AbstractC77623dm.A0E(A0P, R.drawable.ufi_heart_icon), ImageView.ScaleType.FIT_CENTER, null, A007, A02, A022));
        return AbstractC76963ci.A0I(A0P, c76223bS, A006);
    }

    public C212089ad(C51722Yv c51722Yv, String str, String str2, InterfaceC16610sE interfaceC16610sE, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A02 = interfaceC16610sE;
        this.A04 = c51722Yv;
    }
}
