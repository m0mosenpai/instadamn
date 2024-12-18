package X;

import java.util.Arrays;

/* renamed from: X.Dw4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31699Dw4 {
    public String A01 = "";
    public int A00 = -16777216;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C31699Dw4)) {
            return false;
        }
        C31699Dw4 c31699Dw4 = (C31699Dw4) obj;
        return C2I7.A00(this.A01, c31699Dw4.A01) && C2I7.A00(Integer.valueOf(this.A00), Integer.valueOf(c31699Dw4.A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(AbstractC25228BEl.A1Z(this.A01, this.A00));
    }
}
