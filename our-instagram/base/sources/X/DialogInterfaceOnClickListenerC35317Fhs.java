package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Fhs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35317Fhs implements DialogInterface.OnClickListener {
    public final /* synthetic */ C147066ji A00;

    public DialogInterfaceOnClickListenerC35317Fhs(C147066ji c147066ji) {
        this.A00 = c147066ji;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        FragmentActivity fragmentActivity = this.A00.A00;
        C12260kU.A0G(fragmentActivity, AbstractC08820cl.A03(AbstractC63260SgI.A01(fragmentActivity, "https://help.instagram.com/519522125107875/data-policy")));
    }
}
