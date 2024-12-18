package X;

import android.text.Layout;
import android.util.SparseIntArray;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes11.dex */
public abstract class VL3 {
    public static final boolean A00(C6FQ c6fq, C6FW c6fw) {
        View A05 = AbstractC65702TsY.A0P(c6fw, 0).A05(c6fq.A03);
        if (A05 instanceof RCTextView) {
            RCTextView rCTextView = (RCTextView) A05;
            if (!rCTextView.A04) {
                Layout layout = rCTextView.A02;
                SparseIntArray sparseIntArray = C6BL.A00;
                for (int i = 0; i < layout.getLineCount(); i++) {
                    if (layout.getEllipsisCount(i) > 0) {
                        if (i != -1) {
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
        AbstractC25241Le.A02(AbstractC111324zv.A00(756), "called on non-text component");
        return false;
    }
}
