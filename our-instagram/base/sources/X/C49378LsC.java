package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.LsC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49378LsC implements C1NI {
    public EnumC40111tc A00;
    public FollowStatus A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public final String A09;

    @Override // X.C1NI
    public final String BzL(UserSession userSession) {
        return null;
    }

    @Override // X.C1NI
    public final boolean CW9() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CZq() {
        return true;
    }

    @Override // X.C1NI
    public final boolean CdW() {
        return false;
    }

    public final void A00(C82713mZ c82713mZ) {
        String str = this.A05;
        if (str != null) {
            c82713mZ.A61 = str;
        }
        EnumC40111tc enumC40111tc = this.A00;
        if (enumC40111tc != null) {
            c82713mZ.A0N(enumC40111tc);
        }
        String str2 = this.A07;
        if (str2 != null) {
            c82713mZ.A7X = str2;
        }
        Integer num = this.A03;
        if (num != null) {
            c82713mZ.A4A = AbstractC25229BEm.A0n(num);
        }
        Integer num2 = this.A04;
        if (num2 != null) {
            c82713mZ.A4B = AbstractC25229BEm.A0n(num2);
        }
        String str3 = this.A06;
        if (str3 != null) {
            c82713mZ.A7L = str3;
        }
        FollowStatus followStatus = this.A01;
        if (followStatus != null) {
            SimpleImageUrl simpleImageUrl = User.A08;
            c82713mZ.A5P = AbstractC38851rI.A06(followStatus);
        }
        Boolean bool = this.A02;
        if (bool != null) {
            c82713mZ.A0N = bool.booleanValue() ? 1 : 0;
        }
        String str4 = this.A08;
        if (str4 != null) {
            c82713mZ.A7Z = str4;
        }
    }

    @Override // X.C1NI, X.InterfaceC38381qS, X.InterfaceC38411qV
    public final String getId() {
        return this.A09;
    }

    public C49378LsC(String str) {
        this.A09 = str;
    }
}
