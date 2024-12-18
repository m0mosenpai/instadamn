package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Wu9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71447Wu9 implements Runnable {
    public final /* synthetic */ AbstractC82213li A00;
    public final /* synthetic */ ArrayList A01;

    public RunnableC71447Wu9(AbstractC82213li abstractC82213li, ArrayList arrayList) {
        this.A00 = abstractC82213li;
        this.A01 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C68243VJf c68243VJf = (C68243VJf) it.next();
            this.A00.A0Z(c68243VJf.A04, c68243VJf.A00, c68243VJf.A01, c68243VJf.A02, c68243VJf.A03);
        }
        arrayList.clear();
        this.A00.A05.remove(arrayList);
    }
}
