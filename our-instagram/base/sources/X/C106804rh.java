package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.4rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106804rh extends C0T6 implements InterfaceC106814ri {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    @Override // X.InterfaceC106814ri
    public final InterfaceC106814ri E9d(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC106814ri
    public final C106804rh Ey8(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC106814ri
    public final C106804rh Ey9(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106804rh) {
                C106804rh c106804rh = (C106804rh) obj;
                if (!C14360o3.A0K(this.A01, c106804rh.A01) || !C14360o3.A0K(this.A02, c106804rh.A02) || !C14360o3.A0K(this.A03, c106804rh.A03) || !C14360o3.A0K(this.A04, c106804rh.A04) || !C14360o3.A0K(this.A00, c106804rh.A00) || !C14360o3.A0K(this.A05, c106804rh.A05) || !C14360o3.A0K(this.A06, c106804rh.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        User user = this.A00;
        int hashCode5 = (hashCode4 + (user == null ? 0 : user.hashCode())) * 31;
        String str5 = this.A05;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A06;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // X.InterfaceC106814ri
    public final String AnR() {
        return this.A01;
    }

    @Override // X.InterfaceC106814ri
    public final User BSW() {
        return this.A00;
    }

    @Override // X.InterfaceC106814ri
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPrefetchedProductDict", AbstractC40155HrP.A00(this));
    }

    @Override // X.InterfaceC106814ri
    public final String getCurrentPrice() {
        return this.A02;
    }

    @Override // X.InterfaceC106814ri
    public final String getExternalUrl() {
        return this.A03;
    }

    @Override // X.InterfaceC106814ri
    public final String getFullPrice() {
        return this.A04;
    }

    @Override // X.InterfaceC106814ri
    public final String getName() {
        return this.A05;
    }

    @Override // X.InterfaceC106814ri
    public final String getProductId() {
        return this.A06;
    }

    public C106804rh(User user, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = user;
        this.A05 = str5;
        this.A06 = str6;
    }
}
