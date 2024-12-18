package com.instagram.direct.inbox.notes.ui;

import X.AbstractC20100yh;
import X.AbstractC53242c7;
import X.AbstractC56372iV;
import X.AbstractC73003Pb;
import X.AnonymousClass693;
import X.B70;
import X.C00O;
import X.C06090Tz;
import X.C07T;
import X.C14360o3;
import X.C152716tz;
import X.C18U;
import X.C20150ym;
import X.C206869Dr;
import X.C208149Iv;
import X.C3DY;
import X.C4AC;
import X.C50802Vb;
import X.C68U;
import X.C85363rR;
import X.C93Q;
import X.InterfaceC16820sZ;
import X.InterfaceC56392iX;
import X.JR9;
import X.RunnableC208099Iq;
import X.RunnableC24686AwR;
import X.RunnableC49969M4k;
import X.ViewOnClickListenerC23204AQo;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;

/* loaded from: classes4.dex */
public final class NoteAvatarView extends ConstraintLayout {
    public Drawable A00;
    public ViewGroup A01;
    public CardView A02;
    public AnonymousClass693 A03;
    public NoteActivationType A04;
    public UserSession A05;
    public IgFrameLayout A06;
    public IgSimpleImageView A07;
    public IgSimpleImageView A08;
    public IgSimpleImageView A09;
    public IgSimpleImageView A0A;
    public IgSimpleImageView A0B;
    public CircularImageView A0C;
    public IgImageView A0D;
    public InterfaceC56392iX A0E;
    public InterfaceC56392iX A0F;
    public InterfaceC56392iX A0G;
    public NoteBubbleView A0H;
    public SquareAvatarWithBadgeView A0I;
    public ReelAvatarWithBadgeView A0J;
    public C07T A0K;
    public CircularImageView A0L;
    public boolean A0M;
    public final IgImageView A0N;
    public final IgImageView A0O;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteAvatarView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A0E(Drawable drawable, int i, boolean z) {
        SquareAvatarWithBadgeView squareAvatarWithBadgeView;
        CornerPunchedRoundedCornerImageView cornerPunchedRoundedCornerImageView;
        boolean z2;
        IgSimpleImageView igSimpleImageView = this.A0B;
        if (z) {
            igSimpleImageView.setImageDrawable(drawable);
            ViewGroup.LayoutParams layoutParams = this.A0B.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            z2 = false;
            this.A0J.A02(null, 0);
            squareAvatarWithBadgeView = this.A0I;
            Drawable drawable2 = squareAvatarWithBadgeView.A00;
            if (drawable2 != null) {
                drawable2.setCallback(null);
                squareAvatarWithBadgeView.A00 = null;
                cornerPunchedRoundedCornerImageView = squareAvatarWithBadgeView.A02;
            } else {
                return;
            }
        } else {
            igSimpleImageView.setImageDrawable(null);
            this.A0J.A02(drawable, i);
            squareAvatarWithBadgeView = this.A0I;
            Drawable drawable3 = squareAvatarWithBadgeView.A00;
            if (drawable3 == drawable) {
                return;
            }
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            squareAvatarWithBadgeView.A00 = drawable;
            cornerPunchedRoundedCornerImageView = squareAvatarWithBadgeView.A02;
            if (drawable != null) {
                cornerPunchedRoundedCornerImageView.A00 = true;
                cornerPunchedRoundedCornerImageView.invalidate();
                drawable.setCallback(squareAvatarWithBadgeView);
                drawable.setBounds(0, 0, i, i);
                squareAvatarWithBadgeView.invalidate();
            }
            z2 = false;
        }
        cornerPunchedRoundedCornerImageView.A00 = z2;
        cornerPunchedRoundedCornerImageView.invalidate();
        squareAvatarWithBadgeView.post(new RunnableC208099Iq(squareAvatarWithBadgeView));
        squareAvatarWithBadgeView.invalidate();
    }

