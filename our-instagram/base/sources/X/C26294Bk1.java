package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.Bk1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26294Bk1 extends AbstractC51572Yf {
    public final C169217gu A00;

    public C26294Bk1(C169217gu c169217gu) {
        C14360o3.A0B(c169217gu, 1);
        this.A00 = c169217gu;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        boolean A1Z = AbstractC25225BEi.A1Z(c76223bS);
        long A0F = AbstractC25229BEm.A0F();
        long A0L = AbstractC25230BEn.A0L();
        C51722Yv A00 = C9CU.A00(C9CU.A00(C9CU.A00(null, C05F.A05, A1Z ? 1 : 0, A0L), C05F.A0u, A1Z ? 1 : 0, A0F), C05F.A1F, A1Z ? 1 : 0, A0L);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        Integer num = C05F.A00;
        C51722Yv A0b = AbstractC25233BEq.A0b(null, num, A1Z ? 1 : 0);
        C2Z0 A0K = AbstractC25233BEq.A0K(A12);
        int i = 2131956450;
        if (this.A00.A00.ordinal() != A1Z) {
            i = 2131956451;
        }
        String A0F2 = AbstractC77623dm.A0F(A0K, i);
        long A09 = AbstractC77623dm.A09(A0K);
        C2XE c2xe = A0K.A00;
        Context context = c2xe.A0C;
        int A07 = AbstractC25229BEm.A07(context, A0K);
        Typeface A0R = AbstractC167017dG.A0R(AbstractC77363dM.A00(A0K));
        Integer num2 = C05F.A0N;
        long A0D = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, A0F2, A1Z ? 1 : 0);
        AbstractC25233BEq.A1B(A0K, A0a, A07, A09);
        A0a.A0S(A1Z ? 1 : 0);
        AbstractC25234BEr.A0o(A0R, A0K, A0a, A0D);
        A0a.A0X(num2);
        AbstractC25234BEr.A1H(A0a, num, A1Z);
        A0a.A0E();
        AbstractC25234BEr.A15(A0K, A0a, A1Z);
        long doubleToRawLongBits = Double.doubleToRawLongBits(1.0d);
        Integer num3 = C05F.A01;
        C51722Yv A0H = AbstractC25234BEr.A0H(AbstractC25230BEn.A0d(C9CU.A00(null, num3, A1Z ? 1 : 0, doubleToRawLongBits), num3, 1.0f, 1), AbstractC25227BEk.A0a(A1Z ? 1 : 0, AbstractC25229BEm.A0J()), num);
        int A06 = AbstractC25228BEl.A06(context, A0K, R.attr.igds_color_separator);
        C26280Bjn A03 = C26658Bpt.A03(c2xe);
        A03.A0B(A06);
        AbstractC77743dy.A00(A03, A0H);
        AbstractC25231BEo.A1A(A03.A0A(), A0K, A12, A0b);
        return AbstractC76963ci.A03(A12, c76223bS, A00);
    }
}
