package X;

import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LSO implements InterfaceC50417MNt {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    public LSO(Object obj, Object obj2, String str, int i, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
        this.A04 = z;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        C44458JlQ c44458JlQ;
        KPU kpu;
        String str;
        String str2;
        LK0 A01;
        LSC lsc;
        C44457JlP c44457JlP;
        AbstractC46542Kih abstractC46542Kih = (AbstractC46542Kih) obj;
        boolean z = abstractC46542Kih instanceof C44826Jt0;
        if (this.A00 != 0) {
            if (z) {
                Object obj2 = ((C44826Jt0) abstractC46542Kih).A00;
                List list = (List) obj2;
                C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", AnonymousClass001.A0O("sendOtcNotifications got otc devices size ", list.size()));
                c44457JlP = (C44457JlP) this.A02;
                c44457JlP.A07.A07("NUM_TRUSTED_DEVICE", String.valueOf(list.size()));
                Iterable iterable = (Iterable) obj2;
                c44457JlP.A01.F8m(JUD.A00(iterable, 24));
                c44457JlP.A0A.F8m(new C47318KvT(false));
                ArrayList A0q = AbstractC167017dG.A0q(iterable);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    A0q.add(((OneTimeCodeDevice) it.next()).A00);
                }
                if (AbstractC166987dD.A1b(A0q)) {
                    C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications sending notifications");
                    A01 = ((L8V) this.A01).A01(this.A03, A0q);
                    lsc = new LSC(1, c44457JlP, this.A04);
                    A01.A04(lsc);
                    return;
                }
                C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications device list is empty");
            } else {
                C0K8.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications failed to get otc devices");
                c44457JlP = (C44457JlP) this.A02;
            }
            kpu = c44457JlP.A07;
            str = "SOURCE";
            str2 = "OTC_RESTORE_WAIT";
            kpu.A07(str, str2);
            kpu.A05("OTC_PIN_CODE_API_SEND_FAILED");
        }
        if (z) {
            Object obj3 = ((C44826Jt0) abstractC46542Kih).A00;
            List list2 = (List) obj3;
            C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", AnonymousClass001.A0O("sendOtcNotifications got otc devices size ", list2.size()));
            c44458JlQ = (C44458JlQ) this.A02;
            c44458JlQ.A06.A07("NUM_TRUSTED_DEVICE", String.valueOf(list2.size()));
            Iterable iterable2 = (Iterable) obj3;
            c44458JlQ.A00.F8m(JUD.A00(iterable2, 23));
            c44458JlQ.A0C.F8m(new C47317KvS(false));
            ArrayList A0q2 = AbstractC167017dG.A0q(iterable2);
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                A0q2.add(((OneTimeCodeDevice) it2.next()).A00);
            }
            if (AbstractC166987dD.A1b(A0q2)) {
                C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications sending notifications");
                A01 = ((L8V) this.A01).A01(this.A03, A0q2);
                lsc = new LSC(0, c44458JlQ, this.A04);
                A01.A04(lsc);
                return;
            }
            C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications device list is empty");
        } else {
            C0K8.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications failed to get otc devices");
            c44458JlQ = (C44458JlQ) this.A02;
        }
        kpu = c44458JlQ.A06;
        str = "SOURCE";
        str2 = "OTC_ENTER_PIN";
        kpu.A07(str, str2);
        kpu.A05("OTC_PIN_CODE_API_SEND_FAILED");
    }
}
