package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Lr7, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49313Lr7 implements InterfaceC37292Gbt {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C211689Zc A03;
    public final List A04;
    public final IngestSessionShim A05;

    public C49313Lr7(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IngestSessionShim ingestSessionShim, C211689Zc c211689Zc, List list) {
        AbstractC25233BEq.A0v(1, context, userSession, ingestSessionShim);
        AbstractC167017dG.A1T(c211689Zc, interfaceC11380iw);
        this.A02 = userSession;
        this.A05 = ingestSessionShim;
        this.A04 = list;
        this.A03 = c211689Zc;
        this.A01 = interfaceC11380iw;
        this.A00 = AbstractC166987dD.A0O(context);
        if (ingestSessionShim.A00.size() != 1) {
            C0w9.A03("blast_list_for_multimedia", "Only one medium supported");
        }
    }

    @Override // X.InterfaceC37292Gbt
    public final boolean CLv(DirectShareTarget directShareTarget) {
        C14360o3.A0B(directShareTarget, 0);
        return this.A04.contains(directShareTarget);
    }

    @Override // X.InterfaceC37292Gbt
    public final List Axe() {
        return this.A04;
    }

    @Override // X.InterfaceC57945Pmr
    public final int Bu9() {
        return 4;
    }

    @Override // X.InterfaceC37292Gbt
    public final void ENk() {
        List list = this.A05.A00;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            UserSession userSession = this.A02;
            C47Z A0h = AbstractC43593JPy.A0h(userSession, A1B);
            if (A0h == null) {
                C0w9.A04("BlastListCandidatesSendJob", AnonymousClass001.A0R("Missing PendingMedia for key: ", A1B), 1);
                C162337Ov.A0i(userSession, null, "unknown_media", AbstractC43593JPy.A0w(), false);
            } else {
                A0h.A5g = true;
                if (A0h.A0e == 0) {
                    A0h.A0e = AbstractC31177DnL.A06();
                }
                List<DirectShareTarget> list2 = this.A04;
                ArrayList A0i2 = AbstractC167007dF.A0i(list2);
                for (DirectShareTarget directShareTarget : list2) {
                    AbstractC46989Kq8.A00(userSession).A01(new C49312Lr6(this.A00, this.A01, userSession, directShareTarget, this.A03, A1B));
                    A0i2.add(C0eB.A00);
                }
            }
            A0i.add(C0eB.A00);
        }
    }
}
