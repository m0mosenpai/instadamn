package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.AndroidLink;

/* renamed from: X.4mN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104014mN extends C0T6 implements C47W {
    public final AndroidLink A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.C47W
    public final C104014mN Eyi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104014mN) {
                C104014mN c104014mN = (C104014mN) obj;
                if (!C14360o3.A0K(this.A00, c104014mN.A00) || !C14360o3.A0K(this.A01, c104014mN.A01) || !C14360o3.A0K(this.A02, c104014mN.A02) || !C14360o3.A0K(this.A03, c104014mN.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AndroidLink androidLink = this.A00;
        int hashCode = (androidLink == null ? 0 : androidLink.hashCode()) * 31;
        Integer num = this.A01;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.C47W
    public final AndroidLink Abl() {
        return this.A00;
    }

    @Override // X.C47W
    public final Integer BrW() {
        return this.A01;
    }

    @Override // X.C47W
    public final String BrX() {
        return this.A02;
    }

    @Override // X.C47W
    public final String BrZ() {
        return this.A03;
    }

    @Override // X.C47W
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileVisitAdsInfo", Hs9.A00(this));
    }

    public C104014mN(AndroidLink androidLink, Integer num, String str, String str2) {
        this.A00 = androidLink;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }
}
