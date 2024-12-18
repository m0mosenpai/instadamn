package X;

import java.util.Collection;

/* loaded from: classes10.dex */
public final class T9G implements InterfaceC65522Tlr {
    public final /* synthetic */ C58556PxX A00;

    @Override // X.InterfaceC65522Tlr
    public final SW6 AaL(final byte[] symmetricKeyValue) {
        C58556PxX c58556PxX = this.A00;
        C58552PxP c58552PxP = new C58552PxP(C58526Pwu.A00(symmetricKeyValue));
        if (c58556PxX != null) {
            int i = c58556PxX.A00;
            C58526Pwu c58526Pwu = c58552PxP.A00;
            if (i == c58526Pwu.A00.length) {
                if (c58556PxX.A00()) {
                    throw AbstractC58318PtA.A0v();
                }
                C58526Pwu A00 = S3H.A00(c58556PxX, null);
                Collection collection = C64293T8c.A04;
                return new SW6(new C64293T8c(A00, c58526Pwu.A01()));
            }
            throw AbstractC58318PtA.A0w();
        }
        throw AbstractC166987dD.A12("Cannot build without parameters and/or key material");
    }

    public T9G(final C58556PxX val$parameters) {
        this.A00 = val$parameters;
    }

    @Override // X.InterfaceC65522Tlr
    public final int C4h() {
        return this.A00.A00;
    }
}
