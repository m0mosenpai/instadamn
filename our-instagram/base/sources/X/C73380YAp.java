package X;

/* renamed from: X.YAp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73380YAp implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            if (i % 100 == 11) {
                return 4;
            }
            return 1;
        }
        if (i2 < 2 || i2 > 4) {
            return 4;
        }
        int i3 = i % 100;
        if (i3 >= 12 && i3 <= 14) {
            return 4;
        }
        return 3;
    }
}
