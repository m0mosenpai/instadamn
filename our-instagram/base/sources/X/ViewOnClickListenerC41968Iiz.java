package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.Iiz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41968Iiz implements View.OnClickListener {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ HBC A01;
    public final /* synthetic */ C64062vR A02;
    public final /* synthetic */ C60662pp A03;

    public ViewOnClickListenerC41968Iiz(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64062vR c64062vR, C60662pp c60662pp) {
        this.A03 = c60662pp;
        this.A01 = hbc;
        this.A02 = c64062vR;
        this.A00 = intentAwareAdPivotState;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1903902487);
        C60662pp c60662pp = this.A03;
        HBC hbc = this.A01;
        c60662pp.A0S(hbc.getId());
        this.A02.A08.A0D(this.A00, hbc);
        C0f9.A0C(-1868745277, A05);
    }
}
