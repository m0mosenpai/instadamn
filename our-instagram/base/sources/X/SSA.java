package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public abstract class SSA {
    public static HashMap A00(Bundle bundle) {
        String str;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("logger_data", AbstractC58319PtB.A0W(bundle));
        if (bundle != null) {
            str = bundle.getString("CREDENTIAL_ID");
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            A1G.put("FBPAY_AUTH_CREDENTIAL_ID", str);
        }
        Parcelable parcelable = bundle.getParcelable("logging_context");
        if (parcelable != null) {
            A1G.put("logging_context", parcelable);
        }
        Bundle bundle2 = bundle.getBundle("AUTH_LOGGING_EXTRA_KEY");
        if (bundle2 != null) {
            HashMap A1G2 = AbstractC166987dD.A1G();
            Iterator A14 = AbstractC58319PtB.A14(bundle2);
            while (A14.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A14);
                A1G2.put(A1B, bundle2.getString(A1B));
            }
            A1G.put("AUTH_LOGGING_EXTRA_KEY", A1G2);
        }
        return A1G;
    }

    public static Map A01(Bundle bundle) {
        return Collections.unmodifiableMap(A00(bundle));
    }
}
