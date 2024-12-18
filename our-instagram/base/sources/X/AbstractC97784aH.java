package X;

import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: X.4aH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97784aH {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A00(java.lang.String r4, boolean r5) {
        /*
            java.lang.String r3 = "N/A"
            if (r4 == 0) goto L3d
            int r0 = r4.hashCode()
            switch(r0) {
                case -456963117: goto L32;
                case 124730804: goto L27;
                case 246781959: goto L1c;
                default: goto Lb;
            }
        Lb:
            r0 = r3
        Lc:
            if (r5 == 0) goto L10
            java.lang.String r0 = "HardwareDecoder"
        L10:
            java.lang.String r2 = "AV1 decoding using "
            java.lang.String r1 = ";"
            if (r4 != 0) goto L17
            r4 = r3
        L17:
            java.lang.String r0 = X.AnonymousClass001.A0u(r2, r0, r1, r4)
            return r0
        L1c:
            java.lang.String r0 = "meta.dav1d.av1.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "Dav1d"
            goto L10
        L27:
            java.lang.String r0 = "c2.android.av1.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "LibGav1"
            goto L10
        L32:
            java.lang.String r0 = "c2.android.av1-dav1d.decoder"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "PlatformDav1d"
            goto L10
        L3d:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC97784aH.A00(java.lang.String, boolean):java.lang.String");
    }

    public static boolean A01(HashMap hashMap, boolean z) {
        if (z) {
            try {
                List<C2IG> A05 = C46762Co.A05("video/av01", false, false);
                if (A05 != null) {
                    for (C2IG c2ig : A05) {
                        if (c2ig != null) {
                            String str = c2ig.A03;
                            if (!c2ig.A07 && c2ig.A05) {
                                if (!hashMap.isEmpty()) {
                                    String lowerCase = str.toLowerCase(Locale.ROOT);
                                    if (hashMap.containsKey(lowerCase)) {
                                        int intValue = ((Number) hashMap.get(lowerCase)).intValue();
                                        if (intValue != -1 && Build.VERSION.SDK_INT >= intValue) {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                } else {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return false;
            } catch (C40J e) {
                AbstractC459729h.A02("AV1Helper", "Failed to query AV1 decoders on device with exception %s.", e.getMessage());
                return false;
            }
        }
        return false;
    }
}
