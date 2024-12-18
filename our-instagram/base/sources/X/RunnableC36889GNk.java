package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.GNk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36889GNk implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public RunnableC36889GNk(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41451vu c41451vu = C41451vu.A01;
        Context context = this.A00;
        String str = this.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        if (str == null) {
            Resources resources = context.getResources();
            AbstractC31265Don.A00();
            str = AbstractC166997dE.A0q(resources, 2131952591);
        }
        A0K.A0D = str;
        A0K.A05();
        A0K.A0H = "ai_agent_picker_not_eligible_failure";
        AbstractC31178DnM.A1N(c41451vu, A0K);
    }
}
