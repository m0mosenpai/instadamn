package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79473gu implements InterfaceC79483gv {
    @Override // X.InterfaceC79483gv
    public final float AX6(C51292Xc c51292Xc) {
        C14360o3.A0B(c51292Xc, 0);
        return c51292Xc.A02.left;
    }

    @Override // X.InterfaceC79483gv
    public final float AX7(Object obj) {
        C14360o3.A0B(obj, 0);
        if ((obj instanceof C2WS) && (obj instanceof InterfaceC51062Wc)) {
            return ((View) obj).getX();
        }
        if (obj instanceof View) {
            return AbstractC79463gt.A00((View) obj, true);
        }
        if (obj instanceof Drawable) {
            return r3.getBounds().left + AbstractC79463gt.A00(AbstractC79463gt.A01((Drawable) obj), true);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Getting X from unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // X.InterfaceC79483gv
    public final void EJZ(Object obj) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setTranslationX(0.0f);
        }
    }

    @Override // X.InterfaceC79483gv
    public final void EOy(Object obj, float f) {
        View view;
        View view2;
        C14360o3.A0B(obj, 0);
        if ((obj instanceof C2WS) && (obj instanceof InterfaceC51062Wc)) {
            view = (View) obj;
        } else if (obj instanceof View) {
            view = (View) obj;
            Object parent = view.getParent();
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            f -= AbstractC79463gt.A00(view2, true);
        } else {
            if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                int A00 = (int) (f - AbstractC79463gt.A00(AbstractC79463gt.A01(drawable), true));
                int i = drawable.getBounds().top;
                Rect bounds = drawable.getBounds();
                C14360o3.A07(bounds);
                drawable.setBounds(A00, i, bounds.width() + A00, bounds.height() + i);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Setting X on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        view.setX(f);
    }

    @Override // X.InterfaceC79483gv
    public final String getName() {
        return "x";
    }
}
