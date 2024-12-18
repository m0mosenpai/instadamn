package X;

/* renamed from: X.5DS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5DS {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C5DS) || i != ((C5DS) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        if (this.A00 == 1) {
            return "Touch";
        }
        return "Keyboard";
    }
}
