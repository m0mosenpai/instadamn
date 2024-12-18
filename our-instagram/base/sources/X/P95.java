package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class P95 implements GZN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DialogInterface.OnDismissListener A01;
    public final /* synthetic */ AbstractC10360h2 A02;
    public final /* synthetic */ AbstractC018607g A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C41181vS A05;

    @Override // X.GZN
    public final void DlA(List list) {
        C14360o3.A0B(list, 0);
        C41181vS c41181vS = this.A05;
        Context context = this.A00;
        UserSession userSession = this.A04;
        AbstractC018607g abstractC018607g = this.A03;
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        AbstractC10360h2 abstractC10360h2 = this.A02;
        C121275eQ A02 = AbstractC50633MWu.A02(context, userSession, c41181vS, C55909Os0.__redex_internal_original_name, true, AbstractC166987dD.A1a(list.get(0)));
        A02.A00 = new C60936Rbq(1, context, onDismissListener, abstractC10360h2, userSession, c41181vS);
        AbstractC63248Sg4.A02(abstractC10360h2);
        C1GJ.A00(context, abstractC018607g, A02);
    }

    @Override // X.GZN
    public final void onCancel() {
    }

    public P95(Context context, DialogInterface.OnDismissListener onDismissListener, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, UserSession userSession, C41181vS c41181vS) {
        this.A05 = c41181vS;
        this.A00 = context;
        this.A04 = userSession;
        this.A03 = abstractC018607g;
        this.A01 = onDismissListener;
        this.A02 = abstractC10360h2;
    }
}
