package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GwE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38493GwE extends C3OO {
    public AlC A00;
    public final Context A01;
    public final ImageView A02;
    public final UserSession A03;
    public final C42509Iro A04;
    public final View A05;

    public C38493GwE(View view, UserSession userSession, C42509Iro c42509Iro) {
        super(view);
        this.A03 = userSession;
        this.A01 = view.getContext();
        this.A04 = c42509Iro;
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.countdown_sticker);
        this.A02 = A0I;
        View requireViewById = view.requireViewById(R.id.countdown_sticker_option_view);
        this.A05 = requireViewById;
        C3P9 A0s = AbstractC166987dD.A0s(A0I);
        A0s.A07 = true;
        C37846Gl0.A00(A0s, this, 7);
        C3P9 A0s2 = AbstractC166987dD.A0s(requireViewById);
        A0s2.A01(A0I);
        A0s2.A07 = true;
        C37846Gl0.A00(A0s2, this, 8);
    }
}
