package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.PFu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56726PFu implements GZR {
    public final /* synthetic */ C55040OZm A00;
    public final /* synthetic */ C41181vS A01;
    public final /* synthetic */ InterfaceC16660sJ A02;

    @Override // X.GZR
    public final void onAuthorizeFail() {
    }

    public C56726PFu(C55040OZm c55040OZm, C41181vS c41181vS, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16660sJ;
        this.A01 = c41181vS;
        this.A00 = c55040OZm;
    }

    @Override // X.GZR
    public final void onAuthorizeSuccess(String str) {
        this.A02.invoke(this.A01);
        OAE oae = this.A00.A05;
        oae.A00.A01 = true;
        CallerContext callerContext = AbstractC50624MWl.A01;
        IgdsButton A00 = oae.A01.A00();
        A00.setLoading(false);
        A00.setEnabled(true);
        C38262Gs5 c38262Gs5 = oae.A02.mListAdapter;
        if (c38262Gs5 != null) {
            c38262Gs5.A08();
        }
    }
}
