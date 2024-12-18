package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes6.dex */
public final class EZN extends C3PD {
    public final /* synthetic */ C1828889j A00;
    public final /* synthetic */ String A01;

    public EZN(C1828889j c1828889j, String str) {
        this.A00 = c1828889j;
        this.A01 = str;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        C1828889j c1828889j = this.A00;
        String str = this.A01;
        C28511Zm c28511Zm = C28531Zo.A04.A01;
        C83693oE A0N = AbstractC31171DnF.A0N(str);
        UserSession userSession = c1828889j.A04;
        C81663kb C76 = AbstractC28761aE.A00(userSession).C76(str);
        if (C76 != null) {
            int C7g = C76.C7g();
            C2054597s c2054597s = C2054597s.A00;
            C16930sl c16930sl = C16930sl.A00;
            Bundle A02 = c28511Zm.A02(c2054597s.createWithAdditionalCapabilities(c16930sl, c16930sl), A0N, null, C7g, false, false, false);
            AbstractC59962oe abstractC59962oe = c1828889j.A03;
            AbstractC31173DnH.A1I(abstractC59962oe, AbstractC31171DnF.A0L(abstractC59962oe.requireActivity(), A02, userSession, ModalActivity.class, AbstractC111324zv.A00(2278)));
            return true;
        }
        throw AbstractC166997dE.A0g();
    }
}
