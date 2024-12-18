package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ofg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55267Ofg implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass857 A00;
    public final /* synthetic */ UserSession A01;

    public DialogInterfaceOnClickListenerC55267Ofg(AnonymousClass857 anonymousClass857, UserSession userSession) {
        this.A00 = anonymousClass857;
        this.A01 = userSession;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC31177DnL.A0u(this.A00.A02, this.A01, C2Fb.A0e, "https://help.instagram.com/1695974997209192");
    }
}
