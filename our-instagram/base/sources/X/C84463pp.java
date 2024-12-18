package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84463pp extends C0T6 implements InterfaceC84473pq {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public C84463pp(String str, String str2, String str3, long j, long j2, long j3, boolean z) {
        C14360o3.A0B(str, 5);
        C14360o3.A0B(str2, 6);
        C14360o3.A0B(str3, 7);
        this.A00 = j;
        this.A01 = j2;
        this.A06 = z;
        this.A02 = j3;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
    }

    @Override // X.InterfaceC84473pq
    public final C84463pp EuU() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84463pp) {
                C84463pp c84463pp = (C84463pp) obj;
                if (this.A00 != c84463pp.A00 || this.A01 != c84463pp.A01 || this.A06 != c84463pp.A06 || this.A02 != c84463pp.A02 || !C14360o3.A0K(this.A03, c84463pp.A03) || !C14360o3.A0K(this.A04, c84463pp.A04) || !C14360o3.A0K(this.A05, c84463pp.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC84473pq
    public final long BF4() {
        return this.A00;
    }

    @Override // X.InterfaceC84473pq
    public final long BJL() {
        return this.A01;
    }

    @Override // X.InterfaceC84473pq
    public final long Bg9() {
        return this.A02;
    }

    @Override // X.InterfaceC84473pq
    public final String BgA() {
        return this.A03;
    }

    @Override // X.InterfaceC84473pq
    public final String BhQ() {
        return this.A04;
    }

    @Override // X.InterfaceC84473pq
    public final boolean CQc() {
        return this.A06;
    }

    @Override // X.InterfaceC84473pq
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGBioProductDict", AbstractC53775NqR.A00(this));
    }

    @Override // X.InterfaceC84473pq
    public final String getTitle() {
        return this.A05;
    }

    public final int hashCode() {
        long j = this.A00;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.A01;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        long j3 = this.A02;
        return ((((((i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode();
    }
}
