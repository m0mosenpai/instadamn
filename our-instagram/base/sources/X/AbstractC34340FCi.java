package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.FCi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34340FCi {
    public static final ArrayList A00(Context context) {
        C14360o3.A0B(context, 0);
        Account[] accounts = AccountManager.get(context).getAccounts();
        ArrayList A10 = AbstractC31174DnI.A10(accounts);
        for (Account account : accounts) {
            if (account.name != null && AbstractC13670mt.A0C(account.name) && !A10.contains(account.name)) {
                boolean equalsIgnoreCase = "com.google".equalsIgnoreCase(account.type);
                String str = account.name;
                if (equalsIgnoreCase) {
                    C14360o3.A06(str);
                    A10.add(0, str);
                } else {
                    C14360o3.A06(str);
                    A10.add(str);
                }
            }
        }
        return A10;
    }
}
