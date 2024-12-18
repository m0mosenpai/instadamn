package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.Wi4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70840Wi4 implements InterfaceC57142jp {
    public final WeakReference A00;
    public final int[] A01 = new int[2];

    @Override // X.InterfaceC57142jp
    public final void Ao7(Rect rect) {
        View view = (View) this.A00.get();
        if (view == null) {
            rect.setEmpty();
            return;
        }
        int[] iArr = this.A01;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    public C70840Wi4(View view) {
        this.A00 = new WeakReference(view);
    }
}
