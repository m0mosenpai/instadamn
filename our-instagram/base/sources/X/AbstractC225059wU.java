package X;

/* renamed from: X.9wU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC225059wU {
    public static int A00(InterfaceC178897x1 interfaceC178897x1, int i) {
        int AqC = interfaceC178897x1.AqC();
        if ((AqC & 4096) != 0) {
            return i | 4096;
        }
        if ((AqC & C3OO.FLAG_MOVED) != 0) {
            return i | C3OO.FLAG_MOVED;
        }
        if ((AqC & 512) != 0) {
            return i | 512;
        }
        if ((AqC & 1024) != 0) {
            return i | 1024;
        }
        if ((AqC & 256) == 0) {
            return i;
        }
        return i | 256;
    }
}
