package X;

import android.content.Intent;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public abstract class FWK {
    public static final String A00(Integer num) {
        String str;
        if (1 - num.intValue() != 0) {
            str = "REG_FLOW";
        } else {
            str = "NUX_FLOW";
        }
        return AbstractC167007dF.A0h(str);
    }

    public static void A01(Intent intent, Parcelable parcelable, Integer num, String str, int i) {
        intent.putExtra("argument_flow", A00(num));
        intent.putExtra("argument_requested_code", i);
        intent.putExtra("argument_access_token", str);
        intent.putExtra("argument_content", parcelable);
    }
}
