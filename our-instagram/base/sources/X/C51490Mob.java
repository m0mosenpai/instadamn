package X;

/* renamed from: X.Mob, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51490Mob extends AbstractC53425NkE {
    public final String A00;
    public final boolean A01;

    public C51490Mob(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51490Mob) {
                C51490Mob c51490Mob = (C51490Mob) obj;
                if (!C14360o3.A0K(this.A00, c51490Mob.A00) || this.A01 != c51490Mob.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
