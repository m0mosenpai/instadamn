package X;

/* renamed from: X.KYx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46032KYx extends AbstractC46481Khf {
    public boolean A00;
    public final int A01;
    public final C47Z A02;
    public final String A03;
    public final C73163Pr A04;
    public final C19L A05;
    public final boolean A06;

    public C46032KYx(C47Z c47z, String str, C73163Pr c73163Pr, C19L c19l, int i, boolean z) {
        AbstractC167017dG.A1P(c47z, str);
        this.A02 = c47z;
        this.A03 = str;
        this.A01 = i;
        this.A04 = c73163Pr;
        this.A05 = c19l;
        this.A06 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UploadRequest(pendingMedia=");
        A1C.append(this.A02);
        A1C.append(", source=");
        A1C.append(this.A03);
        A1C.append(AbstractC111324zv.A00(277));
        A1C.append(this.A01);
        A1C.append(", response=");
        A1C.append(this.A04);
        A1C.append(", parentScope=");
        A1C.append(this.A05);
        A1C.append(", useSingularWorkerV2=");
        return AbstractC25236BEt.A0a(A1C, this.A06);
    }
}
