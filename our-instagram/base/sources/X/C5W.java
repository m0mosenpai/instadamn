package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* loaded from: classes5.dex */
public final class C5W extends AbstractC25917BdK {
    public final TextView A00;
    public final TextView A01;
    public final InterfaceC11380iw A02;
    public final IgCheckBox A03;
    public final CircularImageView A04;
    public final InterfaceC16660sJ A05;
    public final InterfaceC16620sF A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5W(View view, InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16620sF interfaceC16620sF) {
        super(view);
        AbstractC25233BEq.A0w(1, view, interfaceC16660sJ, interfaceC16620sF);
        this.A02 = interfaceC11380iw;
        this.A05 = interfaceC16660sJ;
        this.A06 = interfaceC16620sF;
        this.A00 = AbstractC167007dF.A0N(view, R.id.primary_text);
        this.A01 = AbstractC167007dF.A0N(view, R.id.secondary_text);
        this.A04 = (CircularImageView) AbstractC166997dE.A0R(view, R.id.image);
        this.A03 = (IgCheckBox) AbstractC166997dE.A0R(view, R.id.save_button);
    }
}
