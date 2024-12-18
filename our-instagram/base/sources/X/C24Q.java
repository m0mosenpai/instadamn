package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.24Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24Q {
    public UserFlowLoggerImpl A00;
    public C218914p A01;
    public C24M A02;
    public C24O A03;
    public final Handler A04;
    public final InterfaceC12870lZ A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final UserSession A09;
    public final LinkedList A0A;

    public C24Q(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A09 = userSession;
        this.A00 = new UserFlowLoggerImpl(C006802i.A0p, true, false);
        this.A04 = new Handler(Looper.getMainLooper());
        this.A08 = new ConcurrentHashMap();
        this.A07 = new ConcurrentHashMap();
        this.A06 = new ConcurrentHashMap();
        this.A0A = new LinkedList();
        this.A05 = new InterfaceC12870lZ() { // from class: X.24R
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-1966474660);
                C24Q c24q = C24Q.this;
                c24q.A00.onAppBackgrounded();
                Map map = c24q.A08;
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    c24q.A04.removeCallbacks((Runnable) ((Map.Entry) it.next()).getValue());
                }
                Map map2 = c24q.A07;
                Iterator it2 = map2.entrySet().iterator();
                while (it2.hasNext()) {
                    c24q.A04.removeCallbacks((Runnable) ((Map.Entry) it2.next()).getValue());
                }
                map.clear();
                map2.clear();
                c24q.A06.clear();
                C0f9.A0A(-1271899285, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C0f9.A0A(-686635306, C0f9.A03(-792850903));
            }
        };
    }

    public final long A03(int i, long j) {
        return A04(null, null, i, j);
    }

    public final long A06(String str, String str2, int i, long j) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        UserFlowLoggerImpl userFlowLoggerImpl = this.A00;
        userFlowLoggerImpl.flowAnnotate(j, "detailed_cancel_reason", str2, A00(this, "", j, false));
        userFlowLoggerImpl.flowEndCancel(j, str, A00(this, "", j, true));
        A01(this, i, j);
        this.A06.remove(Long.valueOf(j));
        return i;
    }

    public final long A07(String str, String str2, int i, long j) {
        C14360o3.A0B(str, 2);
        UserFlowLoggerImpl userFlowLoggerImpl = this.A00;
        userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.Error, str, A00(this, str2, j, false));
        userFlowLoggerImpl.flowEndFail(j, "", null, A00(this, str2, j, true));
        A01(this, i, j);
        this.A06.remove(Long.valueOf(j));
        return i;
    }

    public final void A09(long j, String str, String str2) {
        A0B(j, str, str2, false);
    }

    public final void A0A(long j, String str, String str2) {
        A0B(j, str, str2, true);
    }

    public final void A0B(long j, String str, String str2, boolean z) {
        C14360o3.A0B(str2, 2);
        UserFlowLoggerImpl userFlowLoggerImpl = this.A00;
        String A00 = A00(this, "", j, false);
        if (z) {
            userFlowLoggerImpl.flowAnnotateWithCrucialData(j, str, str2, A00);
            Map map = this.A06;
            Long valueOf = Long.valueOf(j);
            Number number = (Number) map.get(valueOf);
            int i = 1;
            if (number != null) {
                i = 1 + number.intValue();
            }
            map.put(valueOf, Integer.valueOf(i));
            if (i > 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Marker Id ");
                sb.append((int) j);
                sb.append(" key ");
                sb.append(str);
                sb.append(" number ");
                sb.append(i);
                String obj = sb.toString();
                C14360o3.A0B(obj, 0);
                AbstractC12120kG.A0I("IgCameraStrictUserFlowLogger", null, AbstractC16850sd.A0M(new C09530e4("Exceeded Crucial Annotations", obj)));
                return;
            }
            return;
        }
        userFlowLoggerImpl.flowAnnotate(j, str, str2, A00);
    }

    public final void A0C(String str, long j) {
        A0D(str, j, null, null, null, null);
    }

    public final void A0D(String str, long j, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str, 1);
        String str6 = "";
        if (str3 != null) {
            String str7 = str5;
            if (str5 == null) {
                str7 = "";
            }
            String A0T = AnonymousClass001.A0T(str3, str7, '-');
            if (A0T != null) {
                str6 = A0T;
            }
        }
        PointEditor markPointWithEditor = this.A00.markPointWithEditor(j, str, A00(this, str6, j, false));
        if (str2 != null) {
            markPointWithEditor.addPointData(str2, str3);
        }
        if (str4 != null) {
            markPointWithEditor.addPointData(str4, str5);
        }
        markPointWithEditor.markerEditingCompleted();
    }

    public static final String A00(C24Q c24q, String str, long j, boolean z) {
        String str2;
        EnumC114925Hg enumC114925Hg;
        EnumC50631MWs enumC50631MWs;
        String str3;
        String BWE;
        LinkedList linkedList = c24q.A0A;
        Long valueOf = Long.valueOf(j);
        if (linkedList.contains(valueOf)) {
            if (z) {
                linkedList.remove(valueOf);
            }
            str2 = "flow_already_had_timeout";
        } else {
            str2 = "";
        }
        C24M c24m = c24q.A02;
        C22P c22p = null;
        if (c24m != null) {
            enumC114925Hg = c24m.Ajy();
        } else {
            enumC114925Hg = null;
        }
        if (c24m != null) {
            enumC50631MWs = c24m.C4H();
        } else {
            enumC50631MWs = null;
        }
        if (c24m != null) {
            c22p = c24m.B2Q();
        }
        String format = String.format("%s:%s,%s:%s,%s:%s", Arrays.copyOf(new Object[]{"camera_destination", enumC114925Hg, "surface", enumC50631MWs, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c22p}, 6));
        C14360o3.A07(format);
        C24O c24o = c24q.A03;
        if (c24o != null && (BWE = c24o.BWE()) != null) {
            int length = BWE.length();
            int i = 500;
            if (500 > length) {
                i = length;
            }
            str3 = BWE.substring(length - i);
            C14360o3.A07(str3);
        } else {
            str3 = null;
        }
        return AnonymousClass001.A15(str2, ", ", str, ", ", format, ",nav_chain:", str3);
    }

    public static final void A01(C24Q c24q, int i, long j) {
        Map map = c24q.A08;
        Integer valueOf = Integer.valueOf(i);
        C48U c48u = (C48U) map.get(valueOf);
        if (c48u != null) {
            c24q.A04.removeCallbacks(c48u);
            map.remove(valueOf);
        }
        Map map2 = c24q.A07;
        Long valueOf2 = Long.valueOf(j);
        C48U c48u2 = (C48U) map2.get(valueOf2);
        if (c48u2 != null) {
            c24q.A04.removeCallbacks(c48u2);
            map2.remove(valueOf2);
        }
    }

    public final long A02(int i, long j) {
        this.A00.flowEndSuccess(j, A00(this, "", j, true));
        A01(this, i, j);
        this.A06.remove(Long.valueOf(j));
        return i;
    }

    public final long A04(Integer num, String str, int i, long j) {
        Map map;
        Object valueOf;
        UserFlowLoggerImpl userFlowLoggerImpl;
        long generateNewFlowId;
        C48U c48u;
        if (num != null) {
            userFlowLoggerImpl = this.A00;
            generateNewFlowId = userFlowLoggerImpl.generateFlowId(i, num.intValue());
            map = this.A07;
            valueOf = Long.valueOf(generateNewFlowId);
            if (map.get(valueOf) != null) {
                userFlowLoggerImpl.flowEndNewStartFound(generateNewFlowId);
                A01(this, i, generateNewFlowId);
                this.A06.remove(valueOf);
            }
            c48u = new C48U(userFlowLoggerImpl, this.A0A, this.A08, map, this.A06, i, generateNewFlowId);
        } else {
            map = this.A08;
            valueOf = Integer.valueOf(i);
            C48U c48u2 = (C48U) map.get(valueOf);
            if (c48u2 != null) {
                UserFlowLoggerImpl userFlowLoggerImpl2 = this.A00;
                long j2 = c48u2.A00;
                userFlowLoggerImpl2.flowEndNewStartFound(j2);
                A01(this, i, j2);
                this.A06.remove(Long.valueOf(j2));
            }
            userFlowLoggerImpl = this.A00;
            generateNewFlowId = userFlowLoggerImpl.generateNewFlowId(i);
            c48u = new C48U(userFlowLoggerImpl, this.A0A, map, this.A07, this.A06, i, generateNewFlowId);
        }
        map.put(valueOf, c48u);
        userFlowLoggerImpl.flowStart(generateNewFlowId, "", true, j);
        this.A04.postDelayed(c48u, j);
        C24M c24m = this.A02;
        if (c24m != null) {
            userFlowLoggerImpl.flowAnnotateWithCrucialData(generateNewFlowId, "camera_destination", c24m.Ajy().toString());
            userFlowLoggerImpl.flowAnnotateWithCrucialData(generateNewFlowId, "camera_session_id", c24m.Ak5());
            userFlowLoggerImpl.flowAnnotate(generateNewFlowId, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, c24m.B2Q().toString());
            userFlowLoggerImpl.flowAnnotate(generateNewFlowId, "surface", c24m.C4H().toString());
        }
        if (str != null) {
            userFlowLoggerImpl.flowAnnotate(generateNewFlowId, "logging_source", str);
        }
        return generateNewFlowId;
    }

    public final long A05(String str, int i, long j, long j2) {
        String BWE;
        long j3 = j;
        if (!A0E(i, j3)) {
            j3 = A04(null, "forced_start", i, j2);
            A0B(j3, "marker_started_with_point", str, false);
            C24O c24o = this.A03;
            if (c24o != null && (BWE = c24o.BWE()) != null) {
                int length = BWE.length();
                int i2 = 500;
                if (500 > length) {
                    i2 = length;
                }
                String substring = BWE.substring(length - i2);
                C14360o3.A07(substring);
                A0B(j3, "nav_chain", substring, false);
            }
        }
        A0D(str, j3, null, null, null, null);
        return j3;
    }

    public final void A08(long j, long j2, int i) {
        C48U c48u = (C48U) this.A08.get(Integer.valueOf(i));
        if (c48u != null) {
            Handler handler = this.A04;
            handler.removeCallbacks(c48u);
            handler.postDelayed(c48u, j2);
        }
        C48U c48u2 = (C48U) this.A07.get(Long.valueOf(j));
        if (c48u2 != null) {
            Handler handler2 = this.A04;
            handler2.removeCallbacks(c48u2);
            handler2.postDelayed(c48u2, j2);
        }
    }

    public final boolean A0E(int i, long j) {
        if (this.A07.get(Long.valueOf(j)) == null && this.A08.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24Q(C218914p c218914p, UserSession userSession, C24M c24m, C24O c24o) {
        this(userSession);
        C14360o3.A0B(c218914p, 2);
        C14360o3.A0B(c24m, 3);
        C14360o3.A0B(c24o, 4);
        C218914p.A03(EnumC220415e.A03, this.A05);
        this.A01 = c218914p;
        this.A02 = c24m;
        this.A03 = c24o;
    }
}
