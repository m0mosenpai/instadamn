package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.0wL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18880wL {
    public static final String[] A00(Context context, String str) {
        String userData;
        AccountManager accountManager = AccountManager.get(context.getApplicationContext());
        C14360o3.A07(accountManager);
        Account[] accountsByType = accountManager.getAccountsByType("www.instagram.com");
        C14360o3.A07(accountsByType);
        ArrayList arrayList = new ArrayList();
        for (Account account : accountsByType) {
            if (account != null && (userData = accountManager.getUserData(account, str)) != null && userData.length() != 0) {
                arrayList.add(userData);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
