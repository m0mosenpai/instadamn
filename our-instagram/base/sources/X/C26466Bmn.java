package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.facebook.R;
import com.instagram.api.schemas.MidCardOverlayType;

/* renamed from: X.Bmn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26466Bmn extends AbstractC51572Yf {
    public final int A00;
    public final int A01;
    public final C51722Yv A02;
    public final MidCardOverlayType A03;
    public final InterfaceC11380iw A04;
    public final InterfaceC30889Di2 A05;

    public C26466Bmn(C51722Yv c51722Yv, MidCardOverlayType midCardOverlayType, InterfaceC11380iw interfaceC11380iw, InterfaceC30889Di2 interfaceC30889Di2, int i, int i2) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A04 = interfaceC11380iw;
        this.A05 = interfaceC30889Di2;
        this.A02 = c51722Yv;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = midCardOverlayType;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int i;
        Object[] objArr;
        String A04;
        String string;
        C14360o3.A0B(c76223bS, 0);
        InterfaceC30889Di2 interfaceC30889Di2 = this.A05;
        if ((interfaceC30889Di2 instanceof D0S) || !(interfaceC30889Di2 instanceof C26254BjN)) {
            return null;
        }
        EnumC77683ds enumC77683ds = EnumC77683ds.FLEX_START;
        C51722Yv c51722Yv = this.A02;
        C2Z0 A12 = AbstractC25232BEp.A12(c76223bS);
        InterfaceC11380iw interfaceC11380iw = this.A04;
        C26254BjN c26254BjN = (C26254BjN) interfaceC30889Di2;
        InterfaceC30891Di4 interfaceC30891Di4 = c26254BjN.A03;
        C75933ay c75933ay = C51722Yv.A02;
        A12.A00(new C26444BmR(C9CU.A00(null, C05F.A1I, 0, AbstractC77623dm.A06(A12)), interfaceC11380iw, interfaceC30891Di4, this.A00, this.A01));
        C2XE c2xe = A12.A00;
        Context context = c2xe.A0C;
        Resources A0M = AbstractC166997dE.A0M(context);
        MidCardOverlayType midCardOverlayType = this.A03;
        Integer num = c26254BjN.A04;
        int i2 = c26254BjN.A01;
        int i3 = c26254BjN.A02;
        int i4 = c26254BjN.A00;
        int ordinal = midCardOverlayType.ordinal();
        if (ordinal != 11) {
            if (ordinal != 10) {
                if (ordinal != 12) {
                    if (ordinal != 8) {
                        string = null;
                    } else {
                        string = AbstractC25231BEo.A0r(A0M, AbstractC25231BEo.A0q(A0M, i4), R.plurals.number_of_comments, i4);
                    }
                } else {
                    string = AbstractC25231BEo.A0r(A0M, AbstractC25231BEo.A0q(A0M, i3), R.plurals.number_of_shares, i3);
                }
                int A042 = AbstractC25228BEl.A04(context, A12);
                long A07 = AbstractC77623dm.A07(A12);
                int A02 = A12.BoZ().A02(R.color.black_30_transparent);
                long A0D = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                Typeface typeface = Typeface.DEFAULT;
                long A0D2 = AbstractC25229BEm.A0D();
                Integer num2 = C05F.A00;
                C77723dw A0a = AbstractC25231BEo.A0a(c2xe, null, string, 0);
                AbstractC25233BEq.A1B(A12, A0a, A042, A07);
                AbstractC25234BEr.A14(A12, A0a, C2Z3.A00(AbstractC25233BEq.A0i(typeface, A12, A0a, 0, A02), A0D), A0D2);
                AbstractC25234BEr.A1I(A0a, num2, false);
                A0a.A0M(1);
                AbstractC25234BEr.A15(A12, A0a, false);
                return AbstractC76963ci.A07(A12, c76223bS, c51722Yv, enumC77683ds, null);
            }
            if (i2 >= 0) {
                i = R.plurals.number_of_likes;
                objArr = new Object[1];
                A04 = AbstractC25231BEo.A0q(A0M, i2);
            } else {
                throw new UnsupportedOperationException("Cannot format null like count");
            }
        } else if (num != null && (i2 = num.intValue()) >= 0) {
            if (i2 == 0) {
                string = A0M.getString(2131968585);
                C14360o3.A0A(string);
                int A0422 = AbstractC25228BEl.A04(context, A12);
                long A072 = AbstractC77623dm.A07(A12);
                int A022 = A12.BoZ().A02(R.color.black_30_transparent);
                long A0D3 = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                Typeface typeface2 = Typeface.DEFAULT;
                long A0D22 = AbstractC25229BEm.A0D();
                Integer num22 = C05F.A00;
                C77723dw A0a2 = AbstractC25231BEo.A0a(c2xe, null, string, 0);
                AbstractC25233BEq.A1B(A12, A0a2, A0422, A072);
                AbstractC25234BEr.A14(A12, A0a2, C2Z3.A00(AbstractC25233BEq.A0i(typeface2, A12, A0a2, 0, A022), A0D3), A0D22);
                AbstractC25234BEr.A1I(A0a2, num22, false);
                A0a2.A0M(1);
                AbstractC25234BEr.A15(A12, A0a2, false);
                return AbstractC76963ci.A07(A12, c76223bS, c51722Yv, enumC77683ds, null);
            }
            i = R.plurals.number_of_plays;
            objArr = new Object[1];
            A04 = C84963qk.A04(A0M, num, 10000, false, false);
        } else {
            throw new UnsupportedOperationException(AbstractC111324zv.A00(292));
        }
        objArr[0] = A04;
        string = A0M.getQuantityString(i, i2, objArr);
        C14360o3.A0A(string);
        int A04222 = AbstractC25228BEl.A04(context, A12);
        long A0722 = AbstractC77623dm.A07(A12);
        int A0222 = A12.BoZ().A02(R.color.black_30_transparent);
        long A0D32 = AbstractC77623dm.A0D(A12, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        Typeface typeface22 = Typeface.DEFAULT;
        long A0D222 = AbstractC25229BEm.A0D();
        Integer num222 = C05F.A00;
        C77723dw A0a22 = AbstractC25231BEo.A0a(c2xe, null, string, 0);
        AbstractC25233BEq.A1B(A12, A0a22, A04222, A0722);
        AbstractC25234BEr.A14(A12, A0a22, C2Z3.A00(AbstractC25233BEq.A0i(typeface22, A12, A0a22, 0, A0222), A0D32), A0D222);
        AbstractC25234BEr.A1I(A0a22, num222, false);
        A0a22.A0M(1);
        AbstractC25234BEr.A15(A12, A0a22, false);
        return AbstractC76963ci.A07(A12, c76223bS, c51722Yv, enumC77683ds, null);
    }
}
