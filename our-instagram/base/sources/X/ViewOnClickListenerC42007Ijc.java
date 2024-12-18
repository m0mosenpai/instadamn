package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Ijc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC42007Ijc implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C38321qM A01;
    public final /* synthetic */ IntentAwareAdPivotState A02;
    public final /* synthetic */ HBC A03;
    public final /* synthetic */ C64042vP A04;
    public final /* synthetic */ ICO A05;
    public final /* synthetic */ C60662pp A06;

    public ViewOnClickListenerC42007Ijc(C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64042vP c64042vP, ICO ico, C60662pp c60662pp, int i) {
        this.A06 = c60662pp;
        this.A00 = i;
        this.A01 = c38321qM;
        this.A02 = intentAwareAdPivotState;
        this.A05 = ico;
        this.A04 = c64042vP;
        this.A03 = hbc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2110439225);
        C60662pp c60662pp = this.A06;
        int i = this.A00;
        C38321qM c38321qM = this.A01;
        IntentAwareAdPivotState intentAwareAdPivotState = this.A02;
        c60662pp.A0M(c38321qM, this.A05, i);
        this.A04.A0F(intentAwareAdPivotState, this.A03, C05F.A0u, i);
        C0f9.A0C(-665244645, A05);
    }
}
