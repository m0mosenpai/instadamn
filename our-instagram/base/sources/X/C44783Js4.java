package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;

/* renamed from: X.Js4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44783Js4 extends C3OO implements C7QD, C7QE {
    public C7QH A00;
    public final Drawable A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgImageView A06;
    public final CountdownTimerPill A07;
    public final IgdsButton A08;
    public final IgdsFaceSwarm A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44783Js4(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.prompt_header_icon);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.prompt_header_title);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.prompt_xma_title);
        this.A07 = (CountdownTimerPill) AbstractC166997dE.A0R(view, R.id.prompt_timer_pill);
        this.A01 = AbstractC162807Qr.A00();
        this.A08 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.prompt_xma_cta_button);
        this.A06 = AbstractC167007dF.A0T(view, R.id.prompt_xma_facepile);
        this.A09 = (IgdsFaceSwarm) AbstractC166997dE.A0R(view, R.id.prompt_xma_faceswarm);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.prompt_footer);
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A00;
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A00 = c7qh;
    }

    @Override // X.C7QD
    public final View BKF() {
        return AbstractC31171DnF.A06(this);
    }
}
