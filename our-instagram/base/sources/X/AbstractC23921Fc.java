package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: X.1Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23921Fc implements InterfaceC23931Fd {
    public abstract SharedPreferences A02();

    public abstract String A03();

    public abstract SecretKey A04(boolean z);

    @Override // X.InterfaceC23931Fd
    public final OutputStream C2b(Context context) {
        Cipher cipher;
        CipherOutputStream cipherOutputStream;
        CipherOutputStream cipherOutputStream2 = null;
        try {
            File file = new File(A01(context));
            if (file.exists()) {
                file.delete();
            } else {
                new File(file.getParent()).mkdirs();
            }
            file.createNewFile();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, A04(true));
            cipherOutputStream = new CipherOutputStream(bufferedOutputStream, cipher);
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            e = e;
        }
        try {
            A02().edit().putString(getName(), Base64.encodeToString(cipher.getIV(), 0)).apply();
            return cipherOutputStream;
        } catch (IOException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e2) {
            e = e2;
            cipherOutputStream2 = cipherOutputStream;
            C0w9.A07(A03(), e);
            return cipherOutputStream2;
        }
    }

    @Override // X.InterfaceC23931Fd
    public final InputStream Eoz(Context context) {
        GCMParameterSpec gCMParameterSpec;
        try {
            String string = A02().getString(getName(), null);
            if (string != null) {
                gCMParameterSpec = new GCMParameterSpec(128, Base64.decode(string, 0));
            } else {
                gCMParameterSpec = null;
            }
            if (gCMParameterSpec != null) {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, A04(false), gCMParameterSpec);
                return new CipherInputStream(new BufferedInputStream(new FileInputStream(A01(context))), cipher);
            }
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            C0w9.A07(A03(), e);
        }
        return null;
    }

    private String A01(Context context) {
        C23161Av A00;
        int i;
        int intValue = CBu().intValue();
        if (intValue != 2) {
            A00 = C23161Av.A00(context);
            if (intValue != 1) {
                i = 557628693;
            } else {
                i = 1485823976;
            }
        } else {
            A00 = C23161Av.A00(context);
            i = 69931577;
        }
        return new File(A00.CHo(null, i), getName()).getCanonicalPath();
    }
}
