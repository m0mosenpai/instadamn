package X;

/* renamed from: X.9Bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206399Bw extends C0T6 implements InterfaceC166407c9 {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;

    public C206399Bw(EnumC46186KcO enumC46186KcO) {
        this(enumC46186KcO, "");
    }

    public final boolean equals(Object obj) {
        C206399Bw c206399Bw;
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C206399Bw) {
                    c206399Bw = (C206399Bw) obj;
                    if (c206399Bw.A00 != 1 || this.A01 != c206399Bw.A01) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C206399Bw)) {
                return false;
            }
            c206399Bw = (C206399Bw) obj;
            if (c206399Bw.A00 != 0 || !C14360o3.A0K(this.A01, c206399Bw.A01)) {
                return false;
            }
        } else {
            return true;
        }
        if (!C14360o3.A0K(this.A02, c206399Bw.A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A02.hashCode();
    }

    public C206399Bw(C169287h2 c169287h2, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = c169287h2;
        this.A02 = str;
    }

    public C206399Bw(EnumC46186KcO enumC46186KcO, String str) {
        C14360o3.A0B(str, 2);
        this.A01 = enumC46186KcO;
        this.A02 = str;
    }
}
