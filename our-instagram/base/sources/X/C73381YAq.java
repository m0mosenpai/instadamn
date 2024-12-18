package X;

/* renamed from: X.YAq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73381YAq implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            int i3 = i % 100;
            if (i3 < 11 || i3 > 19) {
                return 1;
            }
            return 5;
        }
        if (i2 >= 2 && i2 <= 9) {
            int i4 = i % 100;
            if (i4 < 11 || i4 > 19) {
                return 3;
            }
            return 5;
        }
        return 5;
    }
}
