package X;

/* renamed from: X.4bL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98424bL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C98324bB A04;
    public C98394bI A05;
    public final InterfaceC98054ak A06;
    public final C98434bM A07 = new C98434bM();
    public final C97974ac A09 = new C97974ac(1);
    public final C97974ac A08 = new C97974ac();

    public static C98344bD A00(C98424bL c98424bL) {
        C98434bM c98434bM = c98424bL.A07;
        int i = c98434bM.A05.A02;
        C98344bD c98344bD = c98434bM.A06;
        if ((c98344bD != null || (c98344bD = c98424bL.A05.A0A[i]) != null) && c98344bD.A03) {
            return c98344bD;
        }
        return null;
    }

    public final void A01() {
        C98434bM c98434bM = this.A07;
        c98434bM.A01 = 0;
        c98434bM.A04 = 0L;
        c98434bM.A08 = false;
        c98434bM.A07 = false;
        c98434bM.A09 = false;
        c98434bM.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public C98424bL(InterfaceC98054ak interfaceC98054ak) {
        this.A06 = interfaceC98054ak;
    }
}
