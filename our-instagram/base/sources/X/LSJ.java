package X;

import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LSJ implements InterfaceC50417MNt {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public LSJ(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C44546Jmq c44546Jmq;
        String str;
        LK0 A01;
        LS9 ls9;
        LK0 lk0;
        Object c44827Jt1;
        AbstractC46542Kih abstractC46542Kih = (AbstractC46542Kih) obj;
        switch (this.A00) {
            case 0:
                if (abstractC46542Kih instanceof C44826Jt0) {
                    Iterable iterable = (Iterable) ((C44826Jt0) abstractC46542Kih).A00;
                    ArrayList A0q = AbstractC167017dG.A0q(iterable);
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        A0q.add(((OneTimeCodeDevice) it.next()).A00);
                    }
                    if (AbstractC166987dD.A1b(A0q)) {
                        A01 = ((L8V) this.A01).A01(this.A03, A0q);
                        ls9 = new LS9(this.A02, 20);
                        A01.A04(ls9);
                        return;
                    }
                    c44546Jmq = (C44546Jmq) this.A02;
                    str = "Failed to send OTC notifications, device list was empty";
                } else {
                    c44546Jmq = (C44546Jmq) this.A02;
                    str = "Failed to send OTC notifications, couldn't get device list";
                }
                C44546Jmq.A01(c44546Jmq, str);
                return;
            case 1:
                if (abstractC46542Kih instanceof C44826Jt0) {
                    lk0 = (LK0) this.A01;
                    c44827Jt1 = new C44826Jt0(AbstractC166997dE.A0b());
                } else {
                    if (!(abstractC46542Kih instanceof C44827Jt1)) {
                        return;
                    }
                    ((C63286Sgl) AbstractC47205Kte.A04.getValue()).A03((L9M) this.A02, this.A03);
                    lk0 = (LK0) this.A01;
                    c44827Jt1 = new C44827Jt1(((C44827Jt1) abstractC46542Kih).A00);
                }
                lk0.A05(c44827Jt1);
                return;
            default:
                C0K8.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", AbstractC167017dG.A0n(abstractC46542Kih, "fetchCode got code ", AbstractC166987dD.A1C()));
                C44525JmV c44525JmV = (C44525JmV) this.A02;
                c44525JmV.A06.F8m(new C47316KvR(false));
                if (abstractC46542Kih instanceof C44826Jt0) {
                    L9W l9w = (L9W) ((C44826Jt0) abstractC46542Kih).A00;
                    String str2 = l9w.A01;
                    C0K8.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", AnonymousClass001.A0R("fetchCode got code success, code: ", str2));
                    c44525JmV.A03.A05("OTC_GENERATE_CODE_SUCCESS");
                    c44525JmV.A07.F8m(str2);
                    L8V l8v = (L8V) this.A01;
                    long j = l9w.A00;
                    String str3 = this.A03;
                    C14360o3.A0A(str3);
                    A01 = LK0.A00();
                    K3T k3t = l8v.A01;
                    Long valueOf = Long.valueOf(j);
                    InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3t);
                    MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0H);
                    AbstractC25231BEo.A1C(A0H, new C48191LUp(k3t, 0, valueOf, A0D, str2, str3, 1), A0D);
                    A0D.addResultCallback(JRS.A00(A01, 19));
                    ls9 = new LS9(c44525JmV, 25);
                    A01.A04(ls9);
                    return;
                }
                C0K8.A0D("EncryptedBackupsOneTimeCodeDisplayCodeViewModel", "fetchCode got code failure");
                c44525JmV.A07.F8m("");
                c44525JmV.A04.F8m(new C47315KvQ(true));
                AbstractC43592JPx.A1R(c44525JmV.A03, "FAILURE_REASON", "GENERATE_CODE_ERROR");
                return;
        }
    }
}
