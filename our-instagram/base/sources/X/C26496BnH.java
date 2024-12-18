package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.BnH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26496BnH extends AbstractC51572Yf {
    public final InterfaceC16820sZ A00;
    public final InterfaceC16820sZ A01;
    public final long A02;
    public final long A03;
    public final Drawable A04;
    public final C51722Yv A05;
    public final String A06;
    public final boolean A07 = true;

    public C26496BnH(Drawable drawable, C51722Yv c51722Yv, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, long j, long j2) {
        this.A06 = str;
        this.A03 = j;
        this.A04 = drawable;
        this.A02 = j2;
        this.A00 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        this.A05 = c51722Yv;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C75933ay c75933ay = C51722Yv.A02;
        Drawable A0E = AbstractC77623dm.A0E(c76223bS, R.drawable.spin_attribution_background);
        Integer num = C05F.A00;
        C51722Yv A0h = AbstractC25225BEi.A0h(null, AbstractC25225BEi.A0o(num, A0E, 4));
        long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.account_group_management_clickable_width);
        Integer num2 = C05F.A01;
        C51722Yv A00 = C9CU.A00(A0h, num2, 0, A0D);
        Integer num3 = C05F.A0C;
        C51722Yv A002 = C9CU.A00(AbstractC25230BEn.A0d(A00, num3, 0.0f, 1), C05F.A04, 0, AbstractC25229BEm.A0J()).A00(this.A05);
        DRP A003 = DRP.A00(this, 34);
        Integer num4 = C05F.A1F;
        C9CV A0o = AbstractC25225BEi.A0o(num4, A003, 4);
        if (A002 == c75933ay) {
            A002 = null;
        }
        C51722Yv A0h2 = AbstractC25225BEi.A0h(A002, A0o);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        long j = this.A02;
        C51722Yv A0T = AbstractC25233BEq.A0T(C9CU.A00(null, num, 0, j), AbstractC25225BEi.A0n(num2, 0, j), num3, 0.0f, 1);
        long A0K = AbstractC25230BEn.A0K();
        C51722Yv A004 = C9CV.A00(C9CU.A00(A0T, C05F.A09, 0, A0K), num4, DRP.A00(this, 35), 4);
        Drawable drawable = this.A04;
        C2XE c2xe = A12.A00;
        AbstractC25234BEr.A0r(drawable, c2xe, A12, A004);
        boolean z = this.A07;
        if (z) {
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            C26280Bjn A03 = C26658Bpt.A03(A0P.A00);
            C26658Bpt c26658Bpt = A03.A01;
            C2XH c2xh = ((AbstractC77733dx) A03).A02;
            c26658Bpt.A00 = c2xh.A01(R.attr.igds_color_photo_border);
            A03.A02.set(0);
            int A005 = c2xh.A00(1.0f);
            AbstractC50792Va abstractC50792Va = ((AbstractC77733dx) A03).A00;
            abstractC50792Va.A0a().A0L(A005);
            abstractC50792Va.A0a().A08(100.0f);
            abstractC50792Va.A0a().A0T(EnumC77763e0.START, c2xh.A00(2.0f));
            A0P.A00(A03.A0A());
            A12.A00(AbstractC76963ci.A00(A0P));
        }
        C51722Yv A0T2 = AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0o(num2, "android.widget.Button", 0), num3, 0.0f, 1);
        if (!z) {
            A0K = AbstractC25229BEm.A0D();
        }
        C51722Yv A14 = AbstractC25232BEp.A14(A0T2, 0, A0K);
        long j2 = this.A03;
        String str = this.A06;
        Typeface A0Q = AbstractC25226BEj.A0Q(c2xe.A0C, num3);
        int A01 = A12.BoZ().A01(R.attr.igds_color_text_on_color);
        long A0D2 = AbstractC25229BEm.A0D();
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a, A01, j2);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(A0Q, A12, A0a, A0D2);
        A0a.A0X(num);
        AbstractC25234BEr.A1C(A0a, num2, 1.0f);
        AbstractC25233BEq.A1A(A12, A14, A0a);
        return AbstractC76963ci.A0H(A12, c76223bS, A0h2);
    }
}
