package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsExampleData;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4uF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108284uF implements InterfaceC108294uG {
    public InterfaceC108204u7 A00;
    public AbstractC1117051t A01;
    public final AbstractC108234uA A02;
    public final InterfaceC16660sJ A06;
    public final InterfaceC16600sD A07;
    public final C19L A08;
    public final UserSession A09;
    public final List A03 = new ArrayList();
    public final List A05 = new ArrayList();
    public final List A04 = new ArrayList();

    public final void A02(String str, InterfaceC16660sJ interfaceC16660sJ) {
        C19L c19l = this.A08;
        C206699Da c206699Da = new C206699Da(this, interfaceC16660sJ, str, null, 1);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206699Da, c19l);
    }

    @Override // X.InterfaceC108294uG
    public final void ELI(C54779OIt c54779OIt) {
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC1117051t abstractC1117051t = c54779OIt.A03;
        if (abstractC1117051t != null) {
            C19L c19l = this.A08;
            C9D0 c9d0 = new C9D0(this, c54779OIt, (InterfaceC23621Ds) null, 46);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d0, c19l);
            try {
                abstractC1117051t.A02(c54779OIt.A01, new C57562Pga(c54779OIt, this, currentTimeMillis));
                return;
            } catch (C5J4 e) {
                Throwable cause = e.getCause();
                C3R9[] c3r9Arr = IgSignalsModelPrediction.A07;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to request prediction with exception: ");
                sb.append(e);
                sb.append(' ');
                sb.append(cause);
                c54779OIt.A00(new IgSignalsModelPrediction(sb.toString(), new HashMap(), -1.0d, false));
                return;
            }
        }
        String A00 = AbstractC111324zv.A00(3691);
        C3R9[] c3r9Arr2 = IgSignalsModelPrediction.A07;
        A01(new IgSignalsModelPrediction(A00, new HashMap(), -1.0d, false), c54779OIt, this, currentTimeMillis);
        C0w9.A03("IgSignals", AbstractC111324zv.A00(3690));
    }

    public static final void A00(C52C c52c, C108284uF c108284uF) {
        List list;
        Iterator it = c108284uF.A05.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((C54779OIt) it.next()).A01, c52c)) {
                return;
            }
        }
        InterfaceC108204u7 interfaceC108204u7 = c108284uF.A00;
        if (interfaceC108204u7 != null) {
            ReentrantLock reentrantLock = c52c.A08;
            reentrantLock.lock();
            try {
                C3R9[] c3r9Arr = IgSignalsExampleData.A06;
                String str = c52c.A04;
                double d = c52c.A02;
                List list2 = c52c.A05;
                long j = c52c.A03;
                List list3 = c52c.A01;
                if (list3 != null) {
                    list = AbstractC001800i.A0a(list3);
                } else {
                    list = null;
                }
                IgSignalsExampleData igSignalsExampleData = new IgSignalsExampleData(str, list2, list, AbstractC001800i.A0a(c52c.A06.values()), d, j);
                reentrantLock.unlock();
                interfaceC108204u7.Eou(igSignalsExampleData);
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("No example storage set to store example: ");
            sb.append(c52c);
            C0w9.A03("IgSignals", sb.toString());
        }
        c108284uF.A04.remove(c52c);
    }

    public C108284uF(UserSession userSession, AbstractC108234uA abstractC108234uA, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16600sD interfaceC16600sD, C19L c19l) {
        this.A09 = userSession;
        this.A02 = abstractC108234uA;
        this.A06 = interfaceC16660sJ;
        this.A07 = interfaceC16600sD;
        this.A08 = c19l;
    }

    public static final void A01(IgSignalsModelPrediction igSignalsModelPrediction, C54779OIt c54779OIt, C108284uF c108284uF, long j) {
        WD2 wd2;
        long currentTimeMillis = System.currentTimeMillis();
        igSignalsModelPrediction.A01 = j;
        igSignalsModelPrediction.A00 = currentTimeMillis;
        AbstractC1117051t abstractC1117051t = c54779OIt.A03;
        if (abstractC1117051t != null) {
            wd2 = abstractC1117051t.A00();
        } else {
            wd2 = null;
        }
        igSignalsModelPrediction.A02 = wd2;
        c54779OIt.A00(igSignalsModelPrediction);
        C19L c19l = c108284uF.A08;
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C9D0(c108284uF, c54779OIt, (InterfaceC23621Ds) null, 45), c19l);
    }
}
