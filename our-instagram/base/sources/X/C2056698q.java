package X;

/* renamed from: X.98q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2056698q extends C0T6 {
    public static final C2056698q A01 = new C2056698q(0);
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C2056698q) && this.A00 == ((C2056698q) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("FeatureLimitComposerBlockInfo(expirationTimeSec=", ')', this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public C2056698q(long j) {
        this.A00 = j;
    }
}
