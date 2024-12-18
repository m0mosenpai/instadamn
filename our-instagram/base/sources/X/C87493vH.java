package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3vH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87493vH extends C0T6 implements InterfaceC87503vI {
    public final int A00;
    public final SocialContextType A01;
    public final User A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final List A06;

    public C87493vH(SocialContextType socialContextType, User user, String str, List list, List list2, List list3, int i) {
        C14360o3.A0B(list2, 2);
        C14360o3.A0B(socialContextType, 6);
        this.A04 = list;
        this.A05 = list2;
        this.A03 = str;
        this.A02 = user;
        this.A06 = list3;
        this.A01 = socialContextType;
        this.A00 = i;
    }

    @Override // X.InterfaceC87503vI
    public final InterfaceC87503vI E9t(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC87503vI
    public final C87493vH Ezd(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC87503vI
    public final C87493vH Eze(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87493vH) {
                C87493vH c87493vH = (C87493vH) obj;
                if (!C14360o3.A0K(this.A04, c87493vH.A04) || !C14360o3.A0K(this.A05, c87493vH.A05) || !C14360o3.A0K(this.A03, c87493vH.A03) || !C14360o3.A0K(this.A02, c87493vH.A02) || !C14360o3.A0K(this.A06, c87493vH.A06) || this.A01 != c87493vH.A01 || this.A00 != c87493vH.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        User user = this.A02;
        int hashCode3 = (hashCode2 + (user == null ? 0 : user.hashCode())) * 31;
        List list2 = this.A06;
        return ((((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.A01.hashCode()) * 31) + this.A00;
    }

    @Override // X.InterfaceC87503vI
    public final List ByL() {
        return this.A04;
    }

    @Override // X.InterfaceC87503vI
    public final List ByM() {
        return this.A05;
    }

    @Override // X.InterfaceC87503vI
    public final String ByN() {
        return this.A03;
    }

    @Override // X.InterfaceC87503vI
    public final User ByQ() {
        return this.A02;
    }

    @Override // X.InterfaceC87503vI
    public final List ByR() {
        return this.A06;
    }

    @Override // X.InterfaceC87503vI
    public final SocialContextType ByT() {
        return this.A01;
    }

    @Override // X.InterfaceC87503vI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextInfo", BFJ.A00(this));
    }

    @Override // X.InterfaceC87503vI
    public final int getSocialContextUsersCount() {
        return this.A00;
    }
}
