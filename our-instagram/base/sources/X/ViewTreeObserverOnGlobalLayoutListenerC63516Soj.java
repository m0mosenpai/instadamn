package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.Soj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC63516Soj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A03;
    public final Rect A04;
    public final /* synthetic */ Q59 A05;
    public boolean A02 = false;
    public int A01 = 0;
    public int A00 = 0;

    public ViewTreeObserverOnGlobalLayoutListenerC63516Soj(Q59 q59) {
        this.A05 = q59;
        C63356SiD.A04(q59.getContext().getApplicationContext());
        this.A04 = AbstractC166987dD.A0U();
        this.A03 = (int) WF1.A01(60.0f);
    }

    private void A01() {
        boolean isVisible;
        WritableNativeMap A00;
        String str;
        Q59 q59 = this.A05;
        View rootView = q59.getRootView();
        Rect rect = this.A04;
        rootView.getWindowVisibleDisplayFrame(rect);
        WindowInsets rootWindowInsets = q59.getRootView().getRootWindowInsets();
        if (rootWindowInsets != null && (isVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime())) != this.A02) {
            this.A02 = isVisible;
            if (isVisible) {
                int i = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
                ViewGroup.LayoutParams layoutParams = q59.getRootView().getLayoutParams();
                AbstractC05810Sj.A02(layoutParams instanceof WindowManager.LayoutParams);
                int i2 = ((WindowManager.LayoutParams) layoutParams).softInputMode;
                int i3 = rect.bottom;
                if (i2 == 48) {
                    i3 -= i;
                }
                A00 = A00(AbstractC58321PtD.A00(i3), AbstractC58321PtD.A00(rect.left), AbstractC58321PtD.A00(rect.width()), AbstractC58321PtD.A00(i));
                str = "keyboardDidShow";
            } else {
                A00 = A00(AbstractC58321PtD.A00(rect.height()), 0.0d, AbstractC58321PtD.A00(rect.width()), 0.0d);
                str = "keyboardDidHide";
            }
            if (q59.A05 != null) {
                q59.getCurrentReactContext().A0E(str, A00);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onGlobalLayout() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC63516Soj.onGlobalLayout():void");
    }

    public static WritableNativeMap A00(double d, double d2, double d3, double d4) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        WritableNativeMap A0c2 = AbstractC58321PtD.A0c();
        A0c2.putDouble(IgReactMediaPickerNativeModule.HEIGHT, d4);
        A0c2.putDouble("screenX", d2);
        A0c2.putDouble(IgReactMediaPickerNativeModule.WIDTH, d3);
        A0c2.putDouble("screenY", d);
        A0c.putMap("endCoordinates", A0c2);
        A0c.putString("easing", "keyboard");
        A0c.putDouble("duration", 0.0d);
        return A0c;
    }
}
