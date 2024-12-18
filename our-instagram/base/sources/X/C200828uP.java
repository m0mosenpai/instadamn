package X;

import java.util.Arrays;

/* renamed from: X.8uP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200828uP {
    public String A00;
    public String A01;
    public String[] A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C200828uP)) {
            return false;
        }
        C200828uP c200828uP = (C200828uP) obj;
        String str = this.A00;
        String str2 = c200828uP.A00;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!Arrays.deepEquals(this.A02, c200828uP.A02)) {
            return false;
        }
        String str3 = this.A01;
        String str4 = c200828uP.A01;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.A02, this.A00, this.A01});
    }

    public C200828uP(String str, String str2, String[] strArr) {
        this.A00 = str;
        this.A02 = strArr;
        this.A01 = str2;
    }
}
