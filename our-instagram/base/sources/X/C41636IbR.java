package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;
import java.util.List;

/* renamed from: X.IbR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41636IbR {
    public C57112jm A00;
    public C38321qM A01;
    public C5GU A02;
    public WishListFeedFragment A03;
    public InterfaceC43415JGf A04;
    public InterfaceC43420JGk A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final Fragment A0K;
    public final UserSession A0L;
    public final InterfaceC60442pS A0M;
    public final EnumC39622HeW A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final InterfaceC09390do A0R;

    public C41636IbR(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, EnumC39622HeW enumC39622HeW, String str, String str2, String str3) {
        AbstractC25233BEq.A0v(1, fragment, userSession, interfaceC60442pS);
        C14360o3.A0B(enumC39622HeW, 7);
        this.A0K = fragment;
        this.A0L = userSession;
        this.A0M = interfaceC60442pS;
        this.A0Q = str;
        this.A0O = str2;
        this.A0P = str3;
        this.A0N = enumC39622HeW;
        this.A0R = J8X.A00(this, 25);
        this.A0J = true;
        this.A0G = C16930sl.A00;
    }

    public static final C64952wt A00(C41636IbR c41636IbR) {
        String obj;
        UserSession userSession = c41636IbR.A0L;
        InterfaceC60442pS interfaceC60442pS = c41636IbR.A0M;
        String str = c41636IbR.A0Q;
        String str2 = c41636IbR.A0O;
        String str3 = c41636IbR.A0P;
        String str4 = null;
        String str5 = c41636IbR.A0A;
        C5GU c5gu = c41636IbR.A02;
        if (c5gu == null || (obj = c5gu.toString()) == null) {
            obj = c41636IbR.A0N.toString();
        }
        return new C64952wt(interfaceC60442pS, userSession, str, str5, obj, str2, str3, str4, str4, c41636IbR.A0D, c41636IbR.A0E, c41636IbR.A0F, c41636IbR.A09, -1);
    }

    public final IMS A01() {
        Fragment fragment = this.A0K;
        UserSession userSession = this.A0L;
        InterfaceC60442pS interfaceC60442pS = this.A0M;
        String str = this.A0Q;
        String str2 = this.A0O;
        C64972wv c64972wv = (C64972wv) this.A0R.getValue();
        C57112jm c57112jm = this.A00;
        if (c57112jm != null) {
            String str3 = this.A0A;
            String str4 = this.A0B;
            String str5 = str2;
            if (str2 == null) {
                str5 = "";
            }
            return new IMS(fragment, userSession, interfaceC60442pS, A00(this), c64972wv, this.A05, new C64892wn(userSession, c57112jm, interfaceC60442pS, str, str3, str4, str5, this.A0P, null, null, -1), str, str2);
        }
        throw AbstractC166987dD.A14("viewpointManager must not be null");
    }

    public final C41646Ibe A02() {
        C41633IbO c41633IbO;
        boolean z = this.A0J;
        C57112jm c57112jm = this.A00;
        if (z) {
            if (c57112jm == null) {
                throw AbstractC166987dD.A14("You must either provide a ViewpointManager or explicitly disable Viewpoint on your surface");
            }
        } else if (c57112jm == null) {
            if (AbstractC166987dD.A1b(this.A0G)) {
                throw AbstractC166987dD.A14("Viewpoint has been disabled, so the product card viewpoint actions should be empty.");
            }
        } else {
            throw AbstractC166987dD.A14("Viewpoint has been disabled, so the ViewpointManager should be null.");
        }
        C64952wt A00 = A00(this);
        C57112jm c57112jm2 = this.A00;
        if (c57112jm2 != null) {
            UserSession userSession = this.A0L;
            InterfaceC60442pS interfaceC60442pS = this.A0M;
            EnumC39622HeW enumC39622HeW = this.A0N;
            String str = this.A0Q;
            String str2 = this.A0O;
            String str3 = this.A0P;
            C5GU c5gu = this.A02;
            if (c5gu == null || c5gu.toString() == null) {
                enumC39622HeW.toString();
            }
            c41633IbO = new C41633IbO(userSession, c57112jm2, interfaceC60442pS, A00, str, str2, str3, this.A0A, this.A0G);
        } else {
            c41633IbO = null;
        }
        Fragment fragment = this.A0K;
        UserSession userSession2 = this.A0L;
        InterfaceC60442pS interfaceC60442pS2 = this.A0M;
        String str4 = this.A0Q;
        String str5 = this.A0O;
        String str6 = this.A0P;
        String str7 = this.A0D;
        C5GU c5gu2 = this.A02;
        Long l = this.A06;
        EnumC39622HeW enumC39622HeW2 = this.A0N;
        C64972wv c64972wv = (C64972wv) this.A0R.getValue();
        InterfaceC43420JGk interfaceC43420JGk = this.A05;
        InterfaceC43415JGf interfaceC43415JGf = this.A04;
        boolean z2 = this.A0I;
        String str8 = this.A0B;
        String str9 = this.A0C;
        C38321qM c38321qM = this.A01;
        String str10 = this.A0A;
        String str11 = this.A0F;
        String str12 = this.A0E;
        boolean z3 = this.A0H;
        return new C41646Ibe(fragment, userSession2, this.A00, c38321qM, interfaceC60442pS2, c5gu2, enumC39622HeW2, A00, c64972wv, interfaceC43415JGf, interfaceC43420JGk, c41633IbO, l, this.A07, str4, str5, str6, str7, str8, str9, str10, str11, str12, this.A09, this.A08, z2, z3);
    }
}
