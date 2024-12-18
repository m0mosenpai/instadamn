package X;

/* renamed from: X.3g6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79003g6 extends C0T6 implements InterfaceC79013g8 {
    public final C78983g4 A00;
    public final C38321qM A01;
    public final C75113Zb A02;

    public C79003g6(C78983g4 c78983g4, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
        this.A00 = c78983g4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C79003g6) {
                C79003g6 c79003g6 = (C79003g6) obj;
                if (!C14360o3.A0K(this.A01, c79003g6.A01) || !C14360o3.A0K(this.A02, c79003g6.A02) || !C14360o3.A0K(this.A00, c79003g6.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }
}
