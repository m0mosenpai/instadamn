package X;

/* loaded from: classes11.dex */
public final class UPF extends C0T6 {
    public final C102884kP A00;
    public final InterfaceC103384lE A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPF) {
                UPF upf = (UPF) obj;
                if (!C14360o3.A0K(this.A03, upf.A03) || !C14360o3.A0K(this.A04, upf.A04) || !C14360o3.A0K(this.A02, upf.A02) || this.A05 != upf.A05 || !C14360o3.A0K(this.A01, upf.A01) || !C14360o3.A0K(this.A00, upf.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A03) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return AbstractC166997dE.A0J(this.A01, AbstractC167007dF.A0D(this.A05, (A0O + i) * 31)) + this.A00.hashCode();
    }

    public UPF(C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, String str, String str2, String str3, boolean z) {
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A05 = z;
        this.A01 = interfaceC103384lE;
        this.A00 = c102884kP;
    }
}
