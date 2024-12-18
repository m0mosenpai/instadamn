package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.Gi9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37672Gi9 implements InterfaceC31022DkL, InterfaceC31046Dkk {
    public InterfaceC16590sC A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final SearchContext A03;
    public final C37640GhZ A04;
    public final IG5 A05;
    public final /* synthetic */ C25390BLh A06 = new Object();

    @Override // X.InterfaceC31046Dkk
    public final void CJy(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, C38321qM c38321qM, int i) {
        AbstractC167027dH.A12(c120985dq, c37644Ghd, c38321qM);
        InterfaceC16590sC interfaceC16590sC = this.A00;
        if (interfaceC16590sC != null) {
            interfaceC16590sC.invoke(c120985dq, c37644Ghd, c38321qM, Integer.valueOf(i), view);
            InterfaceC60442pS interfaceC60442pS = this.A02;
            AbstractC37670Gi3.A0U(c120985dq, this.A01, interfaceC60442pS, this.A03, this.A05.A00);
        }
    }

    @Override // X.InterfaceC31022DkL
    public final void ER9(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A06.A00 = interfaceC16610sE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x017e, code lost:
    
        if (r44.A02 == null) goto L18;
     */
    @Override // X.InterfaceC31046Dkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJx(X.C120985dq r44, X.C37644Ghd r45, X.C38321qM r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37672Gi9.CJx(X.5dq, X.Ghd, X.1qM, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BLh, java.lang.Object] */
    public C37672Gi9(UserSession userSession, InterfaceC60442pS interfaceC60442pS, SearchContext searchContext, C37640GhZ c37640GhZ, IG5 ig5) {
        this.A01 = userSession;
        this.A04 = c37640GhZ;
        this.A02 = interfaceC60442pS;
        this.A03 = searchContext;
        this.A05 = ig5;
    }

    @Override // X.InterfaceC31022DkL
    public final void CJZ(C120985dq c120985dq, EnumC37860GlF enumC37860GlF, EnumC37861GlG enumC37861GlG) {
        AbstractC167017dG.A1O(enumC37860GlF, enumC37861GlG);
        this.A06.CJZ(c120985dq, enumC37860GlF, enumC37861GlG);
    }

    @Override // X.InterfaceC31046Dkk
    public final void EXZ(InterfaceC16590sC interfaceC16590sC) {
        this.A00 = interfaceC16590sC;
    }
}
