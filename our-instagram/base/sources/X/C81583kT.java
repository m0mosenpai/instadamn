package X;

import java.util.Arrays;

/* renamed from: X.3kT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81583kT {
    public int A00;
    public String A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81583kT)) {
            return false;
        }
        C81583kT c81583kT = (C81583kT) obj;
        return this.A00 == c81583kT.A00 && this.A01.equals(c81583kT.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public final String toString() {
        return AnonymousClass001.A05(this.A00, "type:", "\ntext:", this.A01);
    }
}
