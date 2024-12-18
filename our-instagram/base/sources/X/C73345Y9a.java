package X;

/* renamed from: X.Y9a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73345Y9a implements YPI {
    public final /* synthetic */ Y68 A00;

    public C73345Y9a(Y68 y68) {
        this.A00 = y68;
    }

    @Override // X.YPI
    public final int AtE() {
        Y68 y68 = this.A00;
        C199758sR A00 = y68.A0E.A00(y68.A06.BoW(), y68.A06.BIB(), y68.A06.BI0());
        int i = A00.A01;
        int i2 = A00.A00;
        float height = y68.A03.height();
        int i3 = y68.A01;
        if (i3 != 1 && i3 != 3) {
            i = i2;
        }
        return (int) (i * height);
    }

    @Override // X.YPI
    public final int AtK() {
        Y68 y68 = this.A00;
        C199758sR A00 = y68.A0E.A00(y68.A06.BoW(), y68.A06.BIB(), y68.A06.BI0());
        int i = A00.A01;
        int i2 = A00.A00;
        float width = y68.A03.width();
        int i3 = y68.A01;
        if (i3 == 1 || i3 == 3) {
            i = i2;
        }
        return (int) (i * width);
    }

    @Override // X.YPI
    public final EnumC197888oz AwN() {
        return this.A00.A06.BoW();
    }
}
