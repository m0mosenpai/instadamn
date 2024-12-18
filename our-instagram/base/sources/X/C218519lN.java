package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218519lN extends C9UT {
    public C3PF A00;
    public C217859kI A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final InterfaceC16660sJ A04;

    public C218519lN(View view, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        this.A04 = interfaceC16660sJ;
        this.A03 = (IgTextView) AbstractC166997dE.A0R(view, R.id.group_mention_suggestion_title_label);
        this.A02 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.group_mention_suggestion_image);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A07 = true;
        this.A00 = C216559iC.A00(A0s, this, 16);
    }
}
