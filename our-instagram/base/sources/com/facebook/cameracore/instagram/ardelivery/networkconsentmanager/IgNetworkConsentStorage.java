package com.facebook.cameracore.instagram.ardelivery.networkconsentmanager;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.C0K8;
import X.C18C;
import X.C1AT;
import X.C1AU;
import X.C1AV;
import X.InterfaceC13050lr;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.TSN;
import X.TW0;
import X.TZL;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.common.util.TriState;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes10.dex */
public class IgNetworkConsentStorage implements InterfaceC13050lr, NetworkConsentStorage {
    public static final int MAX_ENTRIES = 1000;
    public static final String TAG = "IgNetworkConsentStorage";
    public final InterfaceC19630xq mAccessTsPrefs;
    public final InterfaceC19630xq mUserConsentPrefs;

    @Override // X.InterfaceC13050lr
    public void onUserSessionWillEnd(boolean z) {
    }

    public static IgNetworkConsentStorage getInstance(UserSession userSession) {
        return (IgNetworkConsentStorage) userSession.A01(IgNetworkConsentStorage.class, new TW0(userSession, 7));
    }

    public static /* synthetic */ IgNetworkConsentStorage lambda$getInstance$0(UserSession userSession) {
        return new IgNetworkConsentStorage(userSession);
    }

    private void maybeTrimEntries() {
        Map all = this.mAccessTsPrefs.getAll();
        if (all.size() > 1000) {
            TSN tsn = new TSN(this, 1);
            int size = all.size() - 1000;
            C18C.A0E(AbstractC167007dF.A1O(size));
            Set emptySet = Collections.emptySet();
            TZL tzl = new TZL(tsn, size, TZL.initialQueueSize(-1, size, emptySet));
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                tzl.offer(it.next());
            }
            tzl.addAll(all.entrySet());
            Iterator<E> it2 = tzl.iterator();
            while (it2.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it2);
                InterfaceC19610xo ARD = this.mAccessTsPrefs.ARD();
                ARD.EEj(AbstractC31172DnG.A17(A1K));
                ARD.apply();
                InterfaceC19610xo ARD2 = this.mUserConsentPrefs.ARD();
                ARD2.EEj(AbstractC31172DnG.A17(A1K));
                ARD2.apply();
            }
        }
    }

    @Override // com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage
    public void clearAllUserConsent() {
        InterfaceC19610xo ARD = this.mUserConsentPrefs.ARD();
        ARD.AHW();
        ARD.apply();
        InterfaceC19610xo ARD2 = this.mAccessTsPrefs.ARD();
        ARD2.AHW();
        ARD2.apply();
    }

    @Override // com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage
    public TriState getUserConsent(String str) {
        if (!this.mUserConsentPrefs.contains(str)) {
            return TriState.UNSET;
        }
        InterfaceC19610xo ARD = this.mAccessTsPrefs.ARD();
        ARD.E7G(str, System.currentTimeMillis());
        ARD.apply();
        return TriState.valueOf(this.mUserConsentPrefs.getBoolean(str, false));
    }

    public IgNetworkConsentStorage(UserSession userSession) {
        C1AU A01 = C1AT.A01(userSession);
        this.mUserConsentPrefs = A01.A03(C1AV.A2H);
        this.mAccessTsPrefs = A01.A03(C1AV.A2G);
    }

    @Override // com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage
    public void saveUserConsent(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            C0K8.A0E(TAG, "saveUserConsent() called with empty cache key!");
            return;
        }
        InterfaceC19610xo ARD = this.mUserConsentPrefs.ARD();
        ARD.E77(str, z);
        ARD.apply();
        InterfaceC19610xo ARD2 = this.mAccessTsPrefs.ARD();
        ARD2.E7G(str, System.currentTimeMillis());
        ARD2.apply();
        maybeTrimEntries();
    }
}
