package X;

/* loaded from: classes8.dex */
public final class K02 extends C0T6 implements InterfaceC66482zP {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K02) {
                K02 k02 = (K02) obj;
                if (!C14360o3.A0K(this.A01, k02.A01) || !C14360o3.A0K(this.A02, k02.A02) || !C14360o3.A0K(this.A03, k02.A03) || this.A00 != k02.A00) {
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
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01))) + this.A00;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        K02 k02 = (K02) obj;
        String str2 = this.A01;
        if (k02 != null) {
            str = k02.A01;
        } else {
            str = null;
        }
        return C14360o3.A0K(str2, str);
    }

    public K02(String str, String str2, String str3, int i) {
        AbstractC167017dG.A1P(str, str2);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SourcesListItemModel(title=");
        A1C.append(this.A01);
        A1C.append(", url=");
        A1C.append(this.A02);
        A1C.append(", botResponseId=");
        A1C.append(this.A03);
        A1C.append(", position=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
