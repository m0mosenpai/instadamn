package X;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.Mac;

/* renamed from: X.T8y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64315T8y implements InterfaceC65520Tlp {
    public final C62986SaA A00;
    public final EnumC61105RfK A01;

    @Override // X.InterfaceC65520Tlp
    public final C62499SEb ARx(byte[] recipientPublicKey) {
        EnumC61105RfK enumC61105RfK = this.A01;
        ECParameterSpec A00 = AbstractC63316ShO.A00(enumC61105RfK);
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) InterfaceC65621ToC.A00(C62890SVv.A04, "EC");
        keyPairGenerator.initialize(A00);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        EnumC61106RfL enumC61106RfL = EnumC61106RfL.UNCOMPRESSED;
        ECParameterSpec A002 = AbstractC63316ShO.A00(enumC61105RfK);
        byte[] A04 = AbstractC63316ShO.A04((ECPrivateKey) generateKeyPair.getPrivate(), (ECPublicKey) InterfaceC65621ToC.A01(A002, AbstractC63316ShO.A01(A002.getCurve(), recipientPublicKey)));
        byte[] A03 = AbstractC63316ShO.A03(enumC61106RfL, ((ECPublicKey) generateKeyPair.getPublic()).getW(), AbstractC63316ShO.A00(enumC61105RfK).getCurve());
        byte[] A01 = AbstractC63315ShN.A01(A03, recipientPublicKey);
        byte[] A012 = AbstractC63315ShN.A01(AbstractC63126SdU.A0B, BKR());
        C62986SaA c62986SaA = this.A00;
        return new C62499SEb(c62986SaA.A03(A04, A01, A012, Mac.getInstance(c62986SaA.A00).getMacLength()), A03);
    }

    @Override // X.InterfaceC65520Tlp
    public final byte[] BKR() {
        int ordinal = this.A01.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return AbstractC63126SdU.A0E;
            }
            return AbstractC63126SdU.A0D;
        }
        return AbstractC63126SdU.A0C;
    }

    public C64315T8y(C62986SaA hkdf, EnumC61105RfK curve) {
        this.A00 = hkdf;
        this.A01 = curve;
    }
}
