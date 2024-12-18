package X;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.0B5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0B5 implements Serializable {
    public String A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0B5)) {
            return false;
        }
        return this.A00.equals(((C0B5) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public C0B5(String str) {
        if (str.length() == 43) {
            this.A00 = str;
            return;
        }
        throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
    }
}
