package X;

import android.view.View;

/* renamed from: X.Ama, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24089Ama implements InterfaceC125355lh {
    public final /* synthetic */ C188708Xk A00;
    public final /* synthetic */ String A01;

    public C24089Ama(C188708Xk c188708Xk, String str) {
        this.A00 = c188708Xk;
        this.A01 = str;
    }

    @Override // X.InterfaceC125355lh
    public final void onFinish() {
        C188708Xk c188708Xk = this.A00;
        View view = c188708Xk.A0B;
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le A00 = AbstractC125325le.A00(view);
        A00.A0K(-AbstractC166987dD.A08(view));
        AbstractC125325le A0A = A00.A0A();
        A0A.A06 = new C24096Amh(c188708Xk, 1);
        A0A.A05 = new C209639Oy(c188708Xk, this.A01);
        A0A.A0H();
    }
}
