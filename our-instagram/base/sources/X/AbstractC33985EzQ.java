package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EzQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33985EzQ {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, AbstractC111324zv.A00(8));
        Object A02 = c6fw.A02();
        String A0n = AbstractC31176DnK.A0n(c6fw, AbstractC31171DnF.A0f(A02));
        InterfaceC103384lE A0t = AbstractC25228BEl.A0t(c6fw.A00, 3);
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        String A1H = AbstractC25226BEj.A1H(", ", (Iterable) A03, null);
        C25621Ms A0M = AbstractC31177DnL.A0M(A0K);
        A0M.A0B("media/infos/");
        A0M.A9s("media_ids", A1H);
        new C154796xU(A04, AbstractC018607g.A00(A04), A0K).A03(AbstractC31172DnG.A0R(null, A0M, C74293Vk.class, C74313Vm.class, false), new C32953Eek(A04, c6fq, A0t, A0K, (String) A02, A0n));
        return null;
    }
}
