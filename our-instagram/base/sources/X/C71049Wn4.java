package X;

import android.view.View;

/* renamed from: X.Wn4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71049Wn4 implements InterfaceC143526dr {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;

    public C71049Wn4(View view, float f) {
        this.A01 = view;
        this.A00 = f;
    }

    @Override // X.InterfaceC143526dr
    public final void DgX() {
        View view = this.A01;
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setPivotX(0.0f);
        view.setPivotY(view.getHeight());
    }
}
