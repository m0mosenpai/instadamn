package X;

import ca.psiphon.PsiphonTunnel;
import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import java.util.List;

/* renamed from: X.OmX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55594OmX implements PsiphonTunnel.HostService {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public final PsiphonTunnel A04 = PsiphonTunnel.newPsiphonTunnel(this);
    public final ProxyServiceBroadcaster A05 = ProxyServiceBroadcaster.instance;
    public final InterfaceExecutorServiceC58314Pt6 A06;

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ Object getVpnService() {
        return PsiphonTunnel.HostService.CC.$default$getVpnService(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostLibraryLoader
    public final void loadLibrary(String str) {
        C14360o3.A0B(str, 0);
        C09170dP.A0C(str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ Object newVpnServiceBuilder() {
        return PsiphonTunnel.HostService.CC.$default$newVpnServiceBuilder(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onActiveAuthorizationIDs(List list) {
        PsiphonTunnel.HostService.CC.$default$onActiveAuthorizationIDs(this, list);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onApplicationParameter(String str, Object obj) {
        PsiphonTunnel.HostService.CC.$default$onApplicationParameter(this, str, obj);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onAvailableEgressRegions(List list) {
        PsiphonTunnel.HostService.CC.$default$onAvailableEgressRegions(this, list);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onBytesTransferred(long j, long j2) {
        PsiphonTunnel.HostService.CC.$default$onBytesTransferred(this, j, j2);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final void onClientAddress(String str) {
        C14360o3.A0B(str, 0);
        A00(new C57258Pbg(str, this, 29));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onClientIsLatestVersion() {
        PsiphonTunnel.HostService.CC.$default$onClientIsLatestVersion(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final void onClientRegion(String str) {
        C14360o3.A0B(str, 0);
        A00(new C57258Pbg(str, this, 30));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onClientUpgradeDownloaded(String str) {
        PsiphonTunnel.HostService.CC.$default$onClientUpgradeDownloaded(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onHomepage(String str) {
        PsiphonTunnel.HostService.CC.$default$onHomepage(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onHttpProxyPortInUse(int i) {
        PsiphonTunnel.HostService.CC.$default$onHttpProxyPortInUse(this, i);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final void onListeningHttpProxyPort(int i) {
        A00(new C57249PbX(i, 4, this));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final void onListeningSocksProxyPort(int i) {
        A00(new C57249PbX(i, 5, this));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onServerAlert(String str, String str2, List list) {
        PsiphonTunnel.HostService.CC.$default$onServerAlert(this, str, str2, list);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onSocksProxyPortInUse(int i) {
        PsiphonTunnel.HostService.CC.$default$onSocksProxyPortInUse(this, i);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onSplitTunnelRegions(List list) {
        PsiphonTunnel.HostService.CC.$default$onSplitTunnelRegions(this, list);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onStartedWaitingForNetworkConnectivity() {
        PsiphonTunnel.HostService.CC.$default$onStartedWaitingForNetworkConnectivity(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onStoppedWaitingForNetworkConnectivity() {
        PsiphonTunnel.HostService.CC.$default$onStoppedWaitingForNetworkConnectivity(this);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onTrafficRateLimits(long j, long j2) {
        PsiphonTunnel.HostService.CC.$default$onTrafficRateLimits(this, j, j2);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onUntunneledAddress(String str) {
        PsiphonTunnel.HostService.CC.$default$onUntunneledAddress(this, str);
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final /* synthetic */ void onUpstreamProxyError(String str) {
        PsiphonTunnel.HostService.CC.$default$onUpstreamProxyError(this, str);
    }

    public final void A00(InterfaceC16820sZ interfaceC16820sZ) {
        this.A06.execute(new PL1(interfaceC16820sZ));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final void onConnected() {
        A00(new C57238PbM(this, 44));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final void onConnecting() {
        A00(new C57238PbM(this, 45));
    }

    @Override // ca.psiphon.PsiphonTunnel.HostService
    public final void onExiting() {
        A00(new C57238PbM(this, 46));
    }

    public AbstractC55594OmX(InterfaceExecutorServiceC58314Pt6 interfaceExecutorServiceC58314Pt6) {
        this.A06 = interfaceExecutorServiceC58314Pt6;
    }
}
