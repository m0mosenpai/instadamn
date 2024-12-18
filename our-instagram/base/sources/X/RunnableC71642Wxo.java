package X;

import android.graphics.Bitmap;
import android.util.SparseArray;

/* renamed from: X.Wxo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71642Wxo implements Runnable {
    public final XEQ A00;
    public final int A01;
    public final int A02;
    public final XGp A03;
    public final /* synthetic */ C69269Vkd A04;

    private final boolean A00(int i, int i2) {
        C1VO AgB;
        boolean z;
        int i3 = 2;
        C1VO c1vo = null;
        try {
            if (i2 != 1) {
                try {
                    C69269Vkd c69269Vkd = this.A04;
                    AbstractC27691Vx abstractC27691Vx = c69269Vkd.A03;
                    XGp xGp = this.A03;
                    AgB = abstractC27691Vx.A00(c69269Vkd.A00, xGp.BJI(), xGp.BJF());
                    c1vo = AgB;
                    i3 = -1;
                } catch (RuntimeException e) {
                    C0I3 c0i3 = C0I2.A00;
                    if (!c0i3.isLoggable(5)) {
                        return false;
                    }
                    c0i3.w(C69269Vkd.class.getSimpleName(), "Failed to create frame bitmap", e);
                    return false;
                }
            } else {
                XEQ xeq = this.A00;
                XGp xGp2 = this.A03;
                AgB = xeq.AgB(i, xGp2.BJI(), xGp2.BJF());
                c1vo = AgB;
            }
            if (AgB != null && AgB.A05()) {
                C69269Vkd c69269Vkd2 = this.A04;
                if (c69269Vkd2.A02.A00((Bitmap) AgB.A04(), i)) {
                    synchronized (c69269Vkd2.A01) {
                        this.A00.DIK(AgB, i, i2);
                    }
                    z = true;
                    C1VO.A01(AgB);
                    if (z && i3 != -1) {
                        return A00(i, i3);
                    }
                }
            }
            z = false;
            C1VO.A01(AgB);
            return z ? z : z;
        } catch (Throwable th) {
            C1VO.A01(c1vo);
            throw th;
        }
    }

    public RunnableC71642Wxo(XGp xGp, XEQ xeq, C69269Vkd c69269Vkd, int i, int i2) {
        this.A04 = c69269Vkd;
        this.A03 = xGp;
        this.A00 = xeq;
        this.A02 = i;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C69269Vkd c69269Vkd;
        SparseArray sparseArray;
        try {
            XEQ xeq = this.A00;
            int i = this.A02;
            if (xeq.contains(i)) {
                sparseArray = this.A04.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
            } else {
                if (A00(i, 1)) {
                    c69269Vkd = this.A04;
                } else {
                    c69269Vkd = this.A04;
                    Object[] objArr = {Integer.valueOf(i)};
                    C0I3 c0i3 = C0I2.A00;
                    if (c0i3.isLoggable(6)) {
                        c0i3.e(C69269Vkd.class.getSimpleName(), String.format(null, "Could not prepare frame %d.", objArr));
                    }
                }
                sparseArray = c69269Vkd.A01;
                synchronized (sparseArray) {
                    sparseArray.remove(this.A01);
                }
            }
        } catch (Throwable th) {
            SparseArray sparseArray2 = this.A04.A01;
            synchronized (sparseArray2) {
                sparseArray2.remove(this.A01);
                throw th;
            }
        }
    }
}
