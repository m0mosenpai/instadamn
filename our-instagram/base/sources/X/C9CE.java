package X;

/* renamed from: X.9CE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9CE extends C0T6 implements InterfaceC166427cB {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C9CE(EnumC168507fk enumC168507fk, C38891rO c38891rO, String str, String str2) {
        this.A01 = c38891rO;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = enumC168507fk;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (obj instanceof C9CE) {
                    C9CE c9ce = (C9CE) obj;
                    if (c9ce.A00 != 1 || !C14360o3.A0K(this.A01, c9ce.A01) || !C14360o3.A0K(this.A03, c9ce.A03) || !C14360o3.A0K(this.A04, c9ce.A04) || this.A02 != c9ce.A02) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!(obj instanceof C9CE)) {
                return false;
            }
            C9CE c9ce2 = (C9CE) obj;
            if (c9ce2.A00 != 0 || this.A02 != c9ce2.A02 || !C14360o3.A0K(this.A01, c9ce2.A01) || !C14360o3.A0K(this.A03, c9ce2.A03) || !C14360o3.A0K(this.A04, c9ce2.A04)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        if (this.A00 != 0) {
            Object obj = this.A01;
            int i = 0;
            if (obj == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj.hashCode();
            }
            int hashCode3 = ((hashCode2 * 31) + this.A03.hashCode()) * 31;
            String str = this.A04;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode3 + i) * 31) + this.A02.hashCode();
        }
        int hashCode4 = ((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A03;
        int i2 = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i3 = (hashCode4 + hashCode) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return i3 + i2;
    }

    public C9CE(C38321qM c38321qM, EnumC168447fe enumC168447fe) {
        C14360o3.A0B(enumC168447fe, 1);
        C14360o3.A0B(c38321qM, 2);
        this.A02 = enumC168447fe;
        this.A01 = c38321qM;
        this.A03 = null;
        this.A04 = null;
    }
}
