package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.T2s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64186T2s implements TmO {
    public static final java.util.Set A04;
    public C63152Se0 A00;
    public final Bundle A01;
    public final Q8V A02;
    public final C58770Q8c A03;

    public static void A00(C64186T2s c64186T2s, SBl sBl) {
        Bundle bundle;
        String str;
        String str2;
        String str3 = sBl.A00;
        if (!"ACTIVE".equalsIgnoreCase(str3) && !"DISABLED".equalsIgnoreCase(str3)) {
            if ("LOCKED".equalsIgnoreCase(str3)) {
                bundle = c64186T2s.A01;
                String A00 = AbstractC63243Sfx.A00(bundle, 1);
                if ("VERIFY_PIN_TO_PAY".equalsIgnoreCase(A00)) {
                    str2 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_TO_PAY";
                } else {
                    if ("VERIFY_PIN_TO_DISABLE_BIO_HUB".equalsIgnoreCase(A00) || "VERIFY_PIN_TO_DISABLE_PIN_HUB".equalsIgnoreCase(A00) || "VERIFY_PIN_TO_ENABLE_BIO_HUB".equalsIgnoreCase(A00) || "VERIFY_PIN_TO_ENABLE_PIN_HUB".equalsIgnoreCase(A00)) {
                        str2 = "LOCKED_PIN_RECOVER_WITH_PASSWORD_HUB";
                    }
                    bundle.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
                    AbstractC63243Sfx.A03("RECOVER_PIN", bundle);
                    str = "forget_pin_display";
                }
                AbstractC63243Sfx.A02(str2, bundle);
                bundle.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
                AbstractC63243Sfx.A03("RECOVER_PIN", bundle);
                str = "forget_pin_display";
            } else if ("DELETED".equalsIgnoreCase(str3)) {
                bundle = c64186T2s.A01;
                AbstractC63243Sfx.A03("CREATE_PIN", bundle);
                AbstractC63062Sbj.A02(bundle, "CREATE_AUTH_TICKET_BASED_FACTOR");
                C2FP.A0D();
                bundle.putBoolean("AUTH_FLOW_UTIL_ASKED_FOR_BIO_SETUP", false);
                str = "create_pin_display";
            } else {
                throw AbstractC166987dD.A18("Should not be called");
            }
        } else {
            bundle = c64186T2s.A01;
            AbstractC63243Sfx.A03("VERIFY_PIN", bundle);
            str = "verify_pin_display";
        }
        bundle.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str);
        C63167SeR.A01(c64186T2s.A02.A00, new C3AY("AUTH_EDIT_TEXT_SCREEN", new Bundle(bundle)));
    }

    @Override // X.TmO
    public final C63152Se0 BLy() {
        return this.A00;
    }

    @Override // X.TmO
    public final void DHb(Bundle bundle, C63152Se0 c63152Se0) {
        String str;
        String str2;
        String str3;
        Object runtimeException;
        C2GS c2gs;
        Bundle bundle2 = this.A01;
        if (!TextUtils.isEmpty(AbstractC63243Sfx.A00(bundle2, 2))) {
            String A01 = AbstractC63243Sfx.A01(bundle2, 2);
            str = "AUTH_EDIT_TEXT_SCREEN";
            if ("RECOVER_PIN".equalsIgnoreCase(A01)) {
                AbstractC58322PtE.A18(bundle2, "AUTH_FLOW_UTIL_AUTH_STEP", "CREATE_PIN", 2);
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PASSWORD_ENTERED", AbstractC31173DnH.A0j(bundle, "AUTH_FLOW_UTIL_PASSWORD_ENTERED"));
                str2 = "reset_pin_screen_display";
            } else if ("CREATE_PIN".equalsIgnoreCase(A01)) {
                bundle.getClass();
                bundle2.putString("AUTH_FLOW_UTIL_PIN_ENTERED", AbstractC31173DnH.A0j(bundle, "AUTH_FLOW_UTIL_PIN_ENTERED"));
                AbstractC58322PtE.A18(bundle2, "AUTH_FLOW_UTIL_AUTH_STEP", "CONFIRM_PIN", 2);
                str2 = "reset_pin_confirm_display";
            } else {
                if (!"CONFIRM_PIN".equalsIgnoreCase(A01)) {
                    return;
                }
                c63152Se0.getClass();
                c2gs = this.A02.A02;
                runtimeException = new C3AY(c63152Se0, null);
                C63167SeR.A01(c2gs, runtimeException);
                return;
            }
            bundle2.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str2);
            C63167SeR.A01(this.A02.A00, new C3AY(str, new Bundle(bundle2)));
        }
        String A012 = AbstractC63243Sfx.A01(bundle2, 1);
        A012.getClass();
        str = "AUTH_EDIT_TEXT_SCREEN";
        if (A012.equalsIgnoreCase("CREATE_PIN")) {
            bundle.getClass();
            bundle2.putString("AUTH_FLOW_UTIL_PIN_ENTERED", AbstractC31173DnH.A0j(bundle, "AUTH_FLOW_UTIL_PIN_ENTERED"));
            AbstractC63243Sfx.A03("CONFIRM_PIN", bundle2);
            str2 = "confirm_pin_display";
        } else {
            if (!A012.equalsIgnoreCase("CONFIRM_PIN") && !"CONFIRM_PIN".equalsIgnoreCase(AbstractC63243Sfx.A01(bundle2, 2))) {
                str2 = "reset_pin_screen_display";
                if (A012.equalsIgnoreCase("VERIFY_PIN")) {
                    if (c63152Se0 != null) {
                        if ("CHANGE_PIN_USING_OLD_PIN".equalsIgnoreCase(AbstractC63243Sfx.A00(bundle2, 1))) {
                            this.A00 = c63152Se0;
                            String[] strArr = {c63152Se0.A02};
                            HashSet A1H = AbstractC166987dD.A1H();
                            String[] stringArray = bundle2.getStringArray("PTT_UTIL_AUTH_AT_ALIASES");
                            if (stringArray != null) {
                                Collections.addAll(A1H, stringArray);
                            }
                            Collections.addAll(A1H, strArr);
                            bundle2.putStringArray("PTT_UTIL_AUTH_AT_ALIASES", (String[]) A1H.toArray(new String[0]));
                            AbstractC63243Sfx.A03("CREATE_PIN", bundle2);
                            bundle2.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", "reset_pin_screen_display");
                            ArrayList A1E = AbstractC166987dD.A1E();
                            String[] stringArray2 = bundle2.getStringArray("PTT_UTIL_CAP_NAMES");
                            if (stringArray2 != null) {
                                Collections.addAll(A1E, stringArray2);
                            }
                            A1E.remove("RESET_FBPAY_PIN");
                            bundle2.putStringArray("PTT_UTIL_CAP_NAMES", AbstractC58319PtB.A1b(A1E, 0));
                            AbstractC63062Sbj.A02(bundle2, "CREATE_FBPAY_PIN");
                            C63167SeR.A01(this.A02.A00, new C3AY(str, new Bundle(bundle2)));
                        }
                    } else {
                        str2 = "forget_pin_display";
                        if (bundle == null) {
                            return;
                        }
                        if (bundle.getBoolean("AUTH_FLOW_UTIL_PIN_LOCKED")) {
                            if (!A04.contains(AbstractC63243Sfx.A00(bundle2, 1))) {
                                bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_LOCKED", true);
                                str3 = "PIN_LOCKED";
                            } else {
                                Q8V q8v = this.A02;
                                runtimeException = new RuntimeException();
                                c2gs = q8v.A01;
                                C63167SeR.A01(c2gs, runtimeException);
                                return;
                            }
                        } else {
                            if (!bundle.getBoolean("AUTH_FLOW_UTIL_PIN_FORGOT")) {
                                return;
                            }
                            bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_FORGOT", true);
                            str3 = "FORGOT_PIN";
                        }
                        bundle2.putString(AnonymousClass001.A0b("AUTH_FLOW_UTIL_AUTH_FLOW", "#", 2), str3);
                        bundle2.putString(AnonymousClass001.A0b("AUTH_FLOW_UTIL_AUTH_STEP", "#", 2), "RECOVER_PIN");
                    }
                } else {
                    if (!A012.equalsIgnoreCase("RECOVER_PIN")) {
                        return;
                    }
                    AbstractC63243Sfx.A03("CREATE_PIN", bundle2);
                    bundle.getClass();
                    bundle2.putString("AUTH_FLOW_UTIL_PASSWORD_ENTERED", AbstractC31173DnH.A0j(bundle, "AUTH_FLOW_UTIL_PASSWORD_ENTERED"));
                }
            } else {
                c63152Se0.getClass();
                C2FP.A0D();
            }
            c2gs = this.A02.A02;
            runtimeException = new C3AY(c63152Se0, null);
            C63167SeR.A01(c2gs, runtimeException);
            return;
        }
        bundle2.putString("FBPAY_AUTH_STEP_SCREEN_DISPLAY_LOG", str2);
        C63167SeR.A01(this.A02.A00, new C3AY(str, new Bundle(bundle2)));
    }

    @Override // X.TmO
    public final void DHc(Throwable th) {
        throw AbstractC166987dD.A18(AbstractC111324zv.A00(1701));
    }

    static {
        HashSet A1H = AbstractC166987dD.A1H();
        A1H.add("CONNECT_FROM_CHECKOUT_PIN_VERIFICATION");
        A1H.add("CONNECT_FROM_CHECKOUT_CVV_VERIFICATION");
        A1H.add("CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION");
        A1H.add("CONNECT_FROM_HUB_PIN_VERIFICATION");
        A1H.add("CONNECT_FROM_HUB_CVV_VERIFICATION");
        A1H.add("CONNECT_FROM_HUB_PAYPAL_VERIFICATION");
        A04 = Collections.unmodifiableSet(A1H);
    }

    public C64186T2s(Bundle bundle, C58770Q8c c58770Q8c, Q8V q8v) {
        this.A02 = q8v;
        this.A03 = c58770Q8c;
        Bundle bundle2 = new Bundle(bundle);
        this.A01 = bundle2;
        if (!A04.contains(AbstractC63243Sfx.A00(bundle2, 1))) {
            C63406Sjd.A0B(q8v.A03.A01(), C63628Sqa.A00(this, 30));
        } else {
            bundle2.putBoolean("AUTH_FLOW_UTIL_PIN_FORGOT_VISIBLE", false);
            A00(this, new SBl("ACTIVE"));
        }
    }
}
