package X;

/* renamed from: X.YAm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73377YAm implements InterfaceC39641sn {
    @Override // X.InterfaceC39641sn
    public final int BYK(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if ((i < 0 || i > 10) && i % 10 == 0) {
            return 4;
        }
        return 5;
    }
}
