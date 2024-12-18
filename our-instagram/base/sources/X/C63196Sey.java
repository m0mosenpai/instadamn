package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.models.IgModelLoader;
import com.facebook.smartcapture.download.CreditCardModulesDownloader;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import java.lang.ref.WeakReference;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sey, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63196Sey {
    public CreditCardModulesDownloader A00;
    public final C64160T1m A01;
    public final C64160T1m A02;
    public final C64158T1k A03;
    public final C64159T1l A04;
    public final IdCaptureLogger A05;
    public final WeakReference A06;
    public final WeakReference A09;
    public final java.util.Set A0A;
    public final Map A08 = new EnumMap(EnumC61137Rfr.class);
    public final Map A07 = new EnumMap(EnumC61137Rfr.class);

    public static final synchronized void A00(C63196Sey c63196Sey) {
        C62429SBe c62429SBe;
        synchronized (c63196Sey) {
            if (c63196Sey.A03() && (c62429SBe = (C62429SBe) c63196Sey.A09.get()) != null) {
                Map A12 = AbstractC58318PtA.A12(c63196Sey.A07);
                C64094SzB c64094SzB = c62429SBe.A00;
                c64094SzB.A0A.initJNI(false, c64094SzB.A08, A12);
                c64094SzB.A03();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        r0 = (X.C62429SBe) r3.A09.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        r2 = r0.A00;
        r2.A04 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOAD_FAILED;
        X.C64094SzB.A01(null, r2, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final synchronized void A01(X.C63196Sey r3) {
        /*
            monitor-enter(r3)
            java.util.Set r0 = r3.A0A     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L35
        L7:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L1e
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L35
            X.Rfr r1 = (X.EnumC61137Rfr) r1     // Catch: java.lang.Throwable -> L35
            java.util.Map r0 = r3.A08     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r0.get(r1)     // Catch: java.lang.Throwable -> L35
            X.RfT r0 = X.EnumC61113RfT.A04     // Catch: java.lang.Throwable -> L35
            if (r1 != r0) goto L7
            goto L33
        L1e:
            java.lang.ref.WeakReference r0 = r3.A09     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L35
            X.SBe r0 = (X.C62429SBe) r0     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L33
            X.SzB r2 = r0.A00     // Catch: java.lang.Throwable -> L35
            com.facebook.smartcapture.docauth.CaptureState r0 = com.facebook.smartcapture.docauth.CaptureState.DOWNLOAD_FAILED     // Catch: java.lang.Throwable -> L35
            r2.A04 = r0     // Catch: java.lang.Throwable -> L35
            r1 = 0
            r0 = 0
            X.C64094SzB.A01(r1, r2, r0)     // Catch: java.lang.Throwable -> L35
        L33:
            monitor-exit(r3)
            return
        L35:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63196Sey.A01(X.Sey):void");
    }

    public final synchronized void A02() {
        CreditCardModulesDownloader creditCardModulesDownloader;
        for (EnumC61137Rfr enumC61137Rfr : this.A0A) {
            Map map = this.A08;
            if (map.get(enumC61137Rfr) != EnumC61113RfT.A02) {
                if (((Context) this.A06.get()) != null && (creditCardModulesDownloader = this.A00) != null) {
                    EnumC61113RfT enumC61113RfT = EnumC61113RfT.A04;
                    map.put(enumC61137Rfr, enumC61113RfT);
                    switch (enumC61137Rfr.ordinal()) {
                        case 0:
                            C64160T1m c64160T1m = this.A02;
                            C14360o3.A0B(c64160T1m, 1);
                            c64160T1m.DBk();
                            break;
                        case 1:
                            C64158T1k c64158T1k = this.A03;
                            C14360o3.A0B(c64158T1k, 1);
                            C09Y c09y = C023409i.A0A;
                            Bundle bundle = ((IgVoltronAndNmlModulesDownloader) creditCardModulesDownloader).A00;
                            C14360o3.A0A(bundle);
                            IgModelLoader A00 = C195908lc.A00(c09y.A04(bundle));
                            if (A00 != null) {
                                C2OD.A03(new T8G(c64158T1k, 4), A00.load("id_detector_pt", 1L), C1M8.A01);
                                break;
                            } else {
                                C0K8.A02(IgVoltronAndNmlModulesDownloader.class, "Failed to create ModelLoader");
                                break;
                            }
                        case 2:
                            C64160T1m c64160T1m2 = this.A01;
                            C14360o3.A0B(c64160T1m2, 1);
                            Integer num = C05F.A00;
                            C09Y c09y2 = C023409i.A0A;
                            Bundle bundle2 = ((IgVoltronAndNmlModulesDownloader) creditCardModulesDownloader).A00;
                            C14360o3.A0A(bundle2);
                            AbstractC18680vv A04 = c09y2.A04(bundle2);
                            C1RQ A002 = C1RQ.A00();
                            MTC mtc = new MTC(EnumC27091Ti.A0K);
                            mtc.A03 = num;
                            mtc.A02 = new TGS(c64160T1m2, 3);
                            A002.A03(A04, new MTD(mtc));
                            break;
                        case 3:
                        case 4:
                        case 5:
                            EnumC61113RfT enumC61113RfT2 = (EnumC61113RfT) map.get(EnumC61137Rfr.A06);
                            EnumC61113RfT enumC61113RfT3 = (EnumC61113RfT) map.get(EnumC61137Rfr.A07);
                            EnumC61113RfT enumC61113RfT4 = (EnumC61113RfT) map.get(EnumC61137Rfr.A05);
                            if (enumC61113RfT2 != enumC61113RfT || enumC61113RfT3 != enumC61113RfT || enumC61113RfT4 != enumC61113RfT) {
                                C64159T1l c64159T1l = this.A04;
                                C14360o3.A0B(c64159T1l, 1);
                                C09Y c09y3 = C023409i.A0A;
                                Bundle bundle3 = ((IgVoltronAndNmlModulesDownloader) creditCardModulesDownloader).A00;
                                C14360o3.A0A(bundle3);
                                IgModelLoader A003 = C195908lc.A00(c09y3.A04(bundle3));
                                if (A003 != null) {
                                    C2OD.A03(new T8G(c64159T1l, 5), A003.load("ocr2go_credit_card_models", 2L), C1M8.A01);
                                    break;
                                } else {
                                    C0K8.A02(IgVoltronAndNmlModulesDownloader.class, "Failed to create ModelLoader");
                                    break;
                                }
                            } else {
                                break;
                            }
                            break;
                    }
                }
            }
        }
    }

    public final synchronized boolean A03() {
        boolean z;
        Iterator it = this.A0A.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((EnumC61113RfT) this.A08.get((EnumC61137Rfr) it.next())) != EnumC61113RfT.A02) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        return z;
    }

    public C63196Sey(Context context, IdCaptureLogger idCaptureLogger, C62429SBe c62429SBe, boolean z) {
        EnumSet of;
        this.A05 = idCaptureLogger;
        this.A06 = AbstractC25225BEi.A16(context);
        this.A09 = AbstractC25225BEi.A16(c62429SBe);
        EnumC61137Rfr enumC61137Rfr = EnumC61137Rfr.A03;
        this.A02 = new C64160T1m(enumC61137Rfr, this);
        EnumC61137Rfr enumC61137Rfr2 = EnumC61137Rfr.A02;
        this.A01 = new C64160T1m(enumC61137Rfr2, this);
        this.A03 = new C64158T1k(this);
        this.A04 = new C64159T1l(this);
        if (z) {
            of = EnumSet.of(EnumC61137Rfr.A04, enumC61137Rfr2, EnumC61137Rfr.A06, EnumC61137Rfr.A07, EnumC61137Rfr.A05);
        } else {
            of = EnumSet.of(enumC61137Rfr, EnumC61137Rfr.A04);
        }
        C14360o3.A0A(of);
        this.A0A = of;
    }
}
