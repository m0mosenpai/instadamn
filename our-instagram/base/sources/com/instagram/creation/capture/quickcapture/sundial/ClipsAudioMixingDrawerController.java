package com.instagram.creation.capture.quickcapture.sundial;

import X.AbstractC185298Jv;
import X.AbstractC59962oe;
import X.AnonymousClass229;
import X.AnonymousClass844;
import X.AnonymousClass846;
import X.AnonymousClass874;
import X.AnonymousClass877;
import X.C05F;
import X.C09530e4;
import X.C0YZ;
import X.C14360o3;
import X.C191708eS;
import X.C206899Du;
import X.C52942bb;
import X.C57012jc;
import X.C60842q8;
import X.C70569Wd3;
import X.C87C;
import X.C87D;
import X.C87G;
import X.C87H;
import X.C8A8;
import X.C8BD;
import X.C8BE;
import X.C8BF;
import X.C8BG;
import X.C8BI;
import X.C8BJ;
import X.C8BK;
import X.C8BM;
import X.C8BN;
import X.C8BO;
import X.C8BP;
import X.C9ES;
import X.C9F5;
import X.EnumC138556Pl;
import X.EnumC1810181d;
import X.EnumC1810381f;
import X.EnumC185288Jt;
import X.EnumC50631MWs;
import X.InterfaceC09390do;
import X.InterfaceC143326dX;
import X.InterfaceC1810081c;
import X.InterfaceC60082oq;
import X.InterfaceC60602pj;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.search.tabloader.MusicOverlaySearchTab;

/* loaded from: classes4.dex */
public final class ClipsAudioMixingDrawerController implements InterfaceC60602pj, InterfaceC60082oq, C8BD {
    public float A00;
    public FrameLayout A01;
    public InterfaceC143326dX A02;
    public C70569Wd3 A03;
    public C70569Wd3 A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C8BP A0B;
    public C8BK A0C;
    public final Context A0D;
    public final AbstractC59962oe A0E;
    public final UserSession A0F;
    public final TargetViewSizeProvider A0G;
    public final AnonymousClass874 A0H;
    public final C8BF A0I;
    public final C87D A0J;
    public final ClipsCreationViewModel A0K;
    public final InterfaceC09390do A0L;
    public final AnonymousClass877 A0M;
    public final C8BG A0N;
    public final C87H A0O;
    public C57012jc audioMixingDrawerContainerViewStubHolder;
    public AnonymousClass844 musicBrowseSessionProvider;
    public View postCaptureVideoContainer;
    public InterfaceC1810081c quickCaptureState;

    public ClipsAudioMixingDrawerController(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C57012jc c57012jc, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass874 anonymousClass874, AnonymousClass877 anonymousClass877, InterfaceC1810081c interfaceC1810081c, AnonymousClass844 anonymousClass844) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(anonymousClass877, 5);
        C14360o3.A0B(abstractC59962oe, 6);
        this.A0F = userSession;
        this.quickCaptureState = interfaceC1810081c;
        this.audioMixingDrawerContainerViewStubHolder = c57012jc;
        this.postCaptureVideoContainer = view;
        this.A0M = anonymousClass877;
        this.A0E = abstractC59962oe;
        this.musicBrowseSessionProvider = anonymousClass844;
        this.A0H = anonymousClass874;
        this.A0G = targetViewSizeProvider;
        this.A0D = abstractC59962oe.getContext();
        C87H A00 = ((C87G) new C52942bb(abstractC59962oe.requireActivity()).A00(C87G.class)).A00("post_capture");
        this.A0O = A00;
        this.A0J = (C87D) new C52942bb(new C87C(userSession, abstractC59962oe.requireActivity()), abstractC59962oe.requireActivity()).A00(C87D.class);
        this.A0K = (ClipsCreationViewModel) new C52942bb(new AnonymousClass846(userSession, abstractC59962oe.requireActivity()), abstractC59962oe.requireActivity()).A00(ClipsCreationViewModel.class);
        this.A0L = new C60842q8(new C9ES(abstractC59962oe, 14), new C9ES(this, 13), new C9F5(14, null, abstractC59962oe), new C0YZ(C8BE.class));
        this.A0I = (C8BF) new C52942bb(abstractC59962oe.requireActivity()).A00(C8BF.class);
        C8BG c8bg = (C8BG) new C52942bb(abstractC59962oe.requireActivity()).A00(C8BG.class);
        this.A0N = c8bg;
        A00.A0A.A06(abstractC59962oe, new C8BI(new C206899Du(this, 23)));
        C8BJ c8bj = new C8BJ(this);
        this.A0C = c8bj;
        AbstractC59962oe abstractC59962oe2 = this.A0E;
        Context requireContext = abstractC59962oe2.requireContext();
        UserSession userSession2 = this.A0F;
        EnumC1810381f enumC1810381f = EnumC1810381f.A02;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        C8BM c8bm = new C8BM() { // from class: X.8BL
            @Override // X.C8BM
            public final /* synthetic */ void DlU() {
            }

            @Override // X.C8BM
            public final void CzF() {
                ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = ClipsAudioMixingDrawerController.this;
                if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
                    C214659f3 c214659f3 = new C214659f3();
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", clipsAudioMixingDrawerController.A0F.token);
                    c214659f3.setArguments(bundle);
                    C70569Wd3 A002 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                    if (A002 != null) {
                        A002.A04(c214659f3, false, true);
                    }
                    clipsAudioMixingDrawerController.A08 = false;
                    clipsAudioMixingDrawerController.A07 = true;
                    C70569Wd3 A003 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                    if (A003 != null) {
                        GestureDetectorOnGestureListenerC71060WnF gestureDetectorOnGestureListenerC71060WnF = A003.A0G;
                        if (gestureDetectorOnGestureListenerC71060WnF != null) {
                            gestureDetectorOnGestureListenerC71060WnF.A03(true, 0.0f);
                        }
                        C06K c06k = A003.A0D;
                        if (c06k != null) {
                            A003.A0E.A0p(c06k);
                        }
                    }
                }
            }

