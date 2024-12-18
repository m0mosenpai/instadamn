package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.StoryMusicPickTappableData;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.8je, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194788je extends AbstractC130945vi implements C5RR, InterfaceC133125ze {
    public final int A00;
    public final MusicPickStickerModel A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Context A05;
    public final Drawable A06;
    public final Drawable A07;
    public final Drawable A08;
    public final Drawable A09;
    public final Drawable A0A;
    public final Drawable A0B;
    public final Drawable A0C;
    public final Drawable A0D;
    public final UserSession A0E;

    public C194788je(Context context, UserSession userSession, MusicPickStickerModel musicPickStickerModel, String str) {
        Drawable drawable;
        ImageUrl imageUrl;
        Drawable drawable2;
        String str2;
        User user;
        String displayArtist;
        C14360o3.A0B(musicPickStickerModel, 2);
        this.A05 = context;
        this.A01 = musicPickStickerModel;
        this.A0E = userSession;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        StoryMusicPickTappableData storyMusicPickTappableData = musicPickStickerModel.A00;
        TrackData trackData = storyMusicPickTappableData.A04;
        String str3 = null;
        if (trackData != null) {
            drawable = new C0B(context, trackData.AsF(), false);
        } else {
            OriginalSoundData originalSoundData = storyMusicPickTappableData.A01;
            if (originalSoundData != null) {
                User user2 = originalSoundData.A03;
                if (user2 != null) {
                    imageUrl = user2.Bhu();
                } else {
                    imageUrl = null;
                }
                drawable = new C0B(context, imageUrl, C36A.A0C(userSession));
            } else {
                drawable = context.getDrawable(R.drawable.music_pick_sticker_album_background);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        this.A08 = drawable;
        StoryMusicPickTappableData storyMusicPickTappableData2 = musicPickStickerModel.A00;
        if (storyMusicPickTappableData2.A04 == null && storyMusicPickTappableData2.A01 == null) {
            Drawable drawable3 = context.getDrawable(R.drawable.music_pick_add_drawable);
            drawable2 = drawable3;
            if (drawable3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            C138586Po A00 = AbstractC138576Pn.A00(1.0f, context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding), false);
            A00.A0A.setColor(context.getColor(R.color.igds_icon_on_color));
            A00.A05 = true;
            A00.invalidateSelf();
            drawable2 = A00;
        }
        this.A0B = drawable2;
        TrackData trackData2 = musicPickStickerModel.A00.A04;
        if (trackData2 == null || (str2 = trackData2.getTitle()) == null) {
            OriginalSoundData originalSoundData2 = musicPickStickerModel.A00.A01;
            if (originalSoundData2 != null) {
                str2 = originalSoundData2.A0M;
            } else {
                str2 = null;
            }
        }
        this.A0D = AEL.A01(context, str2 == null ? "" : str2, R.dimen.music_pick_author_container_size, R.color.igds_icon_on_color, R.dimen.account_discovery_bottom_gap);
        TrackData trackData3 = musicPickStickerModel.A00.A04;
        if (trackData3 != null && (displayArtist = trackData3.getDisplayArtist()) != null) {
            str3 = displayArtist;
        } else {
            OriginalSoundData originalSoundData3 = musicPickStickerModel.A00.A01;
            if (originalSoundData3 != null && (user = originalSoundData3.A03) != null) {
                str3 = user.getUsername();
            }
        }
        this.A09 = AEL.A01(context, str3 == null ? "" : str3, R.dimen.music_pick_author_container_size, R.color.bright_foreground_disabled_material_dark, R.dimen.account_discovery_bottom_gap);
        String string = context.getString(2131968001);
        this.A06 = AEL.A01(context, string == null ? "" : string, R.dimen.music_pick_author_container_size, R.color.bright_foreground_disabled_material_dark, R.dimen.action_bar_item_spacing_right);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        Drawable drawable4 = context.getDrawable(R.drawable.music_pick_sticker_prompt_background);
        if (drawable4 != null) {
            this.A0C = drawable4;
            String string2 = context.getResources().getString(2131971064);
            C14360o3.A07(string2);
            this.A07 = AEL.A01(context, string2, R.dimen.add_to_story_dual_destination_share_sheet_story_row_height, R.color.clips_remix_camera_outer_container_default_background, R.dimen.abc_edit_text_inset_top_material);
            StoryMusicPickTappableData storyMusicPickTappableData3 = musicPickStickerModel.A00;
            this.A0A = AEL.A00(context, str, storyMusicPickTappableData3.A09, storyMusicPickTappableData3.A00);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "music_pick_sticker_bundle_id";
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        C14360o3.A0B(canvas, 0);
        this.A08.draw(canvas);
        this.A0B.draw(canvas);
        MusicPickStickerModel musicPickStickerModel = this.A01;
        StoryMusicPickTappableData storyMusicPickTappableData = musicPickStickerModel.A00;
        if (storyMusicPickTappableData.A04 == null && storyMusicPickTappableData.A01 == null) {
            drawable = this.A06;
        } else {
            this.A0D.draw(canvas);
            drawable = this.A09;
        }
        drawable.draw(canvas);
        this.A0C.draw(canvas);
        this.A0A.draw(canvas);
        if (musicPickStickerModel.A01 == 0) {
            this.A07.draw(canvas);
        }
        invalidateSelf();
    }

    @Override // X.C5RN
    public final List A07() {
        return AbstractC16960so.A1Q(this.A08, this.A0B, this.A0D, this.A09, this.A0C, this.A07, this.A0A);
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A08.getIntrinsicHeight() + this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        int i5;
        int intrinsicWidth;
        int intrinsicHeight;
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        int i6 = this.A00;
        float f3 = i6 / 2.0f;
        float intrinsicHeight2 = f2 - (getIntrinsicHeight() / 2.0f);
        Drawable drawable2 = this.A08;
        int i7 = (int) (f - f3);
        int i8 = (int) intrinsicHeight2;
        int i9 = (int) (f + f3);
        int intrinsicHeight3 = (int) (f2 + (getIntrinsicHeight() / 2.0f));
        int i10 = this.A02;
        int i11 = intrinsicHeight3 - i10;
        drawable2.setBounds(i7, i8, i9, i11);
        Drawable drawable3 = this.A0B;
        drawable3.setBounds(i7, i8, i9, i11);
        StoryMusicPickTappableData storyMusicPickTappableData = this.A01.A00;
        if (storyMusicPickTappableData.A04 == null && storyMusicPickTappableData.A01 == null) {
            drawable = this.A06;
            int i12 = i6 / 2;
            intrinsicWidth = (i12 + i7) - (drawable.getIntrinsicWidth() / 2);
            intrinsicHeight = this.A03 + i8 + (drawable3.getIntrinsicHeight() / 2) + (drawable2.getIntrinsicHeight() / 2);
            i5 = i9 - i12;
        } else {
            Drawable drawable4 = this.A0D;
            int i13 = i6 / 2;
            int i14 = i13 + i7;
            int intrinsicWidth2 = i14 - (drawable4.getIntrinsicWidth() / 2);
            int intrinsicHeight4 = drawable2.getIntrinsicHeight() + i8;
            int i15 = this.A04;
            drawable = this.A09;
            i5 = i9 - i13;
            drawable4.setBounds(intrinsicWidth2, ((intrinsicHeight4 - i15) - drawable.getIntrinsicHeight()) - drawable4.getIntrinsicHeight(), (drawable4.getIntrinsicWidth() / 2) + i5, intrinsicHeight3);
            intrinsicWidth = i14 - (drawable.getIntrinsicWidth() / 2);
            intrinsicHeight = ((drawable2.getIntrinsicHeight() + i8) - i15) - drawable.getIntrinsicHeight();
        }
        drawable.setBounds(intrinsicWidth, intrinsicHeight, i5 + (drawable.getIntrinsicWidth() / 2), intrinsicHeight3);
        this.A0C.setBounds(i7, drawable2.getIntrinsicHeight() + i8, i9, intrinsicHeight3);
        Drawable drawable5 = this.A0A;
        int i16 = this.A04;
        int i17 = i10 / 2;
        drawable5.setBounds(i16 + i7, drawable2.getIntrinsicHeight() + i8 + (i17 - (drawable5.getIntrinsicHeight() / 2)), (i9 - i6) + drawable5.getIntrinsicWidth() + i16, intrinsicHeight3 - (i17 - (drawable5.getIntrinsicHeight() / 2)));
        Drawable drawable6 = this.A07;
        drawable6.setBounds(((i7 + i6) - drawable6.getIntrinsicWidth()) - i16, i8 + drawable2.getIntrinsicHeight() + (i17 - (drawable6.getIntrinsicHeight() / 2)), i9 - i16, intrinsicHeight3 - (i17 - (drawable6.getIntrinsicHeight() / 2)));
    }
}
