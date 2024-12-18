package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KDH extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "CollectionItemEmojiReactionsListFragment";
    public C66362zD A00;
    public InterfaceC50480MQi A01;
    public AbstractC44512JmI A02;
    public String A03;
    public String A04;
    public String A05;
    public RecyclerView A06;
    public String A07;
    public final AnonymousClass987 A09 = new AnonymousClass987();
    public final InterfaceC09390do A08 = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "collection_item_reaction_fragment";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        InterfaceC50480MQi interfaceC50480MQi;
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.header_text);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.emoji_reaction_list_header);
            if (findViewById2 != null) {
                if (requireArguments().getBoolean(AbstractC111324zv.A00(153))) {
                    AbstractC25227BEk.A12(textView, this, 2131959343);
                    i = 0;
                } else {
                    i = 8;
                }
                findViewById2.setVisibility(i);
                C66392zG A0R = AbstractC31174DnI.A0R(this);
                A0R.A01(new C45636KHz(this, new C47400Kwp(this)));
                this.A00 = AbstractC31173DnH.A0R(A0R, new Object());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
                RecyclerView A0F = AbstractC31176DnK.A0F(view);
                this.A06 = A0F;
                String str2 = "recyclerView";
                if (A0F != null) {
                    A0F.setLayoutManager(linearLayoutManager);
                    RecyclerView recyclerView = this.A06;
                    if (recyclerView != null) {
                        C66362zD c66362zD = this.A00;
                        if (c66362zD == null) {
                            str2 = "igRecyclerViewAdapter";
                        } else {
                            recyclerView.setAdapter(c66362zD);
                            AbstractC44512JmI abstractC44512JmI = this.A02;
                            if (abstractC44512JmI == null) {
                                C14360o3.A0F("emojiReactionsListViewModel");
                                throw C00O.createAndThrow();
                            }
                            AbstractC43593JPy.A1E(getViewLifecycleOwner(), abstractC44512JmI.A00, new C50261MHq(this, 3), 38);
                            if (this.A03 == null && (interfaceC50480MQi = this.A01) != null) {
                                str = "collectionItemId is null";
                            } else if (this.A04 == null && (interfaceC50480MQi = this.A01) != null) {
                                str = "collectionType is null";
                            } else {
                                RecyclerView recyclerView2 = this.A06;
                                if (recyclerView2 != null) {
                                    JY9 jy9 = new JY9(this, 10);
                                    C153146ui c153146ui = C153146ui.A0A;
                                    AbstractC70663Fe abstractC70663Fe = recyclerView2.A0D;
                                    if (abstractC70663Fe != null) {
                                        AbstractC37304Gc5.A0y(abstractC70663Fe, recyclerView2, jy9, c153146ui);
                                        AbstractC44512JmI abstractC44512JmI2 = this.A02;
                                        if (abstractC44512JmI2 == null) {
                                            str2 = "emojiReactionsListViewModel";
                                        } else {
                                            abstractC44512JmI2.A00(true);
                                            return;
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                            }
                            interfaceC50480MQi.onError(str);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
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

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
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
        RecyclerView recyclerView = this.A06;
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
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(187626278);
        super.onCreate(bundle);
        this.A03 = AbstractC153636vY.A01(requireArguments(), AbstractC111324zv.A00(387));
        this.A04 = AbstractC153636vY.A01(requireArguments(), AbstractC111324zv.A00(388));
        this.A05 = requireArguments().getString("direct_emoji_thread_id");
        this.A07 = requireArguments().getString(AbstractC111324zv.A00(389));
        UserSession A0r = AbstractC166987dD.A0r(this.A08);
        String str = this.A03;
        if (str != null) {
            String str2 = this.A04;
            if (str2 != null) {
                String str3 = this.A05;
                if (str3 != null) {
                    this.A02 = (AbstractC44512JmI) new C52942bb(new C45598KGm(A0r, str, str2, str3, this.A07), this).A00(KWZ.class);
                    C0f9.A09(-2016841405, A02);
                    return;
                } else {
                    A14 = AbstractC166987dD.A14("Required value was null.");
                    i = -1822601791;
                }
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 1050013002;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 89776490;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2146654702);
        C14360o3.A0B(layoutInflater, 0);
        int i = requireArguments().getInt(AbstractC111324zv.A00(18));
        if (i != 0) {
            layoutInflater = AbstractC43593JPy.A0C(getContext(), layoutInflater, i);
        }
        this.A09.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_emoji_reactions_list, viewGroup, false);
        C0f9.A09(1216075399, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1205118008);
        this.A09.A01();
        super.onDestroyView();
        C0f9.A09(-137584432, A02);
    }
}
