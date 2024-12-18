package X;

import android.graphics.Path;

/* renamed from: X.Bgi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26098Bgi extends C0T6 implements InterfaceC30926Did {
    public final int A00;
    public final long A01;
    public final long A02;

    public C26098Bgi(long j, long j2, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A01 = j2;
        }
    }

    @Override // X.InterfaceC30926Did
    public final void ACE(Path path, C28225CcV c28225CcV) {
        if (this.A00 != 0) {
            C14360o3.A0B(path, 0);
            long j = this.A01;
            long j2 = AbstractC27755CLw.A00;
            float A01 = AbstractC25227BEk.A01(j);
            float A00 = AbstractC25232BEp.A00(j);
            long j3 = this.A02;
            path.quadTo(A01, A00, AbstractC25227BEk.A01(j3), AbstractC25232BEp.A00(j3));
            return;
        }
        C14360o3.A0B(path, 0);
        long j4 = this.A02;
        long j5 = AbstractC27755CLw.A00;
        path.addOval(C28369CfV.A01(AbstractC25227BEk.A01(j4), AbstractC25232BEp.A00(j4), this.A01), Path.Direction.CW);
    }

    public final boolean equals(Object obj) {
        long j;
        long j2;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C26098Bgi) {
                    C26098Bgi c26098Bgi = (C26098Bgi) obj;
                    if (c26098Bgi.A00 == 1) {
                        long j3 = this.A01;
                        long j4 = c26098Bgi.A01;
                        long j5 = AbstractC27755CLw.A00;
                        if (j3 == j4) {
                            j = this.A02;
                            j2 = c26098Bgi.A02;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C26098Bgi) {
                C26098Bgi c26098Bgi2 = (C26098Bgi) obj;
                if (c26098Bgi2.A00 == 0) {
                    long j6 = this.A02;
                    long j7 = c26098Bgi2.A02;
                    long j8 = AbstractC27755CLw.A00;
                    if (j6 == j7) {
                        j = this.A01;
                        j2 = c26098Bgi2.A01;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (j == j2) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        char c;
        int A03;
        long j;
        if (this.A00 != 0) {
            long j2 = this.A01;
            long j3 = AbstractC27755CLw.A00;
            c = ' ';
            A03 = AbstractC25227BEk.A03(j2);
            j = this.A02;
        } else {
            long j4 = this.A02;
            long j5 = AbstractC27755CLw.A00;
            c = ' ';
            A03 = AbstractC25227BEk.A03(j4);
            j = this.A01;
        }
        return A03 + ((int) (j ^ (j >>> c)));
    }
}
