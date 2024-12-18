package com.instagram.ml.remotepresence;

import X.AbstractC06930Yk;
import X.AbstractC09440dt;
import X.AbstractC124995l5;
import X.AbstractC125065lC;
import X.AbstractC16960so;
import X.AbstractC43591JPw;
import X.AbstractC48382Kf;
import X.B4E;
import X.C008302x;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C0K8;
import X.C0eB;
import X.C125005l6;
import X.C125015l7;
import X.C125025l8;
import X.C125035l9;
import X.C125045lA;
import X.C125055lB;
import X.C129805tk;
import X.C14360o3;
import X.C17050sx;
import X.C18U;
import X.C1JX;
import X.C2042792a;
import X.C25121B9r;
import X.C25122B9s;
import X.C2L1;
import X.C30177DRh;
import X.C48362Kd;
import X.C48562Ky;
import X.C50362MLo;
import X.C57247PbV;
import X.C57531Pg5;
import X.C92D;
import X.C92E;
import X.C9EA;
import X.EnumC09460dv;
import X.EnumC129705ta;
import X.InterfaceC09390do;
import X.InterfaceC13000lm;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.MSV;
import X.MUP;
import X.QA7;
import android.content.Context;
import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class RpModelDownloadManager implements InterfaceC13000lm {
    public final List A00;
    public final InterfaceC09390do A01;
    public final UserSession A02;

    public final void A03(ImmutableMap immutableMap, C125025l8 c125025l8) {
        Object obj = null;
        if (immutableMap != null && immutableMap.containsKey("model_path")) {
            InterfaceC16660sJ interfaceC16660sJ = c125025l8.A08;
            MantleDataValue mantleDataValue = (MantleDataValue) immutableMap.get("model_path");
            if (mantleDataValue != null && ((obj = mantleDataValue.value) == null || mantleDataValue.type != EnumC129705ta.A0B)) {
                obj = "";
            }
            interfaceC16660sJ.invoke(obj);
            immutableMap.get("model_path");
        }
        C129805tk c129805tk = c125025l8.A00;
        if (c129805tk != null) {
            c129805tk.A00.markerPoint(331812717, "MODEL_DOWNLOAD_END");
        }
        this.A00.remove(c125025l8);
    }

    public final void A04(C125025l8 c125025l8, Throwable th) {
        C14360o3.A0B(c125025l8, 0);
        C0K8.A0L("RpModelDownloadManager", AbstractC43591JPw.A00(1293), th, c125025l8.A01);
        C129805tk c129805tk = c125025l8.A00;
        if (c129805tk != null) {
            String message = th.getMessage();
            c129805tk.A00.markerPoint(331812717, "MODEL_DOWNLOAD_END");
            C129805tk.A00(c129805tk, message, false);
        }
        this.A00.remove(c125025l8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v1, types: [X.0do] */
    /* JADX WARN: Type inference failed for: r22v4, types: [X.0do] */
    /* JADX WARN: Type inference failed for: r23v1, types: [X.0sZ] */
    /* JADX WARN: Type inference failed for: r23v3, types: [X.0sZ] */
    /* JADX WARN: Type inference failed for: r24v2, types: [X.0sZ] */
    /* JADX WARN: Type inference failed for: r35v0, types: [X.0do] */
    /* JADX WARN: Type inference failed for: r35v1, types: [X.0do] */
    /* JADX WARN: Type inference failed for: r36v0, types: [X.0sZ] */
    /* JADX WARN: Type inference failed for: r36v1, types: [X.0do, X.0sZ] */
    /* JADX WARN: Type inference failed for: r37v2, types: [X.0sZ] */
    public RpModelDownloadManager(UserSession userSession, Context context) {
        C129805tk c129805tk;
        C125005l6 c125005l6;
        C125015l7 c125015l7;
        C125025l8 c125025l8;
        boolean z;
        C125025l8 c125025l82;
        InterfaceC09390do interfaceC09390do;
        C125025l8 c125025l83;
        this.A02 = userSession;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A01(c06090Tz, userSession, 36602535930434232L) > 0) {
            C17050sx A01 = AbstractC09440dt.A01(new C57247PbV(userSession, 31));
            C17050sx A012 = AbstractC09440dt.A01(new C57247PbV(userSession, 32));
            C92D c92d = C92D.A00;
            C008302x A00 = AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G());
            c129805tk = null;
            c125005l6 = C125005l6.A00;
            C17050sx A013 = AbstractC09440dt.A01(c125005l6);
            c125015l7 = C125015l7.A00;
            c125025l8 = new C125025l8(null, "bwe_mobile_congestion_characterization", A01, A012, A013, AbstractC09440dt.A01(c125015l7), null, null, c92d, A00, true, true);
        } else {
            C17050sx A014 = AbstractC09440dt.A01(new C57247PbV(userSession, 33));
            C17050sx A015 = AbstractC09440dt.A01(new C57247PbV(userSession, 34));
            C2042792a c2042792a = C2042792a.A00;
            C008302x A002 = AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G());
            c129805tk = null;
            c125005l6 = C125005l6.A00;
            C17050sx A016 = AbstractC09440dt.A01(c125005l6);
            c125015l7 = C125015l7.A00;
            c125025l8 = new C125025l8(null, "bwe_mobile_congestion_characterization", A014, A015, A016, AbstractC09440dt.A01(c125015l7), null, null, c2042792a, A002, false, true);
        }
        if (C18U.A01(c06090Tz, userSession, 36604163723039791L) > 0) {
            ?? r23 = c129805tk;
            z = true;
            c125025l82 = new C125025l8(c129805tk, "networking_mobile_generalized_characterization", AbstractC09440dt.A01(new C57247PbV(userSession, 35)), AbstractC09440dt.A01(new C57247PbV(userSession, 36)), AbstractC09440dt.A01(c125005l6), AbstractC09440dt.A01(c125015l7), c129805tk, r23, C25121B9r.A00, AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G()), true, true);
            interfaceC09390do = r23;
        } else {
            z = true;
            ?? r232 = c129805tk;
            c125025l82 = new C125025l8(c129805tk, "networking_mobile_generalized_characterization", AbstractC09440dt.A01(new C57247PbV(userSession, 37)), AbstractC09440dt.A01(new C57247PbV(userSession, 38)), AbstractC09440dt.A01(c125005l6), AbstractC09440dt.A01(c125015l7), c129805tk, r232, C125035l9.A00, AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G()), false, true);
            interfaceC09390do = r232;
        }
        if (C18U.A01(c06090Tz, userSession, 36605228874929380L) > 0) {
            c125025l83 = new C125025l8(c129805tk, "bwe_mobile_stable_bitrate_prediction", AbstractC09440dt.A01(new C57247PbV(userSession, 43)), AbstractC09440dt.A01(new C57247PbV(userSession, 44)), AbstractC09440dt.A01(c125005l6), AbstractC09440dt.A01(c125015l7), interfaceC09390do, c129805tk, C25122B9s.A00, AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G()), z, z);
        } else {
            c125025l83 = new C125025l8(c129805tk, "bwe_mobile_stable_bitrate_prediction", AbstractC09440dt.A01(new C57247PbV(userSession, 41)), AbstractC09440dt.A01(new C57247PbV(userSession, 42)), AbstractC09440dt.A01(c125005l6), AbstractC09440dt.A01(c125015l7), c129805tk, c129805tk, C125045lA.A00, AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G()), false, z);
        }
        ?? r36 = c129805tk;
        boolean z2 = z;
        C125025l8 c125025l84 = new C125025l8(c129805tk, "rtc_automos_ns", AbstractC09440dt.A01(new C57247PbV(userSession, 29)), AbstractC09440dt.A01(new C57247PbV(userSession, 30)), AbstractC09440dt.A01(c125005l6), AbstractC09440dt.A01(c125015l7), c129805tk, r36, new C50362MLo(35, context, userSession), AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G()), z, z2);
        boolean z3 = z;
        C125025l8 c125025l85 = new C125025l8(c129805tk, "rtc_noise_suppression", AbstractC09440dt.A01(new C57247PbV(userSession, 39)), AbstractC09440dt.A01(new C57247PbV(userSession, 40)), AbstractC09440dt.A01(c125005l6), AbstractC09440dt.A01(c125015l7), r36, c129805tk, new C50362MLo(36, context, userSession), AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G()), z2, z3);
        C125055lB c125055lB = new C125055lB(userSession);
        C129805tk A003 = AbstractC125065lC.A00(userSession);
        C17050sx A017 = AbstractC09440dt.A01(new C57247PbV(c125055lB, 45));
        C17050sx A018 = AbstractC09440dt.A01(new C57247PbV(c125055lB, 46));
        C008302x A004 = AbstractC124995l5.A00(C92E.A00(userSession).A00.A0G());
        this.A00 = AbstractC16960so.A1N(c125025l8, c125025l82, c125025l83, c125025l84, c125025l85, new C125025l8(A003, "speech_asr_ig_voice_memo-en_US", A017, A018, AbstractC09440dt.A01(new C57247PbV(c125055lB, 47)), AbstractC09440dt.A01(new C57247PbV(c125055lB, 48)), AbstractC09440dt.A01(new C57247PbV(c125055lB, 49)), new C57531Pg5(0, context, A003), new C30177DRh(12, userSession, context, c125055lB, A003), A004, z3, !C18U.A06(C06090Tz.A06, c125055lB.A00, 36325454706193498L)));
        this.A01 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9EA(context, 20));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, X.2Kv] */
    public static final Object A00(RpModelDownloadManager rpModelDownloadManager, C125025l8 c125025l8, InterfaceC23621Ds interfaceC23621Ds) {
        Object collect;
        MUP mup;
        Integer num;
        if (!((Boolean) c125025l8.A05.getValue()).booleanValue()) {
            rpModelDownloadManager.A00.remove(c125025l8);
        } else if (c125025l8.A0B && ((Boolean) c125025l8.A06.getValue()).booleanValue()) {
            InterfaceC09390do interfaceC09390do = c125025l8.A03;
            if (interfaceC09390do == null || (mup = (MUP) interfaceC09390do.getValue()) == null) {
                mup = new MUP();
            }
            C2L1 c2l1 = (C2L1) rpModelDownloadManager.A01.getValue();
            String str = c125025l8.A01;
            Integer num2 = C05F.A01;
            UserSession userSession = rpModelDownloadManager.A02;
            boolean z = mup.A02;
            boolean z2 = mup.A03;
            int i = mup.A01;
            C14360o3.A0B(str, 0);
            C14360o3.A0B(userSession, 1);
            C48362Kd c48362Kd = new C48362Kd();
            if (z) {
                num = C05F.A0C;
            } else {
                num = num2;
            }
            c48362Kd.A01(num);
            c48362Kd.A05 = z2;
            C48562Ky A00 = c48362Kd.A00();
            HashMap A02 = AbstractC06930Yk.A02(new C09530e4("modelUseCse", str), new C09530e4("maxRetries", Integer.valueOf(i)), new C09530e4(MSV.A00(1695), userSession.token));
            AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(RpModelDownloadWorker.class);
            abstractC48382Kf.A05(str);
            abstractC48382Kf.A03(A00);
            ?? obj = new Object();
            obj.A00 = new HashMap(A02);
            abstractC48382Kf.A00.A0C = obj;
            abstractC48382Kf.A04(num2, TimeUnit.MILLISECONDS, 30000L);
            c2l1.A02((QA7) abstractC48382Kf.A00(), num2, str);
        } else {
            rpModelDownloadManager.A00.remove(c125025l8);
            InterfaceC16820sZ interfaceC16820sZ = c125025l8.A07;
            if ((interfaceC16820sZ == null || ((Boolean) interfaceC16820sZ.invoke()).booleanValue()) && (collect = c125025l8.A09.collect(new B4E(rpModelDownloadManager, c125025l8), interfaceC23621Ds)) == C1JX.A02) {
                return collect;
            }
        }
        return C0eB.A00;
    }

    public final C125025l8 A01(String str) {
        Object obj;
        Iterator it = this.A00.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C125025l8) obj).A01, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C125025l8) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.List r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 30
            boolean r0 = X.C206459Cc.A00(r9, r3)
            if (r0 == 0) goto L6c
            r5 = r9
            X.9Cc r5 = (X.C206459Cc) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r3 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L45
            if (r0 != r4) goto L75
            java.lang.Object r2 = r5.A02
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r5.A01
            com.instagram.ml.remotepresence.RpModelDownloadManager r1 = (com.instagram.ml.remotepresence.RpModelDownloadManager) r1
            X.AbstractC09560e7.A00(r3)
        L2c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()
            X.5l8 r0 = (X.C125025l8) r0
            r5.A01 = r1
            r5.A02 = r2
            r5.A00 = r4
            java.lang.Object r0 = A00(r1, r0, r5)
            if (r0 != r6) goto L2c
            return r6
        L45:
            X.AbstractC09560e7.A00(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r8.iterator()
        L51:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5l8 r0 = (X.C125025l8) r0
            boolean r0 = r0.A0A
            if (r0 == 0) goto L51
            r3.add(r1)
            goto L51
        L66:
            java.util.Iterator r2 = r3.iterator()
            r1 = r7
            goto L2c
        L6c:
            X.9Cc r5 = new X.9Cc
            r5.<init>(r7, r9, r3)
            goto L16
        L72:
            X.0eB r6 = X.C0eB.A00
            return r6
        L75:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ml.remotepresence.RpModelDownloadManager.A02(java.util.List, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C2L1) this.A01.getValue()).A04(((C125025l8) it.next()).A01);
        }
    }
}
