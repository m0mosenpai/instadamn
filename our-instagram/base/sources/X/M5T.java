package X;

import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class M5T implements Runnable {
    public final /* synthetic */ LJc A00;
    public final /* synthetic */ K8M A01;
    public final /* synthetic */ List A02;

    public M5T(LJc lJc, K8M k8m, List list) {
        this.A00 = lJc;
        this.A01 = k8m;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LJc lJc = this.A00;
        K8M k8m = this.A01;
        List list = this.A02;
        String str = k8m.A02;
        if (str == null) {
            str = "";
        }
        String str2 = k8m.A00;
        if (str2 == null) {
            str2 = "";
        }
        lJc.A03 = new C45195Jzb(str, str2);
        List list2 = lJc.A0C;
        list2.clear();
        List<L4Y> list3 = k8m.A03;
        ArrayList A0q = AbstractC167017dG.A0q(list3);
        for (L4Y l4y : list3) {
            long j = l4y.A01;
            String str3 = lJc.A0A;
            String str4 = l4y.A02;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = l4y.A03;
            if (str5 == null) {
                str5 = "";
            }
            boolean z = l4y.A06;
            ArrayList<C45070Jwz> A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                Long l = ((C45070Jwz) obj).A04;
                if (l != null && l.longValue() == j) {
                    A1E.add(obj);
                }
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (C45070Jwz c45070Jwz : A1E) {
                Long l2 = c45070Jwz.A05;
                if (l2 != null) {
                    String obj2 = l2.toString();
                    String str6 = "";
                    if (obj2 == null) {
                        obj2 = str6;
                    }
                    String str7 = c45070Jwz.A08;
                    String str8 = c45070Jwz.A0A;
                    if (str8 != null) {
                        str6 = str8;
                    }
                    A1E2.add(new PollMessageVoterInfoViewModel(AbstractC25225BEi.A0t(c45070Jwz.A09), obj2, str7, str6));
                }
            }
            A0q.add(new PollMessageOptionViewModel(str3, str4, str5, A1E2, l4y.A00, j, z));
        }
        list2.addAll(A0q);
        List list4 = lJc.A0B;
        list4.clear();
        if (lJc.A0E) {
            int i = lJc.A00;
            lJc.A00 = i + 1;
            list4.add(new C45204Jzk(i));
        }
        LJc.A01(lJc);
    }
}
