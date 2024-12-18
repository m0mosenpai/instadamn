package X;

/* loaded from: classes5.dex */
public final class BH6 implements C5Y6 {
    public final InterfaceC31139Dme A00;
    public final Integer A01;

    @Override // X.C5Y6
    /* renamed from: FDZ */
    public final C62F FDa(InterfaceC118485Xk interfaceC118485Xk) {
        return new BH7(this.A00.FDa(interfaceC118485Xk), this.A01);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BH6)) {
            return false;
        }
        BH6 bh6 = (BH6) obj;
        if (!C14360o3.A0K(bh6.A00, this.A00) || bh6.A01 != this.A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A0G = AbstractC166987dD.A0G(this.A00);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            str = "Reverse";
        } else {
            str = "Restart";
        }
        return AbstractC25231BEo.A0H(str, intValue, A0G) + ((int) (0 >>> 32));
    }

    public BH6(InterfaceC31139Dme interfaceC31139Dme, Integer num) {
        this.A00 = interfaceC31139Dme;
        this.A01 = num;
    }
}
