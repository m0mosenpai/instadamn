package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDY extends C128955sF implements InterfaceC71935XBk {
    public final /* synthetic */ WPV A00;

    @Override // X.InterfaceC71935XBk
    public final boolean CsB() {
        return false;
    }

    @Override // X.InterfaceC71935XBk
    public final boolean CsC() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDY(Context context, WPV wpv) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.A00 = wpv;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new C66369UDm(this, this, wpv));
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A04();
        }
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
