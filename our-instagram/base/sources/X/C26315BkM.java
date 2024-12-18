package X;

import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;

/* renamed from: X.BkM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26315BkM extends AbstractC51572Yf {
    public final InterfaceC75543aL A00;
    public final InterfaceC16820sZ A01;

    public C26315BkM(InterfaceC75543aL interfaceC75543aL, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC75543aL, 2);
        this.A01 = interfaceC16820sZ;
        this.A00 = interfaceC75543aL;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C206189Bb c206189Bb = (C206189Bb) this.A01.invoke();
        if (c206189Bb == null) {
            return null;
        }
        C75933ay c75933ay = C51722Yv.A02;
        long A07 = AbstractC77623dm.A07(c76223bS);
        long A0E = AbstractC25229BEm.A0E();
        C51722Yv A0F = AbstractC25234BEr.A0F(null, AbstractC25227BEk.A0b(A07), 0, AbstractC77623dm.A0B(c76223bS));
        Integer num = C05F.A1F;
        C51722Yv A00 = C9CU.A00(A0F, num, 0, A0E);
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
        C2XE ArD = A12.ArD();
        C2Z0 A0P = AbstractC167007dF.A0P(ArD);
        CharSequence charSequence = (CharSequence) c206189Bb.A03;
        C50158MDl c50158MDl = new C50158MDl(c206189Bb, 7);
        C2XE ArD2 = A0P.ArD();
        int A05 = AbstractC25228BEl.A05(ArD2.A0C, A0P);
        Integer num2 = C05F.A01;
        C51722Yv A0d = AbstractC25230BEn.A0d(null, num2, 0.0f, 1);
        Integer num3 = C05F.A0C;
        C51722Yv A002 = C9CV.A00(C9CV.A00(C9CU.A00(AbstractC25230BEn.A0d(A0d, num3, 1.0f, 1), C05F.A05, 0, AbstractC77623dm.A0B(A0P)), num2, true, 4), num, new C50355MLh(c50158MDl, 3), 4);
        long A0r = AbstractC25232BEp.A0r(14.0f);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = AbstractC25229BEm.A0D();
        Integer num4 = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(ArD2, null, charSequence, 0);
        AbstractC25233BEq.A1B(A0P, A0a, A05, A0r);
        A0a.A0S(0);
        AbstractC25234BEr.A0o(typeface, A0P, A0a, A0D);
        A0a.A0X(num4);
        AbstractC25233BEq.A1E(A0a, num4, 1.0f, false);
        A0a.A0M(2);
        AbstractC25229BEm.A1E(A0a);
        A0a.A0D();
        AbstractC25233BEq.A1A(A0P, A002, A0a);
        C51722Yv A0T = AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0m(num2, 1.0f, 1), num3, 0.0f, 1);
        C2Z0 A13 = AbstractC25232BEp.A13(A0P);
        boolean z = c206189Bb.A01;
        C50158MDl c50158MDl2 = new C50158MDl(c206189Bb, 8);
        int A02 = AbstractC77623dm.A02(A13, R.attr.glyphColorPrimary);
        A13.A00(new C85463rb(ImageView.ScaleType.FIT_CENTER, AbstractC25230BEn.A0e(C9CV.A00(AbstractC25233BEq.A0c(AbstractC25233BEq.A0W(C9CV.A00(AbstractC171007jr.A00(C9CU.A00(AbstractC25233BEq.A0Y(AbstractC25233BEq.A0Y(null, A13, num4, R.dimen.add_account_icon_circle_radius, 0), A13, num2, R.dimen.add_account_icon_circle_radius, 0), C05F.A06, 0, AbstractC77623dm.A0B(A13)), AbstractC25230BEn.A00(z ? 1 : 0)), C05F.A0D, Integer.valueOf(R.id.post_dismiss_button), 4), A13, 2131960994), C05F.A0F, z), num, new C50355MLh(c50158MDl2, 2), 4), num4, new C50268MHx(43, A13, this), "getDismissButton"), null, R.drawable.instagram_x_pano_filled_24, A02));
        A0P.A00(AbstractC76963ci.A0B(A13, A0P, A0T));
        A12.A00(new C2WH(null, enumC77683ds, null, null, null, A0P.A01, false));
        C51722Yv A003 = C9CU.A00(null, num2, 0, 9221401712017801217L);
        long A0B = AbstractC77623dm.A0B(A12);
        return AbstractC25227BEk.A0V(AbstractC76963ci.A0M(A12, AbstractC25232BEp.A16(AbstractC25233BEq.A0S(A003, AbstractC25226BEj.A0m(0, A0B), 0, AbstractC25230BEn.A0L()), num4, AbstractC25225BEi.A0i(AbstractC25228BEl.A06(ArD.A0C, A12, R.attr.igds_color_elevated_separator)))), A12, c76223bS, A00);
    }
}
