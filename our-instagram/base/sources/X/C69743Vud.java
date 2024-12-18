package X;

/* renamed from: X.Vud, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69743Vud {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69743Vud) {
                C69743Vud c69743Vud = (C69743Vud) obj;
                if (!C14360o3.A0K(this.A00, c69743Vud.A00) || !C14360o3.A0K(this.A01, c69743Vud.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0v("ProductConfigKey(productId=", this.A00, ", receiverId=", this.A01, ')');
    }

    public C69743Vud(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
