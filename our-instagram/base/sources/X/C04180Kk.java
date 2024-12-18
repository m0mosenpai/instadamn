package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import com.instagram.common.session.UserSession;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.0Kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04180Kk extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04180Kk(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        return new AbstractC211911v(context) { // from class: X.13e
            public final Context A00;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "AppBackgroundListenerInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                C24231Gs.A00().A01(AbstractC26351Pq.A00);
                boolean z = C218914p.A05;
                C18150uz.A0B.A02();
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C1AD.A06(c06090Tz, 18314324665712373L)) {
                    Context context2 = this.A00;
                    C14360o3.A0B(context2, 0);
                    if (AbstractC15820qc.A0G(context2)) {
                        C108404uR c108404uR = AbstractC15820qc.A03;
                        if (c108404uR == null) {
                            c108404uR = C15840qe.A00(context2);
                        }
                        WifiInfo A01 = c108404uR.A01();
                        if (A01 != null) {
                            AbstractC15820qc.A01 = WifiManager.calculateSignalLevel(A01.getRssi(), 5);
                        }
                        AbstractC15820qc.A03 = c108404uR;
                    } else if (AbstractC15820qc.A02 == null) {
                        final C23411Cd A00 = C1CZ.A00(context2, null);
                        AbstractC15820qc.A02 = new PhoneStateListener() { // from class: X.0qa
                            @Override // android.telephony.PhoneStateListener
                            public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
                                C14360o3.A0B(signalStrength, 0);
                                super.onSignalStrengthsChanged(signalStrength);
                                AbstractC15820qc.A00 = signalStrength.getLevel();
                            }
                        };
                        new Handler(C1CG.A00()).post(new Runnable() { // from class: X.0qb
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23411Cd c23411Cd = C23411Cd.this;
                                if (c23411Cd != null) {
                                    c23411Cd.A07(AbstractC15820qc.A02, 256);
                                }
                            }
                        });
                    }
                }
                InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.1Pt
                    @Override // X.InterfaceC12870lZ
                    public final void onAppBackgrounded() {
                        int A03 = C0f9.A03(1804575611);
                        long currentTimeMillis = System.currentTimeMillis();
                        C19740y2 A002 = AbstractC19730y1.A00(AbstractC12960li.A00);
                        double A003 = C1FP.A00();
                        StringBuilder sb = new StringBuilder();
                        sb.append("ConnectionManagerHistoricalData:mData=");
                        sb.append(A003);
                        sb.append(", mTimestamp=");
                        sb.append(currentTimeMillis);
                        String obj = sb.toString();
                        double A012 = C1FP.A01();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("ConnectionManagerHistoricalData:mData=");
                        sb2.append(A012);
                        sb2.append(", mTimestamp=");
                        sb2.append(currentTimeMillis);
                        String obj2 = sb2.toString();
                        InterfaceC19610xo ARD = A002.A00.ARD();
                        ARD.E7K("cm_last_bandwidth", obj);
                        ARD.E7K("cm_last_latency", obj2);
                        ARD.apply();
                        C0f9.A0A(-260725079, A03);
                    }

                    @Override // X.InterfaceC12870lZ
                    public final void onAppForegrounded() {
                        C0f9.A0A(1404416687, C0f9.A03(1338827528));
                    }
                };
                EnumC220415e enumC220415e = EnumC220415e.A03;
                C218914p.A03(enumC220415e, interfaceC12870lZ);
                C218914p.A03(enumC220415e, new InterfaceC12870lZ() { // from class: X.1Pw
                    @Override // X.InterfaceC12870lZ
                    public final void onAppBackgrounded() {
                        C0f9.A0A(-433623983, C0f9.A03(-359150246));
                    }

                    @Override // X.InterfaceC12870lZ
                    public final void onAppForegrounded() {
                        int A03 = C0f9.A03(-1205211377);
                        AbstractC12440km.A00 = false;
                        C0f9.A0A(-1757892476, A03);
                    }
                });
                C24231Gs A002 = C24231Gs.A00();
                C14360o3.A07(A002);
                final Context context3 = this.A00;
                A002.A01(new C26431Py(context3, C12L.A00));
                A002.A01(new C1Q0(context3));
                A002.A01(new InterfaceC13060ls(context3) { // from class: X.0w6
                    public boolean A00;
                    public final Context A01;

                    {
                        C14360o3.A0B(context3, 1);
                        this.A01 = context3;
                    }

                    @Override // X.InterfaceC13060ls
                    public final void Cww(AbstractC12990ll abstractC12990ll) {
                    }

                    @Override // X.InterfaceC13060ls
                    public final void Cwy(AbstractC12990ll abstractC12990ll) {
                        final ConnectivityManager connectivityManager;
                        C14360o3.A0B(abstractC12990ll, 0);
                        if ((abstractC12990ll instanceof UserSession) && !this.A00 && C18U.A06(C06090Tz.A05, abstractC12990ll, 36318033004926807L)) {
                            this.A00 = true;
                            Object systemService = this.A01.getSystemService("connectivity");
                            if ((systemService instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) systemService) != null) {
                                try {
                                    connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), new ConnectivityManager.NetworkCallback() { // from class: X.0lU
                                        @Override // android.net.ConnectivityManager.NetworkCallback
                                        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                                            String str;
                                            String str2;
                                            C14360o3.A0B(network, 0);
                                            C14360o3.A0B(networkCapabilities, 1);
                                            super.onCapabilitiesChanged(network, networkCapabilities);
                                            C0Mq c0Mq = C04770Mv.A00;
                                            NetworkInfo A03 = C18150uz.A0B.A01().A03();
                                            C10850hu c10850hu = C0LK.A7g;
                                            if (networkCapabilities.hasTransport(1)) {
                                                str = "WIFI";
                                            } else if (networkCapabilities.hasTransport(0)) {
                                                str = "CELLULAR";
                                            } else {
                                                str = null;
                                            }
                                            String str3 = "UNKNOWN";
                                            if (str == null) {
                                                str = "UNKNOWN";
                                            }
                                            C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                                            c0Mq.A02(c10850hu, c0m6, str);
                                            char c = 1;
                                            if (!networkCapabilities.hasTransport(1)) {
                                                c = 0;
                                                if (!networkCapabilities.hasTransport(0)) {
                                                    c = 65535;
                                                }
                                            }
                                            C10850hu c10850hu2 = C0LK.A7f;
                                            if (c == 0) {
                                                if (A03 == null || (str2 = A03.getSubtypeName()) == null) {
                                                    str2 = "UNKNOWN";
                                                }
                                                c0Mq.A02(c10850hu2, c0m6, str2);
                                            } else {
                                                c0Mq.A01(c10850hu2, c0m6);
                                            }
                                            if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                                                if (networkCapabilities.hasCapability(11)) {
                                                    str3 = "EXCELLENT";
                                                } else {
                                                    if (A03 != null) {
                                                        int type = A03.getType();
                                                        int subtype = A03.getSubtype();
                                                        if (type == 1 || type != 0 || (subtype != 1 && subtype != 2 && subtype != 4 && subtype != 7 && subtype != 11)) {
                                                            str3 = "GOOD";
                                                        }
                                                    }
                                                    str3 = "POOR";
                                                }
                                            }
                                            c0Mq.A02(C0LK.A5B, c0m6, str3);
                                            String valueOf = String.valueOf(C1FP.A00());
                                            if (valueOf.length() > 15) {
                                                valueOf = valueOf.substring(0, 15);
                                                C14360o3.A07(valueOf);
                                            }
                                            c0Mq.A02(C0LK.A59, c0m6, valueOf);
                                            String valueOf2 = String.valueOf(C1FP.A01());
                                            if (valueOf2.length() > 15) {
                                                valueOf2 = valueOf2.substring(0, 15);
                                                C14360o3.A07(valueOf2);
                                            }
                                            c0Mq.A02(C0LK.A5A, c0m6, valueOf2);
                                        }
                                    });
                                } catch (SecurityException unused) {
                                    C0K8.A0E("NetworkStatsForErrorReporting", "SecurityException thrown when trying to register network callback.This is caused by a known bug in Android 11 and before");
                                }
                                C18150uz.A0B.A03(new InterfaceC15680qO() { // from class: X.0w8
                                    @Override // X.InterfaceC15680qO
                                    public final void onConnectionChanged(NetworkInfo networkInfo) {
                                        if (networkInfo == null || networkInfo.getState() == NetworkInfo.State.DISCONNECTED) {
                                            C0Mq c0Mq = C04770Mv.A00;
                                            C10850hu c10850hu = C0LK.A7g;
                                            C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                                            c0Mq.A01(c10850hu, c0m6);
                                            c0Mq.A01(C0LK.A7f, c0m6);
                                            c0Mq.A01(C0LK.A59, c0m6);
                                            c0Mq.A01(C0LK.A5A, c0m6);
                                            c0Mq.A02(C0LK.A5B, c0m6, "DISCONNECTED");
                                        }
                                    }
                                });
                            }
                        }
                    }
                });
                A002.A01(new C1Q7(context3, C1AD.A06(c06090Tz, 18296311572857073L)));
                A002.A01(new C19240x6(context3, C1Q8.A00, C1Q9.A01(), 21600L));
                A002.A01(new InterfaceC13060ls(context3) { // from class: X.1Qj
                    public final Context A00;

                    {
                        C14360o3.A0B(context3, 1);
                        this.A00 = context3;
                    }

                    @Override // X.InterfaceC13060ls
                    public final void Cww(AbstractC12990ll abstractC12990ll) {
                        int floor;
                        C14360o3.A0B(abstractC12990ll, 0);
                        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36313978552453482L)) {
                            EnumC33317EoC enumC33317EoC = EnumC33317EoC.A03;
                            String[] strArr = enumC33317EoC.A02;
                            Date date = enumC33317EoC.A01;
                            Date date2 = enumC33317EoC.A00;
                            Context context4 = this.A00;
                            C45325K4d c45325K4d = new C45325K4d(context4, abstractC12990ll);
                            C1UM A003 = new C1U5(context4).A00().A00("fdid_oe_exposure_time");
                            C1UI A004 = new C1U5(context4).A00();
                            C95F c95f = AK1.A00;
                            Date time = Calendar.getInstance().getTime();
                            C14360o3.A07(time);
                            C1UM A005 = A004.A00("fdid_oe");
                            String A006 = c45325K4d.A00();
                            if (!time.before(date) && !time.after(date2) && !C18U.A06(C06090Tz.A06, abstractC12990ll, 36313978552519019L) && A006 != null) {
                                int i = A005.getInt(AK1.A01("fdid_oe_aa_test"), -1);
                                if (i == -1) {
                                    String A0R = AnonymousClass001.A0R(A006, "fdid_oe_aa_test");
                                    C14360o3.A0B(A0R, 0);
                                    String A007 = C0JT.A00(A0R);
                                    C14360o3.A07(A007);
                                    String substring = A007.substring(A007.length() - 15);
                                    C14360o3.A07(substring);
                                    i = (int) (Long.parseLong(substring, 16) % 10000);
                                    C1UP c1up = (C1UP) A005;
                                    C1UP.A03(c1up);
                                    C1ZT c1zt = new C1ZT(c1up);
                                    c1zt.A07(AK1.A01("fdid_oe_aa_test"), i);
                                    c1zt.A0B();
                                }
                                if (i >= 0 && (floor = (int) Math.floor(i / 500)) < 3 && floor >= 0) {
                                    C12210kP c12210kP = new C12210kP(abstractC12990ll);
                                    c12210kP.A01(C12180kM.A05);
                                    C18920wW A008 = c12210kP.A00();
                                    C25531Mh c25531Mh = new C25531Mh(A008.A00(A008.A00, "fdid_offline_experiment_exposure"), 155);
                                    if (!strArr[floor].equals("not_in_experiment") && A003 != null && ((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                                        c25531Mh.A0R("exp_name", "fdid_oe_aa_test");
                                        c25531Mh.A0R("exp_group", strArr[floor]);
                                        c25531Mh.A0R("family_device_id", A006);
                                        c25531Mh.Cht();
                                        C1UP c1up2 = (C1UP) A003;
                                        C1UP.A03(c1up2);
                                        C1ZT c1zt2 = new C1ZT(c1up2);
                                        c1zt2.A08(AK1.A00("fdid_oe_aa_test"), System.currentTimeMillis());
                                        c1zt2.A0B();
                                    }
                                }
                            }
                        }
                    }

                    @Override // X.InterfaceC13060ls
                    public final void Cwy(AbstractC12990ll abstractC12990ll) {
                    }
                });
                A002.A01(new InterfaceC13060ls() { // from class: X.1Qk
                    @Override // X.InterfaceC13060ls
                    public final void Cww(AbstractC12990ll abstractC12990ll) {
                    }

                    @Override // X.InterfaceC13060ls
                    public final void Cwy(AbstractC12990ll abstractC12990ll) {
                        C14360o3.A0B(abstractC12990ll, 0);
                        if (abstractC12990ll instanceof UserSession) {
                            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3Jc
                                @Override // java.lang.Runnable
                                public final void run() {
                                }
                            });
                        }
                    }
                });
            }
        };
    }
}
