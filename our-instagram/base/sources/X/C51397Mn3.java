package X;

/* renamed from: X.Mn3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51397Mn3 extends AbstractC53419Nk8 {
    public final String A00;

    public C51397Mn3(String str) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51397Mn3) && C14360o3.A0K(this.A00, ((C51397Mn3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AbstractC25235BEs.A0r("STRING(value=", this.A00);
    }
}
