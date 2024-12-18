package X;

import com.facebook.distribgw.client.DGWClient;
import com.facebook.graphql.rtgql.sdk.RealtimeGraphQLSDKProvider;
import com.facebook.graphql.rtgql.sdk.connection.RealtimeGraphQLDgwStreamGroupProvider;
import com.facebook.pando.ConnectionManager;
import com.facebook.pando.PandoConnectionService;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.pando.primaryexecution.analytics.PandoAnalyticsService;
import com.facebook.pando.primaryexecution.cache.PandoCacheService;
import com.facebook.pando.primaryexecution.cache.PandoCacheTimeoutService;
import com.facebook.pando.primaryexecution.cache.PandoResponseCache;
import com.facebook.pando.primaryexecution.cancelledcallbacks.PandoCancelledCallbacksService;
import com.facebook.pando.primaryexecution.livequery.PandoLiveQueryService;
import com.facebook.pando.primaryexecution.networksequencing.PandoNetworkSequencingService;
import com.facebook.realtime.config.RealtimeConfigSourceProxy;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.instagram.common.session.UserSession;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.graphql.rtgql.graphqllivequeries.sdk.IGGraphQLLiveQuerySDKProvider;
import com.instagram.realtime.requeststream.dgw.DGWRequestStreamClientHolder;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.9GA, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GA extends C0YY implements InterfaceC16820sZ {
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9GA(UserSession userSession, String str, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A04 = str;
        this.A02 = userSession;
        this.A00 = interfaceC09390do;
        this.A07 = z;
        this.A06 = z2;
        this.A03 = interfaceC09390do2;
        this.A01 = interfaceC09390do3;
        this.A05 = z3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.48F, java.lang.Object, X.4IQ] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str = this.A04;
        UserSession userSession = (UserSession) this.A02;
        PandoPrimaryExecution pandoPrimaryExecution = new PandoPrimaryExecution(PandoNetworkSequencingService.initHybridData(C40731ug.A00(userSession, str, true)));
        C48C c48c = RealtimeGraphQLSDKProvider.Companion;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        RealtimeGraphQLSDKProvider realtimeGraphQLSDKProvider = new RealtimeGraphQLSDKProvider(scheduledThreadPoolExecutor, ((C53642cq) C53642cq.A02.getValue()).A01);
        BaseRequestStreamClient baseRequestStreamClient = DGWRequestStreamClientHolder.getInstance(userSession).mClient;
        C14360o3.A07(baseRequestStreamClient);
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, userSession, 36889542824821598L);
        ?? obj = new Object();
        obj.A00 = C16910sj.A00;
        obj.A00 = AbstractC001800i.A0k(AbstractC001900j.A0R(A04, new String[]{";"}, 0));
        RealtimeGraphQLDgwStreamGroupProvider realtimeGraphQLDgwStreamGroupProvider = RealtimeGraphQLDgwStreamGroupProvider.$redex_init_class;
        DGWClient dGWClient = DGWClientHolder.Companion.A00(userSession).client;
        String str2 = C1F8.A00(userSession).A04;
        if (str2 == null) {
            str2 = "";
        }
        IGGraphQLLiveQuerySDKProvider iGGraphQLLiveQuerySDKProvider = new IGGraphQLLiveQuerySDKProvider(realtimeGraphQLSDKProvider, baseRequestStreamClient, obj, new RealtimeGraphQLDgwStreamGroupProvider(dGWClient, 6, str2, userSession.userId, C18U.A04(c06090Tz, userSession, 36889542824887135L), C18U.A04(c06090Tz, userSession, 36889542824952672L), C14250np.A00().A00));
        C4IW c4iw = PandoLiveQueryService.Companion;
        PandoPrimaryExecution pandoPrimaryExecution2 = new PandoPrimaryExecution(PandoLiveQueryService.initHybridData(pandoPrimaryExecution, iGGraphQLLiveQuerySDKProvider, new RealtimeConfigSourceProxy((C4IX) userSession.A01(C4IX.class, new C57241PbP(userSession, 0)))));
        InterfaceC09390do interfaceC09390do = (InterfaceC09390do) this.A00;
        boolean z = this.A07;
        boolean z2 = this.A06;
        C93594Ia c93594Ia = PandoCacheService.Companion;
        PandoResponseCache pandoResponseCache = (PandoResponseCache) interfaceC09390do.getValue();
        C14360o3.A0B(pandoResponseCache, 2);
        PandoPrimaryExecution pandoPrimaryExecution3 = new PandoPrimaryExecution(PandoCacheService.initHybridData(pandoPrimaryExecution2, pandoResponseCache, z, z2));
        InterfaceC09390do interfaceC09390do2 = (InterfaceC09390do) this.A03;
        C93624Ig c93624Ig = PandoCacheTimeoutService.Companion;
        PandoResponseCache pandoResponseCache2 = (PandoResponseCache) interfaceC09390do.getValue();
        Object value = interfaceC09390do2.getValue();
        C14360o3.A07(value);
        PandoCacheTimeoutService pandoCacheTimeoutService = new PandoCacheTimeoutService(pandoPrimaryExecution3, pandoResponseCache2, (ScheduledExecutorService) value);
        InterfaceC09390do interfaceC09390do3 = (InterfaceC09390do) this.A01;
        boolean z3 = this.A05;
        C4Ii c4Ii = PandoConnectionService.Companion;
        ConnectionManager connectionManager = (ConnectionManager) interfaceC09390do3.getValue();
        C14360o3.A0B(connectionManager, 2);
        return new PandoPrimaryExecution(PandoAnalyticsService.initHybridData(new PandoPrimaryExecution(PandoCancelledCallbacksService.initHybridData(new PandoPrimaryExecution(PandoConnectionService.initHybridData(pandoCacheTimeoutService, connectionManager, true, z3)))), 3213622));
    }
}
