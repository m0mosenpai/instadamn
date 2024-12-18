package X;

/* renamed from: X.OsV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55938OsV implements C1G4 {
    public final C1G4 A00;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        String str = "";
        String string = AbstractC19750y3.A01("PrefZeroRatingDogfoodingFilename").getString("Zero-Dogfood-Carrier-Id", "");
        if (string != null) {
            str = string;
        }
        c1qw.A01("Zero-Dogfood-Carrier-Id", str);
        return this.A00.startRequest(c1qw, c1qy, c26511Qg);
    }

    public C55938OsV(C1G4 c1g4) {
        this.A00 = c1g4;
    }
}
