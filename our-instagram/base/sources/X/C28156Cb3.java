package X;

/* renamed from: X.Cb3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28156Cb3 {
    public static final /* synthetic */ C28156Cb3 A02 = new Object();
    public static final InterfaceC31100Dli A00 = new InterfaceC31100Dli() { // from class: X.CoH
        @Override // X.InterfaceC31100Dli
        public final boolean CWU(C114205Dh c114205Dh, C114205Dh c114205Dh2) {
            return c114205Dh.A05(c114205Dh2);
        }
    };
    public static final InterfaceC31100Dli A01 = new InterfaceC31100Dli() { // from class: X.CoI
        @Override // X.InterfaceC31100Dli
        public final boolean CWU(C114205Dh c114205Dh, C114205Dh c114205Dh2) {
            long A002 = c114205Dh.A00();
            float A012 = C119365at.A01(A002);
            if (A012 >= c114205Dh2.A01 && A012 < c114205Dh2.A02) {
                float A022 = C119365at.A02(A002);
                if (A022 >= c114205Dh2.A03 && A022 < c114205Dh2.A00) {
                    return true;
                }
            }
            return false;
        }
    };
}
