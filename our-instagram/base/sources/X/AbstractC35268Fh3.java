package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.Fh3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35268Fh3 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Ml, java.lang.Object] */
    public static final Intent A00(Context context, Bundle bundle, String str, String str2) {
        C14360o3.A0B(context, 0);
        Intent className = AbstractC31171DnF.A04().setClassName(context, str);
        C14360o3.A07(className);
        if (bundle != null) {
            className.putExtras(bundle);
        }
        return className.putExtra(AbstractC58317Pt9.A00(304), str2).putExtra("key_sanitized_uri", new Object().ELW(str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Intent A01(Context context, Integer num, String str, String str2, char[] cArr, int i) {
        String substring;
        C14360o3.A0B(context, 0);
        int i2 = i + 1;
        int length = cArr.length;
        if (i2 < length && cArr[i] == '/' && cArr[i2] == '?') {
            i2 = i + 2;
        } else if (i >= length || cArr[i] != '?') {
            i2 = -1;
        }
        int i3 = 0;
        Object obj = false;
        if (i2 >= 0) {
            int i4 = length - i2;
            String A0i = AbstractC31171DnF.A0i(cArr, i2, i4);
            Bundle bundle = 0;
            boolean z = false;
            while (true) {
                if (i3 < i4) {
                    int A04 = AbstractC001900j.A04(A0i, '=', i3);
                    if (A04 < 0) {
                        break;
                    }
                    String A0w = AbstractC25227BEk.A0w(A0i, i3, A04);
                    int A042 = AbstractC001900j.A04(A0i, '&', A04);
                    int i5 = A04 + 1;
                    if (A042 > 0) {
                        substring = AbstractC25227BEk.A0w(A0i, i5, A042);
                        i3 = A042 + 1;
                    } else {
                        substring = A0i.substring(i5);
                        C14360o3.A07(substring);
                        i3 = A0i.length();
                    }
                    Bundle A05 = A05(A0w, substring, bundle);
                    if (A05 != null) {
                        bundle = A05;
                    } else {
                        z = true;
                    }
                } else if (!z || num.intValue() == 2) {
                    obj = bundle;
                }
            }
        }
        if (obj.equals(obj)) {
            return null;
        }
        return A00(context, null, str, str2);
    }

    public static final Boolean A06(String str) {
        if (str == null) {
            return null;
        }
        boolean z = true;
        if (!str.equalsIgnoreCase("true") && !str.equals(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
            if (!str.equalsIgnoreCase("false") && !str.equals("0")) {
                return null;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final void A07(Bundle bundle, String str, char[] cArr, int i, int i2) {
        bundle.putString(str, AbstractC31171DnF.A0i(cArr, i, i2 - i));
    }

    public static final boolean A08(String str, char[] cArr, int i) {
        int length = cArr.length;
        int length2 = str.length();
        if (length > i) {
            int i2 = 0;
            while (i < length && i2 < length2) {
                if (cArr[i] == str.charAt(i2)) {
                    i++;
                    i2++;
                }
            }
            if (length2 > i2) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final int[] A09(Bundle bundle, String str, char[] cArr, int i) {
        int length = cArr.length;
        for (int i2 = i; length > i2; i2++) {
            char c = cArr[i2];
            if (c == '/' || c == '?') {
                if (i2 == -1) {
                    return null;
                }
                bundle.putString(str, AbstractC31171DnF.A0i(cArr, i, i2 - i));
                return new int[]{i2, 3};
            }
        }
        bundle.putString(str, AbstractC31171DnF.A0i(cArr, i, i2 - i));
        return new int[]{i2, 3};
    }

    public static final Intent A02(Context context, String str, String str2, char[] cArr, int i) {
        return A01(context, C05F.A0C, str, str2, cArr, i);
    }

    public static final Intent A03(Context context, String str, String str2, char[] cArr, int i) {
        return A01(context, C05F.A01, str, str2, cArr, i);
    }

    public static final Intent A04(Context context, String str, String str2, char[] cArr, int i) {
        return A01(context, C05F.A00, str, str2, cArr, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Bundle A05(java.lang.String r1, java.lang.String r2, android.os.Bundle r3) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1483898950: goto Lf;
                case -983972142: goto Lc;
                case 2931858: goto L18;
                case 3151469: goto L9;
                default: goto L7;
            }
        L7:
            r3 = 0
            return r3
        L9:
            java.lang.String r0 = "fref"
            goto L11
        Lc:
            java.lang.String r0 = "pn_ref"
            goto L11
        Lf:
            java.lang.String r0 = "__tn__"
        L11:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L20
            goto L7
        L18:
            java.lang.String r0 = "_ft_"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
        L20:
            if (r3 != 0) goto L26
            android.os.Bundle r3 = X.AbstractC31174DnI.A0C()
        L26:
            r3.putString(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35268Fh3.A05(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }
}
