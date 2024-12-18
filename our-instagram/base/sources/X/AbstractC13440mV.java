package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0mV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13440mV {
    public static List A00;

    public static final int A02(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = context.getDisplay();
            C14360o3.A07(display);
            DisplayCutout cutout = display.getCutout();
            if (cutout != null) {
                return cutout.getSafeInsetTop();
            }
        }
        return 0;
    }

    public static final void A06(WindowManager.LayoutParams layoutParams, int i) {
        C14360o3.A0B(layoutParams, 0);
        if (AbstractC677133l.A00()) {
            i = 3;
        }
        layoutParams.layoutInDisplayCutoutMode = i;
    }

    public static final int A00() {
        List<Rect> list = A00;
        int i = 0;
        if (list != null) {
            for (Rect rect : list) {
                if (rect.height() > i) {
                    i = rect.height();
                }
            }
        }
        return i;
    }

    public static final int A01() {
        List<Rect> list = A00;
        int i = 0;
        if (list != null) {
            for (Rect rect : list) {
                if (rect.top == 0 && rect.height() > i) {
                    i = rect.height();
                }
            }
        }
        return i;
    }

    public static final void A03(Context context) {
        List<Rect> emptyList;
        Display display = context.getDisplay();
        C14360o3.A07(display);
        DisplayCutout cutout = display.getCutout();
        if (cutout != null) {
            emptyList = cutout.getBoundingRects();
        } else {
            emptyList = Collections.emptyList();
        }
        A00 = emptyList;
    }

    public static final void A04(View view) {
        List<Rect> emptyList;
        DisplayCutout displayCutout;
        if (view.isAttachedToWindow()) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                emptyList = displayCutout.getBoundingRects();
            } else {
                emptyList = Collections.emptyList();
            }
            A00 = emptyList;
            return;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0mU
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                List<Rect> emptyList2;
                DisplayCutout displayCutout2;
                C14360o3.A0B(view2, 0);
                WindowInsets rootWindowInsets2 = view2.getRootWindowInsets();
                if (rootWindowInsets2 != null && (displayCutout2 = rootWindowInsets2.getDisplayCutout()) != null) {
                    emptyList2 = displayCutout2.getBoundingRects();
                } else {
                    emptyList2 = Collections.emptyList();
                }
                AbstractC13440mV.A00 = emptyList2;
                view2.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
            }
        });
    }

    public static final void A05(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        C14360o3.A07(attributes);
        A06(attributes, 1);
    }

    public static final boolean A07() {
        if (A01() <= 0) {
            return false;
        }
        return true;
    }
}
