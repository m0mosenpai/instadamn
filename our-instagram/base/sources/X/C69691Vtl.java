package X;

import java.util.Arrays;

/* renamed from: X.Vtl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69691Vtl {
    public static C69691Vtl A02;
    public final C1P1 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            return C14360o3.A0K(this.A01, ((C69691Vtl) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01});
    }

    public C69691Vtl(C1P1 c1p1, String str) {
        this.A01 = str;
        this.A00 = c1p1;
    }
}
