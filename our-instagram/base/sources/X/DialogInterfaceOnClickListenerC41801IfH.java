package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.IfH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41801IfH implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ Long A02;

    public DialogInterfaceOnClickListenerC41801IfH(UserSession userSession, InterfaceC60442pS interfaceC60442pS, Long l) {
        this.A02 = l;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Long l = this.A02;
        if (l != null) {
            AbstractC37305Gc6.A08(AbstractC12220kQ.A01(this.A01, this.A00), l, "ig_coauthor_invite_dismiss_tap");
        }
    }
}
