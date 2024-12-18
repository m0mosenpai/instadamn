package X;

/* renamed from: X.7dW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167177dW extends C0T6 implements InterfaceC166427cB {
    public final int A00;
    public final int A01;
    public final InterfaceC38371qR A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167177dW) {
                C167177dW c167177dW = (C167177dW) obj;
                if (this.A00 != c167177dW.A00 || this.A01 != c167177dW.A01 || !C14360o3.A0K(this.A02, c167177dW.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A00 * 31) + this.A01) * 31) + this.A02.hashCode();
    }

    public C167177dW(InterfaceC38371qR interfaceC38371qR, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = interfaceC38371qR;
    }
}
