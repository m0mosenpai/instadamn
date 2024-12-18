package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Azb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24876Azb implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C206409Bx A02;
    public final /* synthetic */ B0D A03;
    public final /* synthetic */ boolean A04;

    public RunnableC24876Azb(Bitmap bitmap, C206409Bx c206409Bx, B0D b0d, int i, boolean z) {
        this.A03 = b0d;
        this.A01 = bitmap;
        this.A00 = i;
        this.A04 = z;
        this.A02 = c206409Bx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A03.A00;
        Bitmap bitmap = this.A01;
        int i = this.A00;
        boolean z = this.A04;
        C206409Bx c206409Bx = this.A02;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BD5) it.next()).DKj(bitmap, c206409Bx, i, z);
        }
    }
}
