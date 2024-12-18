package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.user.model.User;

/* renamed from: X.9lO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218529lO extends C9UT {
    public TextView A00;
    public IgImageView A01;
    public User A02;
    public final C3PF A03;
    public final InterfaceC16660sJ A04;

    public C218529lO(View view, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        this.A04 = interfaceC16660sJ;
        this.A01 = AbstractC167007dF.A0T(view, R.id.reel_tagging_profile_view);
        this.A00 = AbstractC167007dF.A0N(view, R.id.reel_tagging_name_view);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A07 = true;
        this.A03 = C216559iC.A00(A0s, this, 18);
    }
}
