package X;

/* renamed from: X.CoZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28865CoZ implements InterfaceC31101Dlj {
    public final C5W3 A00;

    @Override // X.InterfaceC31101Dlj
    public final CVF AVH(C5C8 c5c8) {
        C14360o3.A0B(c5c8, 0);
        C6C7 A0g = AbstractC25228BEl.A0g();
        A0g.A05(c5c8);
        int A00 = A0g.A00(this.A00);
        try {
            A0g.A09(" me");
            A0g.A04(A00);
            return new CVF(A0g.A02(), new C28861CoV(c5c8.length()));
        } catch (Throwable th) {
            A0g.A04(A00);
            throw th;
        }
    }

    public C28865CoZ(C5W3 c5w3) {
        this.A00 = c5w3;
    }
}
