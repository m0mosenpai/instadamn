package X;

import android.content.DialogInterface;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.FZo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34902FZo {
    public static boolean A00;

    public static final void A00(DialogInterface.OnClickListener onClickListener, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, ImageUrl imageUrl, EnumC31713DwI enumC31713DwI, String str, String str2, String str3, String str4) {
        AbstractC167027dH.A0a(1, abstractC59962oe, str, str2, str3);
        if (!A00) {
            A00 = true;
            C193328hC A0O = AbstractC31175DnJ.A0O(abstractC59962oe);
            C14360o3.A0A(imageUrl);
            A0O.A0o(imageUrl, abstractC59962oe);
            A0O.A05 = AbstractC31174DnI.A0w(abstractC59962oe, str2, 2131976618);
            A0O.A09(2131976615);
            String A0w = AbstractC31174DnI.A0w(abstractC59962oe, str2, 2131976616);
            C14360o3.A07(A0w);
            A0O.A0d(new DialogInterfaceOnClickListenerC35376Fir(abstractC59962oe, enumC31713DwI, c07270a1, str3, str, str2, str4, 0), A0w);
            A0O.A0b(onClickListener, AbstractC25227BEk.A0v(abstractC59962oe, 2131976617));
            A0O.A0g(new DialogInterfaceOnDismissListenerC35456FkD(0));
            AbstractC166987dD.A1W(A0O);
        }
    }

    public static final void A01(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, C36050Fvm c36050Fvm, RegFlowExtras regFlowExtras, EnumC31713DwI enumC31713DwI) {
        String str;
        String str2;
        String str3;
        AbstractC32152EAz abstractC32152EAz = c36050Fvm.A00;
        if (abstractC32152EAz != null && (str = abstractC32152EAz.A01) != null && str.length() != 0 && !AbstractC81033jX.A03(abstractC32152EAz.A00) && (str2 = abstractC32152EAz.A02) != null && str2.length() != 0 && (str3 = abstractC32152EAz.A03) != null && str3.length() != 0) {
            regFlowExtras.A0k = true;
            C14360o3.A0A(str2);
            String str4 = abstractC32152EAz.A03;
            C14360o3.A0A(str4);
            String str5 = abstractC32152EAz.A01;
            C14360o3.A0A(str5);
            A00(DialogInterfaceOnClickListenerC35454FkB.A00(regFlowExtras, 28), abstractC59962oe, c07270a1, abstractC32152EAz.A00, enumC31713DwI, str2, str4, str5, regFlowExtras.A0A);
        }
    }
}
