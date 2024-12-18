package X;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* renamed from: X.ToC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC65621ToC {
    Object BIY(String algorithm);

    static Object A00(C62890SVv c62890SVv, String str) {
        return c62890SVv.A00.BIY(str);
    }

    static PublicKey A01(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return ((KeyFactory) C62890SVv.A03.A00.BIY("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }
}
