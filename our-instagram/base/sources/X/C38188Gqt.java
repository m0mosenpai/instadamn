package X;

/* renamed from: X.Gqt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38188Gqt extends C0T6 implements InterfaceC42381xS {
    public final C206259Bi A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38188Gqt) {
                C38188Gqt c38188Gqt = (C38188Gqt) obj;
                if (!C14360o3.A0K(this.A00, c38188Gqt.A00) || this.A02 != c38188Gqt.A02 || this.A01 != c38188Gqt.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC42381xS
    public final long Ask() {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(302));
    }

    @Override // X.InterfaceC42381xS
    public final long B3I() {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(312));
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ int BA4() {
        throw AbstractC166987dD.A1D("Not supported");
    }

    @Override // X.InterfaceC42381xS
    public final /* bridge */ /* synthetic */ Object BUM() {
        return this.A00;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ Integer BeP() {
        return C05F.A00;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ String Bo9() {
        return "";
    }

    @Override // X.InterfaceC42381xS
    public final int BoB() {
        return this.A01;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ String BoF() {
        return "";
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ boolean Boz() {
        return false;
    }

    @Override // X.InterfaceC42381xS
    public final Integer Byg() {
        return this.A02;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ boolean CVy() {
        return false;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ void Ecr(boolean z) {
        throw AbstractC166987dD.A1D("Not supported");
    }

    public final int hashCode() {
        int A0G = AbstractC166987dD.A0G(this.A00);
        Integer num = this.A02;
        return AbstractC167017dG.A0L(num, C5SF.A01(num), A0G) + this.A01;
    }

    public C38188Gqt(C206259Bi c206259Bi, Integer num, int i) {
        this.A00 = c206259Bi;
        this.A02 = num;
        this.A01 = i;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GridSponsoredPoolItem(sponsoredContent=");
        A1C.append(this.A00);
        A1C.append(AbstractC111324zv.A00(3371));
        Integer num = this.A02;
        if (num != null) {
            str = C5SF.A01(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        A1C.append(AbstractC111324zv.A00(3434));
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
