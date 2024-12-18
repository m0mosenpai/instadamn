package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ww7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71558Ww7 implements Runnable {
    public final /* synthetic */ WFQ A00;
    public final /* synthetic */ AbstractC12990ll A01;
    public final /* synthetic */ List A02;

    public RunnableC71558Ww7(WFQ wfq, AbstractC12990ll abstractC12990ll, List list) {
        this.A00 = wfq;
        this.A01 = abstractC12990ll;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        WFQ wfq = this.A00;
        AbstractC12990ll abstractC12990ll = this.A01;
        List list = this.A02;
        if (!C1AD.A06(C06090Tz.A05, 18300679554599928L)) {
            Context context = C1LZ.A00().A00;
            C006802i c006802i = wfq.A01;
            if (c006802i != null) {
                c006802i.markerAnnotate(896612552, "count_of_google_accounts_for_token_fetch", wfq.A02.size());
                ArrayList arrayList = new ArrayList();
                MHW mhw = new MHW(36, arrayList, wfq);
                if (wfq.A02.isEmpty()) {
                    mhw.invoke();
                    return;
                }
                AccountManager accountManager = AccountManager.get(context);
                ArrayList arrayList2 = new ArrayList();
                C006802i c006802i2 = wfq.A01;
                if (c006802i2 != null) {
                    c006802i2.markerPoint(896612552, "add_google_oauth_accounts_start");
                    ArrayList arrayList3 = new ArrayList();
                    int size = wfq.A02.size();
                    List<Account> list2 = wfq.A02;
                    if (size > 1) {
                        ArrayList A0q = AbstractC167017dG.A0q(list2);
                        int i2 = 0;
                        for (Object obj : list2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC16960so.A1U();
                                break;
                            } else {
                                MSZ.A1Q(wfq.A05.submit(new TUQ(2, obj, accountManager, abstractC12990ll)), arrayList3, A0q);
                                i2 = i3;
                            }
                        }
                        C25051Kj c25051Kj = C1LT.A03;
                        Object obj2 = new C43659JSr(ImmutableList.copyOf((Iterable) arrayList3), false).get();
                        C14360o3.A07(obj2);
                        i = 0;
                        for (C09530e4 c09530e4 : (Iterable) obj2) {
                            String str = (String) c09530e4.A00;
                            arrayList.add(AbstractC25232BEp.A1F("credential_type", "google_oauth", new C09530e4("token", c09530e4.A01), new C09530e4("account_type", "google_oauth")));
                            i++;
                            arrayList2.add(WFQ.A01(str));
                        }
                    } else {
                        i = 0;
                        for (Account account : list2) {
                            C14360o3.A0A(accountManager);
                            arrayList.add(AbstractC25232BEp.A1F("credential_type", "google_oauth", new C09530e4("token", C35269Fh4.A00(account, accountManager, null, abstractC12990ll, "LOG_IN", true, true)), new C09530e4("account_type", "google_oauth")));
                            i++;
                            arrayList2.add(WFQ.A01(account.toString()));
                        }
                    }
                    C35029Fc2 c35029Fc2 = wfq.A06;
                    if (i == 0) {
                        c35029Fc2.A01(abstractC12990ll, "google_oauth");
                    } else {
                        c35029Fc2.A03(abstractC12990ll, "google_oauth", arrayList2);
                    }
                    list.addAll(arrayList);
                    mhw.invoke();
                    C006802i c006802i3 = wfq.A01;
                    if (c006802i3 != null) {
                        c006802i3.markerPoint(896612552, "add_google_oauth_accounts_end");
                        return;
                    }
                }
            }
            C14360o3.A0F("qplLogger");
            throw C00O.createAndThrow();
        }
    }
}
