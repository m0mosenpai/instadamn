package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.ReelViewerConfig;

/* renamed from: X.6hy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146016hy {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final InterfaceC60442pS A02;
    public final C145826hf A03;
    public final InterfaceC1118853a A04;
    public final InterfaceC144586fe A05;
    public final C145986hv A06;
    public final C145996hw A07;
    public final ReelViewerConfig A08;
    public final C145906hn A09;

    public C146016hy(UserSession userSession, InterfaceC60442pS interfaceC60442pS, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe, C145906hn c145906hn, C145986hv c145986hv, C145996hw c145996hw, String str) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(c145826hf, 3);
        C14360o3.A0B(c145986hv, 4);
        C14360o3.A0B(c145906hn, 5);
        C14360o3.A0B(reelViewerConfig, 7);
        C14360o3.A0B(c3g2, 8);
        C14360o3.A0B(interfaceC144586fe, 9);
        C14360o3.A0B(c145996hw, 10);
        C14360o3.A0B(userSession, 11);
        this.A01 = interfaceC60442pS;
        this.A03 = c145826hf;
        this.A06 = c145986hv;
        this.A09 = c145906hn;
        this.A04 = interfaceC1118853a;
        this.A08 = reelViewerConfig;
        this.A05 = interfaceC144586fe;
        this.A07 = c145996hw;
        this.A00 = userSession;
        this.A02 = interfaceC60442pS;
    }

    public final void A01(C41551w4 c41551w4, C84823qW c84823qW) {
        this.A03.A0G(c41551w4, c84823qW, true, "tag", -1, -1);
    }

    public final void A00(Hashtag hashtag, C41551w4 c41551w4, C84823qW c84823qW) {
        C14360o3.A0B(hashtag, 0);
        C145826hf c145826hf = this.A03;
        String name = hashtag.getName();
        if (name != null) {
            c145826hf.A0H(c41551w4, c84823qW, true, "hashtag", name);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
