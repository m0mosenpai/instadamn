package X;

import java.util.Arrays;

/* renamed from: X.0Gf, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Gf {
    public final int A00;
    public final C0Ge A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        String str;
        String str2;
        Object obj2;
        Object obj3;
        String str3;
        String str4;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C0Gf c0Gf = (C0Gf) obj;
                if (this.A04 != c0Gf.A04 || this.A00 != c0Gf.A00 || (((str = this.A02) != (str2 = c0Gf.A02) && (str == null || !str.equals(str2))) || (((obj2 = this.A01.get()) != (obj3 = c0Gf.A01.get()) && (obj2 == null || !obj2.equals(obj3))) || ((str3 = this.A03) != (str4 = c0Gf.A03) && (str3 == null || !str3.equals(str4)))))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, false, Integer.valueOf(this.A00)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SoftError{mCategory='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", mMessage='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", mCause=");
        sb.append(this.A01.get());
        sb.append(", mFailHarder=");
        sb.append(false);
        sb.append(", mSamplingFrequency=");
        sb.append(this.A00);
        sb.append(", mOnlyIfEmployeeOrBetaBuild=");
        sb.append(this.A04);
        sb.append('}');
        return sb.toString();
    }

    public C0Gf(final C03360Gh c03360Gh) {
        this.A02 = c03360Gh.A01;
        this.A03 = c03360Gh.A02;
        this.A00 = c03360Gh.A00;
        this.A04 = c03360Gh.A04;
        final C0Ge c0Ge = new C0Ge() { // from class: X.0NL
            @Override // X.C0Ge
            public final Object get() {
                Throwable th = C03360Gh.this.A03;
                if (th == null) {
                    return null;
                }
                return th;
            }
        };
        this.A01 = new C0Ge(c0Ge) { // from class: X.0NH
            public Object A00;
            public boolean A01 = false;
            public final C0Ge A02;

            @Override // X.C0Ge
            public final Object get() {
                if (!this.A01) {
                    this.A00 = this.A02.get();
                    this.A01 = true;
                }
                return this.A00;
            }

            {
                this.A02 = c0Ge;
            }
        };
    }
}
