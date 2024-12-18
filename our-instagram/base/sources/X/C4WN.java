package X;

/* renamed from: X.4WN, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WN {
    public static final C4WN A01 = new C4WN(new C4WM().A00());
    public final C4WO A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4WN)) {
            return false;
        }
        return this.A00.equals(((C4WN) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C4WN(C4WO c4wo) {
        this.A00 = c4wo;
    }
}
