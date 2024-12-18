package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GuideTypeStr;
import com.instagram.user.model.User;

/* renamed from: X.55s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1124055s extends C0T6 implements InterfaceC1124155t {
    public final int A00;
    public final long A01;
    public final long A02;
    public final GuideTypeStr A03;
    public final H7P A04;
    public final User A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // X.InterfaceC1124155t
    public final InterfaceC1124155t EBS(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC1124155t
    public final C1124055s F4j(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1124055s) {
                C1124055s c1124055s = (C1124055s) obj;
                if (this.A08 != c1124055s.A08 || !C14360o3.A0K(this.A06, c1124055s.A06) || this.A09 != c1124055s.A09 || this.A01 != c1124055s.A01 || this.A0A != c1124055s.A0A || !C14360o3.A0K(this.A04, c1124055s.A04) || this.A00 != c1124055s.A00 || !C14360o3.A0K(this.A05, c1124055s.A05) || !C14360o3.A0K(this.A07, c1124055s.A07) || this.A03 != c1124055s.A03 || this.A02 != c1124055s.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public C1124055s(GuideTypeStr guideTypeStr, H7P h7p, User user, String str, String str2, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(user, 8);
        C14360o3.A0B(guideTypeStr, 10);
        this.A08 = z;
        this.A06 = str;
        this.A09 = z2;
        this.A01 = j;
        this.A0A = z3;
        this.A04 = h7p;
        this.A00 = i;
        this.A05 = user;
        this.A07 = str2;
        this.A03 = guideTypeStr;
        this.A02 = j2;
    }

    @Override // X.InterfaceC1124155t
    public final boolean B63() {
        return this.A09;
    }

    @Override // X.InterfaceC1124155t
    public final long BF4() {
        return this.A01;
    }

    @Override // X.InterfaceC1124155t
    public final /* bridge */ /* synthetic */ JLE BUE() {
        return this.A04;
    }

    @Override // X.InterfaceC1124155t
    public final int BXg() {
        return this.A00;
    }

    @Override // X.InterfaceC1124155t
    public final User Bah() {
        return this.A05;
    }

    @Override // X.InterfaceC1124155t
    public final GuideTypeStr CBT() {
        return this.A03;
    }

    @Override // X.InterfaceC1124155t
    public final long CDE() {
        return this.A02;
    }

    @Override // X.InterfaceC1124155t
    public final boolean CSj() {
        return this.A0A;
    }

    @Override // X.InterfaceC1124155t
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGuideSummary", I0E.A00(this));
    }

    @Override // X.InterfaceC1124155t
    public final boolean getCanViewerReshare() {
        return this.A08;
    }

    @Override // X.InterfaceC1124155t
    public final String getDescription() {
        return this.A06;
    }

    @Override // X.InterfaceC1124155t
    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A06;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        int i5 = 1237;
        if (this.A09) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        long j = this.A01;
        int i7 = (i6 + ((int) (j ^ (j >>> 32)))) * 31;
        int i8 = 1237;
        if (this.A0A) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        H7P h7p = this.A04;
        if (h7p == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = h7p.hashCode();
        }
        int hashCode3 = (((((i9 + hashCode2) * 31) + this.A00) * 31) + this.A05.hashCode()) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        int hashCode4 = (((hashCode3 + i3) * 31) + this.A03.hashCode()) * 31;
        long j2 = this.A02;
        return hashCode4 + ((int) (j2 ^ (j2 >>> 32)));
    }
}
