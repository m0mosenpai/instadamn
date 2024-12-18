package X;

import android.view.View;

/* renamed from: X.Wxh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71635Wxh implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC143526dr A02;
    public final /* synthetic */ InterfaceC143526dr A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16820sZ A07;

    public RunnableC71635Wxh(View view, View view2, InterfaceC143526dr interfaceC143526dr, InterfaceC143526dr interfaceC143526dr2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        this.A00 = view;
        this.A04 = str;
        this.A01 = view2;
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A02 = interfaceC143526dr;
        this.A03 = interfaceC143526dr2;
        this.A05 = interfaceC16820sZ3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.A00;
        String str = this.A04;
        if (!AbstractC69983Vz2.A01(view, str)) {
            View view2 = this.A01;
            if (!AbstractC69983Vz2.A01(view2, str) && AbstractC25231BEo.A1b(this.A07)) {
                this.A06.invoke();
                InterfaceC143526dr interfaceC143526dr = this.A02;
                AbstractC167007dF.A1I(view, 0, interfaceC143526dr);
                AbstractC125325le A00 = AbstractC69983Vz2.A00(view, new C71050Wn5(view, interfaceC143526dr, 1.0f));
                A00.A0U(1.0f, 0.0f, -1.0f);
                A00.A0V(1.0f, 0.0f, -1.0f);
                A00.A08 = str;
                A00.A0H();
                InterfaceC143526dr interfaceC143526dr2 = this.A03;
                C14360o3.A0B(view2, 0);
                AbstractC125325le A002 = AbstractC69983Vz2.A00(view2, new C71050Wn5(view2, interfaceC143526dr2, 0.0f));
                A002.A0U(0.0f, 1.0f, -1.0f);
                A002.A0V(0.0f, 1.0f, -1.0f);
                A002.A05 = new C71037Wms(this.A05, 4);
                A002.A08 = str;
                A002.A0H();
            }
        }
    }
}
