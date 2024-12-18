package X;

import java.util.List;

/* renamed from: X.FQr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34706FQr {
    public List A00 = AbstractC166987dD.A1E();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C34706FQr) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
