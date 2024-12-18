package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.H7p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38822H7p extends C0T6 implements InterfaceC43569JMd {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    @Override // X.InterfaceC43569JMd
    public final C38822H7p F6V(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43569JMd
    public final C38822H7p F6W(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38822H7p) {
                C38822H7p c38822H7p = (C38822H7p) obj;
                if (!C14360o3.A0K(this.A01, c38822H7p.A01) || !C14360o3.A0K(this.A02, c38822H7p.A02) || !C14360o3.A0K(this.A00, c38822H7p.A00) || !C14360o3.A0K(this.A07, c38822H7p.A07) || !C14360o3.A0K(this.A03, c38822H7p.A03) || !C14360o3.A0K(this.A04, c38822H7p.A04) || !C14360o3.A0K(this.A05, c38822H7p.A05) || !C14360o3.A0K(this.A06, c38822H7p.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43569JMd
    public final User BSW() {
        return this.A00;
    }

    @Override // X.InterfaceC43569JMd
    public final List C0p() {
        return this.A07;
    }

    @Override // X.InterfaceC43569JMd
    public final String C6J() {
        return this.A04;
    }

    @Override // X.InterfaceC43569JMd
    public final String CEu() {
        return this.A06;
    }

    @Override // X.InterfaceC43569JMd
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryStorefrontTappableData", I4H.A00(this));
    }

    @Override // X.InterfaceC43569JMd
    public final String getId() {
        return this.A01;
    }

    @Override // X.InterfaceC43569JMd
    public final String getMediaId() {
        return this.A02;
    }

    @Override // X.InterfaceC43569JMd
    public final String getText() {
        return this.A03;
    }

    @Override // X.InterfaceC43569JMd
    public final String getUserId() {
        return this.A05;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public C38822H7p(User user, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = user;
        this.A07 = list;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
    }

    @Override // X.InterfaceC43569JMd
    public final InterfaceC43569JMd EBw(C1DY c1dy) {
        return this;
    }
}
