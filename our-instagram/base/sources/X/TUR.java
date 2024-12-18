package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class TUR implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public TUR(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (2 - this.A00 != 0) {
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A02;
            AccountManager accountManager = (AccountManager) this.A01;
            C14360o3.A0A(accountManager);
            return C35269Fh4.A00(new Account(this.A03, "com.google"), accountManager, null, abstractC12990ll, "LOG_IN", false, false);
        }
        String str = null;
        try {
            File file = (File) this.A01;
            if (AbstractC13530mf.A03(file.getPath()) < OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) {
                C0w9.A03("group_photo_too_small", String.valueOf(this.A03));
            }
            str = OY4.A00((UserSession) this.A02, this.A03, MSX.A0i(file));
            return str;
        } catch (Exception e) {
            C0w9.A06("group_photo_task", "Error building group photo config", e);
            return str;
        }
    }
}
