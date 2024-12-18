package X;

/* renamed from: X.Mwx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51915Mwx extends C0T6 implements InterfaceC57863PlT {
    public final InterfaceC57989PnZ A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public C51915Mwx(InterfaceC57989PnZ interfaceC57989PnZ, Object obj, String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A03 = str;
        this.A00 = interfaceC57989PnZ;
        this.A01 = obj;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51915Mwx) {
                C51915Mwx c51915Mwx = (C51915Mwx) obj;
                if (!C14360o3.A0K(this.A03, c51915Mwx.A03) || !C14360o3.A0K(this.A00, c51915Mwx.A00) || !C14360o3.A0K(this.A01, c51915Mwx.A01) || !C14360o3.A0K(this.A02, c51915Mwx.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A03))) + AbstractC167017dG.A0O(this.A02);
    }
}
