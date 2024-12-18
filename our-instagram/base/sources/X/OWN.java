package X;

import android.content.Context;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OWN {
    public final C35168FfK A00;
    public final InterfaceC16820sZ A01;

    public final void A01(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, List list) {
        AbstractC167007dF.A1E(userSession, 1, list);
        C47Z A03 = C25A.A00(userSession).A03(AbstractC25226BEj.A1I(ingestSessionShim.A00, 0));
        if (list.size() == 1 && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((AudienceListViewModel) it.next()).A05) {
                    A00(context, userSession, ingestSessionShim, C51690MsL.A05, UserStoryTarget.A02, null, null, null, null, false);
                    if (A03 != null) {
                        EnumC76383bi enumC76383bi = EnumC76383bi.A04;
                        C14360o3.A0B(enumC76383bi, 0);
                        A03.A1F = enumC76383bi;
                        return;
                    }
                    return;
                }
            }
        }
        if (A03 != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0q.add(((AudienceListViewModel) it2.next()).A01);
            }
            A03.A49 = A0q;
            EnumC76383bi enumC76383bi2 = EnumC76383bi.A05;
            C14360o3.A0B(enumC76383bi2, 0);
            A03.A1F = enumC76383bi2;
        }
        A00(context, userSession, ingestSessionShim, C51690MsL.A0C, UserStoryTarget.A09, null, null, null, null, false);
    }

    public final void A00(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, C51690MsL c51690MsL, UserStoryTarget userStoryTarget, Integer num, String str, String str2, Map map, boolean z) {
        String str3;
        Integer num2;
        AbstractC167017dG.A1N(context, userSession);
        AbstractC167017dG.A1U(c51690MsL, userStoryTarget);
        if (z) {
            AbstractC54107Nw5.A00(userSession, "primary_click", "share_sheet", str2, str, map);
            if (C196008lp.A00(userSession)) {
                num2 = C05F.A00;
            } else {
                num2 = C05F.A0j;
            }
            str3 = AbstractC54206Nxk.A00(num2);
        } else {
            str3 = null;
        }
        OP0.A01(C82G.A0s, userSession, num, str, str2, z);
        this.A00.A07(new C56383P1s(context, userSession, ingestSessionShim, userStoryTarget, null, str3, z), c51690MsL);
    }

    public OWN(InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = new C35168FfK(new C56382P1r(this, 0));
    }

    public OWN() {
        this(null);
    }
}
