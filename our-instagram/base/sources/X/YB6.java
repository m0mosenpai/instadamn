package X;

/* loaded from: classes12.dex */
public final class YB6 implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        int i2;
        if (i == 1) {
            return 1;
        }
        if (i == 0 || ((i2 = i % 100) >= 1 && i2 <= 19)) {
            return 3;
        }
        return 5;
    }
}
