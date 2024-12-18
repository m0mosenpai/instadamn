package X;

/* renamed from: X.0Ux, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06310Ux implements Comparable {
    public final String A00;
    public final String A01;
    public final String[] A02;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C06310Ux)) {
            return false;
        }
        return this.A00.equals(((C06310Ux) obj).A00);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A00.compareTo(((C06310Ux) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C06310Ux(String str, String str2, String... strArr) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = strArr;
    }
}
