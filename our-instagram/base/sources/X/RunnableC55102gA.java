package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.2gA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC55102gA implements Runnable {
    public final int A00;
    public final Throwable A01;
    public final List A02;

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A02;
        int size = list.size();
        int i = 0;
        if (this.A00 != 1) {
            while (i < size) {
                ((AbstractC106884rp) list.get(i)).A01(this.A01);
                i++;
            }
        } else {
            while (i < size) {
                ((AbstractC106884rp) list.get(i)).A00();
                i++;
            }
        }
    }

    public RunnableC55102gA(Throwable th, Collection collection, int i) {
        C02R.A03(collection, "initCallbacks cannot be null");
        this.A02 = new ArrayList(collection);
        this.A00 = i;
        this.A01 = th;
    }
}
