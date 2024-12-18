package X;

/* renamed from: X.Ssb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63721Ssb implements InterfaceC50415MNr {
    public final android.net.Uri A00;
    public final String A01;

    @Override // X.InterfaceC50415MNr
    public final String Bqb() {
        return this.A01;
    }

    public final String toString() {
        return AbstractC166987dD.A19(this.A00);
    }

    public C63721Ssb(android.net.Uri uri) {
        this.A00 = uri;
        this.A01 = uri.getScheme();
        C14360o3.A07(uri.getSchemeSpecificPart());
        uri.getPath();
    }
}
