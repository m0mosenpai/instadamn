package X;

/* loaded from: classes12.dex */
public final class Y9Z implements YPI {
    public final /* synthetic */ Y68 A00;

    public Y9Z(Y68 y68) {
        this.A00 = y68;
    }

    @Override // X.YPI
    public final int AtE() {
        Y68 y68 = this.A00;
        int BIB = y68.A06.BIB();
        int BI0 = y68.A06.BI0();
        float height = y68.A03.height();
        int i = y68.A01;
        if (i != 1 && i != 3) {
            BIB = BI0;
        }
        return (int) (BIB * height);
    }

    @Override // X.YPI
    public final int AtK() {
        Y68 y68 = this.A00;
        int BIB = y68.A06.BIB();
        int BI0 = y68.A06.BI0();
        float width = y68.A03.width();
        int i = y68.A01;
        if (i == 1 || i == 3) {
            BIB = BI0;
        }
        return (int) (BIB * width);
    }

    @Override // X.YPI
    public final EnumC197888oz AwN() {
        return this.A00.A06.BoW();
    }
}
