package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.IxV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42855IxV implements InterfaceC43442JHg {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C1821585z A02;
    public final /* synthetic */ Product A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // X.InterfaceC43442JHg
    public final void Dxo(List list) {
        C14360o3.A0B(list, 0);
        C1821585z c1821585z = this.A02;
        if (c1821585z.A0A.isVisible()) {
            if (AbstractC166987dD.A1b(list)) {
                AbstractC41666Iby.A02(((JGU) list.get(0)).BSe(this.A00, c1821585z.A0B), 0, AnonymousClass001.A0R(this.A05, "_product_add_to_cart_failure"));
            } else {
                throw AbstractC31172DnG.A0u();
            }
        }
        UserSession userSession = c1821585z.A0B;
        String str = this.A05;
        String str2 = this.A07;
        String A0e = AbstractC37302Gc3.A0e(this.A04);
        String str3 = this.A06;
        String str4 = c1821585z.A0G;
        AbstractC41757IeY.A05(c1821585z, userSession, C1821585z.A00(c1821585z), null, this.A03, str, str2, A0e, str3, str4);
    }

    public C42855IxV(Context context, FragmentActivity fragmentActivity, C1821585z c1821585z, Product product, User user, String str, String str2, String str3) {
        this.A02 = c1821585z;
        this.A01 = fragmentActivity;
        this.A04 = user;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A03 = product;
        this.A00 = context;
    }

    @Override // X.InterfaceC43442JHg
    public final void DVJ(String str) {
        C1821585z c1821585z = this.A02;
        if (c1821585z.A0A.isVisible()) {
            AbstractC41666Iby.A01(this.A00);
        }
        UserSession userSession = c1821585z.A0B;
        String str2 = this.A05;
        String str3 = this.A07;
        String A0e = AbstractC37302Gc3.A0e(this.A04);
        String str4 = this.A06;
        String str5 = c1821585z.A0G;
        AbstractC41757IeY.A05(c1821585z, userSession, C1821585z.A00(c1821585z), null, this.A03, str2, str3, A0e, str4, str5);
    }

    @Override // X.InterfaceC43442JHg
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A00;
        String str;
        C41730Ie1 c41730Ie1 = (C41730Ie1) obj;
        C14360o3.A0B(c41730Ie1, 0);
        C1821585z c1821585z = this.A02;
        UserSession userSession = c1821585z.A0B;
        AbstractC23021Ah.A00(userSession).A0R();
        String str2 = "";
        if (c1821585z.A0A.isVisible()) {
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity fragmentActivity = this.A01;
            User user = this.A04;
            if (user == null || (str = AbstractC76433bn.A00(user)) == null) {
                str = "";
            }
            c1xj.A01(fragmentActivity, userSession, str, c1821585z.A0G, "instagram_shopping_camera", "shopping_camera", this.A06, c41730Ie1.A05());
        }
        C1563470e A0G = AbstractC37300Gc1.A0G(userSession);
        C14360o3.A07(A0G);
        String str3 = this.A05;
        String str4 = this.A07;
        User user2 = this.A04;
        String A0e = AbstractC37302Gc3.A0e(user2);
        String str5 = this.A06;
        String str6 = c1821585z.A0G;
        String str7 = A0G.A01;
        if (str7 != null) {
            if (user2 != null && (A00 = AbstractC76433bn.A00(user2)) != null) {
                str2 = A00;
            }
            String A09 = A0G.A09(str2);
            if (A09 != null) {
                AbstractC41757IeY.A04(c1821585z, userSession, C1821585z.A00(c1821585z), null, c41730Ie1, str3, str4, A0e, str5, str6, "instagram_shopping_camera", str7, A09, null, null, this.A03.A04());
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
