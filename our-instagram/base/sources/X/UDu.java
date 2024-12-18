package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDu extends SwitchCompat implements X9f {
    public UvI A00;
    public final CompoundButton.OnCheckedChangeListener A01;

    @Override // X.X9f
    public void setViewModel(UvI uvI) {
        this.A00 = uvI;
        Object A02 = uvI.A05.A02();
        A02.getClass();
        setChecked(((Boolean) A02).booleanValue());
        setEnabled(this.A00.A08);
        setText(this.A00.A00);
        setTextColor(C2FP.A0A().A02(getContext(), 0));
        setOnCheckedChangeListener(this.A01);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDu(Context context) {
        super(new ContextThemeWrapper(context, R.style.Switch), null);
        C2FP.A0E();
        this.A01 = new C70265WOs(this, 1);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        setClickable(z);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        setAlpha(f);
    }
}
