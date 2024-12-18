package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.3xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88763xc {
    public final Context A00;
    public final String A01;

    public final void A00(C0CA c0ca) {
        String str;
        C0CA.A00(c0ca, this.A01, "tier");
        C0CA.A00(c0ca, Double.valueOf(AbstractC39811t5.A00(System.currentTimeMillis())), "sent_time");
        Context context = this.A00;
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            networkOperatorName = "n/a";
        }
        C0CA.A00(c0ca, networkOperatorName, "carrier");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            str = activeNetworkInfo.getTypeName();
        } else {
            str = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        C0CA.A00(c0ca, str, "conn");
    }

    public C88763xc(Context context, String str) {
        this.A00 = context.getApplicationContext();
        this.A01 = str;
    }
}
