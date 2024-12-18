package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.HcE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39486HcE extends AbstractC38393GuU {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final RoundedCornerImageView A04;
    public final C38321qM A05;

    public C39486HcE(View view, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        super(view);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A05 = c38321qM;
        this.A04 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.insight_image);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.insight_title);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.insight_subtitle);
    }
}
