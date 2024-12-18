package X;

/* renamed from: X.YAu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73384YAu implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        int i2 = i % 100;
        if (i2 >= 3) {
            if (i2 <= 10) {
                return 3;
            }
            if (i2 <= 99) {
                return 4;
            }
            return 5;
        }
        return 5;
    }
}
