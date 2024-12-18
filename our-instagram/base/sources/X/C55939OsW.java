package X;

/* renamed from: X.OsW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55939OsW implements C1G4 {
    public final C1G4 A00;

    public C55939OsW(C1G4 c1g4) {
        this.A00 = c1g4;
    }

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        String A00 = AbstractC54299NzJ.A00();
        if (A00 != null && !A00.isEmpty()) {
            c1qw.A01("Zero-E2E-Dogfood-Carrier-Id", A00);
        }
        return this.A00.startRequest(c1qw, c1qy, c26511Qg);
    }
}
