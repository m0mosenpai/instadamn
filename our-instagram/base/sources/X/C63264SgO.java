package X;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStore;
import javax.crypto.Cipher;

/* renamed from: X.SgO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63264SgO {
    public static KeyPair A00;
    public static KeyStore A01;
    public static Cipher A02;
    public static final C63264SgO A03 = new Object();

    public static final void A01(Context context) {
        if (A01 != null && A00 != null && A02 != null) {
            return;
        }
        KeyStore keyStore = (KeyStore) A00(C64997TbM.A00);
        if (keyStore != null) {
            A01 = keyStore;
        }
        if (A01 == null) {
            return;
        }
        Cipher cipher = (Cipher) A00(C64998TbN.A00);
        if (cipher != null) {
            A02 = cipher;
        }
        KeyPair keyPair = (KeyPair) A00(new X2w(context, 18));
        if (keyPair == null) {
            return;
        }
        A00 = keyPair;
    }

    public static final Object A00(InterfaceC16820sZ interfaceC16820sZ) {
        try {
            return interfaceC16820sZ.invoke();
        } catch (GeneralSecurityException e) {
            C0K8.A0F("CryptographyUtil", "Security Exception:", e);
            return null;
        }
    }
}
