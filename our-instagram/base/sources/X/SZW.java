package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes10.dex */
public final class SZW {
    public static final Queue A01 = new ArrayDeque(0);
    public Object A00;

    public final boolean equals(Object obj) {
        if (!(obj instanceof SZW)) {
            return false;
        }
        return AbstractC58320PtC.A1X(this.A00, ((SZW) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
