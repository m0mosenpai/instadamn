package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G8R implements GZB {
    public final /* synthetic */ C116155Nu A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8R(C116155Nu c116155Nu, UserSession userSession, String str) {
        this.A01 = userSession;
        this.A00 = c116155Nu;
        this.A02 = str;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        UserSession userSession = this.A01;
        FragmentActivity A07 = AbstractC31179DnN.A07();
        if (A07 != null) {
            String str = this.A00.A0j;
            if (AbstractC31172DnG.A1Z(userSession, str)) {
                C36881nl A01 = C36881nl.A01(A07, AbstractC31171DnF.A0D("push_notification"), userSession, "watch_receipt_inapp_notification");
                A01.A0A(this.A02);
                A01.A06();
            } else {
                InterfaceC02900Bo A00 = C0BQ.A00(userSession);
                User BOa = A00.BOa(str);
                if (BOa == null || !A00.AGB(A07, userSession, BOa)) {
                    return;
                }
                A00.E45(A07, AbstractC34770FTt.A01(A07, str, this.A02, null, "DirectUrlHandler", null, null), userSession, BOa, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_WATCH_RECEIPTS);
            }
        }
    }
}
