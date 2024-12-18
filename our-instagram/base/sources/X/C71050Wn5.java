package X;

import android.view.View;

/* renamed from: X.Wn5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71050Wn5 implements InterfaceC143526dr {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ InterfaceC143526dr A02;

    public C71050Wn5(View view, InterfaceC143526dr interfaceC143526dr, float f) {
        this.A01 = view;
        this.A00 = f;
        this.A02 = interfaceC143526dr;
    }

    @Override // X.InterfaceC143526dr
    public final void DgX() {
        View view = this.A01;
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        this.A02.DgX();
    }
}
