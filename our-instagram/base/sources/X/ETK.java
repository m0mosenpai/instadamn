package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes6.dex */
public final class ETK extends C1P1 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C34943FaT A01;
    public final /* synthetic */ FQ4 A02;
    public final /* synthetic */ User A03;

    public ETK(UserSession userSession, C34943FaT c34943FaT, FQ4 fq4, User user) {
        this.A02 = fq4;
        this.A01 = c34943FaT;
        this.A00 = userSession;
        this.A03 = user;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-527531793);
        C31361DqQ c31361DqQ = this.A02.A02;
        String id = this.A03.getId();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31361DqQ.A00, "unfollow_chaining_failed_to_show");
        A0f.AAP("target_id", id);
        A0f.AAP("reason", "api_failure");
        A0f.Cht();
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            C34943FaT.A00(this.A01, A01);
        } else {
            C34943FaT.A00(this.A01, AbstractC166987dD.A14("Unable to fetch unfollow count."));
        }
        C0f9.A0A(-2049338128, A03);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.EtJ] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ?? obj2;
        Iterator it;
        int A03 = C0f9.A03(-2097517196);
        int A032 = C0f9.A03(2027897467);
        C34943FaT c34943FaT = this.A01;
        UserSession userSession = this.A00;
        User user = this.A03;
        InterfaceC37255Gb8 interfaceC37255Gb8 = ((EAO) obj).A00;
        if (interfaceC37255Gb8 == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        int i = ((E8H) interfaceC37255Gb8).A00;
        CopyOnWriteArrayList copyOnWriteArrayList = c34943FaT.A00;
        synchronized (copyOnWriteArrayList) {
            obj2 = new Object();
            obj2.A01 = userSession;
            obj2.A02 = user;
            obj2.A00 = i;
            c34943FaT.A02.set(obj2);
            it = copyOnWriteArrayList.iterator();
            copyOnWriteArrayList.clear();
        }
        while (it.hasNext()) {
            ((C31365DqU) it.next()).A00(obj2.A00);
        }
        C0f9.A0A(752867596, A032);
        C0f9.A0A(-116092230, A03);
    }
}
