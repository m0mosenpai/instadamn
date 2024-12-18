package X;

/* renamed from: X.Vua, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69740Vua {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69740Vua) {
                C69740Vua c69740Vua = (C69740Vua) obj;
                if (!C14360o3.A0K(this.A01, c69740Vua.A01) || !C14360o3.A0K(this.A00, c69740Vua.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0v("UpdateContactIdParams(oldId=", this.A01, ", newId=", this.A00, ')');
    }

    public C69740Vua(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
