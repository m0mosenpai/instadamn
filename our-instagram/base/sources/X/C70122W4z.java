package X;

import java.util.Arrays;

/* renamed from: X.W4z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70122W4z {
    public static final C70122W4z A02 = new C70122W4z(null, null);
    public final C1P1 A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2I7.A00(this.A01, ((C70122W4z) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01});
    }

    public C70122W4z(C1P1 c1p1, String str) {
        this.A01 = str;
        this.A00 = c1p1;
    }
}
