package com.facebook.papaya.fb.instagram.transport;

import X.C09170dP;
import X.C14360o3;
import X.EnumC53210Ng8;
import X.JQ0;
import android.content.Context;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;
import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGAuthedTigonService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes9.dex */
public final class IgPapayaTransport extends ITransport {
    public IgPapayaTransport(Context context, UserSession userSession, ScheduledExecutorService scheduledExecutorService, String str, EnumC53210Ng8 enumC53210Ng8) {
        JQ0.A1O(context, userSession, scheduledExecutorService, str, enumC53210Ng8);
        C09170dP.A0C("papaya-ig4a-jni-transport");
        IGAuthedTigonService iGAuthedTigonService = IGAuthedTigonService.getInstance(userSession);
        C14360o3.A07(iGAuthedTigonService);
        initHybridTransport(iGAuthedTigonService, new AndroidAsyncExecutorFactory(scheduledExecutorService), "https://i.instagram.com/api/v1/papaya/", "PROD", str, enumC53210Ng8.A00);
    }

    private final native void initHybridTransport(TigonServiceHolder tigonServiceHolder, AndroidAsyncExecutorFactory androidAsyncExecutorFactory, String str, String str2, String str3, int i);
}
