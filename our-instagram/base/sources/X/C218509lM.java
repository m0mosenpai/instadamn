package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9lM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218509lM extends C9UT {
    public C3PF A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final InterfaceC16820sZ A03;

    public C218509lM(View view, InterfaceC16820sZ interfaceC16820sZ) {
        super(view);
        this.A03 = interfaceC16820sZ;
        this.A02 = (IgTextView) AbstractC166997dE.A0R(view, R.id.title_label);
        this.A01 = (IgSimpleImageView) AbstractC166997dE.A0R(view, R.id.entrypoint_view);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A07 = true;
        this.A00 = C216559iC.A00(A0s, this, 15);
    }
}
