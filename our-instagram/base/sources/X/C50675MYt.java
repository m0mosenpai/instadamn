package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.MYt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50675MYt {
    public static String A00 = "";
    public static Map A01;
    public static final C50675MYt A02 = new Object();
    public static final List A03 = AbstractC16960so.A1Q("music/clips_audio_browser/", "music/playlist/5003688406377283/", "music/stories_audio_browser/", "music/music_in_feed_audio_browser/", "music/trending/");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x029d, code lost:
    
        if (r1.equals(r0) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a9, code lost:
    
        r0 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02a7, code lost:
    
        if (r1.equals("server_loaded") != false) goto L169;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d1 A[Catch: IOException -> 0x0345, TryCatch #0 {IOException -> 0x0345, blocks: (B:104:0x02bb, B:105:0x02cb, B:107:0x02d1, B:108:0x02e5, B:110:0x02eb, B:114:0x0302, B:115:0x0328, B:119:0x0335), top: B:103:0x02bb }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1ON A02(com.instagram.api.schemas.MusicProduct r21, com.instagram.common.session.UserSession r22, X.InterfaceC25601Mq r23, com.instagram.music.common.model.MusicBrowseCategory r24, java.lang.Integer r25, java.lang.Long r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.Map r30) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50675MYt.A02(com.instagram.api.schemas.MusicProduct, com.instagram.common.session.UserSession, X.1Mq, com.instagram.music.common.model.MusicBrowseCategory, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.Map):X.1ON");
    }

    public static final C25621Ms A00(MusicProduct musicProduct, UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("music/search_v2/");
        String A002 = AbstractC65993Txo.A00(musicProduct);
        if (A002 == null) {
            A002 = "";
        }
        MSX.A1J(A0c, A002, str3);
        A0c.A9s("q", str);
        A0c.A9s("search_session_id", str4);
        A0c.A0I("from_typeahead", z);
        A0c.A0I("from_search", z2);
        AbstractC37302Gc3.A1M(A0c, userSession, C38074Gp3.class);
        if (str2 == null) {
            str2 = "";
        }
        A0c.A0A = AnonymousClass001.A0g("music/search_v2/", str, str2);
        A0c.A04();
        return A0c;
    }

    public static final C1ON A01(MusicProduct musicProduct, UserSession userSession, Integer num, String str, String str2, int i) {
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("music/keyword_search/");
        String A002 = AbstractC65993Txo.A00(musicProduct);
        if (A002 == null) {
            A002 = "";
        }
        MSX.A1J(A0M, A002, str2);
        A0M.A9s("q", str);
        A0M.A9s("search_session_id", "");
        A0M.A9s("num_keywords", String.valueOf(i));
        A0M.A0R(C52096N2w.class, OPU.class);
        String A0R = AnonymousClass001.A0R("music/keyword_search/", str);
        A0M.A07 = num;
        A0M.A0A = A0R;
        ((AbstractC23721Ec) A0M).A01 = 86400000L;
        if (C05F.A0Y == num) {
            ((AbstractC23721Ec) A0M).A00 = 1500L;
        }
        return A0M.A0N();
    }
}
