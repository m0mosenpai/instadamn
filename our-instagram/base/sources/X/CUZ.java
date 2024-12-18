package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class CUZ {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof CUZ) && C14360o3.A0K(this.A00, ((CUZ) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, false, getClass()});
    }

    public CUZ(String str) {
        this.A00 = str;
    }
}
