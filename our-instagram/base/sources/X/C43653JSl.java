package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.CQLResultSet;
import java.util.Map;

/* renamed from: X.JSl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43653JSl implements InterfaceC124965l1 {
    public final /* synthetic */ C127615pl A00;

    public C43653JSl(C127615pl c127615pl) {
        this.A00 = c127615pl;
    }

    @Override // X.InterfaceC124965l1
    public final void Dh3(Map map) {
        AbstractC1351869s abstractC1351869s;
        map.getClass();
        CQLResultSet cQLResultSet = (CQLResultSet) AbstractC43593JPy.A0t(C1345666g.A00, map, 27);
        MailboxFutureImpl mailboxFutureImpl = this.A00.A07;
        if (cQLResultSet == null) {
            abstractC1351869s = null;
        } else {
            abstractC1351869s = new AbstractC1351869s(cQLResultSet);
        }
        mailboxFutureImpl.setResult(new MailboxNullable(abstractC1351869s));
    }
}
