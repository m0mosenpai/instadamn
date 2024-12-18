package X;

import android.content.Context;
import android.content.res.Resources;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/* renamed from: X.SKv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62661SKv {
    public static volatile C62661SKv A01;
    public Context A00;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SKv, java.lang.Object] */
    public static C62661SKv A00(Context context) {
        if (A01 == null) {
            synchronized (C62661SKv.class) {
                if (A01 == null) {
                    ?? obj = new Object();
                    obj.A00 = context.getApplicationContext();
                    A01 = obj;
                }
            }
        }
        return A01;
    }

    public final KeyPair A01(String str) {
        try {
            SharedPreferencesC63448SkR A00 = AbstractC62265S4k.A00(this.A00);
            String string = A00.getString(AnonymousClass001.A0R("pk_", str), null);
            String string2 = A00.getString(AnonymousClass001.A0R("sk_", str), null);
            if (string != null && string2 != null) {
                try {
                    return AbstractC58321PtD.A12(string, string2);
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                    throw new KeyStoreException(e);
                }
            }
            throw new Resources.NotFoundException(AnonymousClass001.A0g("Key specified by keyAlias: ", str, " does not exist in EncryptedSharedPreferences"));
        } catch (IllegalArgumentException | SecurityException | GeneralSecurityException e2) {
            throw new KeyStoreException(e2);
        }
    }
}
