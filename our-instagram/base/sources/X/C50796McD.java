package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.McD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50796McD extends ViewOutlineProvider {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public C50796McD(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            int i = this.A01;
            int i2 = this.A00;
            outline.setRoundRect(i, i2, view.getWidth() - i, view.getHeight() - i2, i2);
        }
    }
}
