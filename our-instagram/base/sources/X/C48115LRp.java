package X;

import android.view.View;

/* renamed from: X.LRp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48115LRp implements InterfaceC71882X8p {
    public final /* synthetic */ int A00;

    public C48115LRp(int i) {
        this.A00 = i;
    }

    @Override // X.InterfaceC71882X8p
    public final void F8Q(View view, float f) {
        view.setTranslationX((-this.A00) * f);
        float abs = 1.0f - (Math.abs(f) * 0.25f);
        view.setScaleY(abs);
        view.setScaleX(abs);
    }
}
