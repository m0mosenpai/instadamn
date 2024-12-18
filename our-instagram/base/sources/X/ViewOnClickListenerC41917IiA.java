package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.IiA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41917IiA implements View.OnClickListener {
    public final /* synthetic */ C1563970j A00;
    public final /* synthetic */ Integer A01;

    public ViewOnClickListenerC41917IiA(C1563970j c1563970j, Integer num) {
        this.A00 = c1563970j;
        this.A01 = num;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC39649Hie enumC39649Hie;
        EnumC39644HiZ enumC39644HiZ;
        int A05 = C0f9.A05(-1890084979);
        C1563970j c1563970j = this.A00;
        String str = c1563970j.A0F;
        int hashCode = str.hashCode();
        if (hashCode != -851590075) {
            if (hashCode != -547803026) {
                if (hashCode == 2017970797 && str.equals("product_detail_page")) {
                    enumC39649Hie = EnumC39649Hie.A07;
                }
                enumC39649Hie = EnumC39649Hie.A0A;
            } else {
                if (str.equals("instagram_shopping_reconsideration_destination")) {
                    enumC39649Hie = EnumC39649Hie.A03;
                }
                enumC39649Hie = EnumC39649Hie.A0A;
            }
        } else {
            if (str.equals("instagram_shopping_home_video")) {
                enumC39649Hie = EnumC39649Hie.A05;
            }
            enumC39649Hie = EnumC39649Hie.A0A;
        }
        if (str.equals("product_detail_page")) {
            enumC39644HiZ = EnumC39644HiZ.PDP;
        } else {
            enumC39644HiZ = EnumC39644HiZ.SHOP_HOME;
        }
        C1XJ c1xj = c1563970j.A0C;
        UserSession userSession = c1563970j.A09;
        String str2 = c1563970j.A0H;
        c1xj.A1H(userSession, this.A01, str2, str);
        c1xj.A0o(c1563970j.A02, EnumC39651Hig.A06, enumC39644HiZ, EnumC39650Hif.A05, enumC39649Hie, userSession, str2, str, c1563970j.A0D, c1563970j.A0G, c1563970j.A0I, c1563970j.A0E, null, false);
        C0f9.A0C(1376257743, A05);
    }
}
