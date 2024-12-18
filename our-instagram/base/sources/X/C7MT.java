package X;

/* renamed from: X.7MT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7MT extends C0T6 {
    public final C50679MYx A00;
    public final C7MS A01;
    public final Boolean A02;
    public final String A03;
    public final boolean A04;

    public static final C7MT A00(C50679MYx c50679MYx, C7MS c7ms, Boolean bool, String str, boolean z) {
        C14360o3.A0B(c7ms, 0);
        return new C7MT(c50679MYx, c7ms, bool, str, z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7MT) {
                C7MT c7mt = (C7MT) obj;
                if (this.A01 != c7mt.A01 || !C14360o3.A0K(this.A00, c7mt.A00) || !C14360o3.A0K(this.A03, c7mt.A03) || !C14360o3.A0K(this.A02, c7mt.A02) || this.A04 != c7mt.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.A01.hashCode() * 31;
        C50679MYx c50679MYx = this.A00;
        int i = 0;
        if (c50679MYx == null) {
            hashCode = 0;
        } else {
            hashCode = c50679MYx.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.A03;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Boolean bool = this.A02;
        if (bool != null) {
            i = bool.hashCode();
        }
        int i4 = (i3 + i) * 31;
        int i5 = 1237;
        if (this.A04) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C7MT(C50679MYx c50679MYx, C7MS c7ms, Boolean bool, String str, boolean z) {
        this.A01 = c7ms;
        this.A00 = c50679MYx;
        this.A03 = str;
        this.A02 = bool;
        this.A04 = z;
    }

    public C7MT() {
        this(null, C7MS.A02, false, null, false);
    }
}
