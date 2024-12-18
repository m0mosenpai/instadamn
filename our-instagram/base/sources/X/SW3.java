package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import java.security.KeyStore;

/* loaded from: classes10.dex */
public final class SW3 {
    public final Context A00;
    public final KeyStore A01;

    public static void A00(KeyGenParameterSpec.Builder builder, C62608SIp c62608SIp) {
        if (c62608SIp.A05) {
            builder.setUserAuthenticationParameters(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD, 2);
        }
    }

    public SW3(Context context) {
        try {
            context.getMainExecutor().execute(new TJ0());
        } catch (Exception unused) {
        }
        this.A00 = context;
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        this.A01 = keyStore;
    }
}
