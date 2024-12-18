package X;

import android.os.SystemClock;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.SystraceMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TRT implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ SZN A05;
    public final /* synthetic */ ArrayDeque A06;
    public final /* synthetic */ ArrayList A07;
    public final /* synthetic */ ArrayList A08;

    public TRT(SZN szn, ArrayDeque arrayDeque, ArrayList arrayList, ArrayList arrayList2, int i, long j, long j2, long j3, long j4) {
        this.A05 = szn;
        this.A00 = i;
        this.A08 = arrayList;
        this.A06 = arrayDeque;
        this.A07 = arrayList2;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A04 = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC09720ep A00 = SystraceMessage.A00(SystraceMessage.A00, "DispatchUI", OdexSchemeArtXdex.STATE_PGO_ATTEMPTED);
        A00.A01("BatchId", this.A00);
        A00.A02();
        try {
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = this.A08;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC65544TmJ interfaceC65544TmJ = (InterfaceC65544TmJ) it.next();
                        try {
                            interfaceC65544TmJ.ATc();
                        } catch (TXD e) {
                            if (interfaceC65544TmJ.Box() == 0) {
                                interfaceC65544TmJ.CNG();
                                this.A05.A0G.add(interfaceC65544TmJ);
                            } else {
                                str = "UIViewOperationQueue";
                                th = new RuntimeException(e);
                                ReactSoftExceptionLogger.logSoftException(str, th);
                            }
                        } catch (Throwable th) {
                            th = th;
                            str = "UIViewOperationQueue";
                            ReactSoftExceptionLogger.logSoftException(str, th);
                        }
                    }
                }
                ArrayDeque arrayDeque = this.A06;
                if (arrayDeque != null) {
                    Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC65362Tit) it2.next()).ATI();
                    }
                }
                ArrayList arrayList2 = this.A07;
                if (arrayList2 != null) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        ((InterfaceC65362Tit) it3.next()).ATI();
                    }
                }
                SZN szn = this.A05;
                if (szn.A0J && szn.A04 == 0) {
                    long j = this.A01;
                    szn.A04 = j;
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    szn.A03 = uptimeMillis2;
                    szn.A06 = this.A03;
                    szn.A05 = this.A02;
                    szn.A09 = uptimeMillis;
                    szn.A08 = uptimeMillis2;
                    szn.A0A = this.A04;
                    Systrace.A09("delayBeforeDispatchViewUpdates", 0, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, j * 1000000);
                    Systrace.A0A("delayBeforeDispatchViewUpdates", 0, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, szn.A05 * 1000000);
                    Systrace.A09("delayBeforeBatchRunStart", 0, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, szn.A05 * 1000000);
                    Systrace.A0A("delayBeforeBatchRunStart", 0, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, szn.A09 * 1000000);
                }
                C63309ShF c63309ShF = szn.A0L;
                synchronized (c63309ShF) {
                    c63309ShF.A08.A01();
                }
                C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, 448273833);
            } catch (Exception e2) {
                this.A05.A0I = true;
                throw e2;
            }
        } catch (Throwable th2) {
            C0fY.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, -817232817);
            throw th2;
        }
    }
}
