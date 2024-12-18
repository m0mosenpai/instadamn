package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* renamed from: X.ETd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32503ETd extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ Runnable A06;
    public final /* synthetic */ List A07;

    public C32503ETd(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, Runnable runnable, Runnable runnable2, List list, int i) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A00 = i;
        this.A01 = context;
        this.A07 = list;
        this.A04 = savedCollection;
        this.A06 = runnable;
        this.A05 = runnable2;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1263481959);
        super.onFail(abstractC115105If);
        this.A05.run();
        C0f9.A0A(-1819128895, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1158584948);
        SavedCollection savedCollection = (SavedCollection) obj;
        int A032 = C0f9.A03(970673955);
        UserSession userSession = this.A03;
        C36117Fwr.A00(AbstractC25651Mw.A00(userSession), savedCollection, C05F.A00);
        AbstractC41756IeX.A03(this.A02, userSession, savedCollection, "bulk_edit", this.A00);
        Context context = this.A01;
        List list = this.A07;
        AbstractC35236FgV.A04(context, (C38321qM) AbstractC166987dD.A16(list), savedCollection, list.size());
        SavedCollection savedCollection2 = this.A04;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        AbstractC35086Fcx.A02(savedCollection2, savedCollection, list);
        C36116Fwq.A00(A00, savedCollection2, list);
        Runnable runnable = this.A06;
        if (runnable != null) {
            runnable.run();
        }
        C0f9.A0A(477375312, A032);
        C0f9.A0A(549746276, A03);
    }
}
