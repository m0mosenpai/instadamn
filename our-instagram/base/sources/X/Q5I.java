package X;

import android.content.Context;
import android.widget.ListPopupWindow;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class Q5I extends ListPopupWindow {
    public Context A00;
    public InterfaceC65339TiK A01;
    public ArrayList A02;
    public boolean A03;
    public Q50 A04;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r4 < r0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(int r9) {
        /*
            r8 = this;
            r0 = 1
            r8.setModal(r0)
            android.content.Context r3 = r8.A00
            android.content.res.Resources r0 = r3.getResources()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r9)
            r8.setBackgroundDrawable(r0)
            r0 = 2
            r8.setInputMethodMode(r0)
            java.util.ArrayList r2 = r8.A02
            X.TiK r1 = r8.A01
            X.Q50 r0 = new X.Q50
            r0.<init>(r3, r1, r2)
            r8.A04 = r0
            r8.setAdapter(r0)
            X.Q50 r7 = r8.A04
            boolean r0 = r8.A03
            if (r0 == 0) goto L3f
            android.content.Context r2 = r8.A00
            r1 = 1131413504(0x43700000, float:240.0)
            java.util.regex.Pattern r0 = X.SUV.A01
            android.util.DisplayMetrics r0 = X.AbstractC167007dF.A0K(r2)
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r4 = (int) r1
        L3a:
            r0 = r4
        L3b:
            r8.setContentWidth(r0)
            return
        L3f:
            r6 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            int r2 = r7.getCount()
            r4 = 0
        L4d:
            if (r6 >= r2) goto L64
            r0 = 0
            android.view.View r1 = r7.getView(r6, r0, r0)
            r1.measure(r5, r3)
            int r0 = r1.getMeasuredWidth()
            if (r0 <= r4) goto L61
            int r4 = r1.getMeasuredWidth()
        L61:
            int r6 = r6 + 1
            goto L4d
        L64:
            android.content.Context r3 = r8.A00
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = r0 * 2
            android.util.DisplayMetrics r0 = X.AbstractC167007dF.A0K(r3)
            int r2 = r0.widthPixels
            int r2 = r2 - r1
            int r4 = r4 + r1
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165283(0x7f070063, float:1.7944779E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r4 <= r2) goto L8a
            r0 = r2
            goto L3b
        L8a:
            if (r4 >= r0) goto L3a
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q5I.A01(int):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Q5I, android.widget.ListPopupWindow] */
    public static Q5I A00(Context context, InterfaceC65339TiK interfaceC65339TiK, ArrayList arrayList, boolean z) {
        ?? listPopupWindow = new ListPopupWindow(context);
        listPopupWindow.A02 = arrayList;
        listPopupWindow.A00 = context;
        listPopupWindow.A01 = interfaceC65339TiK;
        listPopupWindow.A03 = z;
        return listPopupWindow;
    }
}
