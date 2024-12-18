package X;

import java.util.Locale;

/* renamed from: X.E9i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32110E9i extends C0T6 implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final Locale A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32110E9i) {
                C32110E9i c32110E9i = (C32110E9i) obj;
                if (!C14360o3.A0K(this.A02, c32110E9i.A02) || this.A01 != c32110E9i.A01 || this.A00 != c32110E9i.A00 || !C14360o3.A0K(this.A03, c32110E9i.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C32110E9i c32110E9i = (C32110E9i) obj;
        C14360o3.A0B(c32110E9i, 0);
        return this.A02.compareTo(c32110E9i.A02);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((AbstractC166987dD.A0J(this.A02) + this.A01) * 31) + this.A00) * 31);
    }

    public C32110E9i(String str, Locale locale, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = locale;
    }
}
