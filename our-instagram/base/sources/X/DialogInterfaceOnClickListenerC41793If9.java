package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.If9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41793If9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass389 A00;

    public DialogInterfaceOnClickListenerC41793If9(AnonymousClass389 anonymousClass389) {
        this.A00 = anonymousClass389;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1XJ c1xj = C1XJ.A00;
        AnonymousClass389 anonymousClass389 = this.A00;
        FragmentActivity requireActivity = anonymousClass389.A00.requireActivity();
        UserSession userSession = anonymousClass389.A03;
        c1xj.A18(requireActivity, userSession, userSession.userId, anonymousClass389.A02.getModuleName());
    }
}
