package X;

import android.os.Bundle;

/* renamed from: X.Sfx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63243Sfx {
    public static String A00(Bundle bundle, int i) {
        return bundle.getString(AnonymousClass001.A0b("AUTH_FLOW_UTIL_AUTH_FLOW", "#", i));
    }

    public static String A01(Bundle bundle, int i) {
        return bundle.getString(AnonymousClass001.A0b("AUTH_FLOW_UTIL_AUTH_STEP", "#", i));
    }

    public static void A02(String str, Bundle bundle) {
        AbstractC58322PtE.A18(bundle, "AUTH_FLOW_UTIL_AUTH_FLOW", str, 1);
    }

    public static void A03(String str, Bundle bundle) {
        AbstractC58322PtE.A18(bundle, "AUTH_FLOW_UTIL_AUTH_STEP", str, 1);
    }
}
