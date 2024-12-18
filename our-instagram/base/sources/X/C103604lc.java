package X;

/* renamed from: X.4lc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103604lc extends C0T6 {
    public final C103574lZ A00;
    public final C103574lZ A01;

    public C103604lc(C103574lZ c103574lZ, C103574lZ c103574lZ2) {
        C14360o3.A0B(c103574lZ, 1);
        C14360o3.A0B(c103574lZ2, 2);
        this.A01 = c103574lZ;
        this.A00 = c103574lZ2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C103604lc) {
                C103604lc c103604lc = (C103604lc) obj;
                if (!C14360o3.A0K(this.A01, c103604lc.A01) || !C14360o3.A0K(this.A00, c103604lc.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }
}
