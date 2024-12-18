package X;

/* loaded from: classes11.dex */
public final class WUG implements X7L {
    public final String A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (!this.A01) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC167017dG.A1Z(this, obj)) {
            return C14360o3.A0K(this.A00, ((WUG) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        if (!this.A01) {
            return super.hashCode();
        }
        return this.A00.hashCode();
    }

    public WUG(int i, boolean z) {
        this.A01 = z;
        this.A00 = AnonymousClass001.A0O("anim://", i);
    }
}
