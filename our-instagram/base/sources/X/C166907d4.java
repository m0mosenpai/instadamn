package X;

/* renamed from: X.7d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166907d4 extends C0T6 implements InterfaceC166427cB {
    public final int A00;
    public final C51760Mtj A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166907d4) {
                C166907d4 c166907d4 = (C166907d4) obj;
                if (this.A00 != c166907d4.A00 || !C14360o3.A0K(this.A01, c166907d4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public C166907d4(C51760Mtj c51760Mtj, int i) {
        this.A00 = i;
        this.A01 = c51760Mtj;
    }
}
