package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.BPx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C25509BPx extends C03E implements InterfaceC16610sE {
    public C25509BPx(Object obj) {
        super(3, obj, BKD.class, "launchAudioPage", "launchAudioPage(Lcom/instagram/clips/model/ClipsItem;Lcom/instagram/clips/intf/ClipsViewerConfig;Lcom/facebook/analytics/structuredlogger/enums/InstagramPivotPageEntryPoint;)Z", 0);
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        InterfaceC84063oq Adx;
        C120985dq c120985dq = (C120985dq) obj;
        ClipsViewerConfig clipsViewerConfig = (ClipsViewerConfig) obj2;
        C8JW c8jw = (C8JW) obj3;
        AbstractC167027dH.A12(c120985dq, clipsViewerConfig, c8jw);
        BKD bkd = (BKD) this.receiver;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && AbstractC25231BEo.A1a(c38321qM, bkd.A04)) {
            C37671Gi4.A00(bkd.A03, C05F.A01);
            bkd.A02.A02();
            boolean z2 = !AbstractC25231BEo.A1a(c120985dq, bkd.A05);
            FragmentActivity fragmentActivity = bkd.A00;
            UserSession userSession = bkd.A01;
            String A0j = AbstractC167017dG.A0j();
            String str2 = clipsViewerConfig.A17;
            if (str2 == null) {
                str2 = c120985dq.A0D();
            }
            String str3 = clipsViewerConfig.A18;
            if (str3 == null) {
                str3 = c120985dq.A0Q;
            }
            String str4 = c120985dq.A0Q;
            C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
            if (A0u != null && (Adx = A0u.Adx()) != null) {
                str = Adx.getBestAudioClusterId();
            } else {
                str = null;
            }
            AbstractC37834Gko.A00(fragmentActivity, c8jw, c120985dq, userSession, c38321qM, A0j, str2, str3, str4, str, AbstractC167017dG.A0j(), z2);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
