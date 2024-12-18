package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import kotlin.Deprecated;

@Deprecated(message = "Replaced by item definition")
/* loaded from: classes6.dex */
public abstract class F72 {
    public static final void A00(E3L e3l, C2EY c2ey, String str, String str2, String str3) {
        int i;
        AbstractC167007dF.A1E(e3l, 0, c2ey);
        Context A05 = AbstractC31172DnG.A05(e3l);
        TextView textView = e3l.A03;
        if (str2 == null) {
            str2 = AbstractC166997dE.A0p(A05, 2131960158);
        }
        textView.setText(str2);
        TextView textView2 = e3l.A02;
        if (str3 == null) {
            F71 f71 = F71.$redex_init_class;
            int ordinal = c2ey.ordinal();
            if (ordinal != 28) {
                if (ordinal != 32) {
                    if (ordinal != 79) {
                        i = 2131960159;
                        if (ordinal != 85) {
                            i = 2131960162;
                        }
                    } else {
                        i = 2131960160;
                    }
                } else {
                    i = 2131960161;
                }
            } else {
                i = 2131960163;
            }
            str3 = AbstractC31177DnL.A0b(A05, str, i);
        }
        textView2.setText(str3);
        IgSimpleImageView igSimpleImageView = e3l.A04;
        C14360o3.A0A(A05);
        igSimpleImageView.setImageDrawable(AE1.A01(A05, R.drawable.instagram_lock_outline_96));
        e3l.A00.setVisibility(8);
        e3l.A01.setVisibility(0);
        int dimensionPixelSize = A05.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
