package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes8.dex */
public final class L87 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ PendingRecipient A03;
    public final /* synthetic */ C6WQ A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void A00(C9J0 c9j0) {
        C14360o3.A0B(c9j0, 0);
        this.A04.dismiss();
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        PendingRecipient pendingRecipient = this.A03;
        boolean z = this.A07;
        boolean z2 = this.A06;
        String str = this.A05;
        int ordinal = c9j0.A04.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            return;
        }
        C11T.A03(new RunnableC57084PTx(activity, fragment, c9j0, userSession, pendingRecipient, str, z2, z));
    }

    public L87(Activity activity, Fragment fragment, UserSession userSession, PendingRecipient pendingRecipient, C6WQ c6wq, String str, boolean z, boolean z2) {
        this.A04 = c6wq;
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = pendingRecipient;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str;
    }
}
