package X;

import android.view.View;

/* renamed from: X.9GO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9GO implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C85993sW A00;
    public final /* synthetic */ C81303k0 A01;

    public C9GO(C85993sW c85993sW, C81303k0 c81303k0) {
        this.A01 = c81303k0;
        this.A00 = c85993sW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C81303k0 c81303k0 = this.A01;
        C75113Zb c75113Zb = c81303k0.A04;
        if ((c75113Zb != null && c75113Zb.A2i) || !c81303k0.A05 || c75113Zb == null) {
            return;
        }
        ((C125315ld) this.A00.A04.A01(C125315ld.class, C125305lc.A00)).A01(c75113Zb, c81303k0.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C125315ld c125315ld = (C125315ld) this.A00.A04.A01(C125315ld.class, C125305lc.A00);
        C75113Zb c75113Zb = this.A01.A04;
        if (c75113Zb != null) {
            c125315ld.A00(c75113Zb);
        }
    }
}
