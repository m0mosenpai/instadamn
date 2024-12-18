package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;

/* renamed from: X.1AN, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1AN {
    public static MobileConfigValueSource A00(int i) {
        char c = 0;
        char c2 = 0;
        if ((i & 16) != 0) {
            c2 = 2;
        }
        if ((i & 1) != 0) {
            c = 1;
        }
        int i2 = c2 | c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C0K8.A0C("MobileConfigTableUtil", "should never reach default case in getValueSource");
                        return MobileConfigValueSource.UNKNOWN;
                    }
                    return MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE;
                }
                return MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL_EMPTY_UNIT_ID;
            }
            return MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL;
        }
        return MobileConfigValueSource.SERVER;
    }
}
