package com.instagram.libraries.access.accountmanager.service;

import X.AbstractC166987dD;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C58690Q0e;
import android.accounts.AbstractAccountAuthenticator;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes10.dex */
public final class InstagramAuthenticationService extends Service {
    public C58690Q0e A00;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C58690Q0e c58690Q0e = this.A00;
        if (c58690Q0e == null) {
            C14360o3.A0F("authenticator");
            throw C00O.createAndThrow();
        }
        IBinder iBinder = c58690Q0e.getIBinder();
        C14360o3.A07(iBinder);
        return iBinder;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Q0e, android.accounts.AbstractAccountAuthenticator] */
    @Override // android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-146608085);
        this.A00 = new AbstractAccountAuthenticator(AbstractC166987dD.A0O(this));
        C0f9.A0B(1617716298, A04);
    }
}
