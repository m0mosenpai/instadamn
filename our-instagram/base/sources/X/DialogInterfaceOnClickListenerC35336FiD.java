package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FiD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35336FiD implements DialogInterface.OnClickListener {
    public final /* synthetic */ C75443aB A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ C75113Zb A02;

    public DialogInterfaceOnClickListenerC35336FiD(C75443aB c75443aB, C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A00 = c75443aB;
        this.A01 = c38321qM;
        this.A02 = c75113Zb;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        dialogInterface.dismiss();
        C75443aB c75443aB = this.A00;
        C38321qM c38321qM = this.A01;
        C75113Zb c75113Zb = this.A02;
        C127085om A00 = AbstractC127075ol.A00(c75443aB.A03);
        String moduleName = c75443aB.A04.getModuleName();
        String sessionId = c75443aB.A07.getSessionId();
        UserSession userSession = A00.A00;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(userSession, moduleName), "instagram_feed_favorite_edit_favorites_dialog_dismiss_tap");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1D(A0f, moduleName);
            String A38 = c38321qM.A38();
            A38.getClass();
            A0f.A9K("ig_media_id", AbstractC25228BEl.A13(A38));
            if (c38321qM.A0C.BJN() != null) {
                str = c38321qM.A0C.BJN();
            } else {
                str = "";
            }
            A0f.AAP("inventory_source", str);
            A0f.AAP("ranking_info_token", AbstractC25226BEj.A1G(c38321qM));
            User A2E = c38321qM.A2E(userSession);
            A2E.getClass();
            AbstractC31181DnP.A0f(A0f, c38321qM, c75113Zb, AbstractC25228BEl.A13(A2E.getId()), sessionId);
        }
    }
}
