package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.BoH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26558BoH extends AbstractC51572Yf {
    public final CharSequence A00;
    public final C51722Yv A01;
    public final InterfaceC31154Dmy A02;
    public final CharSequence A03;
    public final InterfaceC16820sZ A04;
    public final boolean A05;

    public C26558BoH(C51722Yv c51722Yv, InterfaceC31154Dmy interfaceC31154Dmy, CharSequence charSequence, CharSequence charSequence2, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167007dF.A1F(charSequence, 1, charSequence2);
        this.A00 = charSequence;
        this.A02 = interfaceC31154Dmy;
        this.A04 = interfaceC16820sZ;
        this.A03 = charSequence2;
        this.A05 = z;
        this.A01 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        float f;
        GradientDrawable gradientDrawable;
        InterfaceC16820sZ interfaceC16820sZ;
        C14360o3.A0B(c76223bS, 0);
        CWN cwn = (CWN) AbstractC28337CeP.A02(c76223bS, this.A02);
        AbstractC27449C9r abstractC27449C9r = cwn.A06;
        float f2 = 1.0f;
        if (C14360o3.A0K(abstractC27449C9r, C37.A00)) {
            f = 0.0f;
        } else if (C14360o3.A0K(abstractC27449C9r, C38.A00)) {
            f = 1.0f;
        } else {
            throw B4Z.A00();
        }
        Integer num = cwn.A09;
        if (num != null) {
            int intValue = num.intValue();
            int i = cwn.A01;
            int i2 = cwn.A00;
            int A0K = AbstractC167017dG.A0K(cwn.A0A);
            gradientDrawable = AbstractC25228BEl.A0O(0);
            gradientDrawable.setColor(intValue);
            gradientDrawable.setStroke(AbstractC25232BEp.A0l(c76223bS, i2), A0K);
            gradientDrawable.setCornerRadius(AbstractC25232BEp.A0l(c76223bS, i));
        } else {
            gradientDrawable = null;
        }
        boolean z = this.A05;
        if (!z) {
            f2 = 0.7f;
        }
        C75933ay c75933ay = C51722Yv.A02;
        Integer num2 = C05F.A01;
        C51722Yv A0a = AbstractC25233BEq.A0a(null, num2, f);
        long A0A = AbstractC25225BEi.A0A(cwn.A02);
        C51722Yv A00 = C9CU.A00(C9CU.A00(A0a, num2, 0, A0A), C05F.A0C, 0, A0A);
        long A0A2 = AbstractC25225BEi.A0A(cwn.A04);
        long A0A3 = AbstractC25225BEi.A0A(cwn.A03);
        C51722Yv A002 = C9CU.A00(A00, C05F.A0u, 0, A0A2);
        Integer num3 = C05F.A1F;
        C51722Yv A003 = C9CU.A00(C9CV.A00(C9CU.A00(A002, num3, 0, A0A3), C05F.A00, gradientDrawable, 4), num3, 2, AbstractC25229BEm.A0D());
        CharSequence charSequence = this.A03;
        if (charSequence != null) {
            A003 = C9CV.A00(A003, C05F.A0N, charSequence, 0);
        }
        C51722Yv A004 = AbstractC171007jr.A00(AbstractC25233BEq.A0c(C9CV.A00(A003, num2, "android.widget.Button", 0), C05F.A0F, z), f2);
        InterfaceC31155Dmz interfaceC31155Dmz = cwn.A07;
        if (z && (interfaceC16820sZ = this.A04) != null) {
            C26471Bms A03 = A03(A004, cwn);
            C51722Yv c51722Yv = this.A01;
            if (c51722Yv == null) {
                c51722Yv = c75933ay;
            }
            return new C26555BoE(A03, c51722Yv, interfaceC31155Dmz, interfaceC16820sZ, null);
        }
        return A03(A004.A00(this.A01), cwn);
    }

    private final C26471Bms A03(C51722Yv c51722Yv, CWN cwn) {
        C51722Yv A00 = C51722Yv.A02.A00(c51722Yv);
        long A0K = AbstractC25230BEn.A0K();
        C3F c3f = new C3F(A0K, A0K);
        CharSequence charSequence = this.A00;
        return new C26471Bms(A00, C93E.CENTER, C93G.CENTER, cwn.A08, c3f, charSequence, 1);
    }
}
