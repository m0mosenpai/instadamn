package com.instagram.notifications.actions;

import X.AbstractC07490aO;
import X.AbstractC08070bT;
import X.AbstractC58322PtE;
import X.AnonymousClass001;
import X.C08310bt;
import X.C0f9;
import X.C14360o3;
import X.MSY;
import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ActionHandlerIntentService extends IntentService {
    public static final Set A02;
    public AbstractC07490aO A00;
    public String A01;

    public ActionHandlerIntentService() {
        super("ActionHandlerIntentService");
        this.A00 = AbstractC07490aO.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x01b8, code lost:
    
        if (r0 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r1 == 0) goto L24;
     */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onHandleIntent(android.content.Intent r28) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.notifications.actions.ActionHandlerIntentService.onHandleIntent(android.content.Intent):void");
    }

    static {
        Set A11 = AbstractC58322PtE.A11();
        C14360o3.A07(A11);
        A02 = A11;
    }

    @Override // android.app.IntentService, android.app.Service
    public final IBinder onBind(Intent intent) {
        boolean A00;
        if (C08310bt.A02().A00(this, intent, this)) {
            synchronized (this) {
                A00 = this.A00.A00(this, intent, null, this);
            }
            if (A00) {
                AbstractC08070bT.A00.A00(intent, this.A01, "onBind", "allow");
                return null;
            }
        }
        AbstractC08070bT.A00.A00(intent, this.A01, "onBind", "deny");
        return null;
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        int A04 = C0f9.A04(-2051509696);
        super.onCreate();
        this.A01 = AnonymousClass001.A0g(getPackageName(), "/", MSY.A0h(this));
        C0f9.A0B(-458026415, A04);
    }
}
