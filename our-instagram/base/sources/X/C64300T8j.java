package X;

import java.nio.ByteBuffer;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.T8j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64300T8j implements InterfaceC65427Tjy {
    public static final C62717SNg A06;
    public static final C62717SNg A07;
    public static final byte[] A08 = new byte[0];
    public final InterfaceC65522Tlr A00;
    public final SC2 A01;
    public final EnumC61106RfL A02;
    public final String A03;
    public final byte[] A04;
    public final byte[] A05;

    static {
        SYK syk = new SYK();
        syk.A01(EnumC61105RfK.NIST_P256, SY7.A01);
        syk.A01(EnumC61105RfK.NIST_P384, SY7.A02);
        A06 = SYK.A00(syk, EnumC61105RfK.NIST_P521, SY7.A03);
        SYK syk2 = new SYK();
        syk2.A01(EnumC61106RfL.UNCOMPRESSED, SY4.A03);
        syk2.A01(EnumC61106RfL.COMPRESSED, SY4.A01);
        A07 = SYK.A00(syk2, EnumC61106RfL.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, SY4.A02);
    }

    public static InterfaceC65522Tlr A00(AbstractC61590RqE parameters) {
        if (parameters instanceof C58529Pwx) {
            return new T9E((C58529Pwx) parameters);
        }
        if (parameters instanceof RTQ) {
            return new T9F((RTQ) parameters);
        }
        if (parameters instanceof C58556PxX) {
            return new T9G((C58556PxX) parameters);
        }
        throw AbstractC58320PtC.A19(parameters, "Unsupported parameters for Ecies: ", AbstractC166987dD.A1C());
    }

    public static final String A01(SYB hash) {
        if (hash.equals(SYB.A01)) {
            return "HmacSha1";
        }
        if (hash.equals(SYB.A02)) {
            return "HmacSha224";
        }
        if (hash.equals(SYB.A03)) {
            return "HmacSha256";
        }
        if (hash.equals(SYB.A04)) {
            return "HmacSha384";
        }
        if (hash.equals(SYB.A05)) {
            return "HmacSha512";
        }
        throw AbstractC58320PtC.A19(hash, "hash unsupported for EciesAeadHkdf: ", AbstractC166987dD.A1C());
    }

    @Override // X.InterfaceC65427Tjy
    public final byte[] ASM(final byte[] plaintext, final byte[] contextInfo) {
        SecretKeySpec A16;
        byte[] ASN;
        SC2 sc2 = this.A01;
        String str = this.A03;
        byte[] bArr = this.A04;
        InterfaceC65522Tlr interfaceC65522Tlr = this.A00;
        int C4h = interfaceC65522Tlr.C4h();
        EnumC61106RfL enumC61106RfL = this.A02;
        ECPublicKey eCPublicKey = sc2.A00;
        ECParameterSpec params = eCPublicKey.getParams();
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) InterfaceC65621ToC.A00(C62890SVv.A04, "EC");
        keyPairGenerator.initialize(params);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey2 = (ECPublicKey) generateKeyPair.getPublic();
        byte[] A04 = AbstractC63316ShO.A04((ECPrivateKey) generateKeyPair.getPrivate(), eCPublicKey);
        byte[] A03 = AbstractC63316ShO.A03(enumC61106RfL, eCPublicKey2.getW(), eCPublicKey2.getParams().getCurve());
        byte[] A01 = AbstractC63315ShN.A01(A03, A04);
        Mac mac = (Mac) InterfaceC65621ToC.A00(C62890SVv.A05, str);
        if (C4h <= mac.getMacLength() * 255) {
            if (bArr.length == 0) {
                A16 = AbstractC58318PtA.A16(str, new byte[mac.getMacLength()]);
            } else {
                A16 = AbstractC58318PtA.A16(str, bArr);
            }
            mac.init(A16);
            byte[] bArr2 = new byte[C4h];
            mac.init(AbstractC58318PtA.A16(str, mac.doFinal(A01)));
            byte[] bArr3 = new byte[0];
            int i = 1;
            int i2 = 0;
            while (true) {
                mac.update(bArr3);
                mac.update(contextInfo);
                mac.update((byte) i);
                bArr3 = mac.doFinal();
                int length = bArr3.length;
                if (length + i2 >= C4h) {
                    break;
                }
                System.arraycopy(bArr3, 0, bArr2, i2, length);
                i2 += length;
                i++;
            }
            System.arraycopy(bArr3, 0, bArr2, i2, C4h - i2);
            C58526Pwu A00 = C58526Pwu.A00(A03);
            SW6 AaL = interfaceC65522Tlr.AaL(new C58526Pwu(bArr2, C4h).A01());
            byte[] bArr4 = A08;
            InterfaceC65518Tln interfaceC65518Tln = AaL.A00;
            if (interfaceC65518Tln != null) {
                ASN = interfaceC65518Tln.ASM(plaintext, bArr4);
            } else {
                ASN = AaL.A01.ASN(plaintext, bArr4);
            }
            byte[] A012 = A00.A01();
            ByteBuffer allocate = ByteBuffer.allocate(A012.length + ASN.length);
            allocate.put(A012);
            allocate.put(ASN);
            byte[] array = allocate.array();
            byte[] bArr5 = this.A05;
            if (bArr5.length != 0) {
                return AbstractC63315ShN.A01(bArr5, array);
            }
            return array;
        }
        throw AbstractC58318PtA.A0x("size too large");
    }

    public C64300T8j(final InterfaceC65522Tlr recipientPublicKey, final EnumC61106RfL hkdfSalt, String hkdfHmacAlgo, ECPublicKey ecPointFormat, byte[] demHelper, byte[] outputPrefix) {
        AbstractC63391SjD.A07(ecPointFormat.getW(), ecPointFormat.getParams().getCurve());
        this.A01 = new SC2(ecPointFormat);
        this.A04 = demHelper;
        this.A03 = hkdfHmacAlgo;
        this.A02 = hkdfSalt;
        this.A00 = recipientPublicKey;
        this.A05 = outputPrefix;
    }
}
