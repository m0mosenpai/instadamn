package X;

import java.math.BigInteger;

/* renamed from: X.5Nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116205Nz implements Comparable {
    public static final C116205Nz A06;
    public static final C116205Nz A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C9EV(this, 45));
    public final String A04;
    public static final C116205Nz A07 = new C116205Nz(0, 0, "", 0);
    public static final C116205Nz A05 = new C116205Nz(0, 1, "", 0);

    static {
        C116205Nz c116205Nz = new C116205Nz(1, 0, "", 0);
        A08 = c116205Nz;
        A06 = c116205Nz;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C116205Nz c116205Nz) {
        C14360o3.A0B(c116205Nz, 0);
        Object value = this.A03.getValue();
        C14360o3.A07(value);
        Object value2 = c116205Nz.A03.getValue();
        C14360o3.A07(value2);
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C116205Nz)) {
            return false;
        }
        C116205Nz c116205Nz = (C116205Nz) obj;
        if (this.A00 != c116205Nz.A00 || this.A01 != c116205Nz.A01 || this.A02 != c116205Nz.A02) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((527 + this.A00) * 31) + this.A01) * 31) + this.A02;
    }

    public final String toString() {
        String str;
        String str2 = this.A04;
        if (!AbstractC001900j.A0T(str2)) {
            str = AnonymousClass001.A0D(str2, '-');
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append('.');
        sb.append(this.A01);
        sb.append('.');
        sb.append(this.A02);
        sb.append(str);
        return sb.toString();
    }

    public C116205Nz(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str;
    }
}
