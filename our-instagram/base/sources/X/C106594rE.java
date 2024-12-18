package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SponsoredAdsDisclaimerType;

/* renamed from: X.4rE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106594rE extends C0T6 implements InterfaceC104974oC {
    public final SponsoredAdsDisclaimerType A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C106594rE(SponsoredAdsDisclaimerType sponsoredAdsDisclaimerType, String str, String str2, boolean z) {
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(sponsoredAdsDisclaimerType, 4);
        this.A01 = str;
        this.A03 = z;
        this.A02 = str2;
        this.A00 = sponsoredAdsDisclaimerType;
    }

    @Override // X.InterfaceC104974oC
    public final C106594rE Ezm() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106594rE) {
                C106594rE c106594rE = (C106594rE) obj;
                if (!C14360o3.A0K(this.A01, c106594rE.A01) || this.A03 != c106594rE.A03 || !C14360o3.A0K(this.A02, c106594rE.A02) || this.A00 != c106594rE.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC104974oC
    public final String Ah4() {
        return this.A01;
    }

    @Override // X.InterfaceC104974oC
    public final boolean BBF() {
        return this.A03;
    }

    @Override // X.InterfaceC104974oC
    public final String BKx() {
        return this.A02;
    }

    @Override // X.InterfaceC104974oC
    public final SponsoredAdsDisclaimerType BL1() {
        return this.A00;
    }

    @Override // X.InterfaceC104974oC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSponsoredAdsDisclaimer", CDX.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = hashCode * 31;
        int i2 = 1237;
        if (this.A03) {
            i2 = 1231;
        }
        return ((((i + i2) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }
}
