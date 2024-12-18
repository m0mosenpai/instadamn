package X;

import java.util.Arrays;

/* renamed from: X.FQs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34707FQs {
    public boolean A00;

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C34707FQs)) {
            return C2I7.A00(Boolean.valueOf(this.A00), Boolean.valueOf(((C34707FQs) obj).A00));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A00)});
    }
}
