package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AOU implements DialogInterface.OnClickListener {
    public final /* synthetic */ InterfaceC166407c9 A00;
    public final /* synthetic */ C25814BbV A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ InterfaceC60442pS A03;

    public AOU(InterfaceC166407c9 interfaceC166407c9, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = c25814BbV;
        this.A00 = interfaceC166407c9;
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C25814BbV c25814BbV = this.A01;
        C23584Ace c23584Ace = (C23584Ace) this.A00;
        c25814BbV.A0S(null, c23584Ace.A02, c23584Ace.A01);
        UserSession userSession = this.A02;
        FDR.A00(AbstractC12220kQ.A01(this.A03, userSession), userSession, null, "comments", "click", "cant_mention_alert_nux_edit_comment");
    }
}
