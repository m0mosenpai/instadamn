package X;

/* renamed from: X.Xp3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72847Xp3 {
    public C72845Xow A00 = new C72845Xow();
    public boolean A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A02.equals(((C72847Xp3) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public C72847Xp3(Object obj) {
        this.A02 = obj;
    }
}
