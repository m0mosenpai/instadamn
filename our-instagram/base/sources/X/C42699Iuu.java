package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Iuu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42699Iuu implements InterfaceC58152PqH {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ OLM A02;
    public final /* synthetic */ C37061o4 A03;
    public final /* synthetic */ String A04;

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C42699Iuu(Fragment fragment, UserSession userSession, OLM olm, C37061o4 c37061o4, String str) {
        this.A02 = olm;
        this.A04 = str;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A03 = c37061o4;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A02.A02("upsell_snackbar", this.A04, "comment_custom_filter", MSV.A00(420));
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC43591JPw.A00(37), "upsell");
        UserSession userSession = this.A01;
        Fragment fragment = this.A00;
        AbstractC31174DnI.A0a(fragment.getActivity(), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(126)).A0C(fragment.getActivity());
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
        this.A03.A00 = null;
    }
}
