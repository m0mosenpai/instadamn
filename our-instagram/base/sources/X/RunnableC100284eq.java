package X;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4eq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC100284eq implements Runnable, InterfaceC100294er {
    public long A00;
    public final InterfaceC100254en A01;
    public final List A02;
    public final boolean A03;
    public final long A04;
    public final Handler A05 = C87923w0.A00().A00;
    public final C100234el A06;

    public final void A00(long j, boolean z) {
        if (C87973w5.A02.A01.get()) {
            this.A00 = SystemClock.uptimeMillis() + j;
            this.A05.postDelayed(this, j);
            if (z) {
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC100084eW) it.next()).update();
                }
            }
        }
    }

    @Override // X.InterfaceC100294er
    public final void ASt(boolean z) {
        Handler handler = this.A05;
        if (z) {
            handler.removeCallbacks(this);
            A00(0L, false);
        } else {
            handler.removeCallbacks(this);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [X.SJ7, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int size;
        InterfaceC100254en interfaceC100254en = this.A01;
        C88023wA Aua = interfaceC100254en.Aua();
        if (Aua != null && ((C88033wB) Aua).A05 == -1) {
            List list = Aua.A0A;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            if (size >= 5) {
                A00(this.A04, false);
                return;
            }
            long j2 = this.A04;
            long j3 = (size + 1) * j2;
            long A01 = Aua.A01();
            if (A01 < j3) {
                j = j3 - A01;
            } else {
                long j4 = this.A00;
                long j5 = A01 - j3;
                while (j5 > j2) {
                    j5 -= j2;
                }
                A00(j2 - j5, false);
                ?? obj = new Object();
                long uptimeMillis = SystemClock.uptimeMillis();
                obj.A02 = uptimeMillis;
                obj.A00 = uptimeMillis - j4;
                Thread thread = Aua.A09;
                if (thread == null) {
                    return;
                }
                try {
                    obj.A04 = thread.getState().name();
                    obj.A06 = C87973w5.A02.A01.get();
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    obj.A07 = stackTrace;
                    if (((C88033wB) Aua).A05 == -1) {
                        QDM qdm = new QDM();
                        Iterator it = this.A02.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            InterfaceC100084eW interfaceC100084eW = (InterfaceC100084eW) it.next();
                            if (((C88033wB) Aua).A05 == -1) {
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                interfaceC100084eW.AGj(qdm, stackTrace);
                                long uptimeMillis3 = SystemClock.uptimeMillis() - uptimeMillis2;
                                if (this.A03) {
                                    Map map = ((SN2) qdm).A0E;
                                    if (map == null) {
                                        map = new HashMap();
                                        ((SN2) qdm).A0E = map;
                                    }
                                    map.put(interfaceC100084eW, Long.valueOf(uptimeMillis3));
                                }
                            } else {
                                obj.A05 = true;
                                break;
                            }
                        }
                        obj.A03 = qdm;
                    } else {
                        obj.A05 = true;
                    }
                } catch (Throwable unused) {
                }
                obj.A01 = SystemClock.uptimeMillis();
                List list2 = Aua.A0A;
                if (list2 == null) {
                    list2 = new ArrayList();
                    Aua.A0A = list2;
                }
                list2.add(obj);
                interfaceC100254en.CpZ(Aua);
                return;
            }
        } else {
            j = this.A04;
        }
        A00(j, true);
    }

    public RunnableC100284eq(InterfaceC100254en interfaceC100254en, AbstractC100044eS abstractC100044eS, C100234el c100234el, List list) {
        boolean z;
        this.A01 = interfaceC100254en;
        this.A02 = list;
        this.A06 = c100234el;
        this.A04 = abstractC100044eS.A00();
        if (abstractC100044eS instanceof C100304es) {
            z = true;
        } else {
            z = false;
        }
        this.A03 = z;
        C87973w5.A02.A00(this);
    }
}
