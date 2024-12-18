package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;

/* renamed from: X.3gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79503gx implements InterfaceC79483gv {
    @Override // X.InterfaceC79483gv
    public final float AX6(C51292Xc c51292Xc) {
        C14360o3.A0B(c51292Xc, 0);
        return c51292Xc.A02.width();
    }

    @Override // X.InterfaceC79483gv
    public final float AX7(Object obj) {
        int width;
        C14360o3.A0B(obj, 0);
        if (obj instanceof View) {
            width = ((View) obj).getWidth();
        } else if (obj instanceof Drawable) {
            width = ((Drawable) obj).getBounds().width();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Getting width from unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        return width;
    }

    @Override // X.InterfaceC79483gv
    public final void EJZ(Object obj) {
    }

    @Override // X.InterfaceC79483gv
    public final void EOy(Object obj, float f) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof C2WS) {
            if (obj instanceof InterfaceC51062Wc) {
                ((InterfaceC51062Wc) obj).setAnimatedWidth((int) f);
            } else {
                View view = (View) obj;
                int left = view.getLeft();
                AbstractC79663hH.A00(null, null, obj, left, view.getTop(), (int) (left + f), view.getBottom(), false);
            }
            C2WS c2ws = (C2WS) obj;
            ArrayList A03 = AbstractC79463gt.A03(c2ws);
            if (A03 != null) {
                int i = (int) f;
                int height = c2ws.getHeight();
                int size = A03.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC89913zX.A00((Drawable) A03.get(i2), i, height);
                }
                return;
            }
            return;
        }
        if (obj instanceof View) {
            View view2 = (View) obj;
            int left2 = view2.getLeft();
            AbstractC79663hH.A00(null, null, obj, left2, view2.getTop(), (int) (left2 + f), view2.getBottom(), false);
            return;
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            AbstractC89913zX.A00(drawable, (int) f, drawable.getBounds().height());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting width on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    @Override // X.InterfaceC79483gv
    public final String getName() {
        return IgReactMediaPickerNativeModule.WIDTH;
    }
}
