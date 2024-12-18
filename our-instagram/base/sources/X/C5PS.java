package X;

/* renamed from: X.5PS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PS {
    public C4WM A00 = new C4WM();
    public boolean A01;
    public boolean A02;
    public final Object A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A03.equals(((C5PS) obj).A03);
        }
        return false;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public C5PS(Object obj) {
        this.A03 = obj;
    }
}
