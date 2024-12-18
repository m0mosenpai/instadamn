package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.NetworkRegistrationInfo;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.1Cg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23441Cg {
    public static boolean A0T;
    public SubscriptionManager A02;
    public C23411Cd A03;
    public boolean A04;
    public long A06;
    public long A07;
    public final Context A0G;
    public final C23411Cd A0H;
    public final C23421Ce A0I;
    public final C23431Cf A0J;
    public volatile boolean A0Q;
    public volatile boolean A0R;
    public volatile boolean A0S;
    public C101224gd A0B = null;
    public C23601Cz A0A = null;
    public C1DT A09 = null;
    public C23941Fe A08 = null;
    public SubscriptionManager.OnSubscriptionsChangedListener A01 = null;
    public PhoneStateListener A00 = null;
    public boolean A05 = true;
    public C54s A0C = null;
    public String A0D = "";
    public String A0E = "UNKNOWN";
    public boolean A0F = false;
    public final AtomicReference A0P = new AtomicReference();
    public final AtomicReference A0O = new AtomicReference();
    public final AtomicReference A0M = new AtomicReference();
    public final AtomicReference A0N = new AtomicReference();
    public final CopyOnWriteArraySet A0K = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0L = new CopyOnWriteArraySet();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r1 == 5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void A0J() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L59
            r2 = 0
            r0 = 29
            if (r3 < r0) goto L39
            boolean r0 = r4.A0S     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L38
            boolean r0 = r4.A0Q     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L1d
            X.1Ce r0 = r4.A0I     // Catch: java.lang.Throwable -> L59
            java.util.Set r1 = r0.A02     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L1d
            goto L38
        L1d:
            r0 = 30
            if (r3 < r0) goto L39
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0M     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L59
            android.telephony.TelephonyDisplayInfo r0 = (android.telephony.TelephonyDisplayInfo) r0     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L39
            int r1 = r0.getOverrideNetworkType()     // Catch: java.lang.Throwable -> L59
            r0 = 3
            if (r1 == r0) goto L38
            r0 = 4
            if (r1 == r0) goto L38
            r0 = 5
            if (r1 != r0) goto L39
        L38:
            r2 = 1
        L39:
            boolean r0 = r4.A0R     // Catch: java.lang.Throwable -> L59
            if (r2 == r0) goto L57
            r4.A0R = r2     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.CopyOnWriteArraySet r0 = r4.A0L     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L59
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L57
            r1.next()     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "onNrNsaStateChanged"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L59
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L59
            throw r0     // Catch: java.lang.Throwable -> L59
        L57:
            monitor-exit(r4)
            return
        L59:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23441Cg.A0J():void");
    }

    public static synchronized void A0U(C23441Cg c23441Cg) {
        PhoneStateListener phoneStateListener;
        Context context;
        synchronized (c23441Cg) {
            C23411Cd c23411Cd = c23441Cg.A0H;
            if (c23411Cd != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 31 && c23441Cg.A0I.A04) {
                    c23441Cg.A0I();
                } else {
                    C23411Cd c23411Cd2 = c23441Cg.A03;
                    if (c23411Cd2 != null && (phoneStateListener = c23441Cg.A00) != null) {
                        c23411Cd2.A07(phoneStateListener, 0);
                    }
                }
                int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
                if (defaultDataSubscriptionId != -1) {
                    c23441Cg.A03 = c23411Cd.A05(defaultDataSubscriptionId);
                }
                if (c23441Cg.A03 == null) {
                    c23441Cg.A03 = c23411Cd;
                }
                if (i >= 31 && c23441Cg.A0I.A04) {
                    c23441Cg.A0H();
                } else {
                    int i2 = 0;
                    if (c23441Cg.A0I.A05) {
                        Context context2 = c23441Cg.A0J.A00;
                        if (AbstractC23451Ch.A07(context2, "android.permission.READ_PHONE_STATE") && AbstractC23451Ch.A07(context2, "android.permission.ACCESS_FINE_LOCATION")) {
                            i2 = 1024;
                        }
                        if (i >= 29) {
                            i2 |= 256;
                        }
                    }
                    C23431Cf c23431Cf = c23441Cg.A0J;
                    Context context3 = c23431Cf.A00;
                    if (AbstractC23451Ch.A07(context3, "android.permission.ACCESS_COARSE_LOCATION")) {
                        i2 |= 1;
                    }
                    if (i >= 30 && (AbstractC23451Ch.A07(context3, "android.permission.READ_PHONE_STATE") || (i >= 31 && (context = c23441Cg.A0G) != null && context.getApplicationInfo().targetSdkVersion >= 31))) {
                        i2 |= 1048576;
                    }
                    if (i2 != 0) {
                        c23431Cf.A01.post(C0SX.A00(new RunnableC99984eL(c23441Cg, i2), "CellDiagnostics", 0));
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0X(X.C23411Cd r20) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23441Cg.A0X(X.1Cd):boolean");
    }

    public final synchronized void A0f(Map map) {
        C23411Cd c23411Cd;
        C23411Cd c23411Cd2 = this.A03;
        if (((c23411Cd2 != null && A0X(c23411Cd2)) || ((c23411Cd = this.A0H) != null && A0X(c23411Cd))) && this.A0C != null) {
            map.put("network_type_info", this.A0D);
            map.put("network_generation", this.A0E);
            map.put("network_params", this.A0C.toString());
            map.put("is_network_roaming", String.valueOf(this.A0F));
        }
    }

    public static int A00(String str) {
        if (str != null) {
            return Integer.parseInt(str);
        }
        return Integer.MAX_VALUE;
    }

    public static C1HX A07(CellIdentityNr cellIdentityNr) {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 30) {
            iArr = cellIdentityNr.getBands();
        } else {
            iArr = new int[0];
        }
        String A0G = A0G(cellIdentityNr.getMncString(), cellIdentityNr.getMccString(), cellIdentityNr.getNci());
        long nci = cellIdentityNr.getNci();
        return new C1HX("nr", A0G, cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), iArr, cellIdentityNr.getPci(), cellIdentityNr.getTac(), cellIdentityNr.getNrarfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, nci);
    }

    public static C103864m5 A09(CellInfo cellInfo) {
        C1HX A06;
        C1EQ A0B;
        String str;
        int cellConnectionStatus = cellInfo.getCellConnectionStatus();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            cellInfo.getTimestampMillis();
        } else {
            cellInfo.getTimeStamp();
        }
        C103864m5 c103864m5 = null;
        if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
            CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
            c103864m5 = new C103864m5(A07((CellIdentityNr) cellInfoNr.getCellIdentity()), A0C(null, (CellSignalStrengthNr) cellInfoNr.getCellSignalStrength()), "nr", cellConnectionStatus);
        }
        if (cellInfo instanceof CellInfoGsm) {
            CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            A06 = A05(cellInfoGsm.getCellIdentity());
            A0B = A0A(cellInfoGsm.getCellSignalStrength());
            str = "gsm";
        } else if (cellInfo instanceof CellInfoWcdma) {
            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            A06 = A08(cellInfoWcdma.getCellIdentity());
            int dbm = cellInfoWcdma.getCellSignalStrength().getDbm();
            str = "wcdma";
            A0B = new C1EQ("wcdma", dbm, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        } else {
            if (!(cellInfo instanceof CellInfoLte)) {
                return c103864m5;
            }
            CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            A06 = A06(cellInfoLte.getCellIdentity());
            A0B = A0B(cellInfoLte.getCellSignalStrength());
            str = "lte";
        }
        return new C103864m5(A06, A0B, str, cellConnectionStatus);
    }

    public static C1EQ A0A(CellSignalStrengthGsm cellSignalStrengthGsm) {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            i = cellSignalStrengthGsm.getRssi();
        } else {
            i = Integer.MAX_VALUE;
        }
        return new C1EQ("gsm", cellSignalStrengthGsm.getDbm(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, i, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static C1EQ A0C(CellSignalStrengthLte cellSignalStrengthLte, CellSignalStrengthNr cellSignalStrengthNr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (Build.VERSION.SDK_INT >= 34) {
            i = cellSignalStrengthNr.getTimingAdvanceMicros();
        } else {
            i = Integer.MAX_VALUE;
        }
        int dbm = cellSignalStrengthNr.getDbm();
        int csiRsrp = cellSignalStrengthNr.getCsiRsrp();
        int csiRsrq = cellSignalStrengthNr.getCsiRsrq();
        int csiSinr = cellSignalStrengthNr.getCsiSinr();
        int ssRsrp = cellSignalStrengthNr.getSsRsrp();
        int ssRsrq = cellSignalStrengthNr.getSsRsrq();
        int ssSinr = cellSignalStrengthNr.getSsSinr();
        if (cellSignalStrengthLte != null) {
            i2 = cellSignalStrengthLte.getRsrp();
            i3 = cellSignalStrengthLte.getRsrq();
            i4 = cellSignalStrengthLte.getRssnr();
            i5 = cellSignalStrengthLte.getRssi();
            i6 = cellSignalStrengthLte.getCqi();
            if (i == Integer.MAX_VALUE) {
                i = cellSignalStrengthLte.getTimingAdvance();
            }
        } else {
            i2 = Integer.MAX_VALUE;
            i3 = Integer.MAX_VALUE;
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            i6 = Integer.MAX_VALUE;
        }
        return new C1EQ("nr", dbm, csiRsrp, csiRsrq, csiSinr, ssRsrp, ssRsrq, ssSinr, i2, i3, i4, i5, i6, i);
    }

    private C103824m1 A0D(int i) {
        String str;
        String str2;
        int dataState;
        C23411Cd c23411Cd = this.A0H;
        String str3 = null;
        if (c23411Cd == null) {
            return null;
        }
        C23411Cd A05 = c23411Cd.A05(i);
        TelephonyManager telephonyManager = A05.A00;
        Integer valueOf = Integer.valueOf(telephonyManager.getSimCarrierId());
        CharSequence simCarrierIdName = telephonyManager.getSimCarrierIdName();
        String simCountryIso = telephonyManager.getSimCountryIso();
        String simOperator = telephonyManager.getSimOperator();
        String simOperatorName = telephonyManager.getSimOperatorName();
        if (simCarrierIdName != null) {
            str3 = simCarrierIdName.toString();
        }
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        String networkOperator = telephonyManager.getNetworkOperator();
        String networkOperatorName = telephonyManager.getNetworkOperatorName();
        boolean isNetworkRoaming = telephonyManager.isNetworkRoaming();
        String A0E = A0E(A05);
        int dataActivity = telephonyManager.getDataActivity();
        if (dataActivity != 1) {
            if (dataActivity != 2) {
                if (dataActivity != 3) {
                    if (dataActivity != 4) {
                        str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    } else {
                        str = "DORMANT";
                    }
                } else {
                    str = "INOUT";
                }
            } else {
                str = "OUT";
            }
        } else {
            str = "IN";
        }
        try {
            dataState = telephonyManager.getDataState();
        } catch (SecurityException unused) {
        }
        if (dataState == 0) {
            str2 = "DATA_DISCONNECTED";
        } else if (dataState != 1) {
            if (dataState != 2) {
                if (dataState == 3) {
                    str2 = "DATA_SUSPENDED";
                }
                str2 = "UNKNOWN";
            } else {
                str2 = "DATA_CONNECTED";
            }
        } else {
            str2 = "DATA_CONNECTING";
        }
        return new C103824m1(valueOf, simCountryIso, simOperator, simOperatorName, str3, networkCountryIso, networkOperator, networkOperatorName, A0E, str, str2, i, isNetworkRoaming);
    }

    private String A0E(C23411Cd c23411Cd) {
        int i;
        Context context = this.A0J.A00;
        if (!AbstractC23451Ch.A07(context, "android.permission.READ_PHONE_STATE") && (Build.VERSION.SDK_INT < 33 || !AbstractC23451Ch.A07(context, "android.permission.READ_BASIC_PHONE_STATE"))) {
            return "UNKNOWN";
        }
        try {
            i = c23411Cd.A00.getDataNetworkType();
        } catch (SecurityException unused) {
            i = 0;
        }
        return AbstractC103814m0.A00(i);
    }

    private void A0H() {
        Runnable runnable = new Runnable() { // from class: X.1Cs
            @Override // java.lang.Runnable
            public final void run() {
                C23601Cz c23601Cz;
                C23601Cz c23601Cz2;
                C23941Fe c23941Fe;
                C23941Fe c23941Fe2;
                C1DT c1dt;
                C1DT c1dt2;
                C1DT c1dt3;
                C101224gd c101224gd;
                C101224gd c101224gd2;
                C23441Cg c23441Cg = C23441Cg.this;
                if (c23441Cg.A03 != null && AsyncTask.SERIAL_EXECUTOR != null) {
                    Context context = c23441Cg.A0J.A00;
                    if (AbstractC23451Ch.A07(context, "android.permission.READ_PHONE_STATE") && AbstractC23451Ch.A07(context, "android.permission.ACCESS_FINE_LOCATION")) {
                        c101224gd = c23441Cg.A0B;
                        if (c101224gd == null) {
                            c23441Cg.A0B = new C101224gd(c23441Cg);
                        }
                        int i = Build.VERSION.SDK_INT;
                        C23411Cd c23411Cd = c23441Cg.A03;
                        Executor executor = AsyncTask.SERIAL_EXECUTOR;
                        c101224gd2 = c23441Cg.A0B;
                        if (i >= 33) {
                            c23411Cd.A0A(executor, c101224gd2);
                        } else {
                            c23411Cd.A09(executor, c101224gd2);
                        }
                    }
                    c23601Cz = c23441Cg.A0A;
                    if (c23601Cz == null) {
                        c23441Cg.A0A = new C23601Cz(c23441Cg);
                    }
                    C23411Cd c23411Cd2 = c23441Cg.A03;
                    Executor executor2 = AsyncTask.SERIAL_EXECUTOR;
                    c23601Cz2 = c23441Cg.A0A;
                    c23411Cd2.A09(executor2, c23601Cz2);
                    if (AbstractC23451Ch.A07(context, "android.permission.ACCESS_FINE_LOCATION")) {
                        c1dt = c23441Cg.A09;
                        if (c1dt == null) {
                            c23441Cg.A09 = new C1DT(c23441Cg);
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        C23411Cd c23411Cd3 = c23441Cg.A03;
                        if (i2 >= 33) {
                            c1dt3 = c23441Cg.A09;
                            c23411Cd3.A0A(executor2, c1dt3);
                        } else {
                            c1dt2 = c23441Cg.A09;
                            c23411Cd3.A09(executor2, c1dt2);
                        }
                    }
                    c23941Fe = c23441Cg.A08;
                    if (c23941Fe == null) {
                        c23441Cg.A08 = new C23941Fe(c23441Cg);
                    }
                    C23411Cd c23411Cd4 = c23441Cg.A03;
                    c23941Fe2 = c23441Cg.A08;
                    c23411Cd4.A09(executor2, c23941Fe2);
                }
            }
        };
        C23431Cf c23431Cf = this.A0J;
        c23431Cf.A01.post(C0SX.A00(runnable, "CellDiagnostics", 0));
    }

    private void A0I() {
        C23411Cd c23411Cd = this.A03;
        if (c23411Cd != null) {
            C101224gd c101224gd = this.A0B;
            if (c101224gd != null) {
                c23411Cd.A08(c101224gd);
            }
            C23601Cz c23601Cz = this.A0A;
            if (c23601Cz != null) {
                this.A03.A08(c23601Cz);
            }
            C1DT c1dt = this.A09;
            if (c1dt != null) {
                this.A03.A08(c1dt);
            }
            C23941Fe c23941Fe = this.A08;
            if (c23941Fe != null) {
                this.A03.A08(c23941Fe);
            }
        }
    }

    public static void A0M(ServiceState serviceState, C23441Cg c23441Cg) {
        c23441Cg.A0N.set(serviceState);
        if (Build.VERSION.SDK_INT == 29) {
            c23441Cg.A0S = serviceState.toString().contains("nrState=CONNECTED");
            c23441Cg.A0J();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x010c, code lost:
    
        if ((r0 - r2) > (r19.A0I.A01 * 1000)) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0N(android.telephony.SignalStrength r18, X.C23441Cg r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23441Cg.A0N(android.telephony.SignalStrength, X.1Cg):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(TelephonyDisplayInfo telephonyDisplayInfo) {
        this.A0M.set(telephonyDisplayInfo);
        A0J();
    }

    public static void A0V(C23441Cg c23441Cg, List list) {
        C1HX c1hx;
        CellInfo cellInfo;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                c1hx = null;
                if (it.hasNext()) {
                    cellInfo = (CellInfo) it.next();
                } else {
                    return;
                }
            } while (!cellInfo.isRegistered());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                cellInfo.getTimestampMillis();
            } else {
                cellInfo.getTimeStamp();
            }
            if (cellInfo instanceof CellInfoLte) {
                c1hx = A06(((CellInfoLte) cellInfo).getCellIdentity());
            } else if (cellInfo instanceof CellInfoWcdma) {
                c1hx = A08(((CellInfoWcdma) cellInfo).getCellIdentity());
            } else if (cellInfo instanceof CellInfoGsm) {
                c1hx = A05(((CellInfoGsm) cellInfo).getCellIdentity());
            } else if (cellInfo instanceof CellInfoCdma) {
                ((CellInfoCdma) cellInfo).getCellIdentity();
                c1hx = new C1HX("cdma");
            }
            if (i >= 29 && (cellInfo instanceof CellInfoNr)) {
                c1hx = A07((CellIdentityNr) ((CellInfoNr) cellInfo).getCellIdentity());
            }
            if (c1hx == null) {
                c1hx = new C1HX("unknown");
            }
            AtomicReference atomicReference = c23441Cg.A0P;
            if (!c1hx.equals(atomicReference.get())) {
                atomicReference.set(c1hx);
                Iterator it2 = c23441Cg.A0K.iterator();
                while (it2.hasNext()) {
                    ((C1HW) it2.next()).onCellIdentityChanged(c1hx);
                }
            }
        }
    }

    private void A0W(C54s c54s) {
        if (this.A0S) {
            c54s.A0F("nr_state", "CONNECTED");
        }
        String A0a = A0a();
        if (A0a != null) {
            c54s.A0F("override_network_type", A0a);
        }
        c54s.A0G("is_nr_nsa_signal_strength", this.A0Q);
    }

    public final int A0Y() {
        Context context = this.A0J.A00;
        if (!AbstractC23451Ch.A07(context, "android.permission.READ_PHONE_STATE") || !AbstractC23451Ch.A07(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return -1;
        }
        C23411Cd c23411Cd = this.A0H;
        if (c23411Cd != null) {
            List<CellInfo> A06 = c23411Cd.A06("CellDiagnostics");
            if (A06 == null) {
                return -1;
            }
            for (CellInfo cellInfo : A06) {
                if (cellInfo.isRegistered()) {
                    if (cellInfo instanceof CellInfoGsm) {
                        CellIdentityGsm cellIdentity = ((CellInfoGsm) cellInfo).getCellIdentity();
                        if (cellIdentity.getCid() != Integer.MAX_VALUE) {
                            return cellIdentity.getCid();
                        }
                    } else if (cellInfo instanceof CellInfoCdma) {
                        CellIdentityCdma cellIdentity2 = ((CellInfoCdma) cellInfo).getCellIdentity();
                        if (cellIdentity2.getBasestationId() != Integer.MAX_VALUE) {
                            return cellIdentity2.getBasestationId();
                        }
                    } else if (cellInfo instanceof CellInfoLte) {
                        CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
                        if (cellIdentity3.getCi() != Integer.MAX_VALUE) {
                            return cellIdentity3.getCi();
                        }
                    } else {
                        continue;
                    }
                }
            }
            return -1;
        }
        return 0;
    }

    public final C103834m2 A0Z() {
        int i;
        ArrayList arrayList;
        C103824m1 A0D;
        SubscriptionManager subscriptionManager;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (Build.VERSION.SDK_INT >= 30) {
            i = SubscriptionManager.getActiveDataSubscriptionId();
        } else {
            i = -1;
        }
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        int defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
        int defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
        int defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
        Context context = this.A0J.A00;
        boolean A07 = AbstractC23451Ch.A07(context, "android.permission.READ_PHONE_STATE");
        if (A07) {
            arrayList = new ArrayList();
            if (AbstractC23451Ch.A07(context, "android.permission.READ_PHONE_STATE") && (subscriptionManager = this.A02) != null && (activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList()) != null) {
                Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                while (it.hasNext()) {
                    C103824m1 A0D2 = A0D(it.next().getSubscriptionId());
                    if (A0D2 != null) {
                        arrayList.add(A0D2);
                    }
                }
            }
        } else {
            HashSet hashSet = new HashSet(Arrays.asList(Integer.valueOf(i), Integer.valueOf(defaultDataSubscriptionId), Integer.valueOf(defaultVoiceSubscriptionId), Integer.valueOf(defaultSmsSubscriptionId), Integer.valueOf(defaultSubscriptionId)));
            arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                int intValue = ((Number) it2.next()).intValue();
                if (intValue != -1 && (A0D = A0D(intValue)) != null) {
                    arrayList.add(A0D);
                }
            }
        }
        return new C103834m2((C103824m1[]) arrayList.toArray(new C103824m1[arrayList.size()]), defaultSubscriptionId, i, defaultDataSubscriptionId, defaultVoiceSubscriptionId, defaultSmsSubscriptionId, A07);
    }

    public final String A0a() {
        TelephonyDisplayInfo telephonyDisplayInfo;
        int overrideNetworkType;
        if (Build.VERSION.SDK_INT < 30 || (telephonyDisplayInfo = (TelephonyDisplayInfo) this.A0M.get()) == null || (overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType()) == 0) {
            return null;
        }
        if (overrideNetworkType != 1) {
            if (overrideNetworkType != 2) {
                if (overrideNetworkType != 3) {
                    if (overrideNetworkType != 4) {
                        if (overrideNetworkType != 5) {
                            return "UNKNOWN";
                        }
                        return "NR_ADVANCED";
                    }
                    return "NR_NSA_MMWAVE";
                }
                return "NR_NSA";
            }
            return "LTE_ADV_PRO";
        }
        return "LTE_CA";
    }

    public final String A0b() {
        ServiceState serviceState;
        if (Build.VERSION.SDK_INT >= 30) {
            synchronized (this) {
                serviceState = (ServiceState) this.A0N.get();
                if (serviceState == null) {
                    if (this.A05 && !C218914p.A08()) {
                        A0U(this);
                        this.A05 = false;
                    }
                    if (this.A03 != null) {
                        Context context = this.A0J.A00;
                        if (AbstractC23451Ch.A07(context, "android.permission.READ_PHONE_STATE") && AbstractC23451Ch.A07(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                            C23411Cd c23411Cd = this.A03;
                            serviceState = null;
                            if (!C23411Cd.A01(c23411Cd) && C23411Cd.A02(c23411Cd)) {
                                try {
                                    TelephonyManager telephonyManager = c23411Cd.A00;
                                    C0fZ c0fZ = C0fZ.$redex_init_class;
                                    if (C0T8.A01()) {
                                        try {
                                            ReadWriteLock readWriteLock = C0T8.A01;
                                            readWriteLock.readLock().lock();
                                            C0T7 c0t7 = C0T8.A00;
                                            if (c0t7 != null) {
                                                serviceState = c0t7.DJU(telephonyManager);
                                                readWriteLock.readLock().unlock();
                                            } else {
                                                readWriteLock.readLock().unlock();
                                            }
                                        } catch (Throwable th) {
                                            C0T8.A01.readLock().unlock();
                                            throw th;
                                        }
                                    } else {
                                        serviceState = telephonyManager.getServiceState();
                                    }
                                } catch (SecurityException unused) {
                                    serviceState = null;
                                }
                            }
                        }
                    }
                    serviceState = null;
                }
            }
            if (serviceState != null) {
                for (NetworkRegistrationInfo networkRegistrationInfo : serviceState.getNetworkRegistrationInfoList()) {
                    if (networkRegistrationInfo.isRegistered() && networkRegistrationInfo.getAvailableServices().contains(2)) {
                        return networkRegistrationInfo.getRegisteredPlmn();
                    }
                }
            }
        }
        return null;
    }

    public final ArrayList A0c() {
        C23411Cd c23411Cd;
        C103864m5 A09;
        ArrayList arrayList = null;
        if (Build.VERSION.SDK_INT >= 29 && (c23411Cd = this.A0H) != null && AbstractC23451Ch.A07(this.A0J.A00, "android.permission.ACCESS_COARSE_LOCATION")) {
            arrayList = new ArrayList();
            List<CellInfo> A06 = c23411Cd.A06("CellDiagnostics");
            if (A06 != null) {
                for (CellInfo cellInfo : A06) {
                    if (!cellInfo.isRegistered() && (cellInfo instanceof CellInfoNr) && (A09 = A09(cellInfo)) != null) {
                        arrayList.add(A09);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void A0d(C1HW c1hw) {
        this.A0K.add(c1hw);
        C1HX c1hx = (C1HX) this.A0P.get();
        if (c1hx != null) {
            c1hw.onCellIdentityChanged(c1hx);
        }
        C1EQ c1eq = (C1EQ) this.A0O.get();
        if (c1eq != null) {
            c1hw.onCellSignalStrengthChanged(c1eq);
        }
    }

    public final void A0e(Map map) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i;
        Context context = this.A0G;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
            boolean z = false;
            if (connectivityManager.isActiveNetworkMetered()) {
                int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                if (restrictBackgroundStatus != 1) {
                    if (restrictBackgroundStatus != 2) {
                        if (restrictBackgroundStatus != 3) {
                            i = -1;
                        } else {
                            i = 1;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 0;
                }
                map.put("data_saver", i);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                if (networkCapabilities.hasCapability(11) || networkCapabilities.hasCapability(25)) {
                    z = true;
                }
                map.put("unmetered", Boolean.valueOf(z));
            }
            map.put("upstream_bandwidth_kbps", Integer.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()));
            map.put("downstream_bandwidth_kbps", Integer.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()));
            map.put("is_congested", Boolean.valueOf(!networkCapabilities.hasCapability(20)));
        }
    }

    public final boolean A0g() {
        if (this.A0I.A05 && Build.VERSION.SDK_INT >= 29) {
            Context context = this.A0J.A00;
            if (AbstractC23451Ch.A07(context, "android.permission.READ_PHONE_STATE") && AbstractC23451Ch.A07(context, "android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
        }
        return false;
    }

    public C23441Cg(Context context, C23411Cd c23411Cd, C23421Ce c23421Ce, C23431Cf c23431Cf) {
        this.A0H = c23411Cd;
        this.A0I = c23421Ce;
        this.A0J = c23431Cf;
        this.A0G = context;
        A0T = c23421Ce.A03;
        if (context != null) {
            this.A02 = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        }
        C23431Cf c23431Cf2 = this.A0J;
        if (AbstractC23451Ch.A07(c23431Cf2.A00, "android.permission.READ_PHONE_STATE")) {
            c23431Cf2.A01.post(C0SX.A00(new C42Z(this), "CellDiagnostics", 0));
        }
        A0U(this);
        if (Build.VERSION.SDK_INT >= 29 && this.A0I.A00 > 0) {
            this.A04 = true;
            String str = Build.VERSION.RELEASE;
            if (str != null && str.equals("10")) {
                this.A04 = false;
                String[] split = Build.ID.split("\\.");
                if (split.length > 2) {
                    try {
                        if (Integer.parseInt(split[1]) >= 200305) {
                            this.A04 = true;
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.A04 = false;
    }

    public static C1HX A05(CellIdentityGsm cellIdentityGsm) {
        String mccString = cellIdentityGsm.getMccString();
        String mncString = cellIdentityGsm.getMncString();
        return new C1HX("gsm", A0G(mncString, mccString, cellIdentityGsm.getCid()), mccString, mncString, new int[0], Integer.MAX_VALUE, cellIdentityGsm.getLac(), cellIdentityGsm.getArfcn(), Integer.MAX_VALUE, Integer.MAX_VALUE, cellIdentityGsm.getCid());
    }

    public static C1HX A06(CellIdentityLte cellIdentityLte) {
        long j;
        int[] iArr;
        if (cellIdentityLte.getCi() != Integer.MAX_VALUE) {
            j = cellIdentityLte.getCi();
        } else {
            j = Long.MAX_VALUE;
        }
        String mccString = cellIdentityLte.getMccString();
        String mncString = cellIdentityLte.getMncString();
        int earfcn = cellIdentityLte.getEarfcn();
        if (Build.VERSION.SDK_INT >= 30) {
            iArr = cellIdentityLte.getBands();
        } else {
            iArr = new int[0];
        }
        return new C1HX("lte", A0G(mncString, mccString, j), mccString, mncString, iArr, cellIdentityLte.getPci(), cellIdentityLte.getTac(), earfcn, Integer.MAX_VALUE, cellIdentityLte.getBandwidth(), j);
    }

    public static C1HX A08(CellIdentityWcdma cellIdentityWcdma) {
        String mccString = cellIdentityWcdma.getMccString();
        String mncString = cellIdentityWcdma.getMncString();
        return new C1HX("wcdma", A0G(mncString, mccString, cellIdentityWcdma.getCid()), mccString, mncString, new int[0], Integer.MAX_VALUE, cellIdentityWcdma.getLac(), cellIdentityWcdma.getUarfcn(), cellIdentityWcdma.getPsc(), Integer.MAX_VALUE, cellIdentityWcdma.getCid());
    }

    public static C1EQ A0B(CellSignalStrengthLte cellSignalStrengthLte) {
        int i;
        int rsrp = cellSignalStrengthLte.getRsrp();
        int rsrq = cellSignalStrengthLte.getRsrq();
        int rssnr = cellSignalStrengthLte.getRssnr();
        int cqi = cellSignalStrengthLte.getCqi();
        if (Build.VERSION.SDK_INT >= 29) {
            i = cellSignalStrengthLte.getRssi();
        } else {
            i = Integer.MAX_VALUE;
        }
        return new C1EQ("lte", cellSignalStrengthLte.getDbm(), Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, rsrp, rsrq, rssnr, i, cqi, cellSignalStrengthLte.getTimingAdvance());
    }

    public static String A0F(C23411Cd c23411Cd, C23441Cg c23441Cg) {
        String A0E = c23441Cg.A0E(c23411Cd);
        if ("UNKNOWN".equals(A0E)) {
            String str = (String) AbstractC15820qc.A02(c23441Cg.A0J.A00).second;
            if (!str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
                return str.toUpperCase(Locale.US);
            }
            return A0E;
        }
        return A0E;
    }

    public static String A0G(String str, String str2, long j) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(AnonymousClass001.A11(Long.toString(j), InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, str2).getBytes()), 0);
        } catch (NoSuchAlgorithmException unused) {
            return "anonymized";
        }
    }

    public static void A0K(CellIdentityNr cellIdentityNr, C54s c54s) {
        int length;
        String mccString = cellIdentityNr.getMccString();
        if (mccString != null) {
            c54s.A0F("nr_mcc", mccString);
        }
        String mncString = cellIdentityNr.getMncString();
        if (mncString != null) {
            c54s.A0F("nr_mnc", mncString);
        }
        long nci = cellIdentityNr.getNci();
        if (nci != Long.MAX_VALUE) {
            c54s.A0E("nr_nci", nci);
        }
        int nrarfcn = cellIdentityNr.getNrarfcn();
        if (nrarfcn != Integer.MAX_VALUE) {
            c54s.A0D("nr_nrarfcn", nrarfcn);
        }
        int pci = cellIdentityNr.getPci();
        if (pci != Integer.MAX_VALUE) {
            c54s.A0D("nr_pci", pci);
        }
        int tac = cellIdentityNr.getTac();
        if (tac != Integer.MAX_VALUE) {
            c54s.A0D("nr_tac", tac);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            int[] bands = cellIdentityNr.getBands();
            if (bands != null && (length = bands.length) > 0) {
                StringBuilder sb = new StringBuilder(length * 5);
                sb.append(bands[0]);
                for (int i = 1; i < length; i++) {
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                    sb.append(bands[i]);
                }
                c54s.A0F("bands", sb.toString());
            }
            java.util.Set<String> additionalPlmns = cellIdentityNr.getAdditionalPlmns();
            if (additionalPlmns != null && !additionalPlmns.isEmpty()) {
                c54s.A0F("additional_plmns", AbstractC93184Fu.A00(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, additionalPlmns));
            }
        }
    }

    public static void A0L(CellSignalStrengthNr cellSignalStrengthNr, C54s c54s) {
        c54s.A0D("signal_asu_level", cellSignalStrengthNr.getAsuLevel());
        c54s.A0D("signal_dbm", cellSignalStrengthNr.getDbm());
        c54s.A0D("signal_level", cellSignalStrengthNr.getLevel());
        int csiRsrp = cellSignalStrengthNr.getCsiRsrp();
        if (csiRsrp != Integer.MAX_VALUE) {
            c54s.A0D("nr_csi_rsrp", csiRsrp);
        }
        int csiRsrq = cellSignalStrengthNr.getCsiRsrq();
        if (csiRsrq != Integer.MAX_VALUE) {
            c54s.A0D("nr_csi_rsrq", csiRsrq);
        }
        int csiSinr = cellSignalStrengthNr.getCsiSinr();
        if (csiSinr != Integer.MAX_VALUE) {
            c54s.A0D("nr_csi_sinr", csiSinr);
        }
        int ssRsrp = cellSignalStrengthNr.getSsRsrp();
        if (ssRsrp != Integer.MAX_VALUE) {
            c54s.A0D("nr_ss_rsrp", ssRsrp);
        }
        int ssRsrq = cellSignalStrengthNr.getSsRsrq();
        if (ssRsrq != Integer.MAX_VALUE) {
            c54s.A0D("nr_ss_rsrq", ssRsrq);
        }
        int ssSinr = cellSignalStrengthNr.getSsSinr();
        if (ssSinr != Integer.MAX_VALUE) {
            c54s.A0D("nr_ss_sinr", ssSinr);
        }
    }
}
