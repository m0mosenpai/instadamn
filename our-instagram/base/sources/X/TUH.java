package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* loaded from: classes10.dex */
public final class TUH implements Callable {
    public final int A00;
    public final Object A01;
    public final String A02;

    public TUH(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i;
        Account[] accountArr;
        switch (this.A00) {
            case 0:
                return ((ShortcutInfoCompatSaverImpl) this.A01).A04.get(this.A02);
            case 1:
                C58725Q5c c58725Q5c = (C58725Q5c) this.A01;
                String str = this.A02;
                boolean z = c58725Q5c.A03;
                Context context = c58725Q5c.getContext();
                if (z) {
                    return AbstractC63385Sj0.A01(context, str, AnonymousClass001.A0R("asset_", str));
                }
                return AbstractC63385Sj0.A01(context, str, null);
            case 2:
                return AbstractC63385Sj0.A04((InputStream) this.A01, this.A02);
            case 3:
                return AbstractC63385Sj0.A02(null, this.A02, (ZipInputStream) this.A01);
            case 4:
                Context context2 = (Context) this.A01;
                String str2 = this.A02;
                HashMap A1G = AbstractC166987dD.A1G();
                if (context2.checkCallingOrSelfPermission(AbstractC111324zv.A00(59)) == 0) {
                    accountArr = AccountManager.get(context2).getAccountsByType("com.google");
                    C14360o3.A07(accountArr);
                } else {
                    accountArr = new Account[0];
                }
                for (Account account : accountArr) {
                    String str3 = null;
                    try {
                        String A0R = AnonymousClass001.A0R("audience:server:client_id:", str2);
                        AbstractC63384Siz.A06(context2, AbstractC63384Siz.A02(account, context2, A0R));
                        str3 = AbstractC63384Siz.A02(account, context2, A0R);
                    } catch (Exception unused) {
                    }
                    String str4 = account.name;
                    if (str3 == null) {
                        str3 = "";
                    }
                    A1G.put(str4, str3);
                }
                return A1G;
            case 5:
                String str5 = this.A02;
                SLi sLi = (SLi) this.A01;
                try {
                    C63015Saf c63015Saf = new C63015Saf(str5, Arrays.asList(InetAddress.getAllByName(str5)), 0, 0);
                    synchronized (sLi) {
                        C62763SPw c62763SPw = sLi.A00;
                        TreeSet A01 = c62763SPw.A01();
                        if (A01.isEmpty()) {
                            i = 0;
                        } else {
                            i = ((C63015Saf) A01.first()).A01 + 1;
                        }
                        C63015Saf A00 = c62763SPw.A00(c63015Saf);
                        if (A00 == null) {
                            c62763SPw.A03(new C63015Saf(c63015Saf.A02, c63015Saf.A00(), i, 0));
                        } else {
                            c62763SPw.A04(A00, new C63015Saf(c63015Saf.A02, c63015Saf.A00(), i, A00.A00));
                        }
                        c62763SPw.A02();
                    }
                    return c63015Saf;
                } catch (SecurityException unused2) {
                    throw new C61028Rdw(EnumC61123Rfd.SecurityException);
                } catch (UnknownHostException unused3) {
                    throw new C61028Rdw(EnumC61123Rfd.UnknownHost);
                }
            default:
                return AbstractC23021ADd.A00((Context) this.A01, this.A02);
        }
    }
}
