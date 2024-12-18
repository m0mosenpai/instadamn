package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.appwidget.DirectRecipientSearchActivity;
import com.instagram.direct.appwidget.DirectThreadWidgetItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class RcX extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectRecipientSearchActivity A02;
    public final /* synthetic */ InterfaceC65291ThO A03;
    public final /* synthetic */ List A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcX(Context context, UserSession userSession, DirectRecipientSearchActivity directRecipientSearchActivity, InterfaceC65291ThO interfaceC65291ThO, List list) {
        super(1243474276, 3, false, false);
        this.A04 = list;
        this.A02 = directRecipientSearchActivity;
        this.A01 = userSession;
        this.A00 = context;
        this.A03 = interfaceC65291ThO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<C2EC> list = this.A04;
        DirectThreadWidgetItem directThreadWidgetItem = null;
        for (C2EC c2ec : list) {
            String C7I = c2ec.C7I();
            DirectRecipientSearchActivity directRecipientSearchActivity = this.A02;
            if (C14360o3.A0K(C7I, directRecipientSearchActivity.A03) || !AbstractC001800i.A0u(directRecipientSearchActivity.A05, c2ec.C7I())) {
                List BSH = c2ec.BSH();
                ArrayList A0q = AbstractC167017dG.A0q(BSH);
                Iterator it = BSH.iterator();
                while (it.hasNext()) {
                    A0q.add(((User) it.next()).getUsername());
                }
                String C7l = c2ec.C7l();
                if (C7l == null) {
                    C7l = "";
                }
                String str = null;
                String A0P = AbstractC001800i.A0P(", ", "", "", A0q, null);
                UserSession userSession = this.A01;
                String url = ((ImageUrl) C4GQ.A00(userSession, c2ec).A00).getUrl();
                C14360o3.A07(url);
                ImageUrl imageUrl = (ImageUrl) C4GQ.A00(userSession, c2ec).A01;
                if (imageUrl != null) {
                    str = imageUrl.getUrl();
                }
                DirectThreadWidgetItem directThreadWidgetItem2 = new DirectThreadWidgetItem(C7l, A0P, url, str, c2ec.C7I(), c2ec.Cf8(userSession));
                if (C14360o3.A0K(c2ec.C7I(), directRecipientSearchActivity.A03)) {
                    directThreadWidgetItem = directThreadWidgetItem2;
                }
                directRecipientSearchActivity.A06.add(directThreadWidgetItem2);
            }
        }
        DirectRecipientSearchActivity directRecipientSearchActivity2 = this.A02;
        directRecipientSearchActivity2.A01 = new C58721Q4x(this.A00, directThreadWidgetItem, this.A03, directRecipientSearchActivity2.A06);
        directRecipientSearchActivity2.runOnUiThread(new TP2(directRecipientSearchActivity2, list));
    }
}
