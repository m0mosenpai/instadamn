package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* loaded from: classes8.dex */
public final class L8P {
    public final C131325wL A00 = new C131325wL();

    public final void A00(C51688MsJ c51688MsJ, IgSimpleImageView igSimpleImageView, InterfaceC50425MOf interfaceC50425MOf, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        AbstractC167007dF.A1E(igBouncyUfiButtonImageView, 0, interfaceC50425MOf);
        boolean z = c51688MsJ.A00;
        igBouncyUfiButtonImageView.setSelected(z);
        Context context = igBouncyUfiButtonImageView.getContext();
        int i = 2131968720;
        if (z) {
            i = 2131968721;
        }
        AbstractC166997dE.A18(context, igBouncyUfiButtonImageView, i);
        C0fQ.A00(new ViewOnClickListenerC44304Jhv(4, igSimpleImageView, igBouncyUfiButtonImageView, c51688MsJ, this, interfaceC50425MOf), igBouncyUfiButtonImageView);
    }

    public final void A01(IgSimpleImageView igSimpleImageView, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView) {
        C14360o3.A0B(igBouncyUfiButtonImageView, 0);
        if (igSimpleImageView != null) {
            Context A0L = AbstractC166997dE.A0L(igSimpleImageView);
            igSimpleImageView.setImageDrawable(C3LQ.A04(A0L, new int[]{AbstractC167007dF.A09(A0L, R.attr.igds_color_gradient_yellow), AbstractC167007dF.A09(A0L, R.attr.igds_color_gradient_red), AbstractC167007dF.A09(A0L, R.attr.igds_color_gradient_purple)}, R.drawable.instagram_cake_pano_filled_24));
            igSimpleImageView.setVisibility(8);
        }
        igBouncyUfiButtonImageView.setVisibility(0);
        this.A00.A01(AbstractC25225BEi.A16(igBouncyUfiButtonImageView));
    }
}
