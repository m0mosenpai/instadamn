package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes8.dex */
public final class M4O implements Runnable {
    public final /* synthetic */ C116155Nu A00;
    public final /* synthetic */ C48525LdN A01;

    public M4O(C116155Nu c116155Nu, C48525LdN c48525LdN) {
        this.A00 = c116155Nu;
        this.A01 = c48525LdN;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C116155Nu c116155Nu = this.A00;
        String str = c116155Nu.A0g;
        if (str == null) {
            str = "";
        }
        String A00 = AbstractC43609JQq.A00(AbstractC25227BEk.A0B(str));
        if (A00 == null) {
            C0w9.A03("StellaMessageNotificationHandler", "Null message id from notification");
            return;
        }
        String str2 = c116155Nu.A0j;
        C55053Oa4 c55053Oa4 = C55053Oa4.A01;
        C48525LdN c48525LdN = this.A01;
        Context context = c48525LdN.A01;
        C18920wW c18920wW = c48525LdN.A02;
        C14360o3.A0B(context, 0);
        Intent intent = new Intent(MSV.A00(1555));
        intent.putExtra(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        intent.putExtra("message_id", A00);
        C55053Oa4.A00(context, intent, c18920wW);
    }
}
