package X;

import android.security.identity.IdentityCredential;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.Sgr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63291Sgr {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;
    public final IdentityCredential A03;

    public final IdentityCredential A00() {
        return this.A03;
    }

    public C63291Sgr(IdentityCredential identityCredential) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = identityCredential;
    }

    public C63291Sgr(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public C63291Sgr(Cipher cipher) {
        this.A00 = null;
        this.A01 = cipher;
        this.A02 = null;
        this.A03 = null;
    }

    public C63291Sgr(Mac mac) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = mac;
        this.A03 = null;
    }
}
