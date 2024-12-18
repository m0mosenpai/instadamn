package X;

import com.instagram.business.promote.model.LinkingAuthState;

/* renamed from: X.WeF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70635WeF implements XA7 {
    public final /* synthetic */ XCJ A00;

    public C70635WeF(XCJ xcj) {
        this.A00 = xcj;
    }

    @Override // X.XA7
    public final void Dh1(AbstractC68953Ver abstractC68953Ver) {
        XCJ xcj = this.A00;
        if (abstractC68953Ver instanceof V1z) {
            String str = abstractC68953Ver.A01;
            if (str != null) {
                LinkingAuthState linkingAuthState = LinkingAuthState.A03;
                if (xcj instanceof XLK) {
                    ((XLK) xcj).DoL(linkingAuthState);
                }
                xcj.DqC(str);
                return;
            }
            return;
        }
        if (abstractC68953Ver.equals(V20.A00)) {
            xcj.DFf();
            return;
        }
        throw new RuntimeException();
    }
}
