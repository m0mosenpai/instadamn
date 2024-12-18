package X;

import android.content.Context;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.I9t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40895I9t {
    public static final void A00(C50525MSe c50525MSe, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView, C131325wL c131325wL) {
        boolean isSelected = igBouncyUfiButtonImageView.isSelected();
        if (c50525MSe.A00) {
            igBouncyUfiButtonImageView.setVisibility(0);
            boolean z = c50525MSe.A01;
            igBouncyUfiButtonImageView.setSelected(z);
            Context context = igBouncyUfiButtonImageView.getContext();
            int i = 2131965099;
            if (z) {
                i = 2131965112;
            }
            AbstractC166997dE.A18(context, igBouncyUfiButtonImageView, i);
            if (isSelected != z && c50525MSe.A02 && c131325wL != null) {
                c131325wL.A02(isSelected, false, false);
                return;
            }
            return;
        }
        igBouncyUfiButtonImageView.setVisibility(8);
    }
}
