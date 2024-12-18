package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class E3E extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final InterfaceC11380iw A02;
    public final IgImageView A03;
    public final InterfaceC16660sJ A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3E(View view, InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        AbstractC167027dH.A13(view, interfaceC11380iw, interfaceC16660sJ);
        this.A02 = interfaceC11380iw;
        this.A04 = interfaceC16660sJ;
        this.A03 = AbstractC31172DnG.A0a(view, R.id.ai_agent_picker_item_image);
        this.A01 = AbstractC166987dD.A0e(view, R.id.ai_agent_picker_item_label);
        this.A00 = AbstractC166987dD.A0e(view, R.id.ai_agent_picker_item_description);
    }
}
