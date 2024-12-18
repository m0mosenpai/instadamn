package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.AOb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnClickListenerC23162AOb implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ AbstractC59962oe A02;
    public final /* synthetic */ C167607eG A03;
    public final /* synthetic */ UserSession A04;

    public DialogInterfaceOnClickListenerC23162AOb(Activity activity, C22P c22p, AbstractC59962oe abstractC59962oe, C167607eG c167607eG, UserSession userSession) {
        this.A04 = userSession;
        this.A00 = activity;
        this.A02 = abstractC59962oe;
        this.A03 = c167607eG;
        this.A01 = c22p;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A04;
        AbstractC23021Ah.A00(userSession).A0M();
        AKE.A00.A01(this.A00, this.A01, this.A02, this.A03, userSession);
    }
}
