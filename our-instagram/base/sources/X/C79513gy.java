package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;

/* renamed from: X.3gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79513gy implements InterfaceC79483gv {
    @Override // X.InterfaceC79483gv
    public final float AX6(C51292Xc c51292Xc) {
        C14360o3.A0B(c51292Xc, 0);
        return c51292Xc.A02.height();
    }

    @Override // X.InterfaceC79483gv
    public final float AX7(Object obj) {
        int height;
        C14360o3.A0B(obj, 0);
        if (obj instanceof View) {
            height = ((View) obj).getHeight();
        } else if (obj instanceof Drawable) {
            height = ((Drawable) obj).getBounds().height();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Getting height from unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        return height;
    }

    @Override // X.InterfaceC79483gv
    public final void EJZ(Object obj) {
    }

    @Override // X.InterfaceC79483gv
    public final void EOy(Object obj, float f) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof C2WS) {
            if (obj instanceof InterfaceC51062Wc) {
                ((InterfaceC51062Wc) obj).setAnimatedHeight((int) f);
            } else {
                View view = (View) obj;
                int top = view.getTop();
                AbstractC79663hH.A00(null, null, obj, view.getLeft(), top, view.getRight(), (int) (top + f), false);
            }
            C2WS c2ws = (C2WS) obj;
            ArrayList A03 = AbstractC79463gt.A03(c2ws);
            if (A03 != null) {
                int width = c2ws.getWidth();
                int i = (int) f;
                int size = A03.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC89913zX.A00((Drawable) A03.get(i2), width, i);
                }
                return;
            }
            return;
        }
        if (obj instanceof View) {
            View view2 = (View) obj;
            int top2 = view2.getTop();
            AbstractC79663hH.A00(null, null, obj, view2.getLeft(), top2, view2.getRight(), (int) (top2 + f), false);
            return;
        }
        if (obj instanceof Drawable) {
            Drawable drawable = (Drawable) obj;
            AbstractC89913zX.A00(drawable, drawable.getBounds().width(), (int) f);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting height on unsupported mount content: ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    @Override // X.InterfaceC79483gv
    public final String getName() {
        return IgReactMediaPickerNativeModule.HEIGHT;
    }
}
