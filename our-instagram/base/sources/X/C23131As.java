package X;

import java.util.Arrays;

/* renamed from: X.1As, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23131As {
    public static final C23131As A02 = new C23131As(null, null);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C14360o3.A0K(getClass(), obj.getClass())) {
                return false;
            }
            C23131As c23131As = (C23131As) obj;
            if (!C14360o3.A0K(this.A01, c23131As.A01) || !C14360o3.A0K(this.A00, c23131As.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public C23131As(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
