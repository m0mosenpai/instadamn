package X;

/* renamed from: X.5ER, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ER implements C5ES {
    public final int A00;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.A00 != ((C5ER) obj).A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass001.A0I("AndroidPointerIcon(type=", ')', this.A00);
    }

    public C5ER(int i) {
        this.A00 = i;
    }
}
