package X;

import com.instagram.common.gallery.Medium;

/* loaded from: classes4.dex */
public final class AC4 {
    public int A00;
    public final Medium A01;

    public AC4(Medium medium) {
        C14360o3.A0B(medium, 1);
        this.A01 = medium;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AC4)) {
            return this.A01.equals(((AC4) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }
}
