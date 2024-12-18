package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.instagram.creation.capture.quickcapture.colourpicker.ColorPalette;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8DI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DI extends AbstractC87043uM {
    public static final int[] A02 = new int[2];
    public static final RectF A01 = new RectF();
    public static final Rect A00 = new Rect();

    @Override // X.AbstractC87043uM
    public final void A03(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        C14360o3.A0B(accessibilityNodeInfoCompat, 0);
        ColorPalette colorPalette = (ColorPalette) this.A02;
        if (colorPalette != null) {
            ArrayList arrayList = colorPalette.A0F;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ACO) arrayList.get(i)).A08) {
                    accessibilityNodeInfoCompat.mInfo.addChild(colorPalette, i);
                }
            }
        }
    }

    @Override // X.AbstractC87043uM
    public final void A04(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
        ColorPalette colorPalette = (ColorPalette) this.A02;
        if (colorPalette != null) {
            ArrayList arrayList = colorPalette.A0F;
            if (i < arrayList.size() && i >= 0) {
                ACO aco = (ACO) arrayList.get(i);
                colorPalette.getLocationInWindow(A02);
                RectF rectF = A01;
                rectF.set(aco.A05);
                rectF.offset(r3[0], r3[1]);
                Rect rect = A00;
                rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                Resources resources = colorPalette.getResources();
                accessibilityNodeInfoCompat.setParent(colorPalette);
                Number number = (Number) C8DA.A06.get(Integer.valueOf(aco.A07.A00));
                if (number == null) {
                    number = 2131956420;
                }
                accessibilityNodeInfoCompat.setContentDescription(resources.getString(number.intValue()));
                accessibilityNodeInfoCompat.setRoleDescription(resources.getString(2131954438));
                accessibilityNodeInfoCompat.mInfo.setBoundsInScreen(rect);
                accessibilityNodeInfoCompat.mInfo.setVisibleToUser(true);
                accessibilityNodeInfoCompat.mInfo.setFocusable(true);
                accessibilityNodeInfoCompat.setClickable(true);
                accessibilityNodeInfoCompat.setEnabled(true);
            }
        }
    }

    @Override // X.AbstractC87043uM
    public final int A01(float f, float f2) {
        ColorPalette colorPalette = (ColorPalette) this.A02;
        int i = Integer.MIN_VALUE;
        if (colorPalette != null) {
            Iterator it = colorPalette.A0F.iterator();
            while (it.hasNext()) {
                ACO aco = (ACO) it.next();
                if (aco.A01(f, f2)) {
                    i = aco.A07.A00;
                }
            }
        }
        return i;
    }
}
