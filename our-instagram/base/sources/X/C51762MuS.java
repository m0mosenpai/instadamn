package X;

/* renamed from: X.MuS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51762MuS extends C0T6 implements InterfaceC57796PkO {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51762MuS) && this.A00 == ((C51762MuS) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0L("Ended(connectionDropped=", ')', this.A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C51762MuS(boolean z) {
        this.A00 = z;
    }
}
