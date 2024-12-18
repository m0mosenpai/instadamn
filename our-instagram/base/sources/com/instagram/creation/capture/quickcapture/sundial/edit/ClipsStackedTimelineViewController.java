package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC10360h2;
import X.AbstractC13620mo;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC171697kz;
import X.AbstractC187378Sf;
import X.AbstractC23021Ah;
import X.AbstractC25233BEq;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.AbstractC53242c7;
import X.AbstractC53880NsC;
import X.AbstractC59962oe;
import X.AbstractC72473Mu;
import X.C008102v;
import X.C00O;
import X.C0YR;
import X.C0fQ;
import X.C14360o3;
import X.C1828989k;
import X.C187358Sd;
import X.C187418Sj;
import X.C187508Ss;
import X.C187518St;
import X.C187528Su;
import X.C187538Sv;
import X.C187548Sw;
import X.C23031Ai;
import X.C3F5;
import X.C50868Mdz;
import X.C51148Mir;
import X.C55543Old;
import X.C57521Pfv;
import X.C70593Ew;
import X.C8T7;
import X.C8T9;
import X.EnumC189218Zt;
import X.EnumC53170NfR;
import X.EnumC53265Nh3;
import X.EnumC53325Ni3;
import X.InterfaceC16530ry;
import X.InterfaceC58281PsZ;
import X.InterfaceC58284Psc;
import X.OXZ;
import X.OZQ;
import X.ViewOnClickListenerC55464OkJ;
import X.ViewOnTouchListenerC50553MTk;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.capture.quickcapture.sundial.widget.alignmentguideview.AlignmentGuideView;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class ClipsStackedTimelineViewController extends OXZ implements InterfaceC58281PsZ {
    public int A00;
    public LinearLayoutManager A01;
    public C51148Mir A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final C008102v A08;
    public final AbstractC59962oe A09;
    public final UserSession A0A;
    public final InterfaceC58284Psc A0B;
    public final ClipsTimelineActionBarViewController A0C;
    public final EnumC53170NfR A0D;
    public final ClipsCreationViewModel A0E;
    public final C187418Sj A0F;
    public final C187358Sd A0G;
    public final C50868Mdz A0H;
    public final C1828989k A0I;
    public final boolean A0J;
    public IgImageView addClipsFloatingButton;
    public AlignmentGuideView alignmentGuideView;
    public AppBarLayout appBarLayout;
    public View borderLine;
    public View bottomSeekbar;
    public ViewGroup container;
    public View draggableViewCopy;
    public AbstractC72473Mu educationNuxFragment;
    public IgTextView helperText;
    public NestedScrollView nestedScrollView;
    public View seekbar;
    public StackedTimelineSpeedActionBar speedActionBar;
    public RecyclerView timeBar;
    public CoordinatorLayout tracksContainer;
    public TextView transitionEffectLabel;
    public View transparentView;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r4 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r3.A0W(r3.A0G.A0E(), r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r0 = r3.A0E.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        r0 = r0.A00.A0G.A04.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (X.AbstractC166987dD.A0H(r0.getValue()) <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        r0 = X.MSY.A0u(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (X.AbstractC166987dD.A0H(r0.getValue()) <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r3, boolean r4) {
        /*
            r2 = 0
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r3.addClipsFloatingButton
            if (r4 == 0) goto L53
            if (r0 == 0) goto La
            r0.setVisibility(r2)
        La:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0E
            X.8Ce r0 = r0.A02
            if (r0 == 0) goto L4e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r0.A0G
            X.8hl r0 = r0.A04
            X.0UO r0 = r0.A05
        L18:
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AbstractC166987dD.A0H(r0)
            r1 = 1
            if (r0 > 0) goto L26
        L23:
            r1 = 0
            if (r4 == 0) goto L3f
        L26:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0E
            X.8Ce r0 = r0.A02
            if (r0 == 0) goto L49
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r0.A0G
            X.8hl r0 = r0.A04
            X.0UO r0 = r0.A04
        L34:
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AbstractC166987dD.A0H(r0)
            if (r0 <= 0) goto L3f
            r2 = 1
        L3f:
            X.8Sd r0 = r3.A0G
            X.8Sf r0 = r0.A0E()
            r3.A0W(r0, r1, r2)
            return
        L49:
            X.02u r0 = X.MSY.A0u(r2)
            goto L34
        L4e:
            X.02u r0 = X.MSY.A0u(r2)
            goto L18
        L53:
            X.AbstractC167007dF.A0x(r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController.A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController, boolean):void");
    }

    public final void A0R() {
        this.A03 = true;
        NestedScrollView nestedScrollView = this.nestedScrollView;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, this.A00);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        EnumC53265Nh3 enumC53265Nh3;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment;
        C14360o3.A0B(view, 0);
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            this.container = viewGroup;
            StackedTimelineSpeedActionBar stackedTimelineSpeedActionBar = (StackedTimelineSpeedActionBar) viewGroup.requireViewById(R.id.stacked_timeline_speed_action_bar);
            C14360o3.A0B(stackedTimelineSpeedActionBar, 0);
            this.speedActionBar = stackedTimelineSpeedActionBar;
            RecyclerView A0G = AbstractC31172DnG.A0G(viewGroup, R.id.timebar_recyclerview);
            if (this.A0J) {
                enumC53265Nh3 = EnumC53265Nh3.A05;
            } else {
                enumC53265Nh3 = EnumC53265Nh3.A06;
            }
            C51148Mir c51148Mir = new C51148Mir(enumC53265Nh3);
            this.A02 = c51148Mir;
            A0G.setAdapter(c51148Mir);
            final Context context = A0G.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController$onViewCreated$1$1$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
                public final int A1K(C70593Ew c70593Ew, C3F5 c3f5, int i) {
                    AbstractC167017dG.A1P(c70593Ew, c3f5);
                    return super.A1K(c70593Ew, c3f5, this.A09(i));
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.AbstractC70663Fe
                public final void A1S(C3F5 c3f5) {
                    super.A1S(c3f5);
                    if (OZQ.A06) {
                        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this;
                        if (clipsStackedTimelineViewController.A04) {
                            LinearLayoutManager linearLayoutManager2 = clipsStackedTimelineViewController.A01;
                            if (linearLayoutManager2 == null) {
                                C14360o3.A0F("linearLayoutManager");
                                throw C00O.createAndThrow();
                            }
                            if (linearLayoutManager2.A1a() == 0) {
                                clipsStackedTimelineViewController.A0I(((OXZ) clipsStackedTimelineViewController).A00);
                                clipsStackedTimelineViewController.A04 = false;
                            }
                        }
                    }
                }
            };
            this.A01 = linearLayoutManager;
            A0G.setLayoutManager(linearLayoutManager);
            this.timeBar = A0G;
            RecyclerView A0O = A0O();
            Context context2 = viewGroup.getContext();
            A0O.setContentDescription(context2.getResources().getText(2131955994));
            View requireViewById = viewGroup.requireViewById(R.id.middle_seekbar);
            C14360o3.A0B(requireViewById, 0);
            this.seekbar = requireViewById;
            this.bottomSeekbar = viewGroup.findViewById(R.id.middle_seekbar_bottom_cutoff);
            View requireViewById2 = viewGroup.requireViewById(R.id.working_area_border_line);
            C14360o3.A0B(requireViewById2, 0);
            this.borderLine = requireViewById2;
            A0K(context2, this.A0H, new C57521Pfv(this, 12));
            OXZ.A07(this, this.A0E, false);
            this.helperText = AbstractC31172DnG.A0Y(viewGroup, R.id.clips_editor_helper_text);
            TextView A0T = AbstractC166997dE.A0T(viewGroup, R.id.clips_editor_transition_effect_label);
            C14360o3.A0B(A0T, 0);
            this.transitionEffectLabel = A0T;
            IgImageView A0Z = AbstractC31172DnG.A0Z(viewGroup, R.id.add_clips_button);
            this.addClipsFloatingButton = A0Z;
            if (A0Z != null) {
                A0Z.setVisibility(0);
            }
            this.tracksContainer = (CoordinatorLayout) view.findViewById(R.id.clips_editor_tracks_container);
            AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.clips_editor_sticky_tracks);
            if (appBarLayout != null) {
                ViewOnTouchListenerC50553MTk.A00(appBarLayout, 1, this);
            } else {
                appBarLayout = null;
            }
            this.appBarLayout = appBarLayout;
            NestedScrollView nestedScrollView = (NestedScrollView) view.requireViewById(R.id.clips_editor_tracks_nested_scrollview);
            nestedScrollView.A0B = new C55543Old(this);
            ViewOnTouchListenerC50553MTk.A00(nestedScrollView, 2, this);
            this.nestedScrollView = nestedScrollView;
            AlignmentGuideView alignmentGuideView = (AlignmentGuideView) viewGroup.requireViewById(R.id.alignment_guide_view);
            Context context3 = alignmentGuideView.getContext();
            alignmentGuideView.setVerticalAlignmentGuideColor(context3.getColor(R.color.stacked_alignment_guide));
            alignmentGuideView.setPadding(0, AbstractC167017dG.A09(context3), 0, 0);
            this.alignmentGuideView = alignmentGuideView;
            AbstractC59962oe abstractC59962oe = this.A09;
            if ((abstractC59962oe instanceof ClipsStackedTimelineFragment) && (clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) abstractC59962oe) != null && !clipsStackedTimelineFragment.A0u) {
                A0S();
            }
        }
        this.draggableViewCopy = view.findViewById(R.id.draggable_view_item);
        this.transparentView = view.findViewById(R.id.transparent_view);
        if (AbstractC13620mo.A02(this.A09.requireContext())) {
            CoordinatorLayout coordinatorLayout = this.tracksContainer;
            if (coordinatorLayout != null) {
                coordinatorLayout.setLayoutDirection(0);
            }
            AppBarLayout appBarLayout2 = this.appBarLayout;
            if (appBarLayout2 != null) {
                appBarLayout2.setLayoutDirection(0);
            }
            NestedScrollView nestedScrollView2 = this.nestedScrollView;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setLayoutDirection(0);
            }
            AlignmentGuideView alignmentGuideView2 = this.alignmentGuideView;
            if (alignmentGuideView2 != null) {
                alignmentGuideView2.setLayoutDirection(0);
            }
            View findViewById = view.findViewById(R.id.vertical_dragging_layout);
            if (findViewById != null) {
                findViewById.setLayoutDirection(0);
            }
            View view2 = this.draggableViewCopy;
            if (view2 != null) {
                view2.setLayoutDirection(0);
            }
            View view3 = this.transparentView;
            if (view3 != null) {
                view3.setLayoutDirection(0);
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final View A0N() {
        View view = this.seekbar;
        if (view != null) {
            return view;
        }
        C14360o3.A0F("seekbar");
        throw C00O.createAndThrow();
    }

    public final RecyclerView A0O() {
        RecyclerView recyclerView = this.timeBar;
        if (recyclerView != null) {
            return recyclerView;
        }
        C14360o3.A0F("timeBar");
        throw C00O.createAndThrow();
    }

    public final StackedTimelineSpeedActionBar A0P() {
        StackedTimelineSpeedActionBar stackedTimelineSpeedActionBar = this.speedActionBar;
        if (stackedTimelineSpeedActionBar != null) {
            return stackedTimelineSpeedActionBar;
        }
        C14360o3.A0F("speedActionBar");
        throw C00O.createAndThrow();
    }

    public final void A0Q() {
        this.A0B.APu();
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A0C;
        clipsTimelineActionBarViewController.A04().setEnabled(false);
        clipsTimelineActionBarViewController.A04().getBackground().setAlpha(77);
        clipsTimelineActionBarViewController.A04().setLabelAlpha(0.3f);
    }

    public final void A0U(int i) {
        C51148Mir c51148Mir = this.A02;
        if (c51148Mir == null) {
            C14360o3.A0F("timeBarAdapter");
            throw C00O.createAndThrow();
        }
        c51148Mir.A00 = i;
        c51148Mir.notifyItemChanged(c51148Mir.getItemCount() - 1);
    }

    public final void A0V(int i, boolean z) {
        OZQ.A02 = i;
        C51148Mir c51148Mir = this.A02;
        if (c51148Mir != null) {
            int A00 = (i / OZQ.A00(OZQ.A00, true)) + 1;
            c51148Mir.A01 = A00;
            int i2 = Integer.MAX_VALUE;
            if (!z) {
                int i3 = this.A06;
                Context requireContext = this.A09.requireContext();
                int i4 = OZQ.A02;
                int i5 = OZQ.A03;
                int i6 = i4 - ((i4 / i5) * i5);
                int i7 = i3 / 2;
                if (A00 % 2 != 1) {
                    i6 -= i5;
                }
                i2 = i7 + AbstractC53880NsC.A00(requireContext, i6);
            }
            C51148Mir c51148Mir2 = this.A02;
            if (c51148Mir2 != null) {
                c51148Mir2.A02 = this.A06 / 2;
                c51148Mir2.A00 = i2;
                c51148Mir2.notifyDataSetChanged();
                return;
            }
        }
        C14360o3.A0F("timeBarAdapter");
        throw C00O.createAndThrow();
    }

    public final void A0W(AbstractC187378Sf abstractC187378Sf, boolean z, boolean z2) {
        InterfaceC58284Psc interfaceC58284Psc;
        if (abstractC187378Sf == null) {
            this.A0B.CMl();
            return;
        }
        if (!(abstractC187378Sf instanceof C8T7) && !(abstractC187378Sf instanceof C8T9)) {
            if (!(abstractC187378Sf instanceof C187508Ss) && !(abstractC187378Sf instanceof C187528Su) && !(abstractC187378Sf instanceof C187518St) && !(abstractC187378Sf instanceof C187538Sv) && !(abstractC187378Sf instanceof C187548Sw)) {
                InterfaceC58284Psc interfaceC58284Psc2 = this.A0B;
                interfaceC58284Psc2.ElG();
                interfaceC58284Psc2.EgK(z);
                interfaceC58284Psc2.EcG(z2);
                return;
            }
            interfaceC58284Psc = this.A0B;
            interfaceC58284Psc.CMl();
        } else {
            interfaceC58284Psc = this.A0B;
            interfaceC58284Psc.ElG();
        }
        interfaceC58284Psc.EgK(false);
        interfaceC58284Psc.EcG(false);
    }

    @Override // X.InterfaceC58281PsZ
    public final void ADl(EnumC189218Zt enumC189218Zt) {
        this.A0B.ADl(enumC189218Zt);
    }

    @Override // X.InterfaceC58281PsZ
    public final AbstractC187378Sf Auy() {
        return this.A0G.A0E();
    }

    @Override // X.InterfaceC58281PsZ
    public final int BMb() {
        return this.A07;
    }

    @Override // X.InterfaceC58281PsZ
    public final void ESO(View.OnClickListener onClickListener) {
        ClipsTimelineActionBarViewController clipsTimelineActionBarViewController = this.A0C;
        C0fQ.A00(new ViewOnClickListenerC55464OkJ(52, clipsTimelineActionBarViewController, onClickListener), clipsTimelineActionBarViewController.A04());
    }

    @Override // X.InterfaceC58281PsZ
    public final void Eav(View.OnClickListener onClickListener) {
        this.A0B.Eav(onClickListener);
    }

    @Override // X.InterfaceC58281PsZ
    public final void Ecd(View.OnClickListener onClickListener) {
        ClipsTimelineActionBarViewController.A01(onClickListener, EnumC53325Ni3.A0S, this.A0C);
    }

    @Override // X.InterfaceC58281PsZ
    public final void Ecg(View.OnClickListener onClickListener) {
        ClipsTimelineActionBarViewController.A01(onClickListener, EnumC53325Ni3.A0e, this.A0C);
    }

    public ClipsStackedTimelineViewController(C008102v c008102v, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58284Psc interfaceC58284Psc, ClipsTimelineActionBarViewController clipsTimelineActionBarViewController, ClipsCreationViewModel clipsCreationViewModel, C187418Sj c187418Sj, C187358Sd c187358Sd, C50868Mdz c50868Mdz, C1828989k c1828989k, int i) {
        boolean A1V = AbstractC167007dF.A1V(userSession);
        this.A09 = abstractC59962oe;
        this.A0A = userSession;
        this.A0E = clipsCreationViewModel;
        this.A0G = c187358Sd;
        this.A0F = c187418Sj;
        this.A0H = c50868Mdz;
        this.A0I = c1828989k;
        this.A0C = clipsTimelineActionBarViewController;
        this.A0B = interfaceC58284Psc;
        this.A06 = i;
        this.A08 = c008102v;
        boolean A1X = AbstractC31172DnG.A1X(abstractC59962oe.requireArguments(), "ARG_IS_BASEL");
        this.A0J = A1X;
        this.A07 = A1X ? R.layout.basel_timeline_editor_stacked_fragment : R.layout.clips_timeline_editor_stacked_fragment_v2;
        this.A0D = EnumC53170NfR.A05;
        this.A03 = A1V;
    }

    public final void A0S() {
        ArrayList A1E = AbstractC166987dD.A1E();
        UserSession userSession = this.A0A;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A55;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 418)) {
            A1E.add(EducationNuxType.A02);
        }
        if (!A1E.isEmpty()) {
            AbstractC72473Mu abstractC72473Mu = new AbstractC72473Mu();
            AbstractC25233BEq.A15(abstractC72473Mu, "KEY_NUX_TYPES", AbstractC166987dD.A1F(A1E));
            this.educationNuxFragment = abstractC72473Mu;
            AbstractC10360h2 childFragmentManager = this.A09.getChildFragmentManager();
            C14360o3.A07(childFragmentManager);
            abstractC72473Mu.A0L(childFragmentManager, "ClipsStackedTimelineEducationNuxFragment");
            if (A1E.contains(EducationNuxType.A02)) {
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A002, A002.A55, c0yrArr, 418, true);
            }
            this.A0H.A0K.A01();
        }
    }

    public final void A0T(float f) {
        IgTextView speedLabel = A0P().getSpeedLabel();
        AbstractC59962oe abstractC59962oe = this.A09;
        AbstractC31177DnL.A0r(abstractC59962oe.requireContext(), speedLabel, AbstractC171697kz.A00(f), 2131955905);
        IgTextView speedLabel2 = A0P().getSpeedLabel();
        Context requireContext = abstractC59962oe.requireContext();
        Context requireContext2 = abstractC59962oe.requireContext();
        int i = R.attr.igds_color_creation_tools_yellow;
        if (f == 1.0f) {
            i = R.attr.igds_color_primary_text_on_media;
        }
        AbstractC166987dD.A1O(requireContext, speedLabel2, AbstractC53242c7.A0H(requireContext2, i));
    }
}
