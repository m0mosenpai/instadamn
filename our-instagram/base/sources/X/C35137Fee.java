package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;

/* renamed from: X.Fee, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35137Fee {
    public static final C35137Fee A00 = new Object();

    public static final void A00(Context context, String str) {
        AbstractC167007dF.A0J().postDelayed(new RunnableC36889GNk(context, str), 500L);
    }

    public final void A01(Activity activity, SpannableStringBuilder spannableStringBuilder) {
        if (AbstractC54852fj.A00() == null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("destination_id", "mainfeed");
            AbstractC35275FhA.A03(activity, A0b);
        }
        AbstractC167007dF.A0J().postDelayed(new RunnableC36888GNj(activity, spannableStringBuilder), 500L);
    }
}
