package com.instagram.direct.msys.armadillo;

import X.C0w9;
import X.C60E;
import X.C9AD;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class IGSecureMessageCryptoProvider {
    public static boolean sInitialized;

    public static byte[] createCbcHmacDecryptedDataHandler(byte[] bArr, byte[] bArr2) {
        String str;
        String str2;
        if (bArr == null) {
            str = "msys_ig_create_cbc_hmac_decrypted_data";
            str2 = "Given cipherData is null.";
        } else {
            int length = bArr.length;
            str = "msys_ig_create_cbc_hmac_encrypted_data";
            if (length == 0) {
                str2 = "Given cipherData is of length 0.";
            } else if (33 >= length) {
                str2 = "Given cipherData is too short.";
            } else if (bArr2 == null) {
                str2 = "Given key is null.";
            } else if (bArr2.length == 0) {
                str2 = "Given key is of length 0.";
            } else {
                byte b = bArr[0];
                int i = (length - 32) - 1;
                byte[] bArr3 = new byte[i];
                System.arraycopy(bArr, 1, bArr3, 0, i);
                byte[] bArr4 = new byte[32];
                System.arraycopy(bArr, i + 1, bArr4, 0, 32);
                byte[] createKeyMaterialForCBC = createKeyMaterialForCBC(bArr2, b);
                byte[] bArr5 = new byte[16];
                System.arraycopy(createKeyMaterialForCBC, 0, bArr5, 0, 16);
                byte[] bArr6 = new byte[16];
                System.arraycopy(createKeyMaterialForCBC, 16, bArr6, 0, 16);
                if (!Arrays.equals(bArr4, doHmacSHA256(bArr6, bArr3))) {
                    str2 = "computedHmac came back with unexpected length.";
                } else {
                    byte[] bArr7 = new byte[16];
                    System.arraycopy(bArr3, 0, bArr7, 0, 16);
                    int i2 = i - 16;
                    byte[] bArr8 = new byte[i2];
                    System.arraycopy(bArr3, 16, bArr8, 0, i2);
                    return decrypt(bArr5, bArr7, bArr8);
                }
            }
        }
        C0w9.A03(str, str2);
        return null;
    }

    public static byte[] createCbcHmacEncryptedDataHandler(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr2 == null) {
            str = "Given key is null.";
        } else if (bArr2.length == 0) {
            str = "Given key is of length 0.";
        } else if (bArr == null) {
            str = "Given plainData is null.";
        } else if (bArr.length == 0) {
            str = "Given plainData is of length 0.";
        } else {
            byte[] createKeyMaterialForCBC = createKeyMaterialForCBC(bArr2, 0);
            byte[] bArr3 = new byte[16];
            System.arraycopy(createKeyMaterialForCBC, 0, bArr3, 0, 16);
            byte[] bArr4 = new byte[16];
            System.arraycopy(createKeyMaterialForCBC, 16, bArr4, 0, 16);
            byte[] bArr5 = new byte[16];
            generateRandomBytes(bArr5);
            byte[] encrypt = encrypt(bArr3, bArr5, bArr);
            if (encrypt == null) {
                str = "cbcCiphterText came back null.";
            } else {
                int length = encrypt.length;
                int i = length + 16;
                byte[] bArr6 = new byte[i];
                System.arraycopy(bArr5, 0, bArr6, 0, 16);
                System.arraycopy(encrypt, 0, bArr6, 16, length);
                byte[] doHmacSHA256 = doHmacSHA256(bArr4, bArr6);
                if (doHmacSHA256 == null) {
                    str = "hmac came back null.";
                } else {
                    byte[] bArr7 = new byte[i + 32 + 1];
                    bArr7[0] = 0;
                    System.arraycopy(bArr6, 0, bArr7, 1, i);
                    System.arraycopy(doHmacSHA256, 0, bArr7, i + 1, 32);
                    return bArr7;
                }
            }
        }
        C0w9.A03("msys_ig_create_cbc_hmac_encrypted_data", str);
        return null;
    }

    public static byte[] createKeyMaterialForCBC(byte[] bArr, int i) {
        return createSHA256HKDFData(bArr, new byte[]{(byte) i}, "IGSecureStorage".getBytes(Charset.defaultCharset()), 32);
    }

    public static byte[] doHmacSHA256(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec;
        if (bArr2 == null) {
            C0w9.A03("msys_ig_do_hmac_sha_256", "Given data is null.");
            return null;
        }
        Mac mac = getMac();
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
                    mac.init(secretKeySpec);
                    return mac.doFinal(bArr2);
                }
            } catch (InvalidKeyException e) {
                C0w9.A07("msys_ig_do_hmac_sha_256", e);
                return null;
            }
        }
        secretKeySpec = new SecretKeySpec(new byte[1], "HmacSHA256");
        mac.init(secretKeySpec);
        return mac.doFinal(bArr2);
    }

    public static byte[] getCiphertext(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            return getCipher(1, secretKeySpec, ivParameterSpec).doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            C0w9.A07("msys_ig_get_cipher_text", e);
            return null;
        }
    }

    public static byte[] getPlaintext(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            return getCipher(2, secretKeySpec, ivParameterSpec).doFinal(bArr);
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            C0w9.A07("msys_ig_get_plain_text", e);
            return null;
        }
    }

    public static native void nativeRegisterCryptoProviderHandler();

    public static byte[] createSHA256HKDFData(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (i <= 8160) {
            byte[] doHmacSHA256 = doHmacSHA256(bArr2, bArr);
            if (doHmacSHA256 != null) {
                int ceil = (int) Math.ceil(i / 32.0d);
                byte[] bArr4 = new byte[i];
                byte[] bArr5 = new byte[32];
                int i2 = 0;
                int i3 = 0;
                while (i2 < ceil) {
                    Mac mac = getMac();
                    try {
                        mac.init(new SecretKeySpec(doHmacSHA256, "HmacSHA256"));
                        if (i2 > 0) {
                            mac.update(bArr5);
                        }
                        mac.update(bArr3);
                        i2++;
                        mac.update(new byte[]{(byte) i2});
                        bArr5 = mac.doFinal();
                        int min = Math.min(i - i3, 32);
                        System.arraycopy(bArr5, 0, bArr4, i3, min);
                        i3 += min;
                    } catch (InvalidKeyException e) {
                        C0w9.A07("msys_ig_create_sha_256_hkdf_data", e);
                        throw new AssertionError(e);
                    }
                }
                if (i3 == i) {
                    return bArr4;
                }
                C0w9.A03("msys_ig_create_sha_256_hkdf_data", "copiedBytes did not come back with the correct size.");
                throw new AssertionError("copiedBytes did not come back with the correct size.");
            }
            C0w9.A03("msys_ig_create_sha_256_hkdf_data", "hmac came back null.");
            throw new AssertionError("doHmacSHA256 returns null.");
        }
        C0w9.A03("msys_ig_create_sha_256_hkdf_data", "Output size is too big.");
        throw new AssertionError("Output size is too big.");
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return getPlaintext(new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2), bArr3);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return getCiphertext(new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2), bArr3);
    }

    public static void generateRandomBytes(byte[] bArr) {
        new SecureRandom().nextBytes(bArr);
    }

    public static Cipher getCipher(int i, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(i, secretKeySpec, ivParameterSpec);
            return cipher;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            C0w9.A07("msys_ig_get_cipher", e);
            throw new AssertionError(e);
        }
    }

    public static Mac getMac() {
        try {
            return Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            C0w9.A07("msys_ig_get_mac", e);
            throw new AssertionError(e);
        }
    }

    public static byte[] getSHA256Hash(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            C0w9.A07("msys_ig_get_sha_256_hash", e);
            throw new AssertionError(e);
        }
    }

    static {
        C9AD.A00();
        C60E.A00();
    }
}
