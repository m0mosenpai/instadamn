package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gfe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37522Gfe implements AnonymousClass309 {
    public static final String __redex_internal_original_name = "ClipsViewerAnalyticsModule";
    public ClipsViewerConfig A00;
    public InterfaceC61782rf A01;
    public String A02;
    public final C37604Ggz A03;
    public final String A04;
    public final C37531Gfn A05;
    public final String A06;

    @Override // X.AnonymousClass309
    public final C11520jB E6Q(C38321qM c38321qM) {
        C75113Zb c75113Zb;
        long j;
        C14360o3.A0B(c38321qM, 0);
        C11520jB E6P = E6P();
        InterfaceC61782rf interfaceC61782rf = this.A01;
        if (interfaceC61782rf != null) {
            c75113Zb = interfaceC61782rf.BRZ(c38321qM);
        } else {
            c75113Zb = null;
        }
        C11500j9 c11500j9 = C5I8.A1A;
        if (c75113Zb != null && c75113Zb.A0p()) {
            j = c75113Zb.getPosition();
        } else {
            j = -1;
        }
        E6P.A04(c11500j9, Long.valueOf(j));
        E6P.A05(C5I8.A5i, c38321qM.A0C.getMezqlToken());
        if (c75113Zb != null && !c75113Zb.A0p()) {
            C0w9.A03(this.A06, AnonymousClass001.A0u("Position unset for media with id: ", c38321qM.getId(), ". in container module: ", getModuleName()));
        }
        return E6P;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A02;
        if (str == null) {
            ClipsViewerConfig clipsViewerConfig = this.A00;
            String str2 = clipsViewerConfig.A00;
            if (str2 == null || str2.length() == 0) {
                str2 = clipsViewerConfig.A0J.A00;
            }
            String A0R = AnonymousClass001.A0R("clips_viewer_", str2);
            this.A02 = A0R;
            return A0R;
        }
        return str;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return this.A05.A00(getModuleName());
    }

    public C37522Gfe(C37531Gfn c37531Gfn, ClipsViewerConfig clipsViewerConfig, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1Q(userSession, clipsViewerConfig);
        this.A06 = str;
        this.A00 = clipsViewerConfig;
        this.A04 = str2;
        this.A05 = c37531Gfn;
        this.A03 = AbstractC37497GfF.A00(userSession);
    }

    @Override // X.AnonymousClass309
    public final C11520jB E6P() {
        C11520jB A0B = AbstractC37300Gc1.A0B();
        C11500j9 c11500j9 = C5I8.A9o;
        C37604Ggz c37604Ggz = this.A03;
        A0B.A04(c11500j9, c37604Ggz.A01);
        A0B.A04(C5I8.A1C, c37604Ggz.A00);
        A0B.A04(C5I8.A6U, this.A04);
        A0B.A04(C5I8.A8P, String.valueOf(this.A00.A0h));
        A0B.A04(C5I8.A8Q, this.A00.A0q);
        A0B.A04(C5I8.A0c, this.A00.A0n);
        return A0B;
    }
}
