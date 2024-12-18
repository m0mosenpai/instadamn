package X;

/* loaded from: classes4.dex */
public final class AVW implements BCO {
    public final /* synthetic */ C23489Ab4 A00;

    public AVW(C23489Ab4 c23489Ab4) {
        this.A00 = c23489Ab4;
    }

    @Override // X.BCO
    public final C199758sR AWe(int i, int i2) {
        return new C199758sR(i / 4, i2);
    }

    @Override // X.BCO
    public final C199758sR AWf(int i, int i2, int i3) {
        int i4 = AbstractC224549vf.A00(new C199758sR(i, i2), i3, i3).A01;
        int i5 = i4 - (i4 % 4);
        return new C199758sR(i5, (int) (r1.A00 * (i5 / i4)));
    }
}
