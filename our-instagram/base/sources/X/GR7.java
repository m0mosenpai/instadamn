package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* loaded from: classes6.dex */
public final class GR7 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    public GR7(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, Runnable runnable, String str, List list, int i) {
        this.A02 = interfaceC11380iw;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = savedCollection;
        this.A06 = str;
        this.A07 = list;
        this.A00 = i;
        this.A05 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11380iw interfaceC11380iw = this.A02;
        Context context = this.A01;
        UserSession userSession = this.A03;
        SavedCollection savedCollection = this.A04;
        String str = this.A06;
        List list = this.A07;
        int i = this.A00;
        Runnable runnable = this.A05;
        AbstractC35086Fcx.A00(AbstractC25651Mw.A00(userSession), savedCollection, list);
        AbstractC35236FgV.A03(context, (C38321qM) AbstractC166987dD.A16(list), new G96(context, interfaceC11380iw, userSession, savedCollection, runnable, str, list, i), list.size());
    }
}
