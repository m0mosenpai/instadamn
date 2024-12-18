package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/* renamed from: X.Rcd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60955Rcd extends AbstractC23921Fc {
    public byte[] A00;
    public final KeyStore.PrivateKeyEntry A01;
    public final SharedPreferences A02;
    public final String A03;

    @Override // X.AbstractC23921Fc
    public final String A03() {
        return "AsymmetricTransformer";
    }

    @Override // X.AbstractC23921Fc
    public final SharedPreferences A02() {
        return this.A02;
    }

    @Override // X.AbstractC23921Fc
    public final SecretKey A04(boolean z) {
        SecretKey secretKey;
        byte[] bArr;
        byte[] bArr2 = this.A00;
        if ((bArr2 != null || this.A02.contains(this.A03)) && !z) {
            if (bArr2 == null) {
                bArr2 = Base64.decode(this.A02.getString(this.A03, null), 0);
            }
            try {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(4, this.A01.getPrivateKey());
                secretKey = (SecretKey) cipher.unwrap(bArr2, "AES", 3);
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                C0w9.A07("AsymmetricTransformer", e);
                secretKey = null;
            }
            if (secretKey == null) {
                throw new InvalidKeyException("No key found");
            }
        } else {
            byte[] bArr3 = new byte[16];
            new SecureRandom().nextBytes(bArr3);
            secretKey = AbstractC58318PtA.A16("AES/GCM/NoPadding", bArr3);
            try {
                Cipher cipher2 = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher2.init(3, this.A01.getCertificate().getPublicKey());
                bArr = cipher2.wrap(secretKey);
            } catch (InvalidKeyException | NoSuchAlgorithmException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                C0w9.A07("AsymmetricTransformer", e2);
                bArr = null;
            }
            this.A00 = bArr;
            AbstractC58318PtA.A1C(this.A02.edit(), this.A03, Base64.encodeToString(this.A00, 0));
        }
        return secretKey;
    }

    @Override // X.InterfaceC23931Fd
    public final Integer CBu() {
        return C05F.A01;
    }

    @Override // X.InterfaceC23931Fd
    public final String getName() {
        return this.A03;
    }

    public C60955Rcd(Context context, String str, KeyStore.PrivateKeyEntry privateKeyEntry) {
        this.A03 = str;
        this.A01 = privateKeyEntry;
        this.A02 = AbstractC58318PtA.A0F(context, "pair_prefs");
    }
}
