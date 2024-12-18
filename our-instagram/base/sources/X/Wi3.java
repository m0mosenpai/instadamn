package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class Wi3 implements InterfaceC57142jp {
    public final WeakReference A00;
    public final int[] A01 = new int[2];

    @Override // X.InterfaceC57142jp
    public final void Ao7(Rect rect) {
        C14360o3.A0B(rect, 0);
        View view = (View) this.A00.get();
        if (view != null) {
            int[] iArr = this.A01;
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.set(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
        }
    }

    public Wi3(View view) {
        this.A00 = new WeakReference(view);
    }
}
