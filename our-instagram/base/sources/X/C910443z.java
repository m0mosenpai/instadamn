package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.43z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C910443z {
    public List A00;
    public List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C910443z c910443z = (C910443z) obj;
            if (!this.A01.equals(c910443z.A01) || !this.A00.equals(c910443z.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
