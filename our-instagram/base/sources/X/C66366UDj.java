package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: X.UDj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66366UDj extends ContentFrameLayout {
    public final /* synthetic */ LayoutInflaterFactory2C52042a4 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66366UDj(Context context, LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4) {
        super(context);
        this.A00 = layoutInflaterFactory2C52042a4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.A00.A0b(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflaterFactory2C52042a4 layoutInflaterFactory2C52042a4 = this.A00;
                layoutInflaterFactory2C52042a4.A0Y(layoutInflaterFactory2C52042a4.A0S(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(C71x.A00(getContext(), i));
    }
}
