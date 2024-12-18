package X;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.endtoend.EndToEnd;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.0HL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HL extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;
    public final /* synthetic */ InstagramApplicationForMainProcess A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HL(C211211o c211211o, InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A01 = instagramApplicationForMainProcess;
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A01.appContext;
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(context, c211211o) { // from class: X.14e
            public final Context A00;
            public final C211211o A01;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
                this.A01 = c211211o;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "MessageQueueInterceptorInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                final C2WW c2ww;
                final AbstractC12990ll A08 = ((AnonymousClass122) this.A01.A00()).A08();
                C2WW c2ww2 = new C2WW(A08) { // from class: X.2WU
                    public C0f6 A00;
                    public final AbstractC12990ll A01;

                    @Override // X.C2WW
                    public final C2WY A00() {
                        final AbstractC12990ll abstractC12990ll = this.A01;
                        return new C2WY(abstractC12990ll) { // from class: X.2WX
                            public final AbstractC12990ll A00;

                            @Override // X.C2WY
                            public final int A00() {
                                return (int) C18U.A01(C06090Tz.A05, this.A00, 36610563224180848L);
                            }

                            @Override // X.C2WY
                            public final int A01() {
                                return (int) C18U.A01(C06090Tz.A05, this.A00, 36594573063685914L);
                            }

                            @Override // X.C2WY
                            public final long A02() {
                                return C18U.A01(C06090Tz.A05, this.A00, 36610563224508529L);
                            }

                            @Override // X.C2WY
                            public final boolean A03() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36313098086123262L);
                            }

                            @Override // X.C2WY
                            public final boolean A04() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36313098086909703L);
                            }

                            @Override // X.C2WY
                            public final boolean A05() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36329088247414788L);
                            }

                            @Override // X.C2WY
                            public final boolean A06() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36329088247676935L);
                            }

                            @Override // X.C2WY
                            public final boolean A07() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36329088247545861L);
                            }

                            @Override // X.C2WY
                            public final boolean A08() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36329088247611398L);
                            }

                            @Override // X.C2WY
                            public final boolean A09() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36329088247742472L);
                            }

                            @Override // X.C2WY
                            public final boolean A0A() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36313098084353773L);
                            }

                            @Override // X.C2WY
                            public final boolean A0B() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36313098088941343L);
                            }

                            @Override // X.C2WY
                            public final boolean A0C() {
                                return C18U.A06(C06090Tz.A05, this.A00, 36313098086582018L);
                            }

                            {
                                this.A00 = abstractC12990ll;
                            }
                        };
                    }

                    @Override // X.C2WW
                    public final AbstractC100334ev A01() {
                        return new C100324eu(this.A01);
                    }

                    @Override // X.C2WW
                    public final AbstractC100044eS A02() {
                        return new C100034eR(this.A01);
                    }

                    @Override // X.C2WW
                    public final AbstractC100044eS A03() {
                        return new C25957Be2(this.A01);
                    }

                    @Override // X.C2WW
                    public final AbstractC87953w3 A04() {
                        return new C87943w2(this.A01);
                    }

                    @Override // X.C2WW
                    public final C0NK A05() {
                        return AbstractC18840wE.A00;
                    }

                    @Override // X.C2WW
                    public final void A07(List list) {
                        final AbstractC12990ll abstractC12990ll = this.A01;
                        C14360o3.A0B(abstractC12990ll, 0);
                        AbstractC88083wG.A00 = C006802i.A0p;
                        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36313098085598969L)) {
                            final C0f6 c0f6 = this.A00;
                            if (c0f6 == null) {
                                c0f6 = new C1KE(C006802i.A0p, new Random(), CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
                                this.A00 = c0f6;
                            }
                            list.add(new InterfaceC100264eo(c0f6, abstractC12990ll) { // from class: X.4z6
                                public final C0f6 A00;
                                public final long A01;

                                {
                                    this.A01 = C18U.A01(C06090Tz.A05, abstractC12990ll, 36594573062440725L);
                                    this.A00 = c0f6;
                                }

                                @Override // X.InterfaceC100264eo
                                public final void Cpa(C88023wA c88023wA) {
                                }

                                @Override // X.InterfaceC100264eo
                                public final String getName() {
                                    return "StallReporter";
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Throwable, X.0NB, java.lang.Exception] */
                                @Override // X.InterfaceC100264eo
                                public final void CpU(C88023wA c88023wA) {
                                    List list2;
                                    List list3;
                                    StackTraceElement[] stackTraceElementArr;
                                    long j;
                                    StackTraceElement stackTraceElement;
                                    if (c88023wA.A06(this.A01) && (list2 = c88023wA.A0A) != null && list2.size() != 0 && C87973w5.A02.A01.get() && (list3 = c88023wA.A0A) != null && !list3.isEmpty()) {
                                        String A0t = AnonymousClass001.A0t("Main thread stalled for ", " ms. (cpu time was ", " ms)", c88023wA.A01(), c88023wA.A00());
                                        ListIterator listIterator = list3.listIterator();
                                        String str = null;
                                        int size = list3.size();
                                        if (size > 1) {
                                            str = C0HM.A00().toString();
                                        }
                                        int i = 0;
                                        long j2 = 0;
                                        long j3 = 0;
                                        while (listIterator.hasNext()) {
                                            SJ7 sj7 = (SJ7) listIterator.next();
                                            i++;
                                            if (sj7 != null && (stackTraceElementArr = sj7.A07) != null && (stackTraceElementArr.length == 0 || (stackTraceElement = stackTraceElementArr[0]) == null || !stackTraceElement.isNativeMethod() || !"nativePollOnce".equals(stackTraceElement.getMethodName()))) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(A0t);
                                                sb.append(" Record # ");
                                                sb.append(i);
                                                sb.append(" stalled for ");
                                                sb.append(sj7.A02 - ((C88033wB) c88023wA).A02);
                                                sb.append(" ms.");
                                                SN2 sn2 = sj7.A03;
                                                C0f5 AEq = this.A00.AEq(true, "MainThreadStall", 817894971);
                                                AEq.ABU("record_count", size);
                                                AEq.ABU("record_index", i);
                                                if (str != null) {
                                                    AEq.ABW("record_join_id", str);
                                                }
                                                AEq.ABV("duration", c88023wA.A01());
                                                long j4 = ((C88033wB) c88023wA).A06;
                                                if (j4 > 0) {
                                                    j = ((C88033wB) c88023wA).A02 - j4;
                                                } else {
                                                    j = -1;
                                                }
                                                AEq.ABV("delay", j);
                                                AEq.ABV("cpu_time", c88023wA.A00());
                                                if (sn2 != null) {
                                                    long j5 = sn2.A08;
                                                    if (j5 != -1) {
                                                        AEq.ABV("total_memory", j5);
                                                        AEq.ABV("max_memory", sn2.A07);
                                                        AEq.ABV("free_memory", sn2.A03);
                                                        if (i == 1) {
                                                            j2 = sn2.A03;
                                                        }
                                                        if (j2 > 0) {
                                                            AEq.ABV("memory_usage_in_between", sn2.A03 - j2);
                                                        }
                                                    }
                                                    if (sn2.A05 > 0) {
                                                        AEq.ABV("gc_time", sn2.A06);
                                                        AEq.ABV("gc_time_blocking", sn2.A02);
                                                        j3 += sn2.A02;
                                                        AEq.ABV("gc_time_blocking_total", j3);
                                                    }
                                                }
                                                ?? exc = new Exception(sb.toString());
                                                exc.A00 = false;
                                                exc.setStackTrace(stackTraceElementArr);
                                                AEq.ERI(exc);
                                                AEq.report();
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    }

                    @Override // X.C2WW
                    public final void A08(List list) {
                        if (C18U.A06(C06090Tz.A05, this.A01, 36313098088154901L)) {
                            C87993w7 A00 = C87993w7.A00();
                            C88003w8 c88003w8 = A00.A00;
                            if (c88003w8 == null) {
                                c88003w8 = new C88003w8(A00.A01);
                                A00.A00 = c88003w8;
                            }
                            list.add(c88003w8);
                        }
                    }

                    {
                        this.A01 = A08;
                    }

                    @Override // X.C2WW
                    public final C0TX A06() {
                        return C1TU.A01();
                    }
                };
                boolean z = C2WW.A00;
                C2WW.A00 = z;
                boolean isRunningEndToEndTest = z | EndToEnd.isRunningEndToEndTest();
                C2WW.A00 = isRunningEndToEndTest;
                AbstractC22971Ac.A04 = SystemClock.uptimeMillis();
                if (isRunningEndToEndTest) {
                    c2ww = new C25953Bdy(c2ww2);
                } else {
                    c2ww = c2ww2;
                }
                C2WY A00 = c2ww.A00();
                if (A00.A03() || (!A00.A04() && !A00.A0B() && !A00.A0A() && !A00.A0C() && !A00.A05())) {
                    AbstractC22971Ac.A07 = true;
                } else {
                    AbstractC22971Ac.A08 = A00.A0A();
                    C87923w0.A00().A00.post(new Runnable(c2ww) { // from class: X.3w1
                        public static boolean A01;
                        public final C2WW A00;

                        /* JADX WARN: Code restructure failed: missing block: B:101:0x0336, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098088679197L) == false) goto L94;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:103:0x0322, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098088285975L) == false) goto L145;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:105:0x030e, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098088220438L) == false) goto L142;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:107:0x02fa, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098088089364L) == false) goto L139;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:109:0x033c, code lost:
                        
                            if ((r5 instanceof X.C100304es) == false) goto L171;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:111:0x0350, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098086057725L) == false) goto L61;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:113:0x0356, code lost:
                        
                            if ((r5 instanceof X.C100304es) == false) goto L171;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:115:0x036a, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098084615918L) != false) goto L48;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:117:0x0370, code lost:
                        
                            if ((r5 instanceof X.C100304es) != false) goto L44;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:120:0x0381, code lost:
                        
                            if ((r5 instanceof X.C100304es) != false) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ab, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098085140211L) != false) goto L31;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098087958291L) != false) goto L44;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
                        
                            if ((r5 instanceof X.C100304es) != false) goto L48;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
                        
                            r0 = X.C100154ed.A03;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:55:0x0114, code lost:
                        
                            if (r0 != null) goto L51;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:56:0x0116, code lost:
                        
                            r0 = new X.C100154ed();
                            X.C100154ed.A03 = r0;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
                        
                            r4.add(r0);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:58:0x0120, code lost:
                        
                            r4.add(new java.lang.Object());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
                        
                            if (r3 == false) goto L154;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098088548123L) == false) goto L151;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
                        
                            r4.add(new java.lang.Object());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
                        
                            if (r3 != false) goto L151;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:65:0x0148, code lost:
                        
                            if ((r5 instanceof X.C100304es) == false) goto L171;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
                        
                            r4.add(new java.lang.Object());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:68:0x0156, code lost:
                        
                            if (r5.A08() == false) goto L64;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
                        
                            r4.add(new java.lang.Object());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
                        
                            if (r5.A09() == false) goto L67;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:72:0x0166, code lost:
                        
                            r4.add(new X.C63917Svs());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
                        
                            if (r5.A07() == false) goto L72;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:76:0x0178, code lost:
                        
                            if (r9.A06() == null) goto L72;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
                        
                            r4.add(new X.C100204ei(r9.A06()));
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:78:0x0186, code lost:
                        
                            if (r3 == false) goto L148;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
                        
                            if (X.C18U.A06(X.C06090Tz.A05, ((X.C100034eR) r5).A00, 36313098087696145L) == false) goto L136;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:81:0x019a, code lost:
                        
                            r4.add(new X.C63915Svq());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:82:0x01a2, code lost:
                        
                            if (r3 != false) goto L136;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:84:0x01a6, code lost:
                        
                            if ((r5 instanceof X.C100304es) == false) goto L171;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:85:0x01a8, code lost:
                        
                            r1 = new X.C63916Svr();
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:86:0x01af, code lost:
                        
                            if (r1.A00 == false) goto L82;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:87:0x01b1, code lost:
                        
                            r4.add(r1);
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:88:0x01b4, code lost:
                        
                            if (r3 != false) goto L139;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:90:0x01b8, code lost:
                        
                            if ((r5 instanceof X.C100304es) == false) goto L171;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
                        
                            r4.add(new java.lang.Object());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:92:0x01c2, code lost:
                        
                            if (r3 != false) goto L142;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:94:0x01c6, code lost:
                        
                            if ((r5 instanceof X.C100304es) == false) goto L171;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:95:0x01c8, code lost:
                        
                            r4.add(new X.C63920Svv());
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:96:0x01d0, code lost:
                        
                            if (r3 != false) goto L145;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:98:0x01d4, code lost:
                        
                            if ((r5 instanceof X.C100304es) == false) goto L171;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
                        
                            r0 = new X.C100214ej();
                            r4.add(r0);
                            r8.add(r0);
                         */
                        /* JADX WARN: Type inference failed for: r14v1, types: [X.4el] */
                        /* JADX WARN: Type inference failed for: r1v8, types: [X.4el] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 926
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.RunnableC87933w1.run():void");
                        }

                        {
                            this.A00 = c2ww;
                        }
                    });
                }
            }
        };
    }
}
