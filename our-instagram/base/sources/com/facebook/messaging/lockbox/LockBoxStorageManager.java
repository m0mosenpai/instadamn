package com.facebook.messaging.lockbox;

import X.AbstractC001800i;
import X.AbstractC001900j;
import X.AbstractC1336861y;
import X.AbstractC225179wg;
import X.AbstractC33639Etp;
import X.AbstractC46360Kfi;
import X.AbstractC46361Kfj;
import X.AbstractC72473XeP;
import X.AnonymousClass623;
import X.C00O;
import X.C1336661v;
import X.C1336761w;
import X.C14360o3;
import X.C15W;
import X.C46116KbG;
import X.C46117KbH;
import X.C46118KbI;
import X.C46319Kep;
import X.C46560Kiz;
import X.C47498KyR;
import X.C50679MYx;
import X.C61O;
import X.EnumC1336961z;
import X.EnumC46305Keb;
import X.InterfaceC73585YMh;
import X.InterfaceC73586YMi;
import X.InterfaceC73587YMj;
import X.K50;
import X.K53;
import X.K54;
import X.LK0;
import X.LS6;
import X.LS7;
import X.LS8;
import X.LSA;
import X.LSB;
import X.LSG;
import X.LSH;
import X.XVm;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LockBoxStorageManager {
    public static final LockBoxStorageManager INSTANCE = new Object();
    public static C1336761w backupManager;
    public static volatile boolean blockStoreAvailable;
    public static InterfaceC73586YMi keyParser;
    public static InterfaceC73585YMh lockBoxEntryLogger;
    public static volatile boolean lockBoxInitializeCalled;
    public static InterfaceC73587YMj logger;
    public static AnonymousClass623 shareKeyRetrieve;
    public static SharedPreferences sharedPreferences;

    public static final /* synthetic */ void access$markEntrySaveSuccess(LockBoxStorageManager lockBoxStorageManager) {
    }

    private final void checkIsRunningOnMainThread(String str) {
    }

    private final synchronized String getValueFromSharedPreferences(String str) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            C14360o3.A0F("sharedPreferences");
        } else {
            if (!sharedPreferences2.contains(str)) {
                return null;
            }
            SharedPreferences sharedPreferences3 = sharedPreferences;
            if (sharedPreferences3 == null) {
                C14360o3.A0F("sharedPreferences");
            } else {
                return sharedPreferences3.getString(str, "");
            }
        }
        throw C00O.createAndThrow();
    }

    public static final boolean lockBoxDeleteDeviceSecret(String str) {
        C14360o3.A0B(str, 0);
        return lockBoxDeleteSecret("DU", str);
    }

    public static final boolean lockBoxDeleteSecret(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LK0 lockBoxDeleteSecretAsync = lockBoxDeleteSecretAsync(str, str2);
        try {
            lockBoxDeleteSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = lockBoxDeleteSecretAsync.A00;
        C14360o3.A07(obj);
        return ((Boolean) obj).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    public static final LK0 lockBoxDeleteSecretAsync(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LK0 lk0 = new LK0();
        ?? obj = new Object();
        obj.A00 = str2;
        Object obj2 = AbstractC1336861y.A02.get(str2);
        if (obj2 != null) {
            obj.A00 = obj2;
        }
        if (backupManager == null) {
            lk0.A05(false);
            return lk0;
        }
        INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A04(new LSA(lk0, str, obj));
        return lk0;
    }

    public static final String lockBoxGetDeviceSecret(String str) {
        C14360o3.A0B(str, 0);
        return lockBoxGetSecret("DU", str);
    }

    public static final String lockBoxGetLocalSecret(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LK0 lockBoxGetLocalSecretAsync = lockBoxGetLocalSecretAsync(str, str2);
        try {
            lockBoxGetLocalSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        return (String) lockBoxGetLocalSecretAsync.A00;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    public static final LK0 lockBoxGetLocalSecretAsync(String str, String str2) {
        int ordinal;
        String valueFromSharedPreferences;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LK0 lk0 = new LK0();
        ?? obj = new Object();
        obj.A00 = str2;
        Object obj2 = AbstractC1336861y.A02.get(str2);
        if (obj2 != null) {
            obj.A00 = obj2;
        }
        if (!blockStoreAvailable && lockBoxInitializeCalled) {
            String str3 = (String) obj.A00;
            C14360o3.A0B(str3, 0);
            EnumC1336961z A00 = AbstractC225179wg.A00(str3);
            if (A00 != null && ((ordinal = A00.ordinal()) == 1 || ordinal == 2)) {
                String str4 = (String) AbstractC1336861y.A01.get(AbstractC225179wg.A00((String) obj.A00));
                if (str4 != null && (valueFromSharedPreferences = INSTANCE.getValueFromSharedPreferences(str4)) != null) {
                    lk0.A05(valueFromSharedPreferences);
                    return lk0;
                }
                lk0.A03();
                return lk0;
            }
        }
        if (backupManager != null) {
            INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A04(new LSG(lk0, str2, str, obj));
            return lk0;
        }
        lk0.A03();
        return lk0;
    }

    public static final String lockBoxGetRemoteSecret(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        return INSTANCE.lockBoxGetRemoteSecret(str, str2, true);
    }

    public static final C46560Kiz lockBoxGetRemoteSecretWithSource(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        return INSTANCE.lockBoxGetRemoteSecretWithSource(str, str2, true);
    }

    public static final String lockBoxGetSecret(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LockBoxStorageManager lockBoxStorageManager = INSTANCE;
        String str3 = (String) AbstractC1336861y.A02.get(str2);
        if (str3 != null) {
            str2 = str3;
        }
        String lockBoxGetLocalSecret = lockBoxGetLocalSecret(str, str2);
        if (lockBoxGetLocalSecret != null && lockBoxGetLocalSecret.length() > 0) {
            return lockBoxGetLocalSecret;
        }
        if (AbstractC225179wg.A00(str2) != null) {
            return lockBoxStorageManager.lockBoxGetRemoteSecret(str, str2, false);
        }
        return null;
    }

    public static final C46560Kiz lockBoxGetSecretWithSource(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LK0 lockBoxGetSecretWithSourceAsync = lockBoxGetSecretWithSourceAsync(str, str2);
        try {
            lockBoxGetSecretWithSourceAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        return (C46560Kiz) lockBoxGetSecretWithSourceAsync.A00;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0ps, java.lang.Object] */
    public static final LK0 lockBoxGetSecretWithSourceAsync(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        LK0 lk0 = new LK0();
        ?? obj = new Object();
        obj.A00 = str2;
        Object obj2 = AbstractC1336861y.A02.get(str2);
        if (obj2 != null) {
            obj.A00 = obj2;
        }
        lockBoxGetLocalSecretAsync(str, (String) obj.A00).A04(new LSB(lk0, str, obj));
        return lk0;
    }

    public static final int lockBoxSaveDeviceSecret(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        return lockBoxSaveSecret("DU", str, str2);
    }

    public static final int lockBoxSaveSecret(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        LK0 lockBoxSaveSecretAsync = lockBoxSaveSecretAsync(str, str2, str3);
        try {
            lockBoxSaveSecretAsync.A01.await();
        } catch (InterruptedException unused) {
        }
        Object obj = lockBoxSaveSecretAsync.A00;
        C14360o3.A07(obj);
        return ((Number) obj).intValue();
    }

    public static final LK0 lockBoxSaveSecretAsync(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        return lockBoxSaveSecretAsync(str, str2, str3, XVm.A00);
    }

    private final void markEntrySaveFailed(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Kiz, java.lang.Object] */
    public final C46560Kiz parseToLockBoxResult(String str, String str2, String str3) {
        if (str != null && str.length() > 0) {
            return new Object();
        }
        if (AbstractC225179wg.A00(str2) != null) {
            return lockBoxGetRemoteSecretWithSource(str3, str2, false);
        }
        return null;
    }

    public static final void setEntryLogger(InterfaceC73585YMh interfaceC73585YMh, InterfaceC73586YMi interfaceC73586YMi) {
        C14360o3.A0B(interfaceC73585YMh, 0);
        C14360o3.A0B(interfaceC73586YMi, 1);
        lockBoxEntryLogger = interfaceC73585YMh;
        keyParser = interfaceC73586YMi;
    }

    private final synchronized void storeEntryIntoSharedPreferences(String str, String str2) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        if (sharedPreferences2 == null) {
            C14360o3.A0F("sharedPreferences");
            throw C00O.createAndThrow();
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        C14360o3.A07(edit);
        edit.putString(str, str2);
        edit.apply();
    }

    public static final /* synthetic */ InterfaceC73587YMj access$getLogger$p() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LK0 getRecoveryCodeFromLegacyLocation(String str) {
        LK0 lk0 = new LK0();
        C1336761w c1336761w = backupManager;
        if (c1336761w == null) {
            C14360o3.A0F("backupManager");
            throw C00O.createAndThrow();
        }
        EnumC46305Keb enumC46305Keb = EnumC46305Keb.A05;
        C14360o3.A0B(str, 0);
        c1336761w.A00.A01(enumC46305Keb, str).A04(new LS8(lk0, str));
        return lk0;
    }

    public static final synchronized void initialize(Context context) {
        synchronized (LockBoxStorageManager.class) {
            C14360o3.A0B(context, 0);
            LockBoxStorageManager lockBoxStorageManager = INSTANCE;
            lockBoxInitializeCalled = true;
            if (backupManager == null) {
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                C14360o3.A07(googleApiAvailability);
                try {
                    if (googleApiAvailability.A03(context, 222116045) == 0) {
                        C1336761w c1336761w = new C1336761w(new C1336661v(C61O.A00(context)));
                        Map map = AbstractC1336861y.A00;
                        C14360o3.A0B(map, 1);
                        AnonymousClass623 anonymousClass623 = new AnonymousClass623(context, map);
                        sharedPreferences = context.getSharedPreferences("LockBoxStorageManager", 0);
                        lockBoxStorageManager.initialize(c1336761w, anonymousClass623);
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public static final synchronized Set lockBoxGetRemoteSecretsWithSource(String str, String str2) {
        Set lockBoxGetRemoteSecretsWithSource;
        synchronized (LockBoxStorageManager.class) {
            C14360o3.A0B(str, 0);
            C14360o3.A0B(str2, 1);
            lockBoxGetRemoteSecretsWithSource = INSTANCE.lockBoxGetRemoteSecretsWithSource(str, str2, true);
        }
        return lockBoxGetRemoteSecretsWithSource;
    }

    private final LK0 lockBoxGetSecretsJsonForOwnerAsync(String str) {
        LK0 lk0 = new LK0();
        C1336761w c1336761w = backupManager;
        if (c1336761w == null) {
            C14360o3.A0F("backupManager");
            throw C00O.createAndThrow();
        }
        EnumC46305Keb enumC46305Keb = EnumC46305Keb.A04;
        C14360o3.A0B(str, 0);
        c1336761w.A00.A01(enumC46305Keb, str).A04(new LS6(lk0));
        return lk0;
    }

    public static final boolean lockBoxIsAvailable() {
        return blockStoreAvailable;
    }

    private final void markEntrySaveSuccess() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveRecoveryCodeFromLegacyToLockBox(String str, String str2) {
        lockBoxSaveSecretAsync(str, "rc", str2).A04(new LS7(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nullableComplete(LK0 lk0, Object obj) {
        if (obj == null) {
            lk0.A03();
        } else {
            lk0.A05(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int parseBackupManagerResultToLockboxResult(AbstractC46361Kfj abstractC46361Kfj) {
        if (abstractC46361Kfj instanceof K53) {
            return 1;
        }
        if (abstractC46361Kfj instanceof K54) {
            return parseBlockStoreError(((K54) abstractC46361Kfj).A00);
        }
        return 0;
    }

    private final int parseBlockStoreError(Exception exc) {
        if (exc instanceof C46319Kep) {
            return 8;
        }
        if (exc instanceof C46116KbG) {
            return 10;
        }
        if (exc instanceof C46118KbI) {
            return 12;
        }
        if (!(exc instanceof C46117KbH)) {
            return 0;
        }
        return 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C47498KyR parseToJsonResult(AbstractC46360Kfi abstractC46360Kfi) {
        if (abstractC46360Kfi instanceof K50) {
            byte[] bArr = ((K50) abstractC46360Kfi).A00;
            C14360o3.A0B(bArr, 0);
            List A0R = AbstractC001900j.A0R(new String(bArr, C15W.A05), new String[]{";"}, 0);
            if (A0R.size() == 2) {
                String str = (String) A0R.get(1);
                C14360o3.A0B(str, 1);
                try {
                    return new C47498KyR(null, new JSONObject(str));
                } catch (JSONException unused) {
                    return new C47498KyR(7, null);
                }
            }
        }
        return new C47498KyR(null, new JSONObject());
    }

    public static final /* synthetic */ int access$parseBackupManagerResultToLockboxResult(LockBoxStorageManager lockBoxStorageManager, AbstractC46361Kfj abstractC46361Kfj) {
        return lockBoxStorageManager.parseBackupManagerResultToLockboxResult(abstractC46361Kfj);
    }

    public final void setLockBoxLogger(InterfaceC73587YMj interfaceC73587YMj) {
        logger = interfaceC73587YMj;
    }

    public static final /* synthetic */ void access$markEntrySaveFailed(LockBoxStorageManager lockBoxStorageManager, String str) {
    }

    public static final /* synthetic */ void access$nullableComplete(LockBoxStorageManager lockBoxStorageManager, LK0 lk0, Object obj) {
        lockBoxStorageManager.nullableComplete(lk0, obj);
    }

    private final String lockBoxGetRemoteSecret(String str, String str2, boolean z) {
        String str3;
        if (z && (str3 = (String) AbstractC1336861y.A02.get(str2)) != null) {
            str2 = str3;
        }
        if (AbstractC225179wg.A00(str2) == null) {
            return null;
        }
        AnonymousClass623 anonymousClass623 = shareKeyRetrieve;
        if (anonymousClass623 == null) {
            C14360o3.A0F("shareKeyRetrieve");
            throw C00O.createAndThrow();
        }
        C50679MYx c50679MYx = (C50679MYx) AbstractC001800i.A0A(anonymousClass623.A00(str, str2));
        if (c50679MYx == null) {
            return null;
        }
        return c50679MYx.A01;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.Kiz, java.lang.Object] */
    private final C46560Kiz lockBoxGetRemoteSecretWithSource(String str, String str2, boolean z) {
        String str3;
        if (z && (str3 = (String) AbstractC1336861y.A02.get(str2)) != null) {
            str2 = str3;
        }
        if (AbstractC225179wg.A00(str2) == null) {
            return null;
        }
        AnonymousClass623 anonymousClass623 = shareKeyRetrieve;
        if (anonymousClass623 == null) {
            C14360o3.A0F("shareKeyRetrieve");
            throw C00O.createAndThrow();
        }
        C50679MYx c50679MYx = (C50679MYx) AbstractC001800i.A0A(anonymousClass623.A00(str, str2));
        if (c50679MYx == null || c50679MYx.A01.length() <= 0 || AbstractC33639Etp.A00(c50679MYx.A00) == null) {
            return null;
        }
        return new Object();
    }

    private final Set lockBoxGetRemoteSecretsWithSource(String str, String str2, boolean z) {
        String str3;
        if (z && (str3 = (String) AbstractC1336861y.A02.get(str2)) != null) {
            str2 = str3;
        }
        if (AbstractC225179wg.A00(str2) == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AnonymousClass623 anonymousClass623 = shareKeyRetrieve;
        if (anonymousClass623 == null) {
            C14360o3.A0F("shareKeyRetrieve");
            throw C00O.createAndThrow();
        }
        for (C50679MYx c50679MYx : anonymousClass623.A00(str, str2)) {
            if (c50679MYx != null && c50679MYx.A01.length() > 0 && AbstractC33639Etp.A00(c50679MYx.A00) != null) {
                linkedHashSet.add(new Object());
            }
        }
        return linkedHashSet;
    }

    public static final LK0 lockBoxSaveSecretAsync(String str, String str2, String str3, AbstractC72473XeP abstractC72473XeP) {
        int ordinal;
        String str4;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        LK0 lk0 = new LK0();
        if (backupManager == null) {
            if (lockBoxInitializeCalled && !blockStoreAvailable) {
                lk0.A05(6);
                EnumC1336961z A00 = AbstractC225179wg.A00(str2);
                if (A00 == null || (((ordinal = A00.ordinal()) != 1 && ordinal != 2) || (str4 = (String) AbstractC1336861y.A01.get(AbstractC225179wg.A00(str2))) == null)) {
                    return lk0;
                }
                INSTANCE.storeEntryIntoSharedPreferences(str4, str3);
                return lk0;
            }
            lk0.A05(5);
            return lk0;
        }
        INSTANCE.lockBoxGetSecretsJsonForOwnerAsync(str).A04(new LSH(lk0, str2, str3, str));
        return lk0;
    }

    public final void initialize(C1336761w c1336761w, AnonymousClass623 anonymousClass623) {
        C14360o3.A0B(c1336761w, 0);
        C14360o3.A0B(anonymousClass623, 1);
        backupManager = c1336761w;
        shareKeyRetrieve = anonymousClass623;
        blockStoreAvailable = true;
        lockBoxInitializeCalled = true;
    }
}
