package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.IfQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41810IfQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ Long A04;

    public DialogInterfaceOnClickListenerC41810IfQ(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Long l) {
        this.A04 = l;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A03 = interfaceC60442pS;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Long l = this.A04;
        if (l != null) {
            AbstractC37305Gc6.A08(AbstractC12220kQ.A01(this.A03, this.A01), l, "ig_coauthor_invite_decline_tap");
        }
        Context context = this.A00;
        UserSession userSession = this.A01;
        C38321qM c38321qM = this.A02;
        String A0p = AbstractC166997dE.A0p(context, 2131957601);
        C6WQ A0i = AbstractC31174DnI.A0i(context);
        Activity activity = (Activity) AbstractC167197dY.A00(context, Activity.class);
        if (activity != null) {
            A0i.setOwnerActivity(activity);
        }
        C76833cV.A04(userSession, c38321qM, A0i, H8V.class, C41255INw.class, "decline_coauthor_invite/", A0p, null);
    }
}
