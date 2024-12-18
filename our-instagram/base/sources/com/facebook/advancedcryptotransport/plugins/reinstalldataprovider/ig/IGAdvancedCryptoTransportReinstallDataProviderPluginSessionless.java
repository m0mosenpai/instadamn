package com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.ig;

import X.AbstractC12290kX;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AnonymousClass001;
import X.C06090Tz;
import X.C14360o3;
import X.C1AD;
import X.C1U4;
import X.C1UM;
import X.C1ZT;
import android.content.Context;
import com.facebook.messaging.lockbox.LockBoxStorageManager;

/* loaded from: classes4.dex */
public final class IGAdvancedCryptoTransportReinstallDataProviderPluginSessionless extends Sessionless {
    public final String LOCK_BOX_STORAGE_KEY = "rf";
    public final String SHARED_PREFS_FILE = "IG_REINSTALL_DATA_STORE";

    @Override // com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.ig.Sessionless
    public int IGReinstallDataProviderImpl_MEMReinstallDataProviderAppIsReinstalled(String str, String str2) {
        AbstractC167007dF.A1K(str, str2);
        if (!C1AD.A06(C06090Tz.A05, 18304815608110178L)) {
            return 0;
        }
        String lockBoxGetSecret = LockBoxStorageManager.lockBoxGetSecret(str, this.LOCK_BOX_STORAGE_KEY);
        if (lockBoxGetSecret == null) {
            return 7;
        }
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        boolean contains = C1U4.A00(context).A00(this.SHARED_PREFS_FILE).contains(AnonymousClass001.A0R("ig.android.reinstall.flag/", str));
        if (lockBoxGetSecret.equals("t")) {
            if (!contains) {
                return 3;
            }
            return 6;
        }
        if (lockBoxGetSecret.equals(str2)) {
            if (!contains) {
                return 1;
            }
            return 4;
        }
        if (!contains) {
            return 2;
        }
        return 5;
    }

    @Override // com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.ig.Sessionless
    public boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderRecordFreshInstall(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        AbstractC167007dF.A1D(str2, 1, str3);
        if (!C1AD.A06(C06090Tz.A05, 18304815608110178L)) {
            return true;
        }
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        C1UM A00 = C1U4.A00(context).A00(this.SHARED_PREFS_FILE);
        C1ZT AR9 = A00.AR9();
        AR9.A0A(AnonymousClass001.A0R("ig.android.reinstall.flag/", str), true);
        AR9.A03();
        C1ZT AR92 = A00.AR9();
        AR92.A09(AnonymousClass001.A0R("ig.android.reinstall.registration_id/", str), str3);
        AR92.A03();
        if (LockBoxStorageManager.lockBoxSaveSecret(str, this.LOCK_BOX_STORAGE_KEY, str2) == 1) {
            return true;
        }
        return false;
    }

    private final String sharedPrefsKeyForRegisteredFlag(String str) {
        return AnonymousClass001.A0R("ig.android.reinstall.flag/", str);
    }

    private final String sharedPrefsKeyForRegistrationID(String str) {
        return AnonymousClass001.A0R("ig.android.reinstall.registration_id/", str);
    }

    @Override // com.facebook.advancedcryptotransport.plugins.reinstalldataprovider.ig.Sessionless
    public boolean IGReinstallDataProviderImpl_MEMReinstallDataProviderIsRegistrationIDChanged(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        if (!C1AD.A06(C06090Tz.A05, 18304815608110178L)) {
            return false;
        }
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        String string = C1U4.A00(context).A00(this.SHARED_PREFS_FILE).getString(AnonymousClass001.A0R("ig.android.reinstall.registration_id/", str), null);
        if (string != null && string.equals(str2)) {
            return false;
        }
        return true;
    }
}
