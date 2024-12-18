package X;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.SUk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62863SUk {
    public static final EnumC61068Rei A00 = EnumC61068Rei.A01;
    public static final ThreadLocal A01 = new TYP();

    public static AlgorithmParameterSpec A00(final byte[] iv) {
        Integer A002;
        int length = iv.length;
        if (C2I7.A00(System.getProperty("java.vendor"), "The Android Project") && (A002 = S3L.A00()) != null && A002.intValue() <= 19) {
            return new IvParameterSpec(iv, 0, length);
        }
        return new GCMParameterSpec(128, iv, 0, length);
    }
}
