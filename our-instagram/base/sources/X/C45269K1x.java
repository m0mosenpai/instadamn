package X;

/* renamed from: X.K1x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45269K1x extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final KT7 A00;
    public final C1585879t A01;
    public final C7QY A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45269K1x) {
                C45269K1x c45269K1x = (C45269K1x) obj;
                if (!C14360o3.A0K(this.A03, c45269K1x.A03) || !C14360o3.A0K(this.A00, c45269K1x.A00) || !C14360o3.A0K(this.A02, c45269K1x.A02) || !C14360o3.A0K(this.A01, c45269K1x.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArH() {
        return this.A02;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC162787Qp ArQ() {
        return this.A01;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK Bn9() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A02)) * 31);
    }

    public C45269K1x(KT7 kt7, C1585879t c1585879t, C7QY c7qy, String str) {
        AbstractC25234BEr.A1P(str, kt7, c1585879t);
        this.A03 = str;
        this.A00 = kt7;
        this.A02 = c7qy;
        this.A01 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AnimatedStickerReplyToNotesXmaViewModel(id=");
        JQ0.A1V(A1C, this.A03);
        JQ0.A1T(A1C, this.A00);
        JQ0.A1R(A1C, this.A02);
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
