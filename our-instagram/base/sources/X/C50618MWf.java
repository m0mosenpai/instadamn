package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.MWf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50618MWf {
    public final View A00;
    public final TextView A01;
    public final InterfaceC56392iX A02;
    public final InterfaceC56392iX A03;
    public final IgdsButton A04;
    public final IgdsButton A05;

    public C50618MWf(View view) {
        C14360o3.A0B(view, 1);
        this.A00 = view;
        this.A04 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.profile_header_request_confirm_button);
        this.A05 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.profile_header_request_deny_button);
        this.A01 = AbstractC167007dF.A0N(view, R.id.profile_header_request_text);
        this.A02 = AbstractC166997dE.A0X(view, R.id.profile_header_request_icon_stub);
        this.A03 = AbstractC31179DnN.A0M(view, R.id.social_context_message);
    }
}
