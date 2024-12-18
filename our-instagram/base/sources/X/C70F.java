package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.user.model.User;
import java.util.Iterator;

/* renamed from: X.70F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C70F implements C70G, InterfaceC63982vJ {
    public AutoLaunchReelParams A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final UserDetailFragment A03;
    public final UserDetailTabController A04;
    public final UserDetailLaunchConfig A05;
    public final C38E A06;
    public final InterfaceC09390do A07;
    public final C37494GfC A08;
    public final InterfaceC53892dT A09;
    public final String A0A;
    public final String A0B;

    public C70F(FragmentActivity fragmentActivity, UserSession userSession, UserDetailFragment userDetailFragment, UserDetailTabController userDetailTabController, C37494GfC c37494GfC, UserDetailLaunchConfig userDetailLaunchConfig, C38E c38e, InterfaceC53892dT interfaceC53892dT, String str, String str2) {
        C14360o3.A0B(c38e, 7);
        this.A02 = userSession;
        this.A03 = userDetailFragment;
        this.A01 = fragmentActivity;
        this.A04 = userDetailTabController;
        this.A05 = userDetailLaunchConfig;
        this.A09 = interfaceC53892dT;
        this.A06 = c38e;
        this.A0A = str;
        this.A0B = str2;
        this.A08 = c37494GfC;
        C9EY c9ey = new C9EY(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EY(new C9EY(userDetailFragment, 15), 16));
        this.A07 = new C60842q8(new C9EY(A00, 17), c9ey, new C9F7(0, null, A00), new C0YZ(C92874Ed.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (X.AbstractC31248DoW.A00(r12.A02) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse r13, com.instagram.avatars.coinflip.ProfileCoinFlipView r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, float r18, boolean r19, boolean r20) {
        /*
            r12 = this;
            r0 = 0
            r1 = r15
            X.C14360o3.A0B(r15, r0)
            r0 = 1
            r2 = r16
            X.C14360o3.A0B(r2, r0)
            if (r14 == 0) goto L16
            com.instagram.common.session.UserSession r0 = r12.A02
            boolean r0 = X.AbstractC31248DoW.A00(r0)
            r6 = 1
            if (r0 != 0) goto L17
        L16:
            r6 = 0
        L17:
            com.instagram.common.session.UserSession r9 = r12.A02
            boolean r0 = X.AbstractC31248DoW.A04(r9)
            if (r0 == 0) goto L65
            X.AbstractC31364DqT.A03()
            java.lang.String r4 = "ig_self_profile"
            r0 = r13
            r3 = r17
            r5 = r18
            r7 = r19
            r8 = r20
            X.EKa r0 = X.AbstractC33779Ew5.A00(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r11 = "avatar_coin_flip_customization"
            android.os.Bundle r8 = r0.mArguments
            if (r8 == 0) goto L65
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r10 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r7 = r12.A01
            X.6XJ r6 = new X.6XJ
            r6.<init>(r7, r8, r9, r10, r11)
            r5 = 1111(0x457, float:1.557E-42)
            if (r14 == 0) goto L66
            boolean r0 = X.AbstractC31248DoW.A00(r9)
            if (r0 == 0) goto L66
            com.instagram.profile.fragment.UserDetailFragment r4 = r12.A03
            com.instagram.avatars.coinflip.CoinFlipAvatarImageView r1 = r14.A01
            java.lang.String r0 = "avatarTransition"
            X.3AY r3 = new X.3AY
            r3.<init>(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r14.A02
            java.lang.String r1 = "backgroundTransition"
            X.3AY r0 = new X.3AY
            r0.<init>(r2, r1)
            X.3AY[] r0 = new X.C3AY[]{r3, r0}
            r6.A0B(r7, r4, r0, r5)
        L65:
            return
        L66:
            com.instagram.profile.fragment.UserDetailFragment r0 = r12.A03
            r6.A0D(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70F.A03(com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse, com.instagram.avatars.coinflip.ProfileCoinFlipView, java.lang.String, java.lang.String, java.lang.String, float, boolean, boolean):void");
    }

    @Override // X.C70G
    public final void Cqr(User user) {
        UserSession userSession = this.A02;
        InterfaceC83703oF A00 = AbstractC34056F1j.A00(userSession, user);
        UserDetailFragment userDetailFragment = this.A03;
        C36881nl A01 = C36881nl.A01(userDetailFragment.requireActivity(), userDetailFragment, userSession, "inbox_active_now_tab");
        A01.A0B = A00;
        A01.A0n = true;
        A01.A01 = userDetailFragment;
        A01.A0x = false;
        A01.A0s = true;
        A01.A06();
    }

    @Override // X.C70G
    public final void D3b(ProfileCoinFlipView profileCoinFlipView) {
        C14360o3.A0B(profileCoinFlipView, 0);
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A03.A0B;
        if (avatarCoinFlipConfig != null) {
            AvatarCoinFlipSticker avatarCoinFlipSticker = avatarCoinFlipConfig.A05;
            AvatarCoinFlipSticker avatarCoinFlipSticker2 = avatarCoinFlipConfig.A06;
            A03(avatarCoinFlipConfig.A04, profileCoinFlipView, avatarCoinFlipSticker.A03, avatarCoinFlipSticker2.A03, avatarCoinFlipConfig.A07, avatarCoinFlipSticker.A00, avatarCoinFlipConfig.A03, avatarCoinFlipConfig.A02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r17.A05(r5) != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // X.C70G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D4H(android.graphics.RectF r15, X.InterfaceC1568572n r16, X.C154536x3 r17, com.instagram.user.model.User r18) {
        /*
            r14 = this;
            r0 = 0
            r12 = r16
            X.C14360o3.A0B(r12, r0)
            r2 = 1
            com.instagram.common.session.UserSession r5 = r14.A02
            com.instagram.profile.fragment.UserDetailFragment r4 = r14.A03
            com.instagram.profile.fragment.UserDetailTabController r0 = r14.A04
            X.6yv r0 = r0.A0O
            com.instagram.user.model.User r3 = r0.A0J
            if (r3 == 0) goto Laa
            java.lang.String r1 = r5.userId
            java.lang.String r0 = r3.getId()
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L9a
            X.73w r6 = X.EnumC1571773w.A05
        L21:
            r15 = r18
            java.lang.String r8 = r15.getId()
            java.lang.String r9 = r14.A0A
            java.lang.String r10 = r14.A0B
            java.lang.String r7 = "tap_profile_pic"
            java.lang.String r11 = "user_profile_header"
            X.C1571673v.A08(r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = r17
            if (r17 == 0) goto L3d
            boolean r0 = r13.A05(r5)
            r1 = 0
            if (r0 == 0) goto L3e
        L3d:
            r1 = 1
        L3e:
            boolean r0 = r4.A12()
            if (r0 == 0) goto Lae
            boolean r0 = r15.A1k()
            if (r0 == 0) goto Lae
            if (r1 == 0) goto Lae
            boolean r0 = r15.A1V()
            if (r0 == 0) goto L65
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36318110311323534(0x8107210005178e, double:3.031057429948528E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 == 0) goto L65
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r0 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04
            A01(r0, r14)
        L64:
            return
        L65:
            android.content.Context r11 = r4.getContext()
            if (r11 == 0) goto L64
            r0 = 2131952349(0x7f1302dd, float:1.9541138E38)
            java.lang.String r1 = r11.getString(r0)
            r0 = 2131952413(0x7f13031d, float:1.9541268E38)
            java.lang.String r0 = r11.getString(r0)
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[]{r1, r0}
            X.8hC r0 = new X.8hC
            r0.<init>(r11)
            r0.A0m(r4, r5)
            X.Fig r10 = new X.Fig
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r0.A0f(r10, r1)
            r0.A0t(r2)
            android.app.Dialog r0 = r0.A02()
            X.C0fJ.A00(r0)
            return
        L9a:
            X.2kX r0 = X.C57582kX.A00(r5)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r3)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r1 != r0) goto Laa
            X.73w r6 = X.EnumC1571773w.A03
            goto L21
        Laa:
            X.73w r6 = X.EnumC1571773w.A04
            goto L21
        Lae:
            A02(r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70F.D4H(android.graphics.RectF, X.72n, X.6x3, com.instagram.user.model.User):void");
    }

    @Override // X.C70H
    public final void D6o(View view, View view2, C45216Jzw c45216Jzw, String str, String str2, boolean z) {
        new C48751LhJ(this.A02, this.A01).DW3(LKX.A00(view, view2, null, null, null, null, null, false, true, false, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.53S, java.lang.Object, X.FtG] */
    @Override // X.C70I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DOX(com.instagram.model.reels.Reel r20, X.C3Ow r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70F.DOX(com.instagram.model.reels.Reel, X.3Ow, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (r13.A1k() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r11.A03.A0s(X.EnumC152426tV.A03);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (X.C9JM.A00(r5, !r13.A1k(), X.C2TN.A04(r5, r13)) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.AbstractC31248DoW.A02(r5) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (X.C2TN.A04(r5, r13) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r4 = X.EnumC69993Ci.IG_PROFILE_PHOTO_LONG_PRESS;
        X.C3CZ.A0B = r4;
        r1 = r5.userId;
        X.C14360o3.A0B(r1, 0);
        X.AbstractC003100w.A0k(10, r1);
        X.AbstractC31719DwO.A00(r4, r5, "profile_picture_long_clicked", X.AbstractC43591JPw.A00(445), null, null, null);
        A01(com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04, r11);
     */
    @Override // X.C70G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DQn(X.C154536x3 r12, com.instagram.user.model.User r13) {
        /*
            r11 = this;
            r3 = 0
            com.instagram.common.session.UserSession r5 = r11.A02
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36315378711858349(0x8104a500010cad, double:3.029329955447477E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L22
            r0 = 36315378712186030(0x8104a500060cae, double:3.029329955654704E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L22
            boolean r0 = X.AbstractC31248DoW.A02(r5)
            r2 = 0
            if (r0 == 0) goto L3b
        L22:
            r2 = 1
            boolean r0 = r13.A1k()
            r1 = r0 ^ 1
            boolean r0 = X.C2TN.A04(r5, r13)
            boolean r0 = X.C9JM.A00(r5, r1, r0)
            if (r0 == 0) goto L3b
        L33:
            com.instagram.profile.fragment.UserDetailFragment r1 = r11.A03
            X.6tV r0 = X.EnumC152426tV.A03
            r1.A0s(r0)
        L3a:
            return
        L3b:
            boolean r0 = X.C2TN.A04(r5, r13)
            if (r0 == 0) goto L63
            X.3Ci r4 = X.EnumC69993Ci.IG_PROFILE_PHOTO_LONG_PRESS
            X.C3CZ.A0B = r4
            java.lang.String r1 = r5.userId
            X.C14360o3.A0B(r1, r3)
            r0 = 10
            X.AbstractC003100w.A0k(r0, r1)
            r8 = 0
            java.lang.String r6 = "profile_picture_long_clicked"
            r0 = 445(0x1bd, float:6.24E-43)
            java.lang.String r7 = X.AbstractC43591JPw.A00(r0)
            r9 = r8
            r10 = r8
            X.AbstractC31719DwO.A00(r4, r5, r6, r7, r8, r9, r10)
            com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType r0 = com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A04
            A01(r0, r11)
            return
        L63:
            if (r2 == 0) goto L3a
            boolean r0 = r13.A1k()
            if (r0 != 0) goto L3a
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70F.DQn(X.6x3, com.instagram.user.model.User):void");
    }

    @Override // X.C70H
    public final void DVy(C6C9 c6c9) {
        UserSession userSession = this.A02;
        C4F5 A00 = AbstractC43649JSh.A00(c6c9, userSession, null, -1, 0, false, false, false, false, false, false, false, false);
        EnumC152696tw enumC152696tw = EnumC152696tw.NOTE_BUBBLE;
        if (!C14360o3.A0K(A00.A0A.getId(), C08730cb.A00(userSession).A00().getId()) && JY1.A05(userSession, A00)) {
            AbstractC135966Db.A01(userSession).A0K(enumC152696tw, A00);
            Iterator it = A00.A0J.iterator();
            while (it.hasNext()) {
                long parseLong = Long.parseLong(((InterfaceC50424MOe) it.next()).BXJ().A0H);
                if (A00.A0E != null) {
                    ((C92874Ed) this.A07.getValue()).A03(parseLong);
                } else {
                    ((C92874Ed) this.A07.getValue()).A02(parseLong);
                    AbstractC135966Db.A01(userSession).A0F(EnumC46303KeZ.A0O, null, EnumC46273Ke5.DOUBLE_TAP, null, true, false, null, "❤️", "profile", null);
                }
            }
        }
    }

    @Override // X.C70H
    public final void DW2(C6C9 c6c9, String str, String str2) {
        JY1 jy1 = JY1.A00;
        UserSession userSession = this.A02;
        UserDetailFragment userDetailFragment = this.A03;
        jy1.A09(userDetailFragment, null, c6c9, userDetailFragment, userSession, new C48758LhQ(this), null, null, null, false, false, false, false, true, false, false);
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    private final void A00() {
        InterfaceC53892dT interfaceC53892dT = this.A09;
        if (interfaceC53892dT != null) {
            interfaceC53892dT.FBp(new PositionConfig(null, C82R.A00(C208509Kk.A00, new C81W[0]), null, "profile_picture_tap_on_self_profile", null, null, null, null, null, null, null, null, null, -1.0f, 0, true));
        }
    }

    public static final void A01(UpdateProfilePicturePagerAdapter$UpdateProfileTabType updateProfilePicturePagerAdapter$UpdateProfileTabType, C70F c70f) {
        UserSession userSession = c70f.A02;
        if (AbstractC1565371b.A00(userSession)) {
            AbstractC35176FfT.A02(c70f.A01, userSession, "edit_photo_and_avatar");
        } else {
            new C189448aO(userSession).A00().A02(c70f.A01, AbstractC33775Ew1.A00(updateProfilePicturePagerAdapter$UpdateProfileTabType, userSession, "ig_self_profile", c70f.A03.A1W, true, true));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r8.A1k() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (X.C9JM.A00(r2, !r8.A1k(), X.C2TN.A04(r2, r8)) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        if (r3 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r1 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.AbstractC31248DoW.A02(r2) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r6.A05(r2) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.InterfaceC1568572n r5, X.C154536x3 r6, X.C70F r7, com.instagram.user.model.User r8) {
        /*
            com.instagram.common.session.UserSession r2 = r7.A02
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36315378711858349(0x8104a500010cad, double:3.029329955447477E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            r4 = 0
            if (r0 != 0) goto L22
            r0 = 36315378712186030(0x8104a500060cae, double:3.029329955654704E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 != 0) goto L22
            boolean r0 = X.AbstractC31248DoW.A02(r2)
            r1 = 0
            if (r0 == 0) goto L23
        L22:
            r1 = 1
        L23:
            if (r6 == 0) goto L2c
            boolean r0 = r6.A05(r2)
            r3 = 1
            if (r0 == 0) goto L2d
        L2c:
            r3 = 0
        L2d:
            boolean r0 = X.C2TN.A04(r2, r8)
            if (r0 != 0) goto L79
            if (r1 == 0) goto L4c
            boolean r0 = r8.A1k()
            if (r0 == 0) goto L4b
        L3b:
            boolean r0 = r8.A1k()
            r1 = r0 ^ 1
            boolean r0 = X.C2TN.A04(r2, r8)
            boolean r0 = X.C9JM.A00(r2, r1, r0)
            if (r0 == 0) goto L4c
        L4b:
            r4 = 1
        L4c:
            boolean r0 = X.C2TN.A04(r2, r8)
            if (r0 == 0) goto L5c
            if (r3 != 0) goto L5e
            X.2dT r0 = r7.A09
            if (r0 == 0) goto L5b
            r7.A00()
        L5b:
            return
        L5c:
            if (r3 == 0) goto L6f
        L5e:
            if (r6 == 0) goto L6f
            java.util.ArrayList r1 = r6.A02(r2)
            com.instagram.model.reels.Reel r0 = r6.A01(r2)
            X.C14360o3.A07(r0)
            r7.DOX(r0, r5, r1)
            return
        L6f:
            if (r4 == 0) goto L5b
            com.instagram.profile.fragment.UserDetailFragment r1 = r7.A03
            X.6tV r0 = X.EnumC152426tV.A03
            r1.A0s(r0)
            return
        L79:
            if (r1 == 0) goto L4c
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70F.A02(X.72n, X.6x3, X.70F, com.instagram.user.model.User):void");
    }

    @Override // X.C70G
    public final void CzX(User user) {
        AbstractC46774KmV.A00(this.A03, this.A02);
    }

    @Override // X.C70G
    public final void D3c() {
        this.A03.A0s(EnumC152426tV.A02);
    }

    @Override // X.InterfaceC63982vJ
    public final void DHC(Reel reel, C6X4 c6x4) {
        this.A04.A0F();
    }

    @Override // X.C70G
    public final void DQb(User user) {
        if (C2TN.A04(this.A02, user)) {
            A01(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.A03, this);
        }
    }

    @Override // X.C70G
    public final void Dbf() {
        C69613Av c69613Av;
        C37494GfC c37494GfC = this.A08;
        if (c37494GfC != null && (c69613Av = c37494GfC.A06) != null) {
            c69613Av.A01();
        }
    }

    @Override // X.C70G
    public final void Dbg(boolean z) {
        C69613Av c69613Av;
        C37494GfC c37494GfC = this.A08;
        if (c37494GfC != null && (c69613Av = c37494GfC.A06) != null) {
            c69613Av.A01.A0K("has_profile_pic_animation", z);
            c69613Av.A05();
        }
    }

    @Override // X.C70G
    public final void Dbi() {
        C69613Av c69613Av;
        C37494GfC c37494GfC = this.A08;
        if (c37494GfC != null && (c69613Av = c37494GfC.A01) != null) {
            c69613Av.A05();
        }
    }

    @Override // X.C70G
    public final void DZO(User user) {
        A00();
    }
}
