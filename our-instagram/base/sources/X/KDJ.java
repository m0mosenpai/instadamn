package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.reactions.tabbedreaction.model.DirectCustomReactionTabModel;

/* loaded from: classes8.dex */
public final class KDJ extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectCustomEmojiReactionsListFragment";
    public int A00;
    public long A01;
    public C66362zD A02;
    public C47378KwT A03;
    public C44517JmN A04;
    public C2EY A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public RecyclerView A0B;
    public DirectCustomReactionTabModel.TabType A0C;
    public int A0A = 1;
    public final String A0E = "direct_custom_emoji_reactions_list_fragment";
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        C49269LqP c49269LqP = new C49269LqP(this);
        UserSession A0r = AbstractC166987dD.A0r(this.A0D);
        DirectCustomReactionTabModel.TabType tabType = this.A0C;
        if (tabType == null) {
            str = "tabType";
        } else {
            A0R.A01(new KIO(this, A0r, null, c49269LqP, AbstractC167007dF.A1X(tabType, DirectCustomReactionTabModel.TabType.A03)));
            this.A02 = AbstractC31173DnH.A0R(A0R, new Object());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
            RecyclerView A0F = AbstractC31176DnK.A0F(view);
            this.A0B = A0F;
            str = "recyclerView";
            if (A0F != null) {
                A0F.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView = this.A0B;
                if (recyclerView != null) {
                    C66362zD c66362zD = this.A02;
                    if (c66362zD == null) {
                        str = "igRecyclerViewAdapter";
                    } else {
                        recyclerView.setAdapter(c66362zD);
                        RecyclerView recyclerView2 = this.A0B;
                        if (recyclerView2 != null) {
                            JY9 jy9 = new JY9(this, 12);
                            C153146ui c153146ui = C153146ui.A0A;
                            AbstractC70663Fe abstractC70663Fe = recyclerView2.A0D;
                            if (abstractC70663Fe != null) {
                                AbstractC37304Gc5.A0y(abstractC70663Fe, recyclerView2, jy9, c153146ui);
                                AbstractC25235BEs.A0S(this).A00(new PYc(this, A00(this), null, 34));
                                C44517JmN c44517JmN = this.A04;
                                if (c44517JmN == null) {
                                    str = "emojiReactionsListViewModel";
                                } else {
                                    String str2 = this.A09;
                                    if (str2 != null) {
                                        String str3 = this.A08;
                                        if (str3 != null) {
                                            c44517JmN.A00(str2, str3, this.A06, A00(this), this.A00, true);
                                            return;
                                        }
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                    throw AbstractC166987dD.A14("Required value was null.");
                                }
                            } else {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static final String A00(KDJ kdj) {
        DirectCustomReactionTabModel.TabType tabType = kdj.A0C;
        if (tabType == null) {
            C14360o3.A0F("tabType");
            throw C00O.createAndThrow();
        }
        if (tabType == DirectCustomReactionTabModel.TabType.A02) {
            return "all_tab";
        }
        String str = kdj.A06;
        if (str != null) {
            return str;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
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
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0E;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = this.A0B;
        if (recyclerView == null) {
            C14360o3.A0F("recyclerView");
            throw C00O.createAndThrow();
        }
        return AbstractC110854yx.A05(recyclerView);
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(953672792);
        super.onCreate(bundle);
        this.A09 = requireArguments().getString("direct_emoji_thread_id");
        this.A08 = requireArguments().getString(AbstractC111324zv.A00(41));
        this.A06 = requireArguments().getString("DirectFragment.DIRECT_TABBED_REACTION_EMOJI");
        this.A0A = requireArguments().getInt("OFFSCREEN_PAGE_LIMIT");
        this.A00 = requireArguments().getInt("TAB_POSITION");
        DirectCustomReactionTabModel.TabType tabType = (DirectCustomReactionTabModel.TabType) requireArguments().getParcelable("DirectFragment.DIRECT_CUSTOM_REACTION_TAB_TYPE");
        if (tabType == null) {
            tabType = DirectCustomReactionTabModel.TabType.A02;
        }
        this.A0C = tabType;
        this.A07 = requireArguments().getString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CLIENT_CONTEXT");
        this.A05 = C2EY.values()[requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_CONTENT_TYPE_ORDINAL")];
        this.A01 = requireArguments().getLong("DirectEmojiReactionsListFragment.MESSAGE_TIMESTAMP_MS");
        this.A04 = (C44517JmN) new C52942bb(new KGP(AbstractC166987dD.A0r(this.A0D), this.A07, this.A0A), requireParentFragment()).A00(C44517JmN.class);
        C0f9.A09(-885329910, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1746585205);
        C14360o3.A0B(layoutInflater, 0);
        Bundle requireArguments = requireArguments();
        String A00 = AbstractC111324zv.A00(18);
        if (requireArguments.getInt(A00) != 0) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, requireArguments().getInt(A00));
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_custom_emoji_reactions_list, viewGroup, false);
        C0f9.A09(796924018, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(579328772);
        super.onResume();
        C44517JmN c44517JmN = this.A04;
        if (c44517JmN == null) {
            C14360o3.A0F("emojiReactionsListViewModel");
            throw C00O.createAndThrow();
        }
        String str = this.A09;
        if (str != null) {
            String str2 = this.A08;
            if (str2 != null) {
                c44517JmN.A00(str, str2, this.A06, A00(this), this.A00, true);
                C0f9.A09(612512304, A02);
                return;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 733850523;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 275578783;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
