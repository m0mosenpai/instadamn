package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.IfP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnClickListenerC41809IfP implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ Long A04;

    public DialogInterfaceOnClickListenerC41809IfP(Context context, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, Long l) {
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
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            C38321qM c38321qM = this.A02;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "coauthor_invite_accept");
            A0f.A9K("media_id", l);
            A0f.AAK(C4SX.A00(AbstractC37303Gc4.A0T(userSession, c38321qM)), "media_owner_id");
            A0f.AAK(C4SX.A00(userSession.userId), "actor_id");
            AbstractC37303Gc4.A0g(A0f, c38321qM);
            AbstractC37301Gc2.A15(A0f, interfaceC60442pS);
            A0f.AAP("source_of_action", interfaceC60442pS.getModuleName());
            A0f.Cht();
            InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "ig_coauthor_invite_accept_tap");
            if (A0f2.isSampled()) {
                A0f2.A9K("media_id", l);
                A0f2.AAP("entrypoint", "accept_flow_entrypoint_other");
                A0f2.AAP("surface", "accept_flow_review_surface_dialog");
                A0f2.Cht();
            }
        }
        C76833cV.A01(this.A00, this.A01, this.A02);
    }
}
