package X;

/* loaded from: classes10.dex */
public final class RVX extends S3Y {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof S3Y)) {
                return false;
            }
            RVX rvx = (RVX) ((S3Y) obj);
            if (!this.A00.equals(rvx.A00) || !this.A01.equals(rvx.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((this.A00.hashCode() ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A11("LibraryVersion{libraryName=", this.A00, AbstractC111324zv.A00(1466), this.A01, "}");
    }

    public RVX(String str, String str2) {
        this.A00 = str;
        if (str2 != null) {
            this.A01 = str2;
            return;
        }
        throw AbstractC166987dD.A15("Null version");
    }
}
