package X;

/* loaded from: classes7.dex */
public final class H7D extends C0T6 implements InterfaceC66482zP {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7D) {
                H7D h7d = (H7D) obj;
                if (!C14360o3.A0K(this.A01, h7d.A01) || !C14360o3.A0K(this.A03, h7d.A03) || !C14360o3.A0K(this.A00, h7d.A00) || !C14360o3.A0K(this.A02, h7d.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public H7D(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A03 = str2;
        this.A00 = num;
        this.A02 = str3;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
