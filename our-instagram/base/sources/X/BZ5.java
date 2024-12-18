package X;

import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* loaded from: classes5.dex */
public final class BZ5 extends EditText {
    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final int getAutofillType() {
        return super.getAutofillType();
    }

    @Override // android.view.View
    public final void invalidate() {
        C0f9.A0A(-803244546, C0f9.A03(-550975839));
    }
}
