package X;

import android.content.Context;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.log.gen.LogPersistenceProxy;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.turnallocation.gen.TurnAllocationProxy;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.rsys.proxies.IGRTCCallManager;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import com.instagram.rtc.rsys.proxies.LoggingProxy;
import java.util.Map;

/* renamed from: X.OFq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54739OFq {
    public C54551O8d A00;
    public final Context A01;
    public final CallManagerCallClient A02;
    public final C23324AVj A03;
    public final UserSession A04;
    public final OId A05;
    public final C54611OAm A06;
    public final O4Z A07;
    public final C54453O4h A08;
    public final O5J A09;
    public final IGRTCCallManager A0A;
    public final IGRTCSignalingCoordinator A0B;
    public final IGRTCSyncedClockHolder A0C;
    public final InterfaceC16660sJ A0D;
    public final InterfaceC16660sJ A0E;
    public final InterfaceC16660sJ A0F;
    public final InterfaceC16620sF A0G;
    public final CallManagerCallClientCallbacks A0H;

    public C54739OFq(Context context, CallManagerClient callManagerClient, CryptoContextHolder cryptoContextHolder, DevXAgentApi devXAgentApi, LargeLogUploadProxy largeLogUploadProxy, LogPersistenceProxy logPersistenceProxy, OverlayConfigManagerHolder overlayConfigManagerHolder, TurnAllocationProxy turnAllocationProxy, XAnalyticsHolder xAnalyticsHolder, C23324AVj c23324AVj, UserSession userSession, OId oId, C54611OAm c54611OAm, O4Z o4z, C54453O4h c54453O4h, O5J o5j, IGRTCSignalingCoordinator iGRTCSignalingCoordinator, IGRTCSyncedClockHolder iGRTCSyncedClockHolder, LoggingProxy loggingProxy, String str, Map map, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, InterfaceC16620sF interfaceC16620sF) {
        AbstractC167027dH.A13(c54611OAm, o4z, callManagerClient);
        C14360o3.A0B(map, 10);
        C14360o3.A0B(xAnalyticsHolder, 13);
        AbstractC25229BEm.A1P(oId, 15, c23324AVj);
        C14360o3.A0B(iGRTCSyncedClockHolder, 19);
        C14360o3.A0B(c54453O4h, 21);
        C14360o3.A0B(interfaceC16660sJ3, 25);
        this.A06 = c54611OAm;
        this.A07 = o4z;
        this.A05 = oId;
        this.A03 = c23324AVj;
        this.A01 = context;
        this.A04 = userSession;
        this.A0C = iGRTCSyncedClockHolder;
        this.A09 = o5j;
        this.A08 = c54453O4h;
        this.A0F = interfaceC16660sJ;
        this.A0G = interfaceC16620sF;
        this.A0D = interfaceC16660sJ2;
        this.A0E = interfaceC16660sJ3;
        C52001Myt c52001Myt = new C52001Myt(this);
        this.A0H = c52001Myt;
        this.A0B = iGRTCSignalingCoordinator;
        CallManagerCallClient createCallManager = CallManagerCallClient.CProxy.createCallManager(new CallManagerConfig(), callManagerClient, c52001Myt, devXAgentApi);
        C14360o3.A07(createCallManager);
        this.A02 = createCallManager;
        IGRTCCallManager createCallManager2 = IGRTCCallManager.CProxy.createCallManager(createCallManager, iGRTCSignalingCoordinator, str, loggingProxy, logPersistenceProxy, largeLogUploadProxy, overlayConfigManagerHolder, map, cryptoContextHolder, turnAllocationProxy, xAnalyticsHolder);
        C14360o3.A07(createCallManager2);
        this.A0A = createCallManager2;
    }
}
