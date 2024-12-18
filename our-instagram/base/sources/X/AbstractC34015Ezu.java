package X;

import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.Ezu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34015Ezu {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 0);
        if (A0F == null) {
            str = AbstractC111324zv.A00(754);
            str2 = "Received null snackbar model while attempting to show snackbar";
        } else {
            C102884kP A08 = A0F.A08(35);
            if (A08 == null) {
                str = "SnackbarUtils";
                str2 = "Received null snackbar button model while attempting to show snackbar";
            } else {
                C146106i8 A0K = AbstractC31171DnF.A0K();
                String str3 = "";
                String str4 = "";
                String A0G = A0F.A0G();
                if (A0G != null) {
                    str4 = A0G;
                }
                A0K.A0D = str4;
                A0K.A04();
                InterfaceC103384lE A0B = A08.A0B(35);
                A0K.A0L = true;
                String A0G2 = A08.A0G();
                if (A0G2 != null) {
                    str3 = A0G2;
                }
                A0K.A0G = str3;
                A0K.A0A(new G9A(c6fq, A0B, 2));
                ((BaseFragmentActivity) C6BQ.A04(c6fq)).By1().A0A(A0K.A00());
                return null;
            }
        }
        AbstractC25241Le.A02(str, str2);
        return null;
    }
}
