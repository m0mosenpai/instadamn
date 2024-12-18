package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1HA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HA implements C1G4 {
    public ConnectivityManager A00;
    public String A01;
    public String A02;
    public final C23441Cg A03;
    public final C19360xL A04;
    public final C1G4 A05;
    public final C19Q A06;
    public final AbstractC12990ll A07;
    public final boolean A08;

    public C1HA(C1G4 c1g4, AbstractC12990ll abstractC12990ll, boolean z) {
        C19360xL c19360xL;
        C1HC c1hc;
        if (z) {
            c19360xL = C19360xL.A00();
        } else {
            c19360xL = null;
        }
        this.A02 = null;
        this.A01 = null;
        this.A06 = new C19Q() { // from class: X.1HB
            @Override // X.C19Q, X.C19O
            public final void onResponseStarted(C1QW c1qw, C1QY c1qy, C3JQ c3jq) {
                C23781El A00;
                C1HA c1ha = C1HA.this;
                if (c1ha.A08 && (A00 = c3jq.A00("X-IG-Push-State")) != null) {
                    Integer A002 = AbstractC12370kf.A00(A00.A01);
                    C19360xL c19360xL2 = c1ha.A04;
                    if (c19360xL2 != null) {
                        Integer num = C05F.A00;
                        if (A002 == num) {
                            Lock lock = c19360xL2.A06;
                            lock.lock();
                            C19360xL.A02(c19360xL2, num);
                            int i = c19360xL2.A01;
                            boolean z2 = false;
                            if (i != -1) {
                                z2 = true;
                            }
                            try {
                                c19360xL2.A00 = 0;
                                c19360xL2.A02 = System.currentTimeMillis();
                                if (z2) {
                                    c19360xL2.A01 = i + 1;
                                }
                                c19360xL2.A05.set(false);
                                lock.unlock();
                            } catch (Throwable th) {
                                th = th;
                                lock.unlock();
                                C19360xL.A01(c19360xL2);
                                throw th;
                            }
                        } else {
                            Integer num2 = C05F.A01;
                            if (A002 == num2) {
                                Lock lock2 = c19360xL2.A06;
                                lock2.lock();
                                C19360xL.A02(c19360xL2, num2);
                                int i2 = c19360xL2.A00;
                                boolean z3 = false;
                                if (i2 != -1) {
                                    z3 = true;
                                }
                                boolean z4 = false;
                                if (c19360xL2.A01 != -1) {
                                    z4 = true;
                                }
                                if (z3) {
                                    try {
                                        c19360xL2.A00 = i2 + 1;
                                        c19360xL2.A05.set(false);
                                    } finally {
                                        th = th;
                                        lock2.unlock();
                                        if (!z3 && !z4) {
                                        }
                                        C19360xL.A01(c19360xL2);
                                        throw th;
                                    }
                                }
                                if (z4) {
                                    c19360xL2.A01++;
                                    c19360xL2.A05.set(false);
                                }
                                if (!z3 && !z4) {
                                    return;
                                }
                            } else {
                                Integer num3 = C05F.A0C;
                                if (A002 == num3) {
                                    Lock lock3 = c19360xL2.A06;
                                    lock3.lock();
                                    C19360xL.A02(c19360xL2, num3);
                                    try {
                                        c19360xL2.A01 = 0;
                                        c19360xL2.A05.set(false);
                                        lock3.unlock();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        lock3.unlock();
                                        C19360xL.A01(c19360xL2);
                                        throw th;
                                    }
                                } else {
                                    C0w9.A03("InstagramSpecificHeaderServiceLayer:unrecognized-tier", AnonymousClass001.A0R("tier=", A00.A01));
                                    return;
                                }
                            }
                        }
                        C19360xL.A01(c19360xL2);
                    }
                }
            }
        };
        this.A05 = c1g4;
        this.A08 = z;
        this.A04 = c19360xL;
        this.A03 = C1CY.A00();
        this.A07 = abstractC12990ll;
        Context context = AbstractC12290kX.A00;
        if (C20150ym.A07(AbstractC20100yh.A00(36325948626318875L))) {
            synchronized (C1HC.class) {
                synchronized (C1HC.A06) {
                    C14360o3.A0B(context, 0);
                    if (C1HC.A07 == null) {
                        C1HC.A07 = new C1HC(context);
                        try {
                            final C1HC c1hc2 = C1HC.A07;
                            if (c1hc2 == null) {
                                C14360o3.A0F("instance");
                                throw C00O.createAndThrow();
                            }
                            if (c1hc2.A00 == null) {
                                ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: X.1HE
                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onAvailable(Network network) {
                                        C14360o3.A0B(network, 0);
                                        C1HC c1hc3 = C1HC.this;
                                        ConnectivityManager connectivityManager = c1hc3.A01;
                                        if (connectivityManager != null) {
                                            C1HC.A00(connectivityManager.getLinkProperties(network), connectivityManager.getNetworkCapabilities(network), c1hc3);
                                        }
                                    }

                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                                        C14360o3.A0B(networkCapabilities, 1);
                                        C1HC.A00(null, networkCapabilities, C1HC.this);
                                    }

                                    @Override // android.net.ConnectivityManager.NetworkCallback
                                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                                        C14360o3.A0B(linkProperties, 1);
                                        C1HC.A00(linkProperties, null, C1HC.this);
                                    }
                                };
                                c1hc2.A00 = networkCallback;
                                c1hc2.A01.registerDefaultNetworkCallback(networkCallback);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    c1hc = C1HC.A07;
                    if (c1hc == null) {
                        C14360o3.A0F("instance");
                        throw C00O.createAndThrow();
                    }
                }
            }
            C1HF c1hf = new C1HF(this);
            c1hc.A02.add(c1hf);
            C9CH c9ch = c1hc.A04;
            c1hf.A00.A02 = c9ch.toString();
        }
    }

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        String str;
        String str2;
        java.net.URI uri = c1qw.A09;
        String host = uri.getHost();
        if (C1QD.A00(host) || (host != null && host.endsWith(".cdninstagram.com"))) {
            ConnectivityManager connectivityManager = this.A00;
            if (connectivityManager == null) {
                connectivityManager = (ConnectivityManager) AbstractC12290kX.A00.getSystemService("connectivity");
                this.A00 = connectivityManager;
            }
            NetworkInfo networkInfo = null;
            if (connectivityManager != null) {
                try {
                    networkInfo = connectivityManager.getActiveNetworkInfo();
                } catch (RuntimeException e) {
                    C0K8.A0F("InstagramSpecificHeaderServiceLayer", "Catch OS DeadSystemException", e);
                }
            }
            String A0A = AbstractC15820qc.A0A(networkInfo);
            String A0B = AbstractC15820qc.A0B(networkInfo);
            if ("MOBILE(LTE)".equals(A0A) && this.A03.A0R) {
                A0A = "MOBILE(NRNSA)";
                A0B = "MOBILE.NRNSA";
            }
            c1qw.A01("X-FB-Connection-Type", A0B);
            if (C1QD.A00(uri.getHost())) {
                c1qw.A01("X-IG-Connection-Type", A0A);
            }
            if ((C20150ym.A07(AbstractC20100yh.A00(36328057459194999L)) || C20150ym.A07(AbstractC20100yh.A00(36317212663747529L))) && ((str = this.A01) == null || !A0A.equals(str))) {
                this.A01 = A0A;
                C14120nc.A00().ATO(new C60944Rby(this));
            }
        }
        String host2 = uri.getHost();
        if ((C1QD.A00(host2) || (host2 != null && host2.endsWith(".cdninstagram.com"))) && (str2 = this.A02) != null && !str2.equals("")) {
            c1qw.A01("X-FB-Network-Properties", str2);
        }
        if (C1QD.A00(uri.getHost())) {
            c1qw.A01("X-IG-Capabilities", "3brTv10=");
            if (!c1qw.A02("X-IG-App-ID")) {
                c1qw.A01("X-IG-App-ID", "567067343352427");
            }
            if (this.A08) {
                c26511Qg.A01(this.A06);
            }
        }
        return this.A05.startRequest(c1qw, c1qy, c26511Qg);
    }
}
