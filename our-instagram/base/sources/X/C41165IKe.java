package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.destination.wishlist.WishListFeedFragment;

/* renamed from: X.IKe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41165IKe {
    public C31349DqE A00;
    public boolean A01 = false;
    public final Fragment A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C64952wt A05;
    public final C64972wv A06;
    public final WishListFeedFragment A07;
    public final InterfaceC43420JGk A08;
    public final C41633IbO A09;
    public final C41742IeG A0A;
    public final String A0B;
    public final String A0C;

    public C41165IKe(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64952wt c64952wt, WishListFeedFragment wishListFeedFragment, InterfaceC43420JGk interfaceC43420JGk, C41633IbO c41633IbO, String str, String str2) {
        this.A04 = interfaceC60442pS;
        this.A02 = fragment;
        this.A03 = userSession;
        this.A0C = str;
        this.A0B = str2;
        this.A06 = AbstractC64962wu.A01(fragment.requireContext(), fragment.requireActivity(), userSession, interfaceC60442pS, str2, str);
        this.A07 = wishListFeedFragment;
        this.A08 = interfaceC43420JGk;
        this.A09 = c41633IbO;
        this.A05 = c64952wt;
        this.A0A = new C41742IeG(fragment.requireActivity(), userSession);
    }
}
