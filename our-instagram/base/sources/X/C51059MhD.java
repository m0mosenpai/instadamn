package X;

/* renamed from: X.MhD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51059MhD extends O1E {
    public static final C51059MhD A00 = new O1E(false);

    public C51059MhD() {
        super(false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C51059MhD) && this.A00 == ((O1E) obj).A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public final String toString() {
        return AnonymousClass001.A0L("Loading(endOfPaginationReached=", ')', this.A00);
    }
}
