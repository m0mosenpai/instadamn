package X;

/* renamed from: X.Xad, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72280Xad extends AbstractC73479YFc {
    public final YRN[] A00 = new YRN[3];
    public final /* synthetic */ C72277Xaa A01;

    public C72280Xad(C72277Xaa c72277Xaa) {
        this.A01 = c72277Xaa;
        int i = 0;
        do {
            this.A00[i] = this.A01.A00[i].AMV();
            i++;
        } while (i < 3);
    }

    @Override // X.YP4
    public final void AQO() {
        YRN[] yrnArr = this.A00;
        int i = 0;
        do {
            YRN yrn = yrnArr[i];
            C14360o3.A0A(yrn);
            yrn.AQO();
            i++;
        } while (i < 3);
    }
}
