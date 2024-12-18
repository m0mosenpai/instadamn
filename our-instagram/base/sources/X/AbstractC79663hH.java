package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Locale;

/* renamed from: X.3hH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC79663hH {
    public static final boolean A00(Rect rect, C1LL c1ll, Object obj, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (c1ll != null && c1ll.isTracing()) {
            z2 = true;
            c1ll.ADO("applyBoundsToMountContent");
        } else {
            z2 = false;
        }
        try {
            if (obj instanceof View) {
                View view = (View) obj;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (rect != null && !(view instanceof C2WS)) {
                    view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                }
                if (z || view.getMeasuredHeight() != i6 || view.getMeasuredWidth() != i5) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(i5, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(i6, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                }
                z3 = false;
                if (z || view.getLeft() != i || view.getTop() != i2 || view.getRight() != i3 || view.getBottom() != i4) {
                    try {
                        view.layout(i, i2, i3, i4);
                    } catch (NullPointerException unused) {
                        String str = Build.BRAND;
                        C14360o3.A08(str);
                        Locale locale = Locale.US;
                        C14360o3.A08(locale);
                        String lowerCase = str.toLowerCase(locale);
                        C14360o3.A07(lowerCase);
                        if ("huawei".equals(lowerCase)) {
                        }
                    }
                    z3 = true;
                }
            } else if (obj instanceof Drawable) {
                if (rect != null) {
                    i += rect.left;
                    i2 += rect.top;
                    i3 -= rect.right;
                    i4 -= rect.bottom;
                }
                Drawable drawable = (Drawable) obj;
                Rect bounds = drawable.getBounds();
                C14360o3.A07(bounds);
                drawable.setBounds(i, i2, i3, i4);
                if (bounds.left == i && bounds.top == i2 && bounds.right == i3 && bounds.bottom == i4) {
                    z3 = false;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported mounted content ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            return z3;
        } finally {
            if (z2 && c1ll != null) {
                c1ll.ASb();
            }
        }
    }

    public static final boolean A01(RenderTreeNode renderTreeNode, C1LL c1ll, Object obj, boolean z) {
        Rect rect = renderTreeNode.A03;
        return A00(renderTreeNode.A04, c1ll, obj, rect.left, rect.top, rect.right, rect.bottom, z);
    }
}
