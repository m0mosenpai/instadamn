package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.api.schemas.StoryMusicPickAggregationVisibility;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import java.util.List;

/* loaded from: classes9.dex */
public final class N7L extends AbstractC59962oe implements C51D {
    public static final String __redex_internal_original_name = "MusicPickViewerFragment";
    public int A00;
    public RecyclerView A01;
    public C41181vS A02;
    public C51639MrW A03;
    public int A04;
    public final InterfaceC63982vJ A05;
    public final O46 A06;
    public final O47 A07;
    public final InterfaceC58059Pok A08;
    public final String A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        BottomSheetFragment bottomSheetFragment;
        C189478aR c189478aR;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Fragment fragment = this.mParentFragment;
        if ((fragment instanceof BottomSheetFragment) && (bottomSheetFragment = (BottomSheetFragment) fragment) != null && (c189478aR = bottomSheetFragment.A02) != null) {
            c189478aR.A0Q(false);
        }
        A00(this);
    }

    public static final void A00(N7L n7l) {
        UserSession A0r = AbstractC166987dD.A0r(n7l.A0G);
        InterfaceC09390do interfaceC09390do = n7l.A0C;
        String str = ((MusicPickStickerModel) interfaceC09390do.getValue()).A02;
        String str2 = ((MusicPickStickerModel) interfaceC09390do.getValue()).A03;
        AbstractC167027dH.A12(A0r, str2, str);
        C25621Ms A0M = AbstractC31177DnL.A0M(A0r);
        AbstractC37301Gc2.A1M(A0M, "stories/prompt_stickers/top_participants_pagination_music_pick/", str2);
        A0M.A9s("prompt_sticker_id", str);
        C14360o3.A0B("user_ids_to_materialize", 0);
        C1ON A0e = AbstractC25227BEk.A0e(A0M, XZD.class, C72887XqM.class);
        C50689MZh.A00(A0e, n7l, 20);
        n7l.schedule(A0e);
        View requireView = n7l.requireView();
        MSZ.A14(requireView, R.id.spinner);
        int A01 = AbstractC31177DnL.A01(requireView, R.id.prompt_sticker_context);
        AbstractC31172DnG.A1J(requireView, R.id.divider, A01);
        AbstractC31172DnG.A1J(requireView, R.id.prompt_sticker_participants, A01);
        AbstractC31172DnG.A1J(requireView, R.id.empty_state, A01);
        AbstractC31172DnG.A1J(requireView, R.id.magic_mod_empty_state, A01);
        AbstractC31172DnG.A1J(requireView, R.id.disabled_state, A01);
    }

    public static final void A01(N7L n7l) {
        InterfaceC09390do interfaceC09390do = n7l.A0A;
        if (!((C51175MjJ) interfaceC09390do.getValue()).A01) {
            C51639MrW c51639MrW = n7l.A03;
            if (c51639MrW == null) {
                AbstractC31171DnF.A0w();
                throw C00O.createAndThrow();
            }
            List list = c51639MrW.A08;
            if (list != null && n7l.A04 < list.size()) {
                int i = n7l.A04;
                int size = list.size();
                int i2 = n7l.A04 + n7l.A00;
                if (size > i2) {
                    size = i2;
                }
                List subList = list.subList(i, size);
                int i3 = n7l.A04 + n7l.A00;
                n7l.A04 = i3;
                boolean A1Z = AbstractC43593JPy.A1Z(i3, list.size());
                UserSession A0r = AbstractC166987dD.A0r(n7l.A0G);
                InterfaceC09390do interfaceC09390do2 = n7l.A0C;
                String str = ((MusicPickStickerModel) interfaceC09390do2.getValue()).A02;
                String str2 = ((MusicPickStickerModel) interfaceC09390do2.getValue()).A03;
                Boolean valueOf = Boolean.valueOf(A1Z);
                AbstractC167027dH.A12(A0r, str2, str);
                String str3 = null;
                C25621Ms A0M = AbstractC31177DnL.A0M(A0r);
                AbstractC37301Gc2.A1M(A0M, "stories/prompt_stickers/top_participants_pagination_music_pick/", str2);
                A0M.A9s("prompt_sticker_id", str);
                if (subList != null) {
                    str3 = AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "[", "]", subList, null);
                }
                A0M.A0H("user_ids_to_materialize", str3);
                A0M.A0F("is_last_page", valueOf);
                C1ON A0e = AbstractC25227BEk.A0e(A0M, XZD.class, C72887XqM.class);
                C50689MZh.A00(A0e, n7l, 21);
                n7l.schedule(A0e);
                C51175MjJ c51175MjJ = (C51175MjJ) interfaceC09390do.getValue();
                int i4 = 1;
                c51175MjJ.A01 = true;
                int size2 = c51175MjJ.A02.size();
                if (c51175MjJ.A00 == null) {
                    i4 = 0;
                }
                c51175MjJ.notifyItemInserted(size2 + i4);
            }
        }
    }

    public static final boolean A02(N7L n7l) {
        InterfaceC58242Prm interfaceC58242Prm;
        C51639MrW c51639MrW = n7l.A03;
        if (c51639MrW != null && (interfaceC58242Prm = c51639MrW.A02) != null) {
            if (!((C51798Mv2) interfaceC58242Prm).A01.isEmpty()) {
                C51639MrW c51639MrW2 = n7l.A03;
                if (c51639MrW2 != null) {
                    InterfaceC58242Prm interfaceC58242Prm2 = c51639MrW2.A02;
                    C14360o3.A0A(interfaceC58242Prm2);
                    if (((C51798Mv2) interfaceC58242Prm2).A00 != StoryMusicPickAggregationVisibility.A05) {
                        C51639MrW c51639MrW3 = n7l.A03;
                        if (c51639MrW3 != null) {
                            InterfaceC58242Prm interfaceC58242Prm3 = c51639MrW3.A02;
                            C14360o3.A0A(interfaceC58242Prm3);
                            if (((C51798Mv2) interfaceC58242Prm3).A00 == StoryMusicPickAggregationVisibility.A04) {
                                return true;
                            }
                            return false;
                        }
                    } else {
                        return true;
                    }
                }
                C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                throw C00O.createAndThrow();
            }
            return true;
        }
        return false;
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
        return this.A09;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
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
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && AbstractC43592JPx.A1X(recyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public N7L() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0D = C57539PgD.A00(this, enumC09460dv, 7);
        this.A0C = C57539PgD.A00(this, enumC09460dv, 6);
        this.A0E = AbstractC09440dt.A00(enumC09460dv, C57401Pdz.A00);
        this.A0A = C57539PgD.A00(this, enumC09460dv, 4);
        this.A0F = C57539PgD.A01(this, 8);
        this.A0B = C57539PgD.A00(this, enumC09460dv, 5);
        this.A07 = new O47(this);
        this.A05 = new C56531P8d(this, 3);
        this.A08 = new C56545P8r(this);
        this.A06 = new O46(this);
        this.A0G = AbstractC60492pY.A02(this);
        this.A09 = "music_pick_context_sheet_prompt";
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
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1831735678);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.prompt_sticker_viewer_fragment, false);
        C0f9.A09(330666673, A02);
        return A0R;
    }
}
