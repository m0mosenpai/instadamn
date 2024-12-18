package X;

/* renamed from: X.Xp7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72851Xp7 {
    public final Object A04;
    public final int A00 = -1;
    public final int A01 = -1;
    public final long A03 = -1;
    public final int A02 = -1;

    public C72851Xp7(Object obj) {
        this.A04 = obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C72851Xp7) && this.A04.equals(((C72851Xp7) obj).A04);
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC72049XLp.A02(this.A04) - 1) * 31) - 1) * 31) - 1) * 31) - 1;
    }
}
