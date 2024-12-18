package X;

/* loaded from: classes12.dex */
public final class XVO extends XVQ implements YRI {
    public final Y4b A00;

    @Override // X.YOo
    public final C72720Xls ASq() {
        Y4b y4b = this.A00;
        C72720Xls BHn = y4b.A01.BHn();
        BHn.A00.add(YB7.A00());
        BHn.A01.add(y4b.A00);
        return BHn;
    }

    @Override // X.YOo
    public final void ATk(Object obj) {
        Y4b.A01((C72720Xls) obj);
    }

    public XVO(Y4b y4b, YB7 yb7) {
        super(yb7);
        this.A00 = y4b;
    }
}
