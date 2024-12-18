package X;

/* renamed from: X.RLt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60681RLt extends AbstractC64513THf {
    public final Object A00;

    public final boolean equals(Object obj) {
        if (obj instanceof C60681RLt) {
            return this.A00.equals(((C60681RLt) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode() + 1502476572;
    }

    public final String toString() {
        return AnonymousClass001.A0g("Optional.of(", this.A00.toString(), ")");
    }

    public C60681RLt(Object obj) {
        this.A00 = obj;
    }
}
