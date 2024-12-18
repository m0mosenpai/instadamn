package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.realtimeclient.RealtimeConstants;
import com.messagingclient.componentslogger.ComponentLoggerPluginMCFBridgejniDispatcher;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2F3, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2F3 implements FOAMessagingPerformanceLogger {
    public final LightweightQuickPerformanceLogger A00;
    public final Map A01;

    public static final void A02(C2F3 c2f3, C2F8 c2f8) {
        if (c2f3.A0M(c2f8)) {
            Map map = c2f3.A01;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    SPA spa = (SPA) entry.getValue();
                    long j = spa.A03.get();
                    long j2 = spa.A02.get();
                    if (1 <= j && j < j2) {
                        c2f3.A0K(c2f8, AnonymousClass001.A0g(str, "_aggregated", "_start"), null, j);
                        c2f3.A0K(c2f8, AnonymousClass001.A0g(str, "_aggregated", "_end"), null, j2);
                    }
                }
            }
            for (Map.Entry entry2 : c2f8.A01.entrySet()) {
                String str2 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof String) {
                    c2f3.A0H(c2f8, str2, (String) value);
                } else if (value instanceof Integer) {
                    c2f3.A0D(c2f8, str2, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    c2f3.A0E(c2f8, str2, ((Number) value).longValue());
                } else if (value instanceof Double) {
                    double doubleValue = ((Number) value).doubleValue();
                    synchronized (c2f3) {
                        C14360o3.A0B(str2, 1);
                        if (c2f3.A0M(c2f8)) {
                            c2f3.A00.markerAnnotate(c2f8.A06.A00, c2f8.A04, str2, doubleValue);
                        } else {
                            A05(c2f8, "annotate", "marker is not active");
                        }
                    }
                } else if (value instanceof Boolean) {
                    c2f3.A0L(c2f8, str2, ((Boolean) value).booleanValue());
                }
            }
        }
    }

    private final synchronized void A04(C2F8 c2f8, String str, long j, short s) {
        if (str != null) {
            A0H(c2f8, "end_reason", str);
        }
        A0J(c2f8, "trace", null, j);
        A02(this, c2f8);
        A06();
        if (A0M(c2f8)) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            A01(this, c2f8);
            lightweightQuickPerformanceLogger.markerEnd(c2f8.A06.A00, c2f8.A04, s, j, TimeUnit.MILLISECONDS);
        } else {
            A05(c2f8, "cancel", "marker is not active");
        }
    }

    public void A06() {
    }

    public final synchronized void A08(C2F8 c2f8, long j) {
        A04(c2f8, null, j, (short) 630);
    }

    public final synchronized void A09(C2F8 c2f8, String str) {
        C14360o3.A0B(c2f8, 0);
        A04(c2f8, str, AwakeTimeSinceBootClock.INSTANCE.now(), (short) 4);
    }

    public final synchronized void A0A(C2F8 c2f8, String str) {
        C14360o3.A0B(c2f8, 0);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        A0H(c2f8, "end_reason", str);
        A0J(c2f8, "trace", null, now);
        A02(this, c2f8);
        A06();
        if (A0M(c2f8)) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            A01(this, c2f8);
            lightweightQuickPerformanceLogger.markerEnd(c2f8.A06.A00, c2f8.A04, (short) 3, now, TimeUnit.MILLISECONDS);
        } else {
            A05(c2f8, RealtimeConstants.SEND_FAIL, "marker is not active");
        }
    }

    public final synchronized void A0B(C2F8 c2f8, String str) {
        C14360o3.A0B(c2f8, 0);
        A0F(c2f8, str, AwakeTimeSinceBootClock.INSTANCE.now());
    }

    public final synchronized void A0C(C2F8 c2f8, String str) {
        C14360o3.A0B(c2f8, 0);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        A0J(c2f8, "trace", str, now);
        A02(this, c2f8);
        A06();
        if (A0M(c2f8)) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            A01(this, c2f8);
            lightweightQuickPerformanceLogger.markerEnd(c2f8.A06.A00, c2f8.A04, (short) 2, now, TimeUnit.MILLISECONDS);
        } else {
            A05(c2f8, "succeed", "marker is not active");
        }
    }

    public synchronized void A0D(C2F8 c2f8, String str, int i) {
        C14360o3.A0B(str, 1);
        if (A0M(c2f8)) {
            this.A00.markerAnnotate(c2f8.A06.A00, c2f8.A04, str, i);
        } else {
            A05(c2f8, "annotate", "marker is not active");
        }
    }

    public final synchronized void A0E(C2F8 c2f8, String str, long j) {
        C14360o3.A0B(str, 1);
        if (A0M(c2f8)) {
            this.A00.markerAnnotate(c2f8.A06.A00, c2f8.A04, str, j);
        } else {
            A05(c2f8, "annotate", "marker is not active");
        }
    }

    public final synchronized void A0F(C2F8 c2f8, String str, long j) {
        String A00 = A00(str, j, true);
        if (A00 != null) {
            A0K(c2f8, AnonymousClass001.A0g(str, A00, "_start"), null, j);
        }
    }

    public synchronized void A0G(C2F8 c2f8, String str, String str2) {
        C14360o3.A0B(c2f8, 0);
        A0K(c2f8, str, str2, AwakeTimeSinceBootClock.INSTANCE.now());
    }

    public final synchronized void A0H(C2F8 c2f8, String str, String str2) {
        C14360o3.A0B(c2f8, 0);
        C14360o3.A0B(str, 1);
        if (A0M(c2f8)) {
            this.A00.markerAnnotate(c2f8.A06.A00, c2f8.A04, str, str2);
        } else {
            A05(c2f8, "annotate", "marker is not active");
        }
    }

    public final synchronized void A0I(C2F8 c2f8, String str, String str2) {
        C14360o3.A0B(c2f8, 0);
        A0J(c2f8, str, str2, AwakeTimeSinceBootClock.INSTANCE.now());
    }

    public final synchronized void A0J(C2F8 c2f8, String str, String str2, long j) {
        Map map;
        SPA spa;
        String A00 = A00(str, j, false);
        if (A00 != null) {
            A0K(c2f8, AnonymousClass001.A0g(str, A00, "_end"), str2, j);
        }
        if (A0M(c2f8) && (map = this.A01) != null && (spa = (SPA) map.get(str)) != null) {
            int i = spa.A01.get();
            int i2 = spa.A00.get();
            if (i > i2) {
                i = i2;
            }
            A0D(c2f8, AnonymousClass001.A0R(str, "_max_occurance"), i);
        }
    }

    public final synchronized void A0K(C2F8 c2f8, String str, String str2, long j) {
        C14360o3.A0B(str, 2);
        if (A0M(c2f8)) {
            Long l = c2f8.A00;
            if (l != null) {
                if (l.longValue() <= j) {
                    this.A00.markerPoint(c2f8.A06.A00, c2f8.A04, str, str2, j, TimeUnit.MILLISECONDS);
                } else {
                    A05(c2f8, "add point to", "timestamp is before marker starts");
                }
            }
        } else {
            A05(c2f8, "add point to", "marker is not active");
        }
    }

    public final synchronized void A0L(C2F8 c2f8, String str, boolean z) {
        C14360o3.A0B(c2f8, 0);
        C14360o3.A0B(str, 1);
        if (A0M(c2f8)) {
            this.A00.markerAnnotate(c2f8.A06.A00, c2f8.A04, str, z);
        } else {
            A05(c2f8, "annotate", "marker is not active");
        }
    }

    public final synchronized boolean A0M(C2F8 c2f8) {
        C14360o3.A0B(c2f8, 0);
        return this.A00.isMarkerOn(c2f8.A06.A00, c2f8.A04, false);
    }

    @Override // com.meta.foa.performancelogging.FOAMessagingPerformanceLogger
    public void onAppForegrounded() {
    }

    private final String A00(String str, long j, boolean z) {
        SPA spa;
        int incrementAndGet;
        Map map = this.A01;
        if (map != null && (spa = (SPA) map.get(str)) != null) {
            if (z) {
                incrementAndGet = spa.A01.incrementAndGet();
                spa.A03.compareAndSet(0L, j);
            } else {
                incrementAndGet = spa.A00.incrementAndGet();
                spa.A02.set(j);
            }
            if (incrementAndGet <= 10) {
                String format = String.format(Locale.US, "_%d", Arrays.copyOf(new Object[]{Integer.valueOf(incrementAndGet)}, 1));
                C14360o3.A07(format);
                return format;
            }
            return null;
        }
        return "";
    }

    public static final void A01(C2F3 c2f3, C2F8 c2f8) {
        if (c2f8.A02) {
            int i = c2f8.A06.A00;
            int i2 = c2f8.A04;
            Map MCIComponentAttributionLoggerCreateAggregatedDataNative = ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerCreateAggregatedDataNative(i, i2);
            C14360o3.A07(MCIComponentAttributionLoggerCreateAggregatedDataNative);
            for (Map.Entry entry : MCIComponentAttributionLoggerCreateAggregatedDataNative.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    C14360o3.A0C(key, "null cannot be cast to non-null type kotlin.String");
                    c2f3.A0D(c2f8, (String) key, ((Number) value).intValue());
                }
                if (value instanceof String) {
                    C14360o3.A0C(key, "null cannot be cast to non-null type kotlin.String");
                    c2f3.A0H(c2f8, (String) key, (String) value);
                }
            }
            ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerEndNative(i, i2);
        }
    }

    public static final void A03(C2F3 c2f3, C2F8 c2f8, long j, long j2) {
        boolean z;
        if (c2f8.A08) {
            boolean z2 = false;
            if (1 <= j && j < j2) {
                z2 = true;
            }
            if (z2) {
                c2f3.A0F(c2f8, "click", j);
                z = true;
            } else {
                z = false;
                C14360o3.A0B(AnonymousClass001.A0f("Skipped logging invalid touchUp timestamp: touchUpTimestamp - ", ", timestamp - ", j, j2), 0);
            }
            c2f3.A0L(c2f8, "back_start_on_touch_up", z);
        }
        c2f3.A0F(c2f8, "trace", j2);
    }

    public static final void A05(C2F8 c2f8, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot ");
        sb.append(str);
        sb.append(" marker because ");
        sb.append(str2);
        sb.append(". [markerName = ");
        sb.append(c2f8.A06.A01);
        sb.append(", instanceKey = ");
        sb.append(c2f8.A04);
        sb.append(']');
        C14360o3.A0B(sb.toString(), 0);
    }

    public final synchronized void A07(C2F8 c2f8) {
        long j;
        String str;
        C14360o3.A0B(c2f8, 0);
        long now = AwakeTimeSinceBootClock.INSTANCE.now();
        if (!A0M(c2f8)) {
            C2FA c2fa = C2FA.A04;
            long A00 = C2FA.A00(c2fa, c2fa.A01.now());
            long j2 = now;
            if (c2f8.A08 && 1 <= A00 && A00 < now) {
                if (A00 > now) {
                    A00 = now;
                }
                j2 = A00;
            }
            Long l = c2f8.A00;
            if (l != null) {
                long longValue = l.longValue();
                if (longValue < j2 && j2 - longValue <= 3000) {
                    j2 = longValue;
                }
            }
            Long valueOf = Long.valueOf(j2);
            c2f8.A00 = valueOf;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            int i = c2f8.A06.A00;
            boolean z = false;
            if (c2f8.A07 == C05F.A00) {
                z = true;
            }
            int i2 = c2f8.A04;
            if (valueOf != null) {
                j = valueOf.longValue();
            } else {
                j = now;
            }
            lightweightQuickPerformanceLogger.markerStartWithCancelPolicy(i, z, i2, j, TimeUnit.MILLISECONDS);
            MarkerEditor withMarker = lightweightQuickPerformanceLogger.withMarker(i, i2);
            withMarker.setSurviveUserSwitch(c2f8.A03);
            withMarker.markerEditingCompleted();
            A03(this, c2f8, A00, now);
            if (c2f8.A02) {
                if (c2f8.A05 != null) {
                    str = "bootstrap_attribution_plugin";
                } else {
                    str = null;
                }
                ComponentLoggerPluginMCFBridgejniDispatcher.MCIComponentAttributionLoggerStartNative(i, i2, str);
            }
        } else {
            A05(c2f8, "start", "marker is active");
        }
    }

    public C2F3(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Map map) {
        this.A00 = lightweightQuickPerformanceLogger;
        this.A01 = map;
    }
}
