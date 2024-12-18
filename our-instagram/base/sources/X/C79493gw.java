package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.3gw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79493gw implements InterfaceC79483gv {
    @Override // X.InterfaceC79483gv
    public final float AX6(C51292Xc c51292Xc) {
        C14360o3.A0B(c51292Xc, 0);
        return c51292Xc.A02.top;
    }

    @Override // X.InterfaceC79483gv
    public final float AX7(Object obj) {
        C14360o3.A0B(obj, 0);
        if ((obj instanceof C2WS) && (obj instanceof InterfaceC51062Wc)) {
            return ((View) obj).getY();
        }
        if (obj instanceof View) {
            return AbstractC79463gt.A00((View) obj, false);
        }
        if (obj instanceof Drawable) {
            return r3.getBounds().top + AbstractC79463gt.A00(AbstractC79463gt.A01((Drawable) obj), false);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Getting Y from unsupported mount content: ");
        sb.append(obj);
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // X.InterfaceC79483gv
    public final void EJZ(Object obj) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof View) {
            ((View) obj).setTranslationY(0.0f);
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
            f -= AbstractC79463gt.A00(view2, false);
        } else {
            if (obj instanceof Drawable) {
                Drawable drawable = (Drawable) obj;
                float A00 = AbstractC79463gt.A00(AbstractC79463gt.A01(drawable), false);
                int i = drawable.getBounds().left;
                int i2 = (int) (f - A00);
                Rect bounds = drawable.getBounds();
                C14360o3.A07(bounds);
                drawable.setBounds(i, i2, bounds.width() + i, bounds.height() + i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Setting Y on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        view.setY(f);
    }

    @Override // X.InterfaceC79483gv
    public final String getName() {
        return "y";
    }
}
