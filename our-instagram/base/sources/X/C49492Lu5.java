package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lu5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49492Lu5 implements InterfaceC58152PqH {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final List A02;

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C14360o3.A0B(view, 0);
        Activity A01 = AbstractC13330mJ.A01(AbstractC166997dE.A0L(view));
        if (A01 != null) {
            UserSession userSession = this.A01;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            List list = this.A02;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(new PendingRecipient(AbstractC25226BEj.A15(it)));
            }
            C122145g6 c122145g6 = new C122145g6(A0q);
            if (C18U.A06(C06090Tz.A05, userSession, 36313750920759533L)) {
                C7YF.A00(userSession).A02(c122145g6, A0q, new MIF(12, A01, interfaceC11380iw, userSession, true), true);
                return;
            }
            C36881nl A012 = C36881nl.A01(A01, interfaceC11380iw, userSession, "direct_thread_content_note");
            A012.A0B = c122145g6;
            A012.A06();
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C49492Lu5(InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list) {
        AbstractC167017dG.A1P(list, userSession);
        this.A02 = list;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
