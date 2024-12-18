package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* loaded from: classes6.dex */
public final class E4C extends C3OO implements C3Ow {
    public View A00;
    public ViewGroup A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public ConstraintLayout A05;
    public ConstraintLayout A06;
    public IgTextView A07;
    public IgTextView A08;
    public CircularImageView A09;
    public IgImageView A0A;
    public IgImageView A0B;
    public IgImageView A0C;
    public NoteBubbleView A0D;
    public GradientSpinnerAvatarView A0E;
    public RoundedCornerConstraintLayout A0F;
    public final ViewStub A0G;
    public final ViewStub A0H;
    public final IgFrameLayout A0I;
    public final IgFrameLayout A0J;
    public final IgLinearLayout A0K;
    public final IgTextView A0L;
    public final CircularImageView A0M;
    public final Context A0N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E4C(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A0N = AbstractC166997dE.A0L(view);
        this.A0I = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.content_notes_container);
        this.A0G = AbstractC167007dF.A0M(view, R.id.broadcast_content_notes);
        this.A0J = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.reshare_story_container);
        this.A0H = AbstractC167007dF.A0M(view, R.id.broadcast_reshare_story);
        this.A0K = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.group_row_container);
        this.A0M = AbstractC31176DnK.A0U(view, R.id.avatar_image_view);
        this.A0L = AbstractC25231BEo.A0d(view, R.id.row_title);
    }

    @Override // X.C3Ow
    public final boolean Ejh() {
        return true;
    }

    @Override // X.C3Ow
    public final View Aek() {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0E;
        if (gradientSpinnerAvatarView == null) {
            return new View(this.A0N);
        }
        return gradientSpinnerAvatarView;
    }

    @Override // X.C3Ow
    public final GradientSpinner Blo() {
        GradientSpinner gradientSpinner;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0E;
        if (gradientSpinnerAvatarView == null || (gradientSpinner = gradientSpinnerAvatarView.A0O) == null) {
            return new GradientSpinner(this.A0N, null, 0, 6, null);
        }
        return gradientSpinner;
    }

    @Override // X.C3Ow
    /* renamed from: AeS */
    public final RectF Ahl() {
        return AbstractC13880nE.A0G(Aek());
    }

    @Override // X.InterfaceC72963Ox
    public final /* synthetic */ RectF Ahl() {
        return AbstractC13880nE.A0G(Aek());
    }

    @Override // X.C3Ow
    public final void CMM() {
        Aek().setVisibility(4);
    }

    @Override // X.C3Ow
    public final void EkR(InterfaceC11380iw interfaceC11380iw) {
        Aek().setVisibility(0);
    }
}
