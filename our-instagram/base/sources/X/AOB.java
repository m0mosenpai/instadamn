package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.instagram.wellbeing.limitedprofile.activity.LimitedInteractionsReminderActivity;

/* loaded from: classes4.dex */
public final class AOB implements DialogInterface.OnClickListener {
    public final /* synthetic */ C92N A00;

    public AOB(C92N c92n) {
        this.A00 = c92n;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C92N c92n = this.A00;
        Context context = c92n.A01;
        Intent putExtra = new Intent(context, (Class<?>) LimitedInteractionsReminderActivity.class).putExtra("IgSessionManager.SESSION_TOKEN_KEY", c92n.A05.token).putExtra("LimitedInteractionsSettingsFragment.SHOULD_SHOW_BOTTOM_SHEET", true);
        C14360o3.A07(putExtra);
        putExtra.setFlags(268435456);
        C12260kU.A0C(context, putExtra);
    }
}
