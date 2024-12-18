package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.Sdn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63141Sdn {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;

    public C63141Sdn(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public C63141Sdn(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public C63141Sdn(Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
