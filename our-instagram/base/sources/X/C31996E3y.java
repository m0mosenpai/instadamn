package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.E3y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31996E3y extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;
    public final CircularImageView A05;
    public final IgImageView A06;
    public final C147036jf A07;
    public final C34438FGc A08;
    public final View A09;
    public final UserSession A0A;

    public C31996E3y(View view, UserSession userSession, C147036jf c147036jf, C34438FGc c34438FGc) {
        super(view);
        this.A09 = view;
        this.A0A = userSession;
        this.A07 = c147036jf;
        this.A08 = c34438FGc;
        this.A03 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.contact_import_card_container);
        this.A05 = AbstractC31176DnK.A0U(view, R.id.contact_import_card_circular_icon);
        this.A06 = AbstractC167007dF.A0T(view, R.id.contact_import_card_square_icon);
        this.A04 = AbstractC31176DnK.A0T(view, R.id.contact_import_dismiss_button);
        this.A02 = AbstractC167007dF.A0N(view, R.id.contact_import_card_title);
        this.A01 = AbstractC167007dF.A0N(view, R.id.contact_import_card_subtitle);
        View requireViewById = view.requireViewById(R.id.contact_import_card_cta);
        TextView textView = (TextView) requireViewById;
        C14360o3.A0A(textView);
        C1QI.A0G(textView, textView);
        C14360o3.A07(requireViewById);
        this.A00 = textView;
    }
}
