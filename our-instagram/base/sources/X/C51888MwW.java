package X;

/* renamed from: X.MwW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51888MwW extends C0T6 implements InterfaceC57856PlM {
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51888MwW) {
                C51888MwW c51888MwW = (C51888MwW) obj;
                if (!C14360o3.A0K(this.A00, c51888MwW.A00) || this.A02 != c51888MwW.A02 || this.A01 != c51888MwW.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0J(this.A00)));
    }

    public C51888MwW(String str, boolean z, boolean z2) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = z2;
    }
}
