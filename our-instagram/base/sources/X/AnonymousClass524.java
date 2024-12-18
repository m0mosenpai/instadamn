package X;

/* renamed from: X.524, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass524 extends C0T6 implements Comparable {
    public final long A00;
    public final long A01;
    public final C1CA A02;

    public AnonymousClass524(C1CA c1ca, long j, long j2) {
        C14360o3.A0B(c1ca, 1);
        this.A02 = c1ca;
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass524) {
                AnonymousClass524 anonymousClass524 = (AnonymousClass524) obj;
                if (this.A02 != anonymousClass524.A02 || this.A01 != anonymousClass524.A01 || this.A00 != anonymousClass524.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass524 anonymousClass524 = (AnonymousClass524) obj;
        C14360o3.A0B(anonymousClass524, 0);
        return C14360o3.A01(this.A01, anonymousClass524.A01);
    }

    public final int hashCode() {
        int hashCode = this.A02.hashCode() * 31;
        long j = this.A01;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A00;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02.ordinal());
        sb.append(":");
        sb.append(this.A01);
        sb.append(":");
        sb.append(this.A00);
        return sb.toString();
    }
}
