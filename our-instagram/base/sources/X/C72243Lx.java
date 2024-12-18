package X;

/* renamed from: X.3Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72243Lx extends C0T6 implements InterfaceC41141vN {
    public AnonymousClass341 A00;
    public final C38321qM A01;
    public final C3AG A02;
    public final boolean A03;
    public final boolean A04;

    public C72243Lx(C38321qM c38321qM) {
        this.A01 = c38321qM;
        this.A02 = null;
        this.A04 = true;
        this.A00 = null;
        this.A03 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72243Lx) {
                C72243Lx c72243Lx = (C72243Lx) obj;
                if (!C14360o3.A0K(this.A01, c72243Lx.A01) || !C14360o3.A0K(this.A02, c72243Lx.A02) || this.A04 != c72243Lx.A04 || this.A00 != c72243Lx.A00 || this.A03 != c72243Lx.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        C3AG c3ag = this.A02;
        int i = 0;
        if (c3ag == null) {
            hashCode = 0;
        } else {
            hashCode = c3ag.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        int i3 = 1237;
        if (this.A04) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        AnonymousClass341 anonymousClass341 = this.A00;
        if (anonymousClass341 != null) {
            i = anonymousClass341.hashCode();
        }
        int i5 = (i4 + i) * 31;
        int i6 = 1237;
        if (this.A03) {
            i6 = 1231;
        }
        return i5 + i6;
    }

    public C72243Lx(C38321qM c38321qM, AnonymousClass341 anonymousClass341, C3AG c3ag) {
        C14360o3.A0B(c38321qM, 1);
        this.A01 = c38321qM;
        this.A02 = c3ag;
        this.A04 = true;
        this.A00 = anonymousClass341;
        this.A03 = false;
    }

    public C72243Lx(C38321qM c38321qM, boolean z) {
        this.A01 = c38321qM;
        this.A02 = null;
        this.A04 = z;
        this.A00 = null;
        this.A03 = false;
    }

    public C72243Lx(C38321qM c38321qM, AnonymousClass341 anonymousClass341) {
        this.A01 = c38321qM;
        this.A02 = null;
        this.A04 = true;
        this.A00 = anonymousClass341;
        this.A03 = false;
    }
}
