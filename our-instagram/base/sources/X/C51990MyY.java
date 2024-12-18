package X;

/* renamed from: X.MyY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51990MyY extends O1U {
    public final boolean A00;

    public C51990MyY(boolean z) {
        super(true);
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51990MyY) && this.A00 == ((C51990MyY) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0L("Ended(wasDeclined=", ')', this.A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }
}
