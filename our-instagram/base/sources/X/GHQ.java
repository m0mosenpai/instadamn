package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class GHQ implements InterfaceC1571373s {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C71E A01;

    @Override // X.InterfaceC1571373s
    public final /* synthetic */ void DDS(EnumC153216up enumC153216up) {
    }

    public GHQ(Context context, C71E c71e) {
        this.A01 = c71e;
        this.A00 = context;
    }

    @Override // X.InterfaceC1571373s
    public final void DDQ() {
        C155406yT c155406yT = this.A01.A03.A0C;
        UserSession userSession = c155406yT.A03;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325201302532984L)) {
            C69613Av c69613Av = c155406yT.A07;
            c69613Av.A01.A0K("is_regulated_profile", true);
            c155406yT.A0C.A00();
            Integer num = c69613Av.A00;
            Integer num2 = C05F.A01;
            if (num == num2) {
                c69613Av.A05();
            } else {
                c69613Av.A03();
            }
            C69613Av c69613Av2 = c155406yT.A08;
            if (c69613Av2.A00 == num2) {
                c69613Av2.A05();
            } else {
                c69613Av2.A03();
            }
        }
    }

    @Override // X.InterfaceC1571373s
    public final void DDR() {
        Object obj;
        C71E c71e = this.A01;
        if (!c71e.A00.isDestroyed()) {
            Context context = this.A00;
            C14360o3.A0A(context);
            C155666yv c155666yv = c71e.A03;
            if (c155666yv.A0j) {
                C08730cb c08730cb = C17060sy.A01;
                UserSession userSession = c71e.A01;
                List BmH = AbstractC31171DnF.A0T(userSession, c08730cb).BmH();
                if (BmH != null) {
                    obj = AbstractC001800i.A0J(BmH);
                } else {
                    obj = null;
                }
                AbstractC192798gL A05 = C192108fB.A05(userSession, "com.instagram.sensitivity.see_why_sheets.publisher_news_sheet_action", AbstractC25232BEp.A1F("country", obj, AbstractC166987dD.A1L("media_id", "0"), AbstractC166987dD.A1L("module", c155666yv.A0b.getModuleName())));
                C32394EOv.A00(A05, context, c71e, 9);
                C1GJ.A03(A05);
                return;
            }
            AbstractC31177DnL.A0u(context, c71e.A01, C2Fb.A1W, AbstractC111324zv.A00(2457));
        }
    }
}
