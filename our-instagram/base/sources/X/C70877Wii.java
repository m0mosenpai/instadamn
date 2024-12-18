package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.facebook.R;

/* renamed from: X.Wii, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70877Wii implements C8S3 {
    public int A00;
    public int A01;
    public View A02;
    public PopupWindow A03;
    public C3PF A04;
    public InterfaceC25191BCo A05;
    public final Context A06;
    public final int A07;
    public final Runnable A08 = new RunnableC71344WsC(this);

    @Override // X.C8S3
    public final void EkD(View view, InterfaceC25191BCo interfaceC25191BCo, int i, boolean z) {
        if (this.A03 == null) {
            View inflate = LayoutInflater.from(this.A06).inflate(R.layout.item_menu, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, false);
            this.A03 = popupWindow;
            popupWindow.setAnimationStyle(R.style.ItemMenuAnimationStyle);
            PopupWindow popupWindow2 = this.A03;
            if (popupWindow2 != null) {
                popupWindow2.setOutsideTouchable(true);
            }
            View requireViewById = inflate.requireViewById(R.id.trash_can);
            this.A02 = requireViewById;
            if (requireViewById != null) {
                C3P9 c3p9 = new C3P9(requireViewById);
                c3p9.A07 = true;
                c3p9.A04 = new C68003V5v(this, 7);
                this.A04 = c3p9.A00();
                inflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                this.A01 = inflate.getMeasuredWidth();
                this.A00 = inflate.getMeasuredHeight();
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        CMI();
        this.A05 = interfaceC25191BCo;
        View view2 = this.A02;
        if (view2 != null) {
            view2.setVisibility(0);
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            ViewOnTouchListenerC70251WNw viewOnTouchListenerC70251WNw = new ViewOnTouchListenerC70251WNw(6, rect, this);
            PopupWindow popupWindow3 = this.A03;
            if (popupWindow3 != null) {
                View contentView = popupWindow3.getContentView();
                if (contentView != null) {
                    contentView.setOnTouchListener(viewOnTouchListenerC70251WNw);
                    popupWindow3.setTouchInterceptor(viewOnTouchListenerC70251WNw);
                    popupWindow3.showAtLocation(view, 51, rect.centerX() - (this.A01 / 2), (rect.top - this.A07) - this.A00);
                    View contentView2 = popupWindow3.getContentView();
                    Runnable runnable = this.A08;
                    contentView2.removeCallbacks(runnable);
                    popupWindow3.getContentView().postDelayed(runnable, 3000L);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C8S3
    public final boolean CdI() {
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null && popupWindow.isShowing()) {
            return true;
        }
        return false;
    }

    public C70877Wii(Context context) {
        this.A06 = context;
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
    }

    @Override // X.C8S3
    public final boolean CMI() {
        View contentView;
        if (CdI()) {
            PopupWindow popupWindow = this.A03;
            if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
                contentView.removeCallbacks(this.A08);
                PopupWindow popupWindow2 = this.A03;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                    return true;
                }
                return true;
            }
            throw AbstractC166997dE.A0g();
        }
        return false;
    }
}
