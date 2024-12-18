package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FR0 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            FR0 fr0 = (FR0) obj;
            if (!C14360o3.A0K(this.A00, fr0.A00) || !C14360o3.A0K(this.A01, fr0.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public FR0(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
