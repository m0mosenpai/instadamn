package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3Hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71263Hn implements InterfaceC57142jp {
    public final WeakReference A00;

    @Override // X.InterfaceC57142jp
    public final void Ao7(Rect rect) {
        C14360o3.A0B(rect, 0);
        View view = (View) this.A00.get();
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        } else {
            rect.setEmpty();
        }
    }

    public C71263Hn(View view) {
        this.A00 = new WeakReference(view);
    }
}
