package X;

/* renamed from: X.4dR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99514dR extends C0T6 implements InterfaceC99524dS {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99514dR) {
                C99514dR c99514dR = (C99514dR) obj;
                if (!C14360o3.A0K(this.A00, c99514dR.A00) || !C14360o3.A0K(this.A01, c99514dR.A01) || !C14360o3.A0K(this.A02, c99514dR.A02) || !C14360o3.A0K(this.A03, c99514dR.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A01;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A03;
        return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public C99514dR(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A03 = bool4;
    }
}
