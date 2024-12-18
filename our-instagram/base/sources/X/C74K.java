package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.74K, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C74K {
    public static final C74O A00(Context context, UserSession userSession, String str, float f, int i) {
        int A0H;
        int i2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 3);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315915583426253L)) {
            A0H = R.color.fds_transparent;
        } else {
            A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_progress_bar_on_media);
        }
        int color = context.getColor(A0H);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        if (C18U.A06(c06090Tz, userSession, 36315915583426253L)) {
            i2 = (int) (dimensionPixelSize * 1.1d);
        } else {
            i2 = dimensionPixelSize;
        }
        Drawable A02 = C74N.A02(context, userSession, str, i2, dimensionPixelSize, false);
        if (A02 instanceof C74O) {
            C74O c74o = (C74O) A02;
            if (c74o != null) {
                C74X c74x = c74o.A0a;
                if (c74x != null) {
                    c74x.A01(color, color);
                }
                ((C74P) c74o).A01 = f;
            }
            return c74o;
        }
        return null;
    }

    public static final void A01(Context context, AvatarCoinFlipConfig avatarCoinFlipConfig, ProfileCoinFlipView profileCoinFlipView, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse;
        String str;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(avatarCoinFlipConfig, 2);
        C14360o3.A0B(userSession, 4);
        if (C18U.A06(C06090Tz.A05, userSession, 36315915583622864L) && (avatarCoinFlipBackgroundOptionResponse = avatarCoinFlipConfig.A04) != null && (str = avatarCoinFlipBackgroundOptionResponse.A01) != null && str.length() > 0) {
            profileCoinFlipView.setCircleBackgroundImage(new SimpleImageUrl(str), interfaceC11380iw);
        } else {
            profileCoinFlipView.setCircleBackgroundColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_highlight_background)));
        }
    }

    public static final void A02(Context context, ProfileCoinFlipView profileCoinFlipView, UserSession userSession, Boolean bool, String str, float f, int i) {
        C14360o3.A0B(profileCoinFlipView, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(str, 3);
        A03(context, profileCoinFlipView, userSession, null, i);
        profileCoinFlipView.A0F(EnumC152426tV.A02);
        if (bool.equals(true)) {
            profileCoinFlipView.setCircleBackgroundColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_elevated_highlight_background)));
        }
        profileCoinFlipView.setAvatarImageDrawable(A00(context, userSession, str, f, i));
        ((AbstractC1569172v) profileCoinFlipView).A01.setAvatarScale(1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (X.C18U.A06(r4, r12, 36315915583753937L) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(android.content.Context r10, com.instagram.avatars.coinflip.ProfileCoinFlipView r11, com.instagram.common.session.UserSession r12, java.lang.Integer r13, int r14) {
        /*
            r6 = 1
            X.C14360o3.A0B(r12, r6)
            r0 = 2
            X.C14360o3.A0B(r10, r0)
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36315915583426253(0x810522000b0ecd, double:3.029669475188828E-306)
            boolean r2 = X.C18U.A06(r4, r12, r0)
            if (r2 == 0) goto L73
            android.view.ViewGroup$LayoutParams r9 = r11.getLayoutParams()
            android.content.res.Resources r2 = r10.getResources()
            int r2 = r2.getDimensionPixelSize(r14)
            double r2 = (double) r2
            r7 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r2 = r2 * r7
            int r5 = (int) r2
            r9.height = r5
            android.view.ViewGroup$LayoutParams r5 = r11.getLayoutParams()
            boolean r2 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L47
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            if (r5 == 0) goto L47
            if (r13 == 0) goto L47
            android.content.res.Resources r3 = r10.getResources()
            int r2 = r13.intValue()
            int r2 = r3.getDimensionPixelSize(r2)
            r5.bottomMargin = r2
        L47:
            r11.A05 = r6
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r5 = r11.A01
            r2 = 36315915582901960(0x81052200030ec8, double:3.029669474857263E-306)
            boolean r2 = X.C18U.A06(r4, r12, r2)
            if (r2 == 0) goto L68
            boolean r0 = X.C18U.A06(r4, r12, r0)
            if (r0 == 0) goto L68
            r0 = 36315915583753937(0x81052200100ed1, double:3.0296694753960566E-306)
            boolean r1 = X.C18U.A06(r4, r12, r0)
            r0 = 1
            if (r1 != 0) goto L69
        L68:
            r0 = 0
        L69:
            r5.A00 = r0
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r0 = r11.A01
            r0.setAvatarScale(r1)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74K.A03(android.content.Context, com.instagram.avatars.coinflip.ProfileCoinFlipView, com.instagram.common.session.UserSession, java.lang.Integer, int):void");
    }
}
