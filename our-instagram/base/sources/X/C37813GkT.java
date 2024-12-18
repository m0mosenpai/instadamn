package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GkT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37813GkT implements InterfaceC13000lm {
    public static final int A08 = (int) TimeUnit.MINUTES.toMillis(60);
    public final MusicPageTabType A00;
    public final UserSession A01;
    public final InterfaceC19630xq A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06 = Collections.synchronizedMap(AbstractC166987dD.A1G());
    public final C1P3 A07;

    public final void A01(C3x9 c3x9, UserSession userSession, String str, String str2) {
        InterfaceC88553xD A01;
        AbstractC167017dG.A1R(userSession, str2);
        if (c3x9 != null && (A01 = AbstractC117245Sj.A01(c3x9)) != null) {
            AudioPageAssetModel audioPageAssetModel = new AudioPageAssetModel(A01.Ae7(), A01.getAssetId(), c3x9.C2z(), c3x9.getMusicCanonicalId(), null);
            if (str.equals("on_touch_down")) {
                A00(audioPageAssetModel, userSession, this, str, str2);
            } else {
                C14120nc.A00().ATO(new C37901Gly(audioPageAssetModel, userSession, this, str, str2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        if (X.AbstractC40774I5c.A00(r8, X.AbstractC23021Ah.A00(r8)) != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.clips.audio.model.AudioPageAssetModel r17, com.instagram.common.session.UserSession r18, X.C37813GkT r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37813GkT.A00(com.instagram.clips.audio.model.AudioPageAssetModel, com.instagram.common.session.UserSession, X.GkT, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A06.clear();
        this.A05.clear();
        this.A03.clear();
        InterfaceC19610xo ARD = this.A02.ARD();
        ARD.AHW();
        ARD.apply();
    }

    public C37813GkT(MusicPageTabType musicPageTabType, UserSession userSession) {
        this.A00 = musicPageTabType;
        HashMap A1G = AbstractC166987dD.A1G();
        this.A04 = A1G;
        this.A05 = Collections.synchronizedMap(AbstractC166987dD.A1G());
        this.A03 = Collections.synchronizedMap(AbstractC166987dD.A1G());
        this.A01 = userSession;
        this.A02 = C1AT.A01(userSession).A03(C1AV.A0g);
        this.A07 = C1P2.A00(userSession);
        A1G.put("like_reels", 30);
        A1G.put("save_reels", 50);
        A1G.put("open_profile_page", 30);
        A1G.put("open_share_sheet", 30);
        A1G.put("open_comments", 15);
        A1G.put("follow_creator", 15);
        A1G.put("loop_playback_25_percent", 4);
        A1G.put("on_touch_down", 1073741823);
    }
}
