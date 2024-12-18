package androidx.preference;

import X.AbstractC63040SbG;
import X.AbstractC65702TsY;
import X.AbstractC68645VZd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.R;

/* loaded from: classes11.dex */
public abstract class DialogPreference extends Preference {
    public int A00;
    public Drawable A01;
    public CharSequence A02;
    public CharSequence A03;
    public CharSequence A04;
    public CharSequence A05;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC68645VZd.A02, i, 0);
        String A0W = AbstractC65702TsY.A0W(obtainStyledAttributes, 9, 0);
        this.A03 = A0W;
        if (A0W == null) {
            this.A03 = this.A0C;
        }
        this.A02 = AbstractC65702TsY.A0W(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.A01 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.A05 = AbstractC65702TsY.A0W(obtainStyledAttributes, 11, 3);
        this.A04 = AbstractC65702TsY.A0W(obtainStyledAttributes, 10, 4);
        this.A00 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC63040SbG.A00(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
