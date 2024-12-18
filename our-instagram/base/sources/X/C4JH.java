package X;

import java.util.Arrays;

/* renamed from: X.4JH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4JH {
    public final int A00;
    public final C71943Kr A01;
    public final String A02;

    public C4JH(C71943Kr c71943Kr, String str) {
        C14360o3.A0B(c71943Kr, 1);
        C14360o3.A0B(str, 2);
        this.A01 = c71943Kr;
        this.A02 = str;
        this.A00 = c71943Kr.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C4JH c4jh = (C4JH) obj;
            if (!C14360o3.A0K(this.A01, c4jh.A01) || !C14360o3.A0K(this.A02, c4jh.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02});
    }
}
