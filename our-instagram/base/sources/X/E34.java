package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsRadioButton;

/* loaded from: classes6.dex */
public final class E34 extends C3OO {
    public C36201FyF A00;
    public final IgTextView A01;
    public final IgdsRadioButton A02;
    public final InterfaceC16660sJ A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E34(View view, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        AbstractC167017dG.A1P(view, interfaceC16660sJ);
        this.A03 = interfaceC16660sJ;
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.closed_caption_option_item);
        ViewOnClickListenerC35686FpL.A00(A0Y, 5, this);
        this.A01 = A0Y;
        IgdsRadioButton igdsRadioButton = (IgdsRadioButton) view.findViewById(R.id.closed_caption_item_radio);
        ViewOnClickListenerC35686FpL.A00(igdsRadioButton, 4, this);
        this.A02 = igdsRadioButton;
    }
}
