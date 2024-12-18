package X;

/* loaded from: classes8.dex */
public final class KTH extends AbstractC129515tG implements InterfaceC129555tK {
    public final int A00;
    public final C51761Mtk A01;
    public final C7QL A02;
    public final C7QY A03;
    public final C47376KwR A04;
    public final AbstractC46452KhC A05;
    public final String A06;
    public final String A07;
    public final C7QX A08;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KTH(X.C51761Mtk r3, X.C7QY r4, X.C47376KwR r5, X.AbstractC46452KhC r6, java.lang.String r7, java.lang.String r8, int r9) {
        /*
            r2 = this;
            r0 = 1
            X.AbstractC167007dF.A1F(r4, r0, r8)
            X.7QX r1 = r4.A0B
            r2.<init>(r1)
            r2.A03 = r4
            r2.A01 = r3
            r2.A07 = r7
            r2.A06 = r8
            r2.A05 = r6
            r2.A00 = r9
            r2.A04 = r5
            X.7QL r0 = r4.A0C
            r2.A02 = r0
            r2.A08 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KTH.<init>(X.Mtk, X.7QY, X.KwR, X.KhC, java.lang.String, java.lang.String, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTH) {
                KTH kth = (KTH) obj;
                if (!C14360o3.A0K(this.A03, kth.A03) || !C14360o3.A0K(this.A01, kth.A01) || !C14360o3.A0K(this.A07, kth.A07) || !C14360o3.A0K(this.A06, kth.A06) || !C14360o3.A0K(this.A05, kth.A05) || this.A00 != kth.A00 || !C14360o3.A0K(this.A04, kth.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A03))))) + this.A00) * 31) + AbstractC167017dG.A0M(this.A04);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PortraitVideoShareContentViewModel(xmaViewModel=");
        A1C.append(this.A03);
        A1C.append(", mediaForAutoplayFields=");
        A1C.append(this.A01);
        A1C.append(", mediaId=");
        A1C.append(this.A07);
        A1C.append(", aspectRatio=");
        A1C.append(this.A06);
        A1C.append(", typeSpecificFields=");
        A1C.append(this.A05);
        A1C.append(MSV.A00(138));
        A1C.append(this.A00);
        A1C.append(", reaction=");
        return AbstractC167017dG.A0o(this.A04, A1C);
    }
}
