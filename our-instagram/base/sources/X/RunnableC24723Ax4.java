package X;

/* renamed from: X.Ax4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24723Ax4 implements Runnable {
    public final /* synthetic */ AbstractC223559ty A00;
    public final /* synthetic */ InterfaceC176157sY A01;
    public final /* synthetic */ String A02;

    public RunnableC24723Ax4(AbstractC223559ty abstractC223559ty, InterfaceC176157sY interfaceC176157sY, String str) {
        this.A01 = interfaceC176157sY;
        this.A02 = str;
        this.A00 = abstractC223559ty;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC176157sY interfaceC176157sY = this.A01;
        String str = this.A02;
        AbstractC223559ty abstractC223559ty = this.A00;
        interfaceC176157sY.DE8(new AbstractC223559ty(str, abstractC223559ty, abstractC223559ty.A01));
    }
}
