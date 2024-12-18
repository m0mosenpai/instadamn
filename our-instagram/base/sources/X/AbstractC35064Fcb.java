package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.facebook.R;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.sharetostory.data.MessageShareStickerData;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Fcb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35064Fcb {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r15 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        if (X.AbstractC47874LCu.A00(r34, r7.A0G.A00()) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r2 = r3.A0Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
    
        if (r2 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        r10 = r2.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        r8 = r8.BT7(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r10 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        ((X.C36304Fzz) r34.A01(X.C36304Fzz.class, r12)).A00.put(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0180, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r19 = r16.C7q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r14 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        r2 = r7.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        if (r2 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        r20 = r2.getFullName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        r8 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ab, code lost:
    
        if (r14 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
    
        r2 = r7.A0K;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        r2 = r2.Bhu();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        r7 = r16.C7W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b9, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bb, code lost:
    
        r7 = r7.A0I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        r7 = r7.A0l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r7 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
    
        r15 = X.AbstractC25225BEi.A0t(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        r7 = r1.A02;
        r24 = r37.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (r24 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        r24 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        r30 = X.C160857It.A02(r1, r0, r5);
        r31 = X.C160857It.A06(r1, r0, r5);
        r32 = X.C160857It.A05(r1, r0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        switch(r38.intValue()) {
            case 4: goto L71;
            case 5: goto L70;
            case 6: goto L69;
            default: goto L55;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e4, code lost:
    
        r21 = "BEST_PRACTICES";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r14 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        r13 = com.instagram.api.schemas.IGAIAgentType.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:
    
        if (r33 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
    
        r22 = ((com.instagram.user.model.User) r16.C7W().A0b.get(0)).A03.Aae();
        r4 = r3.A10;
        r3 = (com.instagram.user.model.User) X.AbstractC001800i.A0J(r16.C7W().A0b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010c, code lost:
    
        if (r3 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        r25 = r3.A03.Aac();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
    
        return new com.instagram.direct.sharetostory.data.MessageShareStickerData(r13, r2, r15, r35, r4, r18, r19, r20, r21, r22, r6, r24, r25, r39, X.C160857It.A00(r1, r0, 29), r8, r7, r30, r31, r32, r33, X.AbstractC167007dF.A1X(r36, com.instagram.direct.prompts.DirectPromptTypes.A06));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
    
        r22 = null;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:
    
        if (r33 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0137, code lost:
    
        r13 = ((com.instagram.user.model.User) r16.C7W().A0b.get(0)).A03.Aah();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014a, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        r21 = "SHARE_TO_STORY_LONG_PRESS_ACTION";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
    
        r21 = "SHARE_TO_STORY_SHORTCUT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0157, code lost:
    
        r21 = "SHARE_SHEET";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015a, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0160, code lost:
    
        if (r33 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0162, code lost:
    
        r2 = X.AbstractC31177DnL.A0T(r16.C7W().A0b, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
    
        r2 = r1.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0176, code lost:
    
        r20 = r16.C7l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        if (r20 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017c, code lost:
    
        r20 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0070, code lost:
    
        if (r10 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.direct.sharetostory.data.MessageShareStickerData A00(com.instagram.common.session.UserSession r34, com.instagram.direct.capabilities.Capabilities r35, com.instagram.direct.prompts.DirectPromptTypes r36, com.instagram.model.direct.messageid.MessageIdentifier r37, java.lang.Integer r38, java.lang.String r39, X.InterfaceC08830cm r40) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35064Fcb.A00(com.instagram.common.session.UserSession, com.instagram.direct.capabilities.Capabilities, com.instagram.direct.prompts.DirectPromptTypes, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Integer, java.lang.String, X.0cm):com.instagram.direct.sharetostory.data.MessageShareStickerData");
    }

    public static final MessageShareStickerData A01(UserSession userSession, Capabilities capabilities, MessageIdentifier messageIdentifier, Integer num, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(userSession, 0);
        return A00(userSession, capabilities, DirectPromptTypes.A0A, messageIdentifier, num, null, interfaceC08830cm);
    }

    public static final void A02(final Activity activity, UserSession userSession, MessageShareStickerData messageShareStickerData, C6WQ c6wq) {
        InterfaceC14020nS A00;
        AbstractRunnableC14200nk c217329jR;
        int color;
        int i;
        C14360o3.A0B(userSession, 0);
        if (c6wq != null) {
            C0fJ.A00(c6wq);
        }
        final G0H g0h = new G0H(0, messageShareStickerData, activity, c6wq, userSession);
        IGAIAgentType iGAIAgentType = messageShareStickerData.A02;
        if (iGAIAgentType != IGAIAgentType.A05 && iGAIAgentType != IGAIAgentType.A08) {
            String A01 = C50472Tr.A01();
            boolean z = messageShareStickerData.A0I;
            if (z) {
                color = AbstractC167007dF.A09(activity, R.attr.igds_color_prompts_share_to_story_background_10);
            } else {
                color = activity.getColor(R.color.grey_0);
            }
            if (z) {
                i = AbstractC53242c7.A0H(activity, R.attr.igds_color_prompts_share_to_story_background_11);
            } else {
                i = R.color.grey_0;
            }
            AbstractC70197WGf.A06(activity, g0h, A01, 0.0f, color, activity.getColor(i), true);
            return;
        }
        final ImageUrl imageUrl = messageShareStickerData.A03;
        if (imageUrl != null && C18U.A06(C06090Tz.A05, userSession, 36326979419650273L)) {
            final String A012 = C50472Tr.A01();
            A00 = C14120nc.A00();
            c217329jR = new AbstractRunnableC14200nk() { // from class: X.9jJ
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(69, 2, false, true);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap A09;
                    Bitmap A0H = C25821No.A00().A0H(imageUrl, null);
                    DisplayMetrics A0K = AbstractC167007dF.A0K(activity);
                    int i2 = A0K.widthPixels / 4;
                    int i3 = A0K.heightPixels / 4;
                    if (A0H != null && (A09 = C1NC.A09(A0H, i2, i3, 0, false)) != null) {
                        AbstractC70197WGf.A08(A09, g0h, AbstractC70197WGf.A03(A012));
                    } else {
                        g0h.onFailure(new Exception("Error in loading image from URL"));
                    }
                }
            };
        } else {
            ImageUrl imageUrl2 = messageShareStickerData.A04;
            if (imageUrl2 == null) {
                return;
            }
            String A013 = C50472Tr.A01();
            int color2 = activity.getColor(R.color.grey_0);
            int A09 = AbstractC167007dF.A09(activity, R.attr.igds_color_media_background);
            DisplayMetrics A0K = AbstractC167007dF.A0K(activity);
            C14360o3.A07(A0K);
            A00 = C14120nc.A00();
            c217329jR = new C217329jR(A0K, imageUrl2, g0h, A013, 25, color2, A09);
        }
        A00.ATO(c217329jR);
    }
}
