package X;

import java.math.BigInteger;
import java.nio.charset.Charset;

/* renamed from: X.T8k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64301T8k implements InterfaceC65427Tjy {
    public static final byte[] A05 = new byte[0];
    public final C62986SaA A00;
    public final InterfaceC65550TmT A01;
    public final InterfaceC65520Tlp A02;
    public final byte[] A03;
    public final byte[] A04;

    public static C62986SaA A00(RTY kdfId) {
        String str;
        if (kdfId.equals(RTY.A00)) {
            str = "HmacSha256";
        } else if (kdfId.equals(RTY.A01)) {
            str = "HmacSha384";
        } else if (kdfId.equals(RTY.A02)) {
            str = "HmacSha512";
        } else {
            throw AbstractC58318PtA.A0x("Unrecognized HPKE KDF identifier");
        }
        return new C62986SaA(str);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.TmT] */
    public static InterfaceC65550TmT A01(RTX aeadId) {
        int i;
        if (aeadId.equals(RTX.A00)) {
            i = 16;
        } else if (aeadId.equals(RTX.A01)) {
            i = 32;
        } else {
            if (aeadId.equals(RTX.A02)) {
                return new Object();
            }
            throw AbstractC58318PtA.A0x("Unrecognized HPKE AEAD identifier");
        }
        return new C64313T8w(i);
    }

    public static InterfaceC65520Tlp A02(RTZ kemId) {
        EnumC61105RfK enumC61105RfK;
        C62986SaA c62986SaA;
        EnumC61105RfK enumC61105RfK2;
        if (kemId.equals(RTZ.A03)) {
            return new C64314T8x(new C62986SaA("HmacSha256"));
        }
        if (kemId.equals(RTZ.A00)) {
            enumC61105RfK = EnumC61105RfK.NIST_P256;
        } else if (kemId.equals(RTZ.A01)) {
            enumC61105RfK = EnumC61105RfK.NIST_P384;
        } else if (kemId.equals(RTZ.A02)) {
            enumC61105RfK = EnumC61105RfK.NIST_P521;
        } else {
            throw AbstractC58318PtA.A0x("Unrecognized HPKE KEM identifier");
        }
        int ordinal = enumC61105RfK.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                c62986SaA = new C62986SaA("HmacSha512");
                enumC61105RfK2 = EnumC61105RfK.NIST_P521;
            } else {
                c62986SaA = new C62986SaA("HmacSha384");
                enumC61105RfK2 = EnumC61105RfK.NIST_P384;
            }
        } else {
            c62986SaA = new C62986SaA("HmacSha256");
            enumC61105RfK2 = EnumC61105RfK.NIST_P256;
        }
        return new C64315T8y(c62986SaA, enumC61105RfK2);
    }

    @Override // X.InterfaceC65427Tjy
    public final byte[] ASM(final byte[] plaintext, final byte[] contextInfo) {
        byte[] bArr = this.A03;
        InterfaceC65520Tlp interfaceC65520Tlp = this.A02;
        C62986SaA c62986SaA = this.A00;
        InterfaceC65550TmT interfaceC65550TmT = this.A01;
        C62499SEb ARx = interfaceC65520Tlp.ARx(bArr);
        byte[] bArr2 = ARx.A00;
        byte[] bArr3 = ARx.A01;
        byte[] bArr4 = AbstractC63126SdU.A03;
        byte[] A04 = AbstractC63315ShN.A04(AbstractC63126SdU.A09, interfaceC65520Tlp.BKR(), c62986SaA.A01(), interfaceC65550TmT.AaK());
        byte[] bArr5 = AbstractC63126SdU.A05;
        byte[] bArr6 = AbstractC62332S7c.A00;
        byte[] A042 = AbstractC63315ShN.A04(bArr4, c62986SaA.A02("psk_id_hash", bArr5, bArr6, A04), c62986SaA.A02("info_hash", bArr5, contextInfo, A04));
        byte[] A02 = c62986SaA.A02("secret", bArr3, bArr6, A04);
        int BKj = interfaceC65550TmT.BKj();
        byte[] A01 = AbstractC63126SdU.A01(2, BKj);
        byte[] bArr7 = AbstractC63126SdU.A0A;
        Charset charset = AbstractC58538Px6.A00;
        byte[] A00 = C62986SaA.A00(c62986SaA, A02, AbstractC63315ShN.A04(A01, bArr7, A04, "key".getBytes(charset), A042), BKj);
        byte[] A002 = C62986SaA.A00(c62986SaA, A02, AbstractC63315ShN.A04(AbstractC63126SdU.A01(2, 12), bArr7, A04, "base_nonce".getBytes(charset), A042), 12);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger subtract = bigInteger.shiftLeft(96).subtract(bigInteger);
        BigInteger bigInteger2 = BigInteger.ZERO;
        byte[] bArr8 = A05;
        byte[] A022 = AbstractC63315ShN.A02(A002, SSS.A01(bigInteger2, 12));
        if (bigInteger2.compareTo(subtract) < 0) {
            bigInteger2.add(bigInteger);
            byte[] A012 = AbstractC63315ShN.A01(bArr2, interfaceC65550TmT.EMX(A00, A022, plaintext, bArr8));
            byte[] bArr9 = this.A04;
            if (bArr9.length != 0) {
                return AbstractC63315ShN.A01(bArr9, A012);
            }
            return A012;
        }
        throw AbstractC58318PtA.A0x("message limit reached");
    }

    public C64301T8k(C62986SaA recipientPublicKey, InterfaceC65550TmT kem, InterfaceC65520Tlp kdf, C58526Pwu aead, C58526Pwu outputPrefix) {
        this.A03 = aead.A01();
        this.A02 = kdf;
        this.A00 = recipientPublicKey;
        this.A01 = kem;
        this.A04 = outputPrefix.A01();
    }
}
