package X;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class T9F implements InterfaceC65522Tlr {
    public final /* synthetic */ RTQ A00;

    public T9F(final RTQ val$parameters) {
        this.A00 = val$parameters;
    }

    @Override // X.InterfaceC65522Tlr
    public final SW6 AaL(final byte[] symmetricKeyValue) {
        RTQ rtq = this.A00;
        int i = rtq.A00;
        byte[] copyOfRange = Arrays.copyOfRange(symmetricKeyValue, 0, i);
        int i2 = rtq.A01;
        byte[] copyOfRange2 = Arrays.copyOfRange(symmetricKeyValue, i, i + i2);
        C58552PxP c58552PxP = new C58552PxP(C58526Pwu.A00(copyOfRange));
        C58552PxP c58552PxP2 = new C58552PxP(C58526Pwu.A00(copyOfRange2));
        if (i == c58552PxP.A00.A00.length) {
            if (i2 == c58552PxP2.A00.A00.length) {
                if (rtq.A00()) {
                    throw AbstractC58318PtA.A0v();
                }
                return new SW6(T8X.A00(new RTE(rtq, S3C.A00(rtq, null), c58552PxP, c58552PxP2, null)));
            }
            throw AbstractC58318PtA.A0x("HMAC key size mismatch");
        }
        throw AbstractC58318PtA.A0x("AES key size mismatch");
    }

    @Override // X.InterfaceC65522Tlr
    public final int C4h() {
        RTQ rtq = this.A00;
        return rtq.A00 + rtq.A01;
    }
}
