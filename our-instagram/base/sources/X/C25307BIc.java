package X;

/* renamed from: X.BIc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25307BIc implements InterfaceC118965aD {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;

    public C25307BIc(C6LI c6li, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = c6li;
        this.A01 = i;
        this.A03 = str;
    }

    @Override // X.InterfaceC118965aD
    public final void dispose() {
        String valueOf;
        String str;
        if (this.A00 != 0) {
            valueOf = String.valueOf(this.A01);
            str = this.A03;
        } else {
            if (this.A02 == null) {
                return;
            }
            valueOf = String.valueOf(this.A01);
            str = this.A03;
            C14360o3.A0B(str, 1);
        }
        C1KM.A09.A0I(valueOf, str);
    }
}
