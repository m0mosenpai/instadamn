package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;

/* renamed from: X.GhW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37637GhW {
    public int A00 = 3;
    public final FragmentActivity A01;
    public final ClipsViewerConfig A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final InterfaceC60442pS A05;
    public final C75113Zb A06;
    public final SPM A07;
    public final boolean A08;
    public final C37635GhU A09;

    public C37637GhW(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, SPM spm) {
        this.A01 = fragmentActivity;
        this.A02 = clipsViewerConfig;
        this.A04 = c38321qM;
        this.A06 = c75113Zb;
        this.A03 = userSession;
        this.A05 = interfaceC60442pS;
        this.A07 = spm;
        this.A09 = new C37635GhU(userSession);
        ClipsWatchAndBrowseData clipsWatchAndBrowseData = clipsViewerConfig.A0K;
        this.A08 = clipsWatchAndBrowseData != null && clipsWatchAndBrowseData.A0K;
    }

    public static final void A00(C37637GhW c37637GhW, String str) {
        C38321qM c38321qM = c37637GhW.A04;
        if (c38321qM != null) {
            C37635GhU.A00(c37637GhW.A03, c38321qM, c37637GhW.A05, AbstractC111324zv.A00(1321), str);
        }
        SPM spm = c37637GhW.A07;
        if (spm != null) {
            spm.A02("secondary_cta", "dismiss", "external_swipe");
        }
    }
}
