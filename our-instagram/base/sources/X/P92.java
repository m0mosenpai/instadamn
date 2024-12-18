package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class P92 implements InterfaceC146876jP {
    public final /* synthetic */ C55040OZm A00;

    @Override // X.InterfaceC146876jP
    public final void DFP(EnumC76753cN enumC76753cN, C41181vS c41181vS) {
        C38321qM c38321qM = c41181vS.A0b;
        if (c38321qM != null) {
            c38321qM.A4H(enumC76753cN);
            OAE oae = this.A00.A05;
            CallerContext callerContext = AbstractC50624MWl.A01;
            IgdsButton A00 = oae.A01.A00();
            A00.setLoading(false);
            A00.setEnabled(true);
            C38262Gs5 c38262Gs5 = oae.A02.mListAdapter;
            if (c38262Gs5 != null) {
                c38262Gs5.A08();
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public P92(C55040OZm c55040OZm) {
        this.A00 = c55040OZm;
    }
}
