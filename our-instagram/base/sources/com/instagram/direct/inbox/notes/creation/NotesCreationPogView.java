package com.instagram.direct.inbox.notes.creation;

import X.AbstractC25226BEj;
import X.AbstractC31173DnH;
import X.AbstractC37301Gc2;
import X.C14360o3;
import X.InterfaceC11380iw;
import X.InterfaceC56392iX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* loaded from: classes8.dex */
public final class NotesCreationPogView extends IgLinearLayout {
    public CardView A00;
    public IgFrameLayout A01;
    public CircularImageView A02;
    public CircularImageView A03;
    public RoundedCornerImageView A04;
    public InterfaceC56392iX A05;
    public InterfaceC56392iX A06;
    public ReelAvatarWithBadgeView A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotesCreationPogView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void setAvatarView(ReelAvatarWithBadgeView reelAvatarWithBadgeView) {
        C14360o3.A0B(reelAvatarWithBadgeView, 0);
        this.A07 = reelAvatarWithBadgeView;
    }

    public final void setCircleView(CircularImageView circularImageView) {
        C14360o3.A0B(circularImageView, 0);
        this.A02 = circularImageView;
    }

    public final void setProfilePhotoPog(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A07.setSingleAvatarUrlAndVisibility(imageUrl, interfaceC11380iw);
        A00(this);
        this.A07.setVisibility(0);
    }

    public final void setSimpleVideoLayoutView(InterfaceC56392iX interfaceC56392iX) {
        C14360o3.A0B(interfaceC56392iX, 0);
        this.A05 = interfaceC56392iX;
    }

    public final void setSquareView(RoundedCornerImageView roundedCornerImageView) {
        C14360o3.A0B(roundedCornerImageView, 0);
        this.A04 = roundedCornerImageView;
    }

    public final void setVideoView(InterfaceC56392iX interfaceC56392iX) {
        C14360o3.A0B(interfaceC56392iX, 0);
        this.A06 = interfaceC56392iX;
    }

    public static final void A00(NotesCreationPogView notesCreationPogView) {
        notesCreationPogView.A07.setVisibility(8);
        notesCreationPogView.A02.setVisibility(8);
        notesCreationPogView.A04.setVisibility(8);
        notesCreationPogView.A00.setVisibility(8);
        notesCreationPogView.A05.setVisibility(8);
        notesCreationPogView.A06.setVisibility(8);
        notesCreationPogView.A01.setVisibility(8);
        notesCreationPogView.A03.setVisibility(8);
    }

    public final ReelAvatarWithBadgeView getAvatarView() {
        return this.A07;
    }

    public final CircularImageView getCircleView() {
        return this.A02;
    }

    public final InterfaceC56392iX getSimpleVideoLayoutView() {
        return this.A05;
    }

    public final RoundedCornerImageView getSquareView() {
        return this.A04;
    }

    public final InterfaceC56392iX getVideoView() {
        return this.A06;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotesCreationPogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        View A0R = AbstractC25226BEj.A0R(LayoutInflater.from(context), this, R.layout.layout_notes_creation_pog_view, false);
        this.A07 = (ReelAvatarWithBadgeView) A0R.requireViewById(R.id.avatar);
        this.A02 = AbstractC31173DnH.A0T(A0R, R.id.circle_pog_in_note_creation);
        this.A04 = (RoundedCornerImageView) A0R.requireViewById(R.id.square_pog_in_note_creation);
        this.A00 = (CardView) A0R.requireViewById(R.id.video_preview_container);
        this.A06 = AbstractC37301Gc2.A0D(A0R, R.id.notes_video_view_stub);
        this.A05 = AbstractC37301Gc2.A0D(A0R, R.id.notes_video_player_layout_stub);
        this.A03 = AbstractC31173DnH.A0T(A0R, R.id.note_chat_create_avatar_view);
        this.A01 = (IgFrameLayout) A0R.requireViewById(R.id.note_chat_avatar_container);
        addView(A0R);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotesCreationPogView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
