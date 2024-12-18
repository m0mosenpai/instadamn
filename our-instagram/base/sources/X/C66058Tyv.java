package X;

/* renamed from: X.Tyv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66058Tyv extends C0T6 {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66058Tyv) && C14360o3.A0K(this.A00, ((C66058Tyv) obj).A00));
    }

    public final int hashCode() {
        String str = this.A00;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public C66058Tyv(String str) {
        this.A00 = str;
    }
}
