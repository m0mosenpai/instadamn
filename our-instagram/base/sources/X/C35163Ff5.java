package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Ff5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35163Ff5 {
    public static final ArrayList A04;
    public static final ArrayList A06;
    public final UserSession A00;
    public final ArrayList A01;
    public final Context A02;
    public final User A03;
    public static final ArrayList A0C = AbstractC16960so.A1M("add_to_your_story", "system_share_sheet", "copy_link", "user_sms", "messenger", "whatsapp", "snapchat", "facebook", "twitter");
    public static final ArrayList A05 = AbstractC16960so.A1M("add_to_your_story", "copy_link", "system_share_sheet", "clips_download", "save", "add_content_note", "add_to_wall");
    public static final ArrayList A08 = AbstractC16960so.A1M("copy_link", "system_share_sheet", "user_sms", "snapchat", "whatsapp", "messenger");
    public static final ArrayList A07 = AbstractC16960so.A1M("system_share_sheet", "direct_sharesheet", "copy_link", "profile_card_download", "whatsapp", "user_sms", "invite", "snapchat", "barcelona", "messenger", "facebook", "twitter");
    public static final ArrayList A0A = AbstractC16960so.A1M("follow", "direct_message", "view_profile", "direct_sharesheet");
    public static final ArrayList A0B = AbstractC16960so.A1M("add_to_your_story", "copy_link", "system_share_sheet", "messenger", "facebook", "whatsapp");
    public static final ArrayList A0D = AbstractC16960so.A1M(AbstractC166987dD.A1L("snapchat", "com.snapchat.android"), AbstractC166987dD.A1L("twitter", "com.twitter.android"), AbstractC166987dD.A1L("line", "jp.naver.line.android"), AbstractC166987dD.A1L("kakaotalk", "com.kakao.talk"), AbstractC166987dD.A1L("discord", "com.discord"), AbstractC166987dD.A1L("band", "com.nhn.android.band"), AbstractC166987dD.A1L("vk", "com.vkontakte.android"));
    public static final ArrayList A09 = AbstractC16960so.A1M(AbstractC166987dD.A1L("snapchat", "com.snapchat.android"), AbstractC166987dD.A1L("twitter", "com.twitter.android"), AbstractC166987dD.A1L("line", "jp.naver.line.android"), AbstractC166987dD.A1L("kakaotalk", "com.kakao.talk"), AbstractC166987dD.A1L("discord", "com.discord"), AbstractC166987dD.A1L("band", "com.nhn.android.band"), AbstractC166987dD.A1L("vk", "com.vkontakte.android"), AbstractC166987dD.A1L("facebook", "com.facebook.katana"), AbstractC166987dD.A1L("messenger", "com.facebook.orca"));

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        if (r4.equals("US") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00de, code lost:
    
        r0 = new java.lang.String[]{"snapchat", "user_sms", "messenger", "whatsapp", "facebook", "twitter"};
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00dc, code lost:
    
        if (r4.equals("CA") != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C35163Ff5(com.instagram.common.session.UserSession r21, android.content.Context r22) {
        /*
            r20 = this;
            r0 = 1
            r1 = r21
            X.C14360o3.A0B(r1, r0)
            r3 = r20
            r3.<init>()
            r0 = r22
            r3.A02 = r0
            r3.A00 = r1
            com.instagram.user.model.User r0 = X.AbstractC166997dE.A0Y(r1)
            r3.A03 = r0
            X.17P r0 = r0.A03
            java.lang.String r4 = r0.BEI()
            if (r4 != 0) goto L21
            java.lang.String r4 = ""
        L21:
            java.util.ArrayList r0 = X.C35163Ff5.A04
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L38
            java.util.ArrayList r0 = X.C35163Ff5.A06
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L38
            java.util.ArrayList r1 = r3.A00()
        L35:
            r3.A01 = r1
            return
        L38:
            java.lang.String r7 = "add_content_note"
            r2 = 0
            java.lang.String r6 = "add_to_your_story"
            java.lang.String r5 = "copy_link"
            java.lang.String r1 = "system_share_sheet"
            java.lang.String r0 = "clips_download"
            java.lang.String[] r0 = new java.lang.String[]{r7, r6, r5, r1, r0}
            java.util.ArrayList r1 = X.AbstractC16960so.A1M(r0)
            int r5 = r4.hashCode()
            r0 = 2142(0x85e, float:3.002E-42)
            java.lang.String r6 = "snapchat"
            java.lang.String r12 = "twitter"
            java.lang.String r11 = "facebook"
            java.lang.String r10 = "messenger"
            java.lang.String r9 = "user_sms"
            java.lang.String r7 = "whatsapp"
            if (r5 == r0) goto Ld6
            r0 = 2374(0x946, float:3.327E-42)
            if (r5 == r0) goto Lbf
            r0 = 2407(0x967, float:3.373E-42)
            if (r5 == r0) goto La5
            r0 = 2718(0xa9e, float:3.809E-42)
            if (r5 != r0) goto L73
            java.lang.String r0 = "US"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lde
        L73:
            java.lang.String r8 = "discord"
            java.lang.String[] r0 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
        L79:
            java.util.ArrayList r0 = X.AbstractC16960so.A1M(r0)
            r1.addAll(r0)
            com.instagram.common.session.UserSession r6 = r3.A00
            X.0Tz r0 = X.C06090Tz.A05
            r4 = 36320768895755130(0x81098c0000237a, double:3.03273872944833E-306)
            boolean r0 = X.C18U.A06(r0, r6, r4)
            if (r0 == 0) goto L94
            java.lang.String r0 = "barcelona"
            r1.add(r0)
        L94:
            boolean r0 = X.C4AC.A0C(r6)
            if (r0 == 0) goto L9f
            java.lang.String r0 = "add_to_audio_note"
            r1.add(r2, r0)
        L9f:
            java.lang.String r0 = "add_to_wall"
            r1.add(r0)
            goto L35
        La5:
            java.lang.String r0 = "KR"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L73
            java.lang.String r13 = "kakaotalk"
            java.lang.String r15 = "band"
            r14 = r12
            r16 = r9
            r17 = r7
            r18 = r11
            r19 = r10
            java.lang.String[] r0 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19}
            goto L79
        Lbf:
            java.lang.String r0 = "JP"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L73
            java.lang.String r13 = "line"
            r14 = r12
            r15 = r9
            r16 = r11
            r17 = r10
            r18 = r7
            java.lang.String[] r0 = new java.lang.String[]{r13, r14, r15, r16, r17, r18}
            goto L79
        Ld6:
            java.lang.String r0 = "CA"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L73
        Lde:
            r4 = r6
            r5 = r9
            r6 = r10
            r8 = r11
            r9 = r12
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35163Ff5.<init>(com.instagram.common.session.UserSession, android.content.Context):void");
    }

    public final void A02(String str) {
        double d;
        C14360o3.A0B(str, 0);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        HashMap A02 = C23031Ai.A02(A00, "external_sharing_share_option_usage_count_map");
        Number A0W = AbstractC31171DnF.A0W(str, A02);
        if (A0W != null) {
            d = A0W.doubleValue();
        } else {
            d = 0.0d;
        }
        AbstractC166997dE.A1T(str, A02, d + 1.0d);
        C23031Ai.A05(A00, "external_sharing_share_option_usage_count_map", A02);
        HashMap A022 = C23031Ai.A02(A00, "external_sharing_share_option_timestamp_map");
        AbstractC166997dE.A1T(str, A022, AbstractC31171DnF.A01());
        C23031Ai.A05(A00, "external_sharing_share_option_timestamp_map", A022);
    }

    static {
        String[] strArr = new String[32];
        System.arraycopy(new String[]{"SM", "PM", "SJ", "VA", "AX"}, AbstractC31175DnJ.A1b(new String[]{"FR", "GB", "IT", "DE", "ES", "NL", "BE", "PT", "SE", "CH", "AT", "DK", "FI", "NO", "IE", "LU", "MT", "IS", "AD", "JE", "IM", "FO", "GG", "GI", "GL", "MC", "LI"}, strArr) ? 1 : 0, strArr, 27, 5);
        A04 = AbstractC16960so.A1M(strArr);
        A06 = AbstractC16960so.A1M("US", "CA", "JP", "KR", "AU");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d8 A[LOOP:2: B:50:0x01d2->B:52:0x01d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.ArrayList A00() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35163Ff5.A00():java.util.ArrayList");
    }

    public final ArrayList A01(C2EY c2ey, boolean z) {
        if (c2ey == C2EY.A17) {
            return A08;
        }
        if (c2ey == C2EY.A1R) {
            if (z) {
                return A0A;
            }
        } else if (c2ey != C2EY.A1T) {
            if (c2ey == C2EY.A0W || c2ey == C2EY.A1F || c2ey == C2EY.A1g) {
                UserSession userSession = this.A00;
                if (C18U.A06(C06090Tz.A05, userSession, 36314837548993375L)) {
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    GRJ grj = new GRJ(1, C23031Ai.A02(A00, "external_sharing_share_option_usage_count_map"), C23031Ai.A02(A00, "external_sharing_share_option_timestamp_map"));
                    ArrayList A1E = AbstractC166987dD.A1E();
                    A1E.addAll(this.A01);
                    C01T.A1D(A1E, grj);
                    return A1E;
                }
            }
            if (c2ey == C2EY.A0H) {
                return A0B;
            }
            if (c2ey == C2EY.A12) {
                return AbstractC16960so.A1M("add_to_your_story");
            }
            return A00();
        }
        ArrayList arrayList = A07;
        if (arrayList.contains("add_to_your_story")) {
            arrayList.remove("add_to_your_story");
        }
        UserSession userSession2 = this.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36327335902001678L)) {
            arrayList.add("add_to_your_story");
        } else {
            arrayList.add(4, "add_to_your_story");
        }
        if (C18U.A06(c06090Tz, userSession2, 36327335902067215L)) {
            return arrayList;
        }
        arrayList.remove("invite");
        return arrayList;
    }
}
