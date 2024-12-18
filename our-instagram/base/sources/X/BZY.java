package X;

import androidx.compose.foundation.layout.WindowInsets;

/* loaded from: classes5.dex */
public final class BZY extends AbstractC28841CoB {
    public final WindowInsets A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BZY)) {
            return false;
        }
        return C14360o3.A0K(((BZY) obj).A00, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BZY(WindowInsets windowInsets) {
        this.A00 = windowInsets;
    }
}
