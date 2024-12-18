package X;

/* renamed from: X.68D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68D extends C0T6 implements C68E {
    public final Boolean A00;
    public final Float A01;
    public final Long A02;
    public final String A03;

    public C68D(Boolean bool, Float f, Long l, String str) {
        C14360o3.A0B(str, 4);
        this.A00 = bool;
        this.A02 = l;
        this.A01 = f;
        this.A03 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68D) {
                C68D c68d = (C68D) obj;
                if (!C14360o3.A0K(this.A00, c68d.A00) || !C14360o3.A0K(this.A02, c68d.A02) || !C14360o3.A0K(this.A01, c68d.A01) || !C14360o3.A0K(this.A03, c68d.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.A02;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.A01;
        return ((hashCode2 + (f != null ? f.hashCode() : 0)) * 31) + this.A03.hashCode();
    }
}
