package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.7S4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7S4 implements C7S5 {
    public View A00;

    @Override // X.C7S5
    public final void CET(Rect rect) {
        View view = this.A00;
        if (view != null && view.isAttachedToWindow()) {
            this.A00.getDrawingRect(rect);
            ((ViewGroup) this.A00.getRootView()).offsetDescendantRectToMyCoords(this.A00, rect);
        } else {
            rect.setEmpty();
        }
    }
}
