package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;

/* renamed from: X.EMv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC32348EMv extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "DirectPromptsFragment";
    public int A00;
    public int A01;
    public Context A02;
    public IgEditText A03;
    public IgTextView A04;
    public EnumC33364Eox A05;
    public C7FQ A06;
    public C31839Dyy A07;
    public EnumC33420Epr A08;
    public C7TG A09;
    public DirectThreadKey A0A;
    public String A0B;
    public boolean A0C;
    public C142846ck A0D;
    public C31826Dyk A0E;
    public final InterfaceC09390do A0F = AbstractC60492pY.A02(this);

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
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
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "prompts_fragment";
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
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        EnumC33364Eox enumC33364Eox;
        String str;
        String str2;
        int i3;
        String str3;
        String str4;
        String str5;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        C14360o3.A0B(context, 0);
        this.A02 = context;
        IgEditText igEditText = (IgEditText) view.requireViewById(R.id.prompt_card_edit_text);
        C14360o3.A0B(igEditText, 0);
        this.A03 = igEditText;
        IgEditText A03 = A03();
        int ordinal = A05().ordinal();
        if (ordinal != 2) {
            i = 2131958987;
            if (ordinal != 3) {
                i = 2131971073;
            }
        } else {
            i = 2131954947;
        }
        A03.setHint(getString(i));
        C35469Fl4.A00(A03(), this, 8);
        A03().requestFocus();
        A03().setPadding(0, 0, 0, 0);
        AbstractC13880nE.A0S(A03());
        boolean z = this instanceof C32734Eb0;
        if (z) {
            ImageView A0I = AbstractC31173DnH.A0I(view, R.id.prompt_card_facepile);
            int dimensionPixelSize = A01().getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
            int A07 = AbstractC167017dG.A07(A01());
            Context A01 = A01();
            Context context2 = A0I.getContext();
            A0I.setImageDrawable(new C89533yt(AbstractC31174DnI.A0T(getSession(), C17060sy.A01), getModuleName(), dimensionPixelSize, A07, A01.getColor(AbstractC53242c7.A0E(context2)), A01().getColor(AbstractC53242c7.A0B(context2))));
            A0I.setVisibility(0);
        } else {
            if (this instanceof C32736Eb2) {
                C32736Eb2 c32736Eb2 = (C32736Eb2) this;
                TextView A0N = AbstractC167007dF.A0N(AbstractC166997dE.A0S(AbstractC166997dE.A0S(view, R.id.creation_cardview), R.id.prompt_card_timer), R.id.prompt_card_timer_text);
                int i4 = 2131958973;
                if (C7HD.A03(c32736Eb2.getSession())) {
                    i4 = 2131958972;
                }
                AbstractC25227BEk.A12(A0N, c32736Eb2, i4);
                c32736Eb2.A00 = AbstractC31173DnH.A0R(new C66392zG(c32736Eb2.getLayoutInflater()), new EYN(new FFR(c32736Eb2)));
                InterfaceC56392iX A012 = AbstractC56372iV.A01(view.requireViewById(R.id.prompts_suggestion_view_stub), false, false);
                c32736Eb2.A01 = A012;
                if (A012 != null) {
                    ((RecyclerView) A012.getView()).setAdapter(c32736Eb2.A00);
                    InterfaceC56392iX interfaceC56392iX = c32736Eb2.A01;
                    if (interfaceC56392iX != null) {
                        ((RecyclerView) interfaceC56392iX.getView()).setLayoutManager(new LinearLayoutManager(c32736Eb2.requireContext(), 0, false));
                        InterfaceC56392iX interfaceC56392iX2 = c32736Eb2.A01;
                        if (interfaceC56392iX2 != null) {
                            RecyclerView recyclerView = (RecyclerView) interfaceC56392iX2.getView();
                            Resources resources = view.getResources();
                            recyclerView.A10(new C51191MjZ(resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)));
                            GSR.A02(c32736Eb2, C07Y.A00(c32736Eb2), 13);
                            C35469Fl4.A00(c32736Eb2.A03(), c32736Eb2, 7);
                        }
                    }
                }
                C14360o3.A0F("suggestionRecyclerView");
                throw C00O.createAndThrow();
            }
            IgdsButton A0W = AbstractC31173DnH.A0W(view, R.id.prompt_card_camera);
            A0W.setVisibility(0);
            A0W.A02(EnumC99774dy.A03, R.drawable.instagram_camera_pano_filled_16);
            A0W.setIconPadding(8);
        }
        FragmentActivity requireActivity = requireActivity();
        if (A05() == EnumC33420Epr.A07 && C7HD.A02(getSession())) {
            i2 = 2131958896;
        } else {
            i2 = A05().A02;
        }
        AbstractC166987dD.A1P(A01(), AbstractC166997dE.A0T(view, R.id.prompt_creation_title_text), i2);
        ViewOnClickListenerC35691FpR.A01(view.requireViewById(R.id.cancel_button), 0, this);
        if (z) {
            C32734Eb0 c32734Eb0 = (C32734Eb0) this;
            TextView A0T = AbstractC166997dE.A0T(view, R.id.disclaimer_text);
            C14360o3.A0A(A0T);
            A0T.setVisibility(0);
            AnonymousClass773.A07(new Em1(c32734Eb0, c32734Eb0.requireContext().getColor(AbstractC53242c7.A06(A0T.getContext()))), A0T, AbstractC25227BEk.A0v(c32734Eb0, 2131971105), c32734Eb0.getString(2131971104));
        } else if (this instanceof C32736Eb2) {
            C32736Eb2 c32736Eb22 = (C32736Eb2) this;
            TextView A0T2 = AbstractC166997dE.A0T(view, R.id.disclaimer_text);
            C14360o3.A0A(A0T2);
            A0T2.setVisibility(0);
            AbstractC25227BEk.A12(A0T2, c32736Eb22, 2131958971);
            if (c32736Eb22.A06().A00 != null && (!AbstractC31174DnI.A1X(AbstractC166987dD.A0x(c32736Eb22.getSession()), "broadcast_channel_daily_prompt_nux", r3))) {
                Window A0H = AbstractC31174DnI.A0H(c32736Eb22);
                if (A0H != null) {
                    AbstractC167007dF.A0J().post(new RunnableC36893GNo(A0H, c32736Eb22));
                }
                String str6 = c32736Eb22.A06().A00;
                FFQ ffq = new FFQ(c32736Eb22);
                C32235EHt c32235EHt = new C32235EHt();
                c32235EHt.setArguments(AbstractC166987dD.A0b());
                c32235EHt.A01 = str6;
                c32235EHt.A00 = ffq;
                AbstractC167007dF.A0J().post(new RunnableC36895GNq(c32736Eb22, c32235EHt));
                C36297Fzr c36297Fzr = c32736Eb22.A02;
                if (c36297Fzr != null && (enumC33364Eox = ((AbstractC32348EMv) c32736Eb22).A05) != null) {
                    int ordinal2 = enumC33364Eox.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 2) {
                            str = c32736Eb22.A06().A00;
                            str2 = c32736Eb22.A06().A01;
                            i3 = ((AbstractC32348EMv) c32736Eb22).A00;
                            str3 = "daily_prompt_creator_nux_sheet_rendered";
                            str4 = "impression";
                            str5 = "daily_prompt_creation_pill";
                        }
                    } else {
                        str = c32736Eb22.A06().A00;
                        str2 = c32736Eb22.A06().A01;
                        i3 = ((AbstractC32348EMv) c32736Eb22).A00;
                        str3 = "daily_prompt_creator_nux_sheet_rendered";
                        str4 = "impression";
                        str5 = "daily_prompt_button";
                    }
                    C36297Fzr.A01(c36297Fzr, str, str2, str3, str4, str5, "thread_view", i3);
                }
            } else {
                Window A0H2 = AbstractC31174DnI.A0H(c32736Eb22);
                if (A0H2 != null) {
                    AbstractC167007dF.A0J().post(new RunnableC36894GNp(A0H2, c32736Eb22));
                }
            }
        } else {
            C32735Eb1 c32735Eb1 = (C32735Eb1) this;
            FFO ffo = new FFO(c32735Eb1);
            FFP ffp = new FFP(c32735Eb1);
            View requireViewById = view.requireViewById(R.id.prize_cell);
            IgdsListCell igdsListCell = (IgdsListCell) requireViewById;
            igdsListCell.A06(2131954946);
            igdsListCell.setTitleMaxLines(1);
            igdsListCell.A05(R.drawable.instagram_trophy_pano_outline_24);
            igdsListCell.A0K(AbstractC25227BEk.A0v(c32735Eb1, 2131954976), false);
            igdsListCell.A0C(new ViewOnClickListenerC35683FpI(63, ffp, c32735Eb1));
            C14360o3.A07(requireViewById);
            View requireViewById2 = view.requireViewById(R.id.duration_cell);
            IgdsListCell igdsListCell2 = (IgdsListCell) requireViewById2;
            igdsListCell2.A06(2131954942);
            igdsListCell2.A05(R.drawable.instagram_timer_pano_outline_24);
            igdsListCell2.A0K(AbstractC25227BEk.A0v(c32735Eb1, 2131954956), false);
            igdsListCell2.A0C(new ViewOnClickListenerC35683FpI(62, ffo, c32735Eb1));
            C14360o3.A07(requireViewById2);
            TextView A0T3 = AbstractC166997dE.A0T(view, R.id.disclaimer_text);
            C14360o3.A0A(A0T3);
            A0T3.setVisibility(0);
            String A0v = AbstractC25227BEk.A0v(c32735Eb1, 2131954941);
            String A0w = AbstractC31174DnI.A0w(c32735Eb1, A0v, 2131954940);
            C14360o3.A07(A0w);
            AnonymousClass773.A07(new EPS(new C012804r(16, A0v), C05F.A01, c32735Eb1, A0v, c32735Eb1.requireContext().getColor(AbstractC53242c7.A06(A0T3.getContext())), 0), A0T3, A0v, A0w);
            AbstractC31174DnI.A1E(c32735Eb1.getViewLifecycleOwner(), AbstractC31172DnG.A0E(c32735Eb1.A04().A01), new C50364MLq(8, igdsListCell, igdsListCell2, c32735Eb1), 18);
        }
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.send_button);
        this.A04 = A0X;
        if (A0X != null) {
            A0X.setEnabled(false);
            IgTextView igTextView = this.A04;
            if (igTextView != null) {
                ViewOnClickListenerC35683FpI.A00(igTextView, 67, requireActivity, this);
                C31826Dyk c31826Dyk = this.A0E;
                if (c31826Dyk != null) {
                    c31826Dyk.A00(requireContext(), getSession(), (IgSimpleImageView) AbstractC166997dE.A0S(requireView(), R.id.prompt_sticker_dice_icon), null, A05(), A06().A00, A06().A01, this.A01, this.A00, false);
                    C31826Dyk c31826Dyk2 = this.A0E;
                    if (c31826Dyk2 != null) {
                        AbstractC31174DnI.A1E(this, c31826Dyk2.A03, new GWH(this, 35), 19);
                        return;
                    }
                }
                C14360o3.A0F("promptNamingSuggestionsViewModel");
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("sendButton");
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final Context A01() {
        Context context = this.A02;
        if (context != null) {
            return context;
        }
        C14360o3.A0F("viewContext");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        if (this instanceof C32736Eb2) {
            return AbstractC166987dD.A0r(((C32736Eb2) this).A05);
        }
        return AbstractC166987dD.A0r(this.A0F);
    }

    public final IgEditText A03() {
        IgEditText igEditText = this.A03;
        if (igEditText != null) {
            return igEditText;
        }
        C14360o3.A0F("textField");
        throw C00O.createAndThrow();
    }

    public final C31839Dyy A04() {
        C31839Dyy c31839Dyy = this.A07;
        if (c31839Dyy != null) {
            return c31839Dyy;
        }
        C14360o3.A0F("challengeCreationViewModel");
        throw C00O.createAndThrow();
    }

    public final EnumC33420Epr A05() {
        EnumC33420Epr enumC33420Epr = this.A08;
        if (enumC33420Epr != null) {
            return enumC33420Epr;
        }
        C14360o3.A0F("currentPromptsTab");
        throw C00O.createAndThrow();
    }

    public final DirectThreadKey A06() {
        DirectThreadKey directThreadKey = this.A0A;
        if (directThreadKey != null) {
            return directThreadKey;
        }
        C14360o3.A0F("threadKey");
        throw C00O.createAndThrow();
    }

    public static final void A00(AbstractC32348EMv abstractC32348EMv) {
        FragmentActivity requireActivity = abstractC32348EMv.requireActivity();
        AbstractC13880nE.A0K(requireActivity);
        C3DO c3do = C3DN.A00;
        C3DN A00 = c3do.A00(requireActivity);
        if (A00 != null && ((C3DP) A00).A0h) {
            AbstractC167017dG.A0y(requireActivity, c3do);
        } else {
            requireActivity.onBackPressed();
        }
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

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        IllegalStateException A14;
        int i;
        Serializable serializable;
        Integer A0X;
        Integer A0X2;
        Serializable serializable2;
        EnumC33364Eox enumC33364Eox;
        String str;
        int A02 = C0f9.A02(761011302);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY);
        } else {
            parcelable = null;
        }
        if (parcelable != null) {
            DirectThreadKey directThreadKey = (DirectThreadKey) parcelable;
            C14360o3.A0B(directThreadKey, 0);
            this.A0A = directThreadKey;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null) {
                serializable = bundle3.getSerializable("prompts_tab");
            } else {
                serializable = null;
            }
            C14360o3.A0C(serializable, "null cannot be cast to non-null type com.instagram.direct.fragment.prompts.PromptsTab");
            EnumC33420Epr enumC33420Epr = (EnumC33420Epr) serializable;
            C14360o3.A0B(enumC33420Epr, 0);
            this.A08 = enumC33420Epr;
            this.A06 = C7FP.A00(this, getSession());
            this.A0D = AbstractC147806l5.A00(getSession());
            this.A0B = AbstractC167007dF.A0h(A05().toString());
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null && (A0X = AbstractC31179DnN.A0X(bundle4, "direct_thread_sub_type")) != null) {
                this.A01 = A0X.intValue();
                Bundle bundle5 = this.mArguments;
                if (bundle5 != null && (A0X2 = AbstractC31179DnN.A0X(bundle5, "direct_thread_audience_type")) != null) {
                    this.A00 = A0X2.intValue();
                    Bundle bundle6 = this.mArguments;
                    if (bundle6 != null) {
                        serializable2 = bundle6.getSerializable("prompts_entry_point");
                    } else {
                        serializable2 = null;
                    }
                    if (serializable2 instanceof EnumC33364Eox) {
                        enumC33364Eox = (EnumC33364Eox) serializable2;
                    } else {
                        enumC33364Eox = null;
                    }
                    this.A05 = enumC33364Eox;
                    C7FQ c7fq = this.A06;
                    if (c7fq == null) {
                        str = "logger";
                    } else {
                        String str2 = A06().A00;
                        String str3 = A06().A01;
                        int i2 = this.A01;
                        int i3 = this.A00;
                        String str4 = this.A0B;
                        if (str4 == null) {
                            str = "currentTabAsString";
                        } else {
                            c7fq.A01(C7D2.A01(str4), str2, str3, i2, i3);
                            C7TG A00 = AbstractC165967bO.A00(getSession());
                            C14360o3.A0B(A00, 0);
                            this.A09 = A00;
                            super.onCreate(bundle);
                            this.A0E = new C31826Dyk(requireContext(), getSession(), A05(), false);
                            requireContext();
                            getSession();
                            A05();
                            this.A07 = new C31839Dyy();
                            C0f9.A09(890023542, A02);
                            return;
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = 365835512;
            } else {
                A14 = AbstractC166987dD.A14("Required value was null.");
                i = -1327187054;
            }
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 608589333;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1464611745);
        super.onPause();
        AbstractC13880nE.A0O(A03());
        C0f9.A09(35258242, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-269497315);
        super.onResume();
        A03().requestFocus();
        C0f9.A09(-851361446, A02);
    }
}
