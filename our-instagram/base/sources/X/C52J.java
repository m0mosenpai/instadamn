package X;

/* renamed from: X.52J, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52J implements InterfaceC39641sn {
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
