package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wellbeing.equity.diversity.DiversityInfoRepository;
import java.util.LinkedHashMap;

/* renamed from: X.1oC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37141oC implements InterfaceC37151oD {
    @Override // X.InterfaceC37151oD
    public final void Ayn(UserSession userSession, InterfaceC58091PpG interfaceC58091PpG, String str) {
        C14360o3.A0B(userSession, 0);
        DiversityInfoRepository A00 = AbstractC54281Nz1.A00(userSession);
        C19L c19l = A00.A02;
        PZQ pzq = new PZQ(interfaceC58091PpG, A00, str, null, 36);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, pzq, c19l);
    }

    @Override // X.InterfaceC37151oD
    public final void Eko(AbstractC59962oe abstractC59962oe, UserSession userSession, User user, String str, boolean z) {
        String str2;
        C14360o3.A0B(userSession, 0);
        if (abstractC59962oe.isAdded()) {
            String str3 = null;
            C62862tP A03 = C62862tP.A03(abstractC59962oe, userSession, null);
            C09530e4 c09530e4 = new C09530e4("logging_entry_point", str);
            boolean z2 = false;
            if (user != null) {
                str3 = user.getId();
            }
            LinkedHashMap A07 = AbstractC06930Yk.A07(c09530e4, new C09530e4("ig_userid", str3));
            if (user != null) {
                if (!z) {
                    Boolean CT7 = user.A03.CT7();
                    if (CT7 != null && CT7.booleanValue()) {
                        z2 = true;
                    }
                } else {
                    str2 = "com.instagram.equity.diversity_info.edit_self_designation.action";
                    AbstractC192798gL A05 = C192108fB.A05(userSession, str2, A07);
                    A05.A00(new C32380EOg(A03));
                    C1GJ.A03(A05);
                }
            }
            A07.put("show_learn_more_bottomsheet", String.valueOf(!z2));
            str2 = "com.instagram.equity.diversity_info.launch_bottomsheet.action";
            AbstractC192798gL A052 = C192108fB.A05(userSession, str2, A07);
            A052.A00(new C32380EOg(A03));
            C1GJ.A03(A052);
        }
    }
}
