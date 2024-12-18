package X;

import android.content.Context;
import android.util.Pair;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.LYo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48290LYo implements InterfaceC23471Cj {
    public final AbstractC53633Nne A00;
    public final /* synthetic */ C47923LEs A01;

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C14360o3.A0B(map, 0);
        EnumC172127lh A01 = AbstractC23451Ch.A01(map, C47923LEs.A05);
        C14360o3.A07(A01);
        EnumC172127lh enumC172127lh = EnumC172127lh.A05;
        C47923LEs c47923LEs = this.A01;
        if (A01 == enumC172127lh) {
            C195838lR c195838lR = c47923LEs.A00;
            if (c195838lR != null) {
                c195838lR.A00();
            }
            this.A00.A00();
        } else {
            C195838lR c195838lR2 = c47923LEs.A00;
            if (c195838lR2 == null) {
                ViewGroup viewGroup = c47923LEs.A04.A00;
                Context context = viewGroup.getContext();
                String A0K = AbstractC53242c7.A0K(context);
                c195838lR2 = AbstractC43593JPy.A0j(viewGroup);
                c195838lR2.A05(AbstractC167007dF.A0f(context, A0K, 2131954590));
                c195838lR2.A04(AbstractC167007dF.A0f(context, A0K, 2131954589));
                c195838lR2.A02(2131954588);
                c195838lR2.A03(new ViewOnClickListenerC48073LPy(this, 60));
            }
            c47923LEs.A00 = c195838lR2;
            if (c195838lR2 != null) {
                c195838lR2.A06(map);
            }
        }
        C4IA c4ia = C4IA.A05;
        C4IB c4ib = C4IB.A0C;
        List A1Q = AbstractC16960so.A1Q(new Pair(c4ia, c4ib), new Pair(C4IA.A09, c4ib));
        UserSession userSession = c47923LEs.A03;
        new C4I7(AbstractC31171DnF.A0D("IgLivePermissionsController"), userSession).A01(C4I8.A00(userSession), "IG_LIVE_PERMISSIONS_CONTROLLER", A1Q, AbstractC166987dD.A1J(C4I9.UNKNOWN), map);
    }

    public C48290LYo(AbstractC53633Nne abstractC53633Nne, C47923LEs c47923LEs) {
        this.A01 = c47923LEs;
        this.A00 = abstractC53633Nne;
    }
}
