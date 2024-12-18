package X;

import android.os.Bundle;

/* loaded from: classes6.dex */
public abstract class FVT {
    public static Bundle A00(AbstractC12990ll abstractC12990ll, Integer num, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("GDPR.Fragment.EntryPoint", str);
        bundle.putString("GDPR.Fragment.UserState", A01(num));
        bundle.putBoolean("GDPR.Fragment.Entrance.Enabled", z);
        AbstractC03240Dh.A00(bundle, abstractC12990ll);
        return bundle;
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "existing";
            case 2:
                return "unknown";
            default:
                return "new";
        }
    }
}
