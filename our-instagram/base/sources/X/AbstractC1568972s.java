package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.72s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1568972s {
    public static void A01(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C74P c74p, C1568472m c1568472m, C70G c70g, C154536x3 c154536x3, User user) {
        C57012jc c57012jc = c1568472m.A0R;
        if (((ProfileCoinFlipView) c57012jc.A01()).A01 == EnumC152426tV.A03) {
            c70g.D4H(null, c1568472m, c154536x3, user);
            return;
        }
        ProfileCoinFlipView profileCoinFlipView = (ProfileCoinFlipView) c57012jc.A01();
        if (C2TN.A04(userSession, user)) {
            if (AbstractC31248DoW.A04(userSession)) {
                c70g.D3b(profileCoinFlipView);
                return;
            }
            C189478aR A00 = new C189448aO(userSession).A00();
            String moduleName = interfaceC11380iw.getModuleName();
            String str = c74p.A0l;
            float f = c74p.A01;
            C14360o3.A0B(moduleName, 0);
            C14360o3.A0B(str, 1);
            EIJ eij = new EIJ();
            eij.setArguments(AbstractC61636Rr0.A00(new C09530e4("args_previous_module_name", moduleName), new C09530e4("args_avatar_sticker_url", str), new C09530e4("args_top_margin_ratio", Float.valueOf(f))));
            A00.A02(activity, eij);
            return;
        }
        c70g.D3c();
    }

    public static C74O A00(Context context, AvatarCoinFlipSticker avatarCoinFlipSticker, final UserSession userSession) {
        int i;
        int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_progress_bar_on_media));
        Resources resources = context.getResources();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36327700973501226L);
        int i2 = R.dimen.profile_header_avatar_size_new;
        if (A06) {
            i2 = R.dimen.appreciation_reels_grid_item_width;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i2);
        String str = avatarCoinFlipSticker.A03;
        if (AbstractC31248DoW.A01(userSession)) {
            i = (int) (dimensionPixelSize * 1.1d);
        } else {
            i = dimensionPixelSize;
        }
        C74O c74o = (C74O) C74N.A01(context, userSession, new C74M() { // from class: X.74L
            @Override // X.C74M
            public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str2, String str3) {
            }

            @Override // X.C74M
            public final /* synthetic */ void DQ4(XEC xec, String str2, String str3, String str4) {
            }

            @Override // X.C74M
            public final void Dbm(String str2, float f) {
            }

            @Override // X.C74M
            public final void onError(String str2) {
            }

            @Override // X.C74M
            public final void DQ3(XEC xec, String str2, String str3) {
                C31429DrZ A00 = AbstractC31428DrY.A00(UserSession.this);
                if (A00 != null) {
                    A00.A01();
                }
            }

            @Override // X.C74M
            public final /* synthetic */ boolean EiZ() {
                return false;
            }
        }, str, "ig_profile", null, null, i, dimensionPixelSize, false, true, false, true, C18U.A06(c06090Tz, userSession, 36325270021682124L));
        c74o.A0a.A01(color, color);
        ((C74P) c74o).A01 = avatarCoinFlipSticker.A02 / avatarCoinFlipSticker.A01;
        return c74o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A03(com.instagram.common.session.UserSession r4, com.instagram.user.model.User r5, boolean r6, boolean r7) {
        /*
            boolean r0 = X.C2TN.A04(r4, r5)
            r3 = 0
            if (r0 == 0) goto L17
            if (r6 == 0) goto L17
            if (r7 != 0) goto L18
            boolean r0 = r5.A1k()
            if (r0 == 0) goto L24
            boolean r0 = r5.A1X()
        L15:
            if (r0 != 0) goto L24
        L17:
            return r3
        L18:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322027321173969(0x810ab1000027d1, double:3.033534562750476E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            goto L15
        L24:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322027321173969(0x810ab1000027d1, double:3.033534562750476E-306)
            boolean r3 = X.C18U.A06(r2, r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1568972s.A03(com.instagram.common.session.UserSession, com.instagram.user.model.User, boolean, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02bb, code lost:
    
        if (r47.A0C == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02cc, code lost:
    
        if (r20 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0328, code lost:
    
        if (r13.A00 == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x032d, code lost:
    
        r12 = r13.A01;
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0330, code lost:
    
        if (r12 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0332, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0333, code lost:
    
        r12 = r14.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0335, code lost:
    
        if (r12 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x033b, code lost:
    
        if (r12.B9m() == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x033d, code lost:
    
        if (r6 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x033f, code lost:
    
        r6.setVisibility(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0348, code lost:
    
        if (r15 != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x034a, code lost:
    
        if (r13 == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0350, code lost:
    
        if (X.C18U.A06(r7, r46, 36322151875487771L) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x032b, code lost:
    
        if (r13 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03d6, code lost:
    
        if (X.AbstractC13670mt.A00(r3) > 3) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r52.A1V() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0417, code lost:
    
        if (X.JZC.A02(r46, r20) != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r12 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x06d1, code lost:
    
        if (X.C18U.A06(r7, r46, 36328362398072295L) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0780, code lost:
    
        if (X.JZC.A02(r46, r20) == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x08c4, code lost:
    
        if (r49 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0901, code lost:
    
        if (r6.A01() != null) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x091f, code lost:
    
        if (r47.A0I == false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0a88, code lost:
    
        if (X.C18U.A06(r11, r46, 36325270021551050L) == false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0ddc, code lost:
    
        if (r8.A0x(r46) != false) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01cf, code lost:
    
        if (r49.A05(r46) != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0164 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(androidx.fragment.app.Fragment r42, final X.C6C9 r43, final com.instagram.avatars.coinflip.AvatarCoinFlipConfig r44, final X.InterfaceC11380iw r45, final com.instagram.common.session.UserSession r46, final X.C1568472m r47, final X.C70G r48, final X.C154536x3 r49, final X.InterfaceC55362gb r50, final X.C64742wY r51, final com.instagram.user.model.User r52, boolean r53, boolean r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 3725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1568972s.A02(androidx.fragment.app.Fragment, X.6C9, com.instagram.avatars.coinflip.AvatarCoinFlipConfig, X.0iw, com.instagram.common.session.UserSession, X.72m, X.70G, X.6x3, X.2gb, X.2wY, com.instagram.user.model.User, boolean, boolean, boolean):void");
    }
}
