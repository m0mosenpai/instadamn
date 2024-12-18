package X;

import android.os.Bundle;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FRQ {
    public final C32267EJc A01(Bundle bundle, Integer num, Integer num2, String str, boolean z) {
        C14360o3.A0B(str, 1);
        bundle.putString("phone_number_or_email", str);
        if (num != null) {
            bundle.putString("two_fac_method", AbstractC34233F8f.A00(num));
        }
        bundle.putBoolean("two_fac_should_fetch_code", z);
        bundle.putString("two_fac_confirm_code_source", AbstractC34232F8e.A00(num2));
        C32267EJc c32267EJc = new C32267EJc();
        c32267EJc.setArguments(bundle);
        return c32267EJc;
    }

    public final EL6 A00(ArrayList arrayList, boolean z) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("arg_should_check_email", z);
        if (arrayList != null) {
            A0b.putStringArrayList("arg_backup_codes", arrayList);
        } else {
            A0b.putBoolean(AbstractC31180DnO.A0Z(), true);
        }
        EL6 el6 = new EL6();
        el6.setArguments(A0b);
        return el6;
    }

    public final EJU A02(Integer num, boolean z, boolean z2) {
        String str;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("skip_landing_screen", z);
        A0b.putBoolean("direct_launch_backup_codes", z2);
        switch (num.intValue()) {
            case 0:
                str = "qp";
                break;
            case 1:
                str = "megaphone";
                break;
            case 2:
                str = "setting";
                break;
            case 3:
                str = "url";
                break;
            case 4:
                str = "bloks_extension";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE;
                break;
        }
        AbstractC31171DnF.A13(A0b, str);
        EJU eju = new EJU();
        eju.setArguments(A0b);
        return eju;
    }
}
