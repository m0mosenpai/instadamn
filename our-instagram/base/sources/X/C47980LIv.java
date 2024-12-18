package X;

/* renamed from: X.LIv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47980LIv {
    public final String A00;

    public static String A00(L9M l9m) {
        C14360o3.A08(MRW.A00);
        String str = l9m.A00.A00;
        str.getClass();
        return AnonymousClass001.A0R("Bearer ", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C47980LIv) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass001.A0c("**REDACTED", "**", hashCode());
    }

    public C47980LIv(String str) {
        this.A00 = str;
    }

    public C47980LIv() {
    }
}
