package X;

/* renamed from: X.LRu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48120LRu implements InterfaceC50415MNr {
    public final String A00;
    public final java.net.URI A01;

    @Override // X.InterfaceC50415MNr
    public final String Bqb() {
        return this.A00;
    }

    public final String toString() {
        return AbstractC166987dD.A19(this.A01);
    }

    public C48120LRu(java.net.URI uri) {
        this.A01 = uri;
        this.A00 = uri.getScheme();
        C14360o3.A07(uri.getSchemeSpecificPart());
        uri.getPath();
    }
}
