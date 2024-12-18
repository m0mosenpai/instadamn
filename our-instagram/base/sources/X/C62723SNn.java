package X;

/* renamed from: X.SNn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62723SNn {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C62723SNn)) {
            return false;
        }
        C62723SNn c62723SNn = (C62723SNn) obj;
        return this.A01.equals(c62723SNn.A01) && this.A02.equals(c62723SNn.A02) && this.A00 == c62723SNn.A00;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166987dD.A0J(this.A01)) + this.A00;
    }

    public C62723SNn(String str, String str2, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
    }
}
