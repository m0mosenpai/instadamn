package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class GR8 implements Runnable {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C7KE A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ C3G2 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public GR8(RectF rectF, InterfaceC11380iw interfaceC11380iw, C7KE c7ke, Reel reel, C3G2 c3g2, String str, String str2, String str3, List list) {
        this.A02 = c7ke;
        this.A03 = reel;
        this.A07 = str;
        this.A00 = rectF;
        this.A06 = str2;
        this.A05 = str3;
        this.A01 = interfaceC11380iw;
        this.A08 = list;
        this.A04 = c3g2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserSession userSession;
        boolean z;
        C7KE c7ke = this.A02;
        Reel reel = this.A03;
        String str = this.A07;
        RectF rectF = this.A00;
        String str2 = this.A06;
        String str3 = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        List list = this.A08;
        C3G2 c3g2 = this.A04;
        if (c7ke.A07.isResumed()) {
            if (list.isEmpty()) {
                list = AbstractC166987dD.A1J(reel);
            }
            int i = 0;
            while (true) {
                userSession = c7ke.A06;
                if (i < reel.A0O(userSession).size()) {
                    C38321qM c38321qM = ((C41181vS) reel.A0O(userSession).get(i)).A0b;
                    if (c38321qM == null) {
                        C0w9.A03("launchResharedReelFromDirect", "Media inside reel is null");
                    } else if (C14360o3.A0K(c38321qM.getId(), str) || C14360o3.A0K(c38321qM.A2u(), str)) {
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    i = 0;
                    break;
                }
            }
            z = true;
            C3M4 A06 = C1OU.A06(c7ke.A04, userSession);
            ReelViewerConfig reelViewerConfig = c7ke.A00;
            if (reelViewerConfig != null) {
                A06.A0F = reelViewerConfig;
            }
            if (c7ke.A01 == null) {
                C14360o3.A0B(userSession, 0);
                c7ke.A01 = new C143536ds(userSession);
            }
            if (!z) {
                C1ZX A01 = C1ZV.A00(userSession).A01(C05F.A00, C05F.A0F, false);
                String id = reel.getId();
                C14360o3.A07(id);
                A01.A03("reel_id", id);
                A01.A03("media_id", str);
                A01.A00();
            }
            A06.A0W(null, rectF, interfaceC11380iw, reel, c3g2, new GF1(rectF, c7ke, reel, c3g2, A06, str2, str3, list, i), null, null, Collections.emptySet(), 0.0f, i, false);
        }
    }
}
