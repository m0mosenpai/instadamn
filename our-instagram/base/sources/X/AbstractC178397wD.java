package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7wD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC178397wD extends AbstractC178277w1 implements InterfaceC178407wE {
    public String A00;
    public String A01;
    public boolean A02;
    public int A03;
    public String A04;
    public final InterfaceC178367wA A05;
    public final C178467wK A06;
    public final C178487wM A07;
    public final C178517wP A08;
    public final String A09;

    public final void A0A(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, String str5, Map map, long j) {
        C178377wB c178377wB = (C178377wB) this;
        if (!C178377wB.A01(c178377wB, abstractC223559ty)) {
            C18920wW c18920wW = (C18920wW) c178377wB.A02.A00.CC6();
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "audio_pipeline"), 5);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C178997xB A00 = C178377wB.A00(abstractC223559ty, c178377wB, str2, str4, str5, null, map, j);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("event_name", str);
                c0Zx.A06("fba_error_code", str3);
                c25531Mh.A0N(A00, "base");
                c25531Mh.A0N(c0Zx, "shared");
                c25531Mh.Cht();
            }
        }
    }

    public final void A0B(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, String str5, Map map, long j) {
        C178377wB c178377wB = (C178377wB) this;
        if (!C178377wB.A01(c178377wB, abstractC223559ty)) {
            C18920wW c18920wW = (C18920wW) c178377wB.A02.A00.CC6();
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "recording"), 365);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C178997xB A00 = C178377wB.A00(abstractC223559ty, c178377wB, str2, str4, str5, ((AbstractC178387wC) c178377wB).A01.getRecordingSessionId(), map, j);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("event_name", str);
                c0Zx.A06("recording_tracks_info", str3);
                c25531Mh.A0N(A00, "base");
                c25531Mh.A0N(c0Zx, "shared");
                c25531Mh.Cht();
            }
        }
    }

    public final void A0C(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, Map map, long j) {
        C178377wB c178377wB = (C178377wB) this;
        if (!C178377wB.A01(c178377wB, abstractC223559ty)) {
            C18920wW c18920wW = (C18920wW) c178377wB.A02.A00.CC6();
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "media_pipeline"), 339);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C178997xB A00 = C178377wB.A00(abstractC223559ty, c178377wB, str2, str3, str4, (String) c178377wB.A07.A00.get(EnumC178507wO.A01), map, j);
                C0Zx c0Zx = new C0Zx();
                c0Zx.A06("event_name", str);
                ArrayList arrayList = new ArrayList();
                C178467wK c178467wK = c178377wB.A06;
                String str5 = c178467wK.A02;
                if (str5 != null && c178467wK.A03 != null) {
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str5);
                    c0Zx2.A06("size", c178467wK.A03);
                    arrayList.add(c0Zx2);
                }
                c0Zx.A07("current_inputs", arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : c178467wK.A09.entrySet()) {
                    C0Zx c0Zx3 = new C0Zx();
                    c0Zx3.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, (String) entry.getKey());
                    c0Zx3.A06("size", (String) entry.getValue());
                    arrayList2.add(c0Zx3);
                }
                c0Zx.A07("current_outputs", arrayList2);
                c0Zx.A05("open_gl_version", Long.valueOf(c178467wK.A01));
                c25531Mh.A0N(A00, "base");
                c25531Mh.A0N(c0Zx, "shared");
                c25531Mh.Cht();
            }
        }
    }

    @Override // X.InterfaceC178407wE
    public final void Cia(long j, String str, String str2, Map map) {
        Map A08 = A08(str, map);
        String A07 = A07(str, null, null, null, A08, 0);
        A0D(str);
        A09(null, str, str2, null, null, null, A07, A08, j);
        A0E(str, A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void CkX(long j, String str, String str2, Map map) {
        Map A08 = A08(str, map);
        A07(str, null, null, null, A08, 0);
        A0D(str);
        A0C(null, str, str2, null, null, A08, j);
        A0E(str, A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void ClA(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, String str5, long j) {
        Map A08 = A08(str, null);
        A07(str, null, abstractC223559ty.getMessage(), str4, A08, abstractC223559ty.A01);
        A0D(str);
        A0B(abstractC223559ty, str, str2, str3, str4, str5, A08, j);
        A0E(str, A08, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.7vu] */
    @Deprecated
    public AbstractC178397wD(InterfaceC178367wA interfaceC178367wA, String str, String str2) {
        super.A00 = new Object();
        this.A06 = new C178467wK();
        this.A07 = new C178487wM();
        this.A08 = new C178517wP();
        this.A03 = 0;
        this.A05 = interfaceC178367wA;
        String obj = UUID.randomUUID().toString();
        this.A09 = obj;
        Ebc(str2);
        Ebb(str);
        A05(C0LK.A4r, obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0014. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A09(X.AbstractC223559ty r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.util.Map r26, long r27) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178397wD.A09(X.9ty, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, long):void");
    }

    public final void A0D(String str) {
        Integer num;
        if (C0L6.A04 == null) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (num == C05F.A01) {
            if (str.equals("media_pipeline_update_effects_list") && !this.A02) {
                List list = this.A06.A05;
                if (list.isEmpty()) {
                    C0L6.A04(C0LK.A4s);
                } else {
                    C0L6.A05(C0LK.A4s, A04(list));
                }
            }
        } else {
            C0PX c0px = AbstractC04290Kv.A00;
            if (str.equals("media_pipeline_update_effects_list") && c0px != null && !this.A02) {
                List list2 = this.A06.A05;
                if (list2.isEmpty()) {
                    c0px.A00(C0LK.A4s);
                } else {
                    c0px.A01(C0LK.A4s, A04(list2));
                }
            }
        }
        if (!str.equals("camera_connect_requested") && !str.equals("media_pipeline_start")) {
            return;
        }
        A05(C0LK.A4u, this.A01);
        A05(C0LK.A4v, this.A00);
        A05(C0LK.A4r, ((AbstractC178387wC) this).A01.getActiveSessionId());
    }

    @Override // X.InterfaceC178407wE
    public final C1819085a ALa() {
        C1819085a c1819085a = new C1819085a();
        c1819085a.A03 = this.A00;
        String str = this.A01;
        if (str != null) {
            c1819085a.A05 = str;
        }
        String activeSessionId = ((AbstractC178387wC) this).A01.getActiveSessionId();
        if (activeSessionId != null) {
            c1819085a.A02 = activeSessionId;
        }
        return c1819085a;
    }

    @Override // X.InterfaceC178407wE
    public final InterfaceC178477wL AkA() {
        return this.A06;
    }

    @Override // X.InterfaceC178287w2
    public final C178307w4 BKX() {
        return InterfaceC178407wE.A00;
    }

    @Override // X.InterfaceC178407wE
    public final AwakeTimeSinceBootClock BUp() {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        return awakeTimeSinceBootClock;
    }

    @Override // X.InterfaceC178407wE
    public final InterfaceC178527wQ BcP() {
        return this.A08;
    }

    @Override // X.InterfaceC178407wE
    public final boolean Bh9() {
        return this.A02;
    }

    @Override // X.InterfaceC178407wE
    public final String BhE() {
        return this.A00;
    }

    @Override // X.InterfaceC178407wE
    public final Map COW(C196498mf c196498mf, Map map) {
        if (c196498mf != null) {
            if (map == null) {
                map = new HashMap(8);
            }
            map.put("perf_frame_count", String.valueOf(c196498mf.A0D));
            map.put("gpu_perf_frame_count", String.valueOf(c196498mf.A0E));
            map.put("delay_perf_frame_count", String.valueOf(c196498mf.A0C));
            map.put("perf_was_recording", String.valueOf(c196498mf.A0G));
            if (!this.A02) {
                map.put("perf_effect_id", String.valueOf(c196498mf.A0F));
            }
            map.put("perf_avg_render_time_ms", String.valueOf(c196498mf.A01));
            map.put("perf_stddev_render_time_ms", String.valueOf(c196498mf.A09));
            map.put("perf_avg_render_gap_time_ms", String.valueOf(c196498mf.A00));
            map.put("perf_stddev_render_gap_time_ms", String.valueOf(c196498mf.A08));
            map.put("perf_out_of_order_startend", String.valueOf(c196498mf.A0B));
            map.put("gpu_perf_avg_render_time_ms", String.valueOf(c196498mf.A05));
            map.put("gpu_perf_stddev_render_time_ms", String.valueOf(c196498mf.A07));
            map.put("gpu_perf_avg_render_gap_time_ms", String.valueOf(c196498mf.A04));
            map.put("gpu_perf_stddev_render_gap_time_ms", String.valueOf(c196498mf.A06));
            map.put("gpu_perf_out_of_order_startend", String.valueOf(c196498mf.A0A));
            map.put("delay_perf_avg_render_time_ms", String.valueOf(c196498mf.A02));
            map.put("delay_perf_stddev_render_time_ms", String.valueOf(c196498mf.A03));
        }
        return map;
    }

    @Override // X.InterfaceC178407wE
    public final void CiQ(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, String str5, long j) {
        Map A08 = A08(str, null);
        A07(str, null, abstractC223559ty.getMessage(), str3, A08, abstractC223559ty.A01);
        A0D(str);
        A0A(abstractC223559ty, str, "AudioPipelineController", str5, str3, str4, A08, j);
        A0E(str, A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void CiR(long j, String str, String str2, Map map) {
        Map A08 = A08(str, map);
        A07(str, null, null, null, A08, 0);
        A0D(str);
        A0A(null, str, str2, null, null, null, A08, j);
        A0E(str, A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void CiZ(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, Map map, long j) {
        Map A08 = A08(str, map);
        String A07 = A07(str, null, abstractC223559ty.getMessage(), str3, A08, abstractC223559ty.A01);
        A0D(str);
        A09(abstractC223559ty, str, str2, str3, str4, null, A07, A08, j);
        A0E(str, A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void Cib(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, String str5, Map map, long j) {
        String A07 = A07("camera_update_failed", "SWITCH", abstractC223559ty.getMessage(), "medium", map, 10016);
        A0D("camera_update_failed");
        A09(abstractC223559ty, "camera_update_failed", "CameraEventLoggerImpl", "medium", "CameraEventLoggerImpl", "SWITCH", A07, map, j);
        A0E("camera_update_failed", map, "SWITCH");
    }

    @Override // X.InterfaceC178407wE
    public final void Cic(String str, String str2, String str3, Map map, long j) {
        Map A08 = A08(str, map);
        String A07 = A07(str, str3, null, null, A08, 0);
        A0D(str);
        A09(null, str, "CameraEventLoggerImpl", null, null, str3, A07, A08, j);
        A0E(str, A08, str3);
    }

    @Override // X.InterfaceC178407wE
    public final void CkW(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, Map map, long j) {
        Map A08 = A08("media_pipeline_error", map);
        A07("media_pipeline_error", null, abstractC223559ty.getMessage(), str3, A08, abstractC223559ty.A01);
        A0D("media_pipeline_error");
        A0C(abstractC223559ty, "media_pipeline_error", str2, str3, str4, A08, j);
        A0E("media_pipeline_error", A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void Cl9(AbstractC223559ty abstractC223559ty, String str, String str2, String str3, String str4, Map map, long j) {
        int i;
        String str5;
        Map A08 = A08(str, map);
        if (abstractC223559ty != null) {
            i = abstractC223559ty.A01;
        } else {
            i = 0;
        }
        if (abstractC223559ty != null) {
            str5 = abstractC223559ty.getMessage();
        } else {
            str5 = null;
        }
        A07(str, null, str5, "debug", map, i);
        A0D(str);
        A0B(abstractC223559ty, str, str2, str3, "debug", str4, A08, j);
        A0E(str, A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void ClB(String str, String str2, String str3, Map map, long j) {
        Map A08 = A08(str, map);
        A07(str, null, null, null, A08, 0);
        A0D(str);
        A0B(null, str, str2, str3, null, null, A08, j);
        A0E(str, A08, null);
    }

    @Override // X.InterfaceC178407wE
    public final void ECT(long j, boolean z) {
        if (z) {
            C178537wR c178537wR = this.A08.A02;
            c178537wR.A00 = true;
            c178537wR.A01.A00(j);
            C178547wS c178547wS = c178537wR.A03;
            if (c178547wS.A04 != 0) {
                c178547wS.A03++;
            }
            c178547wS.A04 = j;
        }
    }

    @Override // X.InterfaceC178407wE
    public final void ECU(long j) {
        C178537wR c178537wR = this.A08.A02;
        C178547wS c178547wS = c178537wR.A01;
        if (c178547wS.A04 != 0) {
            c178547wS.A03++;
        }
        c178547wS.A04 = j;
        if (c178537wR.A00) {
            c178537wR.A03.A00(j);
        }
    }

    @Override // X.InterfaceC178407wE
    public final void Ebc(String str) {
        this.A01 = str;
        A05(C0LK.A4u, str);
    }

    @Override // X.InterfaceC178407wE
    public final void EmV(String str, Throwable th, boolean z) {
        if (str != null && th != null) {
            C0w9 c0w9 = C0w9.A01;
            if (z) {
                c0w9.EmY(str, th);
            } else {
                c0w9.EmQ(str, th);
            }
        }
    }

    public static String A04(List list) {
        if (list.size() < 1) {
            return "";
        }
        int size = list.size();
        String str = (String) list.get(0);
        if (size == 1) {
            return str;
        }
        return AnonymousClass001.A0g(str, "|", (String) list.get(1));
    }

    public static final void A05(C10850hu c10850hu, String str) {
        Integer num;
        if (BreakpadManager.isActive()) {
            if (str != null && !str.isEmpty()) {
                BreakpadManager.setCustomData(c10850hu.A00, str, new Object[0]);
            } else {
                BreakpadManager.removeCustomData(c10850hu.A00);
            }
        }
        if (C0L6.A04 == null) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (num == C05F.A01) {
            if (str != null && !str.isEmpty()) {
                C0L6.A05(c10850hu, str);
                return;
            } else {
                C0L6.A04(c10850hu);
                return;
            }
        }
        C0PX c0px = AbstractC04290Kv.A00;
        if (c0px == null) {
            return;
        }
        if (str != null && !str.isEmpty()) {
            c0px.A01(c10850hu, str);
        } else {
            c0px.A00(c10850hu);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String A07(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.Map r9, int r10) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r3 = 0
            switch(r0) {
                case 1031703104: goto L1d;
                case 1876082191: goto L20;
                case 2110321614: goto L40;
                default: goto L8;
            }
        L8:
            X.0hu r2 = X.C0LK.A4t
            int r1 = r5.length()
            r0 = 40
            int r0 = java.lang.Math.min(r1, r0)
            java.lang.String r0 = r5.substring(r3, r0)
            A05(r2, r0)
            r0 = 0
            return r0
        L1d:
            java.lang.String r0 = "media_pipeline_start"
            goto L22
        L20:
            java.lang.String r0 = "media_pipeline_resume"
        L22:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            X.7wM r0 = r4.A07
            X.7wO r2 = X.EnumC178507wO.A01
            java.util.HashMap r1 = r0.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L8
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.put(r2, r0)
            goto L8
        L40:
            java.lang.String r0 = "camera_created"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L8
            X.7wK r1 = r4.A06
            r0 = -1
            r1.A00 = r0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178397wD.A07(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map A08(java.lang.String r4, java.util.Map r5) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -1771728128: goto L52;
                case -1655512013: goto L33;
                case 1018730470: goto L24;
                case 1028385748: goto Lb;
                case 1219670603: goto L8;
                default: goto L7;
            }
        L7:
            return r5
        L8:
            java.lang.String r0 = "recording_failed"
            goto L54
        Lb:
            java.lang.String r0 = "media_pipeline_pause"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.7wP r1 = r3.A08
            X.8mf r2 = X.C178517wP.A00(r1)
            X.7wR r0 = r1.A02
            r0.A00()
            X.7wR r0 = r1.A01
            r0.A00()
            goto L72
        L24:
            java.lang.String r0 = "media_pipeline_error"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.7wP r0 = r3.A08
            X.8mf r2 = X.C178517wP.A00(r0)
            goto L72
        L33:
            java.lang.String r0 = "recording_started"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.7wP r1 = r3.A08
            X.8mf r2 = X.C178517wP.A00(r1)
            X.7wR r0 = r1.A02
            r0.A00()
            X.7wR r0 = r1.A01
            r0.A00()
            X.7wR r0 = r1.A00
            r0.A00()
            r0 = 1
            goto L70
        L52:
            java.lang.String r0 = "recording_finished"
        L54:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.7wP r1 = r3.A08
            X.8mf r2 = X.C178517wP.A00(r1)
            X.7wR r0 = r1.A02
            r0.A00()
            X.7wR r0 = r1.A01
            r0.A00()
            X.7wR r0 = r1.A00
            r0.A00()
            r0 = 0
        L70:
            r1.A04 = r0
        L72:
            java.util.Map r0 = r3.COW(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178397wD.A08(java.lang.String, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0E(java.lang.String r4, java.util.Map r5, java.lang.String r6) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            switch(r0) {
                case -1629286812: goto L8;
                case 470340763: goto L27;
                case 1028385748: goto Lb;
                case 1709153958: goto L1e;
                default: goto L7;
            }
        L7:
            return
        L8:
            java.lang.String r0 = "media_pipeline_stop"
            goto Ld
        Lb:
            java.lang.String r0 = "media_pipeline_pause"
        Ld:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            X.7wM r0 = r3.A07
            X.7wO r2 = X.EnumC178507wO.A01
            java.util.HashMap r1 = r0.A00
            r0 = 0
            r1.put(r2, r0)
            return
        L1e:
            java.lang.String r0 = "camera_disconnect_failed"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L76
            return
        L27:
            java.lang.String r0 = "camera_disconnect_finished"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L7
            boolean r0 = com.facebook.breakpad.BreakpadManager.isActive()
            java.lang.String r2 = "none"
            if (r0 == 0) goto L53
            java.lang.String r0 = "camera_core_product_id"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            java.lang.String r0 = "camera_core_product_name"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            java.lang.String r0 = "camera_core_effect_ids"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            java.lang.String r0 = "camera_core_last_event"
            com.facebook.breakpad.BreakpadManager.removeCustomData(r0)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "camera_core_camera_session_id"
            com.facebook.breakpad.BreakpadManager.setCustomData(r0, r2, r1)
        L53:
            X.0Mj r0 = X.C0L6.A04
            if (r0 != 0) goto L9a
            java.lang.Integer r0 = X.C05F.A00
        L59:
            java.lang.Integer r1 = X.C05F.A01
            if (r0 != r1) goto L7c
            X.0hu r0 = X.C0LK.A4u
            X.C0L6.A04(r0)
            X.0hu r0 = X.C0LK.A4v
            X.C0L6.A04(r0)
            X.0hu r0 = X.C0LK.A4s
            X.C0L6.A04(r0)
            X.0hu r0 = X.C0LK.A4t
            X.C0L6.A04(r0)
            X.0hu r0 = X.C0LK.A4r
            X.C0L6.A05(r0, r2)
        L76:
            X.7wK r1 = r3.A06
            r0 = -1
            r1.A00 = r0
            return
        L7c:
            X.0PX r1 = X.AbstractC04290Kv.A00
            if (r1 == 0) goto L76
            X.0hu r0 = X.C0LK.A4u
            r1.A00(r0)
            X.0hu r0 = X.C0LK.A4v
            r1.A00(r0)
            X.0hu r0 = X.C0LK.A4s
            r1.A00(r0)
            X.0hu r0 = X.C0LK.A4t
            r1.A00(r0)
            X.0hu r0 = X.C0LK.A4r
            r1.A01(r0, r2)
            goto L76
        L9a:
            java.lang.Integer r0 = X.C05F.A01
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC178397wD.A0E(java.lang.String, java.util.Map, java.lang.String):void");
    }

    @Override // X.InterfaceC178407wE
    public final void EQy(int i) {
        this.A03 = i;
    }

    @Override // X.InterfaceC178407wE
    public final void ETs(String str) {
        this.A04 = str;
    }

    @Override // X.InterfaceC178407wE
    public final void Ebb(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A00 = str;
            A05(C0LK.A4v, str);
            String str2 = this.A00;
            InterfaceC178427wG interfaceC178427wG = ((AbstractC178387wC) this).A01;
            if (interfaceC178427wG != null) {
                interfaceC178427wG.onAnnotationUpdateEvent(23, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("productName cannot be empty");
    }

    public AbstractC178397wD(InterfaceC178207vu interfaceC178207vu, InterfaceC178367wA interfaceC178367wA) {
        super.A00 = interfaceC178207vu;
        this.A06 = new C178467wK();
        this.A07 = new C178487wM();
        this.A08 = new C178517wP();
        this.A03 = 0;
        this.A05 = interfaceC178367wA;
        String obj = UUID.randomUUID().toString();
        this.A09 = obj;
        Ebc((String) super.A00.AqG(C178027vb.A03));
        Ebb((String) A06(C178027vb.A02));
        this.A02 = Boolean.TRUE.equals(super.A00.AqG(C178027vb.A01));
        A05(C0LK.A4r, obj);
    }
}
