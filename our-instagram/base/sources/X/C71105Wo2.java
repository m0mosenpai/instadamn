package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Wo2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71105Wo2 implements InterfaceC59892oW {
    public final /* synthetic */ C15370ps A00;

    public C71105Wo2(C15370ps c15370ps) {
        this.A00 = c15370ps;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view = (View) this.A00.A00;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = i + i2;
        }
    }
}
