package X;

import android.graphics.Path;

/* renamed from: X.9l6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218349l6 extends AbstractC223759uK {
    public final int A00;
    public final Path A01;
    public final C8OK A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C218349l6) {
                C218349l6 c218349l6 = (C218349l6) obj;
                if (this.A00 != c218349l6.A00 || this.A02 != c218349l6.A02 || !C14360o3.A0K(this.A01, c218349l6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C218349l6(Path path, C8OK c8ok, int i) {
        this.A00 = i;
        this.A02 = c8ok;
        this.A01 = path;
    }
}
