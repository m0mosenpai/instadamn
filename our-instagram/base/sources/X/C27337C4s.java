package X;

/* renamed from: X.C4s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27337C4s extends CA6 {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27337C4s) && this.A00 == ((C27337C4s) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0L("Accepted(didClickAccept=", ')', this.A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C27337C4s(boolean z) {
        this.A00 = z;
    }

    public C27337C4s() {
        this(false);
    }
}
