package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.0y2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19740y2 {
    public final InterfaceC19630xq A00;

    public final void A02(String str) {
        InterfaceC19610xo ARD;
        String str2;
        C14360o3.A0B(str, 0);
        switch (str.hashCode()) {
            case -1921431796:
                if (!str.equals("android.permission.READ_CALL_LOG")) {
                    return;
                }
                ARD = this.A00.ARD();
                str2 = "preference_read_call_log_permission_requested";
                break;
            case -1674700861:
                if (!str.equals("android.permission.ANSWER_PHONE_CALLS")) {
                    return;
                }
                ARD = this.A00.ARD();
                str2 = "preference_answer_phone_calls_permission_requested";
                break;
            case -5573545:
                if (!str.equals("android.permission.READ_PHONE_STATE")) {
                    return;
                }
                ARD = this.A00.ARD();
                str2 = "preference_read_phone_state_permission_requested";
                break;
            case 112197485:
                if (!str.equals("android.permission.CALL_PHONE")) {
                    return;
                }
                ARD = this.A00.ARD();
                str2 = "preference_call_phone_permission_requested";
                break;
            default:
                return;
        }
        ARD.E77(str2, true);
        ARD.apply();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean A05(String str) {
        InterfaceC19630xq interfaceC19630xq;
        String str2;
        C14360o3.A0B(str, 0);
        switch (str.hashCode()) {
            case -1921431796:
                if (str.equals("android.permission.READ_CALL_LOG")) {
                    interfaceC19630xq = this.A00;
                    str2 = "preference_read_call_log_permission_requested";
                    break;
                }
                return false;
            case -1674700861:
                if (str.equals("android.permission.ANSWER_PHONE_CALLS")) {
                    interfaceC19630xq = this.A00;
                    str2 = "preference_answer_phone_calls_permission_requested";
                    break;
                }
                return false;
            case -5573545:
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    interfaceC19630xq = this.A00;
                    str2 = "preference_read_phone_state_permission_requested";
                    break;
                }
                return false;
            case 112197485:
                if (str.equals("android.permission.CALL_PHONE")) {
                    interfaceC19630xq = this.A00;
                    str2 = "preference_call_phone_permission_requested";
                    break;
                }
                return false;
            default:
                return false;
        }
        return interfaceC19630xq.getBoolean(str2, false);
    }

    public final int A00() {
        return this.A00.getInt("dark_mode_toggle_setting", -1);
    }

    public final void A01(int i) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7D("preference_push_permission_impression_count", i);
        ARD.apply();
    }

    public final void A03(boolean z) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77("preference_has_asked_push_permission_recently_in_nux", z);
        ARD.apply();
    }

    public final void A04(boolean z) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77("preference_in_push_permission_cooldown", z);
        ARD.apply();
    }

    public C19740y2(Context context) {
        InterfaceC19630xq c17320tT;
        if (EndToEnd.isRunningEndToEndTest()) {
            c17320tT = AbstractC19720y0.A00(context);
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            C14360o3.A07(defaultSharedPreferences);
            c17320tT = new C17320tT(defaultSharedPreferences, "Preferences");
        }
        this.A00 = c17320tT;
    }
}
