package X;

import java.util.Arrays;

/* renamed from: X.2E4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2E4 {
    public int A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2E4)) {
                return false;
            }
            C2E4 c2e4 = (C2E4) obj;
            if (this.A00 != c2e4.A00 || C2E1.A00.A02.compare(this.A01, c2e4.A01) != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public C2E4(int i, String str) {
        Object obj;
        if (!str.equals("MAXCURSOR")) {
            obj = str.equals("MINCURSOR") ? C2E1.A00.A01 : obj;
            this.A01 = str;
            this.A00 = i;
        }
        obj = C2E1.A00.A00;
        str = (String) obj;
        this.A01 = str;
        this.A00 = i;
    }

    public final String toString() {
        JSR A00 = JSS.A00(this);
        A00.A02("mTimestampSecs", this.A00);
        A00.A01(this.A01, "mThreadV2Id");
        return A00.toString();
    }

    public C2E4() {
    }
}
