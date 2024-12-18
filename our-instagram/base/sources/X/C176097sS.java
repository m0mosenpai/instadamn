package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.HardwareVideoEncoderFactory;

/* renamed from: X.7sS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176097sS {
    public int A00;
    public Handler A02;
    public C176137sW A03;
    public final Handler A06;
    public final InterfaceC178337w7 A07;
    public final InterfaceC176037sM A08;
    public volatile InterfaceC25203BDb A0A;
    public Integer A04 = C05F.A0u;
    public long A01 = 0;
    public final C176107sT A09 = new Object();
    public Map A05 = new HashMap();

    public static void A00(InterfaceC176207sd interfaceC176207sd, C176097sS c176097sS, List list) {
        Integer num = c176097sS.A04;
        if (num != C05F.A0u) {
            if (num != C05F.A01) {
                c176097sS.A06(new C23421AZu(interfaceC176207sd, c176097sS));
                return;
            }
        } else {
            Iterator it = c176097sS.A05.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC176187sb) it.next()).release();
            }
        }
        A01(c176097sS, C05F.A00);
        ACL acl = new ACL(c176097sS.A02, new AVU(new AVP(interfaceC176207sd, c176097sS), interfaceC176207sd, c176097sS, list));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InterfaceC177537un interfaceC177537un = (InterfaceC177537un) it2.next();
            InterfaceC176187sb interfaceC176187sb = (InterfaceC176187sb) c176097sS.A05.get(interfaceC177537un.CBK());
            if (interfaceC176187sb != null) {
                interfaceC176187sb.Eg6(c176097sS.A03);
                interfaceC176187sb.E5Y(acl.A00(new RunnableC24564AuL(interfaceC176187sb, c176097sS)), interfaceC177537un);
            }
        }
        acl.A01();
    }

    public static void A01(C176097sS c176097sS, Integer num) {
        c176097sS.A04 = num;
        c176097sS.A08.EcD(C9LW.A00(num));
    }

    public final String A02() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A05.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        return sb.toString();
    }

    public final HashMap A03() {
        HashMap hashMap = new HashMap();
        Iterator it = this.A05.values().iterator();
        while (it.hasNext()) {
            Map Avv = ((InterfaceC176187sb) it.next()).Avv();
            if (Avv != null) {
                hashMap.putAll(Avv);
            }
        }
        C176137sW c176137sW = this.A03;
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("recording_muxer_stop_progress", String.valueOf(c176137sW.A0F[0]));
        hashMap.putAll(hashMap2);
        hashMap.put("recording_contrl_stop_progress", String.valueOf(this.A00));
        return hashMap;
    }

    public final void A04(AbstractC223559ty abstractC223559ty) {
        InterfaceC25203BDb interfaceC25203BDb = this.A0A;
        if (interfaceC25203BDb != null) {
            this.A0A = null;
            abstractC223559ty.A01(A03());
            this.A06.post(new RunnableC24733AxH(abstractC223559ty, interfaceC25203BDb, this));
        } else {
            this.A08.Cl9(abstractC223559ty, "recording_controller_error", "RecordingThreadController", A02(), "notifyOnDifferentThreadCaptureFailed", null, hashCode());
        }
    }

    public final void A05(AGI agi, InterfaceC25203BDb interfaceC25203BDb, InterfaceC25159BBe interfaceC25159BBe) {
        this.A08.Ckz(19, "recording_start_requested");
        Integer num = this.A04;
        if (num == C05F.A0Y) {
            A04(new AbstractC223559ty(HardwareVideoEncoderFactory.QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS, "Recording video has already started"));
            interfaceC25159BBe.onFinished();
            return;
        }
        if (num != C05F.A01) {
            A06(new C23422AZv(interfaceC25159BBe, this, num));
            return;
        }
        A01(this, C05F.A0C);
        this.A01 = 0L;
        this.A0A = interfaceC25203BDb;
        ACK ack = new ACK(new AYq(interfaceC25159BBe, this), this.A02);
        this.A03.A05(ack.A00(), agi, new C22862A6i(interfaceC25159BBe, this));
        Map map = this.A05;
        Iterator it = map.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((InterfaceC176187sb) it.next()).CRb()) {
                i++;
            }
        }
        AtomicInteger atomicInteger = new AtomicInteger(i);
        for (InterfaceC176187sb interfaceC176187sb : map.values()) {
            if (interfaceC176187sb.CRb()) {
                interfaceC176187sb.Emh(ack.A00(), new ABV(interfaceC176187sb, interfaceC25159BBe, this, atomicInteger));
            }
        }
        ack.A01();
    }

    public final void A06(final InterfaceC25159BBe interfaceC25159BBe) {
        A07(new InterfaceC25159BBe() { // from class: X.9LZ
            @Override // X.InterfaceC25159BBe
            public final void onFinished() {
                C176097sS c176097sS = this;
                C176107sT c176107sT = c176097sS.A09;
                c176107sT.A00 = null;
                Thread currentThread = Thread.currentThread();
                if (c176107sT.equals(currentThread.getUncaughtExceptionHandler())) {
                    currentThread.setUncaughtExceptionHandler(c176107sT.A01);
                }
                c176097sS.A00 = 4;
                C176097sS.A01(c176097sS, C05F.A0u);
                Iterator A16 = AbstractC166997dE.A16(c176097sS.A05);
                while (A16.hasNext()) {
                    ((InterfaceC176187sb) A16.next()).release();
                }
                c176097sS.A0A = null;
                c176097sS.A01 = 0L;
                c176097sS.A00 = 5;
                InterfaceC25159BBe interfaceC25159BBe2 = interfaceC25159BBe;
                if (interfaceC25159BBe2 != null) {
                    interfaceC25159BBe2.onFinished();
                }
            }
        });
    }

    public final void A07(final InterfaceC25159BBe interfaceC25159BBe) {
        Integer num;
        long j;
        Integer num2 = this.A04;
        if (num2 != C05F.A0u && num2 != (num = C05F.A0j)) {
            if (num2 == C05F.A01) {
                A01(this, num);
                A06(new InterfaceC25159BBe() { // from class: X.AZs
                    @Override // X.InterfaceC25159BBe
                    public final void onFinished() {
                        InterfaceC25159BBe.this.onFinished();
                    }
                });
                return;
            }
            C176107sT c176107sT = this.A09;
            c176107sT.A00 = this.A03;
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (!c176107sT.equals(uncaughtExceptionHandler)) {
                c176107sT.A01 = uncaughtExceptionHandler;
                currentThread.setUncaughtExceptionHandler(c176107sT);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A01;
            InterfaceC178337w7 interfaceC178337w7 = this.A07;
            if (interfaceC178337w7 instanceof C178317w5) {
                C178317w5 c178317w5 = (C178317w5) interfaceC178337w7;
                try {
                    if (((InterfaceC178407wE) ((AbstractC178277w1) c178317w5).A00.Aq1(InterfaceC178407wE.A00)).BhE().equals("instagram_note")) {
                        j = 1000;
                    }
                } catch (RuntimeException unused) {
                }
                j = C18U.A01(C06090Tz.A06, c178317w5.A00, 36598803604180271L);
            } else {
                j = 0;
            }
            if (this.A01 > 0 && elapsedRealtime > 0 && elapsedRealtime < j && interfaceC178337w7.CUZ(118) && j > 0) {
                if (j <= 86400000) {
                    try {
                        Thread.sleep(j - elapsedRealtime);
                    } catch (InterruptedException unused2) {
                    }
                } else {
                    throw new RuntimeException("VideoRecording_Min_Duration_Ms > 86400000");
                }
            }
            this.A00 = 0;
            A01(this, num);
            if (interfaceC178337w7.CUZ(116)) {
                C176137sW c176137sW = this.A03;
                c176137sW.A0F[0] = -1;
                c176137sW.A08.removeCallbacks(c176137sW.A0B);
            }
            ACK ack = new ACK(new C23391AYp(interfaceC25159BBe, this), this.A02);
            Map map = this.A05;
            for (InterfaceC176187sb interfaceC176187sb : map.values()) {
                if (interfaceC176187sb.CRb()) {
                    interfaceC176187sb.EoR(ack.A00());
                }
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.A00 = 1;
            ack.A01();
            return;
        }
        interfaceC25159BBe.onFinished();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.7sT] */
    public C176097sS(Handler handler, InterfaceC178337w7 interfaceC178337w7, InterfaceC176037sM interfaceC176037sM) {
        this.A06 = handler;
        this.A08 = interfaceC176037sM;
        this.A07 = interfaceC178337w7;
    }
}
