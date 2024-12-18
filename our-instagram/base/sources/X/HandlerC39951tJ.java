package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.analytics.analytics2.IGAnalytics2HandlerThreadFactory;
import java.io.File;
import java.io.IOException;
import java.util.Stack;

/* renamed from: X.1tJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC39951tJ extends Handler {
    public C39841t8 A00;
    public C39961tK A01;
    public Stack A02;
    public final C38201qA A03;
    public final Object A04;
    public final Object A05;
    public final /* synthetic */ C39941tI A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC39951tJ(Looper looper, C39941tI c39941tI, C38201qA c38201qA) {
        super(looper);
        this.A06 = c39941tI;
        this.A05 = new Object();
        this.A04 = new Object();
        this.A03 = c38201qA;
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [X.1uG, java.lang.Object] */
    private C40621uV A00() {
        AbstractC40481uH abstractC40481uH;
        C39941tI c39941tI = this.A06;
        C40621uV c40621uV = c39941tI.A00;
        if (c40621uV == null) {
            C39931tH c39931tH = c39941tI.A05;
            Context context = c39931tH.A02;
            AbstractC40011tS A00 = AbstractC40011tS.A00(!C39981tM.A00(context).A01());
            File A002 = C0eS.A00(context, 1543572765);
            A002.mkdirs();
            File file = new File(A002, "micro_batch");
            file.mkdirs();
            InterfaceC38311qL interfaceC38311qL = c39931tH.A04;
            int ByY = interfaceC38311qL.ByY();
            int BAy = interfaceC38311qL.BAy();
            int Aif = interfaceC38311qL.Aif();
            C39901tE c39901tE = c39931tH.A05;
            C04060Jx c04060Jx = c39931tH.A08;
            String A003 = C1UY.A00();
            if (A003 == null) {
                A003 = "unknown";
            }
            C40071tY c40071tY = new C40071tY(c39931tH.A03, c39901tE, A00, c04060Jx, new File(file, A003), ByY, BAy, Aif, c39931tH.A00);
            C39911tF c39911tF = c39931tH.A06;
            C38151q2 c38151q2 = c39931tH.A09;
            C40401u8 c40401u8 = new C40401u8(c39911tF, file, c38151q2.A00);
            Class cls = c39931tH.A0B;
            C39921tG c39921tG = c39931tH.A07;
            boolean z = c39931tH.A0C;
            long j = c39931tH.A01;
            C37571ou c37571ou = c38151q2.A02;
            if (!c37571ou.A1q) {
                C14080nY c14080nY = c38151q2.A05;
                Looper looper = IGAnalytics2HandlerThreadFactory.A00(AbstractC37641p1.A00, "iga2_mb").getLooper();
                looper.getClass();
                Context context2 = c38151q2.A01;
                C14080nY A004 = C14080nY.A00();
                ?? obj = new Object();
                obj.A00 = Long.MAX_VALUE;
                obj.A02 = new HandlerC40531uM(looper, obj);
                obj.A01 = context2;
                obj.A03 = A004;
                obj.A04 = c14080nY;
                abstractC40481uH = obj;
            } else {
                abstractC40481uH = null;
            }
            boolean z2 = c37571ou.A1m;
            boolean z3 = c37571ou.A1r;
            C40621uV c40621uV2 = new C40621uV(c40071tY, new C40571uQ(context, c39921tG, c40401u8, abstractC40481uH, c39931tH.A0A, cls, new ExecutorC14110nb(2044309875), j, z, z2, z3, ((Boolean) AbstractC15930qn.A02.A0N.invoke()).booleanValue()), c38151q2);
            c39941tI.A00 = c40621uV2;
            return c40621uV2;
        }
        return c40621uV;
    }

    private C40621uV A01() {
        C39941tI c39941tI = this.A06;
        if (c39941tI.A01 == null) {
            C39931tH c39931tH = c39941tI.A05;
            InterfaceC38311qL interfaceC38311qL = c39931tH.A04;
            int ByY = interfaceC38311qL.ByY();
            int BAy = interfaceC38311qL.BAy();
            int Aif = interfaceC38311qL.Aif();
            C39901tE c39901tE = c39931tH.A05;
            C04060Jx c04060Jx = c39931tH.A08;
            AbstractC40081tZ abstractC40081tZ = new AbstractC40081tZ(c39931tH.A03, c39901tE, c04060Jx, ByY, BAy, Aif);
            Context context = c39931tH.A02;
            C39911tF c39911tF = c39931tH.A06;
            C40621uV c40621uV = new C40621uV(abstractC40081tZ, new Y9I(context, c39911tF, c04060Jx, c39931tH.A0A, r3.A02.A0B), c39931tH.A09);
            c39941tI.A01 = c40621uV;
            c40621uV.A00.A03(this.A00);
        }
        return c39941tI.A01;
    }

    private void A02(C39851t9 c39851t9, boolean z) {
        C0CA c0ca;
        Integer num;
        if (!z) {
            long j = c39851t9.A00;
            C38201qA c38201qA = this.A03;
            if (c38201qA != null) {
                AbstractC020908f.A00("doWaitForWriteBlockRelease");
                if (j == -2) {
                    num = C05F.A00;
                } else {
                    num = C05F.A01;
                }
                c38201qA.A00(num);
                AbstractC021008g.A00();
            }
        }
        AbstractC020908f.A00("doWrite");
        try {
            AbstractC020908f.A00("writeToDisk");
            try {
                try {
                    A00().A00(c39851t9);
                    String str = c39851t9.A05;
                    String str2 = c39851t9.A06;
                    c0ca = c39851t9.A03;
                    A04(this, c0ca, "event.persisted", str, str2);
                } catch (AnonymousClass404 | AnonymousClass405 | IOException unused) {
                    String str3 = c39851t9.A05;
                    String str4 = c39851t9.A06;
                    c0ca = c39851t9.A03;
                    A04(this, c0ca, "event.not_processed.persist.failed", str3, str4);
                    try {
                        A01().A00(c39851t9);
                        A04(this, c0ca, "event.persisted.in_memory", str3, str4);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                AbstractC021008g.A00();
                A05(c0ca, c39851t9.A00);
                c0ca.A02();
            } finally {
                AbstractC021008g.A00();
            }
        } catch (Throwable th) {
            c39851t9.A03.A02();
            throw th;
        }
    }

    public static void A03(HandlerC39951tJ handlerC39951tJ) {
        if (handlerC39951tJ.A06.A04.B1S()) {
            synchronized (handlerC39951tJ.A05) {
                handlerC39951tJ.A01 = null;
            }
        }
    }

    public static void A04(HandlerC39951tJ handlerC39951tJ, final C0CA c0ca, String str, String str2, String str3) {
        C38951rU c38951rU = handlerC39951tJ.A06.A08;
        if (c38951rU.A02) {
            c38951rU.A00().Chy(str, str2, str3, new InterfaceC16820sZ() { // from class: X.4wm
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C5KW.A00(C0CA.this).get("extra");
                }
            }, 1L, true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1y3, java.lang.Object] */
    private void A05(C0CA c0ca, long j) {
        InterfaceC37451oi interfaceC37451oi;
        if (j != -2 && j != -4) {
            interfaceC37451oi = this.A06.A03;
        } else {
            interfaceC37451oi = this.A06.A02;
        }
        if (interfaceC37451oi != null) {
            AbstractC020908f.A00("eventListener");
            try {
                AbstractC42781y6.A00(interfaceC37451oi, new Object(), c0ca);
            } finally {
                AbstractC021008g.A00();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0028, code lost:
    
        X.AbstractC020908f.A00("handleAsapMessage");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x002e, code lost:
    
        A02(r1, r6);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0187, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0188, code lost:
    
        X.AbstractC021008g.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x018b, code lost:
    
        throw r0;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r11) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC39951tJ.handleMessage(android.os.Message):void");
    }
}
