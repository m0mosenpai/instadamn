package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* loaded from: classes8.dex */
public abstract class LLQ {
    public static final Integer A02(Fragment fragment) {
        C14360o3.A0B(fragment, 0);
        String A13 = AbstractC31172DnG.A13(fragment.requireArguments(), "BUNDLE_ENTRY_POINT");
        C14360o3.A0A(A13);
        if (A13.equals("DIRECT_INBOX_NUX")) {
            return C05F.A00;
        }
        if (A13.equals("RESTORE_TOAST")) {
            return C05F.A01;
        }
        if (A13.equals("SETTINGS")) {
            return C05F.A0C;
        }
        if (A13.equals("SETTINGS_GDRIVE_TOGGLE")) {
            return C05F.A0N;
        }
        if (A13.equals("FISHFOODING")) {
            return C05F.A0Y;
        }
        if (A13.equals("OTC_NOTIFICATION")) {
            return C05F.A0j;
        }
        if (A13.equals("SETTINGS_RESET_PIN")) {
            return C05F.A0u;
        }
        if (A13.equals("UNKNOWN")) {
            return C05F.A15;
        }
        if (A13.equals("ENCRYPTED_MESSAGE")) {
            return C05F.A1F;
        }
        if (A13.equals("DEFAULT_BACKUPS")) {
            return C05F.A1I;
        }
        if (A13.equals("THREAD_EXIT")) {
            return C05F.A02;
        }
        if (A13.equals("INBOX_BANNER")) {
            return C05F.A03;
        }
        if (A13.equals("RETRY_PIN")) {
            return C05F.A04;
        }
        if (A13.equals("AUTO_POPUP")) {
            return C05F.A05;
        }
        if (A13.equals("STATE_CHECKER")) {
            return C05F.A06;
        }
        if (A13.equals("BLOCK_STORE_HEALTH_VALIDATOR")) {
            return C05F.A07;
        }
        throw AbstractC166987dD.A12(A13);
    }

    public static final void A05(ViewGroup viewGroup, Fragment fragment, double d) {
        C14360o3.A0B(viewGroup, 1);
        if (A08(fragment)) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (C6CB.A02(C6CE.A00(AbstractC31176DnK.A0S(fragment)).A00, 36315928477437765L)) {
                AbstractC008903d.A00(viewGroup, new LRU(layoutParams, viewGroup, fragment, d));
            } else {
                layoutParams.height = (int) (AbstractC166997dE.A0N(fragment).getDisplayMetrics().heightPixels * 0.75d);
                viewGroup.setLayoutParams(layoutParams);
            }
        }
    }

    public static final void A06(Fragment fragment, EnumC193348hE enumC193348hE, Integer num, Integer num2, Integer num3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, int i, int i2) {
        C14360o3.A0B(fragment, 0);
        C193328hC A0O = AbstractC31175DnJ.A0O(fragment);
        if (num != null) {
            A0O.A0A(num.intValue());
        }
        A0O.A09(i);
        if (num2 != null) {
            A0O.A0R(DialogInterfaceOnClickListenerC48023LMs.A00(interfaceC16820sZ4, 29), enumC193348hE, num2.intValue());
        }
        if (num3 != null) {
            A0O.A0H(DialogInterfaceOnClickListenerC48023LMs.A00(interfaceC16820sZ3, 30), num3.intValue());
        }
        DialogInterfaceOnClickListenerC48023LMs.A02(A0O, interfaceC16820sZ2, 31, i2);
        A0O.A0s(true);
        if (interfaceC16820sZ != null) {
            A0O.A0h(new DialogInterfaceOnShowListenerC48027LMw(interfaceC16820sZ, 6));
        }
        AbstractC166987dD.A1W(A0O);
    }

    public static final void A04(ViewGroup viewGroup, Fragment fragment) {
        A05(viewGroup, fragment, 0.75d);
    }

    public static final void A07(Fragment fragment, Integer num, InterfaceC16820sZ interfaceC16820sZ, int i) {
        A06(fragment, EnumC193348hE.A03, num, null, null, null, null, null, interfaceC16820sZ, i, 2131968948);
    }

    public static final EnumC46149Kbn A00(Fragment fragment) {
        String A13 = AbstractC31172DnG.A13(fragment.requireArguments(), "BUNDLE_SURFACE");
        C14360o3.A0A(A13);
        return EnumC46149Kbn.valueOf(A13);
    }

    public static final Integer A01(Fragment fragment) {
        return JQ0.A0e(fragment.requireArguments().getInt("BUNDLE_CURRENT_INTERVAL", Integer.MIN_VALUE), Integer.MIN_VALUE);
    }

    public static final Integer A03(Fragment fragment) {
        String string = fragment.requireArguments().getString("BUNDLE_ONBOARDING_PERIOD", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        C14360o3.A0A(string);
        if (string.equals(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED)) {
            return C05F.A00;
        }
        if (string.equals("INTRODUCE")) {
            return C05F.A01;
        }
        if (string.equals("CUTOVER")) {
            return C05F.A0C;
        }
        if (string.equals("SELL")) {
            return C05F.A0N;
        }
        if (string.equals("WARN")) {
            return C05F.A0Y;
        }
        if (string.equals("BLOCK")) {
            return C05F.A0j;
        }
        if (string.equals("MEX_EB_UPSELL")) {
            return C05F.A0u;
        }
        if (string.equals("MEX_EB_LOW_DISK_SPACE")) {
            return C05F.A15;
        }
        throw AbstractC166987dD.A12(string);
    }

    public static final boolean A08(Fragment fragment) {
        return AbstractC31174DnI.A1a(EnumC46149Kbn.A02, AbstractC31172DnG.A13(fragment.requireArguments(), "BUNDLE_SURFACE"));
    }
}
