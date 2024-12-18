package X;

/* renamed from: X.YAr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73382YAr implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 0) {
            int i2 = i % 100;
            if (i2 >= 2) {
                if (i2 > 10) {
                    if (i2 <= 19) {
                        return 4;
                    }
                } else {
                    return 3;
                }
            }
            return 5;
        }
        return 3;
    }
}
