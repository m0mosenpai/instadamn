package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessagesOptionsFragment;

/* renamed from: X.Fhw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35321Fhw implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public DialogInterfaceOnClickListenerC35321Fhw(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FragmentActivity fragmentActivity = this.A00;
        if (fragmentActivity != null) {
            C140966Yy A0P = AbstractC31173DnH.A0P(fragmentActivity, this.A01);
            A0P.A0D(new DirectMessagesOptionsFragment());
            A0P.A04();
        }
    }
}
