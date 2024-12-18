package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.P8n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56541P8n implements GYD {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C145176gc A03;
    public final /* synthetic */ String A04;

    public C56541P8n(Context context, AbstractC59962oe abstractC59962oe, C38321qM c38321qM, C145176gc c145176gc, String str) {
        this.A03 = c145176gc;
        this.A04 = str;
        this.A01 = abstractC59962oe;
        this.A00 = context;
        this.A02 = c38321qM;
    }

    @Override // X.GYD
    public final void DyM(List list, boolean z) {
        String str;
        C145176gc c145176gc = this.A03;
        UserSession userSession = c145176gc.A09;
        if (userSession != null) {
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
            A0w.E77("has_added_anytime_story_mentions", true);
            A0w.apply();
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1V(A0q, it);
            }
            C52220N9j c52220N9j = new C52220N9j(4, this.A00, c145176gc, this.A02, z);
            UserSession userSession2 = c145176gc.A09;
            if (userSession2 != null) {
                C186808Px A00 = AbstractC186788Pv.A00(userSession2);
                if (AbstractC166987dD.A1b(list)) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AbstractC167017dG.A1V(A1E, it2);
                    }
                    A00.A01(this.A04, A1E);
                }
                AbstractC59962oe abstractC59962oe = this.A01;
                C61972ry c61972ry = new C61972ry(abstractC59962oe.requireContext(), AbstractC018607g.A00(abstractC59962oe), null);
                UserSession userSession3 = c145176gc.A09;
                if (userSession3 != null) {
                    String str2 = this.A04;
                    C25621Ms A0c = AbstractC167017dG.A0c(userSession3);
                    AbstractC37301Gc2.A1M(A0c, "media/add_mentioned_users/", str2);
                    A0c.A9s("include_e2ee_mentioned_user_list", "true");
                    try {
                        StringWriter A0O = AbstractC37300Gc1.A0O();
                        C17z A06 = AbstractC37301Gc2.A06(A0O);
                        Iterator it3 = A0q.iterator();
                        while (it3.hasNext()) {
                            A06.A0u(AbstractC166987dD.A1B(it3));
                        }
                        str = MSZ.A0s(A06, A0O);
                    } catch (IOException e) {
                        C0w9.A06("MentionsApiUtil", AbstractC111324zv.A00(155), e);
                        str = null;
                    }
                    A0c.A9s("user_ids", str);
                    A0c.A0I("mention_sharing_enabled", z);
                    C1ON A0D = AbstractC31175DnJ.A0D(A0c, N2S.class, ONX.class, true);
                    A0D.A00 = c52220N9j;
                    c61972ry.schedule(A0D);
                    return;
                }
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }
}
