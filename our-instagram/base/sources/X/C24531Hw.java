package X;

import com.facebook.systrace.Systrace;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1Hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24531Hw implements C11R {
    public InterfaceC151096rC A00;
    public InterfaceC26451Qa A01;
    public Iterator A02;
    public final int A03;
    public final String A04;
    public final CopyOnWriteArraySet A05;
    public final C24521Hv A06;
    public final InterfaceC23761Ei A07;
    public final InterfaceC23761Ei A08;
    public final AbstractC24481Hr A09;
    public final C23701Ea A0A;
    public volatile boolean A0B;

    public C24531Hw(C24521Hv c24521Hv, InterfaceC23761Ei interfaceC23761Ei, InterfaceC23761Ei interfaceC23761Ei2, AbstractC24481Hr abstractC24481Hr, C23701Ea c23701Ea, String str, int i) {
        C14360o3.A0B(str, 3);
        C14360o3.A0B(c24521Hv, 11);
        this.A09 = abstractC24481Hr;
        this.A04 = str;
        this.A08 = interfaceC23761Ei;
        this.A07 = interfaceC23761Ei2;
        this.A03 = i;
        this.A0A = c23701Ea;
        this.A06 = c24521Hv;
        this.A05 = new CopyOnWriteArraySet();
    }

    public final Object A01(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        MW7 mw7 = new MW7(interfaceC16660sJ, c24891Jo);
        A02(mw7);
        c24891Jo.CPA(new C9F3(43, this, mw7));
        C1GJ.A06(this, i, i2, true, false);
        return c24891Jo.A0E();
    }

    public static final void A00(final AbstractC115105If abstractC115105If, final C24531Hw c24531Hw) {
        String str;
        if (!c24531Hw.A0B) {
            Iterator it = c24531Hw.A05.iterator();
            while (it.hasNext()) {
                InterfaceC24551Hy interfaceC24551Hy = (InterfaceC24551Hy) it.next();
                InterfaceC26451Qa interfaceC26451Qa = c24531Hw.A01;
                if (interfaceC26451Qa == null) {
                    C14360o3.A0F("action");
                    throw C00O.createAndThrow();
                }
                interfaceC24551Hy.DFs(abstractC115105If, interfaceC26451Qa);
            }
        }
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null || (str = A01.toString()) == null) {
            str = "no_error_message";
        }
        InterfaceC151096rC interfaceC151096rC = c24531Hw.A00;
        if (interfaceC151096rC != null) {
            interfaceC151096rC.Cj9(str);
        }
        InterfaceC16620sF interfaceC16620sF = C1ON.A08;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(c24531Hw.getName(), abstractC115105If);
        }
        C11T.A02(new Runnable() { // from class: X.5Ih
            @Override // java.lang.Runnable
            public final void run() {
                C24531Hw c24531Hw2 = c24531Hw;
                AbstractC115105If abstractC115105If2 = abstractC115105If;
                if (Systrace.A0E(1L)) {
                    C0fO.A01("StreamingHttpRequestTask.onFailed", -695690867);
                }
                try {
                    if (!c24531Hw2.A0B) {
                        Iterator it2 = c24531Hw2.A05.iterator();
                        while (it2.hasNext()) {
                            InterfaceC24551Hy interfaceC24551Hy2 = (InterfaceC24551Hy) it2.next();
                            InterfaceC26451Qa interfaceC26451Qa2 = c24531Hw2.A01;
                            if (interfaceC26451Qa2 == null) {
                                C14360o3.A0F("action");
                                throw C00O.createAndThrow();
                            }
                            interfaceC24551Hy2.DFq(abstractC115105If2, interfaceC26451Qa2);
                        }
                    }
                    c24531Hw2.A0B = true;
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-338178278);
                    }
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-464720926);
                    }
                    throw th;
                }
            }
        });
    }

    public final void A02(InterfaceC24551Hy interfaceC24551Hy) {
        this.A05.add(interfaceC24551Hy);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2 A[Catch: all -> 0x0174, TryCatch #2 {all -> 0x0174, blocks: (B:5:0x0010, B:7:0x0014, B:15:0x0026, B:17:0x002c, B:19:0x0030, B:21:0x0036, B:23:0x003a, B:24:0x0040, B:26:0x0046, B:28:0x0050, B:31:0x0061, B:35:0x007c, B:42:0x0157, B:43:0x0159, B:44:0x015c, B:51:0x008f, B:53:0x0095, B:55:0x0099, B:56:0x009f, B:58:0x00a5, B:60:0x00af, B:63:0x00c2, B:70:0x00ce, B:72:0x00d2, B:73:0x00d5, B:75:0x00d9, B:77:0x00e4, B:79:0x00e8, B:80:0x00ee, B:82:0x00f2, B:83:0x00f8, B:85:0x00fe, B:89:0x0108, B:87:0x010e, B:98:0x0114, B:95:0x011f, B:66:0x0129, B:106:0x0144, B:103:0x0154, B:30:0x0056, B:62:0x00b5, B:105:0x0139, B:34:0x0071), top: B:4:0x0010, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(final X.C3JX r9) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24531Hw.A03(X.3JX):void");
    }

    @Override // X.C11R
    public final String getName() {
        return AnonymousClass001.A0T("IgStreamingApi", (String) AbstractC001900j.A0R(this.A04, new String[]{"\\?"}, 0).get(0), ' ');
    }

    @Override // X.C11R
    public final int getRunnableId() {
        return this.A03;
    }

    @Override // X.C11R
    public final void onCancel() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("StreamingHttpRequestTask.onCancel", 286732511);
        }
        try {
            InterfaceC151096rC interfaceC151096rC = this.A00;
            if (interfaceC151096rC != null) {
                interfaceC151096rC.Ckj();
            }
            this.A0B = true;
            if (Systrace.A0E(1L)) {
                C0fO.A00(1823721266);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(1504223036);
            }
            throw th;
        }
    }

    @Override // X.C11R
    public final void onFinish() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("StreamingHttpRequestTask.onFinish", 43942321);
        }
        try {
            InterfaceC151096rC interfaceC151096rC = this.A00;
            if (interfaceC151096rC != null) {
                interfaceC151096rC.Ckk();
            }
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                ((InterfaceC24551Hy) it.next()).Dg4();
            }
            this.A08.onFinish();
            if (Systrace.A0E(1L)) {
                C0fO.A00(385312834);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1866852122);
            }
            throw th;
        }
    }

    @Override // X.C11R
    public final void onStart() {
        if (Systrace.A0E(1L)) {
            C0fO.A01("StreamingHttpRequestTask.onStart", 1672421065);
        }
        try {
            InterfaceC151096rC interfaceC151096rC = this.A00;
            if (interfaceC151096rC != null) {
                interfaceC151096rC.Cko();
            }
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                InterfaceC24551Hy interfaceC24551Hy = (InterfaceC24551Hy) it.next();
                if (Systrace.A0E(1L)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(interfaceC24551Hy.getClass());
                    sb.append(" StreamingHttpRequestTask::onStart()");
                    C0fO.A01(sb.toString(), 1638621887);
                }
                try {
                    interfaceC24551Hy.DgK();
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-1285707339);
                    }
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(358670053);
                    }
                    throw th;
                }
            }
            this.A08.onStart();
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1961023454);
            }
        } catch (Throwable th2) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(976498168);
            }
            throw th2;
        }
    }

    @Override // X.C11R
    public final void run() {
        int i;
        InterfaceC151096rC interfaceC151096rC = this.A00;
        if (interfaceC151096rC != null) {
            interfaceC151096rC.ClN();
        }
        AbstractC24481Hr abstractC24481Hr = this.A09;
        abstractC24481Hr.run();
        Object A07 = abstractC24481Hr.A07();
        C14360o3.A0A(A07);
        InterfaceC26451Qa interfaceC26451Qa = (InterfaceC26451Qa) A07;
        this.A01 = interfaceC26451Qa;
        if (interfaceC26451Qa == null) {
            C14360o3.A0F("action");
            throw C00O.createAndThrow();
        }
        C1QZ c1qz = (C1QZ) interfaceC26451Qa;
        C1QW c1qw = c1qz.A00;
        C1QY c1qy = c1qz.A01;
        C26471Qc c26471Qc = new C26471Qc(this, c1qw.A09);
        if (Systrace.A0E(1L)) {
            C0fO.A01("StreamingHttpService.sendRequest", 1571493573);
        }
        try {
            C1C6.A00().A02(c26471Qc, c1qw, c1qy);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1728760550);
            }
            if (Systrace.A0E(1L)) {
                C0fO.A01("StreamingHttpService.waitForResponse", 1404642401);
            }
            try {
                c26471Qc.A02.acquire();
                if (Systrace.A0E(1L)) {
                    C0fO.A00(1961365303);
                }
            } catch (Throwable th) {
                th = th;
                if (!Systrace.A0E(1L)) {
                    throw th;
                }
                i = -1286092551;
                C0fO.A00(i);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!Systrace.A0E(1L)) {
                throw th;
            }
            i = 1030633756;
        }
    }
}
