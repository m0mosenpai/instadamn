package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OP0 {
    public static final void A00(MU1 mu1, C82G c82g, UserSession userSession, String str, String str2, List list, boolean z) {
        C14360o3.A0B(list, 6);
        EnumC222416a A0I = AbstractC166997dE.A0Y(userSession).A0I();
        if (A0I == null) {
            A0I = EnumC222416a.A08;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "cxp_ig_client_xpost_interoperability_platform");
        if (str == null) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
        }
        if (A0f.isSampled() && C18U.A06(C06090Tz.A05, userSession, 36328701700357858L)) {
            A0f.AAP(AbstractC50635MWw.A01(), str);
            AbstractC31171DnF.A1B(A0f, "primary_click");
            A0f.A8R(mu1, "surface_name");
            A0f.A8R(c82g, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.A7v("session_xposting_enabled", AbstractC31173DnH.A0e(A0f, "source_account_type", A0I.A01, z));
            A0f.A9M("auto_xposting_settings", AbstractC06930Yk.A0E());
            A0f.AAk("ineligibility_errors", list);
            A0f.Cht();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C82G r7, com.instagram.common.session.UserSession r8, java.lang.Integer r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r0 = 0
            r5 = r8
            java.util.ArrayList r8 = X.AbstractC166997dE.A12(r8, r0)
            if (r9 == 0) goto L64
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            X.MnI r3 = new X.MnI
            r3.<init>()
            X.MnG r2 = new X.MnG
            r2.<init>()
            int r4 = r9.intValue()
            switch(r4) {
                case 0: goto L22;
                case 1: goto L4f;
                case 2: goto L25;
                case 3: goto L4f;
                case 4: goto L4f;
                case 5: goto L4f;
                case 6: goto L28;
                case 7: goto L4f;
                case 8: goto L4f;
                case 9: goto L4f;
                case 10: goto L4f;
                case 11: goto L4f;
                case 12: goto L2b;
                case 13: goto L4f;
                case 14: goto L2e;
                case 15: goto L4f;
                case 16: goto L31;
                case 17: goto L4f;
                case 18: goto L4f;
                case 19: goto L34;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L37;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L3a;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L3d;
                case 33: goto L40;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                default: goto L1d;
            }
        L1d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L22:
            X.NjQ r1 = X.EnumC53375NjQ.ARCHIVE_FEED_STICKER
            goto L42
        L25:
            X.NjQ r1 = X.EnumC53375NjQ.BRANDED_CONTENT
            goto L42
        L28:
            X.NjQ r1 = X.EnumC53375NjQ.COMMENT_SHARE_STICKER
            goto L42
        L2b:
            X.NjQ r1 = X.EnumC53375NjQ.IGTV_STICKER
            goto L42
        L2e:
            X.NjQ r1 = X.EnumC53375NjQ.IMMERSIVE_MENTION_RESHARE
            goto L42
        L31:
            X.NjQ r1 = X.EnumC53375NjQ.MAGIC_MOD
            goto L42
        L34:
            X.NjQ r1 = X.EnumC53375NjQ.MENTION_RESHARE
            goto L42
        L37:
            X.NjQ r1 = X.EnumC53375NjQ.PRODUCT_SHARE
            goto L42
        L3a:
            X.NjQ r1 = X.EnumC53375NjQ.REELS_RESHARE
            goto L42
        L3d:
            X.NjQ r1 = X.EnumC53375NjQ.STORY_TEMPLATE
            goto L42
        L40:
            X.NjQ r1 = X.EnumC53375NjQ.STORY_TEMPLATE_RESHARE_XPOSTING_INELIGIBLE_PINNED_ITEMS
        L42:
            java.lang.String r0 = "reason"
            r2.A01(r1, r0)
            java.lang.String r0 = "contentIneligibilityError"
            r3.A02(r2, r0)
            r8.add(r3)
        L4f:
            X.MnI r3 = new X.MnI
            r3.<init>()
            X.MnH r2 = new X.MnH
            r2.<init>()
            r0 = 7
            if (r4 == r0) goto L6e
            r0 = 35
            if (r4 == r0) goto L6e
            r0 = 36
            if (r4 == r0) goto L6e
        L64:
            X.MU1 r3 = X.MU1.STORY
            r4 = r7
            r6 = r10
            r7 = r11
            r9 = r12
            A00(r3, r4, r5, r6, r7, r8, r9)
            return
        L6e:
            X.Nj1 r1 = X.EnumC53351Nj1.MISSING_DESTINATION
            java.lang.String r0 = "reason"
            r2.A01(r1, r0)
            java.lang.String r0 = "destinationIneligibilityError"
            r3.A02(r2, r0)
            r8.add(r3)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OP0.A01(X.82G, com.instagram.common.session.UserSession, java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }
}
