package X;

import java.util.Arrays;

/* renamed from: X.Vtf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69689Vtf {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C69689Vtf c69689Vtf = (C69689Vtf) obj;
            if (this.A00 != c69689Vtf.A00 || !C14360o3.A0K(this.A01, c69689Vtf.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public C69689Vtf(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
