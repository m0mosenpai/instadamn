package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteUserRowsRecyclerView;
import com.instagram.music.common.model.AudioType;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* loaded from: classes8.dex */
public final class KDQ extends AbstractC59962oe implements C51D, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "SelfNoteBottomSheetFragment";
    public CardView A00;
    public ConstraintLayout A01;
    public LocationNoteResponseInfo A02;
    public NotePogImageDict A03;
    public NotePogVideoDict A04;
    public C684436h A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public IgImageView A0C;
    public InterfaceC56392iX A0D;
    public InterfaceC56392iX A0E;
    public InterfaceC56392iX A0F;
    public InterfaceC56392iX A0G;
    public InterfaceC56392iX A0H;
    public InterfaceC56392iX A0I;
    public L5X A0J;
    public C4F7 A0K;
    public KzY A0L;
    public JYR A0M;
    public InterfaceC678133v A0N;
    public AbstractC210529Sr A0O;
    public ReelAvatarWithBadgeView A0P;
    public C3DN A0Q;
    public SpinnerImageView A0R;
    public IgSimpleImageView A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0V;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "note_self_note_bottom_sheet";
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0042, code lost:
    
        if (X.C18U.A06(r6, X.AbstractC25230BEn.A0k(r2, 0), 36321194097583308L) == false) goto L6;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            r4 = 0
            r6 = r13
            X.C14360o3.A0B(r13, r4)
            r9 = r12
            super.onViewCreated(r13, r14)
            X.07S r8 = X.C07S.RESUMED
            X.07X r7 = r12.getViewLifecycleOwner()
            X.2k6 r0 = X.C07Y.A00(r7)
            r10 = 0
            r11 = 30
            X.MCM r5 = new X.MCM
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.191 r3 = X.AnonymousClass191.A00
            X.AbstractC23641Du.A05(r3, r5, r0)
            X.0do r2 = r12.A0U
            X.0ll r5 = X.AbstractC25230BEn.A0k(r2, r4)
            X.0Tz r6 = X.C06090Tz.A05
            r0 = 36321194098042061(0x8109ef000824cd, double:3.033007629086737E-306)
            boolean r0 = X.C18U.A06(r6, r5, r0)
            r5 = 1
            if (r0 == 0) goto L44
            X.0ll r4 = X.AbstractC25230BEn.A0k(r2, r4)
            r0 = 36321194097583308(0x8109ef000124cc, double:3.03300762879662E-306)
            boolean r0 = X.C18U.A06(r6, r4, r0)
            r1 = 1
            if (r0 != 0) goto L45
        L44:
            r1 = 0
        L45:
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r2)
            boolean r0 = X.C4AC.A05(r0)
            if (r0 == 0) goto L5d
            X.L5X r0 = r12.A0J
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.A0A
            if (r0 == 0) goto L5d
            int r0 = r0.length()
            if (r0 != 0) goto L5e
        L5d:
            r5 = 0
        L5e:
            if (r1 != 0) goto L62
            if (r5 == 0) goto L83
        L62:
            X.07X r7 = r12.getViewLifecycleOwner()
            X.2k6 r0 = X.C07Y.A00(r7)
            r11 = 45
            X.MCI r6 = new X.MCI
            r6.<init>(r7, r8, r9, r10, r11)
            X.07X r7 = X.AbstractC31173DnH.A0K(r12, r3, r6, r0)
            X.2k6 r0 = X.C07Y.A00(r7)
            r11 = 46
            X.MCI r6 = new X.MCI
            r6.<init>(r7, r8, r9, r10, r11)
            X.AbstractC23641Du.A05(r3, r6, r0)
        L83:
            X.0do r0 = r12.A0T
            java.lang.Object r3 = r0.getValue()
            X.L8C r3 = (X.L8C) r3
            com.instagram.direct.inbox.notes.ui.NoteUserRowsRecyclerView r0 = r3.A02
            if (r0 != 0) goto L99
            java.lang.String r0 = "userRowsRecyclerView"
        L91:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L99:
            X.3FQ r1 = X.C3FN.A00(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<@[FlexibleNullability] @[RawType] com.instagram.migration.scrollingviewproxy.ScrollingViewAdapterProxy<@[FlexibleNullability] kotlin.Any?>?>"
            X.C14360o3.A0C(r1, r0)
            X.3FR r1 = (X.C3FR) r1
            X.M15 r0 = new X.M15
            r0.<init>(r3)
            r1.Ehc(r0)
            X.LuR r0 = r3.A01
            if (r0 != 0) goto Lb3
            java.lang.String r0 = "userRowsAdapter"
            goto L91
        Lb3:
            r1.EPJ(r0)
            r3.A03 = r1
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r2)
            boolean r0 = X.C4AC.A08(r0)
            if (r0 == 0) goto Lf5
            X.6Dc r1 = X.AbstractC43594JPz.A0V(r2)
            X.L5X r0 = r12.A0J
            if (r0 == 0) goto Lf6
            X.6C9 r0 = r0.A03
            if (r0 == 0) goto Lf6
            X.688 r0 = r0.A07
            if (r0 == 0) goto Lf6
            java.util.List r0 = r0.A01
            if (r0 == 0) goto Lf6
            int r0 = r0.size()
            long r3 = (long) r0
        Ldb:
            X.0wW r1 = r1.A05
            java.lang.String r0 = "ig_notes_bottomsheet_impression"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto Lf5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "likes_received"
            r2.A9K(r0, r1)
            r2.Cht()
        Lf5:
            return
        Lf6:
            r3 = 0
            goto Ldb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDQ.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(MusicInfo musicInfo, KDQ kdq) {
        int i;
        Integer Adg;
        Context A0O = AbstractC166987dD.A0O(kdq.requireContext());
        InterfaceC09390do interfaceC09390do = kdq.A0U;
        kdq.A0N = AbstractC677833s.A00(A0O, AbstractC166987dD.A0r(interfaceC09390do), AbstractC60952qJ.A01("note_self_note_bottom_sheet", true, true), AbstractC43594JPz.A0h(AbstractC166987dD.A0O(kdq.requireContext()), interfaceC09390do), __redex_internal_original_name, true);
        MusicConsumptionModel BVa = musicInfo.BVa();
        if (BVa != null && (Adg = BVa.Adg()) != null) {
            i = Adg.intValue();
        } else {
            i = 0;
        }
        InterfaceC678133v interfaceC678133v = kdq.A0N;
        if (interfaceC678133v != null) {
            interfaceC678133v.ESz(new MusicDataSource(null, AudioType.A03, musicInfo.BVV().getProgressiveDownloadUrl(), musicInfo.BVV().getDashManifest(), musicInfo.BVV().getAudioAssetId(), musicInfo.BVV().getArtistId()), new C46022KYn(i, 0, musicInfo, kdq), musicInfo.BVa().getDerivedContentId(), 0, -1, -1, false, false);
        }
        InterfaceC678133v interfaceC678133v2 = kdq.A0N;
        if (interfaceC678133v2 != null) {
            interfaceC678133v2.seekTo(i);
        }
        InterfaceC678133v interfaceC678133v3 = kdq.A0N;
        if (interfaceC678133v3 != null) {
            interfaceC678133v3.E4S();
        }
    }

    public static final void A03(KDQ kdq) {
        InterfaceC09390do interfaceC09390do = kdq.A0U;
        if (AbstractC43643JSb.A00(C6C8.A05(AbstractC166987dD.A0r(interfaceC09390do))) && C4AC.A02(AbstractC166987dD.A0r(interfaceC09390do))) {
            ReelAvatarWithBadgeView reelAvatarWithBadgeView = kdq.A0P;
            if (reelAvatarWithBadgeView != null) {
                reelAvatarWithBadgeView.setBadgeOffset(AbstractC166997dE.A0N(kdq).getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material));
                ReelAvatarWithBadgeView reelAvatarWithBadgeView2 = kdq.A0P;
                if (reelAvatarWithBadgeView2 != null) {
                    Drawable drawable = kdq.requireContext().getDrawable(R.drawable.birthday_pog_indicator);
                    if (drawable != null) {
                        reelAvatarWithBadgeView2.A02(drawable, AbstractC166997dE.A0N(kdq).getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material));
                        ReelAvatarWithBadgeView reelAvatarWithBadgeView3 = kdq.A0P;
                        if (reelAvatarWithBadgeView3 != null) {
                            reelAvatarWithBadgeView3.post(new RunnableC49969M4k(reelAvatarWithBadgeView3, new MHM(kdq, 21)));
                            return;
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            C14360o3.A0F("profilePicNoteHeader");
            throw C00O.createAndThrow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.KDQ r7, X.C45838KQt r8) {
        /*
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = r7.A0P
            java.lang.String r6 = "profilePicNoteHeader"
            if (r0 == 0) goto L79
            r1 = 0
            r0.setVisibility(r1)
            java.util.List r5 = r8.A0G
            boolean r0 = X.AbstractC166987dD.A1b(r5)
            java.lang.String r4 = "Required value was null."
            if (r0 != 0) goto L1c
            java.util.List r0 = r8.A0H
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto L53
        L1c:
            X.0do r0 = r7.A0U
            X.0ll r3 = X.AbstractC25230BEn.A0k(r0, r1)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36329483384406385(0x81117900004171, double:3.038249807161813E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L53
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r3 = r7.A0P
            if (r3 == 0) goto L79
            com.instagram.common.typedurl.ImageUrl r2 = r8.A09
            if (r2 == 0) goto L4e
            java.lang.Object r0 = X.AbstractC001800i.A0J(r5)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 != 0) goto L64
            java.util.List r0 = r8.A0H
            java.lang.Object r0 = X.AbstractC001800i.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 != 0) goto L64
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L4e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L53:
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r7.A0P
            if (r1 == 0) goto L79
            com.instagram.common.typedurl.ImageUrl r0 = r8.A09
            if (r0 == 0) goto L5f
            r1.A04(r0, r7)
            goto L73
        L5f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L64:
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bhu()
            android.content.Context r0 = r7.requireContext()
            int r0 = X.AbstractC25235BEs.A04(r0)
            r3.A03(r7, r2, r1, r0)
        L73:
            androidx.cardview.widget.CardView r0 = r7.A00
            if (r0 != 0) goto L81
            java.lang.String r6 = "avatarVideoViewContainer"
        L79:
            X.C14360o3.A0F(r6)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L81:
            r1 = 8
            r0.setVisibility(r1)
            X.2iX r0 = r7.A0D
            if (r0 != 0) goto L8d
            java.lang.String r6 = "avatarSimpleVideoLayout"
            goto L79
        L8d:
            r0.setVisibility(r1)
            A03(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KDQ.A04(X.KDQ, X.KQt):void");
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        C47364KwD c47364KwD;
        boolean A06 = C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0U), 36330638731199440L);
        InterfaceC678133v interfaceC678133v = this.A0N;
        if (A06) {
            if (interfaceC678133v != null) {
                interfaceC678133v.release();
            }
            this.A0N = null;
        } else if (interfaceC678133v != null) {
            interfaceC678133v.EJa(false);
        }
        KzY kzY = this.A0L;
        if (kzY != null && (c47364KwD = kzY.A01.A03) != null) {
            c47364KwD.A00.A05.D01();
        }
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
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0U);
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
        NoteUserRowsRecyclerView noteUserRowsRecyclerView = ((L8C) this.A0T.getValue()).A02;
        if (noteUserRowsRecyclerView != null && AbstractC43592JPx.A1X(noteUserRowsRecyclerView)) {
            return false;
        }
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public KDQ() {
        MHM mhm = new MHM(this, 26);
        MHM mhm2 = new MHM(this, 23);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = MHM.A00(mhm2, enumC09460dv, 24);
        this.A0V = AbstractC25225BEi.A0a(new MHM(A00, 25), mhm, new C50170MDx(42, null, A00), AbstractC25225BEi.A1D(Jn2.class));
        this.A0T = MHM.A00(this, enumC09460dv, 22);
    }

    public static final SpannableStringBuilder A00(KDQ kdq, String str, boolean z) {
        Drawable drawable;
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str);
        if (z && (drawable = kdq.requireContext().getDrawable(R.drawable.music_explicit)) != null) {
            int color = kdq.requireContext().getColor(AbstractC53242c7.A0B(kdq.getContext()));
            int A0E = AbstractC167017dG.A0E(kdq.requireContext());
            drawable.setBounds(0, 0, A0E, A0E);
            drawable.mutate().setColorFilter(color, PorterDuff.Mode.SRC_IN);
            C4GL.A02(drawable, A0H, A0H.length(), 12, 12);
        }
        return A0H;
    }

    public static final void A02(IgTextView igTextView, KDQ kdq, C45838KQt c45838KQt, String str) {
        AbstractC25227BEk.A11(igTextView);
        igTextView.setText(JX9.A03(kdq.requireActivity(), AbstractC166987dD.A0r(kdq.A0U), str, "note_self_note_bottom_sheet"));
        int i = 0;
        if (str.length() == 0) {
            i = 8;
        }
        igTextView.setVisibility(i);
        if (c45838KQt.A0J) {
            Context context = igTextView.getContext();
            AbstractC166987dD.A1O(context, igTextView, AbstractC53242c7.A09(context));
            igTextView.setTypeface(Typeface.SANS_SERIF);
        }
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
        int A02 = C0f9.A02(-1004411872);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_bottom_sheet_header, viewGroup, false);
        this.A0P = (ReelAvatarWithBadgeView) inflate.findViewById(R.id.bottom_sheet_note_author_avatar);
        this.A0C = AbstractC31172DnG.A0a(inflate, R.id.note_chat_faceswarm);
        this.A01 = (ConstraintLayout) inflate.findViewById(R.id.bottom_sheet_note_avatar_container);
        this.A00 = (CardView) inflate.findViewById(R.id.bottom_sheet_note_video_preview_container);
        this.A0E = AbstractC31173DnH.A0U(inflate, R.id.notes_video_view_stub);
        this.A0D = AbstractC31173DnH.A0U(inflate, R.id.notes_video_player_layout_stub);
        this.A0B = AbstractC31172DnG.A0Y(inflate, R.id.bottom_sheet_note_header_title);
        this.A09 = AbstractC31172DnG.A0Y(inflate, R.id.bottom_sheet_note_chat_header_title);
        this.A0A = AbstractC31172DnG.A0Y(inflate, R.id.bottom_sheet_note_header_subtitle);
        this.A08 = AbstractC31172DnG.A0Y(inflate, R.id.bottom_sheet_note_chat_member_count);
        this.A0S = (IgSimpleImageView) inflate.findViewById(R.id.bottom_sheet_note_facepile);
        this.A06 = AbstractC31172DnG.A0Y(inflate, R.id.bottom_sheet_note_share_target);
        this.A0R = (SpinnerImageView) inflate.findViewById(R.id.loading_indicator);
        this.A07 = AbstractC31172DnG.A0Y(inflate, R.id.music_reshare_subtitle);
        this.A0I = AbstractC31173DnH.A0U(inflate, R.id.music_note_spotify_saves_subtitle_stub);
        this.A0H = AbstractC31173DnH.A0U(inflate, R.id.spotify_note_header_stub);
        this.A0G = AbstractC31173DnH.A0U(inflate, R.id.listening_now_disclaimer_Stub);
        this.A0F = AbstractC31173DnH.A0U(inflate, R.id.lyrics_view);
        this.A05 = new C684436h(requireActivity(), AbstractC166987dD.A0r(this.A0U));
        L8C l8c = (L8C) this.A0T.getValue();
        LayoutInflater layoutInflater2 = getLayoutInflater();
        C14360o3.A07(layoutInflater2);
        C44528JmY c44528JmY = ((Jn2) this.A0V.getValue()).A03;
        C14360o3.A0B(c44528JmY, 2);
        l8c.A00 = c44528JmY;
        l8c.A01 = new C49512LuR(layoutInflater2, l8c.A06, l8c.A08);
        NoteUserRowsRecyclerView noteUserRowsRecyclerView = (NoteUserRowsRecyclerView) AbstractC43594JPz.A0F(inflate, R.id.note_reactions_layout_v2).findViewById(R.id.notes_user_rows_recycler_view);
        l8c.A02 = noteUserRowsRecyclerView;
        if (noteUserRowsRecyclerView != null) {
            AbstractC31178DnM.A0z(l8c.A05, noteUserRowsRecyclerView);
            NoteUserRowsRecyclerView noteUserRowsRecyclerView2 = l8c.A02;
            if (noteUserRowsRecyclerView2 != null) {
                noteUserRowsRecyclerView2.A00 = Integer.valueOf(inflate.getResources().getDisplayMetrics().heightPixels / 2);
                NoteUserRowsRecyclerView noteUserRowsRecyclerView3 = l8c.A02;
                if (noteUserRowsRecyclerView3 != null) {
                    noteUserRowsRecyclerView3.A14(new C44229JgZ(1, l8c, c44528JmY));
                    this.A0Q = AbstractC43593JPy.A0l(this, C3DN.A00);
                    C0f9.A09(-221270783, A02);
                    return inflate;
                }
            }
        }
        C14360o3.A0F("userRowsRecyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC678133v interfaceC678133v;
        int A02 = C0f9.A02(2085976838);
        super.onDestroyView();
        JYR jyr = this.A0M;
        if (jyr != null) {
            jyr.A02(AnonymousClass001.A0R("note_self_note_bottom_sheet", " onDestroyView"));
        }
        if (C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(this.A0U), 36326378123114328L) && (interfaceC678133v = this.A0N) != null) {
            interfaceC678133v.release();
        }
        C0f9.A09(-22108876, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1793064443);
        super.onPause();
        InterfaceC678133v interfaceC678133v = this.A0N;
        if (interfaceC678133v != null) {
            interfaceC678133v.pause();
        }
        JYR jyr = this.A0M;
        if (jyr != null) {
            JYR.A00(jyr, "note_self_note_bottom_sheet", " onPause");
        }
        C0f9.A09(-1977138111, A02);
    }
}
