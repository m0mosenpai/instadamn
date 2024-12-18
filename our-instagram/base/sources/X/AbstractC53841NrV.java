package X;

import androidx.fragment.app.FragmentActivity;
import java.util.Locale;

/* renamed from: X.NrV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53841NrV {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0L;
        String A0F;
        Integer num;
        String A10;
        int hashCode;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        C6FG A09 = C6BQ.A09(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C54844OMp c54844OMp = new C54844OMp(A04);
        c54844OMp.A0B = c102884kP.A0S(38, false);
        C102884kP A08 = c102884kP.A08(48);
        if (A08 != null && (A0L = A08.A0L(38)) != null && A0L.length() != 0) {
            if ((A09.A05 || C6BQ.A06(c6fq).A05.AF5(A04)) && (A0F = A08.A0F()) != null) {
                A0L = A0F;
            }
            c54844OMp.A03 = new P32(AbstractC25225BEi.A0t(A0L));
            String A0L2 = A08.A0L(36);
            if (A0L2 != null && (hashCode = (A10 = AbstractC166997dE.A10(Locale.ROOT, A0L2)).hashCode()) != -387072689) {
                if (hashCode != 956910582) {
                    if (hashCode == 1988079824 && A10.equals("CIRCLE")) {
                        num = C05F.A0C;
                        c54844OMp.A06 = num;
                    }
                } else if (A10.equals("FULL_WIDTH")) {
                    num = C05F.A00;
                    c54844OMp.A06 = num;
                }
            }
            num = C05F.A01;
            c54844OMp.A06 = num;
        }
        String A0L3 = c102884kP.A0L(45);
        if (A0L3 != null && A0L3.length() != 0) {
            c54844OMp.A07 = A0L3;
        }
        String A0J = c102884kP.A0J();
        if (A0J != null && A0J.length() != 0) {
            c54844OMp.A05 = A0J;
        }
        C17050sx A01 = AbstractC09440dt.A01(new C50150MDd(A09, 27));
        C102884kP A082 = c102884kP.A08(44);
        String str = "";
        if (A082 != null) {
            String str2 = "";
            String A0L4 = A082.A0L(38);
            if (A0L4 != null) {
                str2 = A0L4;
            }
            if (str2.length() != 0) {
                DialogInterfaceOnClickListenerC28564Ciw dialogInterfaceOnClickListenerC28564Ciw = new DialogInterfaceOnClickListenerC28564Ciw(c6fq, A082, A01, 3);
                A082.A0S(36, true);
                c54844OMp.A02(dialogInterfaceOnClickListenerC28564Ciw, str2);
            }
        }
        C102884kP A083 = c102884kP.A08(42);
        if (A083 != null) {
            String A0L5 = A083.A0L(38);
            if (A0L5 != null) {
                str = A0L5;
            }
            if (str.length() != 0) {
                DialogInterfaceOnClickListenerC28564Ciw dialogInterfaceOnClickListenerC28564Ciw2 = new DialogInterfaceOnClickListenerC28564Ciw(c6fq, A083, A01, 4);
                A083.A0S(36, true);
                c54844OMp.A03(dialogInterfaceOnClickListenerC28564Ciw2, str);
            }
        }
        C0fJ.A00(c54844OMp.A00());
        return null;
    }
}
