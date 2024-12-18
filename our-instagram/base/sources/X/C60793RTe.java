package X;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* renamed from: X.RTe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60793RTe extends RT2 {
    public final C60795RTg A00;
    public final SC3 A01;
    public final C58552PxP A02;

    public static C60793RTe A00(C60795RTg publicKey, SC3 nistPrivateKeyValue) {
        ECParameterSpec eCParameterSpec;
        ECParameterSpec eCParameterSpec2;
        ECPoint eCPoint = publicKey.A04;
        if (eCPoint != null) {
            BigInteger bigInteger = nistPrivateKeyValue.A00;
            SY7 sy7 = publicKey.A00.A01;
            SY7 sy72 = SY7.A01;
            if (sy7 == sy72) {
                eCParameterSpec = AbstractC63391SjD.A00;
            } else if (sy7 == SY7.A02) {
                eCParameterSpec = AbstractC63391SjD.A01;
            } else if (sy7 == SY7.A03) {
                eCParameterSpec = AbstractC63391SjD.A02;
            } else {
                throw AbstractC37303Gc4.A0M(sy7, "Unable to determine NIST curve type for ", AbstractC166987dD.A1C());
            }
            BigInteger order = eCParameterSpec.getOrder();
            if (bigInteger.signum() > 0 && bigInteger.compareTo(order) < 0) {
                if (sy7 == sy72) {
                    eCParameterSpec2 = AbstractC63391SjD.A00;
                } else if (sy7 == SY7.A02) {
                    eCParameterSpec2 = AbstractC63391SjD.A01;
                } else if (sy7 == SY7.A03) {
                    eCParameterSpec2 = AbstractC63391SjD.A02;
                } else {
                    throw AbstractC37303Gc4.A0M(sy7, "Unable to determine NIST curve type for ", AbstractC166987dD.A1C());
                }
                if (AbstractC63391SjD.A06(bigInteger, eCParameterSpec2).equals(eCPoint)) {
                    return new C60793RTe(publicKey, nistPrivateKeyValue, null);
                }
                throw AbstractC58318PtA.A0x("Invalid private value");
            }
            throw AbstractC58318PtA.A0x("Invalid private value");
        }
        throw AbstractC58318PtA.A0x("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
    }

    public C60793RTe(C60795RTg publicKey, SC3 nistPrivateKeyValue, C58552PxP x25519PrivateKeyBytes) {
        this.A00 = publicKey;
        this.A01 = nistPrivateKeyValue;
        this.A02 = x25519PrivateKeyBytes;
    }
}
