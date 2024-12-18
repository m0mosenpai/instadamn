package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MZx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50702MZx {
    public static final C50702MZx A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A00(X.C47Z r4) {
        /*
            r3 = 0
            boolean r0 = r4.A0t()
            if (r0 != 0) goto L55
            boolean r0 = r4.A10()
            if (r0 == 0) goto L3f
            X.MZx r0 = X.C50702MZx.A00
            java.util.List r2 = r4.A4m
        L11:
            java.util.HashSet r0 = r0.A07(r2)
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L5c
            java.lang.Object r1 = r2.get(r3)
            X.47Z r1 = (X.C47Z) r1
            boolean r0 = r1.A0t()
            if (r0 == 0) goto L32
            java.util.List r0 = r1.A0K()
            java.lang.Object r1 = r0.get(r3)
            X.47Z r1 = (X.C47Z) r1
        L32:
            boolean r0 = r1.A0z()
            if (r0 != 0) goto L52
            X.1tc r0 = r1.A1G
        L3a:
            java.lang.Integer r0 = X.AbstractC50705Ma0.A00(r0)
            return r0
        L3f:
            boolean r0 = r4.A5w
            if (r0 != 0) goto L55
            X.1tc r1 = r4.A1G
            X.1tc r0 = X.EnumC40111tc.A0A
            if (r1 == r0) goto L55
            boolean r0 = r4.A0z()
            if (r0 != 0) goto L52
            X.1tc r0 = r4.A1G
            goto L3a
        L52:
            X.1tc r0 = X.EnumC40111tc.A0a
            goto L3a
        L55:
            X.MZx r0 = X.C50702MZx.A00
            java.util.List r2 = r4.A0K()
            goto L11
        L5c:
            java.lang.Integer r0 = X.C05F.A0N
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50702MZx.A00(X.47Z):java.lang.Integer");
    }

    public static final String A01(UserSession userSession, C47Z c47z) {
        Integer num;
        if (AbstractC14490oL.A09(AbstractC12290kX.A00)) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36328671635717848L);
            boolean A0t = c47z.A0t();
            if (A06) {
                if (A0t || c47z.A3O != null) {
                    return "multimedia";
                }
            } else if (A0t && c47z.A0K().size() > 1) {
                return "multimedia";
            }
            if (c47z.A3X != null) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            AbstractC210049Qs abstractC210049Qs = AbstractC210049Qs.$redex_init_class;
            if (num.intValue() != 0) {
                return "reply_post";
            }
            return "feed_post";
        }
        C22P c22p = c47z.A0i;
        if (c22p != C22P.A2c && c22p != C22P.A2d && c22p != C22P.A5E && c22p != C22P.A5F && c22p != C22P.A5I) {
            ShareType A0D = c47z.A0D();
            AbstractC210049Qs abstractC210049Qs2 = AbstractC210049Qs.$redex_init_class;
            switch (A0D.ordinal()) {
                case 0:
                case 8:
                case 30:
                    if (C18U.A06(C06090Tz.A05, userSession, 36320579917849273L)) {
                        return "feed";
                    }
                    return "unified_video";
                case 1:
                case 26:
                    if (c47z.A5D) {
                        return "direct_permanent_instamadillo";
                    }
                    return "direct_permanent";
                case 2:
                case 4:
                case 16:
                case 25:
                    return "story_or_direct_ephemeral";
                case 3:
                case Process.SIGTERM /* 15 */:
                    if (c47z.A5D) {
                        return "direct_ephemeral_instamadillo";
                    }
                    return "direct_ephemeral";
                case 5:
                case 6:
                    return "nametag_selfie";
                case 7:
                case 17:
                case 31:
                case 32:
                    return "invalid";
                case 9:
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                case 21:
                case 28:
                    return "clips";
                case 10:
                    return "post_live_igtv";
                case 11:
                    return "igtv_post_live_to_cover_photo";
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    return "media_kit";
                case 14:
                    return "story_interaction_response";
                case 18:
                case Process.SIGSTOP /* 19 */:
                    return "story_template_asset";
                case 20:
                    return "reusable_template_assets";
                case 22:
                case 23:
                case 24:
                    return "notes";
                case 27:
                    return "wonder_wall";
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    return "quick_snap";
                default:
                    throw B4Z.A00();
            }
        }
        return "third_party_app";
    }

    public static final String A05(Throwable th) {
        String message;
        C117315Sq A06;
        String str = null;
        if (((th instanceof FileNotFoundException) || (th instanceof C53411Nk0)) && (message = th.getMessage()) != null && (A06 = new C11L("(/\\S+)+").A06(message, 0)) != null) {
            String group = A06.A01.group();
            C14360o3.A07(group);
            str = new C11L("[0-9]+|_|-").A00(group, "");
            int A05 = AbstractC001900j.A05(str, '/', str.length() - 1);
            if (A05 > 0 && AbstractC001900j.A08(str, ".", A05, false) > 0) {
                return AbstractC25227BEk.A0w(str, 0, A05);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A06(com.instagram.common.session.UserSession r9, X.C47Z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50702MZx.A06(com.instagram.common.session.UserSession, X.47Z, boolean):java.util.ArrayList");
    }

    public final String A09(UserSession userSession, C47Z c47z) {
        ArrayList A06 = A06(userSession, c47z, false);
        if (A06 != null) {
            return AbstractC25226BEj.A1H(", ", A06, C57661PiC.A00);
        }
        return null;
    }

    public final synchronized boolean A0A(UserSession userSession, C47Z c47z, int i) {
        boolean z;
        String A01 = A01(userSession, c47z);
        String A02 = A02(userSession, c47z, i);
        if (C14360o3.A0K(A01, "story_or_direct_ephemeral")) {
            if (!C14360o3.A0K(A02, "direct_ephemeral_instamadillo") && !C14360o3.A0K(A02, "direct_ephemeral")) {
                if (C14360o3.A0K(A02, "story")) {
                }
            }
            z = true;
        }
        z = false;
        return z;
    }

    public static final String A02(UserSession userSession, C47Z c47z, int i) {
        ShareType shareType;
        C915547l c915547l = c47z.A1T;
        synchronized (c915547l) {
            shareType = (ShareType) c915547l.A0B.get(String.valueOf(i));
        }
        String A03 = A03(userSession, c47z, shareType, true);
        if (A03 == null) {
            return "invalid";
        }
        return A03;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x002f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(com.instagram.common.session.UserSession r4, X.C47Z r5, com.instagram.pendingmedia.model.constants.ShareType r6, boolean r7) {
        /*
            android.content.Context r0 = X.AbstractC12290kX.A00
            boolean r0 = X.AbstractC14490oL.A09(r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = r5.A3X
            if (r0 == 0) goto L1a
            java.lang.Integer r1 = X.C05F.A01
        Le:
            X.9Qs r0 = X.AbstractC210049Qs.$redex_init_class
            int r1 = r1.intValue()
            r0 = 0
            if (r1 == r0) goto L50
            java.lang.String r3 = "reply_post"
        L19:
            return r3
        L1a:
            java.lang.Integer r1 = X.C05F.A00
            goto Le
        L1d:
            if (r6 != 0) goto L23
            com.instagram.pendingmedia.model.constants.ShareType r6 = r5.A0D()
        L23:
            X.9Qs r0 = X.AbstractC210049Qs.$redex_init_class
            int r0 = r6.ordinal()
            java.lang.String r3 = "direct_ephemeral_instamadillo"
            java.lang.String r2 = "direct_ephemeral"
            java.lang.String r1 = "story"
            switch(r0) {
                case 0: goto L56;
                case 1: goto L76;
                case 2: goto L9e;
                case 3: goto L4b;
                case 4: goto L37;
                case 5: goto L80;
                case 6: goto L80;
                case 7: goto L53;
                case 8: goto L56;
                case 9: goto L89;
                case 10: goto L56;
                case 11: goto L83;
                case 12: goto L89;
                case 13: goto L98;
                case 14: goto L8c;
                case 15: goto L4b;
                case 16: goto L9e;
                case 17: goto L53;
                case 18: goto L92;
                case 19: goto L92;
                case 20: goto L86;
                case 21: goto L89;
                case 22: goto L8f;
                case 23: goto L8f;
                case 24: goto L8f;
                case 25: goto L9e;
                case 26: goto L76;
                case 27: goto L95;
                case 28: goto L89;
                case 29: goto L9b;
                case 30: goto L56;
                case 31: goto L53;
                case 32: goto L53;
                default: goto L32;
            }
        L32:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L37:
            if (r7 == 0) goto L9f
            java.util.EnumSet r0 = com.instagram.pendingmedia.model.constants.ShareType.A02
            boolean r0 = r5.A14(r0)
            if (r0 != 0) goto L9e
            java.util.List r0 = r5.A4c
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 != 0) goto L4b
            r3 = 0
            return r3
        L4b:
            boolean r0 = r5.A5D
            if (r0 != 0) goto L19
            return r2
        L50:
            java.lang.String r3 = "feed_post"
            return r3
        L53:
            java.lang.String r3 = "invalid"
            return r3
        L56:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320579917849273(0x810960000a22b9, double:3.032619219059713E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L73
            boolean r0 = r5.A0t()
            if (r0 != 0) goto L70
            java.lang.String r0 = r5.A3O
            if (r0 != 0) goto L70
            java.lang.String r3 = "feed"
            return r3
        L70:
            java.lang.String r3 = "multipost"
            return r3
        L73:
            java.lang.String r3 = "unified_video"
            return r3
        L76:
            boolean r0 = r5.A5D
            if (r0 == 0) goto L7d
            java.lang.String r3 = "direct_permanent_instamadillo"
            return r3
        L7d:
            java.lang.String r3 = "direct_permanent"
            return r3
        L80:
            java.lang.String r3 = "nametag_selfie"
            return r3
        L83:
            java.lang.String r3 = "igtv_post_live_to_cover_photo"
            return r3
        L86:
            java.lang.String r3 = "reusable_template_assets"
            return r3
        L89:
            java.lang.String r3 = "clips"
            return r3
        L8c:
            java.lang.String r3 = "story_interaction_response"
            return r3
        L8f:
            java.lang.String r3 = "notes"
            return r3
        L92:
            java.lang.String r3 = "story_template_asset"
            return r3
        L95:
            java.lang.String r3 = "wonder_wall"
            return r3
        L98:
            java.lang.String r3 = "media_kit"
            return r3
        L9b:
            java.lang.String r3 = "quick_snap"
            return r3
        L9e:
            return r1
        L9f:
            java.lang.String r3 = "story_or_direct_ephemeral"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50702MZx.A03(com.instagram.common.session.UserSession, X.47Z, com.instagram.pendingmedia.model.constants.ShareType, boolean):java.lang.String");
    }

    public static final boolean A08(MusicOverlayStickerModel musicOverlayStickerModel) {
        if (musicOverlayStickerModel != null) {
            if (musicOverlayStickerModel.A0S != null || musicOverlayStickerModel.A0T != null || musicOverlayStickerModel.A0m != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final String A04(C47Z c47z) {
        AbstractC1125056d A09 = c47z.A09();
        if (A09 instanceof NRI) {
            return "segmented";
        }
        if (A09 instanceof C1124956c) {
            return "sequential";
        }
        C0w9.A03("unknown_ingestion_strategy_configuration", AbstractC167017dG.A0n(A09, "configuration: ", AbstractC166987dD.A1C()));
        return "unknown";
    }

    private final HashSet A07(List list) {
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C47Z A0l = AbstractC43592JPx.A0l(it);
            if (A0l.A0t()) {
                A1H.addAll(A07(A0l.A0K()));
            } else {
                A1H.add(A0l.A1G);
            }
        }
        return A1H;
    }
}
