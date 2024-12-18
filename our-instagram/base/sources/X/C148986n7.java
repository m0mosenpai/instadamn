package X;

import android.content.Context;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6n7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148986n7 implements InterfaceC148826mr {
    public EnumC75383a5 A00;
    public boolean A01;
    public boolean A02;

    @Override // X.InterfaceC148826mr
    public final View C9K(C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        C14360o3.A0B(interfaceC143576dw, 0);
        if (this.A01) {
            return interfaceC143576dw.C9J();
        }
        if (this.A02) {
            return interfaceC143576dw.C9I();
        }
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C207559Gj C9L(UserSession userSession, C41181vS c41181vS, InterfaceC143576dw interfaceC143576dw) {
        return null;
    }

    @Override // X.InterfaceC148826mr
    public final C5ST C9O(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        int i;
        C14360o3.A0B(context, 1);
        EnumC75383a5 enumC75383a5 = this.A00;
        if (enumC75383a5 != null) {
            switch (enumC75383a5.ordinal()) {
                case 8:
                    i = 2131971931;
                    break;
                case Process.SIGTERM /* 15 */:
                    i = 2131971933;
                    break;
                case Process.SIGSTOP /* 19 */:
                    i = 2131971934;
                    break;
                case 21:
                    i = 2131971932;
                    break;
                case 23:
                    i = 2131971935;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    i = 2131971936;
                    break;
                case 30:
                case 36:
                    i = 2131975150;
                    break;
                default:
                    throw new IllegalArgumentException("current sticker type is not eligible for promote");
            }
            String string = context.getString(i);
            C14360o3.A0A(string);
            return new C149686oL(string);
        }
        throw new IllegalStateException("current sticker type should not be null");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0076. Please report as an issue. */
    @Override // X.InterfaceC148826mr
    public final void Dtu(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        InterfaceC19610xo ARD;
        boolean z;
        String str;
        boolean z2;
        InterfaceC19610xo ARD2;
        String str2;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 3);
        if (this.A01) {
            EnumC75383a5 enumC75383a5 = this.A00;
            if (enumC75383a5 != null) {
                switch (enumC75383a5.ordinal()) {
                    case 8:
                        z2 = true;
                        ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str2 = "story_promote_with_countdown_sticker_seen_tooltip";
                        break;
                    case Process.SIGTERM /* 15 */:
                        z2 = true;
                        ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str2 = "story_promote_with_hashtag_sticker_seen_tooltip";
                        break;
                    case Process.SIGSTOP /* 19 */:
                        z2 = true;
                        ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str2 = "story_promote_with_location_sticker_seen_tooltip";
                        break;
                    case 21:
                        z2 = true;
                        ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str2 = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button";
                        break;
                    case 23:
                        z2 = true;
                        ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str2 = "story_promote_with_mention_sticker_seen_tooltip";
                        break;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        z2 = true;
                        ARD2 = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str2 = "story_promote_with_poll_sticker_seen_tooltip_v2";
                        break;
                    default:
                        throw new IllegalArgumentException("current sticker type is not eligible for promote");
                }
                ARD2.E77(str2, z2);
                ARD2.apply();
                this.A00 = null;
            }
            this.A01 = false;
            return;
        }
        if (this.A02) {
            EnumC75383a5 enumC75383a52 = this.A00;
            if (enumC75383a52 != null) {
                switch (enumC75383a52.ordinal()) {
                    case 8:
                        z = true;
                        ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str = "story_promote_with_countdown_sticker_seen_tooltip_on_promote_button";
                        ARD.E77(str, z);
                        ARD.apply();
                        this.A00 = null;
                        break;
                    case Process.SIGTERM /* 15 */:
                        z = true;
                        ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str = "story_promote_with_hashtag_sticker_seen_tooltip_on_promote_button";
                        ARD.E77(str, z);
                        ARD.apply();
                        this.A00 = null;
                        break;
                    case Process.SIGSTOP /* 19 */:
                        z = true;
                        ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str = "story_promote_with_location_sticker_seen_tooltip_on_promote_button";
                        ARD.E77(str, z);
                        ARD.apply();
                        this.A00 = null;
                        break;
                    case 21:
                        z = true;
                        ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button";
                        ARD.E77(str, z);
                        ARD.apply();
                        this.A00 = null;
                        break;
                    case 23:
                        if (A00(userSession, c41181vS)) {
                            z = true;
                            ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                            str = "story_boost_with_mention_sticker_seen_tooltip_on_boost_button";
                            ARD.E77(str, z);
                            ARD.apply();
                        }
                        this.A00 = null;
                        break;
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                        z = true;
                        ARD = AbstractC23021Ah.A00(userSession).A01.ARD();
                        str = "story_promote_with_poll_sticker_seen_tooltip_on_promote_button_v2";
                        ARD.E77(str, z);
                        ARD.apply();
                        this.A00 = null;
                        break;
                    case 30:
                    case 36:
                        C41768Iek c41768Iek = C41768Iek.A00;
                        int i = C41768Iek.A02(userSession, c41768Iek).getInt("tag_products_tooltip_story_product_boost_eligible", 0);
                        ARD = C41768Iek.A02(userSession, c41768Iek).ARD();
                        ARD.E7D("tag_products_tooltip_story_product_boost_eligible", i + 1);
                        ARD.apply();
                        this.A00 = null;
                        break;
                    default:
                        throw new IllegalArgumentException("current sticker type is not eligible for promote");
                }
            }
            this.A02 = false;
        }
    }

    @Override // X.InterfaceC148826mr
    public final boolean Ejo(UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4, InterfaceC143576dw interfaceC143576dw) {
        EnumC75383a5 enumC75383a5;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c41181vS, 1);
        C14360o3.A0B(interfaceC143576dw, 3);
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && c38321qM.A3N().size() == 1) {
            enumC75383a5 = ((C84823qW) c38321qM.A3N().get(0)).A12;
        } else {
            enumC75383a5 = null;
        }
        this.A00 = enumC75383a5;
        if (enumC75383a5 == null) {
            return false;
        }
        this.A01 = A02(userSession, interfaceC143576dw);
        this.A02 = A01(userSession, c41181vS, interfaceC143576dw);
        if (c38321qM == null || !AbstractC138316On.A05(userSession, c38321qM)) {
            return false;
        }
        if ((!A02(userSession, interfaceC143576dw) && !A01(userSession, c41181vS, interfaceC143576dw)) || !BH3.A00(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(UserSession userSession, C41181vS c41181vS) {
        String str;
        C84823qW c84823qW;
        User user;
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null && (c84823qW = (C84823qW) AbstractC001800i.A0J(c38321qM.A3N())) != null && (user = c84823qW.A1C) != null) {
            str = user.getId();
        } else {
            str = null;
        }
        String str2 = userSession.userId;
        if (str != null && !str.equals(str2) && C18U.A06(C06090Tz.A05, userSession, 36320957874316309L)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC148826mr
    public final EnumC58132lV C9M() {
        return EnumC58132lV.A02;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01(com.instagram.common.session.UserSession r4, X.C41181vS r5, X.InterfaceC143576dw r6) {
        /*
            r3 = this;
            android.view.View r0 = r6.C9I()
            if (r0 == 0) goto L11
            X.3a5 r0 = r3.A00
            if (r0 == 0) goto L11
            int r0 = r0.ordinal()
            switch(r0) {
                case 8: goto L3d;
                case 15: goto L34;
                case 19: goto L2b;
                case 21: goto L46;
                case 23: goto L13;
                case 29: goto L22;
                default: goto L11;
            }
        L11:
            r1 = 0
        L12:
            return r1
        L13:
            boolean r0 = A00(r4, r5)
            if (r0 == 0) goto L11
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_boost_with_mention_sticker_seen_tooltip_on_boost_button"
            goto L4e
        L22:
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_promote_with_poll_sticker_seen_tooltip_on_promote_button_v2"
            goto L4e
        L2b:
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_promote_with_location_sticker_seen_tooltip_on_promote_button"
            goto L4e
        L34:
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_promote_with_hashtag_sticker_seen_tooltip_on_promote_button"
            goto L4e
        L3d:
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_promote_with_countdown_sticker_seen_tooltip_on_promote_button"
            goto L4e
        L46:
            X.1Ai r0 = X.AbstractC23021Ah.A00(r4)
            X.0xq r2 = r0.A01
            java.lang.String r1 = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button"
        L4e:
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            r1 = 1
            if (r0 == 0) goto L12
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148986n7.A01(com.instagram.common.session.UserSession, X.1vS, X.6dw):boolean");
    }

    private final boolean A02(UserSession userSession, InterfaceC143576dw interfaceC143576dw) {
        EnumC75383a5 enumC75383a5;
        InterfaceC19630xq interfaceC19630xq;
        String str;
        if (interfaceC143576dw.C9J() != null && interfaceC143576dw.C9I() == null && (enumC75383a5 = this.A00) != null) {
            switch (enumC75383a5.ordinal()) {
                case 8:
                    interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    str = "story_promote_with_countdown_sticker_seen_tooltip_on_promote_button";
                    break;
                case Process.SIGTERM /* 15 */:
                    interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    str = "story_promote_with_hashtag_sticker_seen_tooltip";
                    break;
                case Process.SIGSTOP /* 19 */:
                    interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    str = "story_promote_with_location_sticker_seen_tooltip";
                    break;
                case 21:
                    interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    str = "story_promote_with_feed_media_sticker_seen_tooltip_on_promote_button";
                    break;
                case 23:
                    interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    str = "story_promote_with_mention_sticker_seen_tooltip";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    str = "story_promote_with_poll_sticker_seen_tooltip_v2";
                    break;
            }
            if (!interfaceC19630xq.getBoolean(str, false)) {
                return true;
            }
        }
        return false;
    }
}
