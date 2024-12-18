package X;

/* renamed from: X.MhB, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51057MhB extends O1E {
    public static final C51057MhB A00 = new O1E(true);
    public static final C51057MhB A01 = new O1E(false);

    public final boolean equals(Object obj) {
        if ((obj instanceof C51057MhB) && this.A00 == ((O1E) obj).A00) {
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
        return AnonymousClass001.A0L("NotLoading(endOfPaginationReached=", ')', this.A00);
    }
}
