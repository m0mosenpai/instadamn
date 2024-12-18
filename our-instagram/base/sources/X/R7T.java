package X;

/* loaded from: classes10.dex */
public final class R7T extends AbstractC08800ci {
    public final boolean A00 = true;
    public final String[] A01;

    public R7T(String[] strArr) {
        this.A01 = strArr;
    }

    @Override // X.AbstractC08800ci
    public final boolean A01(android.net.Uri uri) {
        String host;
        if (uri != null && (host = uri.getHost()) != null) {
            for (String str : this.A01) {
                if (host.equals(str) || (this.A00 && host.endsWith(AnonymousClass001.A0R(".", str)))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.AbstractC08800ci
    public final boolean A00() {
        return AbstractC167007dF.A1N(this.A01.length);
    }
}
