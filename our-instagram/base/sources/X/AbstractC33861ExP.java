package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ExP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33861ExP {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = (List) c6fw.A03(0);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C154796xU c154796xU = new C154796xU(A04, AbstractC018607g.A00(A04), A0W);
        AbstractC167007dF.A1K(list, A0W);
        String A1H = AbstractC25226BEj.A1H(", ", list, null);
        C25621Ms A0M = AbstractC31177DnL.A0M(A0W);
        A0M.A0B("media/infos/");
        A0M.A9s("media_ids", A1H);
        c154796xU.A03(AbstractC31172DnG.A0R(null, A0M, C74293Vk.class, C74313Vm.class, false), new C32951Eei(2, new C34576FLl(A04, c6fq, A0W, list), C3G2.A0J));
        return null;
    }
}
