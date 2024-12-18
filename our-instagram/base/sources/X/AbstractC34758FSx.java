package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;

/* renamed from: X.FSx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34758FSx {
    public static final void A01(View view, AvatarCoinFlipConfig avatarCoinFlipConfig, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) AbstractC166997dE.A0S(view, R.id.profile_coin_flip_view);
        Context A0L = AbstractC166997dE.A0L(profileCoinFlipView);
        C74K.A03(A0L, profileCoinFlipView, userSession, null, R.dimen.appreciation_reels_grid_item_width);
        profileCoinFlipView.setProfilePicUrl(AbstractC166997dE.A0Y(userSession).Bhu(), interfaceC11380iw);
        profileCoinFlipView.setCircleBackgroundColor(AbstractC167007dF.A09(A0L, R.attr.igds_color_elevated_highlight_background));
        AbstractC56952jT.A01(profileCoinFlipView);
        if (avatarCoinFlipConfig != null) {
            profileCoinFlipView.setAvatarDrawables(AbstractC16960so.A1Q(A00(A0L, avatarCoinFlipConfig.A06, userSession), A00(A0L, avatarCoinFlipConfig.A05, userSession)));
        }
        profileCoinFlipView.postDelayed(new GNQ(new C74H((ViewGroup) AbstractC166997dE.A0S(view, R.id.coin_flip_nux_container), EnumC152426tV.A03, profileCoinFlipView, null, GTD.A00, GTE.A00, GTF.A00, GTG.A00, C18U.A06(C06090Tz.A05, userSession, 36315915583426253L), true, false), profileCoinFlipView), 500L);
    }

    public static final C74O A00(Context context, AvatarCoinFlipSticker avatarCoinFlipSticker, UserSession userSession) {
        int A0H;
        int i;
        boolean A1Y = AbstractC25229BEm.A1Y(avatarCoinFlipSticker);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315915583426253L)) {
            A0H = R.color.fds_transparent;
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_progress_bar_on_media);
        }
        int color = context.getColor(A0H);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.appreciation_reels_grid_item_width);
        String str = avatarCoinFlipSticker.A03;
        if (C18U.A06(c06090Tz, userSession, 36315915583426253L)) {
            i = (int) (dimensionPixelSize * 1.1d);
        } else {
            i = dimensionPixelSize;
        }
        Drawable A02 = C74N.A02(context, userSession, str, i, dimensionPixelSize, A1Y);
        if (A02 instanceof C74O) {
            C74O c74o = (C74O) A02;
            if (c74o != null) {
                C74X c74x = c74o.A0a;
                if (c74x != null) {
                    c74x.A01(color, color);
                }
                ((C74P) c74o).A01 = avatarCoinFlipSticker.A02 / avatarCoinFlipSticker.A01;
            }
            return c74o;
        }
        return null;
    }
}
