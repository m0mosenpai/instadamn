package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.instagram.direct.visual.DirectVisualMessageViewerController;

/* loaded from: classes8.dex */
public final class LRL implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public LRL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                if (i != 4) {
                    return false;
                }
                LYZ lyz = (LYZ) this.A01;
                if (!lyz.A08()) {
                    return false;
                }
                LYZ.A03(lyz);
                return true;
            case 1:
                if (i != 4 || !DirectVisualMessageViewerController.A0Q(null, (DirectVisualMessageViewerController) this.A01)) {
                    return false;
                }
                return true;
            default:
                if (i == 6 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
                    C44723Jr6 c44723Jr6 = (C44723Jr6) this.A01;
                    int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    c44723Jr6.A02.invoke(AbstractC167007dF.A0g(c44723Jr6.A00));
                    return false;
                }
                return false;
        }
    }
}
