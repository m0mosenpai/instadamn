package X;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.DeadSystemException;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Pair;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SiN, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63364SiN {
    public int A00;
    public List A01;
    public final C62177S0y A02;
    public final C3Uj A03;
    public final RealtimeSinceBootClock A04;
    public final InterfaceC65366Tiy A05;
    public final InterfaceC65366Tiy A06;
    public final C62831STd A07;
    public final C62700SMo A08;
    public final C63306ShC A09;
    public final C62973SZs A0A;
    public final C63363SiM A0B;
    public final C63006SaU A0C;
    public final InterfaceC65564Tmq A0D;
    public final C63293Sgt A0E;
    public final SOJ A0F;
    public final C62619SJc A0G;
    public final Long A0H;
    public final ExecutorService A0J;
    public final AtomicInteger A0K;
    public final boolean A0L;
    public final SBZ A0M;
    public final S18 A0N;
    public final S19 A0O;
    public volatile long A0P;
    public volatile long A0V;
    public volatile NetworkInfo A0W;
    public volatile C62488SDp A0X;
    public volatile String A0Z;
    public volatile Map A0b;
    public static final EnumSet A0c = EnumSet.of(EnumC61173RgZ.ACKNOWLEDGED_DELIVERY, EnumC61173RgZ.PROCESSING_LASTACTIVE_PRESENCEINFO, EnumC61173RgZ.EXACT_KEEPALIVE, EnumC61173RgZ.DELTA_SENT_MESSAGE_ENABLED, EnumC61173RgZ.USE_THRIFT_FOR_INBOX, EnumC61173RgZ.USE_ENUM_TOPIC);
    public static final AtomicInteger A0e = MSW.A1C(1);
    public static final HashSet A0d = AbstractC58319PtB.A13(new String[]{"/t_rtc", RealtimeConstants.MQTT_TOPIC_RTC_MULTI});
    public volatile long A0Q = Long.MAX_VALUE;
    public volatile long A0U = Long.MAX_VALUE;
    public volatile long A0T = Long.MAX_VALUE;
    public volatile long A0S = Long.MAX_VALUE;
    public volatile long A0R = Long.MAX_VALUE;
    public volatile Integer A0Y = C05F.A0N;
    public volatile String A0a = NetInfoModule.CONNECTION_TYPE_NONE;
    public final Map A0I = AbstractC166987dD.A1G();

    public static void A02(C63364SiN c63364SiN) {
        long j = c63364SiN.A0G.A03 * 1000;
        synchronized (c63364SiN) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            while (true) {
                Integer num = c63364SiN.A0Y;
                if (num != C05F.A00 && num != C05F.A01) {
                    break;
                }
                long A0B = j - AbstractC58318PtA.A0B(elapsedRealtime);
                if (A0B <= 0) {
                    break;
                } else {
                    c63364SiN.wait(A0B);
                }
            }
        }
    }

    public static void A03(C63364SiN c63364SiN, EnumC61139Rft enumC61139Rft, RhR rhR, Throwable th) {
        AbstractC64515THi c60547R6k;
        boolean A1a;
        AbstractC64515THi abstractC64515THi;
        boolean z;
        String str;
        int intExtra;
        C0K8.A0P("MqttClient", "connection/disconnecting; reason=%s, operation=%s", rhR, enumC61139Rft);
        synchronized (c63364SiN) {
            try {
                if (!c63364SiN.A04()) {
                    return;
                }
                C62488SDp c62488SDp = c63364SiN.A0X;
                c63364SiN.A0E.A03();
                C63363SiM c63363SiM = c63364SiN.A0B;
                T1G t1g = (T1G) c63363SiM.A05(C60548R6l.class);
                EnumC61222Rii enumC61222Rii = EnumC61222Rii.A08;
                t1g.A03(enumC61222Rii, rhR.name());
                C62465SCs c62465SCs = c63363SiM.A01;
                ((T1G) c63363SiM.A05(C60548R6l.class)).A01(enumC61222Rii).toString();
                List list = c62465SCs.A00;
                synchronized (list) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        it.next();
                        throw AbstractC166987dD.A15("onMqttNetworkDisconnect");
                    }
                }
                c63363SiM.A00.A02.set(SystemClock.elapsedRealtime());
                ((AtomicLong) ((T1G) c63363SiM.A05(C60551R6o.class)).A01(EnumC61223Rij.MqttTotalDurationMs)).addAndGet(SystemClock.elapsedRealtime() - c63364SiN.A0V);
                C63306ShC c63306ShC = c63364SiN.A09;
                AbstractC64515THi A00 = c63364SiN.A00(c63364SiN.A0Q);
                AbstractC64515THi A002 = c63364SiN.A00(c63364SiN.A0U);
                AbstractC64515THi A003 = c63364SiN.A00(c63364SiN.A0T);
                AbstractC64515THi A004 = c63364SiN.A00(c63364SiN.A0S);
                String obj = rhR.toString();
                obj.getClass();
                String obj2 = enumC61139Rft.toString();
                obj2.getClass();
                if (th == null) {
                    c60547R6k = C60546R6j.A00;
                } else {
                    c60547R6k = new C60547R6k(th);
                }
                long j = c63364SiN.A0V;
                long j2 = c63364SiN.A0C.A06.get();
                NetworkInfo networkInfo = c63364SiN.A0W;
                InterfaceC65366Tiy interfaceC65366Tiy = c63364SiN.A05;
                if (interfaceC65366Tiy == null) {
                    A1a = false;
                } else {
                    A1a = AbstractC166987dD.A1a(interfaceC65366Tiy.get());
                }
                HashMap A1G = AbstractC166987dD.A1G();
                boolean z2 = true;
                if (Settings.Global.getInt(c63306ShC.A00.getContentResolver(), "airplane_mode_on", 0) == 0) {
                    z2 = false;
                }
                A1G.put("is_airplane_mode_on", String.valueOf(z2));
                try {
                    Intent A005 = C0DJ.A00(null, c63306ShC.A02.A00, new IntentFilter(MSV.A00(173)));
                    if (A005 == null) {
                        abstractC64515THi = C60546R6j.A00;
                    } else {
                        int intExtra2 = A005.getIntExtra(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, -1);
                        boolean z3 = true;
                        boolean z4 = true;
                        if (intExtra2 != 2) {
                            z4 = false;
                            if (intExtra2 == 5) {
                                intExtra = A005.getIntExtra("level", -1);
                                int intExtra3 = A005.getIntExtra("scale", -1);
                                if (intExtra == -1 && intExtra3 != -1) {
                                    abstractC64515THi = new C60547R6k(new C62547SFy(C60547R6k.A00(Integer.valueOf((int) ((intExtra / intExtra3) * 100.0f))), z4, z3));
                                } else {
                                    abstractC64515THi = new C60547R6k(new C62547SFy(C60546R6j.A00, z4, z3));
                                }
                            }
                        }
                        z3 = false;
                        intExtra = A005.getIntExtra("level", -1);
                        int intExtra32 = A005.getIntExtra("scale", -1);
                        if (intExtra == -1) {
                        }
                        abstractC64515THi = new C60547R6k(new C62547SFy(C60546R6j.A00, z4, z3));
                    }
                } catch (IllegalArgumentException | SecurityException unused) {
                    abstractC64515THi = C60546R6j.A00;
                } catch (RuntimeException e) {
                    if (e.getCause() instanceof DeadSystemException) {
                        abstractC64515THi = C60546R6j.A00;
                    } else {
                        throw e;
                    }
                }
                if (!(abstractC64515THi instanceof C60546R6j)) {
                    if (!((C62547SFy) abstractC64515THi.A01()).A01 && !((C62547SFy) abstractC64515THi.A01()).A02) {
                        if (!(((C62547SFy) abstractC64515THi.A01()).A00 instanceof C60546R6j)) {
                            str = String.valueOf(((C62547SFy) abstractC64515THi.A01()).A00.A01());
                        }
                    } else {
                        str = "crg";
                    }
                    A1G.put("bat", str);
                }
                if (!(A00 instanceof C60546R6j)) {
                    A1G.put("connected_duration_ms", A00.A01().toString());
                }
                if (!(A002 instanceof C60546R6j)) {
                    A1G.put("last_ping_ms_ago", A002.A01().toString());
                }
                if (!(A003 instanceof C60546R6j)) {
                    A1G.put("last_sent_ms_ago", A003.A01().toString());
                }
                if (!(A004 instanceof C60546R6j)) {
                    A1G.put("last_received_ms_ago", A004.A01().toString());
                }
                A1G.put("reason", obj);
                A1G.put("operation", obj2);
                if (c60547R6k instanceof C60546R6j) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    A1G.put("exception", AbstractC31173DnH.A0q(c60547R6k.A01()));
                    A1G.put("error_message", ((Throwable) c60547R6k.A01()).getMessage());
                }
                A1G.put("fs", String.valueOf(A1a));
                A1G.put("mqtt_session_id", Long.toString(j));
                C63306ShC.A00(j2, A1G);
                C63306ShC.A01(networkInfo, c63306ShC, A1G);
                c63306ShC.A06("mqtt_disconnection_on_failure", A1G);
                InterfaceC65618To9 interfaceC65618To9 = c63306ShC.A01;
                if (interfaceC65618To9 != null) {
                    HashMap A12 = AbstractC31174DnI.A12("reason", obj);
                    A12.put("operation", obj2);
                    if (z) {
                        A12.put("exception", AbstractC31173DnH.A0q(c60547R6k.A01()));
                    }
                    C63306ShC.A01(c63306ShC.A03.A02(), c63306ShC, A12);
                    interfaceC65618To9.Chz("mqtt_disconnection_on_failure", A12);
                }
                if (c62488SDp != null) {
                    C63367SiS c63367SiS = c62488SDp.A01;
                    c63367SiS.A0t = SystemClock.elapsedRealtime();
                    c63367SiS.A0u = new Pair(rhR, enumC61139Rft);
                    c63367SiS.A05.post(new TL0(c62488SDp));
                    if (rhR == RhR.A0D || rhR == RhR.A0P) {
                        c63367SiS.A05.post(new TO4(c62488SDp, th));
                    }
                }
                c63364SiN.A0Q = Long.MAX_VALUE;
                c63364SiN.A0U = Long.MAX_VALUE;
                c63364SiN.A0T = Long.MAX_VALUE;
                c63364SiN.A0S = Long.MAX_VALUE;
                c63364SiN.A0R = Long.MAX_VALUE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean A04() {
        Integer num = this.A0Y;
        if (num != C05F.A0C && num != C05F.A00 && num != C05F.A01) {
            return false;
        }
        return true;
    }

    private AbstractC64515THi A00(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j > elapsedRealtime) {
            return C60546R6j.A00;
        }
        return C60547R6k.A00(Long.valueOf(elapsedRealtime - j));
    }

    public static String A01(C63364SiN c63364SiN, long j) {
        AbstractC64515THi A00 = c63364SiN.A00(j);
        if (A00 instanceof C60546R6j) {
            return "N/A";
        }
        return new Date(System.currentTimeMillis() - AbstractC166987dD.A0N(A00.A01())).toString();
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("[MqttClient (");
        C62619SJc c62619SJc = this.A0G;
        A1C.append(c62619SJc.A00);
        A1C.append(":");
        A1C.append(this.A00);
        if (c62619SJc.A0N) {
            A1C.append(" +ssl");
        }
        A1C.append(") ");
        Integer num = this.A0Y;
        if (num != null) {
            str = S15.A00(num);
        } else {
            str = "null";
        }
        A1C.append(str);
        return AbstractC58319PtB.A0w(A1C);
    }

    public C63364SiN(C62177S0y c62177S0y, C3Uj c3Uj, RealtimeSinceBootClock realtimeSinceBootClock, InterfaceC65366Tiy interfaceC65366Tiy, InterfaceC65366Tiy interfaceC65366Tiy2, C62831STd c62831STd, C62700SMo c62700SMo, C63306ShC c63306ShC, C62973SZs c62973SZs, C63363SiM c63363SiM, C63006SaU c63006SaU, InterfaceC65564Tmq interfaceC65564Tmq, C63293Sgt c63293Sgt, S18 s18, C62619SJc c62619SJc, S19 s19, Long l, ExecutorService executorService) {
        String str;
        SBZ sbz = new SBZ(this);
        this.A0M = sbz;
        SOJ soj = new SOJ(this);
        this.A0F = soj;
        boolean z = false;
        this.A0K = MSW.A1C(0);
        this.A0C = c63006SaU;
        this.A07 = c62831STd;
        this.A09 = c63306ShC;
        this.A0B = c63363SiM;
        this.A0G = c62619SJc;
        this.A04 = realtimeSinceBootClock;
        this.A0J = executorService;
        this.A0A = c62973SZs;
        this.A02 = c62177S0y;
        this.A0N = s18;
        this.A0O = s19;
        this.A0D = interfaceC65564Tmq;
        this.A08 = c62700SMo;
        this.A0E = c63293Sgt;
        this.A06 = interfaceC65366Tiy;
        c63293Sgt.A0I = soj;
        c63293Sgt.A0H = sbz;
        if ("".equals(interfaceC65564Tmq.Ao1()) && (str = c62619SJc.A0G) != null && "".equals(str)) {
            z = true;
        }
        this.A0L = z;
        this.A05 = interfaceC65366Tiy2;
        this.A03 = c3Uj;
        this.A0H = l;
        this.A0b = new M9t(0);
    }
}
