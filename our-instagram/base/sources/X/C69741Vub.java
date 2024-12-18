package X;

/* renamed from: X.Vub, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69741Vub {
    public final String A00;
    public final String A01;

    public C69741Vub(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69741Vub) {
                C69741Vub c69741Vub = (C69741Vub) obj;
                if (!C14360o3.A0K(this.A00, c69741Vub.A00) || !C14360o3.A0K(this.A01, c69741Vub.A01)) {
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
        return AnonymousClass001.A0v("ECPInitDataKey(productId=", this.A00, ", receiverId=", this.A01, ')');
    }
}
