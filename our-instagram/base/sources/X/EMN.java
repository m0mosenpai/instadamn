package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.modal.ModalActivity;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* loaded from: classes6.dex */
public final class EMN extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "ResharedPostSheetFragment";
    public UserSession A00;
    public User A01;
    public FIB A02;
    public C34948FaY A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public View A07;
    public View A08;
    public ShimmerFrameLayout A09;
    public C69425VnA A0A;
    public FollowButton A0B;
    public String A0C;
    public String A0D;
    public final C1P1 A0F = new C31714DwJ(this, 28);
    public final View.OnClickListener A0E = new ViewOnClickListenerC35678FpD(this, 19);
    public final InterfaceC42271xH A0G = C31728DwZ.A00(this, 31);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    public static void A00(EMN emn) {
        emn.A08.setVisibility(8);
        emn.A09.setVisibility(8);
        if (!emn.A05) {
            emn.A09.setVisibility(0);
            emn.A09.A02();
            return;
        }
        User user = emn.A01;
        if (user == null || emn.A00.userId.equals(user.getId()) || !emn.A06) {
            return;
        }
        emn.A08.setVisibility(0);
        emn.A0B.setTextSize(2, 14.0f);
        FollowButton followButton = emn.A0B;
        ((ImageWithTitleTextView) followButton).A00 = 0;
        followButton.setTypeface(null, 1);
        AbstractC13880nE.A0a(emn.A0B, 0);
        emn.A0B.A0J.A04(emn, emn.A00, emn.A01);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.VJU, java.lang.Object] */
    public static void A01(EMN emn) {
        Context requireContext = emn.requireContext();
        UserSession userSession = emn.A00;
        C69425VnA c69425VnA = emn.A0A;
        C34948FaY c34948FaY = emn.A03;
        ImageUrl imageUrl = c34948FaY.A00;
        Integer num = C05F.A00;
        ?? obj = new Object();
        obj.A02 = num;
        obj.A01 = imageUrl;
        obj.A00 = null;
        C70986Wlw c70986Wlw = new C70986Wlw(emn, 2);
        CharSequence charSequence = c34948FaY.A01;
        String str = c34948FaY.A02;
        VW1.A00(requireContext, emn, userSession, new C69447VnW(null, c70986Wlw, obj, null, null, null, charSequence, str, true, false, AbstractC25229BEm.A1Z(str)), c69425VnA);
        Context requireContext2 = emn.requireContext();
        FMP fmp = new FMP(emn.A07);
        Integer num2 = C05F.A01;
        boolean equals = emn.A04.equals("igtv");
        Resources A0N = AbstractC166997dE.A0N(emn);
        int i = 2131972483;
        if (equals) {
            i = 2131972484;
        }
        String string = A0N.getString(i);
        View.OnClickListener onClickListener = emn.A0E;
        if (string != null) {
            if (onClickListener != null) {
                AbstractC34325FBt.A00(requireContext2, fmp, new FLN(onClickListener, num2, string));
                A00(emn);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public static void A02(EMN emn) {
        if (emn.A04.equals("igtv")) {
            FIB fib = emn.A02;
            if (fib != null) {
                String str = emn.A0C;
                C146016hy c146016hy = ((AbstractC149546o6) fib.A00).A00;
                if (c146016hy != null) {
                    C14360o3.A0B(str, 0);
                    c146016hy.A06.A01(str, c146016hy.A01);
                    return;
                }
                return;
            }
            return;
        }
        UserSession userSession = emn.A00;
        IgFragmentFactoryImpl.A00();
        String str2 = emn.A0C;
        C35028Fc1 c35028Fc1 = new C35028Fc1();
        c35028Fc1.A0B = str2;
        c35028Fc1.A0E = "story_sticker";
        c35028Fc1.A0N = true;
        AbstractC31172DnG.A1M(emn, AbstractC31174DnI.A0a(emn.requireActivity(), c35028Fc1.A01(), userSession, ModalActivity.class, "single_media_feed"));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return I58.A00(this, this.A0D);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A0D;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(286024259);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        this.A0C = AbstractC31173DnH.A0j(requireArguments, AbstractC111324zv.A00(1933));
        this.A04 = AbstractC31173DnH.A0j(requireArguments, AbstractC111324zv.A00(3949));
        this.A0D = AbstractC31173DnH.A0j(requireArguments, "args_previous_module_name");
        this.A03 = new C34948FaY();
        C1ON A04 = AbstractC2044893h.A04(this.A00, this.A0C);
        A04.A00 = this.A0F;
        AbstractC31177DnL.A19(this, A04);
        AbstractC25651Mw.A00(this.A00).A01(this.A0G, C70073Cr.class);
        C0f9.A09(-314171349, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(743007257);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reshared_post_sheet_fragment);
        C0f9.A09(-140281991, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1448260819);
        super.onDestroy();
        AbstractC25651Mw.A00(this.A00).A02(this.A0G, C70073Cr.class);
        C0f9.A09(-360355778, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1129020119);
        super.onResume();
        User user = this.A01;
        if (user != null) {
            if (!this.A06 && ViewOnAttachStateChangeListenerC110564yT.A00(this.A00, user) == FollowStatus.A06) {
                this.A06 = true;
            }
            A00(this);
        }
        C0f9.A09(1666997463, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A = new C69425VnA(AbstractC31173DnH.A0F(view, R.id.header_container));
        this.A08 = view.requireViewById(R.id.follow_button_container);
        view.requireViewById(R.id.profile_follow_button).setVisibility(0);
        this.A0B = (FollowButton) view.requireViewById(R.id.profile_follow_button);
        this.A09 = (ShimmerFrameLayout) view.requireViewById(R.id.follow_button_shimmer_container);
        this.A07 = view.requireViewById(R.id.bottomsheet_action_button_container);
        A01(this);
    }
}
