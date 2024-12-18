package X;

import android.text.Layout;
import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.FpX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC35697FpX implements View.OnLayoutChangeListener {
    public final /* synthetic */ IgdsButton A00;
    public final /* synthetic */ C1569673a A01;

    public ViewOnLayoutChangeListenerC35697FpX(IgdsButton igdsButton, C1569673a c1569673a) {
        this.A00 = igdsButton;
        this.A01 = c1569673a;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Layout textViewLayout = ((IgdsButton) view).getTextViewLayout();
        if (textViewLayout.getLineCount() > 0 && textViewLayout.getEllipsisCount(0) > 0) {
            this.A00.setText(C1569673a.A00(this.A01, true));
        }
    }
}
