package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: X.Tt1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ChoreographerFrameCallbackC65727Tt1 implements Choreographer.FrameCallback {
    public final /* synthetic */ C141556aY A00;

    public ChoreographerFrameCallbackC65727Tt1(C141556aY c141556aY) {
        this.A00 = c141556aY;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        ArrayList arrayList;
        C141536aW c141536aW = this.A00.A02.A00;
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis();
        int i = 0;
        while (true) {
            arrayList = c141536aW.A04;
            if (i >= arrayList.size()) {
                break;
            }
            InterfaceC71834X6r interfaceC71834X6r = (InterfaceC71834X6r) arrayList.get(i);
            if (interfaceC71834X6r != null) {
                C005001p c005001p = c141536aW.A02;
                Number number = (Number) c005001p.get(interfaceC71834X6r);
                if (number != null) {
                    if (number.longValue() < uptimeMillis2) {
                        c005001p.remove(interfaceC71834X6r);
                    }
                }
                AbstractC65716Tsp abstractC65716Tsp = (AbstractC65716Tsp) interfaceC71834X6r;
                long j2 = abstractC65716Tsp.A05;
                if (j2 == 0) {
                    abstractC65716Tsp.A05 = uptimeMillis;
                    abstractC65716Tsp.A04(abstractC65716Tsp.A03);
                } else {
                    abstractC65716Tsp.A05 = uptimeMillis;
                    boolean A07 = abstractC65716Tsp.A07(uptimeMillis - j2);
                    float min = Math.min(abstractC65716Tsp.A03, abstractC65716Tsp.A00);
                    abstractC65716Tsp.A03 = min;
                    float max = Math.max(min, abstractC65716Tsp.A01);
                    abstractC65716Tsp.A03 = max;
                    abstractC65716Tsp.A04(max);
                    if (A07) {
                        AbstractC65716Tsp.A00(abstractC65716Tsp, false);
                    }
                }
            }
            i++;
        }
        if (c141536aW.A01) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            }
            c141536aW.A01 = false;
        }
        if (arrayList.size() > 0) {
            C141556aY c141556aY = c141536aW.A00;
            if (c141556aY == null) {
                c141556aY = new C141556aY(c141536aW.A03);
                c141536aW.A00 = c141556aY;
            }
            c141556aY.A01.postFrameCallback(c141556aY.A00);
        }
    }
}
