package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.SbY, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63052SbY {
    /* JADX WARN: Type inference failed for: r3v10, types: [X.SIZ, java.lang.Object] */
    public static SIZ A00(C62616SIy c62616SIy, byte[] bArr, byte[] bArr2) {
        int length;
        int length2;
        int length3;
        try {
            EnumC61179Rgf enumC61179Rgf = c62616SIy.A02;
            int i = enumC61179Rgf.A01;
            if (i == EnumC61179Rgf.DHKEM_P256_SHA256.A01) {
                EnumC61177Rgd enumC61177Rgd = c62616SIy.A01;
                int i2 = enumC61177Rgd.A01;
                if (i2 == EnumC61177Rgd.SHA256.A01) {
                    ECPrivateKey eCPrivateKey = c62616SIy.A05;
                    C14360o3.A07(eCPrivateKey);
                    ECPublicKey eCPublicKey = c62616SIy.A06;
                    C14360o3.A07(eCPublicKey);
                    C14360o3.A07(enumC61179Rgf);
                    C14360o3.A0B(bArr, 0);
                    BigInteger bigInteger = SVD.A01;
                    if (bArr.length == 65) {
                        if (bArr[0] == 4) {
                            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, 33)), new BigInteger(1, Arrays.copyOfRange(bArr, 33, 65)));
                            SVD.A00(eCPoint);
                            SVD.A00(eCPoint);
                            PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, SVD.A00));
                            C14360o3.A07(generatePublic);
                            KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                            if (keyAgreement != null) {
                                keyAgreement.init(eCPrivateKey);
                                keyAgreement.doPhase(generatePublic, true);
                                byte[] generateSecret = keyAgreement.generateSecret();
                                C14360o3.A07(generateSecret);
                                ECPoint w = eCPublicKey.getW();
                                SVD.A00(w);
                                byte[] bArr3 = new byte[65];
                                BigInteger affineX = w.getAffineX();
                                BigInteger affineY = w.getAffineY();
                                if (affineX.signum() != 0 || affineY.signum() != 0) {
                                    byte[] byteArray = affineX.toByteArray();
                                    int i3 = 0;
                                    while (true) {
                                        length = byteArray.length;
                                        if (i3 >= length - 1 || byteArray[i3] != 0) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (i3 != 0) {
                                        byteArray = Arrays.copyOfRange(byteArray, i3, length);
                                    }
                                    byte[] byteArray2 = affineY.toByteArray();
                                    int i4 = 0;
                                    while (true) {
                                        length2 = byteArray2.length;
                                        if (i4 >= length2 - 1 || byteArray2[i4] != 0) {
                                            break;
                                        }
                                        i4++;
                                    }
                                    if (i4 != 0) {
                                        byteArray2 = Arrays.copyOfRange(byteArray2, i4, length2);
                                    }
                                    int length4 = byteArray.length;
                                    if (length4 <= 32 && (length3 = byteArray2.length) <= 32) {
                                        bArr3[0] = 4;
                                        System.arraycopy(byteArray, 0, bArr3, (32 - length4) + 1, length4);
                                        System.arraycopy(byteArray2, 0, bArr3, 65 - length3, length3);
                                    } else {
                                        throw new InvalidParameterException("Point provided does not conform to P256 coordinate size");
                                    }
                                }
                                byte[] A02 = AbstractC63266SgQ.A02(bArr, bArr3);
                                C14360o3.A07(A02);
                                byte[] A022 = AbstractC63266SgQ.A02(AbstractC63266SgQ.A03, AbstractC63266SgQ.A00(i));
                                int i5 = enumC61179Rgf.A00;
                                byte[] bArr4 = AbstractC63266SgQ.A00;
                                byte[] bArr5 = AbstractC63266SgQ.A02;
                                byte[] A01 = AbstractC63266SgQ.A01(AbstractC58318PtA.A16("HmacSHA256", AbstractC58320PtC.A1Z(new byte[32], AbstractC63266SgQ.A02(bArr5, A022, bArr4, generateSecret))), AbstractC63266SgQ.A04, A02, A022, i5);
                                C14360o3.A07(A01);
                                byte[] bArr6 = SIZ.A05;
                                byte b = c62616SIy.A03.A00;
                                ?? obj = new Object();
                                if (b == 0) {
                                    EnumC61189Rgp enumC61189Rgp = c62616SIy.A00;
                                    int i6 = enumC61189Rgp.A03;
                                    int i7 = enumC61189Rgp.A00;
                                    int i8 = enumC61189Rgp.A01;
                                    int i9 = enumC61177Rgd.A00;
                                    byte[] A023 = AbstractC63266SgQ.A02(AbstractC63266SgQ.A01, AbstractC63266SgQ.A00(i), AbstractC63266SgQ.A00(i2), AbstractC63266SgQ.A00(i6));
                                    byte[] A1Z = AbstractC58320PtC.A1Z(new byte[i9], AbstractC63266SgQ.A02(bArr5, A023, SIZ.A08, new byte[0]));
                                    byte[] A1Z2 = AbstractC58320PtC.A1Z(new byte[i9], AbstractC63266SgQ.A02(bArr5, A023, SIZ.A06, bArr2));
                                    ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
                                    A0U.write(b);
                                    A0U.write(A1Z);
                                    A0U.write(A1Z2);
                                    obj.A02 = A0U.toByteArray();
                                    byte[] A1Z3 = AbstractC58320PtC.A1Z(A01, AbstractC63266SgQ.A02(bArr5, A023, SIZ.A09, new byte[0]));
                                    obj.A03 = A1Z3;
                                    SecretKeySpec A16 = AbstractC58318PtA.A16("HmacSHA256", A1Z3);
                                    obj.A01 = AbstractC63266SgQ.A01(A16, SIZ.A07, obj.A02, A023, i7);
                                    byte[] A012 = AbstractC63266SgQ.A01(A16, SIZ.A05, obj.A02, A023, i8);
                                    obj.A00 = A012;
                                    obj.A04 = new byte[A012.length];
                                    return obj;
                                }
                                throw AbstractC166987dD.A1D("Only mode_base is supported");
                            }
                            throw new NoSuchAlgorithmException("Could not get instance of KeyAgreement for algorithm ECDH.");
                        }
                        throw MSW.A0y("Only uncompressed point format accepted");
                    }
                    throw MSW.A0y("Point does not match P256 EC field size");
                }
                throw new Exception("Only HKDF-SHA256 is supported.");
            }
            throw new Exception("Only DHKEM_P256_SHA256 is supported.");
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | InvalidParameterException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new Exception(e);
        }
    }

    public static byte[] A01(SIZ siz, C62616SIy c62616SIy, byte[] bArr, byte[] bArr2) {
        SXr r2u;
        try {
            int i = c62616SIy.A00.A03;
            if (i == EnumC61189Rgp.AES128GCM.A03) {
                r2u = new R2T();
            } else if (i == EnumC61189Rgp.AES256GCM.A03) {
                r2u = new R2U();
            } else {
                throw new Exception("Only AES256GCM or AES128GCM are supported.");
            }
            byte[] bArr3 = siz.A00;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            for (int i2 = 0; i2 < length; i2++) {
                bArr4[i2] = (byte) (bArr4[i2] ^ siz.A04[i2]);
            }
            byte[] A00 = r2u.A00(siz.A01, bArr4, bArr, bArr2);
            byte[] bArr5 = siz.A04;
            boolean z = false;
            for (int length2 = bArr5.length - 1; length2 >= 0 && !z; length2--) {
                byte b = bArr5[length2];
                if (b != -1) {
                    bArr5[length2] = (byte) (b + 1);
                    z = true;
                } else {
                    bArr5[length2] = 0;
                }
            }
            return A00;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new Exception(e);
        }
    }

    public static byte[] A02(SIZ siz, String str, byte[] bArr, byte[] bArr2) {
        SXr r2u;
        try {
            long parseLong = (Long.parseLong(str, 16) >> 16) & 65535;
            if (parseLong == EnumC61189Rgp.AES128GCM.A03) {
                r2u = new R2T();
            } else if (parseLong == EnumC61189Rgp.AES256GCM.A03) {
                r2u = new R2U();
            } else {
                throw new Exception("Only AES256GCM or AES128GCM are supported.");
            }
            byte[] bArr3 = siz.A00;
            int length = bArr3.length;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, 0, bArr4, 0, length);
            for (int i = 0; i < length; i++) {
                bArr4[i] = (byte) (bArr4[i] ^ siz.A04[i]);
            }
            byte[] A00 = r2u.A00(siz.A01, bArr4, bArr, bArr2);
            byte[] bArr5 = siz.A04;
            boolean z = false;
            for (int length2 = bArr5.length - 1; length2 >= 0 && !z; length2--) {
                byte b = bArr5[length2];
                if (b != -1) {
                    bArr5[length2] = (byte) (b + 1);
                    z = true;
                } else {
                    bArr5[length2] = 0;
                }
            }
            return A00;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new Exception(e);
        }
    }
}
