package X;

import java.util.List;

/* renamed from: X.4PX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PX {
    public final List A00;

    public C4PX(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14360o3.A0K(getClass(), obj.getClass())) {
            return C14360o3.A0K(this.A00, ((C4PX) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC001800i.A0P(", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", this.A00, null);
    }
}
