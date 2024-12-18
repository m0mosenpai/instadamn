package X;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lfp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48662Lfp implements InterfaceC37166GZd {
    public final /* synthetic */ KCL A00;

    public C48662Lfp(KCL kcl) {
        this.A00 = kcl;
    }

    @Override // X.InterfaceC37166GZd
    public final void Cue() {
        String str;
        KCL kcl = this.A00;
        Context requireContext = kcl.requireContext();
        UserSession userSession = kcl.A08;
        if (userSession == null) {
            str = "userSession";
        } else {
            AbstractC34057F1k.A00(requireContext, userSession, 2131959321);
            C56352iT.A0t.A03(kcl.getActivity()).setIsLoading(false);
            EditText editText = kcl.A03;
            if (editText == null) {
                str = "messageField";
            } else {
                editText.setEnabled(true);
                EditText editText2 = kcl.A04;
                if (editText2 == null) {
                    str = "shortcutField";
                } else {
                    editText2.setEnabled(true);
                    TextView textView = kcl.A05;
                    if (textView != null) {
                        textView.setEnabled(true);
                        return;
                    }
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC37166GZd
    public final void Cun() {
        KCL.A01(this.A00);
    }

    @Override // X.InterfaceC37166GZd
    public final void Cuo() {
        KCL kcl = this.A00;
        kcl.A0D = false;
        AbstractC25226BEj.A1Q(kcl);
    }
}
