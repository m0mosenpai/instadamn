package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.HjZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39703HjZ {
    public List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39703HjZ)) {
            return false;
        }
        return AbstractC50102Ry.A00(this.A00, ((C39703HjZ) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }
}
