package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes11.dex */
public final class U6W extends FrameLayout implements XEP {
    public final SwitchCompat A00;

    @Override // X.XEP
    public void setChecked(boolean z) {
        this.A00.setChecked(z);
    }

    @Override // X.XEP
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A00.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        this.A00.setTag(obj);
    }

    @Override // X.XEP
    public void setThumbScale(float f) {
        Drawable drawable;
        Drawable drawable2;
        C66267U6l c66267U6l;
        SwitchCompat switchCompat = this.A00;
        Drawable drawable3 = switchCompat.A0A;
        if (f != 1.0f && !(drawable3 instanceof C66267U6l)) {
            C14360o3.A0A(drawable3);
            drawable = new C66267U6l(drawable3);
        } else {
            if (f == 1.0f && (drawable3 instanceof C66267U6l)) {
                drawable = ((C66267U6l) drawable3).A01;
            }
            drawable2 = switchCompat.A0A;
            if (!(drawable2 instanceof C66267U6l) && (c66267U6l = (C66267U6l) drawable2) != null) {
                boolean z = !AbstractC167007dF.A1N((c66267U6l.A00 > f ? 1 : (c66267U6l.A00 == f ? 0 : -1)));
                c66267U6l.A00 = f;
                if (z) {
                    Rect bounds = c66267U6l.getBounds();
                    C14360o3.A07(bounds);
                    c66267U6l.onBoundsChange(bounds);
                    return;
                }
                return;
            }
        }
        switchCompat.setThumbDrawable(drawable);
        drawable2 = switchCompat.A0A;
        if (!(drawable2 instanceof C66267U6l)) {
        }
    }

    @Override // X.XEP
    public void setThumbTintList(ColorStateList colorStateList) {
        this.A00.setThumbTintList(colorStateList);
    }

    public U6W(Context context) {
        super(context);
        SwitchCompat switchCompat = new SwitchCompat(context, null);
        this.A00 = switchCompat;
        addView(switchCompat, -2, -2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A00.setEnabled(z);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.A00.setTag(i, obj);
    }
}
