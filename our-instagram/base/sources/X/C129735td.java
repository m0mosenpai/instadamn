package X;

import javax.crypto.Mac;

/* renamed from: X.5td, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C129735td extends AbstractC50512Tw {
    public boolean A00;
    public final Mac A01;

    @Override // X.AbstractC50512Tw
    public final void A00(byte b) {
        C18C.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A01.update(b);
    }

    @Override // X.AbstractC50512Tw
    public final void A01(byte[] b) {
        C18C.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A01.update(b);
    }

    @Override // X.AbstractC50512Tw
    public final void A02(byte[] b, int off, int len) {
        C18C.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A01.update(b, off, len);
    }

    public C129735td(Mac mac) {
        this.A01 = mac;
    }
}
