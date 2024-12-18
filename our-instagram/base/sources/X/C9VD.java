package X;

/* renamed from: X.9VD, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VD extends AbstractC72459Xe5 {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9VD) && this.A00 == ((C9VD) obj).A00);
    }

    public final String toString() {
        return AnonymousClass001.A0K("AiInputLong(number=", ')', this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public C9VD(long j) {
        this.A00 = j;
    }
}
