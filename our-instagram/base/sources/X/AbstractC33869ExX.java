package X;

import android.app.Dialog;
import android.content.ClipData;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.ExX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33869ExX {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 0);
        if (A0F == null) {
            AbstractC25241Le.A02(AbstractC111324zv.A00(755), "Received null config model");
            return null;
        }
        String str = "";
        String str2 = "";
        String A0K = A0F.A0K();
        if (A0K != null) {
            str2 = A0K;
        }
        String str3 = "";
        String A0L = A0F.A0L(46);
        if (A0L != null) {
            str3 = A0L;
        }
        String str4 = "";
        String A0L2 = A0F.A0L(44);
        if (A0L2 != null) {
            str4 = A0L2;
        }
        String str5 = "";
        String A0L3 = A0F.A0L(45);
        if (A0L3 != null) {
            str5 = A0L3;
        }
        String A0L4 = A0F.A0L(48);
        if (A0L4 != null) {
            str = A0L4;
        }
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        ClipData newPlainText = ClipData.newPlainText(null, AnonymousClass001.A0g(str3, AnonymousClass001.A0R(", ", str4), AnonymousClass001.A0R(", ", str5)));
        Object A0X = AbstractC31171DnF.A0X(A04);
        DialogInterfaceOnClickListenerC35354FiV dialogInterfaceOnClickListenerC35354FiV = new DialogInterfaceOnClickListenerC35354FiV(A04, str2, str3, str4, str5);
        DialogInterfaceOnClickListenerC35455FkC A00 = DialogInterfaceOnClickListenerC35455FkC.A00(A0X, newPlainText, 6);
        DialogInterfaceOnClickListenerC41806IfM dialogInterfaceOnClickListenerC41806IfM = new DialogInterfaceOnClickListenerC41806IfM(c6fq, A0B, str, 0);
        C193328hC A0I = AbstractC31171DnF.A0I(A04);
        if (!AbstractC13670mt.A0B(str) && !str.trim().equals("0")) {
            A0I.A0R(dialogInterfaceOnClickListenerC41806IfM, EnumC193348hE.A04, 2131973332);
        }
        A0I.A0H(dialogInterfaceOnClickListenerC35354FiV, 2131973331);
        A0I.A0I(A00, 2131956832);
        A0I.A0s(true);
        Dialog A02 = A0I.A02();
        A02.setCanceledOnTouchOutside(true);
        C0fJ.A00(A02);
        return null;
    }
}
