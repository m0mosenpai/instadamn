package com.instagram.analytics.traffic;

import X.AbstractC12220kQ;
import X.AbstractC15820qc;
import X.C0f9;
import X.C14360o3;
import X.C15670qN;
import X.C18920wW;
import X.C1CY;
import X.C1VW;
import X.C218914p;
import X.C23441Cg;
import X.C50157MDk;
import X.C84243pG;
import X.C84263pJ;
import X.InterfaceC02590Ai;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC15680qO;
import android.content.Context;
import android.net.NetworkInfo;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class IGNetworkStateLogger implements InterfaceC12870lZ, InterfaceC13000lm, InterfaceC15680qO {
    public String A00;
    public C84263pJ A01;
    public final Context A02;
    public final C84243pG A03;
    public final C18920wW A04;
    public final UserSession A05;
    public final C23441Cg cellDiagnostics;

    public final synchronized void A00() {
        C84263pJ c84263pJ;
        if (!C218914p.A08()) {
            Context context = this.A02;
            if (C1VW.isLocationEnabled(context)) {
                String str = null;
                if (C1VW.isLocationPermitted(context, null, "NETWORK_STATE_LOGGER")) {
                    C18920wW c18920wW = this.A04;
                    InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "mobile_network_change_unified");
                    Pair A02 = AbstractC15820qc.A02(context);
                    String str2 = null;
                    if (C14360o3.A0K(A02.first, "mobile")) {
                        HashMap hashMap = new HashMap();
                        C1CY.A00().A0f(hashMap);
                        str = (String) hashMap.get("network_params");
                    }
                    C84243pG c84243pG = this.A03;
                    synchronized (c84243pG) {
                        c84263pJ = c84243pG.A00.latestSessionId;
                    }
                    this.A01 = c84263pJ;
                    if (c84263pJ != null) {
                        str2 = c84263pJ.A00();
                    }
                    A00.A9K("weight", 1L);
                    A00.AAP("connection_subtype", (String) A02.second);
                    A00.AAP("connection_type", (String) A02.first);
                    String str3 = this.A00;
                    if (str3 == null) {
                        str3 = "";
                    }
                    A00.AAP("app_network_change_id", str3);
                    if (str2 == null) {
                        str2 = "";
                    }
                    A00.AAP("app_net_session_id", str2);
                    if (str == null) {
                        str = "";
                    }
                    A00.AAP("network_params", str);
                    A00.Cht();
                }
            }
        }
    }

    @Override // X.InterfaceC12870lZ
    public final synchronized void onAppBackgrounded() {
        C0f9.A0A(1679812350, C0f9.A03(1672749439));
    }

    @Override // X.InterfaceC12870lZ
    public final synchronized void onAppForegrounded() {
        String updateAndGetLocationId;
        int A03 = C0f9.A03(-762898488);
        C84243pG c84243pG = this.A03;
        synchronized (c84243pG) {
            updateAndGetLocationId = c84243pG.A00.updateAndGetLocationId();
        }
        this.A00 = updateAndGetLocationId;
        A00();
        C0f9.A0A(-203265884, A03);
    }

    @Override // X.InterfaceC15680qO
    public final synchronized void onConnectionChanged(NetworkInfo networkInfo) {
        String updateAndGetLocationId;
        C84243pG c84243pG = this.A03;
        synchronized (c84243pG) {
            updateAndGetLocationId = c84243pG.A00.updateAndGetLocationId();
        }
        this.A00 = updateAndGetLocationId;
        A00();
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        C218914p.A06(this);
        C15670qN.A00(this);
    }

    public IGNetworkStateLogger(UserSession userSession) {
        this.A05 = userSession;
        this.A02 = userSession.deviceSession.A06();
        this.A04 = AbstractC12220kQ.A02(userSession);
        C23441Cg A00 = C1CY.A00();
        C14360o3.A07(A00);
        this.cellDiagnostics = A00;
        this.A03 = (C84243pG) userSession.A01(C84243pG.class, new C50157MDk(userSession, 36));
    }
}
