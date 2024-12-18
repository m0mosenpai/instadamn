package X;

/* renamed from: X.5Vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118055Vp extends C0T6 implements InterfaceC118065Vq {
    public final long A00;

    @Override // X.InterfaceC118065Vq
    public final C58K AL3(C5XP c5xp) {
        C14360o3.A0B(c5xp, 0);
        return new BGF(c5xp, this.A00);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C118055Vp) {
                long j = this.A00;
                long j2 = ((C118055Vp) obj).A00;
                long j3 = C1132359l.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = C1132359l.A01;
        return (int) (j ^ (j >>> 32));
    }

    public C118055Vp(long j) {
        this.A00 = j;
    }
}
