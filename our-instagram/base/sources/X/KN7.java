package X;

import com.instagram.common.gallery.Medium;

/* loaded from: classes8.dex */
public final class KN7 extends AbstractC47286Kux {
    public final Medium A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KN7) && C14360o3.A0K(this.A00, ((KN7) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KN7(Medium medium) {
        super(medium);
        this.A00 = medium;
    }
}
