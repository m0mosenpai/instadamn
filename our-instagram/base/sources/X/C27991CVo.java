package X;

/* renamed from: X.CVo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27991CVo {
    public final android.net.Uri A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27991CVo) {
                C27991CVo c27991CVo = (C27991CVo) obj;
                if (!C14360o3.A0K(this.A01, c27991CVo.A01) || !C14360o3.A0K(this.A02, c27991CVo.A02) || !C14360o3.A0K(this.A00, c27991CVo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0O(this.A02)) * 31);
    }

    public C27991CVo(android.net.Uri uri, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = uri;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("PickedImage(imageId=");
        A1C.append(this.A01);
        A1C.append(", thumbnailPath=");
        A1C.append(this.A02);
        A1C.append(", originalUri=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
