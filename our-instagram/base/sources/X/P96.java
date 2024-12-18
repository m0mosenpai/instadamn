package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class P96 implements GZN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ AbstractC018607g A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ InterfaceC69973Cg A05;
    public final /* synthetic */ C41181vS A06;

    @Override // X.GZN
    public final void DlA(List list) {
        C14360o3.A0B(list, 0);
        C41181vS c41181vS = this.A06;
        UserSession userSession = this.A04;
        AbstractC10360h2 abstractC10360h2 = this.A02;
        AbstractC018607g abstractC018607g = this.A03;
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        InterfaceC69973Cg interfaceC69973Cg = this.A05;
        Activity activity = this.A00;
        C121275eQ A02 = AbstractC50633MWu.A02(activity, userSession, c41181vS, C55909Os0.__redex_internal_original_name, false, AbstractC166987dD.A1a(list.get(0)));
        A02.A00 = new NFV(0, activity, onDismissListener, abstractC10360h2, userSession, interfaceC69973Cg, c41181vS);
        AbstractC63248Sg4.A02(abstractC10360h2);
        C1GJ.A00(activity, abstractC018607g, A02);
    }

    @Override // X.GZN
    public final void onCancel() {
        throw C00O.createAndThrow();
    }

    public P96(Activity activity, DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC69973Cg interfaceC69973Cg, C41181vS c41181vS) {
        this.A06 = c41181vS;
        this.A04 = userSession;
        this.A02 = abstractC10360h2;
        this.A03 = abstractC018607g;
        this.A01 = onDismissListener;
        this.A05 = interfaceC69973Cg;
        this.A00 = activity;
    }
}
