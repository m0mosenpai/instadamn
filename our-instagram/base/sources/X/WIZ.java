package X;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class WIZ implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public WIZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x002f. Please report as an issue. */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        W1m w1m;
        HashMap hashMap;
        String str;
        long j;
        W1m w1m2;
        HashMap hashMap2;
        String str2;
        Message obtainMessage;
        C69439VnO c69439VnO;
        Object c09540e5;
        if (this.A00 != 0) {
            if (message.what == 0) {
                C70194WFy c70194WFy = (C70194WFy) this.A01;
                C69083VhZ c69083VhZ = (C69083VhZ) message.obj;
                synchronized (c70194WFy.A03) {
                    if (c70194WFy.A00 == c69083VhZ || c70194WFy.A01 == c69083VhZ) {
                        C70194WFy.A04(c69083VhZ, c70194WFy, 2);
                    }
                }
                return true;
            }
            return false;
        }
        try {
            WG8 wg8 = (WG8) this.A01;
            switch (message.what) {
                case 1:
                    W1m w1m3 = wg8.A0E;
                    if (w1m3 != null && wg8.A00 != 1) {
                        W1m.A00(w1m3, "audio_pipeline_start", null);
                    }
                    wg8.A00 = 1;
                    Handler handler = wg8.A0D;
                    if (!handler.hasMessages(2)) {
                        obtainMessage = handler.obtainMessage(2);
                        obtainMessage.sendToTarget();
                        return false;
                    }
                    return false;
                case 2:
                    int i = wg8.A00;
                    if ((i == 2 || i == 1) && wg8.A01 != 0) {
                        if (!wg8.A0A) {
                            Map map = wg8.A0K;
                            Iterator it = new HashSet(map.keySet()).iterator();
                            while (it.hasNext()) {
                                Integer num = (Integer) it.next();
                                int intValue = num.intValue();
                                if (wg8.A0B[intValue].A06(TimeUnit.MICROSECONDS, wg8.A02, wg8.A08.A0B.A1P()) && (wg8.A00 != 2 || wg8.A09.contains(num))) {
                                    wg8.A0F.A01.enableTrack(intValue);
                                    InterfaceC71998XEm A00 = WG8.A00(wg8, intValue);
                                    if (A00 != null) {
                                        A00.AO4(wg8.A02);
                                    }
                                }
                            }
                            for (int i2 = 0; i2 < wg8.A01; i2++) {
                                if (!map.containsKey(Integer.valueOf(i2))) {
                                    wg8.A0F.A01.disableTrack(i2);
                                }
                            }
                            int i3 = wg8.A00;
                            C69377VmN c69377VmN = wg8.A0F;
                            long j2 = wg8.A02;
                            if (i3 == 2) {
                                c69377VmN.A01.warmup(c69377VmN.A06, j2);
                            } else {
                                c69377VmN.A00 = c69377VmN.A01.process(c69377VmN.A06, j2);
                                WDG wdg = c69377VmN.A04;
                                if (wdg != null) {
                                    wdg.A02(j2);
                                }
                            }
                            long j3 = wg8.A02 + wg8.A0C;
                            wg8.A02 = j3;
                            wg8.A07.A01(j3);
                            wg8.A06.A01(j3);
                        }
                        C69377VmN c69377VmN2 = wg8.A0F;
                        try {
                            C55070OaQ c55070OaQ = c69377VmN2.A03;
                            if (c55070OaQ != null && (c69439VnO = c55070OaQ.A05) != null) {
                                ByteBuffer byteBuffer = c69377VmN2.A00;
                                C14360o3.A0B(byteBuffer, 0);
                                if (c69439VnO.A00 < 600 && c69439VnO.A05) {
                                    try {
                                    } catch (Throwable th) {
                                        c09540e5 = new C09540e5(th);
                                    }
                                    if (byteBuffer.hasRemaining()) {
                                        if (c69439VnO.A00 == 0) {
                                            c69439VnO.A06.A02(C05F.A03, C05F.A00, null, c69439VnO.A08, null, null);
                                        }
                                        c69439VnO.A00++;
                                        int remaining = byteBuffer.remaining();
                                        byteBuffer.duplicate().get(c69439VnO.A0A, c69439VnO.A01, remaining);
                                        Thread.sleep(12L);
                                        int i4 = c69439VnO.A01 + remaining;
                                        c69439VnO.A01 = i4;
                                        int i5 = c69439VnO.A00;
                                        if (i5 != 1 && i5 != 300 && i5 == 600) {
                                            c69439VnO.A06.A02(C05F.A04, C05F.A00, Long.valueOf(c69439VnO.A02), c69439VnO.A08, null, AbstractC167007dF.A0n("bytes_recorded", String.valueOf(i4)));
                                        }
                                        c09540e5 = C0eB.A00;
                                        Throwable A002 = C09550e6.A00(c09540e5);
                                        if (A002 != null) {
                                            C0K8.A0C("MediaAccuracyAudioCapture", "Exception while saving audio bytes for media accuracy");
                                            c69439VnO.A06.A01(C05F.A05, C05F.A00, Long.valueOf(c69439VnO.A02), c69439VnO.A08, null, "Failed while recording audio bytes", A002, null, AbstractC167007dF.A0n("bytes_recorded", String.valueOf(c69439VnO.A01)));
                                        }
                                    }
                                }
                            }
                        } catch (Exception e) {
                            C0K8.A0F("MediaAccuracyAudioCapture", "Exception while saving audio bytes for media accuracy. Skipping.", e);
                        }
                        XEI xei = c69377VmN2.A02;
                        xei.E6B(c69377VmN2.A00);
                        wg8.A0A = !(!c69377VmN2.A00.hasRemaining());
                        if (!WG8.A04(wg8)) {
                            WDG wdg2 = c69377VmN2.A04;
                            if (wdg2 != null) {
                                wdg2.A01();
                            }
                            if (xei.Em1()) {
                                wg8.A0D.removeMessages(2);
                                return false;
                            }
                        }
                        Handler handler2 = wg8.A0D;
                        if (!handler2.hasMessages(2)) {
                            obtainMessage = handler2.obtainMessage(2);
                            obtainMessage.sendToTarget();
                            return false;
                        }
                        return false;
                    }
                    return false;
                case 3:
                    long nanoTime = System.nanoTime();
                    try {
                        MediaComposition mediaComposition = wg8.A05;
                        EnumC1125356h enumC1125356h = EnumC1125356h.AUDIO;
                        InterfaceC58019Po5 interfaceC58019Po5 = wg8.A0G;
                        wg8.A03 = Math.max(AbstractC66047Tyk.A00(interfaceC58019Po5, enumC1125356h, mediaComposition), AbstractC66047Tyk.A00(interfaceC58019Po5, EnumC1125356h.VIDEO, wg8.A05));
                        HashMap A07 = wg8.A05.A07(enumC1125356h);
                        if (A07 != null) {
                            int size = A07.size();
                            wg8.A01 = size;
                            wg8.A0B = new C1125456i[size];
                            for (int i6 = 0; i6 < wg8.A01; i6++) {
                                C1125956n A04 = wg8.A05.A04(enumC1125356h, i6);
                                long A01 = AbstractC66047Tyk.A01(interfaceC58019Po5, A04);
                                C1125456i[] c1125456iArr = wg8.A0B;
                                long j4 = A04.A00;
                                c1125456iArr[i6] = new C1125456i(TimeUnit.MICROSECONDS, j4, j4 + A01);
                            }
                            HashMap hashMap3 = new HashMap();
                            int i7 = 0;
                            while (true) {
                                C1125456i[] c1125456iArr2 = wg8.A0B;
                                if (i7 < c1125456iArr2.length) {
                                    hashMap3.put(Integer.toString(i7), c1125456iArr2[i7]);
                                    i7++;
                                } else {
                                    if (wg8 instanceof Utk) {
                                        j = WG8.A0P;
                                    } else {
                                        j = 0;
                                    }
                                    wg8.A07 = new C67636Utr(wg8, wg8.A08.A0B, hashMap3, j);
                                    WG8.A02(wg8);
                                    w1m2 = wg8.A0E;
                                    if (w1m2 != null) {
                                        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                                        hashMap2 = new HashMap();
                                        hashMap2.put("latency_ms", String.valueOf(millis));
                                        str2 = "audio_pipeline_prepare";
                                        W1m.A00(w1m2, str2, hashMap2);
                                        return false;
                                    }
                                    return false;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("No audio tracks");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        w1m = wg8.A0E;
                        if (w1m != null) {
                            long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                            hashMap = new HashMap();
                            hashMap.put("latency_ms", String.valueOf(millis2));
                            str = "audio_pipeline_prepare";
                            W1m.A00(w1m, str, hashMap);
                            throw th;
                        }
                        throw th;
                    }
                case 4:
                    long longValue = ((Long) message.obj).longValue();
                    long nanoTime2 = System.nanoTime();
                    try {
                        wg8.A02 = longValue;
                        wg8.A07.A01(longValue);
                        wg8.A06.A01(longValue);
                        Iterator it2 = new HashSet(wg8.A0K.keySet()).iterator();
                        while (it2.hasNext()) {
                            int intValue2 = ((Integer) it2.next()).intValue();
                            InterfaceC71998XEm A003 = WG8.A00(wg8, intValue2);
                            if (A003 != null) {
                                long j5 = wg8.A05.A04(EnumC1125356h.AUDIO, intValue2).A00;
                                if (j5 < 0) {
                                    j5 = 0;
                                }
                                A003.EMh(Math.max(longValue - j5, 0L));
                            }
                        }
                        wg8.A0A = false;
                        C69377VmN c69377VmN3 = wg8.A0F;
                        c69377VmN3.A02.flush();
                        c69377VmN3.A00.clear();
                        w1m2 = wg8.A0E;
                        if (w1m2 != null) {
                            long nanoTime3 = System.nanoTime() - nanoTime2;
                            long millis3 = TimeUnit.MICROSECONDS.toMillis(longValue);
                            long millis4 = TimeUnit.NANOSECONDS.toMillis(nanoTime3);
                            hashMap2 = new HashMap();
                            hashMap2.put("target_position_ms", String.valueOf(millis3));
                            hashMap2.put("latency_ms", String.valueOf(millis4));
                            str2 = "audio_pipeline_seek";
                            W1m.A00(w1m2, str2, hashMap2);
                            return false;
                        }
                        return false;
                    } catch (Throwable th3) {
                        th = th3;
                        w1m = wg8.A0E;
                        if (w1m != null) {
                            long nanoTime4 = System.nanoTime() - nanoTime2;
                            long millis5 = TimeUnit.MICROSECONDS.toMillis(longValue);
                            long millis6 = TimeUnit.NANOSECONDS.toMillis(nanoTime4);
                            hashMap = new HashMap();
                            hashMap.put("target_position_ms", String.valueOf(millis5));
                            hashMap.put("latency_ms", String.valueOf(millis6));
                            str = "audio_pipeline_seek";
                            W1m.A00(w1m, str, hashMap);
                            throw th;
                        }
                        throw th;
                    }
                case 5:
                    WG8.A01(wg8);
                    return false;
                case 6:
                    if (wg8.A00 == 1) {
                        wg8.A00 = 0;
                        C69377VmN c69377VmN4 = wg8.A0F;
                        c69377VmN4.A02.flush();
                        c69377VmN4.A00.clear();
                        return false;
                    }
                    return false;
                case 7:
                    WG8.A03(wg8, (Throwable) message.obj);
                    return false;
                case 8:
                    MediaComposition mediaComposition2 = (MediaComposition) message.obj;
                    W3N w3n = new W3N(wg8.A08);
                    w3n.A08 = mediaComposition2;
                    wg8.A08 = new C69489VoC(w3n);
                    wg8.A05 = mediaComposition2;
                    WG8.A02(wg8);
                    return false;
                case 9:
                    Pair pair = (Pair) message.obj;
                    if (wg8.A00 != 2) {
                        wg8.A00 = 2;
                        HashSet hashSet = (HashSet) pair.first;
                        wg8.A09 = hashSet;
                        long intValue3 = ((Integer) pair.second).intValue();
                        if (intValue3 > 0) {
                            C1125956n A042 = wg8.A05.A04(EnumC1125356h.AUDIO, ((Integer[]) hashSet.toArray(new Integer[hashSet.size()]))[0].intValue());
                            if (A042 != null) {
                                try {
                                    intValue3 = Math.min(AbstractC66047Tyk.A02(wg8.A0G, (C1125756l) new ArrayList(A042.A04).get(0)), TimeUnit.SECONDS.toMicros(intValue3));
                                } catch (IOException unused) {
                                    intValue3 = 0;
                                }
                            }
                        }
                        wg8.A04 = new C1125456i(TimeUnit.MICROSECONDS, 0L, intValue3);
                        if (WG8.A04(wg8)) {
                            Handler handler3 = wg8.A0D;
                            if (!handler3.hasMessages(2)) {
                                obtainMessage = handler3.obtainMessage(2);
                                obtainMessage.sendToTarget();
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                default:
                    return false;
            }
        } catch (Throwable th4) {
            WG8.A03((WG8) this.A01, th4);
            return false;
        }
    }
}
