package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.Jrz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44778Jrz extends C3OO implements C7QD {
    public C44780Js1 A00;
    public final TextView A01;
    public final InterfaceC56392iX A02;
    public final IgLinearLayout A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44778Jrz(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = AbstractC167007dF.A0N(view, R.id.message_action_log);
        this.A02 = AbstractC166997dE.A0X(view, R.id.standard_dxma_stub);
        this.A03 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.standard_dxma_message_container);
    }

    @Override // X.C7QD
    public final View BKF() {
        return AbstractC31171DnF.A06(this);
    }
}