    public final void A0F(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        this.A05 = userSession;
        setNoteBubbleView((NoteBubbleView) requireViewById(R.id.pog_note_bubble_view));
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        C85363rR c85363rR = C85363rR.A00;
        noteBubbleView.A0J(c85363rR.A09(userSession), C85363rR.A06(userSession), C85363rR.A07(userSession), C85363rR.A04(userSession));
        boolean z = false;
        setNoteAnimatedBubbleView(AbstractC56372iV.A01(findViewById(R.id.pog_note_animated_bubble_view_stub), false, false));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36329290111402233L)) {
            ((NoteBubbleView) getNoteAnimatedBubbleView().getView()).A0J(c85363rR.A09(userSession), C85363rR.A06(userSession), C85363rR.A07(userSession), C85363rR.A04(userSession));
        }
        boolean A09 = C4AC.A09(userSession);
        int i = R.id.prompt_note_pog_avatar_view;
        if (A09) {
            i = R.id.prompt_note_pog_avatar_view_square;
        }
        View requireViewById = requireViewById(i);
        C14360o3.A07(requireViewById);
        setPromptPogAvatar((IgImageView) requireViewById);
        this.A0J.setForceTrackingForProfileImageEnabled(!C18U.A06(c06090Tz, userSession, 36323178372738109L));
        if (((int) C18U.A01(c06090Tz, userSession, 36604880986248333L)) > 0) {
            z = true;
        }
        this.A0M = z;
    }

    public final void setAvatar(ReelAvatarWithBadgeView reelAvatarWithBadgeView) {
        C14360o3.A0B(reelAvatarWithBadgeView, 0);
        this.A0J = reelAvatarWithBadgeView;
    }

    public final void setAvatarContainer(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        this.A01 = viewGroup;
    }

    public final void setAvatarMediaThumbnail(CircularImageView circularImageView) {
        C14360o3.A0B(circularImageView, 0);
        this.A0C = circularImageView;
    }

    public final void setAvatarSimpleVideoLayout(InterfaceC56392iX interfaceC56392iX) {
        C14360o3.A0B(interfaceC56392iX, 0);
        this.A0E = interfaceC56392iX;
    }

    public final void setAvatarVideoView(InterfaceC56392iX interfaceC56392iX) {
        C14360o3.A0B(interfaceC56392iX, 0);
        this.A0F = interfaceC56392iX;
    }

    public final void setAvatarVideoViewContainer(CardView cardView) {
        C14360o3.A0B(cardView, 0);
        this.A02 = cardView;
    }

    public final void setAvatarVideoViewLayout(IgFrameLayout igFrameLayout) {
        C14360o3.A0B(igFrameLayout, 0);
        this.A06 = igFrameLayout;
    }

    public final void setBadgeDrawableOnClickDelegate(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 0);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0J;
        reelAvatarWithBadgeView.post(new RunnableC49969M4k(reelAvatarWithBadgeView, new C206869Dr(interfaceC16820sZ, 18)));
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A0I;
        squareAvatarWithBadgeView.post(new RunnableC24686AwR(squareAvatarWithBadgeView, new C206869Dr(interfaceC16820sZ, 19)));
        this.A0B.setOnClickListener(new ViewOnClickListenerC23204AQo(interfaceC16820sZ));
    }

    public final void setBubbleContent(CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme) {
        C14360o3.A0B(str, 2);
        if (charSequence != null && charSequence.length() != 0) {
            getNoteBubbleView().setVisibility(0);
            A00(noteCustomTheme);
        } else {
            getNoteBubbleView().setVisibility(8);
            this.A09.setVisibility(8);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        if (charSequence == null) {
            charSequence = "";
        }
        noteBubbleView.setText(charSequence, z, str, new C206869Dr(this, 20));
        NoteBubbleView.setContentLayout$default(getNoteBubbleView(), 0, null, 3, null);
        invalidate();
    }

    public final void setCreationContent(String str) {
        if (str != null && str.length() != 0) {
            getNoteBubbleView().setVisibility(0);
        } else {
            getNoteBubbleView().setVisibility(8);
            this.A09.setVisibility(8);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        if (str == null) {
            str = "";
        }
        noteBubbleView.setText(str, false, "", C208149Iv.A00);
        C152716tz.A00(getNoteBubbleView());
        getNoteBubbleView().A0F(null, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_secondary_text));
        invalidate();
    }

    public final void setGroupPogAvatar(CircularImageView circularImageView) {
        C14360o3.A0B(circularImageView, 0);
        this.A0L = circularImageView;
    }

    public final void setLifecycle(C07T c07t) {
        C14360o3.A0B(c07t, 0);
        this.A0K = c07t;
    }

    public final void setLikeAnimationImageView(IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(igSimpleImageView, 0);
        this.A07 = igSimpleImageView;
    }

    public final void setLocationBubbleContent(String str, CharSequence charSequence, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(charSequence, 1);
        C14360o3.A0B(str2, 2);
        getNoteBubbleView().setVisibility(0);
        getNoteBubbleView().A0D();
        getNoteBubbleView().setLocationContent(str, charSequence, str2);
    }

    public final void setLyricBubbleContent(String str, NoteCustomTheme noteCustomTheme) {
        C14360o3.A0B(str, 0);
        int length = str.length();
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        if (length == 0) {
            noteBubbleView.setVisibility(8);
            this.A09.setVisibility(8);
        } else {
            noteBubbleView.setVisibility(0);
            A00(noteCustomTheme);
        }
        NoteBubbleView.setContentLayout$default(getNoteBubbleView(), 0, this.A0K, 1, null);
        getNoteBubbleView().setLyricText(str);
        invalidate();
    }

    public final void setMultiHeartAnimationView(IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(igSimpleImageView, 0);
        this.A08 = igSimpleImageView;
    }

    public final void setMusicBubbleContent(String str, String str2, CharSequence charSequence, boolean z, NoteCustomTheme noteCustomTheme) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(charSequence, 2);
        getNoteBubbleView().setVisibility(0);
        if (str2.length() != 0 || charSequence.length() != 0) {
            A00(noteCustomTheme);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        C07T c07t = this.A0K;
        if (c07t != null) {
            noteBubbleView.setMusicContentLayout(c07t);
            getNoteBubbleView().A0G(charSequence, str, str2, z);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void setNoteAnimatedBubbleView(InterfaceC56392iX interfaceC56392iX) {
        C14360o3.A0B(interfaceC56392iX, 0);
        this.A0G = interfaceC56392iX;
    }

    public final void setNoteBubbleView(NoteBubbleView noteBubbleView) {
        C14360o3.A0B(noteBubbleView, 0);
        this.A0H = noteBubbleView;
    }

    public final void setNoteCustomActivationView(IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(igSimpleImageView, 0);
        this.A09 = igSimpleImageView;
    }

    public final void setPromptBubbleContent(CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme) {
        C14360o3.A0B(str, 2);
        if (charSequence != null && charSequence.length() != 0) {
            getNoteBubbleView().setVisibility(0);
            A00(noteCustomTheme);
        } else {
            getNoteBubbleView().setVisibility(8);
            this.A09.setVisibility(8);
        }
        NoteBubbleView noteBubbleView = getNoteBubbleView();
        if (charSequence == null) {
            charSequence = "";
        }
        noteBubbleView.setText(charSequence, z, str, new C206869Dr(this, 21));
        NoteBubbleView.setContentLayout$default(getNoteBubbleView(), 0, null, 3, null);
        invalidate();
    }

    public final void setPromptPogAvatar(IgImageView igImageView) {
        C14360o3.A0B(igImageView, 0);
        this.A0D = igImageView;
    }

    public final void setPromptStackedPogAvatar(IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(igSimpleImageView, 0);
        this.A0A = igSimpleImageView;
    }

    public final void setSquareAvatar(SquareAvatarWithBadgeView squareAvatarWithBadgeView) {
        C14360o3.A0B(squareAvatarWithBadgeView, 0);
        this.A0I = squareAvatarWithBadgeView;
    }

    public final void setUnsupportedBubbleContent(String str) {
        C14360o3.A0B(str, 0);
        getNoteBubbleView().setVisibility(0);
        getNoteBubbleView().A0F(null, AbstractC53242c7.A09(getContext()));
        getNoteBubbleView().setText(str, false, "", B70.A00);
    }

    public final void setVideoBadge(IgSimpleImageView igSimpleImageView) {
        C14360o3.A0B(igSimpleImageView, 0);
        this.A0B = igSimpleImageView;
    }

    public static /* synthetic */ void setBubbleContent$default(NoteAvatarView noteAvatarView, CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            noteCustomTheme = null;
        }
        noteAvatarView.setBubbleContent(charSequence, z, str, noteCustomTheme);
    }

    public static /* synthetic */ void setLocationBubbleContent$default(NoteAvatarView noteAvatarView, String str, CharSequence charSequence, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        noteAvatarView.setLocationBubbleContent(str, charSequence, str2);
    }

    public static /* synthetic */ void setLyricBubbleContent$default(NoteAvatarView noteAvatarView, String str, NoteCustomTheme noteCustomTheme, int i, Object obj) {
        if ((i & 2) != 0) {
            noteCustomTheme = null;
        }
        noteAvatarView.setLyricBubbleContent(str, noteCustomTheme);
    }

    public static /* synthetic */ void setMusicBubbleContent$default(NoteAvatarView noteAvatarView, String str, String str2, CharSequence charSequence, boolean z, NoteCustomTheme noteCustomTheme, int i, Object obj) {
        if ((i & 16) != 0) {
            noteCustomTheme = null;
        }
        noteAvatarView.setMusicBubbleContent(str, str2, charSequence, z, noteCustomTheme);
    }

    public static /* synthetic */ void setPromptBubbleContent$default(NoteAvatarView noteAvatarView, CharSequence charSequence, boolean z, String str, NoteCustomTheme noteCustomTheme, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            noteCustomTheme = null;
        }
        noteAvatarView.setPromptBubbleContent(charSequence, z, str, noteCustomTheme);
    }

    public final void A0D() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0J;
        reelAvatarWithBadgeView.post(new JR9(reelAvatarWithBadgeView));
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A0I;
        squareAvatarWithBadgeView.post(new RunnableC208099Iq(squareAvatarWithBadgeView));
        this.A0B.setOnClickListener(null);
    }

    public final void A0G(User user) {
        UserSession userSession = this.A05;
        if (userSession != null && AbstractC73003Pb.A02(userSession, user)) {
            UserSession userSession2 = this.A05;
            if (userSession2 == null) {
                C14360o3.A0F("userSession");
                throw C00O.createAndThrow();
            }
            if (Boolean.valueOf(C18U.A06(C06090Tz.A05, userSession2, 36319480405761493L)).booleanValue()) {
                this.A0J.setSingleAvatarBirthdayConfettiAnimation(true);
                this.A0I.setSingleAvatarBirthdayConfettiAnimation(true);
            }
        }
    }

    public final ReelAvatarWithBadgeView getAvatar() {
        return this.A0J;
    }

    public final ViewGroup getAvatarContainer() {
        return this.A01;
    }

    public final IgImageView getAvatarFilledLikeView() {
        return this.A0N;
    }

    public final CircularImageView getAvatarMediaThumbnail() {
        return this.A0C;
    }

    public final InterfaceC56392iX getAvatarSimpleVideoLayout() {
        return this.A0E;
    }

    public final InterfaceC56392iX getAvatarVideoView() {
        return this.A0F;
    }

    public final CardView getAvatarVideoViewContainer() {
        return this.A02;
    }

    public final IgFrameLayout getAvatarVideoViewLayout() {
        return this.A06;
    }

    public final IgImageView getFilledLikeView() {
        return this.A0O;
    }

    public final CircularImageView getGroupPogAvatar() {
        return this.A0L;
    }

    public final IgSimpleImageView getLikeAnimationImageView() {
        return this.A07;
    }

    public final AnonymousClass693 getMultiHeartAnimation() {
        return this.A03;
    }

    public final IgSimpleImageView getMultiHeartAnimationView() {
        return this.A08;
    }

    public final InterfaceC56392iX getNoteAnimatedBubbleView() {
        InterfaceC56392iX interfaceC56392iX = this.A0G;
        if (interfaceC56392iX != null) {
            return interfaceC56392iX;
        }
        C14360o3.A0F("noteAnimatedBubbleView");
        throw C00O.createAndThrow();
    }

    public final NoteBubbleView getNoteBubbleView() {
        NoteBubbleView noteBubbleView = this.A0H;
        if (noteBubbleView != null) {
            return noteBubbleView;
        }
        C14360o3.A0F("noteBubbleView");
        throw C00O.createAndThrow();
    }

    public final IgSimpleImageView getNoteCustomActivationView() {
        return this.A09;
    }

    public final IgImageView getPromptPogAvatar() {
        IgImageView igImageView = this.A0D;
        if (igImageView != null) {
            return igImageView;
        }
        C14360o3.A0F("promptPogAvatar");
        throw C00O.createAndThrow();
    }

    public final IgSimpleImageView getPromptStackedPogAvatar() {
        return this.A0A;
    }

    public final SquareAvatarWithBadgeView getSquareAvatar() {
        return this.A0I;
    }

    public final IgSimpleImageView getVideoBadge() {
        return this.A0B;
    }

    private final void A00(NoteCustomTheme noteCustomTheme) {
        NoteActivationType noteActivationType;
        int color;
        boolean equals;
        String Aev;
        getNoteBubbleView().setCustomTheme(noteCustomTheme);
        if (noteCustomTheme != null) {
            noteActivationType = noteCustomTheme.AYn();
        } else {
            noteActivationType = null;
        }
        this.A04 = noteActivationType;
        if (noteCustomTheme != null && (Aev = noteCustomTheme.Aev()) != null && Aev.length() != 0) {
            color = Color.parseColor(noteCustomTheme.Aev());
        } else {
            Context context = getContext();
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_background));
        }
        this.A0O.getBackground().setColorFilter(C3DY.A00(color));
        NoteActivationType noteActivationType2 = this.A04;
        String str = null;
        if (noteActivationType2 != null) {
            str = noteActivationType2.name();
        }
        int i = 0;
        if (str == null) {
            equals = false;
        } else {
            equals = str.equals("WNBA_NOTES");
        }
        IgSimpleImageView igSimpleImageView = this.A09;
        if (!equals) {
            i = 8;
        }
        igSimpleImageView.setVisibility(i);
    }

    public final void setMultiHeartAnimation(AnonymousClass693 anonymousClass693) {
        this.A03 = anonymousClass693;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        int i2 = C20150ym.A07(AbstractC20100yh.A00(36323406011182293L)) ? R.layout.cf_hub_avatar_view_v2 : R.layout.cf_hub_avatar_view;
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        C50802Vb.A00(from, new ViewGroup.LayoutParams(-2, -1), this, i2, 0, true, this.A0M);
        this.A01 = (ViewGroup) requireViewById(R.id.avatar_container);
        this.A0J = (ReelAvatarWithBadgeView) requireViewById(R.id.avatar);
        this.A0I = (SquareAvatarWithBadgeView) requireViewById(R.id.square_avatar);
        this.A02 = (CardView) requireViewById(R.id.video_preview_container);
        this.A06 = (IgFrameLayout) requireViewById(R.id.layout_video_view);
        this.A0F = AbstractC56372iV.A01(findViewById(R.id.notes_video_view_stub), false, false);
        this.A0E = AbstractC56372iV.A01(findViewById(R.id.notes_video_player_layout_stub), false, false);
        this.A0C = (CircularImageView) requireViewById(R.id.video_view_thumbnail);
        this.A0L = (CircularImageView) requireViewById(R.id.group_note_pog_avatar_view);
        this.A0A = (IgSimpleImageView) requireViewById(R.id.prompt_note_stacked_pog_avatar_view);
        this.A0B = (IgSimpleImageView) requireViewById(R.id.video_badge_view);
        this.A07 = (IgSimpleImageView) requireViewById(R.id.like_animation_image_view);
        this.A0O = (IgImageView) requireViewById(R.id.filled_like_view);
        this.A0N = (IgImageView) requireViewById(R.id.avatar_filled_like_view);
        this.A08 = (IgSimpleImageView) requireViewById(R.id.multi_heart_animation_view);
        this.A03 = C68U.A00(context, R.raw.story_likes_crowd_noise);
        IgSimpleImageView igSimpleImageView = (IgSimpleImageView) requireViewById(R.id.note_custom_activation_view);
        this.A09 = igSimpleImageView;
        igSimpleImageView.setBackground(new C93Q());
        setClipChildren(false);
        setClipToPadding(false);
        this.A04 = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NoteAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
