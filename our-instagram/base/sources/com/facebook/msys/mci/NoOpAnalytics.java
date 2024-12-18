package com.facebook.msys.mci;

import X.AbstractC43591JPw;
import X.C72203XVx;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class NoOpAnalytics implements Analytics {
    @Override // com.facebook.msys.mci.Analytics
    public void log(int i, int i2, boolean z, String str, String str2, long j, Map map, Map map2, List list) {
    }

    @Override // com.facebook.msys.mci.Analytics
    public EventLogSubscriber getTalEventSubscriber() {
        return new C72203XVx(this, new String[]{AbstractC43591JPw.A00(105), "CarrierMessaging", "FBBroker", "TAM", AbstractC43591JPw.A00(255), "Interop"});
    }
}
