package X;

/* renamed from: X.Bip, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26225Bip extends C0T6 implements InterfaceC30950Dj7 {
    public final Integer A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26225Bip) {
                C26225Bip c26225Bip = (C26225Bip) obj;
                if (this.A00 != c26225Bip.A00 || this.A01 != c26225Bip.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30950Dj7
    public final String getId() {
        if (1 - this.A00.intValue() != 0) {
            return "Suggested";
        }
        return "Count";
    }

    public final int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (1 != intValue) {
            str = "Suggested";
        } else {
            str = "Count";
        }
        return AbstractC166987dD.A0K(this.A01, AbstractC25228BEl.A0F(str, intValue));
    }

    public C26225Bip(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
