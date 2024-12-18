package X;

import java.util.Comparator;

/* renamed from: X.SZc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62959SZc {
    public static Comparator A02 = new TSE(2);
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C62959SZc c62959SZc = (C62959SZc) obj;
        return this.A00 == c62959SZc.A00 && this.A01 == c62959SZc.A01;
    }

    public final String toString() {
        return AnonymousClass001.A0n("[", ", ", "]", this.A01, this.A00);
    }

    public C62959SZc(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }
}
