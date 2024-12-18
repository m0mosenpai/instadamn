package X;

import android.app.Activity;
import android.view.View;
import com.facebook.R;

/* loaded from: classes4.dex */
public final class ARQ implements View.OnClickListener {
    public final /* synthetic */ C183758Da A00;
    public final /* synthetic */ Runnable A01;

    public ARQ(C183758Da c183758Da, Runnable runnable) {
        this.A00 = c183758Da;
        this.A01 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1187460392);
        C183758Da c183758Da = this.A00;
        Runnable runnable = this.A01;
        Activity activity = c183758Da.A00;
        C193328hC c193328hC = new C193328hC(activity);
        c193328hC.A05 = activity.getResources().getQuantityString(R.plurals.story_drafts_confirmation_title, 1);
        c193328hC.A0L(new AOD(runnable, 7), 2131974605);
        c193328hC.A0P(null, EnumC193348hE.A04, 2131954754);
        c193328hC.A0t(true);
        AbstractC166987dD.A1W(c193328hC);
        C0f9.A0C(271663559, A05);
    }
}
