package X;

/* loaded from: classes10.dex */
public final class T9E implements InterfaceC65522Tlr {
    public final /* synthetic */ C58529Pwx A00;

    @Override // X.InterfaceC65522Tlr
    public final SW6 AaL(final byte[] symmetricKeyValue) {
        C58529Pwx c58529Pwx = this.A00;
        C58552PxP c58552PxP = new C58552PxP(C58526Pwu.A00(symmetricKeyValue));
        if (c58529Pwx != null) {
            if (c58529Pwx.A01 == c58552PxP.A00.A00.length) {
                if (c58529Pwx.A00()) {
                    throw AbstractC58318PtA.A0v();
                }
                return new SW6(T8Y.A00(new RTC(c58529Pwx, S3F.A00(c58529Pwx, null), c58552PxP, null)));
            }
            throw AbstractC58318PtA.A0w();
        }
        throw AbstractC58318PtA.A0x("Cannot build without parameters and/or key material");
    }

    public T9E(final C58529Pwx val$parameters) {
        this.A00 = val$parameters;
    }

    @Override // X.InterfaceC65522Tlr
    public final int C4h() {
        return this.A00.A01;
    }
}
