package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.BYy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25737BYy extends ViewOutlineProvider {
    public final int A00;

    public C25737BYy(int i) {
        this.A00 = i;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.A00 != 0) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        } else {
            if (!(view instanceof C25733BYt)) {
                return;
            }
            ViewOutlineProvider viewOutlineProvider = C25733BYt.A0A;
            Outline outline2 = ((C25733BYt) view).A00;
            if (outline2 == null) {
                return;
            }
            outline.set(outline2);
        }
    }
}
