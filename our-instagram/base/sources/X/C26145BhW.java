package X;

/* renamed from: X.BhW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26145BhW extends C0T6 implements InterfaceC31033DkX {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    public C26145BhW(MUD mud, String str, String str2, C5Hc c5Hc, C5Hc c5Hc2, int i, int i2) {
        this.A00 = 0;
        C14360o3.A0B(c5Hc2, 6);
        this.A07 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = str2;
        this.A04 = c5Hc;
        this.A03 = c5Hc2;
        this.A05 = mud;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26145BhW) && ((C26145BhW) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        C26145BhW c26145BhW;
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    c26145BhW = (C26145BhW) obj;
                    if (C14360o3.A0K(this.A07, c26145BhW.A07) && this.A02 == c26145BhW.A02 && this.A01 == c26145BhW.A01 && C14360o3.A0K(this.A06, c26145BhW.A06) && C14360o3.A0K(this.A03, c26145BhW.A03)) {
                        obj2 = this.A04;
                        obj3 = c26145BhW.A04;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            c26145BhW = (C26145BhW) obj;
            if (!C14360o3.A0K(this.A07, c26145BhW.A07) || this.A02 != c26145BhW.A02 || this.A01 != c26145BhW.A01 || !C14360o3.A0K(this.A06, c26145BhW.A06) || !C14360o3.A0K(this.A04, c26145BhW.A04)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = c26145BhW.A03;
        } else {
            return true;
        }
        if (!C14360o3.A0K(obj2, obj3) || !C14360o3.A0K(this.A05, c26145BhW.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J;
        Object obj;
        int i = this.A00;
        int A0J2 = (((((AbstractC166987dD.A0J(this.A07) + this.A02) * 31) + this.A01) * 31) + AbstractC167017dG.A0O(this.A06)) * 31;
        if (i != 0) {
            A0J = AbstractC166997dE.A0J(this.A03, A0J2);
            obj = this.A04;
        } else {
            A0J = AbstractC166997dE.A0J(this.A04, A0J2);
            obj = this.A03;
        }
        return AbstractC166997dE.A0J(obj, A0J) + AbstractC166997dE.A0I(this.A05);
    }

    @Override // X.InterfaceC31033DkX
    public final int getHeight() {
        return this.A01;
    }

    @Override // X.InterfaceC31033DkX
    public final String getId() {
        return this.A07;
    }

    @Override // X.InterfaceC31033DkX
    public final int getWidth() {
        return this.A02;
    }

    public C26145BhW(MUD mud, C75363a3 c75363a3, String str, String str2, int i, int i2) {
        this.A00 = 1;
        C5HZ c5hz = C5HZ.A01;
        this.A00 = 1;
        C14360o3.A0B(c5hz, 5);
        this.A07 = str;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = str2;
        this.A03 = c5hz;
        this.A04 = c75363a3;
        this.A05 = mud;
    }
}
