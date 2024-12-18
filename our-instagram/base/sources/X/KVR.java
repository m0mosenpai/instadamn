package X;

/* loaded from: classes8.dex */
public final class KVR extends AbstractC46454KhE {
    public final String A00;
    public final String A01;
    public final InterfaceC16660sJ A02;
    public final boolean A03;

    public KVR(String str, String str2, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
        this.A03 = z;
        this.A02 = interfaceC16660sJ;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KVR) {
                KVR kvr = (KVR) obj;
                if (!C14360o3.A0K(this.A01, kvr.A01) || !C14360o3.A0K(this.A00, kvr.A00) || this.A03 != kvr.A03 || !C14360o3.A0K(this.A02, kvr.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0K(this.A00, AbstractC167017dG.A0O(this.A01) * 31)));
    }
}
