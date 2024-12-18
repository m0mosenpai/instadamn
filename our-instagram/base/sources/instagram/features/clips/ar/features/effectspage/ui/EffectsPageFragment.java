package instagram.features.clips.ar.features.effectspage.ui;

import X.AbstractC018607g;
import X.AbstractC12220kQ;
import X.AbstractC141776au;
import X.AbstractC153666vb;
import X.AbstractC154146wP;
import X.AbstractC154166wR;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC25225BEi;
import X.AbstractC25228BEl;
import X.AbstractC25229BEm;
import X.AbstractC25230BEn;
import X.AbstractC25234BEr;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31178DnM;
import X.AbstractC37300Gc1;
import X.AbstractC37301Gc2;
import X.AbstractC37302Gc3;
import X.AbstractC37670Gi3;
import X.AbstractC37834Gko;
import X.AbstractC58232lf;
import X.AbstractC59962oe;
import X.AbstractC70663Fe;
import X.AbstractC86593tX;
import X.AnonymousClass058;
import X.AnonymousClass308;
import X.BME;
import X.C006802i;
import X.C06090Tz;
import X.C08790ch;
import X.C0f9;
import X.C0fQ;
import X.C110964z8;
import X.C116875Qr;
import X.C120985dq;
import X.C1343765g;
import X.C14360o3;
import X.C153146ui;
import X.C153156uj;
import X.C153766vl;
import X.C154846xZ;
import X.C1M1;
import X.C1OU;
import X.C27284C2j;
import X.C35221FgE;
import X.C37794Gk9;
import X.C37856GlA;
import X.C38321qM;
import X.C38377GuE;
import X.C38C;
import X.C38E;
import X.C42078Ikl;
import X.C42177ImP;
import X.C42194Img;
import X.C45116Jxl;
import X.C4SX;
import X.C50540MSt;
import X.C50878Me9;
import X.C52942bb;
import X.C56402P2p;
import X.C57112jm;
import X.C57152PYg;
import X.C64012vM;
import X.C71163Hc;
import X.C85963sQ;
import X.C8JW;
import X.C9GR;
import X.EnumC223429tZ;
import X.EnumC39652Hih;
import X.HHO;
import X.InterfaceC02590Ai;
import X.InterfaceC101554hQ;
import X.InterfaceC153516vM;
import X.InterfaceC153526vN;
import X.InterfaceC19610xo;
import X.InterfaceC43430JGu;
import X.InterfaceC60122ou;
import X.InterfaceC60442pS;
import X.InterfaceC62612t0;
import X.ViewOnClickListenerC41920IiD;
import X.ViewOnClickListenerC42035Ik4;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.Scene;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public class EffectsPageFragment extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC101554hQ, InterfaceC153516vM, InterfaceC153526vN {
    public EnumC223429tZ A00;
    public C8JW A01;
    public C45116Jxl A02;
    public EffectsPageModel A03;
    public C50878Me9 A04;
    public C154846xZ A05;
    public AbstractC153666vb A06;
    public UserSession A07;
    public C38321qM A08;
    public Reel A09;
    public MusicAttributionConfig A0A;
    public C64012vM A0B;
    public C38E A0C;
    public GradientSpinner A0D;
    public C153766vl A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public boolean A0L;
    public boolean A0M;
    public C57112jm A0N;
    public AnonymousClass308 A0O;
    public C1M1 A0P;
    public ShimmerFrameLayout mClipsGridShimmerContainer;
    public RecyclerView mClipsRecyclerView;
    public View mContainer;
    public IgImageView mEffectThumbnail;
    public TextView mReelsEmptyMessageView;
    public View mSaveButton;
    public ViewGroup mUseInCameraButton;
    public TextView mVideoCountView;
    public final InterfaceC60442pS A0R = new Object();
    public final C38377GuE A0S = new C38377GuE(this);
    public String A0Q = AbstractC166997dE.A0n();

    public static Bundle A00(EnumC223429tZ enumC223429tZ, C8JW c8jw, EffectsPageModel effectsPageModel, MusicAttributionConfig musicAttributionConfig, String str, String str2, String str3, String str4, String str5) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable("ARGS_EFFECT_MODEL", effectsPageModel);
        A0b.putString("ARGS_MEDIA_ID", str);
        A0b.putString("ARGS_MEDIA_TAP_TOKEN", str2);
        A0b.putString("ARGS_RANKING_INFO_TOKEN", str3);
        A0b.putString("ARGS_PRELOADED_AUDIO_ID", str4);
        A0b.putString("ARGS_PRELOADED_GRID_KEY", null);
        A0b.putString("ARGS_EFFECT_PAGE_ENTRY_POINT", enumC223429tZ.name());
        A0b.putParcelable("ARGS_PRELOADED_MUSIC_ATTRIBUTION_CONFIG", musicAttributionConfig);
        A0b.putString("ARGS_BEST_AUDIO_CLUSTER_ID", str5);
        A0b.putSerializable("ARGS_PIVOT_PAGE_ENTRY_POINT", c8jw);
        return A0b;
    }

    @Override // X.InterfaceC153516vM
    public final List AoI() {
        return Collections.singletonList(new C37856GlA(this, 1));
    }

    @Override // X.InterfaceC153556vQ
    public final void D1P() {
    }

    @Override // X.InterfaceC153566vR
    public final void D51(View view) {
    }

    @Override // X.InterfaceC153546vP
    public final void D52(View view) {
    }

    @Override // X.InterfaceC153536vO
    public final void D55(User user) {
        AbstractC37834Gko.A03(requireActivity(), this, this.A07, user.getId(), "EFFECT_PIVOT_PAGE", null, ModalActivity.A08);
    }

    @Override // X.InterfaceC153576vS
    public final void D5V(View view) {
    }

    @Override // X.InterfaceC101554hQ
    public final void DXz() {
    }

    @Override // X.InterfaceC101554hQ
    public final void DY1() {
    }

    @Override // X.InterfaceC153586vT
    public final void Dzr() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "effect_page";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r1.equals("HORIZON") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r5 = this;
            android.view.ViewGroup r1 = r5.mUseInCameraButton
            if (r1 == 0) goto L66
            r0 = 2131443595(0x7f0b3f8b, float:1.8509263E38)
            android.widget.TextView r4 = X.AbstractC166987dD.A0e(r1, r0)
            if (r4 == 0) goto L66
            android.content.Context r1 = r5.requireContext()
            r0 = 2131976422(0x7f1360e6, float:1.9589964E38)
            java.lang.String r1 = r1.getString(r0)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r2 = r5.A03
            if (r2 == 0) goto L2e
            java.lang.Integer r0 = r2.A08
            if (r0 == 0) goto L2e
            android.content.Context r1 = r5.requireContext()
            java.lang.Integer r0 = r2.A08
            int r0 = r0.intValue()
            java.lang.String r1 = r1.getString(r0)
        L2e:
            r4.setText(r1)
            if (r2 == 0) goto L40
            java.lang.String r1 = r2.A0C
            if (r1 == 0) goto L40
            java.lang.String r0 = "HORIZON"
            boolean r0 = r1.equals(r0)
            r3 = 1
            if (r0 != 0) goto L41
        L40:
            r3 = 0
        L41:
            android.content.Context r1 = r5.requireContext()
            r0 = 2131976423(0x7f1360e7, float:1.9589966E38)
            if (r3 == 0) goto L4d
            r0 = 2131963650(0x7f132f02, float:1.956406E38)
        L4d:
            X.AbstractC166997dE.A18(r1, r4, r0)
            X.AbstractC56952jT.A01(r4)
            android.view.ViewGroup r0 = r5.mUseInCameraButton
            X.3P9 r2 = X.AbstractC166987dD.A0s(r0)
            r1 = 1
            X.HJ9 r0 = new X.HJ9
            r0.<init>(r1, r5, r3)
            r2.A04 = r0
            r2.A07 = r1
            r2.A00()
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.A01():void");
    }

    public static void A03(EffectsPageFragment effectsPageFragment) {
        Drawable drawable;
        View view = effectsPageFragment.mContainer;
        if (view != null && effectsPageFragment.A03 != null) {
            view.requireViewById(R.id.ghost_header).setVisibility(8);
            effectsPageFragment.mContainer.requireViewById(R.id.header).setVisibility(0);
            IgImageView A0Z = AbstractC31172DnG.A0Z(effectsPageFragment.mContainer, R.id.circular_thumbnail);
            EffectsPageModel effectsPageModel = effectsPageFragment.A03;
            ImageUrl imageUrl = effectsPageModel.A04;
            if (imageUrl != null) {
                A0Z.setUrl(imageUrl, effectsPageFragment.A0R);
            } else if (effectsPageModel.A05 != null && (drawable = effectsPageFragment.requireContext().getDrawable(effectsPageFragment.A03.A05.intValue())) != null) {
                A0Z.setImageDrawable(drawable);
            }
            AbstractC166997dE.A0T(effectsPageFragment.mContainer, R.id.title).setText(effectsPageFragment.A03.A0E);
            TextView textView = effectsPageFragment.mVideoCountView;
            if (textView != null) {
                textView.setText(effectsPageFragment.A03.A00);
            }
            String str = effectsPageFragment.A03.A0A;
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
            if (effectsPageFragment.A03.A0G) {
                C85963sQ.A08(effectsPageFragment.requireContext(), A0H, true);
            }
            TextView A0T = AbstractC166997dE.A0T(effectsPageFragment.mContainer, R.id.username);
            if (A0H.length() > 0) {
                A0T.setText(A0H);
                C0fQ.A00(new ViewOnClickListenerC42035Ik4(effectsPageFragment, 55), A0T);
            }
            TextView A0T2 = AbstractC166997dE.A0T(effectsPageFragment.mContainer, R.id.description);
            ConstraintLayout constraintLayout = (ConstraintLayout) effectsPageFragment.mContainer.requireViewById(R.id.header);
            C110964z8 c110964z8 = new C110964z8();
            c110964z8.A0I(constraintLayout);
            if (str.isEmpty()) {
                c110964z8.A09(R.id.video_count_shimmer_container, 3);
                c110964z8.A09(R.id.video_count_shimmer_container, 4);
                c110964z8.A09(R.id.title, 4);
                if (effectsPageFragment.A03.A06 == null) {
                    A0T2.setVisibility(8);
                    c110964z8.A0E(R.id.title, 4, R.id.thumbnail_container, 4, 64);
                    c110964z8.A0E(R.id.video_count_shimmer_container, 3, R.id.thumbnail_container, 3, 64);
                    c110964z8.A0D(R.id.video_count_shimmer_container, 4, R.id.thumbnail_container, 4);
                } else {
                    A0T2.setVisibility(0);
                    AbstractC166987dD.A1P(effectsPageFragment.requireContext(), A0T2, effectsPageFragment.A03.A06.intValue());
                    c110964z8.A09(R.id.description, 3);
                    c110964z8.A09(R.id.description, 4);
                    c110964z8.A0E(R.id.video_count_shimmer_container, 3, R.id.description, 4, 12);
                    c110964z8.A0E(R.id.description, 3, R.id.title_container, 4, 12);
                    AbstractC31172DnG.A1J(effectsPageFragment.mContainer, R.id.user_profile_picture, 8);
                    TextView textView2 = effectsPageFragment.mVideoCountView;
                    if (textView2 != null) {
                        textView2.setTextAppearance(R.style.PrivacyTextStyle);
                    }
                }
                A0T.setVisibility(8);
            } else if (effectsPageFragment.A03.A06 == null) {
                A0T2.setVisibility(8);
                c110964z8.A09(R.id.video_count_shimmer_container, 3);
                c110964z8.A0D(R.id.video_count_shimmer_container, 3, R.id.username, 4);
            } else {
                c110964z8.A0I(constraintLayout);
                c110964z8.A09(R.id.video_count_shimmer_container, 4);
                c110964z8.A09(R.id.description, 3);
                c110964z8.A09(R.id.username, 4);
                A0T2.setVisibility(0);
                AbstractC166987dD.A1P(effectsPageFragment.requireContext(), A0T2, effectsPageFragment.A03.A06.intValue());
                c110964z8.A0E(R.id.video_count_shimmer_container, 3, R.id.description, 4, 12);
                c110964z8.A0E(R.id.description, 3, R.id.username, 4, 12);
                TextView textView3 = effectsPageFragment.mVideoCountView;
                if (textView3 != null) {
                    textView3.setTextAppearance(R.style.PrivacyTextStyle);
                }
            }
            c110964z8.A0G(constraintLayout);
            A06(effectsPageFragment, false);
            View view2 = effectsPageFragment.mView;
            if (view2 != null) {
                IgdsBanner igdsBanner = (IgdsBanner) view2.requireViewById(R.id.age_restricted_note_banner);
                if (effectsPageFragment.A0L) {
                    Context context = view2.getContext();
                    igdsBanner.setVisibility(0);
                    igdsBanner.setBodyColor(AbstractC31174DnI.A03(context));
                    igdsBanner.A00 = new C56402P2p(2, context, effectsPageFragment);
                    return;
                }
                igdsBanner.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment r3) {
        /*
            android.view.ViewGroup r2 = r3.mUseInCameraButton
            if (r2 == 0) goto L1d
            com.instagram.ar.features.effectspage.models.EffectsPageModel r1 = r3.A03
            if (r1 == 0) goto L15
            boolean r0 = r1.A01
            if (r0 == 0) goto L15
            boolean r0 = r3.A0M
            if (r0 != 0) goto L15
            boolean r0 = r1.A0J
            r1 = 0
            if (r0 != 0) goto L17
        L15:
            r1 = 8
        L17:
            r2.setVisibility(r1)
            r3.A01()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.A04(instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment):void");
    }

    public static void A05(EffectsPageFragment effectsPageFragment, int i) {
        if (effectsPageFragment.A03 == null) {
            C9GR.A0F(effectsPageFragment.getActivity(), "clips_effect_failed_toast", i);
            A06(effectsPageFragment, true);
            AbstractC31175DnJ.A0j(effectsPageFragment.getActivity(), true);
            ((ShimmerFrameLayout) effectsPageFragment.mContainer.requireViewById(R.id.ghost_header)).A05();
        }
    }

    public static void A06(EffectsPageFragment effectsPageFragment, boolean z) {
        View view = effectsPageFragment.mView;
        if ((effectsPageFragment.A0M || z) && view != null) {
            View requireViewById = view.requireViewById(R.id.metadata_bar);
            C1343765g c1343765g = (C1343765g) requireViewById.getLayoutParams();
            c1343765g.A00 = 0;
            requireViewById.setLayoutParams(c1343765g);
            effectsPageFragment.mClipsRecyclerView.setVisibility(8);
            effectsPageFragment.mUseInCameraButton.setVisibility(8);
            if (effectsPageFragment.A02 != null) {
                View A0U = AbstractC167017dG.A0U(view, R.id.restricted_banner);
                AbstractC166997dE.A0T(A0U, R.id.restricted_label).setText(effectsPageFragment.A02.A02);
                if (!TextUtils.isEmpty(effectsPageFragment.A02.A01) && !TextUtils.isEmpty(effectsPageFragment.A02.A00)) {
                    TextView A0T = AbstractC166997dE.A0T(A0U, R.id.restricted_link);
                    A0T.setText(effectsPageFragment.A02.A01);
                    C0fQ.A00(new ViewOnClickListenerC41920IiD(effectsPageFragment.A02.A00, effectsPageFragment, 2), A0T);
                }
            }
        }
    }

    @Override // X.InterfaceC153516vM
    public final AbstractC153666vb AoO() {
        return this.A06;
    }

    @Override // X.InterfaceC153516vM
    public final String BAK() {
        return this.A0Q;
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        String str;
        boolean z;
        InterfaceC60442pS interfaceC60442pS = this.A0R;
        UserSession userSession = this.A07;
        C38321qM c38321qM = c120985dq.A02;
        c38321qM.getClass();
        AbstractC37670Gi3.A0Y(interfaceC60442pS, userSession, c38321qM, this.A0P, this.A0H, i);
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A08, this.A07);
        c116875Qr.A1D = c120985dq.getId();
        EffectsPageModel effectsPageModel = this.A03;
        if (effectsPageModel != null) {
            str = effectsPageModel.A0D;
        } else {
            str = null;
        }
        c116875Qr.A1C = str;
        if (effectsPageModel != null) {
            z = effectsPageModel.A01;
        } else {
            z = true;
        }
        c116875Qr.A0P = Boolean.valueOf(z);
        c116875Qr.A1G = this.A0Q;
        c116875Qr.A13 = this.A0H;
        c116875Qr.A14 = this.A0J;
        AbstractC86593tX.A0X(requireActivity(), c116875Qr.A00(), this.A07);
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        C38321qM c38321qM;
        AnonymousClass308 anonymousClass308 = this.A0O;
        if (anonymousClass308 != null && (c38321qM = c120985dq.A02) != null) {
            anonymousClass308.DuC(motionEvent, view, c38321qM, i);
            return false;
        }
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0122  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        C4SX A00;
        Long A0T;
        String str;
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Bundle requireArguments = requireArguments();
        this.mContainer = view;
        this.A04 = (C50878Me9) new C52942bb(new HHO(this.A07, requireContext.getApplicationContext()), this).A00(C50878Me9.class);
        this.mContainer.requireViewById(R.id.ghost_header).setVisibility(0);
        this.mContainer.requireViewById(R.id.header).setVisibility(8);
        ViewStub A0G = AbstractC31173DnH.A0G(view, R.id.thumbnail_stub);
        A0G.setLayoutResource(R.layout.layout_clips_effect_page_thumbnail);
        A0G.inflate();
        this.mVideoCountView = AbstractC166987dD.A0e(view, R.id.video_count);
        this.mEffectThumbnail = AbstractC31172DnG.A0Z(this.mContainer, R.id.circular_thumbnail);
        this.A0D = (GradientSpinner) view.requireViewById(R.id.effect_icon_reel_ring);
        this.mReelsEmptyMessageView = AbstractC166997dE.A0T(this.mContainer, R.id.empty_video_state);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext, 3);
        gridLayoutManager.A01 = (AbstractC154146wP) this.A0E.A0P.getValue();
        RecyclerView A0G2 = AbstractC31172DnG.A0G(view, R.id.videos_list);
        this.mClipsRecyclerView = A0G2;
        A0G2.A10(AbstractC154166wR.A00(requireContext, 0, false));
        this.mClipsRecyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView = this.mClipsRecyclerView;
        InterfaceC62612t0 interfaceC62612t0 = (InterfaceC62612t0) this.A06;
        C153146ui c153146ui = C153146ui.A06;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        abstractC70663Fe.getClass();
        recyclerView.A14(new C153156uj(abstractC70663Fe, interfaceC62612t0, c153146ui));
        this.mClipsRecyclerView.setAdapter(this.A0E.A0I);
        this.A0N.A06(this.mClipsRecyclerView, C71163Hc.A00(this));
        this.mClipsGridShimmerContainer = (ShimmerFrameLayout) view.requireViewById(R.id.videos_list_shimmer_container);
        if (C153766vl.A00(this.A0E).isEmpty()) {
            this.A0E.A04(9);
            this.mClipsGridShimmerContainer.A02();
        } else {
            this.mClipsGridShimmerContainer.A05();
        }
        this.mUseInCameraButton = (ViewGroup) view.requireViewById(R.id.use_in_camera_button_scene_root);
        A04(this);
        EffectsPageModel effectsPageModel = this.A03;
        boolean z = false;
        if (effectsPageModel != null && effectsPageModel.A01 && !this.A0M && effectsPageModel.A0J) {
            z = true;
        }
        if (z) {
            ImageView A0I = AbstractC31173DnH.A0I(view, R.id.use_in_camera_icon);
            EffectsPageModel effectsPageModel2 = this.A03;
            if (effectsPageModel2 != null && (str = effectsPageModel2.A0C) != null && str.equals("HORIZON")) {
                AbstractC166997dE.A19(requireActivity(), A0I, R.drawable.instagram_link_pano_filled_24);
            }
            A01();
            View view2 = this.mContainer;
            Scene scene = new Scene(this.mUseInCameraButton, (ViewGroup) view2.requireViewById(R.id.use_in_camera_button));
            Scene sceneForLayout = Scene.getSceneForLayout(this.mUseInCameraButton, R.layout.layout_use_in_camera_button_scrolling, requireActivity());
            sceneForLayout.getClass();
            ((AppBarLayout) view2.requireViewById(R.id.app_bar_layout)).A02(new C27284C2j(0, scene, sceneForLayout, view2, this));
        }
        A03(this);
        EffectsPageModel effectsPageModel3 = this.A03;
        if (effectsPageModel3 != null) {
            string = effectsPageModel3.A0D;
            if (string == null) {
                string = effectsPageModel3.A0B;
            }
        } else {
            string = requireArguments.getString("effect_id");
        }
        string.getClass();
        UserSession userSession = this.A07;
        C38C c38c = new C38C(this, -1);
        InterfaceC60442pS interfaceC60442pS = this.A0R;
        this.A0C = new C38E(interfaceC60442pS, userSession, c38c);
        this.A0B = C1OU.A02(interfaceC60442pS, this.A07, null);
        C50878Me9 c50878Me9 = this.A04;
        if (c50878Me9 != null) {
            int hashCode = AbstractC166997dE.A0n().hashCode();
            UserSession userSession2 = c50878Me9.A01;
            C006802i c006802i = C006802i.A0p;
            c006802i.markerStart(17629205, hashCode);
            c006802i.markerAnnotate(17629205, hashCode, "effect_id", string);
            AbstractC58232lf.A00(AbstractC141776au.A00(c50878Me9).A00, new C50540MSt(new AnonymousClass058(new C57152PYg(userSession2, string, null, hashCode)), 12)).A06(getViewLifecycleOwner(), new C42078Ikl(this, 4));
        }
        C0fQ.A00(new ViewOnClickListenerC41920IiD(string, this, 3), this.mEffectThumbnail);
        EffectsPageModel effectsPageModel4 = this.A03;
        if (effectsPageModel4 != null && effectsPageModel4.A0C != null) {
            float dimension = AbstractC166997dE.A0N(this).getDimension(R.dimen.action_bar_immersive_gradient_height);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dimension / 2.0f);
            gradientDrawable.setColor(-1);
            gradientDrawable.setStroke(1, -8355712);
            this.mEffectThumbnail.setBackground(gradientDrawable);
        } else {
            string = null;
        }
        UserSession userSession3 = this.A07;
        long id = this.mContainer.getId();
        C38321qM c38321qM = this.A08;
        String str2 = this.A0H;
        String str3 = this.A0F;
        String str4 = this.A0K;
        C14360o3.A0B(userSession3, 0);
        C14360o3.A0B(interfaceC60442pS, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession3), "instagram_organic_effect_page_impression");
        if (A0f.isSampled() && c38321qM != null) {
            AbstractC25229BEm.A1A(A0f, interfaceC60442pS);
            String str5 = str2;
            if (str2 == null) {
                str5 = "";
            }
            A0f.AAP("media_compound_key", str5);
            AbstractC25225BEi.A1M(EnumC39652Hih.A0D, A0f);
            if (str4 == null) {
                str4 = "";
            }
            AbstractC37300Gc1.A0p(A0f, str4);
            AbstractC37301Gc2.A10(A0f, id);
            if (str3 == null) {
                A00 = null;
            } else {
                A00 = C4SX.A00(str3);
            }
            A0f.AAK(A00, "media_author_id");
            if (str2 != null) {
                A0T = null;
                try {
                    A0T = AbstractC25228BEl.A13(str2);
                } catch (NumberFormatException unused) {
                }
            } else {
                A0T = AbstractC37302Gc3.A0T();
            }
            AbstractC37300Gc1.A0h(A0f, A0T);
            AbstractC25230BEn.A1C(A0f, 0L);
            AbstractC25225BEi.A1P(A0f, userSession3.token);
            A0f.AAP("viewer_init_media_compound_key", c38321qM.getId());
            AbstractC25234BEr.A10(A0f, c38321qM);
            AbstractC37302Gc3.A0t(A0f);
            A0f.AAP("creative_tool_id", string);
            A0f.Cht();
        }
    }

    private void A02(InterfaceC43430JGu interfaceC43430JGu, String str) {
        AbstractC153666vb abstractC153666vb;
        C08790ch A00 = AbstractC018607g.A00(this);
        EffectsPageModel effectsPageModel = this.A03;
        if (effectsPageModel != null && effectsPageModel.A0C != null) {
            Context requireContext = requireContext();
            UserSession userSession = this.A07;
            InterfaceC60442pS interfaceC60442pS = this.A0R;
            boolean A1X = AbstractC31178DnM.A1X(C06090Tz.A05, userSession, 36328130469838033L);
            AbstractC167017dG.A1R(userSession, interfaceC60442pS);
            C14360o3.A0B(A00, 5);
            abstractC153666vb = new AbstractC153666vb(requireContext, A00, new C42177ImP(str, A1X), interfaceC60442pS, userSession);
        } else {
            Context requireContext2 = requireContext();
            UserSession userSession2 = this.A07;
            InterfaceC60442pS interfaceC60442pS2 = this.A0R;
            boolean A1X2 = AbstractC31178DnM.A1X(C06090Tz.A05, userSession2, 36328130469838033L);
            AbstractC167017dG.A1R(userSession2, interfaceC60442pS2);
            abstractC153666vb = new AbstractC153666vb(requireContext2, A00, new C42194Img(str, 0, A1X2), interfaceC60442pS2, userSession2);
        }
        this.A06 = abstractC153666vb;
        abstractC153666vb.A03(new C37794Gk9(1, this, interfaceC43430JGu));
        this.A06.A04(null, null, Collections.emptyList(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r1 != false) goto L19;
     */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            r2.getClass()
            r0 = 2131961696(0x7f132760, float:1.9560096E38)
            java.lang.String r0 = r2.getString(r0)
            r4.setTitle(r0)
            r1 = 1
            r4.EkS(r1)
            r0 = 0
            r4.setIsLoading(r0)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            if (r0 != 0) goto L21
            r4.setIsLoading(r1)
        L20:
            return
        L21:
            java.lang.Integer r0 = r0.A07
            if (r0 == 0) goto L30
            int r0 = r0.intValue()
            java.lang.String r0 = r2.getString(r0)
            r4.setTitle(r0)
        L30:
            com.instagram.common.session.UserSession r0 = r3.A07
            java.lang.String r1 = r0.userId
            com.instagram.ar.features.effectspage.models.EffectsPageModel r2 = r3.A03
            java.lang.String r0 = r2.A09
            boolean r1 = r1.equals(r0)
            boolean r0 = r2.A0H
            if (r1 != 0) goto L20
            if (r0 == 0) goto L20
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto La7
            java.lang.Integer r0 = X.C05F.A06
        L4e:
            r2.A02(r0)
            r1 = 52
            X.Ik4 r0 = new X.Ik4
            r0.<init>(r3, r1)
            r2.A0G = r0
            X.3LY r0 = new X.3LY
            r0.<init>(r2)
            android.view.View r2 = r4.A8u(r0)
            r3.mSaveButton = r2
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            if (r0 == 0) goto L6f
            boolean r1 = r0.A01
            r0 = 8
            if (r1 == 0) goto L70
        L6f:
            r0 = 0
        L70:
            r2.setVisibility(r0)
            com.instagram.ar.features.effectspage.models.EffectsPageModel r0 = r3.A03
            boolean r0 = r0.A0I
            if (r0 == 0) goto L93
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            java.lang.Integer r0 = X.C05F.A0N
            r2.A02(r0)
            r1 = 53
            X.Ik4 r0 = new X.Ik4
            r0.<init>(r3, r1)
            r2.A0G = r0
            X.3LY r0 = new X.3LY
            r0.<init>(r2)
            r4.A8u(r0)
        L93:
            X.3LO r2 = X.AbstractC31171DnF.A0B()
            java.lang.Integer r0 = X.C05F.A00
            r2.A02(r0)
            r1 = 54
            X.Ik4 r0 = new X.Ik4
            r0.<init>(r3, r1)
            X.AbstractC31176DnK.A1B(r0, r2, r4)
            return
        La7:
            java.lang.Integer r0 = X.C05F.A05
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9587 && i2 == 9683) {
            C35221FgE.A01(requireContext(), this.A07);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1999020552);
        InterfaceC19610xo ARD = BME.A00(this.A07).A05.ARD();
        ARD.E7G("LAST_OPENED_EFFECT_PAGE_TIMESTAMP_KEY", System.currentTimeMillis());
        ARD.apply();
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.layout_clips_pivot_page_fragment);
        C0f9.A09(-2009965957, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1512159106);
        super.onDestroy();
        this.A0E.A0I.unregisterAdapterDataObserver(this.A0S);
        C0f9.A09(-1503666120, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1485900533);
        super.onDestroyView();
        this.mClipsRecyclerView.A0a();
        this.A06.A04.A02.clear();
        EffectsPageFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-1867227619, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1673094477);
        super.onPause();
        C0f9.A09(1329382488, A02);
    }
}
