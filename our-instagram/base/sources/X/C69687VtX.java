package X;

import java.util.Arrays;

/* renamed from: X.VtX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69687VtX {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !AbstractC167017dG.A1Z(this, obj)) {
                return false;
            }
            C69687VtX c69687VtX = (C69687VtX) obj;
            if (this.A00 != c69687VtX.A00 || !C14360o3.A0K(this.A01, c69687VtX.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Z(this.A01, this.A00));
    }

    public C69687VtX(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
