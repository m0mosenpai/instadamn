package X;

/* renamed from: X.MyX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51989MyX extends O1U {
    public final boolean A00;

    public C51989MyX(boolean z) {
        super(true);
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51989MyX) && this.A00 == ((C51989MyX) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0L("Answered(withVideo=", ')', this.A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }
}
