package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.2mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58962mu implements InterfaceC58972mv {
    public static final WeakHashMap A01 = new WeakHashMap();
    public final WeakReference A00;

    @Override // X.InterfaceC58972mv
    public final boolean CGl(Rect rect, Rect rect2, Rect rect3) {
        C14360o3.A0B(rect, 0);
        C14360o3.A0B(rect2, 1);
        C14360o3.A0B(rect3, 2);
        View view = (View) this.A00.get();
        if (view != null) {
            Point point = C3QW.A00;
            if (!view.isShown()) {
                rect.setEmpty();
                rect2.setEmpty();
            } else {
                Point point2 = C3QW.A00;
                if (view.getGlobalVisibleRect(rect, point2) && rect.intersect(rect3)) {
                    int i = point2.x;
                    rect2.set(i, point2.y, i + view.getWidth(), point2.y + view.getHeight());
                    return true;
                }
                rect2.setEmpty();
                rect.setEmpty();
                return false;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (obj != this) {
            return obj != null && C14360o3.A0K(obj.getClass(), getClass()) && (obj2 = this.A00.get()) != null && obj2 == ((C58962mu) obj).A00.get();
        }
        return true;
    }

    @Override // X.InterfaceC58972mv
    public final Context getContext() {
        View view = (View) this.A00.get();
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    public final int hashCode() {
        Object obj = this.A00.get();
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public C58962mu(View view) {
        this.A00 = new WeakReference(view);
    }
}
