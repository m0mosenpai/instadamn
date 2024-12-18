package X;

/* loaded from: classes11.dex */
public final class UMT extends W5P {
    public final String A00;

    @Override // X.W5P
    public final String toString() {
        String str = this.A00;
        if (str != null) {
            return AnonymousClass001.A0g(str, ", ", super.toString());
        }
        return super.toString();
    }

    public UMT(String str, android.net.Uri uri) {
        super(uri);
        this.A00 = str;
    }
}
