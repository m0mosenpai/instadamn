package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;

/* renamed from: X.5jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124435jz extends AbstractC87043uM {
    public static final Matrix A00 = new Matrix();
    public static final int[] A03 = new int[2];
    public static final RectF A02 = new RectF();
    public static final Rect A01 = new Rect();

    @Override // X.AbstractC87043uM
    public final int A01(float f, float f2) {
        for (BEd bEd : ((InteractiveDrawableContainer) this.A02).getInteractiveDrawables()) {
            C9LJ c9lj = (C9LJ) bEd;
            if (c9lj.A0O && c9lj.A0N && bEd.AJl(f, f2) == 0) {
                return c9lj.A0f;
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.AbstractC87043uM
    public final void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        View view = this.A02;
        Iterator it = ((InteractiveDrawableContainer) view).getInteractiveDrawables().iterator();
        while (it.hasNext()) {
            C9LJ c9lj = (C9LJ) ((BEd) it.next());
            if (c9lj.A0O && c9lj.A0N) {
                accessibilityNodeInfoCompat.mInfo.addChild(view, c9lj.A0f);
            }
        }
    }

    @Override // X.AbstractC87043uM
    public final void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        View view = this.A02;
        InteractiveDrawableContainer interactiveDrawableContainer = (InteractiveDrawableContainer) view;
        for (BEd bEd : interactiveDrawableContainer.getInteractiveDrawables()) {
            C9LJ c9lj = (C9LJ) bEd;
            if (c9lj.A0O && c9lj.A0N && c9lj.A0f == i) {
                Matrix matrix = A00;
                bEd.CAX(matrix);
                RectF rectF = A02;
                rectF.set(c9lj.A0B.getBounds());
                matrix.mapRect(rectF);
                interactiveDrawableContainer.getLocationOnScreen(A03);
                rectF.offset(r3[0] + interactiveDrawableContainer.getPaddingLeft(), r3[1] + interactiveDrawableContainer.getPaddingTop());
                Rect rect = A01;
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                CharSequence charSequence = c9lj.A0F;
                if (charSequence == null) {
                    charSequence = interactiveDrawableContainer.getResources().getString(2131974409);
                }
                accessibilityNodeInfoCompat.setParent(view);
                accessibilityNodeInfoCompat.setContentDescription(charSequence);
                accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.setEnabled(true);
                return;
            }
        }
    }
}
