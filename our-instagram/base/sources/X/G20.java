package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class G20 implements GXS {
    public final /* synthetic */ C7YY A00;
    public final /* synthetic */ InterfaceC163837Ux A01;
    public final /* synthetic */ DirectThreadKey A02;

    public G20(C7YY c7yy, InterfaceC163837Ux interfaceC163837Ux, DirectThreadKey directThreadKey) {
        this.A00 = c7yy;
        this.A02 = directThreadKey;
        this.A01 = interfaceC163837Ux;
    }

    @Override // X.GXS
    public final void DWJ() {
        int i;
        Bundle A0b = AbstractC166987dD.A0b();
        C7YY c7yy = this.A00;
        UserSession userSession = c7yy.A05;
        AbstractC03240Dh.A00(A0b, userSession);
        A0b.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, this.A02);
        A0b.putSerializable("prompts_tab", EnumC33420Epr.A06);
        InterfaceC163837Ux interfaceC163837Ux = this.A01;
        C7TT C7W = interfaceC163837Ux.C7W();
        if (C7W != null) {
            i = C7W.A08;
        } else {
            i = 29;
        }
        A0b.putInt("direct_thread_sub_type", i);
        A0b.putInt("direct_thread_audience_type", interfaceC163837Ux.AdZ());
        AbstractC59962oe abstractC59962oe = c7yy.A02;
        AbstractC31172DnG.A1M(abstractC59962oe, AbstractC31174DnI.A0a(abstractC59962oe.requireActivity(), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(2249)));
    }
}