            @Override // X.C8BM
            public final void DUY() {
                Context context;
                ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = ClipsAudioMixingDrawerController.this;
                if (!clipsAudioMixingDrawerController.A08) {
                    clipsAudioMixingDrawerController.A08 = true;
                    if (!ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController) && (context = clipsAudioMixingDrawerController.A0D) != null) {
                        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clips_audio_mixing_screen_height);
                        View view2 = clipsAudioMixingDrawerController.postCaptureVideoContainer;
                        if (view2 != null) {
                            clipsAudioMixingDrawerController.A00 = dimensionPixelSize / view2.getHeight();
                            C57012jc c57012jc2 = clipsAudioMixingDrawerController.audioMixingDrawerContainerViewStubHolder;
                            if (c57012jc2 != null) {
                                View A01 = c57012jc2.A01();
                                C14360o3.A07(A01);
                                ViewGroup viewGroup = (ViewGroup) A01;
                                FrameLayout frameLayout = (FrameLayout) viewGroup.requireViewById(R.id.fragment_container);
                                clipsAudioMixingDrawerController.A01 = frameLayout;
                                if (frameLayout != null) {
                                    frameLayout.setBackgroundResource(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_background));
                                }
                                C70569Wd3 c70569Wd3 = new C70569Wd3(view2, viewGroup, clipsAudioMixingDrawerController.A01, null, AbstractC62582sx.A00(clipsAudioMixingDrawerController.A0E.requireActivity()), clipsAudioMixingDrawerController.A0F, null, clipsAudioMixingDrawerController, clipsAudioMixingDrawerController.A00, 0.0f, false);
                                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
                                float dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
                                c70569Wd3.A05 = dimensionPixelSize2;
                                c70569Wd3.A04 = dimensionPixelSize3;
                                c70569Wd3.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
                                clipsAudioMixingDrawerController.A03 = c70569Wd3;
                            }
                        }
                        Resources resources = context.getResources();
                        if (resources != null) {
                            final float dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                            FrameLayout frameLayout2 = clipsAudioMixingDrawerController.A01;
                            if (frameLayout2 != null) {
                                frameLayout2.setOutlineProvider(new ViewOutlineProvider() { // from class: X.9TV
                                    @Override // android.view.ViewOutlineProvider
                                    public final void getOutline(View view3, Outline outline) {
                                        AbstractC167007dF.A1K(view3, outline);
                                        int width = view3.getWidth();
                                        float A08 = AbstractC166987dD.A08(view3);
                                        float f = dimensionPixelSize4;
                                        outline.setRoundRect(0, 0, width, (int) (A08 + f), f);
                                    }
                                });
                            }
                        }
                        FrameLayout frameLayout3 = clipsAudioMixingDrawerController.A01;
                        if (frameLayout3 != null) {
                            frameLayout3.setClipToOutline(true);
                        }
                    }
                    C214659f3 c214659f3 = new C214659f3();
                    Bundle bundle = new Bundle();
                    bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", clipsAudioMixingDrawerController.A0F.token);
                    c214659f3.setArguments(bundle);
                    C70569Wd3 A002 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                    if (A002 != null) {
                        A002.A04(c214659f3, true, true);
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
            
                if (r4.A05 != null) goto L14;
             */
            @Override // X.C8BM
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void DUZ() {
                /*
                    r5 = this;
                    com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController r4 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.this
                    X.87D r0 = r4.A0J
                    r3 = 0
                    X.2GS r2 = r0.A00
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
                    X.8A8 r0 = new X.8A8
                    r0.<init>(r1)
                    r2.A0B(r0)
                    com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A01(r4)
                    boolean r0 = r4.A08
                    if (r0 == 0) goto L48
                    r4.A08 = r3
                    boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
                    if (r0 != 0) goto L58
                    X.Wd3 r2 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A00(r4)
                    if (r2 == 0) goto L39
                    boolean r0 = r4.A09
                    if (r0 != 0) goto L35
                    boolean r0 = r4.A0A
                    if (r0 != 0) goto L35
                    java.lang.String r1 = r4.A05
                    r0 = 1
                    if (r1 == 0) goto L36
                L35:
                    r0 = 0
                L36:
                    r2.A05(r0)
                L39:
                    boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
                    if (r0 == 0) goto L48
                    X.Wd3 r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A00(r4)
                    if (r0 == 0) goto L48
                    r0.A01()
                L48:
                    boolean r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A02(r4)
                    if (r0 == 0) goto L57
                    X.Wd3 r0 = com.instagram.creation.capture.quickcapture.sundial.ClipsAudioMixingDrawerController.A00(r4)
                    if (r0 == 0) goto L57
                    r0.A02()
                L57:
                    return
                L58:
                    r4.DCM()
                    goto L39
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C8BL.DUZ():void");
            }

            @Override // X.C8BM
            public final void DUa() {
                InterfaceC1810081c interfaceC1810081c2;
                Object obj;
                Fragment fragment;
                ClipsStackedTimelineFragment clipsStackedTimelineFragment;
                Fragment fragment2;
                ClipsStackedTimelineFragment clipsStackedTimelineFragment2;
                ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = ClipsAudioMixingDrawerController.this;
                if (clipsAudioMixingDrawerController.A09) {
                    if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
                        C70569Wd3 A002 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                        if (A002 != null) {
                            fragment2 = A002.A0E.A0O(R.id.fragment_container);
                        } else {
                            fragment2 = null;
                        }
                        if ((fragment2 instanceof ClipsStackedTimelineFragment) && (clipsStackedTimelineFragment2 = (ClipsStackedTimelineFragment) fragment2) != null) {
                            clipsStackedTimelineFragment2.A0T();
                        }
                    } else {
                        interfaceC1810081c2 = clipsAudioMixingDrawerController.quickCaptureState;
                        if (interfaceC1810081c2 != null) {
                            obj = new Object();
                            interfaceC1810081c2.E4u(obj);
                        }
                    }
                } else if (clipsAudioMixingDrawerController.A05 != null) {
                    if (!ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController) && (interfaceC1810081c2 = clipsAudioMixingDrawerController.quickCaptureState) != null) {
                        obj = new C8UA(clipsAudioMixingDrawerController.A05);
                        interfaceC1810081c2.E4u(obj);
                    }
                } else if (clipsAudioMixingDrawerController.A0A) {
                    if (ClipsAudioMixingDrawerController.A02(clipsAudioMixingDrawerController)) {
                        C70569Wd3 A003 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                        if (A003 != null) {
                            fragment = A003.A0E.A0O(R.id.fragment_container);
                        } else {
                            fragment = null;
                        }
                        if ((fragment instanceof ClipsStackedTimelineFragment) && (clipsStackedTimelineFragment = (ClipsStackedTimelineFragment) fragment) != null) {
                            clipsStackedTimelineFragment.A0U();
                        }
                    } else {
                        interfaceC1810081c2 = clipsAudioMixingDrawerController.quickCaptureState;
                        if (interfaceC1810081c2 != null) {
                            obj = new Object();
                            interfaceC1810081c2.E4u(obj);
                        }
                    }
                }
                clipsAudioMixingDrawerController.A09 = false;
                clipsAudioMixingDrawerController.A05 = null;
                clipsAudioMixingDrawerController.A0A = false;
            }

            @Override // X.C8BM
            public final void DUb(JIN jin) {
                InterfaceC1810081c interfaceC1810081c2;
                ClipsAudioMixingDrawerController clipsAudioMixingDrawerController = ClipsAudioMixingDrawerController.this;
                if (jin != null && (interfaceC1810081c2 = clipsAudioMixingDrawerController.quickCaptureState) != null) {
                    interfaceC1810081c2.E4u(new C188208Vl(jin, true, true));
                }
                if (ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController) != null && clipsAudioMixingDrawerController.A08) {
                    clipsAudioMixingDrawerController.A08 = false;
                    clipsAudioMixingDrawerController.A07 = true;
                    C70569Wd3 A002 = ClipsAudioMixingDrawerController.A00(clipsAudioMixingDrawerController);
                    if (A002 != null) {
                        GestureDetectorOnGestureListenerC71060WnF gestureDetectorOnGestureListenerC71060WnF = A002.A0G;
                        if (gestureDetectorOnGestureListenerC71060WnF != null) {
                            gestureDetectorOnGestureListenerC71060WnF.A03(true, 0.0f);
                        }
                        C06K c06k = A002.A0D;
                        if (c06k != null) {
                            A002.A0E.A0p(c06k);
                        }
                    }
                }
            }
        };
        boolean A02 = A02(this);
        AnonymousClass874 anonymousClass8742 = this.A0H;
        this.A0B = new C8BP(requireContext, C8BN.TIMELINE_AUDIO_GHOST_TRACK, of, MusicProduct.A06, abstractC59962oe2, userSession2, this.A0G, anonymousClass8742, null, c8bm, c8bj, null, C8BO.A09, enumC1810381f, null, true, false, A02, false, false);
        c8bg.A00 = anonymousClass877;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DBx() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DBz() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DCN() {
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ void DhK() {
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final C70569Wd3 A00(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        InterfaceC1810081c interfaceC1810081c;
        if (clipsAudioMixingDrawerController.A04 != null && (A02(clipsAudioMixingDrawerController) || ((interfaceC1810081c = clipsAudioMixingDrawerController.quickCaptureState) != null && interfaceC1810081c.CRB(EnumC1810181d.A0m)))) {
            return clipsAudioMixingDrawerController.A04;
        }
        return clipsAudioMixingDrawerController.A03;
    }

    public static final boolean A02(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        InterfaceC1810081c interfaceC1810081c = clipsAudioMixingDrawerController.quickCaptureState;
        if (interfaceC1810081c != null && interfaceC1810081c.CRB(EnumC1810181d.A09)) {
            return true;
        }
        InterfaceC1810081c interfaceC1810081c2 = clipsAudioMixingDrawerController.quickCaptureState;
        if (interfaceC1810081c2 != null && interfaceC1810081c2.CRB(EnumC1810181d.A0m)) {
            return true;
        }
        InterfaceC1810081c interfaceC1810081c3 = clipsAudioMixingDrawerController.quickCaptureState;
        if (interfaceC1810081c3 != null && interfaceC1810081c3.CRB(EnumC1810181d.A0j) && AbstractC185298Jv.A01(clipsAudioMixingDrawerController.A0F)) {
            return true;
        }
        return false;
    }

    public final void A03(C8BN c8bn, AudioOverlayTrack audioOverlayTrack, String str, C09530e4 c09530e4, boolean z, boolean z2, boolean z3, boolean z4) {
        C09530e4 c09530e42;
        this.A0J.A00.A0B(new C8A8(true));
        if (!A02(this)) {
            InterfaceC1810081c interfaceC1810081c = this.quickCaptureState;
            if (interfaceC1810081c != null) {
                interfaceC1810081c.E4u(new Object());
            }
            InterfaceC143326dX interfaceC143326dX = this.A02;
            if (interfaceC143326dX != null) {
                interfaceC143326dX.DWb(this);
            }
        }
        if (!z) {
            AnonymousClass229.A01(this.A0F).A1R(EnumC50631MWs.A0I, "AUDIO_CONTROLS_ADD_MUSIC");
        }
        C8BF c8bf = this.A0I;
        c8bf.A00 = c8bn;
        if (audioOverlayTrack != null) {
            C8BP c8bp = this.A0B;
            c8bp.A02 = audioOverlayTrack;
            c8bp.A07 = new C09530e4(Integer.valueOf(audioOverlayTrack.A04), Integer.valueOf(audioOverlayTrack.A01));
            C8BP.A08(c8bp, audioOverlayTrack, true, true, z4);
            return;
        }
        MusicOverlaySearchTab musicOverlaySearchTab = null;
        if (z3) {
            C8BP c8bp2 = this.A0B;
            AudioOverlayTrack A03 = this.A0K.A0K.A03(str);
            if (A03 == null) {
                A03 = ((C8BE) this.A0L.getValue()).A01();
            }
            c8bp2.A02 = A03;
            if (A03 != null) {
                c09530e42 = new C09530e4(Integer.valueOf(A03.A04), Integer.valueOf(A03.A01));
            } else {
                c09530e42 = null;
            }
            c8bp2.A07 = c09530e42;
            if (A03 == null) {
                return;
            }
            C8BP.A08(c8bp2, A03, true, true, false);
            return;
        }
        ClipsAudioStore clipsAudioStore = this.A0K.A0K;
        AudioOverlayTrack A032 = clipsAudioStore.A03(str);
        if (z2 || (A032 != null && A032.A01())) {
            musicOverlaySearchTab = MusicOverlaySearchTab.A07;
        } else if (c8bf.A01) {
            musicOverlaySearchTab = MusicOverlaySearchTab.A04;
        }
        C8BP c8bp3 = this.A0B;
        if (c8bp3 == null) {
            return;
        }
        c8bp3.A09(((C8BE) this.A0L.getValue()).A01(), clipsAudioStore.A03(str), musicOverlaySearchTab, c09530e4, true, false);
    }

    public final void A04(C191708eS c191708eS) {
        C09530e4 c09530e4;
        float f;
        C8BP c8bp = this.A0B;
        MusicAssetModel musicAssetModel = c191708eS.A02;
        int i = c191708eS.A01;
        EnumC138556Pl enumC138556Pl = c191708eS.A03;
        int i2 = c191708eS.A00;
        AudioOverlayTrack A03 = this.A0K.A0K.A03(c191708eS.A04);
        c8bp.A02 = A03;
        EnumC185288Jt enumC185288Jt = null;
        if (A03 != null) {
            c09530e4 = new C09530e4(Integer.valueOf(A03.A04), Integer.valueOf(A03.A01));
        } else {
            c09530e4 = null;
        }
        c8bp.A07 = c09530e4;
        Integer valueOf = Integer.valueOf(i);
        if (A03 != null) {
            enumC185288Jt = A03.A05;
        }
        if (A03 != null) {
            f = A03.A00;
        } else {
            f = 1.0f;
        }
        C8BP.A07(c8bp, enumC185288Jt, musicAssetModel, enumC138556Pl, valueOf, null, f, i2, true, true, true, false);
        this.A06 = !c191708eS.A05;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean ABG() {
        return true;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean CWB() {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final void DCM() {
        if (this.A07) {
            this.A07 = false;
        } else {
            A01(this);
        }
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean EiT() {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean EjE() {
        return true;
    }

    public static final void A01(ClipsAudioMixingDrawerController clipsAudioMixingDrawerController) {
        if (!A02(clipsAudioMixingDrawerController)) {
            InterfaceC1810081c interfaceC1810081c = clipsAudioMixingDrawerController.quickCaptureState;
            if (interfaceC1810081c != null) {
                interfaceC1810081c.E4u(new Object());
            }
            InterfaceC143326dX interfaceC143326dX = clipsAudioMixingDrawerController.A02;
            if (interfaceC143326dX != null) {
                interfaceC143326dX.D5W(clipsAudioMixingDrawerController);
            }
        }
        ((C8BE) clipsAudioMixingDrawerController.A0L.getValue()).A06(C05F.A00);
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean DmT(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC60082oq
    public final /* synthetic */ boolean Eis(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.C8BD
    public final boolean onBackPressed() {
        C70569Wd3 A00 = A00(this);
        if (A00 != null) {
            return A00.A07(true);
        }
        return false;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        ClipsAudioMixingDrawerControllerLifecycleUtil.cleanupReferences(this);
    }

    @Override // X.InterfaceC60082oq
    public final void DCP(C70569Wd3 c70569Wd3, float f, float f2, float f3) {
    }
}
