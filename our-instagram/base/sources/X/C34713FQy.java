package X;

/* renamed from: X.FQy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34713FQy {
    public int A00;
    public String A01;

    public final boolean equals(Object obj) {
        C34713FQy c34713FQy;
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC167017dG.A1Z(this, obj) || !(obj instanceof C34713FQy) || (c34713FQy = (C34713FQy) obj) == null) {
            return false;
        }
        String str2 = this.A01;
        if (str2 != null && (str = c34713FQy.A01) != null) {
            return str2.equals(str);
        }
        C14360o3.A0F("stepName");
        throw C00O.createAndThrow();
    }

    public final int hashCode() {
        String str = this.A01;
        if (str != null) {
            return str.hashCode();
        }
        C14360o3.A0F("stepName");
        throw C00O.createAndThrow();
    }
}
