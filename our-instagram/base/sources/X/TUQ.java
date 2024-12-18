package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUQ implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public TUQ(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.A00) {
            case 0:
                SXB sxb = (SXB) this.A01;
                SXB.A00(sxb, sxb.A03, (Socket) this.A02, (Socket) this.A03);
                return null;
            case 1:
                HashMap A1G = AbstractC166987dD.A1G();
                Iterator A1J = AbstractC25226BEj.A1J(this.A02);
                while (A1J.hasNext()) {
                    Account account = (Account) A1J.next();
                    AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                    AccountManager accountManager = (AccountManager) this.A01;
                    C14360o3.A0A(accountManager);
                    String A00 = C35269Fh4.A00(account, accountManager, null, abstractC12990ll, "LOG_IN", false, false);
                    String str = account.name;
                    if (A00 == null) {
                        A00 = "";
                    }
                    A1G.put(str, A00);
                }
                return A1G;
            default:
                Account account2 = (Account) this.A01;
                String obj = account2.toString();
                AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A03;
                AccountManager accountManager2 = (AccountManager) this.A02;
                C14360o3.A0A(accountManager2);
                String A002 = C35269Fh4.A00(account2, accountManager2, null, abstractC12990ll2, "LOG_IN", true, true);
                if (A002 == null) {
                    A002 = "";
                }
                return AbstractC166987dD.A1L(obj, A002);
        }
    }
}
