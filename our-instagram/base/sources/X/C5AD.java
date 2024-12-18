package X;

/* renamed from: X.5AD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5AD {
    public static final long A01 = C5AE.A00(0.5f, 0.5f);
    public final long A00;

    public final boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C5AD) || j != ((C5AD) obj).A00) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return AnonymousClass001.A0K("TransformOrigin(packedValue=", ')', this.A00);
    }
}
