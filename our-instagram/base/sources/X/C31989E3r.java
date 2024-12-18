package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.E3r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31989E3r extends C3OO {
    public final Context A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final C142846ck A05;
    public final IgdsButton A06;
    public final View A07;
    public final UserSession A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31989E3r(Context context, View view, UserSession userSession) {
        super(view);
        AbstractC167027dH.A13(userSession, context, view);
        this.A08 = userSession;
        this.A00 = context;
        this.A07 = view;
        this.A04 = (IgImageView) AbstractC166987dD.A0c(view, R.id.image);
        this.A03 = AbstractC31175DnJ.A0L(view, R.id.title);
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.description);
        this.A02 = AbstractC31175DnJ.A0L(view, R.id.footer);
        this.A06 = (IgdsButton) AbstractC166987dD.A0c(view, R.id.cta_button);
        this.A05 = AbstractC147806l5.A00(userSession);
    }
}
