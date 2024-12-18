package X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.litho.LithoView;

/* loaded from: classes5.dex */
public abstract class CL5 {
    public static final void A00(C2XE c2xe, CVV cvv, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, int i3) {
        View BV3;
        LithoView lithoView;
        C50882Vk mountedLayoutState;
        String str;
        C14360o3.A0B(c2xe, 1);
        LithoView lithoView2 = new LithoView(c2xe, (AttributeSet) null);
        PopupWindow popupWindow = new PopupWindow(lithoView2);
        lithoView2.setComponent((AbstractC50812Vc) interfaceC16660sJ.invoke(popupWindow));
        DisplayMetrics A0K = AbstractC167007dF.A0K(c2xe.A0C);
        int i4 = A0K.widthPixels;
        int i5 = AbstractC75953b0.A00;
        lithoView2.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(A0K.heightPixels, Integer.MIN_VALUE));
        popupWindow.setWidth(lithoView2.getMeasuredWidth());
        popupWindow.setHeight(lithoView2.getMeasuredHeight());
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setInputMethodMode(2);
        popupWindow.setOnDismissListener(new C23287ATy(interfaceC16820sZ, 2));
        C51322Xf c51322Xf = cvv.A00;
        DTU dtu = new DTU(popupWindow, cvv, i2, i3, i, 4);
        C14360o3.A0B(c51322Xf, 1);
        C2VL c2vl = c51322Xf.A00;
        if (c2vl != null && (BV3 = c2vl.BV3()) != null && (BV3 instanceof LithoView) && (mountedLayoutState = (lithoView = (LithoView) BV3).getMountedLayoutState()) != null) {
            C2XV.A00();
            Object obj = mountedLayoutState.A0T.get(c51322Xf);
            if (obj == null) {
                AbstractC50812Vc abstractC50812Vc = c2xe.A01;
                if (abstractC50812Vc == null || (str = abstractC50812Vc.A0H()) == null) {
                    str = "null";
                }
                Integer num = C05F.A01;
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Cannot find a component with handle ");
                A1C.append(c51322Xf);
                A1C.append(" to use as anchor.\nComponent: ");
                C2YE.A01("LithoTooltipController:InvalidHandle", num, AbstractC166997dE.A0x(str, A1C));
                return;
            }
            dtu.invoke(lithoView, obj);
        }
    }
}
