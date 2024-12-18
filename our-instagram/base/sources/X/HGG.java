package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public abstract class HGG extends C1P1 {
    public final C120985dq A00;
    public final UserSession A01;
    public final C37540Gfw A02;
    public final Context A03;
    public final C6WQ A04;

    public HGG(Context context, C120985dq c120985dq, UserSession userSession, C37540Gfw c37540Gfw, int i) {
        this.A03 = context;
        this.A00 = c120985dq;
        this.A02 = c37540Gfw;
        this.A01 = userSession;
        C6WQ A0i = AbstractC31174DnI.A0i(context);
        this.A04 = A0i;
        A0i.A00(context.getString(i));
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1915580558);
        AbstractC53862Nrq.A00(this.A03, abstractC115105If, 2131976159);
        C0f9.A0A(615786986, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1013453822);
        this.A04.dismiss();
        C0f9.A0A(-1345216683, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-454957159);
        C0fJ.A00(this.A04);
        C0f9.A0A(-2080387008, A03);
    }
}
