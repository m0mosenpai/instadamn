package X;

import android.util.Pair;

/* renamed from: X.3ZN, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3ZN implements InterfaceC41211vV {
    public final Pair A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof C3ZN)) {
            return false;
        }
        return ((C3ZN) obj).A00.equals(this.A00);
    }

    public int hashCode() {
        return 527 + this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C3ZN(Pair pair, Integer num) {
        this.A00 = pair;
        this.A01 = num;
    }
}
