package com.instagram.jobscheduler.bgfetch.scheduler;

import X.AbstractC18680vv;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.C023409i;
import X.C06090Tz;
import X.C08770cf;
import X.C0K8;
import X.C0f9;
import X.C107224sT;
import X.C14360o3;
import X.C18U;
import X.C2JW;
import X.C50164MDr;
import X.PZH;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class IgBgFetchTaskLifeService extends Service {
    public boolean A00;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        UserSession userSession;
        if (this.A00) {
            try {
                AbstractC18680vv A05 = C023409i.A0A.A05(this);
                if ((A05 instanceof UserSession) && (userSession = (UserSession) A05) != null) {
                    Context applicationContext = getApplicationContext();
                    C14360o3.A07(applicationContext);
                    C107224sT A00 = C2JW.A00(applicationContext, userSession);
                    if (A00 != null) {
                        C50164MDr c50164MDr = new C50164MDr(this, 29);
                        if (!C18U.A06(C06090Tz.A06, A00.A04, 36330131925189333L)) {
                            c50164MDr.invoke();
                            return;
                        } else {
                            AbstractC23641Du.A05(AnonymousClass191.A00, new PZH(c50164MDr, A00, null, 13), A00.A07);
                            return;
                        }
                    }
                    return;
                }
                stopSelf();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("scheduleBackgroundPrefetchJob error: ");
                sb.append(e);
                C0K8.A0C("IgBgFetchTaskLifeService", sb.toString());
                stopSelf();
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C0f9.A04(802068681);
        if (intent != null) {
            C08770cf.A01.A01(this, intent);
        }
        this.A00 = true;
        C0f9.A0B(-762590311, A04);
        return 0;
    }

    public static final void A00(IgBgFetchTaskLifeService igBgFetchTaskLifeService) {
        igBgFetchTaskLifeService.stopSelf();
    }
}
