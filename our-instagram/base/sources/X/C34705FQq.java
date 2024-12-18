package X;

import java.util.List;

/* renamed from: X.FQq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34705FQq {
    public List A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C34705FQq) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
