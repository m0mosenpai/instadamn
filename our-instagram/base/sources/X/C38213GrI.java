package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;

/* renamed from: X.GrI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38213GrI extends C3OO implements C33R {
    public C37931GmT A00;
    public final View A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final C38214GrJ A04;
    public final IgImageButton A05;
    public final Activity A06;
    public final Context A07;
    public final ConstraintLayout A08;
    public final UserSession A09;
    public final IgView A0A;

    @Override // X.C33R
    public void DSJ(C75113Zb c75113Zb, int i) {
        C38214GrJ c38214GrJ;
        C14360o3.A0B(c75113Zb, 0);
        if (i == 50 && !(this instanceof C38218GrN) && (c38214GrJ = this.A04) != null) {
            c38214GrJ.DSJ(c75113Zb, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38213GrI(Activity activity, Context context, View view, UserSession userSession) {
        super(view);
        C38214GrJ c38214GrJ;
        AbstractC167017dG.A1R(context, userSession);
        this.A01 = view;
        this.A07 = context;
        this.A09 = userSession;
        this.A06 = activity;
        this.A05 = (IgImageButton) AbstractC166987dD.A0c(view, R.id.image_button);
        this.A08 = (ConstraintLayout) AbstractC166987dD.A0c(view, R.id.ad_overlay);
        this.A03 = (CircularImageView) AbstractC166987dD.A0c(view, R.id.profile_pic);
        this.A02 = AbstractC25230BEn.A0Q(view, R.id.label_top_sponsored);
        this.A0A = (IgView) AbstractC166987dD.A0c(view, R.id.top_legibility_gradient);
        if (view instanceof ViewGroup) {
            c38214GrJ = new C38214GrJ(activity, context, (ViewGroup) view, userSession);
        } else {
            c38214GrJ = null;
        }
        this.A04 = c38214GrJ;
    }
}
