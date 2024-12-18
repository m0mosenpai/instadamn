package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WuA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71448WuA implements Runnable {
    public final /* synthetic */ AbstractC82213li A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC71448WuA(AbstractC82213li abstractC82213li, ArrayList arrayList) {
        this.A00 = abstractC82213li;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.A00.A0a((VK2) it.next());
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
