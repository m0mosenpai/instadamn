package X;

import android.view.View;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.IjI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41987IjI implements View.OnClickListener {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ HBC A01;
    public final /* synthetic */ C64062vR A02;
    public final /* synthetic */ C60662pp A03;
    public final /* synthetic */ List A04;

    public ViewOnClickListenerC41987IjI(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64062vR c64062vR, C60662pp c60662pp, List list) {
        this.A03 = c60662pp;
        this.A04 = list;
        this.A01 = hbc;
        this.A00 = intentAwareAdPivotState;
        this.A02 = c64062vR;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(8269811);
        C60662pp c60662pp = this.A03;
        List list = this.A04;
        C38321qM c38321qM = (C38321qM) AbstractC001800i.A0I(list);
        HBC hbc = this.A01;
        IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
        c60662pp.A0I(c38321qM, intentAwareAdPivotState, hbc, list);
        this.A02.A08.A0C(intentAwareAdPivotState, hbc);
        C0f9.A0C(949914761, A05);
    }
}
