package X;

import com.instagram.api.schemas.OpenDraftGalleryCommand;
import com.instagram.api.schemas.OpenInspirationHubCommand;

/* renamed from: X.BhM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26135BhM extends C0T6 implements InterfaceC31107Dlp {
    public final C26139BhQ A00;
    public final InterfaceC31119Dm1 A01;
    public final InterfaceC31120Dm2 A02;
    public final InterfaceC31121Dm3 A03;
    public final OpenDraftGalleryCommand A04;
    public final InterfaceC31117Dlz A05;
    public final OpenInspirationHubCommand A06;
    public final C26142BhT A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final Boolean A0B;

    @Override // X.InterfaceC31107Dlp
    public final C26135BhM Ewm() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26135BhM) {
                C26135BhM c26135BhM = (C26135BhM) obj;
                if (!C14360o3.A0K(this.A0B, c26135BhM.A0B) || !C14360o3.A0K(this.A00, c26135BhM.A00) || !C14360o3.A0K(this.A01, c26135BhM.A01) || !C14360o3.A0K(this.A02, c26135BhM.A02) || !C14360o3.A0K(this.A03, c26135BhM.A03) || !C14360o3.A0K(this.A04, c26135BhM.A04) || !C14360o3.A0K(this.A05, c26135BhM.A05) || !C14360o3.A0K(this.A06, c26135BhM.A06) || !C14360o3.A0K(this.A07, c26135BhM.A07) || !C14360o3.A0K(this.A09, c26135BhM.A09) || !C14360o3.A0K(this.A0A, c26135BhM.A0A) || !C14360o3.A0K(this.A08, c26135BhM.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AbstractC167017dG.A0M(this.A0B) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC166997dE.A0I(this.A08);
    }

    public C26135BhM(C26139BhQ c26139BhQ, InterfaceC31119Dm1 interfaceC31119Dm1, InterfaceC31120Dm2 interfaceC31120Dm2, InterfaceC31121Dm3 interfaceC31121Dm3, OpenDraftGalleryCommand openDraftGalleryCommand, InterfaceC31117Dlz interfaceC31117Dlz, OpenInspirationHubCommand openInspirationHubCommand, C26142BhT c26142BhT, Boolean bool, Boolean bool2, String str, String str2) {
        this.A0B = bool;
        this.A00 = c26139BhQ;
        this.A01 = interfaceC31119Dm1;
        this.A02 = interfaceC31120Dm2;
        this.A03 = interfaceC31121Dm3;
        this.A04 = openDraftGalleryCommand;
        this.A05 = interfaceC31117Dlz;
        this.A06 = openInspirationHubCommand;
        this.A07 = c26142BhT;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = bool2;
    }
}
