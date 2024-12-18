package com.facebook.msys.mcp.authdatastorageplugin;

import X.AbstractC167007dF;
import X.C0K8;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.AuthDataStorage;

/* loaded from: classes8.dex */
public class MsysAuthDataStoragePluginSessionless extends Sessionless {
    private boolean checkAuthDataStorageReadiness() {
        boolean z = AuthDataStorage.sInitialized;
        if (!z) {
            C0K8.A0C("MsysAuthDataStorage", "AuthDataStorage is not initialized.");
        }
        return z;
    }

    private boolean checkAuthDataValid(AuthData authData) {
        return AbstractC167007dF.A1W(authData.getFacebookUserID());
    }

    @Override // com.facebook.msys.mcp.authdatastorageplugin.Sessionless
    public Object MsysAuthDataStorageImpl_MsysAuthDataStorageGetCopy(AuthData authData, String str) {
        if (AbstractC167007dF.A1W(authData.getFacebookUserID()) && checkAuthDataStorageReadiness()) {
            return AuthDataStorage.getFromRawKey(str);
        }
        return null;
    }

    @Override // com.facebook.msys.mcp.authdatastorageplugin.Sessionless
    public void MsysAuthDataStorageImpl_MsysAuthDataStorageReset(AuthData authData) {
        if (AbstractC167007dF.A1W(authData.getFacebookUserID()) && checkAuthDataStorageReadiness()) {
            AuthDataStorage.resetFromFacebookUserId(authData.getFacebookUserID());
        }
    }

    @Override // com.facebook.msys.mcp.authdatastorageplugin.Sessionless
    public void MsysAuthDataStorageImpl_MsysAuthDataStorageSet(AuthData authData, String str, Object obj) {
        if (AbstractC167007dF.A1W(authData.getFacebookUserID()) && checkAuthDataStorageReadiness()) {
            AuthDataStorage.setWithRawKey(str, obj);
        }
    }
}
