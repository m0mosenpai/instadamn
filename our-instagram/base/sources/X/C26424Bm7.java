package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.user.model.User;

/* renamed from: X.Bm7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26424Bm7 extends AbstractC51572Yf {
    public final Jn5 A00;
    public final C7IM A01;
    public final InterfaceC166367c5 A02;
    public final L5U A03;
    public final InterfaceC60442pS A04;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C51722Yv A0d;
        C2Z0 A0J;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC166367c5 interfaceC166367c5 = this.A02;
        if (interfaceC166367c5 instanceof C166357c4) {
            return null;
        }
        if (interfaceC166367c5 instanceof C167647eK) {
            String str = this.A03.A05;
            if (str == null) {
                return null;
            }
            C75933ay c75933ay = C51722Yv.A02;
            Integer num = C05F.A00;
            A0d = AbstractC25230BEn.A0d(null, num, 100.0f, 0);
            A0J = AbstractC25233BEq.A0J(c76223bS);
            A0J.A00(AbstractC76963ci.A0M(A0J, AbstractC25232BEp.A16(AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0n(C05F.A01, 0, 9221401712017801217L), num, 100.0f, 0), num, AbstractC25225BEi.A0i(AbstractC77623dm.A02(A0J, R.attr.dividerColor)))));
            int A02 = A0J.BoZ().A02(R.color.igds_secondary_text);
            long A09 = AbstractC77623dm.A09(A0J);
            Typeface typeface = Typeface.SANS_SERIF;
            C51722Yv A0T = AbstractC25233BEq.A0T(null, AbstractC25225BEi.A0o(C05F.A0N, str, 0), num, 100.0f, 0);
            long A04 = AbstractC77623dm.A04(A0J);
            C51722Yv A0R = AbstractC25233BEq.A0R(A0T, AbstractC25227BEk.A0Y(0, A04), 0, AbstractC77623dm.A07(A0J));
            long A0D = AbstractC25229BEm.A0D();
            C77723dw A0a = AbstractC25231BEo.A0a(A0J.A00, null, str, 0);
            AbstractC25233BEq.A1B(A0J, A0a, A02, A09);
            A0a.A0S(0);
            AbstractC25234BEr.A0o(typeface, A0J, A0a, A0D);
            A0a.A0B();
            AbstractC25234BEr.A1H(A0a, num, false);
            A0a.A0E();
            AbstractC25233BEq.A1D(A0R, A0a, false);
            AbstractC25227BEk.A1J(A0J, A0a);
        } else if (interfaceC166367c5 instanceof C167637eJ) {
            C167637eJ c167637eJ = (C167637eJ) interfaceC166367c5;
            C167607eG c167607eG = c167637eJ.A00;
            C75933ay c75933ay2 = C51722Yv.A02;
            Integer num2 = C05F.A01;
            C51722Yv A00 = C9CU.A00(null, num2, 0, 9221401712017801217L);
            Integer num3 = C05F.A00;
            C2WH A0M = AbstractC76963ci.A0M(c76223bS, C9CV.A00(AbstractC25230BEn.A0d(A00, num3, 100.0f, 0), num3, AbstractC25225BEi.A0i(c76223bS.BoZ().A01(R.attr.dividerColor)), 4));
            A0d = AbstractC25230BEn.A0d(null, num3, 100.0f, 0);
            A0J = AbstractC25233BEq.A0J(c76223bS);
            C167627eI c167627eI = c167637eJ.A01;
            if (c167627eI != null) {
                A0J.A00(A0M);
                String A0F = AbstractC77623dm.A0F(A0J, c167627eI.A00);
                C2XE c2xe = A0J.A00;
                int A07 = AbstractC25229BEm.A07(c2xe.A0C, A0J);
                long A092 = AbstractC77623dm.A09(A0J);
                long A0L = AbstractC25230BEn.A0L();
                C51722Yv A0R2 = AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(C05F.A0E, 0, A0L), 0, A0L);
                Typeface typeface2 = Typeface.DEFAULT;
                long A0D2 = AbstractC25229BEm.A0D();
                C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, A0F, 0);
                AbstractC25233BEq.A1B(A0J, A0a2, A07, A092);
                A0a2.A0S(0);
                AbstractC25234BEr.A0o(typeface2, A0J, A0a2, A0D2);
                A0a2.A0B();
                AbstractC25234BEr.A1H(A0a2, num3, false);
                A0a2.A0E();
                AbstractC25233BEq.A1D(A0R2, A0a2, false);
                AbstractC25227BEk.A1J(A0J, A0a2);
            }
            if (c167607eG != null) {
                A0J.A00(A0M);
                User user = c167607eG.A00;
                String str2 = c167607eG.A03;
                int i = this.A01.A04.A07;
                C37017GSy c37017GSy = new C37017GSy(this, 12);
                C51722Yv A002 = C9CV.A00(C9CU.A00(AbstractC25230BEn.A0d(null, num3, 100.0f, 0), C05F.A0Y, 0, AbstractC25229BEm.A0I()), num3, AbstractC25225BEi.A0i(i), 4);
                C2Z0 A0K = AbstractC25233BEq.A0K(A0J);
                String A0G = AbstractC77623dm.A0G(A0K, user.getUsername(), 2131972367);
                C51722Yv A0d2 = AbstractC25230BEn.A0d(null, num3, 100.0f, 0);
                long A0F2 = AbstractC25229BEm.A0F();
                long A0I = AbstractC25230BEn.A0I();
                C51722Yv A003 = C9CU.A00(A0d2, C05F.A0u, 0, A0F2);
                Integer num4 = C05F.A1F;
                C51722Yv A004 = C9CU.A00(A003, num4, 0, A0I);
                C2Z0 A13 = AbstractC25232BEp.A13(A0K);
                C2XE c2xe2 = A13.A00;
                Context context = c2xe2.A0C;
                int A072 = AbstractC25229BEm.A07(context, A13);
                long A093 = AbstractC77623dm.A09(A13);
                C51722Yv A0d3 = AbstractC25230BEn.A0d(null, num2, 1.0f, 1);
                Typeface typeface3 = Typeface.DEFAULT;
                long A0D3 = AbstractC25229BEm.A0D();
                C77723dw A0a3 = AbstractC25231BEo.A0a(c2xe2, null, A0G, 0);
                AbstractC25233BEq.A1B(A13, A0a3, A072, A093);
                A0a3.A0S(0);
                AbstractC25234BEr.A0o(typeface3, A13, A0a3, A0D3);
                A0a3.A0X(num3);
                AbstractC25233BEq.A1E(A0a3, num3, 1.0f, false);
                A0a3.A0M(1);
                AbstractC25234BEr.A17(A0d3, A0a3, false);
                AbstractC25227BEk.A1J(A13, A0a3);
                if (str2 != null) {
                    int A05 = AbstractC25228BEl.A05(context, A13);
                    long A094 = AbstractC77623dm.A09(A13);
                    C51722Yv A0d4 = AbstractC25230BEn.A0d(null, num2, 1.0f, 1);
                    C77723dw A0a4 = AbstractC25231BEo.A0a(c2xe2, null, str2, 0);
                    AbstractC25233BEq.A1B(A13, A0a4, A05, A094);
                    A0a4.A0S(0);
                    AbstractC25234BEr.A0o(typeface3, A13, A0a4, A0D3);
                    A0a4.A0X(num3);
                    AbstractC25234BEr.A1C(A0a4, num3, 1.0f);
                    A0a4.A0D();
                    AbstractC25233BEq.A1A(A13, A0d4, A0a4);
                }
                AbstractC25227BEk.A1H(A13, A0K, A004);
                long doubleToRawLongBits = Double.doubleToRawLongBits(40.0d);
                C51722Yv A005 = C9CU.A00(C9CU.A00(null, num2, 0, doubleToRawLongBits), num3, 0, doubleToRawLongBits);
                long A0B = AbstractC25229BEm.A0B();
                C51722Yv A006 = C9CV.A00(AbstractC25233BEq.A0S(AbstractC25232BEp.A14(A005, 0, A0B), AbstractC25226BEj.A0m(0, A0B), 0, A0B), num4, new MM0(c37017GSy, 15), 4);
                C2Z0 A0K2 = AbstractC25233BEq.A0K(A0K);
                Drawable A0E = AbstractC77623dm.A0E(A0K2, R.drawable.instagram_x_pano_outline_16);
                C2XE c2xe3 = A0K2.A00;
                A0E.setTint(A0K2.BoZ().A02(AbstractC53242c7.A0B(c2xe3.A0C)));
                AbstractC25234BEr.A0r(A0E, c2xe3, A0K2, AbstractC25234BEr.A0B(null, AbstractC25231BEo.A0b(A0K2, 2131972365, 0), 0.0f));
                A0J.A00(AbstractC25226BEj.A0k(AbstractC76963ci.A0H(A0K2, A0K, A006), A0K, A0J, A002));
            }
        } else {
            if ((interfaceC166367c5 instanceof C26164Bhp) || (interfaceC166367c5 instanceof C51808MvC)) {
                return null;
            }
            throw B4Z.A00();
        }
        return AbstractC76963ci.A03(A0J, c76223bS, A0d);
    }

    public C26424Bm7(InterfaceC166367c5 interfaceC166367c5, L5U l5u, Jn5 jn5, C7IM c7im, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167017dG.A1Q(interfaceC166367c5, c7im);
        this.A02 = interfaceC166367c5;
        this.A03 = l5u;
        this.A01 = c7im;
        this.A00 = jn5;
        this.A04 = interfaceC60442pS;
    }
}
