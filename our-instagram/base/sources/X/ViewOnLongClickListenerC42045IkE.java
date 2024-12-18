package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.IkE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLongClickListenerC42045IkE implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ IntentAwareAdPivotState A03;
    public final /* synthetic */ HBC A04;
    public final /* synthetic */ C64042vP A05;
    public final /* synthetic */ ICO A06;
    public final /* synthetic */ C60662pp A07;

    public ViewOnLongClickListenerC42045IkE(UserSession userSession, C38321qM c38321qM, IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64042vP c64042vP, ICO ico, C60662pp c60662pp, int i) {
        this.A01 = userSession;
        this.A04 = hbc;
        this.A07 = c60662pp;
        this.A00 = i;
        this.A02 = c38321qM;
        this.A03 = intentAwareAdPivotState;
        this.A06 = ico;
        this.A05 = c64042vP;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        UserSession userSession = this.A01;
        HBC hbc = this.A04;
        if (AbstractC28501Chu.A06(userSession, hbc.A00)) {
            this.A07.A0M(this.A02, this.A06, this.A00);
        }
        this.A05.A0F(this.A03, hbc, C05F.A0j, this.A00);
        return true;
    }
}
