package X;

import androidx.fragment.app.Fragment;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* renamed from: X.Fg4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35211Fg4 {
    public static BusinessFlowAnalyticsLogger A00(InterfaceC37222GaX interfaceC37222GaX, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        EnumC151596s5 B77;
        String str;
        if (interfaceC37222GaX == null) {
            B77 = EnumC151596s5.A07;
            str = null;
        } else {
            B77 = interfaceC37222GaX.B77();
            str = (String) AbstractC166987dD.A17(((BusinessConversionActivity) interfaceC37222GaX).A0C);
        }
        return AbstractC151606s6.A00(B77, interfaceC11380iw, abstractC12990ll, str);
    }

    public static boolean A02(InterfaceC37222GaX interfaceC37222GaX) {
        if ((interfaceC37222GaX != null && (interfaceC37222GaX.B77() == EnumC151596s5.A08 || interfaceC37222GaX.B77() == EnumC151596s5.A0A || interfaceC37222GaX.B77() == EnumC151596s5.A04)) || A03(interfaceC37222GaX)) {
            return true;
        }
        return false;
    }

    public static boolean A03(InterfaceC37222GaX interfaceC37222GaX) {
        if (interfaceC37222GaX != null && interfaceC37222GaX.B77() == EnumC151596s5.A05) {
            return true;
        }
        return false;
    }

    public static boolean A04(InterfaceC37222GaX interfaceC37222GaX) {
        if (interfaceC37222GaX != null) {
            if (interfaceC37222GaX.B77() == EnumC151596s5.A09 || interfaceC37222GaX.B77() == EnumC151596s5.A03 || interfaceC37222GaX.B77() == EnumC151596s5.A06) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static InterfaceC37222GaX A01(Fragment fragment) {
        C1UC activity = fragment.getActivity();
        if (activity instanceof InterfaceC37222GaX) {
            return (InterfaceC37222GaX) activity;
        }
        return null;
    }
}
