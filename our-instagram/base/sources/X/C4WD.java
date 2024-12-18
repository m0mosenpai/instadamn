package X;

/* renamed from: X.4WD, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WD {
    public static final C4WD A01 = new C4WD(false);
    public final boolean A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C4WD) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        return !this.A00 ? 1 : 0;
    }

    public C4WD(boolean z) {
        this.A00 = z;
    }
}
