package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Fof, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35645Fof implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C31995E3x A05;
    public final /* synthetic */ C31446Drq A06;
    public final /* synthetic */ InterfaceC132405yL A07;
    public final /* synthetic */ DirectShareTarget A08;
    public final /* synthetic */ Reel A09;

    public ViewOnClickListenerC35645Fof(C31995E3x c31995E3x, C31446Drq c31446Drq, InterfaceC132405yL interfaceC132405yL, DirectShareTarget directShareTarget, Reel reel, int i, int i2, int i3, int i4, int i5) {
        this.A07 = interfaceC132405yL;
        this.A09 = reel;
        this.A05 = c31995E3x;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A08 = directShareTarget;
        this.A02 = i5;
        this.A06 = c31446Drq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1231190655);
        InterfaceC132405yL interfaceC132405yL = this.A07;
        Reel reel = this.A09;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A05.A08.A04;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A04;
        int i4 = this.A03;
        interfaceC132405yL.DpP(this.A06, this.A08, reel, gradientSpinnerAvatarView, i, i2, i3, i4, this.A02);
        C0f9.A0C(909008930, A05);
    }
}
