package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EHQ extends AbstractC72473Mu implements InterfaceC60072op {
    public C58655PzS A00;
    public String A01;
    public String A02;
    public InterfaceC16820sZ A04;
    public InterfaceC16820sZ A03 = C37034GTq.A00;
    public InterfaceC16820sZ A05 = C37033GTp.A00;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return true;
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1157847563);
        super.onCreate(bundle);
        this.A00 = AbstractC31668DvY.A00(requireContext());
        C0f9.A09(-982458500, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        String str3;
        int A02 = C0f9.A02(890291321);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString("key_thread_id")) == null) {
            str = "";
        }
        this.A02 = str;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null || (str2 = bundle3.getString("key_entry_point")) == null) {
            str2 = "unknown";
        }
        this.A01 = str2;
        View inflate = layoutInflater.inflate(R.layout.direct_locked_chat_privacy_screen, viewGroup);
        AbstractC31171DnF.A08(inflate, R.id.locked_chat_app_icon).setImageResource(R.drawable.instagram);
        C64P c64p = (C64P) AbstractC166987dD.A0c(inflate, R.id.unlock_bottom_button);
        c64p.setPrimaryAction(getString(2131963969), new ViewOnClickListenerC35666Fp0(this, 7));
        c64p.setSecondaryAction(getString(2131954754), new ViewOnClickListenerC35666Fp0(this, 8));
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A06);
        String str4 = this.A01;
        if (str4 == null) {
            str3 = "entryPoint";
        } else {
            String str5 = this.A02;
            if (str5 == null) {
                str3 = "threadId";
            } else {
                C14360o3.A0B(A0o, 0);
                InterfaceC02590Ai A09 = AbstractC31179DnN.A09(A0o);
                if (A09.isSampled()) {
                    AbstractC31181DnP.A0i(A09, AbstractC111324zv.A00(5366), str4, str5);
                }
                C0f9.A09(1619531749, A02);
                return inflate;
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1957098766);
        super.onStart();
        Dialog dialog = super.A01;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            A0D(false);
            dialog.setCanceledOnTouchOutside(false);
        }
        C58655PzS c58655PzS = this.A00;
        if (c58655PzS != null) {
            if (c58655PzS.A01()) {
                C58655PzS c58655PzS2 = this.A00;
                if (c58655PzS2 != null) {
                    c58655PzS2.A00(this, new C36396G3x(this, 1), false);
                }
            }
            C0f9.A09(2080995809, A02);
            return;
        }
        C14360o3.A0F("lockedChatAuthenticator");
        throw C00O.createAndThrow();
    }
}
