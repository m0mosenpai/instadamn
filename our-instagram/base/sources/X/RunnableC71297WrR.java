package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: X.WrR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71297WrR implements Runnable {
    public final /* synthetic */ AbstractC70175WEx A00;

    public RunnableC71297WrR(AbstractC70175WEx abstractC70175WEx) {
        this.A00 = abstractC70175WEx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        AbstractC70175WEx abstractC70175WEx = this.A00;
        UBZ ubz = abstractC70175WEx.A09;
        if (ubz != null && (context = abstractC70175WEx.A06) != null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            int[] iArr = new int[2];
            ubz.getLocationOnScreen(iArr);
            int height = (i - (iArr[1] + ubz.getHeight())) + ((int) ubz.getTranslationY());
            if (height < abstractC70175WEx.A00) {
                ViewGroup.LayoutParams layoutParams = ubz.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    android.util.Log.w("BaseTransientBottomBar", "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += abstractC70175WEx.A00 - height;
                ubz.requestLayout();
            }
        }
    }
}
