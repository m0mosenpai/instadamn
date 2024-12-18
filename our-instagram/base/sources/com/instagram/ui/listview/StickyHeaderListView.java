package com.instagram.ui.listview;

import X.AbstractC60622pl;
import X.C0f9;
import X.C1I2;
import X.InterfaceC60132ov;
import X.ViewOnTouchListenerC60632pm;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;

/* loaded from: classes2.dex */
public class StickyHeaderListView extends FrameLayout {
    public ViewOnTouchListenerC60632pm A00;
    public final Rect A01;
    public final Rect A02;

    private float getContentPosition() {
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A00;
        if (viewOnTouchListenerC60632pm == null) {
            return 0.0f;
        }
        return viewOnTouchListenerC60632pm.A00 - viewOnTouchListenerC60632pm.A01;
    }

    public Rect getTopChromeArea() {
        Rect rect = this.A01;
        if (rect.height() == 0) {
            getGlobalVisibleRect(rect);
        }
        Rect rect2 = this.A02;
        rect2.top = rect.top;
        rect2.bottom = rect.top + Math.round(getContentPosition());
        rect2.left = rect.left;
        rect2.right = rect.left + getWidth();
        return rect2;
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Rect();
        this.A01 = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        Fragment A0O;
        Context context = getContext();
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = null;
        if ((context instanceof FragmentActivity) && (A0O = ((FragmentActivity) context).getSupportFragmentManager().A0O(R.id.layout_container_main)) != 0 && AbstractC60622pl.A01(A0O)) {
            viewOnTouchListenerC60632pm = ((InterfaceC60132ov) A0O).BDY();
        }
        this.A00 = viewOnTouchListenerC60632pm;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(599425621);
        super.onAttachedToWindow();
        A00();
        C0f9.A0D(580546913, A06);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        int A06 = C0f9.A06(-1974584638);
        super.onFinishInflate();
        A00();
        C0f9.A0D(47742888, A06);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm) {
        this(context, attributeSet);
        this.A00 = viewOnTouchListenerC60632pm;
    }
}
