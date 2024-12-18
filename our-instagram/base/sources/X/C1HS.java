package X;

/* renamed from: X.1HS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HS implements C1G4 {
    public static final C1HT A01 = new C1HT(200);
    public final C1G4 A00;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        A01.A03(c1qw);
        InterfaceC27191Tt startRequest = this.A00.startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    public C1HS(C1G4 c1g4) {
        this.A00 = c1g4;
    }
}
