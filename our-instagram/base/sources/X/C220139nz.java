package X;

/* renamed from: X.9nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220139nz extends AbstractC1334260l {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C220139nz) {
                C220139nz c220139nz = (C220139nz) obj;
                if (!C14360o3.A0K(this.A00, c220139nz.A00) || !C14360o3.A0K(this.A01, c220139nz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + this.A01.hashCode();
    }

    public C220139nz(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
