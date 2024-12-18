package X;

import android.view.View;
import com.facebook.R;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* loaded from: classes7.dex */
public final class IHQ {
    public final IgBouncyUfiButtonImageView A00;
    public final C131325wL A01;
    public final InterfaceC09390do A02;

    public IHQ(View view, C07X c07x, InterfaceC018407e interfaceC018407e) {
        C14360o3.A0B(interfaceC018407e, 1);
        this.A02 = Ny8.A00(new C55567Om1(), interfaceC018407e, AbstractC25225BEi.A1D(C38317GtC.class));
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = (IgBouncyUfiButtonImageView) AbstractC166997dE.A0R(view, R.id.toolbar_like_button);
        this.A00 = igBouncyUfiButtonImageView;
        C131325wL c131325wL = new C131325wL();
        this.A01 = c131325wL;
        AbstractC166987dD.A1Z(new C57158PZc(c07x, this, null, 12), C07Y.A00(c07x));
        c131325wL.A01(AbstractC25225BEi.A16(igBouncyUfiButtonImageView));
        ViewOnClickListenerC42035Ik4.A01(igBouncyUfiButtonImageView, 36, this);
    }
}
