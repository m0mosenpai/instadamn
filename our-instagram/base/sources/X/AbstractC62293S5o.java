package X;

import android.security.keystore.KeyGenParameterSpec;

@Deprecated
/* renamed from: X.S5o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62293S5o {
    public static final KeyGenParameterSpec A00 = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
}
