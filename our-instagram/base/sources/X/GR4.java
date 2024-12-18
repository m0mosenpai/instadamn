package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* loaded from: classes6.dex */
public final class GR4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public GR4(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, String str, List list, int i) {
        this.A02 = interfaceC11380iw;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = savedCollection;
        this.A05 = str;
        this.A06 = list;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC11380iw interfaceC11380iw = this.A02;
        Context context = this.A01;
        UserSession userSession = this.A03;
        SavedCollection savedCollection = this.A04;
        String str = this.A05;
        List list = this.A06;
        AbstractC35236FgV.A02(context, (C38321qM) AbstractC166987dD.A16(list), new G94(context, interfaceC11380iw, userSession, savedCollection, str, list, this.A00), list.size());
    }
}
