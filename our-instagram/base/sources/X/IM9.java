package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IM9 {
    public Integer A00;
    public final UserSession A01;
    public final HCR A02;
    public final Context A03;
    public final AbstractC018607g A04;

    public IM9(Context context, AbstractC018607g abstractC018607g, UserSession userSession, HCR hcr) {
        C14360o3.A0B(userSession, 2);
        this.A03 = context;
        this.A01 = userSession;
        this.A04 = abstractC018607g;
        this.A02 = hcr;
        this.A00 = C05F.A0C;
    }

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A01);
        A0M.A0L("commerce/community/featured_products/media/%s/", str);
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C74293Vk.class, C74313Vm.class);
        C39030HGg.A00(A0e, this, 17);
        C1GJ.A00(this.A03, this.A04, A0e);
    }
}
