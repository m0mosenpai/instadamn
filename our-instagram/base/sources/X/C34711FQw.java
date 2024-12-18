package X;

import java.util.Arrays;

/* renamed from: X.FQw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34711FQw {
    public String A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34711FQw)) {
            return false;
        }
        C34711FQw c34711FQw = (C34711FQw) obj;
        return C14360o3.A0K(this.A01, c34711FQw.A01) && C14360o3.A0K(this.A00, c34711FQw.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
