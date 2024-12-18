package X;

import java.security.KeyPair;
import java.security.PublicKey;

/* renamed from: X.SNi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62718SNi {
    public final long A00;
    public final KeyPair A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C62718SNi)) {
            return false;
        }
        C62718SNi c62718SNi = (C62718SNi) obj;
        if (this.A00 != c62718SNi.A00) {
            return false;
        }
        KeyPair keyPair = this.A01;
        PublicKey publicKey = keyPair.getPublic();
        KeyPair keyPair2 = c62718SNi.A01;
        if (!publicKey.equals(keyPair2.getPublic())) {
            return false;
        }
        return AbstractC58320PtC.A1X(keyPair.getPrivate(), keyPair2.getPrivate());
    }

    public final int hashCode() {
        KeyPair keyPair = this.A01;
        return AbstractC58319PtB.A06(keyPair.getPublic(), keyPair.getPrivate(), Long.valueOf(this.A00));
    }

    public C62718SNi(KeyPair keyPair, long j) {
        this.A01 = keyPair;
        this.A00 = j;
    }
}
