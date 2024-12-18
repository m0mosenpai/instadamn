package X;

import android.content.Context;
import android.os.PowerManager;
import android.util.LruCache;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.quicklog.MarkerEditor;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1CN, reason: invalid class name */
/* loaded from: classes.dex */
public class C1CN implements InterfaceC11580jH {
    public static final C1CO A06 = new Object();
    public final Context A00;
    public final LruCache A01;
    public final LruCache A02;
    public final LightweightQuickPerformanceLogger A03;
    public final Map A04;
    public final boolean A05;

    public C1CN(Context context, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i, boolean z) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(lightweightQuickPerformanceLogger, 2);
        this.A00 = context;
        this.A03 = lightweightQuickPerformanceLogger;
        this.A05 = z;
        this.A04 = new LinkedHashMap();
        this.A01 = new LruCache(200);
        this.A02 = new LruCache(i);
    }

    public void A0d(C121955fn c121955fn, String str) {
        Pair pair;
        Integer num;
        String str2;
        String str3;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c121955fn, 1);
        C121945fm[] c121945fmArr = c121955fn.A0W;
        if (c121945fmArr == null) {
            pair = new Pair(null, null);
        } else {
            C121945fm c121945fm = c121945fmArr[0];
            int length = c121945fmArr.length;
            C121945fm c121945fm2 = c121945fm;
            for (int i = 1; i < length; i++) {
                if (c121945fmArr[i].A00 > c121945fm2.A00) {
                    c121945fm2 = c121945fmArr[i];
                }
                if (c121945fmArr[i].A00 < c121945fm.A00) {
                    c121945fm = c121945fmArr[i];
                }
            }
            pair = new Pair(c121945fm, c121945fm2);
        }
        long j = c121955fn.A08;
        int i2 = c121955fn.A05;
        String str4 = c121955fn.A0I;
        int i3 = c121955fn.A03;
        String str5 = c121955fn.A0K;
        C121945fm c121945fm3 = (C121945fm) pair.first;
        Integer num2 = null;
        if (c121945fm3 != null) {
            num = Integer.valueOf(c121945fm3.A00);
            str2 = c121945fm3.A07;
        } else {
            num = null;
            str2 = null;
        }
        C121945fm c121945fm4 = (C121945fm) pair.second;
        if (c121945fm4 != null) {
            num2 = Integer.valueOf(c121945fm4.A00);
            str3 = c121945fm4.A07;
        } else {
            str3 = null;
        }
        A0f(num, num2, str, str4, str5, str2, str3, i2, i3, j);
    }

    public void A0g(String str) {
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null && !c114945Hk.A0B) {
            c114945Hk.A0B = true;
            this.A03.withMarker(61680819, c114945Hk.A0E).pointEditor("BUFFER_END").markerEditingCompleted();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void A0h(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A04;
        C114945Hk c114945Hk = (C114945Hk) map.get(str);
        if (c114945Hk != null) {
            int intValue = c114945Hk.A03.intValue();
            short s = 4;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
            int i = c114945Hk.A0E;
            switch (intValue) {
                case 0:
                case 7:
                    lightweightQuickPerformanceLogger.markerEnd(61680819, i, s);
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                default:
                    lightweightQuickPerformanceLogger.markerEnd(61680819, i, (short) 477);
                    break;
                case 5:
                    s = 2;
                    lightweightQuickPerformanceLogger.markerEnd(61680819, i, s);
                    break;
                case 6:
                    s = 3;
                    lightweightQuickPerformanceLogger.markerEnd(61680819, i, s);
                    break;
            }
            map.remove(str);
        }
    }

    public void A0i(String str) {
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            this.A03.withMarker(61680819, c114945Hk.A0E).pointEditor("ON_FIRST_FRAME_RENDERED").markerEditingCompleted();
        }
    }

    public void A0j(String str) {
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            this.A03.markerPoint(61680819, c114945Hk.A0E, "VIDEO_ON_PREPARED");
        }
    }

    public void A0k(String str) {
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            c114945Hk.A03 = C05F.A0j;
            this.A03.markerPoint(61680819, c114945Hk.A0E, "DID_REQUEST_PLAYING");
        }
    }

    public void A0l(String str) {
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            this.A03.markerPoint(61680819, c114945Hk.A0E, "VIDEO_SWITCH_TO_WARMUP_PLAYER");
        }
    }

    public void A0m(String str, int i) {
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            this.A03.markerAnnotate(61680819, c114945Hk.A0E, "CACHE_SIZE", i);
        }
    }

    public void A0p(String str, String str2) {
        String str3;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            boolean equals = "early".equals(str2);
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
            int i = c114945Hk.A0E;
            if (equals) {
                str3 = "SHOULD_START_PLAYING_EARLY_PREPARE";
            } else {
                str3 = "SHOULD_START_PLAYING";
            }
            lightweightQuickPerformanceLogger.markerPoint(61680819, i, str3);
        }
    }

    public void A0q(String str, String str2) {
        C114945Hk c114945Hk;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        if (("start".equals(str2) || "resume".equals(str2)) && (c114945Hk = (C114945Hk) this.A04.get(str)) != null) {
            this.A03.markerPoint(61680819, c114945Hk.A0E, "SHOULD_START_PLAYING");
        }
    }

    public void A0r(String str, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        Object obj = map.get(TraceFieldType.StreamType);
        if (obj == null) {
            obj = "UNKNOWN";
        }
        EnumC91984Ae valueOf = EnumC91984Ae.valueOf((String) obj);
        Object obj2 = map.get("cache_type");
        C14360o3.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj2;
        LruCache lruCache = this.A01;
        if (lruCache.get(str) != null) {
            if (A01(valueOf) && ((A9C) lruCache.get(str)).A01 == C05F.A1F) {
                A9C a9c = (A9C) lruCache.get(str);
                a9c.A01 = C05F.A1I;
                a9c.A03 = str2;
            } else if (A00(valueOf) && ((A9C) lruCache.get(str)).A00 == C05F.A1F) {
                A9C a9c2 = (A9C) lruCache.get(str);
                a9c2.A00 = C05F.A1I;
                a9c2.A02 = str2;
            }
        }
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            Object obj3 = map.get("bytes_length");
            if (obj3 == null) {
                obj3 = -1;
            }
            long longValue = ((Number) obj3).longValue();
            Object obj4 = map.get("req_length");
            if (obj4 == null) {
                obj4 = -1;
            }
            long longValue2 = ((Number) obj4).longValue();
            if (A01(valueOf)) {
                if (c114945Hk.A04 == C05F.A1F) {
                    c114945Hk.A04 = C05F.A1I;
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
                    int i = c114945Hk.A0E;
                    lightweightQuickPerformanceLogger.markerPoint(61680819, i, "DID_VIDEO_FIRST_DATA_SEGMENT_READ_DISK_CACHE_END");
                    if (!str2.equals(EnumC92424Bx.NOT_CACHED)) {
                        c114945Hk.A00 = 0L;
                        c114945Hk.A00 = longValue;
                        lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "FIRST_DATA_SEGMENT_REQUEST_FIRST_BYTE_READ", longValue);
                        return;
                    }
                    return;
                }
                long j = c114945Hk.A00;
                if (j == -1) {
                    return;
                }
                c114945Hk.A00 = j + longValue;
                if (!str2.equals(EnumC92424Bx.NOT_CACHED) && longValue2 >= longValue) {
                    return;
                }
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.A03;
                int i2 = c114945Hk.A0E;
                lightweightQuickPerformanceLogger2.markerPoint(61680819, i2, "VIDEO_FIRST_DATA_SEGMENT_TOTAL_CACHE_READ_COMPLETED");
                lightweightQuickPerformanceLogger2.markerAnnotate(61680819, i2, "FIRST_DATA_SEGMENT_REQUEST_TOTAL_BYTE_READ", c114945Hk.A00);
                c114945Hk.A00 = -1L;
                return;
            }
            if (!A00(valueOf) || c114945Hk.A01 != C05F.A1F) {
                return;
            }
            c114945Hk.A01 = C05F.A1I;
            this.A03.markerPoint(61680819, c114945Hk.A0E, "DID_AUDIO_FIRST_DATA_SEGMENT_READ_DISK_CACHE_END");
        }
    }

    public void A0s(String str, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        Object obj = map.get(TraceFieldType.StreamType);
        if (obj == null) {
            obj = "UNKNOWN";
        }
        EnumC91984Ae valueOf = EnumC91984Ae.valueOf((String) obj);
        LruCache lruCache = this.A01;
        if (lruCache.get(str) == null) {
            lruCache.put(str, new A9C());
        }
        boolean A01 = A01(valueOf);
        if (A01 && ((A9C) lruCache.get(str)).A01 == C05F.A00) {
            ((A9C) lruCache.get(str)).A01 = C05F.A1F;
        } else if (A00(valueOf) && ((A9C) lruCache.get(str)).A00 == C05F.A00) {
            ((A9C) lruCache.get(str)).A00 = C05F.A1F;
        }
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            Object obj2 = map.get("video_absolute_position_ms");
            if (obj2 == null) {
                obj2 = -1;
            }
            long longValue = ((Number) obj2).longValue();
            Object obj3 = map.get("req_length");
            if (obj3 == null) {
                obj3 = -1;
            }
            long longValue2 = ((Number) obj3).longValue();
            if (A01 && c114945Hk.A04 == C05F.A00) {
                c114945Hk.A04 = C05F.A1F;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
                int i = c114945Hk.A0E;
                lightweightQuickPerformanceLogger.markerPoint(61680819, i, "DID_VIDEO_FIRST_DATA_SEGMENT_READ_DISK_CACHE_START");
                lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "FIRST_DATA_SEGMENT_REQUEST_POS", longValue);
                lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "FIRST_DATA_SEGMENT_REQUEST_LENGTH", longValue2);
                return;
            }
            if (!A00(valueOf) || c114945Hk.A01 != C05F.A00) {
                return;
            }
            c114945Hk.A01 = C05F.A1F;
            this.A03.markerPoint(61680819, c114945Hk.A0E, "DID_AUDIO_FIRST_DATA_SEGMENT_READ_DISK_CACHE_START");
        }
    }

    public void A0t(String str, Map map) {
        String str2;
        String str3;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        int i;
        int i2;
        String str4;
        String str5;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            Object obj = map.get(TraceFieldType.StreamType);
            if (obj == null) {
                obj = "UNKNOWN";
            }
            EnumC91984Ae valueOf = EnumC91984Ae.valueOf((String) obj);
            String str6 = c114945Hk.A08;
            if (str6 == null || str6.equals("unknown")) {
                switch (valueOf.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        str2 = "dash";
                        break;
                    case 5:
                        str2 = "progressive";
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        str2 = "live";
                        break;
                    default:
                        str2 = "unknown";
                        break;
                }
                c114945Hk.A08 = str2;
            }
            Object obj2 = map.get("cache_type");
            String str7 = null;
            if (obj2 instanceof String) {
                str3 = (String) obj2;
            } else {
                str3 = null;
            }
            Object obj3 = map.get("request_type");
            if (obj3 instanceof String) {
                str7 = (String) obj3;
            }
            if (A01(valueOf) && c114945Hk.A05 == C05F.A0N) {
                c114945Hk.A09 = str3;
                c114945Hk.A0A = str7;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.A03;
                int i3 = c114945Hk.A0E;
                C4BJ.A00(lightweightQuickPerformanceLogger2, map, 61680819, i3);
                if (C14360o3.A0K(map.get("cancelled"), true)) {
                    Integer num = C05F.A15;
                    c114945Hk.A05 = num;
                    c114945Hk.A03 = num;
                    str5 = "DID_VIDEO_REQUEST_CANCEL";
                } else {
                    c114945Hk.A05 = C05F.A0Y;
                    lightweightQuickPerformanceLogger2.markerPoint(61680819, i3, "DID_VIDEO_DATA_END_FETCHING");
                    str5 = "DID_VIDEO_REQUEST_COMPLETE";
                }
                lightweightQuickPerformanceLogger2.markerPoint(61680819, i3, str5);
            }
            if (A00(valueOf) && c114945Hk.A02 == C05F.A0N) {
                c114945Hk.A06 = str3;
                c114945Hk.A07 = str7;
                if (C14360o3.A0K(map.get("cancelled"), true)) {
                    c114945Hk.A02 = C05F.A15;
                    lightweightQuickPerformanceLogger = this.A03;
                    i = 61680819;
                    i2 = c114945Hk.A0E;
                    str4 = "DID_AUDIO_REQUEST_CANCEL";
                } else {
                    c114945Hk.A02 = C05F.A0Y;
                    lightweightQuickPerformanceLogger = this.A03;
                    i = 61680819;
                    i2 = c114945Hk.A0E;
                    lightweightQuickPerformanceLogger.markerPoint(61680819, i2, "DID_AUDIO_DATA_END_FETCHING");
                    str4 = "DID_AUDIO_REQUEST_COMPLETE";
                }
                lightweightQuickPerformanceLogger.markerPoint(i, i2, str4);
            }
        }
    }

    public void A0u(String str, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            Object obj = map.get(TraceFieldType.StreamType);
            if (obj == null) {
                obj = "UNKNOWN";
            }
            EnumC91984Ae valueOf = EnumC91984Ae.valueOf((String) obj);
            if (A01(valueOf) && c114945Hk.A05 == C05F.A00) {
                c114945Hk.A05 = C05F.A0C;
                this.A03.markerPoint(61680819, c114945Hk.A0E, "DID_RECEIVE_VIDEO_LOADING_REQUEST");
            }
            if (A00(valueOf) && c114945Hk.A02 == C05F.A00) {
                c114945Hk.A02 = C05F.A0C;
                this.A03.markerPoint(61680819, c114945Hk.A0E, "DID_RECEIVE_AUDIO_LOADING_REQUEST");
            }
        }
    }

    public void A0v(String str, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            Integer num = c114945Hk.A03;
            if (num != C05F.A00 && num != C05F.A0N) {
                return;
            }
            Object obj = map.get(TraceFieldType.StreamType);
            if (obj == null) {
                obj = "UNKNOWN";
            }
            EnumC91984Ae valueOf = EnumC91984Ae.valueOf((String) obj);
            if (A01(valueOf) && c114945Hk.A05 == C05F.A0C) {
                c114945Hk.A05 = C05F.A0N;
                this.A03.markerPoint(61680819, c114945Hk.A0E, "DID_VIDEO_DATA_START_FETCHING");
            }
            if (!A00(valueOf) || c114945Hk.A02 != C05F.A0C) {
                return;
            }
            c114945Hk.A02 = C05F.A0N;
            this.A03.markerPoint(61680819, c114945Hk.A0E, "DID_AUDIO_DATA_START_FETCHING");
        }
    }

    public void A0w(String str, boolean z) {
        String str2;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                str2 = "SEEKING_BUFFER_START";
            } else {
                str2 = "BUFFER_START";
            }
            if (!c114945Hk.A0C) {
                c114945Hk.A0C = true;
                this.A03.withMarker(61680819, c114945Hk.A0E).pointEditor(str2).markerEditingCompleted();
            }
        }
    }

    public void A0x(String str, boolean z, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            c114945Hk.A03 = C05F.A0j;
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
            int i = c114945Hk.A0E;
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "IS_WARMED", z);
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "START_REASON", str2);
            LruCache lruCache = this.A01;
            if (lruCache.get(str) != null) {
                A9C a9c = (A9C) lruCache.get(str);
                Integer num = a9c.A01;
                Integer num2 = C05F.A1I;
                if (num == num2) {
                    lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "FIRST_DATA_SEGMENT_VIDEO_LOAD_SOURCE", a9c.A03);
                }
                if (a9c.A00 == num2) {
                    lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "FIRST_DATA_SEGMENT_AUDIO_LOAD_SOURCE", a9c.A02);
                }
            }
            lightweightQuickPerformanceLogger.markerPoint(61680819, i, "DID_START_PLAYING");
        }
    }

    @Override // X.InterfaceC11580jH
    public void AD0(String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(str2, 1);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                str3 = "VIDEO_FIRST_DATA_SEGMENT_TRAFFIC_TOKEN";
            } else {
                str3 = "AUDIO_FIRST_DATA_SEGMENT_TRAFFIC_TOKEN";
            }
            this.A03.markerAnnotate(61680819, c114945Hk.A0E, str3, str2);
        }
    }

    @Override // X.InterfaceC11580jH
    public void AD1(String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(str2, 1);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                str3 = "VIDEO_INIT_SEGMENT_TRAFFIC_TOKEN";
            } else {
                str3 = "AUDIO_INIT_SEGMENT_TRAFFIC_TOKEN";
            }
            this.A03.markerAnnotate(61680819, c114945Hk.A0E, str3, str2);
        }
    }

    @Override // X.InterfaceC11580jH
    public void CjM(String str, boolean z, String str2) {
        Integer num;
        String str3;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0Q;
            } else {
                num = C05F.A0P;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (31 - num.intValue() != 0) {
                str3 = "VIDEO_FIRST_DATA_SEGMENT_ENTER_NETWORK_QUEUE_START";
            } else {
                str3 = "AUDIO_FIRST_DATA_SEGMENT_ENTER_NETWORK_QUEUE_START";
            }
            withMarker.pointEditor(str3).addPointData("STREAM_TYPE", str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CjN(String str, boolean z, String str2) {
        Integer num;
        String str3;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0S;
            } else {
                num = C05F.A0R;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (33 - num.intValue() != 0) {
                str3 = "VIDEO_FIRST_DATA_SEGMENT_ENTER_NETWORK_QUEUE_END";
            } else {
                str3 = "AUDIO_FIRST_DATA_SEGMENT_ENTER_NETWORK_QUEUE_END";
            }
            withMarker.pointEditor(str3).addPointData("STREAM_TYPE", str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CjO(String str, boolean z) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0a;
            } else {
                num = C05F.A0Z;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (40 - num.intValue() != 0) {
                str2 = "VIDEO_FIRST_DATA_SEGMENT_REQUEST_END";
            } else {
                str2 = "AUDIO_FIRST_DATA_SEGMENT_REQUEST_END";
            }
            withMarker.pointEditor(str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CjP(String str, boolean z) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0X;
            } else {
                num = C05F.A0W;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (38 - num.intValue() != 0) {
                str2 = "VIDEO_FIRST_DATA_SEGMENT_REQUEST_RECEIVED_HEADER";
            } else {
                str2 = "AUDIO_FIRST_DATA_SEGMENT_REQUEST_RECEIVED_HEADER";
            }
            withMarker.pointEditor(str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CjQ(String str, boolean z) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0V;
            } else {
                num = C05F.A0U;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (36 - num.intValue() != 0) {
                str2 = "VIDEO_FIRST_DATA_SEGMENT_REQUEST_START";
            } else {
                str2 = "AUDIO_FIRST_DATA_SEGMENT_REQUEST_START";
            }
            withMarker.pointEditor(str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CkB(String str, boolean z, String str2) {
        Integer num;
        String str3;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0F;
            } else {
                num = C05F.A0E;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (21 - num.intValue() != 0) {
                str3 = "VIDEO_INIT_SEGMENT_ENTER_NETWORK_QUEUE_START";
            } else {
                str3 = "AUDIO_INIT_SEGMENT_ENTER_NETWORK_QUEUE_START";
            }
            withMarker.pointEditor(str3).addPointData("STREAM_TYPE", str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CkC(String str, boolean z, String str2) {
        Integer num;
        String str3;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0H;
            } else {
                num = C05F.A0G;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (23 - num.intValue() != 0) {
                str3 = "VIDEO_INIT_SEGMENT_ENTER_NETWORK_QUEUE_END";
            } else {
                str3 = "AUDIO_INIT_SEGMENT_ENTER_NETWORK_QUEUE_END";
            }
            withMarker.pointEditor(str3).addPointData("STREAM_TYPE", str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CkD(String str, boolean z) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0O;
            } else {
                num = C05F.A0M;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (29 - num.intValue() != 0) {
                str2 = "VIDEO_INIT_SEGMENT_REQUEST_END";
            } else {
                str2 = "AUDIO_INIT_SEGMENT_REQUEST_END";
            }
            withMarker.pointEditor(str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CkE(String str, boolean z) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0L;
            } else {
                num = C05F.A0K;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (27 - num.intValue() != 0) {
                str2 = "VIDEO_INIT_SEGMENT_REQUEST_RECEIVED_HEADER";
            } else {
                str2 = "AUDIO_INIT_SEGMENT_REQUEST_RECEIVED_HEADER";
            }
            withMarker.pointEditor(str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CkF(String str, boolean z) {
        Integer num;
        String str2;
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            if (z) {
                num = C05F.A0J;
            } else {
                num = C05F.A0I;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (25 - num.intValue() != 0) {
                str2 = "VIDEO_INIT_SEGMENT_REQUEST_START";
            } else {
                str2 = "AUDIO_INIT_SEGMENT_REQUEST_START";
            }
            withMarker.pointEditor(str2).markerEditingCompleted();
        }
    }

    @Override // X.InterfaceC11580jH
    public void CmD(String str, C09530e4 c09530e4, int i) {
        C14360o3.A0B(str, 0);
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
            int i2 = c114945Hk.A0E;
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i2, "DISTANCE_FROM_VIEWPORT", i);
            if (c09530e4 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(61680819, i2, "UI_GRAPH_ROW", ((Number) c09530e4.A00).intValue());
                lightweightQuickPerformanceLogger.markerAnnotate(61680819, i2, "UI_GRAPH_COLUMN", ((Number) c09530e4.A01).intValue());
                return;
            }
            return;
        }
        this.A02.put(str, new C09530e4(Integer.valueOf(i), c09530e4));
    }

    public static final boolean A00(EnumC91984Ae enumC91984Ae) {
        if (enumC91984Ae != EnumC91984Ae.DASH_AUDIO && enumC91984Ae != EnumC91984Ae.LIVE_AUDIO && enumC91984Ae != EnumC91984Ae.PROGRESSIVE) {
            return false;
        }
        return true;
    }

    public static final boolean A01(EnumC91984Ae enumC91984Ae) {
        if (enumC91984Ae != EnumC91984Ae.DASH_VIDEO && enumC91984Ae != EnumC91984Ae.LIVE_VIDEO && enumC91984Ae != EnumC91984Ae.DASH_UNKNOWN && enumC91984Ae != EnumC91984Ae.UNKNOWN && enumC91984Ae != EnumC91984Ae.PROGRESSIVE) {
            return false;
        }
        return true;
    }

    public void A0c(long j, String str, boolean z, String str2) {
        Integer num;
        String str3;
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            c114945Hk.A03 = C05F.A0j;
            if (z) {
                num = C05F.A0g;
            } else {
                num = C05F.A0f;
            }
            MarkerEditor withMarker = this.A03.withMarker(61680819, c114945Hk.A0E);
            if (46 - num.intValue() != 0) {
                str3 = "DID_INITIALIZE_VIDEO_DECODER";
            } else {
                str3 = "DID_INITIALIZE_AUDIO_DECODER";
            }
            withMarker.pointEditor(str3).addPointData("DECODER_NAME", str2).addPointData("INITIALIZATION_DURATION_MS", j).markerEditingCompleted();
        }
    }

    public void A0f(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i, int i2, long j) {
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null && !c114945Hk.A0D) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
            int i3 = c114945Hk.A0E;
            lightweightQuickPerformanceLogger.markerPoint(61680819, i3, "DID_SELECT_QUALITY");
            c114945Hk.A0D = true;
            C4BJ.A00(lightweightQuickPerformanceLogger, AbstractC06930Yk.A06(new C09530e4("BANDWIDTH_ESTIMATE", Long.valueOf(j)), new C09530e4("SELECTED_QUALITY_LABEL", str2), new C09530e4("LOWEST_QUALITY_LABEL", str4), new C09530e4("HIGHEST_QUALITY_LABEL", str5), new C09530e4("DECISION_REASON", str3), new C09530e4("SELECTED_BITRATE", Integer.valueOf(i)), new C09530e4("PLAYER_CONSTRAINT_BITRATE", Integer.valueOf(i2)), new C09530e4("LOWEST_BITRATE", num), new C09530e4("HIGHEST_BITRATE", num2)), 61680819, i3);
        }
    }

    public void A0n(String str, long j) {
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            this.A03.withMarker(61680819, c114945Hk.A0E).pointEditor("ON_SEEKING").addPointData("SEEK_TO_POSITION", j).markerEditingCompleted();
        }
    }

    public void A0o(String str, long j, String str2, String str3, String str4, String str5) {
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            c114945Hk.A03 = C05F.A0j;
            LinkedHashMap A062 = AbstractC06930Yk.A06(new C09530e4("STREAMING_FORMAT", c114945Hk.A08), new C09530e4("AUDIO_LOAD_SOURCE", c114945Hk.A06), new C09530e4("VIDEO_LOAD_SOURCE", c114945Hk.A09), new C09530e4("AUDIO_REQUEST_TYPE", c114945Hk.A07), new C09530e4("VIDEO_REQUEST_TYPE", c114945Hk.A0A));
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
            int i = c114945Hk.A0E;
            C4BJ.A00(lightweightQuickPerformanceLogger, A062, 61680819, i);
            lightweightQuickPerformanceLogger.markerPoint(61680819, i, "HERO_VIDEO_STARTED_PLAYING");
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "HERO_VIDEO_STARTED_STALL_REASON", str2);
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "HERO_VIDEO_STARTED_STALL_MS", j);
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "HERO_VIDEO_STARTED_SESSION_ID", str5);
            if (str3 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "HERO_VIDEO_STARTED_LAST_ERROR", str3);
            }
            if (str4 != null) {
                lightweightQuickPerformanceLogger.markerAnnotate(61680819, i, "HERO_VIDEO_STARTED_LAST_RETRY", str4);
            }
            if (this.A05) {
                A0h(str);
            }
        }
    }

    @Override // X.InterfaceC11580jH
    public void CjT(String str, int i, boolean z) {
        C114945Hk c114945Hk = (C114945Hk) this.A04.get(str);
        if (c114945Hk != null) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
            int i2 = c114945Hk.A0E;
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i2, "INITIAL_HTTP_PRIORITY", i);
            lightweightQuickPerformanceLogger.markerAnnotate(61680819, i2, "IS_HTTP_PRIORITY_SEQUENTIAL", z);
        }
    }

    public void A0e(Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        C09530e4 c09530e4;
        C09530e4 c09530e42;
        C114945Hk c114945Hk = new C114945Hk(str);
        this.A04.put(str, c114945Hk);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A03;
        int i = c114945Hk.A0E;
        lightweightQuickPerformanceLogger.markerStart(61680819, i);
        C1CM c1cm = new C1CM(this.A00);
        C15G A00 = C15G.A00();
        C09530e4[] c09530e4Arr = new C09530e4[30];
        C09530e4 c09530e43 = new C09530e4("MEDIA_ID", str);
        C09530e4 c09530e44 = new C09530e4("PRODUCT", str2);
        C09530e4 c09530e45 = new C09530e4("MODULE", str3);
        C09530e4 c09530e46 = new C09530e4("SOURCE_TYPE", str4);
        C09530e4 c09530e47 = new C09530e4("VIDEO_URL", str5);
        C09530e4 c09530e48 = new C09530e4("HAS_AUDIO", bool);
        C09530e4 c09530e49 = new C09530e4("IS_FULL_SCREEN", Boolean.valueOf(z));
        C09530e4 c09530e410 = new C09530e4("IS_SPONSORED", Boolean.valueOf(z2));
        C09530e4 c09530e411 = new C09530e4("LOGGER_VERSION", 4);
        C09530e4 c09530e412 = new C09530e4("LIGHT_SENSOR_LUX", Integer.valueOf((int) AbstractC71553Ja.A00));
        C1CM.A00(c1cm);
        C09530e4 c09530e413 = new C09530e4("BATTERY_LEVEL", Integer.valueOf(c1cm.A00));
        C1CM.A00(c1cm);
        C09530e4 c09530e414 = new C09530e4("BATTERY_STATUS", c1cm.A01);
        C09530e4 c09530e415 = new C09530e4("SCREEN_BRIGHTNESS", Integer.valueOf(c1cm.A01()));
        C09530e4 c09530e416 = new C09530e4("THERMAL_STATUS", Integer.valueOf(c1cm.A02()));
        PowerManager powerManager = (PowerManager) c1cm.A09.getValue();
        System.arraycopy(new C09530e4[]{c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, c09530e49, c09530e410, c09530e411, c09530e412, c09530e413, c09530e414, c09530e415, c09530e416, new C09530e4("POWER_SAVE_MODE", Boolean.valueOf(powerManager != null ? powerManager.isPowerSaveMode() : false)), new C09530e4("ON_WIFI", Boolean.valueOf(c1cm.A07(true))), new C09530e4("CHIP_VENDOR", A00.A01), new C09530e4("CHIP_NAME", A00.A00), new C09530e4("HAS_VP9_HW", C121815fZ.A04.getValue()), new C09530e4("HAS_AV1_HW", C121815fZ.A02.getValue()), new C09530e4("HAS_AVC_HW", C121815fZ.A03.getValue()), new C09530e4("HAS_AV1_HW_10_BIT", C121815fZ.A05.getValue()), new C09530e4("HAS_VP9_HW_10_BIT", C121815fZ.A06.getValue()), new C09530e4("HAS_HLG_SCREEN", AbstractC121885fg.A01.getValue()), new C09530e4("POSITION_INFO", num), new C09530e4("SESSION_VALIDATION_TOKEN", str7), new C09530e4("vp_session_id", str6)}, 0, c09530e4Arr, 0, 27);
        LruCache lruCache = this.A02;
        C09530e4 c09530e417 = (C09530e4) lruCache.get(str);
        Object obj3 = null;
        if (c09530e417 != null) {
            obj = c09530e417.A00;
        } else {
            obj = null;
        }
        C09530e4 c09530e418 = new C09530e4("DISTANCE_FROM_VIEWPORT", obj);
        C09530e4 c09530e419 = (C09530e4) lruCache.get(str);
        if (c09530e419 != null && (c09530e42 = (C09530e4) c09530e419.A01) != null) {
            obj2 = c09530e42.A00;
        } else {
            obj2 = null;
        }
        C09530e4 c09530e420 = new C09530e4("UI_GRAPH_ROW", obj2);
        C09530e4 c09530e421 = (C09530e4) lruCache.get(str);
        if (c09530e421 != null && (c09530e4 = (C09530e4) c09530e421.A01) != null) {
            obj3 = c09530e4.A01;
        }
        System.arraycopy(new C09530e4[]{c09530e418, c09530e420, new C09530e4("UI_GRAPH_COLUMN", obj3)}, 0, c09530e4Arr, 27, 3);
        C4BJ.A00(lightweightQuickPerformanceLogger, AbstractC06930Yk.A06(c09530e4Arr), 61680819, i);
    }
}
