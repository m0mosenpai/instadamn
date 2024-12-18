package X;

/* renamed from: X.95G, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C95G implements Comparable {
    public String A00;
    public int A01;
    public final C95G A02;
    public final String A03;

    /* JADX WARN: Multi-variable type inference failed */
    public final C95G A00(String str) {
        boolean z;
        C95H c95h;
        if (this instanceof C95H) {
            C95H c95h2 = (C95H) this;
            z = c95h2.A00;
            c95h = new C95G(c95h2, str);
        } else if (((C95F) this) instanceof C95H) {
            z = false;
            c95h = new C95G(this, str);
        } else {
            return new C95G(this, str);
        }
        c95h.A00 = z;
        return c95h;
    }

    public final String A01() {
        String str = this.A00;
        if (str == null) {
            C95G c95g = this.A02;
            str = this.A03;
            if (c95g != null && c95g.A01() != null) {
                str = c95g.A01().concat(str);
            }
            this.A00 = str;
        }
        return str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return A01().compareTo(((C95G) obj).A01());
    }

    public final int hashCode() {
        int i = this.A01;
        if (i == 0) {
            String str = this.A00;
            if (str == null) {
                C95G c95g = this.A02;
                if (c95g != null) {
                    i = c95g.hashCode();
                } else {
                    i = 0;
                }
                str = this.A03;
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                i = (i * 31) + str.charAt(i2);
            }
            this.A01 = i;
        }
        return i;
    }

    public C95G(C95G c95g, String str) {
        str.getClass();
        this.A02 = c95g;
        this.A03 = str;
    }

    public final String toString() {
        return A01();
    }

    public C95G() {
        "/".getClass();
        this.A02 = null;
        this.A03 = "/";
        this.A00 = "/";
    }
}
