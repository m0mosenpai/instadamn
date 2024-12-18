package X;

import android.view.View;
import android.widget.EditText;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class G1Q implements InterfaceC37166GZd {
    public final /* synthetic */ EJn A00;

    public G1Q(EJn eJn) {
        this.A00 = eJn;
    }

    @Override // X.InterfaceC37166GZd
    public final void Cue() {
        EJn eJn = this.A00;
        AbstractC34057F1k.A00(eJn.requireContext(), eJn.A07, 2131974293);
        C34923Fa9 c34923Fa9 = eJn.A08;
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC31171DnF.A1U("MODIFY_QUESTIONS_REQUEST_FAILURE", A1G);
        C34923Fa9.A00(c34923Fa9, "icebreaker_settings_error_screen_impression", "There was a HTTP request failure to modify icebreaker questions", A1G);
        AbstractC31176DnK.A0y(eJn.requireActivity(), C56352iT.A0t);
        eJn.A03.setEnabled(true);
        EditText editText = eJn.A04;
        if (editText != null) {
            editText.setEnabled(true);
        }
        View view = eJn.A01;
        if (view != null) {
            view.setEnabled(true);
        }
    }

    @Override // X.InterfaceC37166GZd
    public final void Cun() {
        EJn eJn = this.A00;
        AbstractC31176DnK.A0z(eJn.requireActivity(), C56352iT.A0t);
        eJn.A03.setEnabled(false);
        EditText editText = eJn.A04;
        if (editText != null) {
            editText.setEnabled(false);
        }
        View view = eJn.A01;
        if (view != null) {
            view.setEnabled(false);
        }
    }

    @Override // X.InterfaceC37166GZd
    public final void Cuo() {
        EJn eJn = this.A00;
        eJn.requireActivity().setResult(-1, eJn.A00);
        AbstractC25227BEk.A1B(eJn);
    }
}
