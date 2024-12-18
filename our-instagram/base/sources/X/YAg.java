package X;

/* loaded from: classes12.dex */
public final class YAg implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        int i2 = i % 10;
        if (i2 != 0) {
            int i3 = i % 100;
            if (i3 >= 11 && i3 <= 19) {
                return 0;
            }
            if (i2 == 1 && i3 != 11) {
                return 1;
            }
            return 5;
        }
        return 0;
    }
}
