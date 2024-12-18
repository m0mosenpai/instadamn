package com.instagram.notifications.push;

import X.AbstractC31171DnF;
import X.AbstractC43591JPw;
import X.AbstractC58319PtB;
import X.C0b3;
import X.MSV;
import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes10.dex */
public class BloksNotificationService extends IntentService {
    public BloksNotificationService() {
        super("BloksNotificationService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            intent = AbstractC31171DnF.A04();
        }
        AbstractC58319PtB.A19(intent, getPackageName(), AbstractC43591JPw.A00(71));
        intent.setFlags(268435456);
        C0b3.A00().A08(MSV.A00(396)).A0G(this, intent);
    }
}
