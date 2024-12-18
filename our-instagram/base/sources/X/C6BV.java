package X;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: X.6BV, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BV {
    public final SecretKey A00;

    public C6BV() {
        SecretKey generateKey = KeyGenerator.getInstance("AES").generateKey();
        C14360o3.A07(generateKey);
        this.A00 = generateKey;
    }
}
