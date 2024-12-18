package X;

import java.util.concurrent.Callable;

/* renamed from: X.XbX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72335XbX extends C6D6 {
    public final C72091XNl A00;
    public final Callable A01;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        try {
            Object call = this.A01.call();
            AbstractC42141x4.A01(call, "The seed supplied is null");
            super.A00.EpF(new C73489YFs(this.A00, interfaceC42071wx, call));
        } catch (Throwable th) {
            AbstractC62281S5a.A00(th);
            interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
            interfaceC42071wx.onError(th);
        }
    }

    public C72335XbX(C72091XNl c72091XNl, InterfaceC42061ww interfaceC42061ww, Callable callable) {
        super(interfaceC42061ww);
        this.A00 = c72091XNl;
        this.A01 = callable;
    }
}
