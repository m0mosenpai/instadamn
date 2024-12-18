package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.modal.ModalActivity;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class ENZ extends AbstractC60672pq implements InterfaceC60442pS, C51E, C51D, InterfaceC1570173f, InterfaceC11480j6, InterfaceC60122ou, GZD, C53T, GYX {
    public static final String __redex_internal_original_name = "LikesListFragment";
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public MTJ A04;
    public C38321qM A05;
    public InterfaceC38371qR A06;
    public C71L A07;
    public IgdsInlineSearchBox A08;
    public C196188m9 A09;
    public EQM A0A;
    public C50861Mds A0B;
    public OHW A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public Integer A0F;
    public String A0G;
    public InterfaceC16820sZ A0H;
    public InterfaceC16820sZ A0I;
    public boolean A0J;
    public C31445Drp A0L;
    public C38E A0M;
    public String A0N;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C1I2 A0U = new JXT(this, 5);
    public String A0O = "";
    public boolean A0K = true;
    public final InterfaceC09390do A0T = AbstractC60492pY.A02(this);

    @Override // X.C53T
    public final void D3g(IgImageView igImageView, InterfaceC38371qR interfaceC38371qR, int i, int i2, boolean z, boolean z2) {
        AbstractC167007dF.A1E(interfaceC38371qR, 0, igImageView);
        InterfaceC09390do interfaceC09390do = this.A0T;
        C5SE c5se = new C5SE(AbstractC166987dD.A0r(interfaceC09390do), interfaceC38371qR);
        c5se.A00 = i2;
        c5se.A01 = i;
        C37952Gmu c37952Gmu = new C37952Gmu(this, AbstractC166987dD.A0r(interfaceC09390do), c5se, this, C2Fb.A2E);
        AbstractC31177DnL.A1K(interfaceC38371qR, c37952Gmu, i2, i);
        c37952Gmu.A00(igImageView, c5se, interfaceC38371qR.BQN());
        if (interfaceC38371qR instanceof C40971v4) {
            c37952Gmu.A0O = (C40971v4) interfaceC38371qR;
        }
        new C37953Gmv(c37952Gmu).A04();
        C38321qM BQN = interfaceC38371qR.BQN();
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        EnumC906041v enumC906041v = null;
        AndroidLink A02 = AbstractC905941u.A02(requireActivity, A0r, BQN, i2, false);
        EnumC906041v enumC906041v2 = null;
        if (A02 != null) {
            enumC906041v = AbstractC114965Hm.A01(A02);
        }
        if (enumC906041v != EnumC906041v.AD_DESTINATION_CANVAS) {
            if (A02 != null) {
                enumC906041v2 = AbstractC114965Hm.A01(A02);
            }
            if (enumC906041v2 != EnumC906041v.AD_DESTINATION_CLIPS_VIEWER) {
                return;
            }
        }
        AbstractC31179DnN.A0x(this);
    }

    @Override // X.InterfaceC1570173f
    public final void D4K(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        String str;
        AbstractC167017dG.A1N(reel, gradientSpinnerAvatarView);
        List A1J = AbstractC166987dD.A1J(reel);
        C38E c38e = this.A0M;
        if (c38e == null) {
            str = "reelViewerLauncher";
        } else {
            String str2 = this.A0N;
            if (str2 == null) {
                str = "reelTraySessionId";
            } else {
                c38e.A0C = str2;
                C31559Dtj.A00(requireActivity(), gradientSpinnerAvatarView.getAvatarBounds(), c38e, this, 15);
                c38e.A0A(reel, C3G2.A1I, gradientSpinnerAvatarView, A1J, A1J, A1J);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1570173f
    public final void DHp(User user, int i) {
    }

    @Override // X.InterfaceC1570173f
    public final void DT1(User user) {
        String str;
        C14360o3.A0B(user, 0);
        if (this.A0S) {
            String B8y = user.B8y();
            String id = user.getId();
            String str2 = this.A0G;
            if (str2 != null) {
                ClipsInteractionReplySheetContent clipsInteractionReplySheetContent = new ClipsInteractionReplySheetContent(SocialContextType.A0C, user.Bhu(), B8y, id, str2, null, getModuleName());
                FragmentActivity requireActivity = requireActivity();
                UserSession A0r = AbstractC166987dD.A0r(this.A0T);
                InterfaceC16820sZ interfaceC16820sZ = this.A0I;
                if (interfaceC16820sZ != null) {
                    InterfaceC16820sZ interfaceC16820sZ2 = this.A0H;
                    if (interfaceC16820sZ2 != null) {
                        F3U.A00(requireActivity, A0r, clipsInteractionReplySheetContent, interfaceC16820sZ, interfaceC16820sZ2);
                        return;
                    }
                    str = "logReplyBottomSheetKeyboardInteraction";
                } else {
                    str = "logUserProfileClickFromBottomSheet";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
        }
        C36881nl A01 = C36881nl.A01(requireActivity(), this, AbstractC166987dD.A0r(this.A0T), "message_button");
        AbstractC31179DnN.A1Q(A01, user);
        A01.A06();
    }

    @Override // X.InterfaceC1570173f
    public final void Dy8(User user, int i) {
        C14360o3.A0B(user, 0);
        FragmentActivity requireActivity = requireActivity();
        String id = user.getId();
        String moduleName = getModuleName();
        InterfaceC09390do interfaceC09390do = this.A0T;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), id, AbstractC111324zv.A00(2664), moduleName);
        if (this.A0J) {
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            AbstractC31173DnH.A1I(this, AbstractC31171DnF.A0L(requireActivity(), AbstractC31364DqT.A00(A01, interfaceC09390do), A0o, ModalActivity.class, "profile"));
        } else {
            C140966Yy A0c = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do);
            A0c.A0F = true;
            C31368DqX.A02(A0c, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
        }
    }

    @Override // X.InterfaceC1570173f
    public final void Dy9(View view, User user, int i) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (isAdded()) {
            if (this.A0J) {
                interfaceC56362iU.EkF(false);
            }
            C50861Mds c50861Mds = this.A0B;
            if (c50861Mds == null) {
                C14360o3.A0F("likesListViewModel");
                throw C00O.createAndThrow();
            }
            interfaceC56362iU.Efu(c50861Mds.A0E(this.A0F));
            if (this.A05 != null) {
                UserSession A0r = AbstractC166987dD.A0r(this.A0T);
                C38321qM c38321qM = this.A05;
                C14360o3.A0A(c38321qM);
                if (BO2.A01(A0r, c38321qM)) {
                    BO2.A00(requireContext(), ViewOnClickListenerC35682FpH.A00(this, 42), interfaceC56362iU);
                }
            }
            interfaceC56362iU.EkS(true);
        }
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51E
    public final boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final int getExtraDragSpace() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.C51E
    public final boolean isScrolledToBottom() {
        if (this.mView != null && getRecyclerView() != null && getRecyclerView().canScrollVertically(1)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        if (this.mView != null && getRecyclerView() != null && getRecyclerView().canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.GZD
    public final void onSearchTextChanged(String str) {
        C14360o3.A0B(str, 0);
        if (!C14360o3.A0K(this.A0O, str)) {
            this.A0O = str;
            C50861Mds c50861Mds = this.A0B;
            if (c50861Mds == null) {
                C14360o3.A0F("likesListViewModel");
                throw C00O.createAndThrow();
            }
            c50861Mds.A04.Egh(str);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A07 != null && this.A0K) {
            View view2 = this.A03;
            if (view2 == null) {
                C14360o3.A0F("likesContainer");
                throw C00O.createAndThrow();
            }
            ViewGroup viewGroup = (ViewGroup) view2;
            Context requireContext = requireContext();
            InterfaceC09390do interfaceC09390do = this.A0T;
            C37993Gne c37993Gne = new C37993Gne(requireContext, AbstractC166987dD.A0r(interfaceC09390do), this);
            View A01 = C37993Gne.A04.A01(requireContext(), viewGroup, AbstractC166987dD.A0r(interfaceC09390do));
            C25601BTo c25601BTo = new C25601BTo(AbstractC166987dD.A0r(interfaceC09390do), this, this);
            C37994Gnf c37994Gnf = new C37994Gnf(this.A02, this.A01);
            Object tag = A01.getTag();
            if (tag != null) {
                InterfaceC38371qR interfaceC38371qR = this.A06;
                C14360o3.A0A(interfaceC38371qR);
                c37993Gne.A00(c25601BTo.A00(interfaceC38371qR, c37994Gnf), (C37991Gnc) tag);
                viewGroup.addView(A01);
                viewGroup.invalidate();
                C71L c71l = this.A07;
                C14360o3.A0A(c71l);
                c71l.A02(A01);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        getScrollingViewProxy().AAJ(this.A0U);
        AbstractC31174DnI.A0G(this).setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Activity A04 = AbstractC31172DnG.A04(this);
        InterfaceC09390do interfaceC09390do2 = this.A0T;
        C31445Drp A00 = AbstractC31589DuH.A00(A04, this, AbstractC166987dD.A0r(interfaceC09390do2), 23606367);
        getScrollingViewProxy().AAJ(A00);
        this.A0L = A00;
        registerLifecycleListener(A00);
        InterfaceC65242xM interfaceC65242xM = this.A0A;
        if (interfaceC65242xM == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        setAdapter(interfaceC65242xM);
        String str = this.A0O;
        if (AbstractC167007dF.A1O(str.length())) {
            IgdsInlineSearchBox igdsInlineSearchBox = this.A08;
            if (igdsInlineSearchBox != null) {
                igdsInlineSearchBox.A0E.setText(str);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        C71313Hs.A00(AbstractC166987dD.A0o(interfaceC09390do2)).A05(view, EnumC71343Hv.A0V);
        if (this.A0Q && !this.A0P) {
            CTV ctv = FEN.A00;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
            String str2 = this.A0G;
            if (str2 != null) {
                ctv.A00(this, A0r, str2, this.A02);
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        A02(this);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 41), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public static final void A00(ENZ enz) {
        EQM eqm = enz.A0A;
        if (eqm != null) {
            eqm.A0C = false;
            AbstractC31178DnM.A10(enz, false);
            EQM eqm2 = enz.A0A;
            if (eqm2 != null) {
                if (eqm2.A0R.isEmpty()) {
                    AbstractC31557Dth.A01(enz, false);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    public static final void A01(ENZ enz) {
        EQM eqm = enz.A0A;
        if (eqm == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        C38321qM c38321qM = enz.A05;
        if (c38321qM != null) {
            eqm.A03 = c38321qM;
            eqm.A0P.A00 = c38321qM;
            eqm.A03();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(ENZ enz) {
        EQM eqm = enz.A0A;
        if (eqm != null) {
            eqm.A0C = true;
            AbstractC31178DnM.A10(enz, true);
            EQM eqm2 = enz.A0A;
            if (eqm2 != null) {
                if (eqm2.A0R.isEmpty()) {
                    AbstractC31557Dth.A01(enz, true);
                    return;
                }
                return;
            }
        }
        C14360o3.A0F("adapter");
        throw C00O.createAndThrow();
    }

    public final void A03() {
        EQM eqm = this.A0A;
        if (eqm == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        eqm.notifyDataSetChanged();
    }

    public final void A04() {
        EQM eqm = this.A0A;
        if (eqm == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        eqm.A03();
    }

    @Override // X.InterfaceC11480j6
    public final C11520jB E6b() {
        C38321qM c38321qM = this.A05;
        if (c38321qM != null) {
            InterfaceC09390do interfaceC09390do = this.A0T;
            if (c38321qM.A2E(AbstractC166987dD.A0r(interfaceC09390do)) != null) {
                C11520jB c11520jB = new C11520jB();
                C38321qM c38321qM2 = this.A05;
                C14360o3.A0A(c38321qM2);
                User A2E = c38321qM2.A2E(AbstractC166987dD.A0r(interfaceC09390do));
                C14360o3.A0A(A2E);
                c11520jB.A0A(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A2E.getId());
                C38321qM c38321qM3 = this.A05;
                C14360o3.A0A(c38321qM3);
                c11520jB.A0A("media_id", c38321qM3.getId());
                return c11520jB;
            }
        }
        return null;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str;
        User A2E;
        InterfaceC09390do interfaceC09390do = this.A0T;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C38321qM c38321qM = this.A05;
        if (c38321qM != null && (A2E = c38321qM.A2E(AbstractC166987dD.A0r(interfaceC09390do))) != null) {
            str = A2E.getId();
        } else {
            str = null;
        }
        C14360o3.A0B(A0r, 0);
        if (C2TN.A07(A0r.userId, str)) {
            return "self_likers";
        }
        return "likers";
    }

    @Override // X.GYX
    public final View getRowView() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A08;
        if (igdsInlineSearchBox == null && !C2U7.A00) {
            throw AbstractC166987dD.A14(MSV.A00(26));
        }
        C14360o3.A0A(igdsInlineSearchBox);
        return igdsInlineSearchBox;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0T);
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
        C71L c71l = this.A07;
        if (c71l != null) {
            c71l.A01(i);
        }
    }

    @Override // X.GZD
    public final void onSearchCleared(String str) {
        C50861Mds c50861Mds = this.A0B;
        if (c50861Mds == null) {
            C14360o3.A0F("likesListViewModel");
            throw C00O.createAndThrow();
        }
        c50861Mds.A04.Egh("");
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Integer num;
        super.onActivityResult(i, i2, intent);
        if ((i == 4921 || i == 4928) && this.A05 != null) {
            if (i2 == 1 || i2 == 2) {
                InterfaceC09390do interfaceC09390do = this.A0T;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                C38321qM c38321qM = this.A05;
                if (c38321qM != null) {
                    OEK A00 = C79923hh.A00(C82G.A0b, new C55878OrS(this, 2), A0r2, c38321qM, C05F.A15);
                    Context requireContext = requireContext();
                    if (i2 == 1) {
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                    }
                    C79923hh.A03(requireContext, A00, A0r, num);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b6, code lost:
    
        if (X.FYF.A01(r9) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01bf, code lost:
    
        if (r12 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d3, code lost:
    
        if (X.C2TN.A04(r9, r10.A2E(r9)) == false) goto L66;
     */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.Object, X.2sz] */
    @Override // X.AbstractC60672pq, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r44) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ENZ.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1716357636);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview_with_progress, viewGroup, false);
        this.A03 = inflate.requireViewById(R.id.layout_listview_parent_container);
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        IgdsInlineSearchBox igdsInlineSearchBox = new IgdsInlineSearchBox(context, null, 0);
        AbstractC31174DnI.A1D(igdsInlineSearchBox, -1, -2);
        igdsInlineSearchBox.A02 = this;
        igdsInlineSearchBox.setImeOptions(6);
        if (this.A0J) {
            AbstractC13880nE.A0d(igdsInlineSearchBox, AbstractC167017dG.A06(requireContext()));
            igdsInlineSearchBox.setSearchRowBackgroundColor(R.drawable.elevated_searchbar_background);
        }
        this.A08 = igdsInlineSearchBox;
        C0f9.A09(-241126143, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(192231194);
        EQM eqm = this.A0A;
        if (eqm == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        C161887My c161887My = eqm.A06;
        if (c161887My != null) {
            c161887My.A01();
        }
        this.A07 = null;
        super.onDestroy();
        C0f9.A09(-1728813225, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1797574496);
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            AbstractC13880nE.A0O(currentFocus);
        }
        IgdsInlineSearchBox igdsInlineSearchBox = this.A08;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A03();
            this.A08 = null;
            C6WL.A00(AbstractC166987dD.A0r(this.A0T)).A01.set(false);
            unregisterLifecycleListener(this.A0L);
            this.A0L = null;
            super.onDestroyView();
            C0f9.A09(1213789434, A02);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(459214787, A02);
        throw A0g;
    }

    @Override // X.AbstractC60672pq
    public final void onRecyclerViewCreated(RecyclerView recyclerView) {
        AbstractC31179DnN.A12(recyclerView);
        recyclerView.A0S = true;
        recyclerView.setItemAnimator(null);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1242086420);
        super.onResume();
        C3M4 A05 = C1OU.A05(requireActivity());
        if (A05 != null && A05.A0a() && A05.A0G == C3G2.A1I) {
            A05.A0Y(this);
        }
        C0f9.A09(-1885450564, A02);
    }
}
