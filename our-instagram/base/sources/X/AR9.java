package X;

import android.view.View;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* loaded from: classes4.dex */
public final class AR9 implements View.OnClickListener {
    public final /* synthetic */ C6b8 A00;

    public AR9(C6b8 c6b8) {
        this.A00 = c6b8;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1491462872);
        C6b8 c6b8 = this.A00;
        InterfaceC56392iX interfaceC56392iX = c6b8.A02;
        if (interfaceC56392iX != null) {
            AbstractC167007dF.A0x(interfaceC56392iX.getView());
        }
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = c6b8.A04;
        igBouncyUfiButtonImageView.setVisibility(0);
        igBouncyUfiButtonImageView.performClick();
        C0f9.A0C(-1792076905, A05);
    }
}
