package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Ttu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65779Ttu implements Runnable {
    public final /* synthetic */ AbstractC82213li A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC65779Ttu(AbstractC82213li abstractC82213li, ArrayList arrayList) {
        this.A00 = abstractC82213li;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.A00.A0W((C3OO) it.next());
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
