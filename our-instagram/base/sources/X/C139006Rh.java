package X;

import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139006Rh {
    public static final C139016Ri A0J = new Object();
    public int A00;
    public int A01;
    public long A02;
    public C3QZ A03;
    public C6RM A04;
    public boolean A05;
    public C138636Pt A06;
    public final long A07;
    public final C51232Ww A08;
    public final C139026Rj A09;
    public final C919249w A0A;
    public final C170977jo A0B;
    public final C22905A8a A0C;
    public final C138996Rg A0D;
    public final List A0E;
    public final Map A0F;
    public final Map A0G;
    public final C19L A0H;
    public final C19L A0I;

    public /* synthetic */ C139006Rh(C51232Ww c51232Ww, C919249w c919249w, C170977jo c170977jo, C22905A8a c22905A8a, C138996Rg c138996Rg, C19L c19l, C19L c19l2) {
        long j;
        C139026Rj c139026Rj = new C139026Rj(c51232Ww, c138996Rg, c19l);
        this.A0A = c919249w;
        this.A0D = c138996Rg;
        this.A0B = c170977jo;
        this.A0C = c22905A8a;
        this.A0I = c19l;
        this.A0H = c19l2;
        this.A08 = c51232Ww;
        this.A09 = c139026Rj;
        String str = ((C1KP) c919249w.A01).A01;
        Map map = c51232Ww.A07;
        if (map != null) {
            Object obj = map.get(str);
            j = ((Number) (obj == null ? Long.valueOf(c51232Ww.A01) : obj)).longValue();
        } else {
            j = c51232Ww.A01;
        }
        this.A07 = j;
        this.A0F = new LinkedHashMap();
        this.A0G = new LinkedHashMap();
        this.A0E = new ArrayList();
    }

    private final void A00(C1KP c1kp, String str, boolean z, boolean z2) {
        C138996Rg c138996Rg = this.A0D;
        C14360o3.A0B(str, 1);
        long j = c1kp.A00;
        C138996Rg.A00(c138996Rg, j);
        c138996Rg.A03.markerPoint(220138478, c138996Rg.A01, "interrupt", str);
        C9C3 c9c3 = new C9C3(c1kp, str, z);
        C139016Ri c139016Ri = A0J;
        C51232Ww c51232Ww = this.A08;
        Map map = this.A0F;
        C138636Pt A02 = c139016Ri.A02(c9c3, c51232Ww, this.A0A, map.values(), C139016Ri.A01(c51232Ww, this.A03, map.values()));
        if (!z2) {
            C138996Rg.A00(c138996Rg, j);
            this.A06 = A02;
            A04(new C207199Ey(1, A02, this), 0, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        } else {
            A03(A02, this, null);
        }
        A02(A02, this);
    }

    public static final void A01(C1KO c1ko, C139006Rh c139006Rh) {
        long j = c1ko.A00;
        Map map = c139006Rh.A0G;
        Long valueOf = Long.valueOf(j);
        C139036Rk c139036Rk = (C139036Rk) map.get(valueOf);
        if (c139036Rk == null) {
            c139036Rk = new C139036Rk(c1ko);
        }
        if (j == c139036Rk.A01 && ((c1ko instanceof C107944td) || (c1ko instanceof C5I1))) {
            c139036Rk.A00 = c1ko;
        }
        map.put(valueOf, c139036Rk);
    }

    public static final void A02(C138636Pt c138636Pt, C139006Rh c139006Rh) {
        C19L c19l = c139006Rh.A0H;
        C9D1 c9d1 = new C9D1(c138636Pt, c139006Rh, null, 6);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d1, c19l);
    }

    public static final void A03(C138636Pt c138636Pt, C139006Rh c139006Rh, String str) {
        String str2;
        int i;
        StringBuilder sb;
        String str3;
        String str4;
        if (!c139006Rh.A05) {
            c139006Rh.A05 = true;
            C6RM c6rm = c139006Rh.A04;
            if (c6rm != null) {
                c6rm.A00();
            }
            c139006Rh.A04 = null;
            C170977jo c170977jo = c139006Rh.A0B;
            if (c170977jo != null) {
                short s = c138636Pt.A03;
                long j = c138636Pt.A00;
                C9C3 c9c3 = c138636Pt.A01;
                List A0a = AbstractC001800i.A0a(c139006Rh.A0F.values());
                List A0a2 = AbstractC001800i.A0a(c139006Rh.A0G.values());
                List A0a3 = AbstractC001800i.A0a(c139006Rh.A0E);
                int i2 = c139006Rh.A01;
                long j2 = c139006Rh.A02;
                int i3 = c139006Rh.A00;
                C006802i c006802i = c170977jo.A01;
                MarkerEditor withMarker = c006802i.withMarker(220142130, c170977jo.A00);
                C14360o3.A0A(withMarker);
                if (c170977jo.A06) {
                    withMarker.annotate("user_sample_rate", 1);
                }
                String str5 = c170977jo.A02.A05;
                if (str5.length() > 0) {
                    withMarker.annotate("treatment_name", str5);
                }
                C919249w c919249w = c170977jo.A04;
                C1KS c1ks = c919249w.A01;
                withMarker.point("enter_new_module", ((C1KP) c1ks).A00);
                withMarker.point("exit_previous_module", c1ks.A00);
                if (c919249w.A06) {
                    str2 = "cold";
                } else {
                    str2 = "hot";
                }
                withMarker.annotate(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                withMarker.annotate("navigation_source", c1ks.A06);
                withMarker.annotate("trigger_down_source", c919249w.A03.A01);
                withMarker.annotate("click_point", c1ks.A05);
                C1KQ c1kq = c919249w.A02;
                if (c1kq != null && (str4 = c1kq.A02) != null) {
                    withMarker.annotate("source_nav_chain", str4);
                }
                String str6 = c1ks.A04;
                if (str6 != null) {
                    withMarker.annotate("dest_nav_chain", str6);
                }
                if (str != null) {
                    withMarker.annotate("nav_destination", str);
                }
                if (c9c3 != null) {
                    withMarker.annotate("interrupt_event", ((C1KP) c9c3.A00).A00());
                    C1KP c1kp = (C1KP) c9c3.A04;
                    withMarker.annotate("interrupt_trigger", c1kp.A00());
                    withMarker.annotate("interrupt_reason", c9c3.A01);
                    long j3 = c1kp.A00;
                    if (j3 <= j) {
                        withMarker.point("interrupt", j3);
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : A0a) {
                    if (((AbstractC139056Rm) obj).A03) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C6P5) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    if (next2 instanceof C139066Rn) {
                        arrayList3.add(next2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (next3 instanceof C6R9) {
                        arrayList4.add(next3);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next4 = it4.next();
                    if (next4 instanceof C6QP) {
                        arrayList5.add(next4);
                    }
                }
                AbstractC139056Rm abstractC139056Rm = (AbstractC139056Rm) AbstractC001800i.A0J(arrayList5);
                C170977jo.A01(withMarker, "images", "image_rendered", arrayList3);
                C170977jo.A01(withMarker, "videos", "videos_rendered", arrayList4);
                C170977jo.A01(withMarker, "loading_indicators", "loading_indicators_completed", arrayList2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it5 = arrayList3.iterator();
                while (it5.hasNext()) {
                    Object next5 = it5.next();
                    String str7 = ((C139066Rn) next5).A00;
                    Object obj2 = linkedHashMap.get(str7);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(str7, obj2);
                    }
                    ((List) obj2).add(next5);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str8 = (String) entry.getKey();
                    if (str8 != null) {
                        withMarker.annotate(AnonymousClass001.A0g("images_loaded_", str8, "_total"), ((List) entry.getValue()).size());
                    }
                }
                Iterator it6 = arrayList3.iterator();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (it6.hasNext()) {
                        Object next6 = it6.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            break;
                        }
                        C170977jo.A00(withMarker, (AbstractC139056Rm) next6, AnonymousClass001.A0O("/media_rendering/image_", i5));
                        i5 = i6;
                    } else {
                        Iterator it7 = arrayList2.iterator();
                        int i7 = 0;
                        while (true) {
                            if (it7.hasNext()) {
                                Object next7 = it7.next();
                                int i8 = i7 + 1;
                                if (i7 < 0) {
                                    break;
                                }
                                C170977jo.A00(withMarker, (AbstractC139056Rm) next7, AnonymousClass001.A0O("loading_", i7));
                                i7 = i8;
                            } else {
                                Iterator it8 = arrayList4.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        Object next8 = it8.next();
                                        int i9 = i4 + 1;
                                        if (i4 < 0) {
                                            break;
                                        }
                                        C170977jo.A00(withMarker, (AbstractC139056Rm) next8, AnonymousClass001.A0O("/media_rendering/video_", i4));
                                        i4 = i9;
                                    } else {
                                        if (abstractC139056Rm != null) {
                                            C170977jo.A00(withMarker, abstractC139056Rm, "camera");
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it9 = A0a2.iterator();
                                        while (true) {
                                            i = 0;
                                            if (!it9.hasNext()) {
                                                break;
                                            }
                                            Object next9 = it9.next();
                                            if (((C139036Rk) next9).A02 != C05F.A0Y) {
                                                arrayList6.add(next9);
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        for (Object obj3 : arrayList6) {
                                            if (((C139036Rk) obj3).A01 <= j) {
                                                arrayList7.add(obj3);
                                            }
                                        }
                                        for (Object obj4 : arrayList7) {
                                            int i10 = i + 1;
                                            if (i >= 0) {
                                                C139036Rk c139036Rk = (C139036Rk) obj4;
                                                Integer num = c139036Rk.A02;
                                                int intValue = num.intValue();
                                                if (intValue != 0) {
                                                    if (intValue != 1) {
                                                        if (intValue != 2) {
                                                            if (intValue == 3) {
                                                                sb = new StringBuilder();
                                                                sb.append("/input/");
                                                                sb.append(i);
                                                                str3 = "/background";
                                                            } else {
                                                                i = i10;
                                                            }
                                                        } else {
                                                            sb = new StringBuilder();
                                                            sb.append("/input/");
                                                            sb.append(i);
                                                            str3 = "/back_button";
                                                        }
                                                    } else {
                                                        sb = new StringBuilder();
                                                        sb.append("/input/");
                                                        sb.append(i);
                                                        str3 = "/key";
                                                    }
                                                } else {
                                                    sb = new StringBuilder();
                                                    sb.append("/input/");
                                                    sb.append(i);
                                                    str3 = "/touch";
                                                }
                                                sb.append(str3);
                                                String obj5 = sb.toString();
                                                if (num == C05F.A0N) {
                                                    withMarker.point(obj5, c139036Rk.A01);
                                                } else {
                                                    withMarker.point(AnonymousClass001.A0R(obj5, "_start"), c139036Rk.A01);
                                                    C1KO c1ko = c139036Rk.A00;
                                                    if (c1ko != null) {
                                                        long j4 = ((C1KP) c1ko).A00;
                                                        if (Long.valueOf(j4) != null) {
                                                            withMarker.point(AnonymousClass001.A0R(obj5, "_end"), j4);
                                                        }
                                                    }
                                                }
                                                i = i10;
                                            }
                                        }
                                        Iterator it10 = A0a3.iterator();
                                        while (it10.hasNext()) {
                                            ((C3DT) it10.next()).ABv(withMarker);
                                        }
                                        withMarker.annotate("idle_reset_count", i2);
                                        if (i2 > 0) {
                                            withMarker.annotate("idle_max_wait_before_reset", j2);
                                        }
                                        withMarker.annotate("idle_max_pings_before_responsive", i3);
                                        withMarker.markerEditingCompleted();
                                        int i11 = c170977jo.A00;
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        c006802i.markerEnd(220142130, i11, s, j, timeUnit);
                                        C138996Rg c138996Rg = c170977jo.A05;
                                        C138996Rg.A00(c138996Rg, SystemClock.uptimeMillis());
                                        QuickPerformanceLogger quickPerformanceLogger = c138996Rg.A03;
                                        int i12 = c138996Rg.A01;
                                        quickPerformanceLogger.markerPoint(220138478, i12, "markerEnd (backdated)", j, timeUnit);
                                        quickPerformanceLogger.markerEnd(220138478, i12, s);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
        }
    }

    private final void A04(InterfaceC16660sJ interfaceC16660sJ, int i, long j) {
        C6RM c6rm = this.A04;
        if (c6rm != null) {
            c6rm.A00();
        }
        C139026Rj c139026Rj = this.A09;
        C138996Rg c138996Rg = c139026Rj.A01;
        C19L c19l = c139026Rj.A02;
        C51232Ww c51232Ww = c139026Rj.A00;
        C6RM c6rm2 = new C6RM(c138996Rg, interfaceC16660sJ, c19l, i, c51232Ww.A02, c51232Ww.A03, j);
        c6rm2.A02 = SystemClock.uptimeMillis();
        c6rm2.A00++;
        c6rm2.A08.post(c6rm2);
        this.A04 = c6rm2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x029d, code lost:
    
        if (r2 == false) goto L197;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1KP, X.1KR] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [X.6Rn, X.6Rm] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.6QP, X.6Rm] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [X.6Rm, X.6R9] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.6Rm] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, X.6Rh] */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.lang.Object, X.1KP] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C1KP r19) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139006Rh.A05(X.1KP):void");
    }
}
