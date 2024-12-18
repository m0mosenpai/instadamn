package X;

import android.content.res.ColorStateList;
import android.widget.CompoundButton;

/* loaded from: classes11.dex */
public interface XEP {
    int getMeasuredHeight();

    int getMeasuredWidth();

    void measure(int i, int i2);

    void setChecked(boolean z);

    void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener);

    void setThumbScale(float f);

    void setThumbTintList(ColorStateList colorStateList);
}
