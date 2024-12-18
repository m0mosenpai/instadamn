package X;

/* renamed from: X.AsA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24429AsA implements Runnable {
    public final /* synthetic */ C193408hL A00;

    public RunnableC24429AsA(C193408hL c193408hL) {
        this.A00 = c193408hL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C193408hL c193408hL = this.A00;
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) c193408hL.A02.removeFirst();
        c193408hL.A00 = true;
        interfaceC16660sJ.invoke(new C206959Ea(c193408hL, 1));
    }
}
