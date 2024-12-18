package X;

/* renamed from: X.Mqq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51598Mqq extends C0T6 {
    public final InterfaceC30832Dh7 A00;
    public final Integer A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51598Mqq) {
                C51598Mqq c51598Mqq = (C51598Mqq) obj;
                if (this.A02 != c51598Mqq.A02 || this.A01 != c51598Mqq.A01 || !C14360o3.A0K(this.A00, c51598Mqq.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A08 = AbstractC25225BEi.A08(this.A02);
        int intValue = this.A01.intValue();
        if (1 != intValue) {
            str = "SET";
        } else {
            str = "UNSET";
        }
        return AbstractC166987dD.A0I(this.A00, AbstractC25231BEo.A0H(str, intValue, A08));
    }

    public C51598Mqq(InterfaceC30832Dh7 interfaceC30832Dh7, Integer num, boolean z) {
        this.A02 = z;
        this.A01 = num;
        this.A00 = interfaceC30832Dh7;
    }
}
