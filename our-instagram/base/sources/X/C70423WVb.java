package X;

import android.util.SparseArray;

/* renamed from: X.WVb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70423WVb implements InterfaceC71971XDd {
    public final int A00;

    @Override // X.InterfaceC71971XDd
    public final void E5j(XGp xGp, XEQ xeq, C69269Vkd c69269Vkd, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2 = this.A00;
        int i3 = 1;
        while (true) {
            int frameCount = (i + i3) % xGp.getFrameCount();
            int hashCode = (xGp.hashCode() * 31) + frameCount;
            SparseArray sparseArray = c69269Vkd.A01;
            synchronized (sparseArray) {
                if (sparseArray.get(hashCode) == null && !xeq.contains(frameCount)) {
                    RunnableC71642Wxo runnableC71642Wxo = new RunnableC71642Wxo(xGp, xeq, c69269Vkd, frameCount, hashCode);
                    sparseArray.put(hashCode, runnableC71642Wxo);
                    c69269Vkd.A04.execute(runnableC71642Wxo);
                }
            }
            if (i3 != i2) {
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC71971XDd
    public final void onStop() {
    }

    public C70423WVb(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC71971XDd
    public final C1VO AgA(int i, int i2, int i3) {
        return null;
    }

    @Override // X.InterfaceC71971XDd
    public final void E5i(InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
    }

    public C70423WVb() {
        this(3);
    }
}
