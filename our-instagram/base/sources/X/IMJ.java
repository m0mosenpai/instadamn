package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IMJ {
    public Integer A00;
    public final UserSession A01;
    public final ID5 A02;
    public final String A03;
    public final Context A04;
    public final AbstractC018607g A05;
    public final C39030HGg A06;

    public final void A00(String str) {
        Integer num = this.A00;
        Integer num2 = C05F.A00;
        if (num != num2) {
            this.A00 = num2;
            C25621Ms A0M = AbstractC31177DnL.A0M(this.A01);
            A0M.A0B(this.A03);
            A0M.A0H("initially_selected_catalog_id", str);
            C1ON A0e = AbstractC25227BEk.A0e(A0M, HAV.class, ISH.class);
            A0e.A00 = this.A06;
            C1GJ.A00(this.A04, this.A05, A0e);
        }
    }

    public IMJ(Context context, AbstractC018607g abstractC018607g, UserSession userSession, ID5 id5, String str) {
        AbstractC167017dG.A1P(id5, userSession);
        this.A02 = id5;
        this.A01 = userSession;
        this.A04 = context;
        this.A05 = abstractC018607g;
        this.A03 = str;
        this.A06 = new C39030HGg(this, 21);
        this.A00 = C05F.A0C;
    }
}
