package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E2Z extends C3OO {
    public C32078E8c A00;
    public final IgTextView A01;
    public final InterfaceC16660sJ A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2Z(View view, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        AbstractC167017dG.A1P(view, interfaceC16660sJ);
        this.A02 = interfaceC16660sJ;
        IgTextView A0Y = AbstractC31172DnG.A0Y(view, R.id.survey_option_item);
        ViewOnClickListenerC35686FpL.A00(A0Y, 7, this);
        this.A01 = A0Y;
    }
}
