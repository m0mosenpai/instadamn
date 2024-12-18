package X;

import com.instagram.notifications.persistence.room.IgNotificationsDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class PR4 implements Runnable {
    public final /* synthetic */ C107264sX A00;
    public final /* synthetic */ List A01;

    public PR4(C107264sX c107264sX, List list) {
        this.A01 = list;
        this.A00 = c107264sX;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC166997dE.A1W(A0q, ((C5HW) it.next()).A00);
        }
        List A0W = AbstractC001800i.A0W(A0q);
        C107264sX c107264sX = this.A00;
        InterfaceC08830cm interfaceC08830cm = c107264sX.A03;
        C1YP c1yp = ((IgNotificationsDatabase) interfaceC08830cm.get()).A00().A00;
        c1yp.assertNotSuspendingTransaction();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("\n");
        A1C.append("    DELETE FROM newfeedstory");
        A1C.append("\n");
        A1C.append("    WHERE notification_type in (");
        AbstractC73723Sa.A00(A1C, A0W.size());
        A1C.append(")");
        A1C.append("\n");
        InterfaceC37561ot compileStatement = c1yp.compileStatement(AbstractC166997dE.A0x("  ", A1C));
        Iterator it2 = A0W.iterator();
        int i = 1;
        while (it2.hasNext()) {
            compileStatement.ADi(i, AbstractC167007dF.A0B(it2));
            i++;
        }
        c1yp.beginTransaction();
        try {
            compileStatement.ATb();
            c1yp.setTransactionSuccessful();
            c1yp.endTransaction();
            C109424wU A00 = ((IgNotificationsDatabase) interfaceC08830cm.get()).A00();
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C109504wc A002 = AbstractC54065NvP.A00((C5HW) it3.next(), c107264sX.A01.userId);
                if (A002 != null) {
                    A1E.add(A002);
                }
            }
            A00.A02(A1E);
            if (AbstractC166987dD.A1b(list)) {
                c107264sX.A00 = true;
                ((AbstractC54342eo) c107264sX.A02.get()).A03();
            }
        } catch (Throwable th) {
            c1yp.endTransaction();
            throw th;
        }
    }
}
