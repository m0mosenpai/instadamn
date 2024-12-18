package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.WVi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70430WVi implements C1WA {
    public final C1V7 A00;
    public final C1V7 A01;
    public final C1V7 A02 = C1VY.A00;
    public final C68674VaA A03;
    public final AbstractC27691Vx A04;
    public final C1WK A05;
    public final ExecutorService A06;
    public final C1V7 A07;
    public final C1V7 A08;
    public final C1V7 A09;
    public final C1V7 A0A;
    public final C1V7 A0B;
    public final C0JO A0C;
    public final ScheduledExecutorService A0D;

    @Override // X.C1WA
    public final Drawable AM6(Resources resources, C27771Wf c27771Wf, C3QA c3qa) {
        InterfaceC71992XEf interfaceC71992XEf;
        C68675VaB c68675VaB;
        Bitmap.Config config;
        UOO uoo = (UOO) c3qa;
        synchronized (c3qa) {
            C68675VaB c68675VaB2 = uoo.A00;
            if (c68675VaB2 != null) {
                interfaceC71992XEf = c68675VaB2.A00;
            } else {
                interfaceC71992XEf = null;
            }
        }
        try {
            synchronized (c3qa) {
                c68675VaB = uoo.A00;
            }
            c68675VaB.getClass();
            if (interfaceC71992XEf == null) {
                config = null;
            } else {
                config = interfaceC71992XEf.getAnimatedBitmapConfig();
            }
            WVV A00 = A00(config, this, c27771Wf, c68675VaB);
            if (((Boolean) this.A02.get()).booleanValue()) {
                return new C66306U8e(A00);
            }
            return new C66308U8h(A00);
        } catch (NullPointerException e) {
            Object obj = ((C3Q9) c3qa).A00.get("uri_source");
            if (obj == null) {
                throw e;
            }
            throw new NullPointerException(AnonymousClass001.A0g(e.getMessage(), " uri=", obj.toString()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, X.VMQ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.WVV A00(android.graphics.Bitmap.Config r12, X.C70430WVi r13, X.C27771Wf r14, X.C68675VaB r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70430WVi.A00(android.graphics.Bitmap$Config, X.WVi, X.1Wf, X.VaB):X.WVV");
    }

    public C70430WVi(C1V7 c1v7, C1V7 c1v72, C1V7 c1v73, C1V7 c1v74, C1V7 c1v75, C1V7 c1v76, C1V7 c1v77, C0JO c0jo, C68674VaA c68674VaA, AbstractC27691Vx abstractC27691Vx, C1WK c1wk, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = c68674VaA;
        this.A0D = scheduledExecutorService;
        this.A06 = executorService;
        this.A0C = c0jo;
        this.A04 = abstractC27691Vx;
        this.A05 = c1wk;
        this.A00 = c1v7;
        this.A0A = c1v72;
        this.A01 = c1v73;
        this.A0B = c1v74;
        this.A07 = c1v76;
        this.A09 = c1v75;
        this.A08 = c1v77;
    }
}
