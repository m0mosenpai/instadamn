package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* loaded from: classes9.dex */
public final class OCV {
    public final View A00;
    public final ConstraintLayout A01;
    public final RoundedCornerFrameLayout A02;
    public final InterfaceC09390do A03;

    public OCV(View view, Fragment fragment, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        C57556PgU c57556PgU = new C57556PgU(userSession, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57556PgU(new C57556PgU(fragment, 45), 46));
        this.A03 = AbstractC25225BEi.A0a(new C57556PgU(A00, 47), c57556PgU, C57530Pg4.A00(null, A00, 43), AbstractC25225BEi.A1D(C50885MeG.class));
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) AbstractC166997dE.A0R(view, R.id.iglive_media_layout);
        this.A02 = roundedCornerFrameLayout;
        ViewParent parent = roundedCornerFrameLayout.getParent();
        C14360o3.A0C(parent, AbstractC111324zv.A00(14));
        this.A01 = (ConstraintLayout) parent;
        this.A00 = AbstractC166997dE.A0S(view, R.id.iglive_dimmer_view);
        C50885MeG c50885MeG = (C50885MeG) this.A03.getValue();
        Context A0L = AbstractC166997dE.A0L(roundedCornerFrameLayout);
        c50885MeG.A00.Egh(Float.valueOf(AbstractC13880nE.A0A(A0L) / AbstractC13880nE.A09(A0L)));
    }
}
