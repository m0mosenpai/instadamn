package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.gallery.Draft;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JlM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44454JlM extends C193578hc {
    public final Application A00;
    public final UserSession A01;
    public final C43904JbF A02;
    public final MXI A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final ClipsDraftRepository A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44454JlM(Application application, UserSession userSession, ClipsDraftRepository clipsDraftRepository, C43904JbF c43904JbF, MXI mxi) {
        super(application);
        C14360o3.A0B(userSession, 2);
        AbstractC25233BEq.A0x(3, c43904JbF, mxi, clipsDraftRepository);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = c43904JbF;
        this.A03 = mxi;
        this.A06 = clipsDraftRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C50627MWo((C7U) null, (DefaultConstructorMarker) null, (C5Hc) null, 3, 38));
        this.A05 = A1H;
        this.A04 = A1H;
    }

    public final void A0E() {
        Object value;
        C50627MWo c50627MWo;
        ArrayList A0q;
        String str;
        C7U c7u;
        C7U c7u2;
        C05A c05a = this.A05;
        do {
            value = c05a.getValue();
            c50627MWo = (C50627MWo) value;
            ArrayList A00 = AbstractC43876Jag.A00(this.A01);
            A0q = AbstractC167017dG.A0q(A00);
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                Draft draft = (Draft) it.next();
                Context A0O = AbstractC166987dD.A0O(this.A00);
                String str2 = draft.A04;
                String str3 = draft.A02;
                if (str3 == null) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append("Untitled ");
                    if (draft.A05) {
                        c7u2 = C7U.A04;
                    } else if (draft.A06) {
                        c7u2 = C7U.A06;
                    } else {
                        c7u2 = C7U.A05;
                    }
                    str3 = AbstractC166997dE.A0v(c7u2, A1C);
                }
                Long l = draft.A01;
                if (l != null) {
                    str = C55050Oa1.A00.A01(A0O, l.longValue());
                } else {
                    str = null;
                }
                String str4 = "";
                if (str == null) {
                    str = "";
                }
                if (draft.A00 != 0 && draft.A06) {
                    str4 = draft.B8m();
                }
                if (draft.A05) {
                    c7u = C7U.A04;
                } else if (draft.A06) {
                    c7u = C7U.A06;
                } else {
                    c7u = C7U.A05;
                }
                A0q.add(new C45057Jwm(c7u, str2, str3, str, str4, draft.A03, draft.A07, false));
            }
        } while (!c05a.AIi(value, C50627MWo.A00((C7U) c50627MWo.A00, AbstractC133095zb.A03(A0q))));
    }
}
