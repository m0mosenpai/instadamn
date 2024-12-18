package X;

import android.os.Handler;

/* renamed from: X.AYv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23396AYv implements InterfaceC176157sY {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C23396AYv(Handler handler, C175887s2 c175887s2, InterfaceC176157sY interfaceC176157sY, int i) {
        this.A00 = i;
        this.A01 = c175887s2;
        this.A03 = interfaceC176157sY;
        this.A02 = handler;
    }

    @Override // X.InterfaceC176157sY
    public final void DE8(AbstractC223559ty abstractC223559ty) {
        InterfaceC176157sY interfaceC176157sY;
        Handler handler;
        String str;
        int i = this.A00;
        C175917s6 c175917s6 = ((C175887s2) this.A01).A0I;
        switch (i) {
            case 0:
                c175917s6.A05.A01("prAE");
                interfaceC176157sY = (InterfaceC176157sY) this.A03;
                handler = (Handler) this.A02;
                str = "prepareRecorder";
                break;
            case 1:
                c175917s6.A05.A01("aAE");
                interfaceC176157sY = (InterfaceC176157sY) this.A03;
                handler = (Handler) this.A02;
                str = "addOutput/startInput";
                break;
            default:
                c175917s6.A05.A01("rOAE");
                interfaceC176157sY = (InterfaceC176157sY) this.A03;
                handler = (Handler) this.A02;
                str = "removeOutput/stopInput";
                break;
        }
        C175887s2.A01(handler, abstractC223559ty, interfaceC176157sY, str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC176157sY
    public final void onSuccess() {
        InterfaceC176157sY interfaceC176157sY;
        Handler handler;
        String str;
        int i = this.A00;
        C175917s6 c175917s6 = ((C175887s2) this.A01).A0I;
        switch (i) {
            case 0:
                c175917s6.A05.A01("prAE");
                ((InterfaceC176157sY) this.A03).onSuccess();
                return;
            case 1:
                c175917s6.A05.A01("aAE");
                interfaceC176157sY = (InterfaceC176157sY) this.A03;
                handler = (Handler) this.A02;
                str = "";
                handler.post(new RunnableC196508mg(0, str, interfaceC176157sY));
                return;
            default:
                c175917s6.A05.A01("rOAE");
                interfaceC176157sY = (InterfaceC176157sY) this.A03;
                handler = (Handler) this.A02;
                str = "Error when stopping session";
                handler.post(new RunnableC196508mg(0, str, interfaceC176157sY));
                return;
        }
    }
}
