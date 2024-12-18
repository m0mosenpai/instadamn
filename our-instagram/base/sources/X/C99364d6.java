package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.4d6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99364d6 extends C0T6 implements InterfaceC99374d7 {
    public final ImageUrl A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C99364d6(ImageUrl imageUrl, ImageUrl imageUrl2, String str, String str2, String str3, String str4) {
        C14360o3.A0B(str2, 4);
        C14360o3.A0B(str4, 6);
        this.A02 = str;
        this.A00 = imageUrl;
        this.A01 = imageUrl2;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    @Override // X.InterfaceC99374d7
    public final C99364d6 Evs() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99364d6) {
                C99364d6 c99364d6 = (C99364d6) obj;
                if (!C14360o3.A0K(this.A02, c99364d6.A02) || !C14360o3.A0K(this.A00, c99364d6.A00) || !C14360o3.A0K(this.A01, c99364d6.A01) || !C14360o3.A0K(this.A03, c99364d6.A03) || !C14360o3.A0K(this.A04, c99364d6.A04) || !C14360o3.A0K(this.A05, c99364d6.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ImageUrl imageUrl = this.A00;
        int hashCode2 = (hashCode + (imageUrl == null ? 0 : imageUrl.hashCode())) * 31;
        ImageUrl imageUrl2 = this.A01;
        int hashCode3 = (((hashCode2 + (imageUrl2 == null ? 0 : imageUrl2.hashCode())) * 31) + this.A03.hashCode()) * 31;
        String str2 = this.A04;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.A05.hashCode();
    }

    @Override // X.InterfaceC99374d7
    public final String Ayf() {
        return this.A02;
    }

    @Override // X.InterfaceC99374d7
    public final ImageUrl B4T() {
        return this.A00;
    }

    @Override // X.InterfaceC99374d7
    public final ImageUrl BGt() {
        return this.A01;
    }

    @Override // X.InterfaceC99374d7
    public final String BkY() {
        return this.A03;
    }

    @Override // X.InterfaceC99374d7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkPreviewAttachment", AbstractC46591KjU.A00(this));
    }

    @Override // X.InterfaceC99374d7
    public final String getTitle() {
        return this.A04;
    }

    @Override // X.InterfaceC99374d7
    public final String getUrl() {
        return this.A05;
    }
}
