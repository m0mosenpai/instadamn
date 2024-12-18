package X;

import java.util.Arrays;

/* renamed from: X.8yT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203118yT {
    public String A00;
    public String A01;
    public String A02;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C203118yT)) {
            return false;
        }
        C203118yT c203118yT = (C203118yT) obj;
        if (!this.A02.equals(c203118yT.A02)) {
            return false;
        }
        String str = this.A00;
        String str2 = c203118yT.A00;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this.A01;
        String str4 = c203118yT.A01;
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

    public C203118yT(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public C203118yT() {
        this.A02 = "";
        this.A00 = "";
        this.A01 = "";
    }
}
