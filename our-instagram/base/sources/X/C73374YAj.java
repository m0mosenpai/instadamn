package X;

/* renamed from: X.YAj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73374YAj implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            if (i % 100 != 11) {
                return 1;
            }
            return 5;
        }
        if (i2 >= 2 && i2 <= 4) {
            int i3 = i % 100;
            if (i3 < 12 || i3 > 14) {
                return 3;
            }
            return 5;
        }
        return 5;
    }
}
