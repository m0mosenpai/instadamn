package X;

/* renamed from: X.7UU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UU implements C7UV {
    @Override // X.C7UV
    public final boolean Cni(String str) {
        return AbstractC001900j.A0a(str, "giphy.com/", false);
    }

    @Override // X.C7UV
    public final String ELX(String str) {
        java.net.URI uri = new java.net.URI(str);
        android.net.Uri A03 = AbstractC08820cl.A03(new java.net.URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString());
        C14360o3.A07(A03);
        String path = A03.getPath();
        if (path == null) {
            return "";
        }
        return path;
    }
}
