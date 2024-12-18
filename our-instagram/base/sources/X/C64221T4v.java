package X;

/* renamed from: X.T4v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64221T4v implements C61X {
    public static final C64221T4v A01 = new C64221T4v(null);
    public final String A00;

    public /* synthetic */ C64221T4v(String str) {
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C64221T4v)) {
            return false;
        }
        return SSI.A01(this.A00, ((C64221T4v) obj).A00);
    }

    public final int hashCode() {
        return AbstractC58322PtE.A08(this.A00);
    }
}
