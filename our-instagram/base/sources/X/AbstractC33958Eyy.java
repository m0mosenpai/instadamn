package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eyy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33958Eyy {
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController] */
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        C102884kP c102884kP = (C102884kP) c6fw.A00();
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        C154796xU c154796xU = new C154796xU(A04, AbstractC018607g.A00(A04), A0K);
        ?? obj = new Object();
        obj.A00 = A04;
        String A02 = C71473Il.A00(',').A02(AbstractC31174DnI.A0z(A01));
        C25621Ms A0N = AbstractC31173DnH.A0N(A0K);
        A0N.A0B("media/infos/");
        A0N.A9s("media_ids", A02);
        A0N.A9s("ranked_content", "true");
        A0N.A9s("include_inactive_reel", "true");
        c154796xU.A03(AbstractC31172DnG.A0S(A0N, C74293Vk.class, C74313Vm.class), new C32952Eej(1, new FNK(A04, c6fq, c102884kP, A0G, A0K, obj), C3G2.A0J, obj));
        return null;
    }
}
