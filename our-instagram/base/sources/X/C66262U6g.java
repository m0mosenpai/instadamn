package X;

/* renamed from: X.U6g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66262U6g implements XAK {
    public final XAK A00;

    public C66262U6g(XAK xak) {
        this.A00 = xak;
    }

    @Override // X.XAK
    public final boolean Epy(C102884kP c102884kP) {
        C1LG A03 = C1LZ.A00().A03();
        int i = c102884kP.A05;
        for (int i2 : A03.A00(i)) {
            for (C102884kP c102884kP2 : c102884kP.A0N(i2)) {
                if (c102884kP2 != null && this.A00.Epy(c102884kP2)) {
                    return true;
                }
            }
        }
        for (int i3 : C1LZ.A00().A03().A01(i)) {
            C102884kP A08 = c102884kP.A08(i3);
            if (A08 != null && this.A00.Epy(A08)) {
                return true;
            }
        }
        return false;
    }
}
