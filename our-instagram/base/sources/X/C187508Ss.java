package X;

/* renamed from: X.8Ss, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C187508Ss extends AbstractC187378Sf {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C187508Ss) && this.A00 == ((C187508Ss) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0L("Reorder(isDragged=", ')', this.A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C187508Ss(boolean z) {
        this.A00 = z;
    }
}
