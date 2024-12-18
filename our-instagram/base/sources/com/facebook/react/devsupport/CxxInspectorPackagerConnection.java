package com.facebook.react.devsupport;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC37303Gc4;
import X.AbstractC61529Rp5;
import X.AbstractC63404SjZ;
import X.C62458SCl;
import X.C62459SCm;
import X.C62696SMk;
import X.C62950SYs;
import X.C62999SaN;
import X.C63026Saw;
import X.C63201Sf4;
import X.C65140TeF;
import X.EnumC61215RhF;
import X.InterfaceC65604Tnt;
import X.InterfaceC65605Tnu;
import X.InterfaceC65606Tnv;
import X.STX;
import X.SUL;
import X.SZM;
import X.THK;
import X.TIU;
import X.TIY;
import X.TVx;
import X.TWI;
import android.os.Handler;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes10.dex */
public abstract class CxxInspectorPackagerConnection {
    public final HybridData mHybridData;

    /* loaded from: classes10.dex */
    public class DelegateImpl {
        public final Handler mHandler;
        public final TIY mHttpClient;

        public DelegateImpl() {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            C62950SYs c62950SYs = new C62950SYs();
            List list = TIY.A0R;
            List list2 = TIY.A0Q;
            C62459SCm c62459SCm = new C62459SCm(SUL.A00);
            ProxySelector proxySelector = ProxySelector.getDefault();
            proxySelector = proxySelector == null ? new ProxySelector() : proxySelector;
            InterfaceC65605Tnu interfaceC65605Tnu = InterfaceC65605Tnu.A00;
            SocketFactory socketFactory = SocketFactory.getDefault();
            TVx tVx = TVx.A00;
            C63201Sf4 c63201Sf4 = C63201Sf4.A02;
            InterfaceC65604Tnt interfaceC65604Tnt = InterfaceC65604Tnt.A00;
            C62458SCl c62458SCl = new C62458SCl();
            InterfaceC65606Tnv interfaceC65606Tnv = InterfaceC65606Tnv.A00;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.mHttpClient = new TIY(proxySelector, list2, A1E, A1E2, list, socketFactory, tVx, interfaceC65604Tnt, interfaceC65604Tnt, c63201Sf4, c62458SCl, interfaceC65605Tnu, c62950SYs, interfaceC65606Tnv, c62459SCm, AbstractC63404SjZ.A02(timeUnit, 10L), AbstractC63404SjZ.A02(TimeUnit.MINUTES, 0L), AbstractC63404SjZ.A02(timeUnit, 10L));
            this.mHandler = AbstractC167007dF.A0J();
        }

        public THK connectWebSocket(String str, WebSocketDelegate webSocketDelegate) {
            C62999SaN c62999SaN = new C62999SaN();
            c62999SaN.A01(str);
            C62696SMk A00 = c62999SaN.A00();
            TIY tiy = this.mHttpClient;
            C65140TeF c65140TeF = new C65140TeF(this, webSocketDelegate);
            List list = SZM.A0M;
            Random random = new Random();
            int i = tiy.A02;
            SZM szm = new SZM(random, A00, c65140TeF, i);
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            C62950SYs c62950SYs = tiy.A0J;
            Proxy proxy = tiy.A05;
            List list2 = tiy.A07;
            A1E.addAll(tiy.A08);
            A1E2.addAll(tiy.A09);
            ProxySelector proxySelector = tiy.A06;
            InterfaceC65605Tnu interfaceC65605Tnu = tiy.A0I;
            SocketFactory socketFactory = tiy.A0B;
            SSLSocketFactory sSLSocketFactory = tiy.A0D;
            AbstractC61529Rp5 abstractC61529Rp5 = tiy.A0M;
            HostnameVerifier hostnameVerifier = tiy.A0C;
            C63201Sf4 c63201Sf4 = tiy.A0G;
            InterfaceC65604Tnt interfaceC65604Tnt = tiy.A0F;
            InterfaceC65604Tnt interfaceC65604Tnt2 = tiy.A0E;
            C62458SCl c62458SCl = tiy.A0H;
            InterfaceC65606Tnv interfaceC65606Tnv = tiy.A0K;
            boolean z = tiy.A0O;
            boolean z2 = tiy.A0N;
            boolean z3 = tiy.A0P;
            int i2 = tiy.A00;
            int i3 = tiy.A01;
            int i4 = tiy.A03;
            int i5 = tiy.A04;
            C62459SCm c62459SCm = new C62459SCm(SUL.A00);
            ArrayList A1F = AbstractC166987dD.A1F(SZM.A0M);
            EnumC61215RhF enumC61215RhF = EnumC61215RhF.H2_PRIOR_KNOWLEDGE;
            if (!A1F.contains(enumC61215RhF) && !A1F.contains(EnumC61215RhF.HTTP_1_1)) {
                throw AbstractC37303Gc4.A0M(A1F, "protocols must contain h2_prior_knowledge or http/1.1: ", AbstractC166987dD.A1C());
            }
            if (A1F.contains(enumC61215RhF) && A1F.size() > 1) {
                throw AbstractC37303Gc4.A0M(A1F, "protocols containing h2_prior_knowledge cannot use other protocols: ", AbstractC166987dD.A1C());
            }
            if (!A1F.contains(EnumC61215RhF.HTTP_1_0)) {
                if (!A1F.contains(null)) {
                    A1F.remove(EnumC61215RhF.SPDY_3);
                    TIY tiy2 = new TIY(proxy, proxySelector, list2, A1E, A1E2, Collections.unmodifiableList(A1F), socketFactory, hostnameVerifier, sSLSocketFactory, interfaceC65604Tnt2, interfaceC65604Tnt, c63201Sf4, c62458SCl, interfaceC65605Tnu, c62950SYs, interfaceC65606Tnv, c62459SCm, abstractC61529Rp5, i2, i3, i, i4, i5, z2, z, z3);
                    C62999SaN c62999SaN2 = new C62999SaN(szm.A0K);
                    c62999SaN2.A02("Upgrade", "websocket");
                    c62999SaN2.A02("Connection", "Upgrade");
                    c62999SaN2.A02("Sec-WebSocket-Key", szm.A0G);
                    c62999SaN2.A02("Sec-WebSocket-Version", "13");
                    C62696SMk A002 = c62999SaN2.A00();
                    TIU tiu = new TIU(tiy2, A002, true);
                    tiu.A00 = new C63026Saw(tiy2, tiu);
                    szm.A07 = tiu;
                    tiu.A00(new TWI(A002, szm));
                    return new THK(this, szm);
                }
                throw AbstractC166987dD.A12("protocols must not contain null");
            }
            throw AbstractC37303Gc4.A0M(A1F, "protocols must not contain http/1.0: ", AbstractC166987dD.A1C());
        }

        public void scheduleCallback(Runnable runnable, long j) {
            this.mHandler.postDelayed(runnable, j);
        }
    }

    /* loaded from: classes10.dex */
    public class WebSocketDelegate implements Closeable {
        public final HybridData mHybridData;

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didReceiveMessage(String str);

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mHybridData.resetNative();
        }

        public WebSocketDelegate(HybridData hybridData) {
            this.mHybridData = hybridData;
        }
    }

    public static native HybridData initHybrid(String str, String str2, String str3, DelegateImpl delegateImpl);

    public native void closeQuietly();

    public native void connect();

    public native void sendEventToAllConnections(String str);

    static {
        STX.A00();
    }
}
