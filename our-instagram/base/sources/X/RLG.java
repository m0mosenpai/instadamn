package X;

/* loaded from: classes10.dex */
public final class RLG extends THe {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof RLG) {
            return this.A00.equals(((RLG) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        return AnonymousClass001.A0g("Optional.of(", this.A00.toString(), ")");
    }

    public RLG(Object obj) {
        this.A00 = obj;
    }
}
