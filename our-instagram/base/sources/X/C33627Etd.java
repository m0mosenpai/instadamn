package X;

import java.util.Arrays;

/* renamed from: X.Etd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33627Etd {
    public FR9 A00;
    public C33628Ete A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C33627Etd c33627Etd = (C33627Etd) obj;
            if (!C2I7.A00(this.A00, c33627Etd.A00) || !C2I7.A00(this.A01, c33627Etd.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }
}
