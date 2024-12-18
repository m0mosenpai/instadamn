package X;

/* loaded from: classes10.dex */
public final class QJa extends AbstractC61283Rku {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QJa) {
                QJa qJa = (QJa) obj;
                if (!C14360o3.A0K(this.A05, qJa.A05) || !C14360o3.A0K(this.A03, qJa.A03) || this.A00 != qJa.A00 || !C14360o3.A0K(this.A04, qJa.A04) || this.A01 != qJa.A01 || !C14360o3.A0K(this.A02, qJa.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC166997dE.A0K(this.A04, (AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A05)) + this.A00) * 31) + this.A01) * 31);
    }

    public QJa(String str, String str2, int i, int i2, String str3, String str4) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(str3, 4);
        this.A05 = str;
        this.A03 = str2;
        this.A00 = i;
        this.A04 = str3;
        this.A01 = i2;
        this.A02 = str4;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MainThreadLayoutStateMismatch(root=");
        A1C.append(this.A05);
        A1C.append(", mainThreadLayoutStateSizeSpecs=");
        A1C.append(this.A03);
        A1C.append(", mainThreadLayoutRootId=");
        A1C.append(this.A00);
        A1C.append(", measureSizeSpecs=");
        A1C.append(this.A04);
        A1C.append(", rootId=");
        A1C.append(this.A01);
        A1C.append(", breadcrumb=");
        return AbstractC25236BEt.A0Y(this.A02, A1C);
    }
}
