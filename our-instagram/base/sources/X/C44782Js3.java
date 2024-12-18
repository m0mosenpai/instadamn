package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.Js3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44782Js3 extends C3OO implements C7QD, C7QE {
    public C7QH A00;
    public final Drawable A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgdsButton A05;
    public final List A06;

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    public C44782Js3(View view) {
        super(view);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.poll_question);
        this.A06 = AbstractC16960so.A1Q(new C47652L2l(view, R.id.poll_option_1, R.id.poll_option_progress1, R.id.poll_voters_option_1), new C47652L2l(view, R.id.poll_option_2, R.id.poll_option_progress2, R.id.poll_voters_option_2), new C47652L2l(view, R.id.poll_option_3, R.id.poll_option_progress3, R.id.poll_voters_option_3));
        this.A03 = AbstractC25231BEo.A0d(view, R.id.poll_secondary_description);
        this.A04 = AbstractC31176DnK.A0U(view, R.id.poll_creator_avatar);
        this.A01 = AbstractC162807Qr.A00();
        this.A05 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.cta_button);
    }

    @Override // X.C7QD
    public final View BKF() {
        return AbstractC31171DnF.A06(this);
    }
}
