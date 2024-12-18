package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sok, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnPreDrawListenerC63517Sok implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference A00;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        int i2;
        android.util.Log.isLoggable("ViewTarget", 2);
        SWT swt = (SWT) this.A00.get();
        if (swt != null) {
            List list = swt.A02;
            if (!list.isEmpty()) {
                View view = swt.A01;
                int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    i = layoutParams.width;
                } else {
                    i = 0;
                }
                int A00 = SWT.A00(swt, view.getWidth(), i, paddingLeft);
                int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    i2 = layoutParams2.height;
                } else {
                    i2 = 0;
                }
                int A002 = SWT.A00(swt, view.getHeight(), i2, paddingTop);
                if (A00 > 0 || A00 == Integer.MIN_VALUE) {
                    if (A002 > 0 || A002 == Integer.MIN_VALUE) {
                        Iterator it = AbstractC166987dD.A1F(list).iterator();
                        while (it.hasNext()) {
                            ((C63876SvA) it.next()).A03(A00, A002);
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(swt.A00);
                        }
                        swt.A00 = null;
                        list.clear();
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC63517Sok(SWT swt) {
        this.A00 = AbstractC25225BEi.A16(swt);
    }
}
