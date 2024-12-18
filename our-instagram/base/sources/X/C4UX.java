package X;

/* renamed from: X.4UX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UX {
    public static final C4UX A02 = new C4UX(1);
    public C126285nP A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A01 == ((C4UX) obj).A01;
        }
        return true;
    }

    public C4UX(int i) {
        this.A01 = i;
    }

    public final int hashCode() {
        return (((506447 + this.A01) * 31) + 1) * 31;
    }
}
