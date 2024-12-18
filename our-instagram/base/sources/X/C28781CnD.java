package X;

/* renamed from: X.CnD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28781CnD implements InterfaceC30908DiL {
    public static final C28781CnD A00 = new C28781CnD();

    @Override // X.InterfaceC30908DiL
    public final long Ahf(C27963CUj c27963CUj, int i) {
        String str = c27963CUj.A03.A04.A03.A00;
        int i2 = i;
        while (true) {
            if (i2 > 0) {
                if (str.charAt(i2 - 1) == '\n') {
                    break;
                }
                i2--;
            } else {
                i2 = 0;
                break;
            }
        }
        int length = str.length();
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '\n') {
                    break;
                }
                i++;
            } else {
                i = length;
                break;
            }
        }
        return C60Z.A00(i2, i);
    }
}
