package X;

/* loaded from: classes5.dex */
public final class CVV {
    public final C51322Xf A00;
    public final String A01;

    public CVV(C51322Xf c51322Xf, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = c51322Xf;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVV) {
                CVV cvv = (CVV) obj;
                if (!C14360o3.A0K(this.A00, cvv.A00) || !C14360o3.A0K(this.A01, cvv.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AnchorHandle(handle=");
        A1C.append(this.A00);
        A1C.append(", viewTag=");
        return AbstractC25236BEt.A0Y(this.A01, A1C);
    }
}
