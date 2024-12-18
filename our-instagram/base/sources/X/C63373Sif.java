package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzs;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: X.Sif, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63373Sif {
    public int A00;
    public Context A01;
    public InterfaceC65616To7 A02;
    public C61276Rkm A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public ExecutorService A0F;
    public final String A0G;
    public final Handler A0H;
    public volatile int A0I;
    public volatile C62601SIf A0J;
    public volatile zzs A0K;
    public volatile ServiceConnectionC63444SkN A0L;

    public C63373Sif() {
    }

    public final void A08(final SAL sal, final InterfaceC65312Tho interfaceC65312Tho) {
        SYG A01;
        InterfaceC65616To7 interfaceC65616To7;
        int i;
        if (!A0F()) {
            interfaceC65616To7 = this.A02;
            i = 2;
            A01 = SA6.A0D;
        } else if (TextUtils.isEmpty(sal.A00)) {
            AbstractC63398SjT.A0A("BillingClient", "Please provide a valid purchase token.");
            interfaceC65616To7 = this.A02;
            i = 26;
            A01 = SA6.A0A;
        } else if (!this.A06) {
            interfaceC65616To7 = this.A02;
            i = 27;
            A01 = SA6.A03;
        } else {
            Callable callable = new Callable() { // from class: X.TUF
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C63373Sif c63373Sif = this;
                    SAL sal2 = sal;
                    InterfaceC65312Tho interfaceC65312Tho2 = interfaceC65312Tho;
                    try {
                        zzs zzsVar = c63373Sif.A0K;
                        String packageName = c63373Sif.A01.getPackageName();
                        String str = sal2.A00;
                        String str2 = c63373Sif.A0G;
                        Bundle A0b = AbstractC166987dD.A0b();
                        A0b.putString("playBillingLibraryVersion", str2);
                        Bundle FGA = zzsVar.FGA(A0b, packageName, str, 9);
                        int A02 = AbstractC63398SjT.A02(FGA, "BillingClient");
                        String A07 = AbstractC63398SjT.A07(FGA, "BillingClient");
                        SYG syg = SA6.A0J;
                        interfaceC65312Tho2.CuS(SYG.A00(A07, A02));
                        return null;
                    } catch (Exception e) {
                        AbstractC63398SjT.A0B("BillingClient", "Error acknowledge purchase!", e);
                        InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                        SYG syg2 = SA6.A0D;
                        AbstractC58319PtB.A1E(syg2, interfaceC65616To72, 28, 3);
                        interfaceC65312Tho2.CuS(syg2);
                        return null;
                    }
                }
            };
            if (A02(A00(this), this, new Runnable() { // from class: X.TMv
                @Override // java.lang.Runnable
                public final void run() {
                    C63373Sif c63373Sif = this;
                    InterfaceC65312Tho interfaceC65312Tho2 = interfaceC65312Tho;
                    InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                    SYG syg = SA6.A0E;
                    AbstractC58319PtB.A1E(syg, interfaceC65616To72, 24, 3);
                    interfaceC65312Tho2.CuS(syg);
                }
            }, callable, 30000L) != null) {
                return;
            }
            A01 = A01(this);
            interfaceC65616To7 = this.A02;
            i = 25;
        }
        AbstractC58319PtB.A1E(A01, interfaceC65616To7, i, 3);
        interfaceC65312Tho.CuS(A01);
    }

    public final void A0A(final SAM sam, final InterfaceC65313Thp interfaceC65313Thp) {
        SYG A01;
        InterfaceC65616To7 interfaceC65616To7;
        int i;
        if (!A0F()) {
            interfaceC65616To7 = this.A02;
            i = 2;
            A01 = SA6.A0D;
        } else {
            Callable callable = new Callable() { // from class: X.TUA
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int FFV;
                    String str;
                    C63373Sif c63373Sif = C63373Sif.this;
                    SAM sam2 = sam;
                    InterfaceC65313Thp interfaceC65313Thp2 = interfaceC65313Thp;
                    String str2 = sam2.A00;
                    try {
                        AbstractC63398SjT.A09("BillingClient", AnonymousClass001.A0R("Consuming purchase with token: ", str2));
                        if (c63373Sif.A06) {
                            zzs zzsVar = c63373Sif.A0K;
                            String packageName = c63373Sif.A01.getPackageName();
                            boolean z = c63373Sif.A06;
                            String str3 = c63373Sif.A0G;
                            Bundle A0b = AbstractC166987dD.A0b();
                            if (z) {
                                A0b.putString("playBillingLibraryVersion", str3);
                            }
                            Bundle FGI = zzsVar.FGI(A0b, packageName, str2, 9);
                            FFV = FGI.getInt("RESPONSE_CODE");
                            str = AbstractC63398SjT.A07(FGI, "BillingClient");
                        } else {
                            FFV = c63373Sif.A0K.FFV(3, c63373Sif.A01.getPackageName(), str2);
                            str = "";
                        }
                        SYG syg = SA6.A0J;
                        SYG A00 = SYG.A00(str, FFV);
                        if (FFV == 0) {
                            AbstractC63398SjT.A09("BillingClient", "Successfully consumed purchase.");
                        } else {
                            AbstractC63398SjT.A0A("BillingClient", AnonymousClass001.A0O("Error consuming purchase with token. Response code: ", FFV));
                            AbstractC58319PtB.A1E(A00, c63373Sif.A02, 23, 4);
                        }
                        interfaceC65313Thp2.D7L(A00, str2);
                        return null;
                    } catch (Exception e) {
                        AbstractC63398SjT.A0B("BillingClient", "Error consuming purchase!", e);
                        InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                        SYG syg2 = SA6.A0D;
                        AbstractC58319PtB.A1E(syg2, interfaceC65616To72, 29, 4);
                        interfaceC65313Thp2.D7L(syg2, str2);
                        return null;
                    }
                }
            };
            if (A02(A00(this), this, new Runnable() { // from class: X.TPO
                @Override // java.lang.Runnable
                public final void run() {
                    C63373Sif c63373Sif = C63373Sif.this;
                    InterfaceC65313Thp interfaceC65313Thp2 = interfaceC65313Thp;
                    SAM sam2 = sam;
                    InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                    SYG syg = SA6.A0E;
                    AbstractC58319PtB.A1E(syg, interfaceC65616To72, 24, 4);
                    interfaceC65313Thp2.D7L(syg, sam2.A00);
                }
            }, callable, 30000L) != null) {
                return;
            }
            A01 = A01(this);
            interfaceC65616To7 = this.A02;
            i = 25;
        }
        AbstractC58319PtB.A1E(A01, interfaceC65616To7, i, 4);
        interfaceC65313Thp.D7L(A01, sam.A00);
    }

    public final void A0B(final InterfaceC65314Thq interfaceC65314Thq, final SAO sao) {
        SYG A01;
        InterfaceC65616To7 interfaceC65616To7;
        int i;
        if (!A0F()) {
            interfaceC65616To7 = this.A02;
            i = 2;
            A01 = SA6.A0D;
        } else if (!this.A0B) {
            AbstractC63398SjT.A0A("BillingClient", "Querying product details is not supported.");
            interfaceC65616To7 = this.A02;
            i = 20;
            A01 = SA6.A0J;
        } else {
            Callable callable = new Callable() { // from class: X.TUB
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
                
                    X.AbstractC63313ShL.A04(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
                
                    throw X.C00O.createAndThrow();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
                
                    r1 = e;
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 444
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.TUB.call():java.lang.Object");
                }
            };
            if (A02(A00(this), this, new Runnable() { // from class: X.TMt
                @Override // java.lang.Runnable
                public final void run() {
                    C63373Sif c63373Sif = C63373Sif.this;
                    InterfaceC65314Thq interfaceC65314Thq2 = interfaceC65314Thq;
                    InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                    SYG syg = SA6.A0E;
                    AbstractC58319PtB.A1E(syg, interfaceC65616To72, 24, 7);
                    interfaceC65314Thq2.DbN(syg, AbstractC166987dD.A1E());
                }
            }, callable, 30000L) != null) {
                return;
            }
            A01 = A01(this);
            interfaceC65616To7 = this.A02;
            i = 25;
        }
        AbstractC58319PtB.A1E(A01, interfaceC65616To7, i, 7);
        interfaceC65314Thq.DbN(A01, AbstractC166987dD.A1E());
    }

    @Deprecated
    public final void A0C(final InterfaceC65315Thr interfaceC65315Thr, String str) {
        SYG A01;
        InterfaceC65616To7 interfaceC65616To7;
        int i;
        if (!A0F()) {
            interfaceC65616To7 = this.A02;
            i = 2;
            A01 = SA6.A0D;
        } else {
            TUD tud = new TUD(this, interfaceC65315Thr, str);
            if (A02(A00(this), this, new Runnable() { // from class: X.TMs
                @Override // java.lang.Runnable
                public final void run() {
                    C63373Sif c63373Sif = C63373Sif.this;
                    InterfaceC65315Thr interfaceC65315Thr2 = interfaceC65315Thr;
                    InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                    SYG syg = SA6.A0E;
                    AbstractC58319PtB.A1E(syg, interfaceC65616To72, 24, 11);
                    interfaceC65315Thr2.DcX(syg, null);
                }
            }, tud, 30000L) != null) {
                return;
            }
            A01 = A01(this);
            interfaceC65616To7 = this.A02;
            i = 25;
        }
        AbstractC58319PtB.A1E(A01, interfaceC65616To7, i, 11);
        interfaceC65315Thr.DcX(A01, null);
    }

    @Deprecated
    public final void A0E(SD8 sd8, final InterfaceC65318Thu interfaceC65318Thu) {
        SYG A01;
        InterfaceC65616To7 interfaceC65616To7;
        int i;
        if (!A0F()) {
            interfaceC65616To7 = this.A02;
            i = 2;
            A01 = SA6.A0D;
        } else {
            final String str = sd8.A00;
            final List list = sd8.A01;
            if (TextUtils.isEmpty(str)) {
                AbstractC63398SjT.A0A("BillingClient", "Please fix the input params. SKU type can't be empty.");
                interfaceC65616To7 = this.A02;
                i = 49;
                A01 = SA6.A07;
            } else if (list == null) {
                AbstractC63398SjT.A0A("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                interfaceC65616To7 = this.A02;
                i = 48;
                A01 = SA6.A06;
            } else {
                Callable callable = new Callable() { // from class: X.TUP
                    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
                    
                        X.AbstractC58319PtB.A1E(X.SA6.A00, r2, r1, 8);
                        r7 = "Item is unavailable for purchase.";
                        r9 = null;
                        r4 = 4;
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 316
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.TUP.call():java.lang.Object");
                    }
                };
                if (A02(A00(this), this, new Runnable() { // from class: X.TMx
                    @Override // java.lang.Runnable
                    public final void run() {
                        C63373Sif c63373Sif = C63373Sif.this;
                        InterfaceC65318Thu interfaceC65318Thu2 = interfaceC65318Thu;
                        InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                        SYG syg = SA6.A0E;
                        AbstractC58319PtB.A1E(syg, interfaceC65616To72, 24, 8);
                        interfaceC65318Thu2.Dmw(syg, null);
                    }
                }, callable, 30000L) != null) {
                    return;
                }
                A01 = A01(this);
                interfaceC65616To7 = this.A02;
                i = 25;
            }
        }
        AbstractC58319PtB.A1E(A01, interfaceC65616To7, i, 8);
        interfaceC65318Thu.Dmw(A01, null);
    }

    public final boolean A0F() {
        return (this.A0I != 2 || this.A0K == null || this.A0L == null) ? false : true;
    }

    public C63373Sif(Context context, InterfaceC65317Tht interfaceC65317Tht, C61276Rkm c61276Rkm) {
        String str;
        try {
            str = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "6.2.1";
        }
        this.A0I = 0;
        this.A0H = AbstractC167007dF.A0J();
        this.A00 = 0;
        this.A0G = str;
        this.A01 = context.getApplicationContext();
        ROK A00 = ROU.A00();
        A00.A07(str);
        A00.A06(this.A01.getPackageName());
        C63714SsU c63714SsU = new C63714SsU(this.A01, (ROU) A00.A01());
        this.A02 = c63714SsU;
        this.A0J = new C62601SIf(this.A01, interfaceC65317Tht, c63714SsU);
        this.A03 = c61276Rkm;
        this.A01.getPackageName();
    }

    public static final SYG A01(C63373Sif c63373Sif) {
        if (c63373Sif.A0I != 0 && c63373Sif.A0I != 3) {
            return SA6.A0B;
        }
        return SA6.A0D;
    }

    public static final Future A02(Handler handler, C63373Sif c63373Sif, final Runnable runnable, Callable callable, long j) {
        ExecutorService executorService = c63373Sif.A0F;
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(AbstractC63398SjT.A00, new TVA());
            c63373Sif.A0F = executorService;
        }
        try {
            final Future submit = executorService.submit(callable);
            handler.postDelayed(new Runnable() { // from class: X.TMw
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    if (!future.isDone() && !future.isCancelled()) {
                        Runnable runnable2 = runnable;
                        future.cancel(true);
                        AbstractC63398SjT.A0A("BillingClient", "Async task is taking too long, cancel it!");
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                }
            }, (long) (j * 0.95d));
            return submit;
        } catch (Exception e) {
            AbstractC63398SjT.A0B("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    private final void A04(SYG syg) {
        ROV rov = null;
        ROY roy = null;
        if (syg.A00 != 0) {
            InterfaceC65616To7 interfaceC65616To7 = this.A02;
            AbstractC63227Sfe abstractC63227Sfe = AbstractC63227Sfe.$redex_init_class;
            try {
                ROL A00 = ROY.A00();
                ROM A002 = ROX.A00();
                A002.A06(syg.A00);
                A002.A08(syg.A01);
                A002.A07(20);
                A00.A07(A002);
                A00.A06(5);
                ROI A003 = ROS.A00();
                A003.A06();
                A00.A08((ROS) A003.A01());
                roy = (ROY) A00.A01();
            } catch (Exception e) {
                AbstractC63398SjT.A0B("BillingLogger", "Unable to create logging payload", e);
            }
            interfaceC65616To7.FFj(roy);
            return;
        }
        InterfaceC65616To7 interfaceC65616To72 = this.A02;
        AbstractC63227Sfe abstractC63227Sfe2 = AbstractC63227Sfe.$redex_init_class;
        try {
            ROJ A004 = ROV.A00();
            A004.A06(5);
            ROI A005 = ROS.A00();
            A005.A06();
            A004.A07((ROS) A005.A01());
            rov = (ROV) A004.A01();
        } catch (Exception e2) {
            AbstractC63398SjT.A0B("BillingLogger", "Unable to create logging payload", e2);
        }
        interfaceC65616To72.FFv(rov);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x02ff, code lost:
    
        if (r2.isEmpty() == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r39.A05 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.SYG A06(android.app.Activity r38, final X.C62598SIc r39) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63373Sif.A06(android.app.Activity, X.SIc):X.SYG");
    }

    public final void A07() {
        this.A02.FFv(AbstractC63227Sfe.A01(12));
        try {
            try {
                if (this.A0J != null) {
                    C62601SIf c62601SIf = this.A0J;
                    Q1u q1u = c62601SIf.A04;
                    Context context = c62601SIf.A01;
                    q1u.A01(context);
                    c62601SIf.A05.A01(context);
                }
                if (this.A0L != null) {
                    ServiceConnectionC63444SkN serviceConnectionC63444SkN = this.A0L;
                    synchronized (serviceConnectionC63444SkN.A02) {
                        serviceConnectionC63444SkN.A00 = null;
                        serviceConnectionC63444SkN.A01 = true;
                    }
                }
                if (this.A0L != null && this.A0K != null) {
                    AbstractC63398SjT.A09("BillingClient", "Unbinding from service.");
                    this.A01.unbindService(this.A0L);
                    this.A0L = null;
                }
                this.A0K = null;
                ExecutorService executorService = this.A0F;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.A0F = null;
                }
            } catch (Exception e) {
                AbstractC63398SjT.A0B("BillingClient", "There was an exception while ending connection!", e);
            }
        } finally {
            this.A0I = 3;
        }
    }

    public final void A0D(final InterfaceC65316Ths interfaceC65316Ths, SAP sap) {
        SYG A01;
        InterfaceC65616To7 interfaceC65616To7;
        int i;
        String str = sap.A00;
        if (!A0F()) {
            interfaceC65616To7 = this.A02;
            i = 2;
            A01 = SA6.A0D;
        } else if (TextUtils.isEmpty(str)) {
            AbstractC63398SjT.A0A("BillingClient", "Please provide a valid product type.");
            interfaceC65616To7 = this.A02;
            i = 50;
            A01 = SA6.A08;
        } else {
            TUC tuc = new TUC(this, interfaceC65316Ths, str);
            if (A02(A00(this), this, new Runnable() { // from class: X.TMr
                @Override // java.lang.Runnable
                public final void run() {
                    C63373Sif c63373Sif = C63373Sif.this;
                    InterfaceC65316Ths interfaceC65316Ths2 = interfaceC65316Ths;
                    InterfaceC65616To7 interfaceC65616To72 = c63373Sif.A02;
                    SYG syg = SA6.A0E;
                    AbstractC58319PtB.A1E(syg, interfaceC65616To72, 24, 9);
                    interfaceC65316Ths2.Dcc(syg, RO3.A00());
                }
            }, tuc, 30000L) != null) {
                return;
            }
            A01 = A01(this);
            interfaceC65616To7 = this.A02;
            i = 25;
        }
        AbstractC58319PtB.A1E(A01, interfaceC65616To7, i, 9);
        interfaceC65316Ths.Dcc(A01, RO3.A00());
    }

    public static final Handler A00(C63373Sif c63373Sif) {
        if (Looper.myLooper() == null) {
            return c63373Sif.A0H;
        }
        return new Handler(Looper.myLooper());
    }

    private final void A03(final SYG syg) {
        if (!Thread.interrupted()) {
            this.A0H.post(new Runnable() { // from class: X.TMu
                @Override // java.lang.Runnable
                public final void run() {
                    C63373Sif c63373Sif = C63373Sif.this;
                    c63373Sif.A0J.A02.DcZ(syg, null);
                }
            });
        }
    }

    public final SYG A05() {
        SYG syg;
        if (!A0F()) {
            SYG syg2 = SA6.A0D;
            if (syg2.A00 != 0) {
                AbstractC58319PtB.A1E(syg2, this.A02, 2, 5);
                return syg2;
            }
            this.A02.FFv(AbstractC63227Sfe.A01(5));
            return syg2;
        }
        if (this.A0B) {
            syg = SA6.A0C;
        } else {
            syg = SA6.A0J;
        }
        A04(syg);
        return syg;
    }

    public final void A09(InterfaceC65468Tkk interfaceC65468Tkk) {
        InterfaceC65616To7 interfaceC65616To7;
        SYG syg;
        if (A0F()) {
            AbstractC63398SjT.A09("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.A02.FFv(AbstractC63227Sfe.A01(6));
            syg = SA6.A0C;
        } else {
            int i = 1;
            if (this.A0I == 1) {
                AbstractC63398SjT.A0A("BillingClient", "Client is already in the process of connecting to billing service.");
                interfaceC65616To7 = this.A02;
                i = 37;
                syg = SA6.A05;
            } else if (this.A0I == 3) {
                AbstractC63398SjT.A0A("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                interfaceC65616To7 = this.A02;
                i = 38;
                syg = SA6.A0D;
            } else {
                this.A0I = 1;
                AbstractC63398SjT.A09("BillingClient", "Starting in-app billing setup.");
                this.A0L = new ServiceConnectionC63444SkN(this, interfaceC65468Tkk);
                Intent A0E = AbstractC58318PtA.A0E("com.android.vending.billing.InAppBillingService.BIND");
                A0E.setPackage("com.android.vending");
                Context context = this.A01;
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(A0E, 0);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                    if (serviceInfo != null) {
                        String str = ((PackageItemInfo) serviceInfo).packageName;
                        String str2 = ((PackageItemInfo) serviceInfo).name;
                        if ("com.android.vending".equals(str) && str2 != null) {
                            ComponentName componentName = new ComponentName(str, str2);
                            Intent intent = new Intent(A0E);
                            intent.setComponent(componentName);
                            intent.putExtra("playBillingLibraryVersion", this.A0G);
                            if (context.bindService(intent, this.A0L, 1)) {
                                AbstractC63398SjT.A09("BillingClient", "Service was bonded successfully.");
                                return;
                            } else {
                                AbstractC63398SjT.A0A("BillingClient", "Connection to Billing service is blocked.");
                                i = 39;
                            }
                        } else {
                            AbstractC63398SjT.A0A("BillingClient", "The device doesn't have valid Play Store.");
                            i = 40;
                        }
                    }
                } else {
                    i = 41;
                }
                this.A0I = 0;
                AbstractC63398SjT.A09("BillingClient", "Billing service unavailable on device.");
                interfaceC65616To7 = this.A02;
                syg = SA6.A04;
            }
            AbstractC58319PtB.A1E(syg, interfaceC65616To7, i, 6);
        }
        interfaceC65468Tkk.CzM(syg);
    }
}
