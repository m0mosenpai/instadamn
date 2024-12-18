package X;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: X.1Vg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27531Vg {
    public static C27531Vg A05;
    public final Object A02 = new Object();
    public final Runnable A04 = new Runnable() { // from class: X.1Vi
        @Override // java.lang.Runnable
        public final void run() {
            C27531Vg c27531Vg = C27531Vg.this;
            synchronized (c27531Vg.A02) {
                ArrayList arrayList = c27531Vg.A01;
                c27531Vg.A01 = c27531Vg.A00;
                c27531Vg.A00 = arrayList;
            }
            int i = 0;
            int size = c27531Vg.A01.size();
            while (true) {
                ArrayList arrayList2 = c27531Vg.A01;
                if (i < size) {
                    ((InterfaceC59312na) arrayList2.get(i)).release();
                    i++;
                } else {
                    arrayList2.clear();
                    return;
                }
            }
        }
    };
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public final Handler A03 = new Handler(Looper.getMainLooper());

    public final void A00(InterfaceC59312na interfaceC59312na) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            synchronized (this.A02) {
                if (this.A00.contains(interfaceC59312na)) {
                    return;
                }
                ArrayList arrayList = this.A00;
                arrayList.add(interfaceC59312na);
                int size = arrayList.size();
                boolean z = true;
                if (size != 1) {
                    z = false;
                }
                if (z) {
                    this.A03.post(this.A04);
                    return;
                }
                return;
            }
        }
        interfaceC59312na.release();
    }
}
