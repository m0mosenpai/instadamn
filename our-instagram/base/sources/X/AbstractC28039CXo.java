package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.Locale;

/* renamed from: X.CXo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28039CXo {
    public static final void A01(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, C6FG c6fg, C6FQ c6fq, C102884kP c102884kP) {
        String A0L;
        Integer num;
        String A0L2;
        boolean A1R = AbstractC167007dF.A1R(0, fragmentActivity, interfaceC11380iw);
        C14360o3.A0B(c102884kP, 4);
        C193328hC c193328hC = new C193328hC((Activity) fragmentActivity);
        c193328hC.A0s(c102884kP.A0S(40, A1R));
        c193328hC.A0t(c102884kP.A0S(38, false));
        String A0L3 = c102884kP.A0L(45);
        if (A0L3 != null && A0L3.length() != 0) {
            c193328hC.A05 = A0L3;
        }
        C102884kP A08 = c102884kP.A08(48);
        if (A08 != null && (A0L = A08.A0L(38)) != null) {
            if (((c6fg != null && c6fg.A05 == A1R) || C6BQ.A06(c6fq).A05.AF5(fragmentActivity)) && (A0L2 = A08.A0L(40)) != null) {
                A0L = A0L2;
            }
            SimpleImageUrl A0t = AbstractC25225BEi.A0t(A0L);
            String A0L4 = A08.A0L(36);
            if (A0L4 != null && A0L4.length() != 0) {
                try {
                    Locale locale = Locale.US;
                    C14360o3.A08(locale);
                    String A10 = AbstractC166997dE.A10(locale, A0L4);
                    if (A10.equals("SQUARE")) {
                        num = C05F.A00;
                    } else if (A10.equals("CIRCLE")) {
                        num = C05F.A01;
                    } else if (A10.equals("RECTANGLE")) {
                        num = C05F.A0C;
                    } else if (A10.equals("FULL_WIDTH")) {
                        num = C05F.A0N;
                    } else if (A10.equals("UNKNOWN")) {
                        num = C05F.A0Y;
                    } else {
                        throw AbstractC166987dD.A12(A10);
                    }
                } catch (IllegalArgumentException unused) {
                    AbstractC25241Le.A02("IGBloksActionNavigationOpenDialogImpl", AnonymousClass001.A0R("Dialog header type unknown: ", A0L4));
                    num = C05F.A0Y;
                }
            } else {
                num = C05F.A0Y;
            }
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != A1R) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            c193328hC.A0q(A0t, interfaceC11380iw);
                            if (A08.A0L(36) != null) {
                                AbstractC25241Le.A02(AbstractC111324zv.A00(642), AnonymousClass001.A0R("Unknown header render type: ", A08.A0L(36)));
                            }
                        } else {
                            c193328hC.A0p(A0t, interfaceC11380iw);
                        }
                    } else {
                        c193328hC.A08 = A1R;
                        c193328hC.A0Z.setImageURL(A0t, interfaceC11380iw, null);
                    }
                } else {
                    c193328hC.A0o(A0t, interfaceC11380iw);
                }
            } else {
                c193328hC.A0q(A0t, interfaceC11380iw);
            }
        }
        String A0J = c102884kP.A0J();
        if (A0J != null && A0J.length() > 0) {
            c193328hC.A0r(A0J);
        }
        C17050sx A01 = AbstractC09440dt.A01(new C50150MDd(c6fg, 26));
        C102884kP A082 = c102884kP.A08(44);
        String str = "";
        if (A082 != null) {
            String str2 = "";
            String A0L5 = A082.A0L(38);
            if (A0L5 != null) {
                str2 = A0L5;
            }
            c193328hC.A0Z(new DialogInterfaceOnClickListenerC28564Ciw(c6fq, A082, A01, 0), A00(A082.A0L(34)), str2, A082.A0S(36, A1R));
        }
        C102884kP A083 = c102884kP.A08(35);
        if (A083 != null) {
            String str3 = "";
            String A0L6 = A083.A0L(38);
            if (A0L6 != null) {
                str3 = A0L6;
            }
            c193328hC.A0X(new DialogInterfaceOnClickListenerC28564Ciw(c6fq, A083, A01, A1R ? 1 : 0), A00(A083.A0L(34)), str3, A083.A0S(36, A1R));
        }
        C102884kP A084 = c102884kP.A08(42);
        if (A084 != null) {
            String A0L7 = A084.A0L(38);
            if (A0L7 != null) {
                str = A0L7;
            }
            c193328hC.A0Y(new DialogInterfaceOnClickListenerC28564Ciw(c6fq, A084, A01, 2), A00(A084.A0L(34)), str, A084.A0S(36, A1R));
        }
        InterfaceC103384lE A0B = c102884kP.A0B(43);
        if (A0B != null) {
            c193328hC.A0C(new DialogInterfaceOnCancelListenerC55247OfL(A1R ? 1 : 0, A0B, c6fq));
        }
        AbstractC166987dD.A1W(c193328hC);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r1.equals(com.instagram.realtimeclient.GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT) == false) goto L5;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC193348hE A00(java.lang.String r1) {
        /*
            if (r1 == 0) goto L50
            int r0 = r1.hashCode()
            switch(r0) {
                case -785846925: goto L45;
                case 112785: goto L3a;
                case 3027034: goto L2f;
                case 1544803905: goto L26;
                case 1949100874: goto L1b;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = "Unknown button style "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
            r0 = 642(0x282, float:9.0E-43)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            X.AbstractC25241Le.A02(r0, r1)
            X.8hE r0 = X.EnumC193348hE.A04
            return r0
        L1b:
            java.lang.String r0 = "blue_bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            X.8hE r0 = X.EnumC193348hE.A03
            return r0
        L26:
            java.lang.String r0 = "default"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L50
            goto L9
        L2f:
            java.lang.String r0 = "blue"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            X.8hE r0 = X.EnumC193348hE.A02
            return r0
        L3a:
            java.lang.String r0 = "red"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            X.8hE r0 = X.EnumC193348hE.A05
            return r0
        L45:
            java.lang.String r0 = "red_bold"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            X.8hE r0 = X.EnumC193348hE.A06
            return r0
        L50:
            X.8hE r0 = X.EnumC193348hE.A04
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28039CXo.A00(java.lang.String):X.8hE");
    }
}
