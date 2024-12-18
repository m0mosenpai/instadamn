package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.text.LinkTextView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.textview.ImageWithTitleTextView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EMO extends AbstractC59962oe implements JPX {
    public static final String __redex_internal_original_name = "UserSheetFragment";
    public AbstractC018607g A00;
    public UserSession A01;
    public Reel A02;
    public AbstractC140596Xn A03;
    public User A04;
    public C34566FLa A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public ShimmerFrameLayout A0I;
    public ShimmerFrameLayout A0J;
    public LinkTextView A0K;
    public C69425VnA A0L;
    public C69147Vic A0M;
    public FollowButton A0N;
    public final C7K9 A0T = new GIJ(this, 5);
    public final C1P1 A0O = new C31714DwJ(this, 29);
    public final InterfaceC42271xH A0P = C31728DwZ.A00(this, 32);
    public final InterfaceC71930XAy A0R = new C36676GEw(this);
    public final InterfaceC154236wY A0Q = new C36481G7f(this);
    public final X8S A0S = new C36677GEx(this);

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    private void A00() {
        this.A0F.setVisibility(8);
        this.A0J.setVisibility(8);
        if (this.A04 == null && !this.A0A) {
            this.A0J.setVisibility(0);
            this.A0J.A02();
            return;
        }
        if (this.A01.userId.equals(this.A09) || !this.A0B) {
            return;
        }
        this.A0F.setVisibility(0);
        this.A0N.setTextSize(2, 14.0f);
        FollowButton followButton = this.A0N;
        ((ImageWithTitleTextView) followButton).A00 = 0;
        followButton.setTypeface(null, 1);
        AbstractC13880nE.A0a(this.A0N, 0);
        ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = this.A0N.A0J;
        UserSession userSession = this.A01;
        User user = this.A04;
        user.getClass();
        viewOnAttachStateChangeListenerC110564yT.A04(this, userSession, user);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r20.A0E != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.VJU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.VJU, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(X.EMO r20) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMO.A01(X.EMO):void");
    }

    public static void A02(EMO emo, String str) {
        C146016hy c146016hy;
        C34566FLa c34566FLa = emo.A05;
        if (c34566FLa != null && (c146016hy = ((AbstractC149546o6) c34566FLa.A02).A00) != null) {
            c146016hy.A01(c34566FLa.A00, c34566FLa.A01);
        }
        FragmentActivity requireActivity = emo.requireActivity();
        UserSession userSession = emo.A01;
        if (userSession != null) {
            C6XJ A0L = AbstractC31171DnF.A0L(requireActivity, AbstractC31364DqT.A02().A01(userSession, AbstractC31402Dr6.A01(userSession, str, "reel_context_sheet_user", I58.A00(emo, emo.A06)).A03()), userSession, ModalActivity.class, "profile");
            A0L.A02 = emo;
            A0L.A08();
            A0L.A0C(requireActivity);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return I58.A00(this, this.A06);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A0G;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-743244049);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A09 = AbstractC31173DnH.A0j(requireArguments, AbstractC111324zv.A00(736));
        this.A06 = AbstractC31173DnH.A0j(requireArguments, "args_previous_module_name");
        this.A08 = requireArguments.getString(AbstractC111324zv.A00(3956));
        boolean equals = AbstractC111324zv.A00(2712).equals(requireArguments.getString(AbstractC111324zv.A00(3942)));
        this.A0D = equals;
        this.A0C = equals;
        this.A04 = AnonymousClass189.A00(this.A01).A02(this.A09);
        this.A07 = AbstractC166997dE.A0n();
        this.A00 = AbstractC018607g.A00(this);
        new C4LM(new C61972ry(requireContext(), this.A00)).A02(this.A01, this.A0T, this.A09);
        User user = this.A04;
        if (user != null) {
            UserSession userSession = this.A01;
            AbstractC167007dF.A1K(user, userSession);
            C1ON A022 = AbstractC151506rw.A02(userSession, user.getId(), false);
            A022.A00 = new C32530EUg(9, this, user);
            C1GJ.A03(A022);
            this.A0A = false;
        }
        C1ON A00 = C1OU.A00(this.A01, this.A09);
        A00.A00 = this.A0O;
        C1GJ.A00(requireContext(), this.A00, A00);
        this.A0E = false;
        AbstractC25651Mw.A00(this.A01).A01(this.A0P, C70073Cr.class);
        C0f9.A09(1898853515, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(734303477);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.user_sheet_fragment);
        C0f9.A09(512643370, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-367453883);
        super.onDestroy();
        AbstractC25651Mw.A00(this.A01).A02(this.A0P, C70073Cr.class);
        C0f9.A09(1340241043, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-582369704);
        super.onDestroyView();
        this.A03 = null;
        C0f9.A09(-1235288135, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-698989571);
        super.onResume();
        if (!this.A0B) {
            UserSession userSession = this.A01;
            User user = this.A04;
            user.getClass();
            if (ViewOnAttachStateChangeListenerC110564yT.A00(userSession, user) == FollowStatus.A06) {
                this.A0B = true;
            }
        }
        A00();
        C0f9.A09(-23547177, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0L = new C69425VnA(AbstractC31173DnH.A0F(view, R.id.header_container));
        this.A0H = view.requireViewById(R.id.profile_support_button_container);
        this.A0F = view.requireViewById(R.id.follow_button_container);
        view.requireViewById(R.id.profile_follow_button).setVisibility(0);
        this.A0N = (FollowButton) view.requireViewById(R.id.profile_follow_button);
        this.A0J = (ShimmerFrameLayout) view.requireViewById(R.id.follow_button_shimmer_container);
        this.A0K = (LinkTextView) view.requireViewById(R.id.biography);
        this.A0I = (ShimmerFrameLayout) view.requireViewById(R.id.biography_shimmer_container);
        this.A0G = view.requireViewById(R.id.horizontal_divider);
        this.A0M = new C69147Vic(AbstractC31173DnH.A0F(view, R.id.media_preview_grid));
        A01(this);
    }
}
