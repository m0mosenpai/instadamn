package com.instagram.realtime.requeststream.dgw;

import X.C06090Tz;
import X.C0K8;
import X.C0r5;
import X.C12250kT;
import X.C14250np;
import X.C18U;
import X.C1F8;
import X.C53642cq;
import X.InterfaceC13000lm;
import X.InterfaceC16820sZ;
import com.facebook.distribgw.client.RequestOptions;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.realtime.requeststream.builder.LoggingConfig;
import com.facebook.realtime.requeststream.builder.RequestStreamBuilder;
import com.facebook.realtime.requeststream.builder.dgw.DGWWriterConfig;
import com.facebook.realtime.requeststream.builder.dgw.RequestStreamDGWBuilder;
import com.facebook.realtime.requeststream.builder.dgw.StreamGroupDecider;
import com.facebook.realtime.requeststream.client.SandboxConfigSource;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.instagram.common.session.UserSession;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;

/* loaded from: classes.dex */
public class DGWRequestStreamClientHolder implements InterfaceC13000lm {
    public static final String TAG = "DGWRequestStreamClientHolder";
    public final BaseRequestStreamClient mClient;

    public static synchronized DGWRequestStreamClientHolder getInstance(final UserSession userSession) {
        DGWRequestStreamClientHolder dGWRequestStreamClientHolder;
        synchronized (DGWRequestStreamClientHolder.class) {
            final String str = C1F8.A00(userSession).A04;
            if (str == null) {
                C0K8.A0E(TAG, "Auth token is null");
                str = "";
            }
            dGWRequestStreamClientHolder = (DGWRequestStreamClientHolder) userSession.A01(DGWRequestStreamClientHolder.class, new InterfaceC16820sZ() { // from class: X.2cl
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return DGWRequestStreamClientHolder.lambda$getInstance$0(UserSession.this, str);
                }
            });
        }
        return dGWRequestStreamClientHolder;
    }

    public static /* synthetic */ DGWRequestStreamClientHolder lambda$getInstance$0(UserSession userSession, String str) {
        SandboxConfigSource A00;
        RequestStreamDGWBuilder requestStreamDGWBuilder = RequestStreamDGWBuilder.$redex_init_class;
        RequestStreamDGWBuilder requestStreamDGWBuilder2 = new RequestStreamDGWBuilder(DGWClientHolder.getInstance(userSession).client, 6, str, userSession.userId, null, C14250np.A00().A00);
        C06090Tz c06090Tz = C06090Tz.A05;
        RequestStreamBuilder listenToAppState = requestStreamDGWBuilder2.withDGWStreamWriterConfig(new DGWWriterConfig(C18U.A01(c06090Tz, userSession, 36593138543297495L), false, true, true, true, true)).withDGWRequestOptions(new RequestOptions(null, null, null, null, null, Long.valueOf(C18U.A01(c06090Tz, userSession, 36593138543231958L)), null, null, null, false, false)).withStreamGroupDecider(new StreamGroupDecider() { // from class: X.0rJ
            @Override // com.facebook.realtime.requeststream.builder.dgw.StreamGroupDecider
            public final StreamGroupDecider.StreamGroupDecision getStreamGroupDecision(String str2) {
                return new StreamGroupDecider.StreamGroupDecision("all");
            }
        }).listenToAppState(((C53642cq) C53642cq.A02.getValue()).A01);
        synchronized (C0r5.class) {
            A00 = C0r5.A01.A00();
        }
        RequestStreamBuilder enableSandboxOverride = listenToAppState.enableSandboxOverride(A00);
        if (C18U.A06(c06090Tz, userSession, 36311663565275845L)) {
            XAnalyticsAdapterHolder xAnalyticsAdapterHolder = XAnalyticsAdapterHolder.$redex_init_class;
            enableSandboxOverride.enableE2ELogging(new LoggingConfig(new XAnalyticsAdapterHolder(new C12250kT(null, userSession, "IgXAnalyticsAdapter")), C18U.A00(c06090Tz, userSession, 37156088495865875L), C18U.A04(c06090Tz, userSession, 36874613519089714L), null, null));
        }
        if (C18U.A06(c06090Tz, userSession, 36311663565603527L)) {
            enableSandboxOverride.enableFlipperPlugin();
        }
        return new DGWRequestStreamClientHolder(enableSandboxOverride.buildNative());
    }

    public BaseRequestStreamClient getClient() {
        return this.mClient;
    }

    @Override // X.InterfaceC13000lm
    public void onSessionWillEnd() {
        this.mClient.onClientSessionEnded();
    }

    public DGWRequestStreamClientHolder(BaseRequestStreamClient baseRequestStreamClient) {
        this.mClient = baseRequestStreamClient;
    }
}
