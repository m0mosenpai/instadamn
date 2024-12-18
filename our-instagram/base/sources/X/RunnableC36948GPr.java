package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GPr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36948GPr implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C23031Ai A01;
    public final /* synthetic */ FMD A02;

    public RunnableC36948GPr(UserSession userSession, C23031Ai c23031Ai, FMD fmd) {
        this.A01 = c23031Ai;
        this.A00 = userSession;
        this.A02 = fmd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC19630xq interfaceC19630xq = this.A01.A01;
        if (interfaceC19630xq.getBoolean("show_business_onboarding_check_list_tooltip", false)) {
            int i = 2131963211;
            if (C2E7.A01(C17060sy.A01.A01(this.A00))) {
                i = 2131963212;
            }
            View view = this.A02.A01;
            Context context = view.getContext();
            Activity activity = (Activity) AbstractC13320mI.A00(context, Activity.class);
            if (activity != null) {
                int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material);
                C5SU A0U = AbstractC167007dF.A0U(activity, i);
                A0U.A01();
                A0U.A04(view, 0, dimensionPixelOffset, true);
                AbstractC166997dE.A1P(A0U);
            }
            AbstractC31177DnL.A1N(interfaceC19630xq, "show_business_onboarding_check_list_tooltip", false);
        }
        this.A02.A00 = null;
    }
}
