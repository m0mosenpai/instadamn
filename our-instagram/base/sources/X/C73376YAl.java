package X;

/* renamed from: X.YAl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73376YAl implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        int i2 = i % 100;
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 >= 3 && i2 <= 4) {
            return 3;
        }
        return 5;
    }
}
