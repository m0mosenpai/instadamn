package X;

import android.graphics.Typeface;
import com.facebook.R;

/* renamed from: X.BmQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26443BmQ extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final C51722Yv A02;
    public final InterfaceC11380iw A03;
    public final InterfaceC30890Di3 A04;

    public C26443BmQ(C51722Yv c51722Yv, InterfaceC11380iw interfaceC11380iw, InterfaceC30890Di3 interfaceC30890Di3, int i, int i2) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A03 = interfaceC11380iw;
        this.A04 = interfaceC30890Di3;
        this.A02 = c51722Yv;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30890Di3 interfaceC30890Di3 = this.A04;
        if ((interfaceC30890Di3 instanceof D0T) || !(interfaceC30890Di3 instanceof C26255BjO)) {
            return null;
        }
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        C51722Yv c51722Yv = this.A02;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        InterfaceC11380iw interfaceC11380iw = this.A03;
        C26255BjO c26255BjO = (C26255BjO) interfaceC30890Di3;
        InterfaceC30891Di4 interfaceC30891Di4 = c26255BjO.A00;
        C75933ay c75933ay = C51722Yv.A02;
        A12.A00(new C26444BmR(C9CU.A00(null, C05F.A1I, 0, AbstractC77623dm.A06(A12)), interfaceC11380iw, interfaceC30891Di4, this.A00, this.A01));
        String str = c26255BjO.A01;
        C2XE c2xe = A12.A00;
        int A0A = AbstractC25230BEn.A0A(c2xe, A12);
        long A07 = AbstractC77623dm.A07(A12);
        int A02 = A12.BoZ().A02(R.color.black_30_transparent);
        long A0D = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = AbstractC25229BEm.A0D();
        Integer num = C05F.A00;
        C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, str, 0);
        AbstractC25233BEq.A1B(A12, A0a, A0A, A07);
        AbstractC25234BEr.A14(A12, A0a, C2Z3.A00(AbstractC25233BEq.A0i(typeface, A12, A0a, 0, A02), A0D), A0D2);
        AbstractC25234BEr.A1I(A0a, num, false);
        A0a.A0M(2);
        AbstractC25234BEr.A15(A12, A0a, false);
        return AbstractC76963ci.A07(A12, c76223bS, c51722Yv, enumC77683ds, null);
    }
}
