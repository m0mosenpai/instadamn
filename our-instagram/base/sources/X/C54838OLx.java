package X;

import android.content.Context;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;

/* renamed from: X.OLx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54838OLx {
    public final Context A00;
    public final AbstractC10360h2 A01;
    public final AbstractC018607g A02;
    public final InterfaceC11380iw A03;
    public final C25671My A04;
    public final UserSession A05;

    public C54838OLx(Context context, AbstractC10360h2 abstractC10360h2, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A05 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = abstractC018607g;
        this.A01 = abstractC10360h2;
        this.A04 = AbstractC25651Mw.A00(userSession);
    }

    public final void A00(InterfaceC57917PmN interfaceC57917PmN, Reel reel) {
        int i;
        int i2;
        boolean z = true;
        boolean A1X = AbstractC167007dF.A1X(reel.A0P, ReelType.A0b);
        if (reel.A09 != HighlightReelTypeStr.A06) {
            z = false;
        }
        C193328hC A0I = AbstractC31171DnF.A0I(this.A00);
        if (A1X) {
            i = 2131957708;
        } else {
            i = 2131957670;
            if (z) {
                i = 2131957669;
            }
        }
        A0I.A0A(i);
        A0I.A0M(new DialogInterfaceOnClickListenerC35353FiU(0, reel, this, interfaceC57917PmN, A1X), 2131957640);
        A0I.A0D(DialogInterfaceOnClickListenerC55293OgE.A00);
        if (A1X) {
            i2 = 2131957707;
        } else {
            if (z) {
                i2 = 2131957668;
            }
            AbstractC166987dD.A1W(A0I);
        }
        A0I.A09(i2);
        AbstractC166987dD.A1W(A0I);
    }

    public final void A01(InterfaceC57917PmN interfaceC57917PmN, String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A05;
        String A06 = AbstractC13670mt.A06("highlights/suggestions/%s/delete/", str);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B(A06);
        C1ON A0D = AbstractC31175DnJ.A0D(A0c, C40781ul.class, C55702hA.class, true);
        A0D.A00 = new C52212N9b(interfaceC57917PmN, this, str);
        AbstractC63248Sg4.A02(this.A01);
        C1GJ.A00(this.A00, this.A02, A0D);
    }

    public final void A02(InterfaceC57918PmO interfaceC57918PmO) {
        C193328hC A0I = AbstractC31171DnF.A0I(this.A00);
        A0I.A0A(2131976055);
        A0I.A09(2131976054);
        DialogInterfaceOnClickListenerC55319Ogh.A01(A0I, interfaceC57918PmO, 4, 2131976053);
        A0I.A06();
        AbstractC166987dD.A1W(A0I);
    }
}
