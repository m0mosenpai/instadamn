package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.api.schemas.GiphyRequestSurface;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.L7s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47770L7s {
    public EnumC46159Kbx A00 = EnumC46159Kbx.A02;
    public String A01 = "-no query";
    public final C47342Kvr A02;
    public final L1L A03;
    public final L1M A04;
    public final AbstractC47789L8v A05;

    public C47770L7s(GiphyRequestSurface giphyRequestSurface, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, C47342Kvr c47342Kvr, DirectThreadKey directThreadKey, boolean z) {
        InterfaceC50474MQc c48730Lgy;
        this.A02 = c47342Kvr;
        boolean z2 = directThreadKey != null && AbstractC159387Cy.A04(userSession, directThreadKey, C05F.A06).A00();
        C48729Lgx c48729Lgx = new C48729Lgx(this);
        if (!z && !z2) {
            c48730Lgy = new C48731Lgz(giphyRequestSurface, interfaceC11380iw, userSession, AbstractC166987dD.A1J(EnumC46201Kcd.GIPHY_GIFS), false);
        } else {
            c48730Lgy = new C48730Lgy(interfaceC11380iw, userSession, EnumC46201Kcd.GIPHY_GIFS);
        }
        this.A05 = new KQM(c1gl, c48729Lgx, c48730Lgy, false);
        this.A03 = new L1L(userSession, c1gl, new C50359MLl(this, 1));
        this.A04 = new L1M(userSession, c1gl, new C50359MLl(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(EnumC46159Kbx enumC46159Kbx, String str) {
        C1GL c1gl;
        C1ON A00;
        int i;
        L1L l1l;
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC46159Kbx, 1);
        if (this.A00 == enumC46159Kbx && C14360o3.A0K(this.A01, str)) {
            return;
        }
        AbstractC47789L8v abstractC47789L8v = this.A05;
        abstractC47789L8v.A00 = "";
        C13400mQ c13400mQ = abstractC47789L8v.A01;
        c13400mQ.A00();
        c13400mQ.A01 = "";
        c13400mQ.A00();
        this.A00 = enumC46159Kbx;
        this.A01 = str;
        LIE lie = this.A02.A00;
        RecyclerView recyclerView = lie.A01;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        IgTextView igTextView = lie.A02;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        View view = lie.A00;
        if (view != null) {
            view.setVisibility(0);
        }
        int ordinal = enumC46159Kbx.ordinal();
        if (ordinal != 2) {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        return;
                    } else {
                        throw B4Z.A00();
                    }
                }
                L1M l1m = this.A04;
                C2JM A0b = AbstractC25225BEi.A0b();
                C2JM A0b2 = AbstractC25225BEi.A0b();
                A0b.A03("offset", 0);
                A0b.A03("take", 32);
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGSavedGifsMediaQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59426QeN.class, false, null, 0, null, "xfb_saved_gifs_for_eimu", AbstractC166987dD.A1E());
                c1gl = l1m.A00;
                A00 = AnonymousClass963.A00(l1m.A01.A03(pandoGraphQLRequest));
                i = 12;
                l1l = l1m;
            } else {
                L1L l1l2 = this.A03;
                C2JM A0b3 = AbstractC25225BEi.A0b();
                C2JM A0b4 = AbstractC25225BEi.A0b();
                A0b3.A03("offset", 0);
                A0b3.A03("take", 32);
                PandoGraphQLRequest pandoGraphQLRequest2 = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGRecentlyUsedMediaQuery", A0b3.getParamsCopy(), A0b4.getParamsCopy(), C59420QeH.class, false, null, 0, null, "xfb_recently_used_gifs_for_eimu", AbstractC166987dD.A1E());
                c1gl = l1l2.A00;
                A00 = AnonymousClass963.A00(l1l2.A01.A03(pandoGraphQLRequest2));
                i = 11;
                l1l = l1l2;
            }
            C44093JeI.A00(A00, l1l, i);
            c1gl.schedule(A00);
            return;
        }
        abstractC47789L8v.A00(str);
    }
}
