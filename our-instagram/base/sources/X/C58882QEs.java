package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.QEs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58882QEs extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1 {
    public boolean A00;
    public final IgPromoAdsExtension A01;
    public final UserSession A02;
    public final String A03;
    public final String A05;
    public final String A04 = AbstractC58442PvL.A02();
    public final HashMap A06 = AbstractC166987dD.A1G();

    public static final void A00(C58882QEs c58882QEs, String str) {
        SHI shi;
        if (str != null && str.length() != 0) {
            InterfaceC172717mh interfaceC172717mh = ((AbstractC63223SfY) c58882QEs).A03;
            if (interfaceC172717mh != null) {
                shi = new SHI(interfaceC172717mh.getActivity(), interfaceC172717mh);
            } else {
                shi = null;
            }
            AbstractC167007dF.A0J().post(new TNK(shi, str));
        }
    }

    public final String A01() {
        return ((IgPromoAdsPromoCode) AbstractC166987dD.A16(this.A01.A02)).A01;
    }

    @Override // X.AbstractC63223SfY, X.BCM
    public final void destroy() {
        this.A06.clear();
        super.destroy();
    }

    public C58882QEs(IgPromoAdsExtension igPromoAdsExtension, UserSession userSession, String str, String str2) {
        this.A02 = userSession;
        this.A03 = str;
        this.A01 = igPromoAdsExtension;
        this.A05 = str2;
        this.A00 = C14360o3.A0K(igPromoAdsExtension.A01, NetInfoModule.CONNECTION_TYPE_NONE);
    }
}
