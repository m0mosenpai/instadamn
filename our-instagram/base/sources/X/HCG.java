package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.Scene;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HCG extends AbstractC59962oe implements InterfaceC60442pS, InterfaceC60122ou, MOE {
    public static final String __redex_internal_original_name = "PromptPivotPageFragment";
    public ViewGroup A00;
    public FrameLayout A01;
    public AnonymousClass303 A02;
    public C38321qM A03;
    public C64842wi A04;
    public C66132yp A05;
    public PromptStickerModel A06;
    public C1M1 A07;
    public String A08;
    public C8JW A09;
    public InterfaceC41501vz A0A;
    public Trigger A0B;
    public final String A0C = AbstractC167017dG.A0j();
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131971044);
        interfaceC56362iU.EkT(ViewOnClickListenerC42032Ik1.A00(this, 38), true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A02(C05F.A00);
        AbstractC31176DnK.A1B(ViewOnClickListenerC42032Ik1.A00(this, 39), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_prompt_pivot_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C4SX c4sx;
        long j;
        String str2;
        String A38;
        Long A0j;
        User A2E;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.requireViewById(R.id.swipe_refresh).setEnabled(false);
        InterfaceC09390do interfaceC09390do = this.A0D;
        String str3 = null;
        ((C38320GtF) interfaceC09390do.getValue()).A03.A02.A04(null, null, C16930sl.A00, false);
        ViewGroup viewGroup = (ViewGroup) view.requireViewById(R.id.use_in_camera_button_scene_root);
        this.A00 = viewGroup;
        String str4 = "useInCameraButtonGroup";
        String str5 = null;
        if (viewGroup != null) {
            TextView A0T = AbstractC166997dE.A0T(viewGroup, R.id.use_in_camera_label);
            Context context = A0T.getContext();
            if (context != null) {
                str3 = context.getString(2131971039);
            }
            A0T.setText(str3);
            AbstractC56952jT.A01(A0T);
            ViewGroup viewGroup2 = this.A00;
            if (viewGroup2 != null) {
                Scene scene = new Scene(viewGroup2, (ViewGroup) view.findViewById(R.id.use_in_camera_button));
                ViewGroup viewGroup3 = this.A00;
                if (viewGroup3 != null) {
                    ((AppBarLayout) view.requireViewById(R.id.app_bar_layout)).A02(new C27282C2h(scene, Scene.getSceneForLayout(viewGroup3, R.layout.layout_use_in_camera_button_scrolling, getActivity())));
                    ViewGroup viewGroup4 = this.A00;
                    if (viewGroup4 != null) {
                        C3P9 A0s = AbstractC166987dD.A0s(viewGroup4);
                        A0s.A04 = new C37846Gl0(this, 1);
                        A0s.A07 = true;
                        A0s.A00();
                        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new PZH(this, null, 9), ((C38320GtF) interfaceC09390do.getValue()).A07));
                        UserSession A0r = AbstractC166987dD.A0r(this.A0E);
                        PromptStickerModel promptStickerModel = this.A06;
                        if (promptStickerModel == null) {
                            str4 = "promptStickerModel";
                        } else {
                            String str6 = promptStickerModel.A03;
                            C38321qM c38321qM = this.A03;
                            C8JW c8jw = this.A09;
                            AbstractC167007dF.A1D(A0r, 0, str6);
                            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, A0r), "instagram_organic_sticker_page_impression");
                            if (A0f.isSampled()) {
                                if (c38321qM != null && (A2E = c38321qM.A2E(A0r)) != null) {
                                    str = A2E.getId();
                                } else {
                                    str = null;
                                }
                                AbstractC25225BEi.A1O(A0f, "clips_prompt_pivot_page");
                                if (str != null) {
                                    c4sx = C4SX.A00(str);
                                } else {
                                    c4sx = new C4SX(0L);
                                }
                                A0f.AAK(c4sx, "media_author_id");
                                if (c38321qM != null && (A38 = c38321qM.A38()) != null && (A0j = AbstractC166997dE.A0j(A38)) != null) {
                                    j = A0j.longValue();
                                } else {
                                    j = 0;
                                }
                                AbstractC25230BEn.A1B(A0f, j);
                                AbstractC25225BEi.A1M(EnumC39652Hih.A0w, A0f);
                                AbstractC37300Gc1.A0j(A0f, AbstractC166997dE.A0j(str6));
                                AbstractC25230BEn.A1C(A0f, 0L);
                                AbstractC37300Gc1.A0p(A0f, AbstractC166997dE.A0n());
                                if (c38321qM != null) {
                                    str2 = c38321qM.A0C.getMezqlToken();
                                } else {
                                    str2 = null;
                                }
                                A0f.AAP("mezql_token", str2);
                                if (c38321qM != null) {
                                    str5 = AbstractC25226BEj.A1G(c38321qM);
                                }
                                AbstractC25233BEq.A17(A0f, "ranking_info_token", str5);
                                A0f.A8R(c8jw, "pivot_page_entry_point");
                                A0f.Cht();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    @Override // X.MOE
    public final void DyL() {
        String str;
        C26029BfI c26029BfI = (C26029BfI) ((C38320GtF) this.A0D.getValue()).A0B.getValue();
        if (c26029BfI != null && (str = c26029BfI.A08) != null) {
            InterfaceC09390do interfaceC09390do = this.A0E;
            AbstractC25236BEt.A0h(AbstractC37301Gc2.A04(AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), AbstractC31402Dr6.A02(AbstractC166987dD.A0r(interfaceC09390do), str, "clips_prompt_pivot_page", "clips_prompt_pivot_page")), this, AbstractC166987dD.A0o(interfaceC09390do));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public HCG() {
        C57551PgP c57551PgP = new C57551PgP(this, 49);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50164MDr(new C50164MDr(this, 0), 1));
        this.A0D = AbstractC25225BEi.A0a(new C50164MDr(A00, 2), c57551PgP, new C57251PbZ(44, null, A00), AbstractC25225BEi.A1D(C38320GtF.class));
        this.A0E = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == 9683) {
            C35221FgE.A01(requireContext(), AbstractC166987dD.A0r(this.A0E));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A0c;
        int i;
        Parcelable.Creator creator;
        C8JW c8jw;
        User user;
        Trigger trigger;
        int A02 = C0f9.A02(-1965379074);
        super.onCreate(bundle);
        this.A07 = C1M3.A00();
        Bundle requireArguments = requireArguments();
        this.A08 = requireArguments.getString("media_id");
        Trigger trigger2 = null;
        Object obj = StoryPromptTappableData.class.getDeclaredField("CREATOR").get(null);
        if ((obj instanceof Parcelable.Creator) && (creator = (Parcelable.Creator) obj) != null) {
            Parcelable parcelable = (Parcelable) C0B1.A01(creator, requireArguments.getParcelable(AbstractC43591JPw.A00(9)), StoryPromptTappableData.class);
            if (parcelable != null) {
                this.A06 = new PromptStickerModel((StoryPromptTappableDataIntf) parcelable);
                InterfaceC09390do interfaceC09390do = this.A0E;
                this.A03 = AbstractC31176DnK.A0Z(interfaceC09390do).A02(this.A08);
                Serializable serializable = requireArguments.getSerializable(AbstractC111324zv.A00(1194));
                if (serializable instanceof C8JW) {
                    c8jw = (C8JW) serializable;
                } else {
                    c8jw = null;
                }
                this.A09 = c8jw;
                C37816GkW A00 = C37816GkW.A00(this, 9);
                AbstractC31176DnK.A0Q(interfaceC09390do).A01(A00, C57452kK.class);
                this.A0A = A00;
                PromptStickerModel promptStickerModel = this.A06;
                if (promptStickerModel == null) {
                    C14360o3.A0F("promptStickerModel");
                    throw C00O.createAndThrow();
                }
                if (promptStickerModel.A07 && (user = promptStickerModel.A02) != null) {
                    String id = user.getId();
                    if (id.equals(AbstractC31178DnM.A0U(interfaceC09390do).getId())) {
                        trigger = Trigger.A0s;
                    } else {
                        if (!id.equals(AbstractC31178DnM.A0U(interfaceC09390do).getId())) {
                            trigger = Trigger.A0r;
                        }
                        this.A0B = trigger2;
                    }
                    C27961Xa A002 = AbstractC54912fq.A00();
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                    QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0n;
                    C54922fr A0S = AbstractC31175DnJ.A0S();
                    A0S.A04 = new C42767Iw5(this, 0);
                    A0S.A08 = new MUU(this, 4);
                    C64842wi A0T = AbstractC31175DnJ.A0T(this, A0r, A0S, A002, quickPromotionSlot);
                    C27961Xa A003 = AbstractC54912fq.A00();
                    requireContext();
                    C66132yp A04 = A003.A04(this, AbstractC166987dD.A0r(interfaceC09390do), A0T);
                    this.A02 = new AnonymousClass303(null, ImmutableList.of((Object) A04));
                    this.A05 = A04;
                    this.A04 = A0T;
                    trigger2 = trigger;
                    this.A0B = trigger2;
                }
                C0f9.A09(1279477410, A02);
                return;
            }
            A0c = AbstractC25227BEk.A0n();
            i = 1416938967;
        } else {
            String A004 = AbstractC43591JPw.A00(61);
            Map map = C0YZ.A03;
            A0c = AbstractC167007dF.A0c(A004, AbstractC13230m9.A01(StoryPromptTappableData.class));
            i = 1040605009;
        }
        C0f9.A09(i, A02);
        throw A0c;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1267053900);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_default_parent_fragment, viewGroup, false);
        this.A01 = (FrameLayout) inflate.requireViewById(R.id.megaphone_container);
        UserSession A0r = AbstractC166987dD.A0r(this.A0E);
        AbstractC10360h2 childFragmentManager = getChildFragmentManager();
        C38320GtF c38320GtF = (C38320GtF) this.A0D.getValue();
        PromptStickerModel promptStickerModel = this.A06;
        if (promptStickerModel == null) {
            C14360o3.A0F("promptStickerModel");
            throw C00O.createAndThrow();
        }
        String A05 = promptStickerModel.A05();
        String str = this.A0C;
        C14360o3.A0B(A0r, 0);
        AbstractC167017dG.A1Q(childFragmentManager, c38320GtF);
        C14360o3.A0B(str, 5);
        C26829Bsr A00 = CLF.A00(A0r);
        C26837Bsz A002 = CLE.A00(ClipsViewerSource.A0a, A05, str, null, false);
        C14240no c14240no = new C14240no(childFragmentManager);
        c14240no.A09(A00, R.id.header_container);
        c14240no.A09(A002, R.id.grid_container);
        c14240no.A0H(new RunnableC43153J5q(this, c38320GtF, A002, A00));
        c14240no.A0K();
        C0f9.A09(442458403, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(807646316);
        super.onDestroy();
        InterfaceC41501vz interfaceC41501vz = this.A0A;
        if (interfaceC41501vz != null) {
            AbstractC31176DnK.A0Q(this.A0E).A02(interfaceC41501vz, C57452kK.class);
        }
        C0f9.A09(-628758721, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C64842wi c64842wi;
        int A02 = C0f9.A02(792390727);
        super.onResume();
        Trigger trigger = this.A0B;
        if (trigger != null && (c64842wi = this.A04) != null) {
            java.util.Set singleton = Collections.singleton(trigger);
            C14360o3.A07(singleton);
            c64842wi.AVr(singleton);
        }
        C0f9.A09(490671811, A02);
    }
}
