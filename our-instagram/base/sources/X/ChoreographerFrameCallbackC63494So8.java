package X;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.So8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ChoreographerFrameCallbackC63494So8 implements Choreographer.FrameCallback {
    public final /* synthetic */ T0q A02;
    public volatile boolean A01 = false;
    public boolean A00 = false;

    public ChoreographerFrameCallbackC63494So8(T0q t0q) {
        this.A02 = t0q;
    }

    public final void A00() {
        if (!this.A01) {
            this.A01 = true;
            if (!C62856SUd.A00.enableFabricRendererExclusively()) {
                C63192Seu c63192Seu = C63192Seu.A05;
                if (c63192Seu != null) {
                    c63192Seu.A02(this.A02.A06, EnumC61159RgK.A07);
                    return;
                }
                throw AbstractC166987dD.A14("ReactChoreographer needs to be initialized.");
            }
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        ArrayList arrayList;
        short s;
        if (this.A00) {
            this.A01 = false;
        } else if (!C62856SUd.A00.enableFabricRendererExclusively()) {
            C63192Seu c63192Seu = C63192Seu.A05;
            if (c63192Seu != null) {
                c63192Seu.A02(this.A02.A06, EnumC61159RgK.A07);
            } else {
                throw AbstractC166987dD.A14("ReactChoreographer needs to be initialized.");
            }
        }
        C0fY.A01(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ScheduleDispatchFrameCallback", 73730556);
        try {
            T0q t0q = this.A02;
            synchronized (t0q.A07) {
                synchronized (t0q.A08) {
                    int i = 0;
                    while (true) {
                        arrayList = t0q.A09;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        Sb5 sb5 = (Sb5) arrayList.get(i);
                        if (!sb5.A0B()) {
                            int i2 = t0q.A00;
                            Sb5[] sb5Arr = t0q.A02;
                            int length = sb5Arr.length;
                            if (i2 == length) {
                                sb5Arr = (Sb5[]) Arrays.copyOf(sb5Arr, length * 2);
                                t0q.A02 = sb5Arr;
                            }
                            int i3 = t0q.A00;
                            t0q.A00 = i3 + 1;
                            sb5Arr[i3] = sb5;
                        } else {
                            int i4 = sb5.A02;
                            String A05 = sb5.A05();
                            short A06 = sb5.A06();
                            Map map = t0q.A0A;
                            Short sh = (Short) map.get(A05);
                            if (sh != null) {
                                s = sh.shortValue();
                            } else {
                                s = t0q.A01;
                                t0q.A01 = (short) (s + 1);
                                map.put(A05, Short.valueOf(s));
                            }
                            long j2 = ((s & 65535) << 32) | i4 | ((A06 & 65535) << 48);
                            LongSparseArray longSparseArray = t0q.A03;
                            Integer num = (Integer) longSparseArray.get(j2);
                            Sb5 sb52 = null;
                            if (num == null) {
                                longSparseArray.put(j2, Integer.valueOf(t0q.A00));
                            } else {
                                Sb5[] sb5Arr2 = t0q.A02;
                                int intValue = num.intValue();
                                Sb5 sb53 = sb5Arr2[intValue];
                                Sb5 sb54 = sb53;
                                if (sb5.A03 >= sb53.A03) {
                                    sb54 = sb5;
                                }
                                if (sb54 != sb53) {
                                    longSparseArray.put(j2, Integer.valueOf(t0q.A00));
                                    t0q.A02[intValue] = null;
                                    sb52 = sb53;
                                    sb5 = sb54;
                                } else {
                                    sb52 = sb5;
                                    sb52.A05 = false;
                                    sb52.A07();
                                }
                            }
                            int i5 = t0q.A00;
                            Sb5[] sb5Arr3 = t0q.A02;
                            int length2 = sb5Arr3.length;
                            if (i5 == length2) {
                                sb5Arr3 = (Sb5[]) Arrays.copyOf(sb5Arr3, length2 * 2);
                                t0q.A02 = sb5Arr3;
                            }
                            int i6 = t0q.A00;
                            t0q.A00 = i6 + 1;
                            sb5Arr3[i6] = sb5;
                            if (sb52 != null) {
                                sb52.A05 = false;
                                sb52.A07();
                            }
                        }
                        i++;
                    }
                }
                arrayList.clear();
            }
            if (!t0q.A0F) {
                t0q.A0F = true;
                Systrace.A07(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "ScheduleDispatchFrameCallback", t0q.A0D.get());
                R3M r3m = t0q.A04;
                RunnableC64577TKo runnableC64577TKo = t0q.A05;
                MessageQueueThread messageQueueThread = r3m.A03;
                AbstractC05810Sj.A00(messageQueueThread);
                messageQueueThread.runOnQueue(runnableC64577TKo);
            }
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -937349494);
        } catch (Throwable th) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -1327842485);
            throw th;
        }
    }
}
