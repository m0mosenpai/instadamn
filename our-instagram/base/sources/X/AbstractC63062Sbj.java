package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Sbj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63062Sbj {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        if ("FB_ACCESS_TOKEN".equalsIgnoreCase(X.AbstractC31173DnH.A0j(r6, "AUTH_METHOD_TYPE")) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
    
        throw X.AbstractC166987dD.A12("Not supported operation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if ("RECOVER_PIN".equalsIgnoreCase(X.AbstractC63243Sfx.A01(r6, 1)) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000f, code lost:
    
        if ("PIN".equalsIgnoreCase(X.AbstractC31173DnH.A0j(r6, "AUTH_METHOD_TYPE")) == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(android.os.Bundle r6) {
        /*
            if (r6 == 0) goto L11
            java.lang.String r0 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.AbstractC31173DnH.A0j(r6, r0)
            java.lang.String r0 = "PIN"
            boolean r1 = r0.equalsIgnoreCase(r1)
            r0 = 1
            if (r1 != 0) goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r5 = "VERIFY_FACTOR"
            if (r0 != 0) goto L26
            if (r6 == 0) goto L7a
            java.lang.String r0 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.AbstractC31173DnH.A0j(r6, r0)
            java.lang.String r0 = "BIO_OR_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L7a
        L26:
            r0 = 2
            java.lang.String r0 = X.AbstractC63243Sfx.A01(r6, r0)
            r4 = 1
            java.lang.String r3 = X.AbstractC63243Sfx.A01(r6, r4)
            java.lang.String r1 = "CONFIRM_PIN"
            boolean r0 = r1.equalsIgnoreCase(r0)
            java.lang.String r2 = "RESET_FBPAY_PIN"
            if (r0 != 0) goto L59
            boolean r0 = r1.equalsIgnoreCase(r3)
            if (r0 != 0) goto L59
            java.lang.String r1 = X.AbstractC63243Sfx.A01(r6, r4)
            java.lang.String r0 = "VERIFY_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Laf
            java.lang.String r1 = X.AbstractC63243Sfx.A01(r6, r4)
            java.lang.String r0 = "RECOVER_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lb0
        L58:
            return r2
        L59:
            java.lang.String r1 = X.AbstractC63243Sfx.A00(r6, r4)
            java.lang.String r0 = "CHANGE_PIN_USING_OLD_PIN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L77
            if (r6 == 0) goto L58
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_LOCKED"
            boolean r0 = r6.getBoolean(r0)
            if (r0 != 0) goto L77
            java.lang.String r0 = "AUTH_FLOW_UTIL_PIN_FORGOT"
            boolean r0 = r6.getBoolean(r0)
            if (r0 == 0) goto L58
        L77:
            java.lang.String r2 = "CREATE_FBPAY_PIN"
            return r2
        L7a:
            r6.getClass()
            java.lang.String r2 = "AUTH_METHOD_TYPE"
            java.lang.String r1 = X.AbstractC31173DnH.A0j(r6, r2)
            java.lang.String r0 = "CSC"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Laf
            java.lang.String r1 = X.AbstractC31173DnH.A0j(r6, r2)
            java.lang.String r0 = "PAYPAL_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Laf
            java.lang.String r1 = X.AbstractC31173DnH.A0j(r6, r2)
            java.lang.String r0 = "IG_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto Laf
            java.lang.String r1 = X.AbstractC31173DnH.A0j(r6, r2)
            java.lang.String r0 = "FB_ACCESS_TOKEN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto Lb0
        Laf:
            return r5
        Lb0:
            java.lang.String r0 = "Not supported operation"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63062Sbj.A00(android.os.Bundle):java.lang.String");
    }

    public static List A01(Bundle bundle) {
        ArrayList A1E = AbstractC166987dD.A1E();
        String[] stringArray = bundle.getStringArray("PTT_UTIL_CAP_NAMES");
        if (stringArray != null) {
            Collections.addAll(A1E, stringArray);
        }
        return Collections.unmodifiableList(A1E);
    }

    public static void A02(Bundle bundle, String... strArr) {
        HashSet A1H = AbstractC166987dD.A1H();
        String[] stringArray = bundle.getStringArray("PTT_UTIL_CAP_NAMES");
        if (stringArray != null) {
            Collections.addAll(A1H, stringArray);
        }
        Collections.addAll(A1H, strArr);
        bundle.putStringArray("PTT_UTIL_CAP_NAMES", (String[]) A1H.toArray(new String[0]));
    }
}
