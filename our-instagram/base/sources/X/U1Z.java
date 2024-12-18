package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* loaded from: classes11.dex */
public final class U1Z {
    public final C18920wW A00;
    public final C1BX A01;
    public final AbstractC64162vb A02;
    public final C57112jm A03;
    public final java.util.Set A04;

    public final void A01(View view, Integer num, String str, String str2) {
        C14360o3.A0B(str2, 3);
        C59072n8 A00 = C59062n7.A00(new C69248VkH(num, str, str2, ""), 0, str);
        A00.A00(this.A02);
        C59062n7 A01 = A00.A01();
        this.A04.add(view);
        C57112jm c57112jm = this.A03;
        if (c57112jm != null) {
            c57112jm.A05(view, A01);
        }
    }

    public final void A00() {
        java.util.Set<View> set = this.A04;
        for (View view : set) {
            C57112jm c57112jm = this.A03;
            if (c57112jm != null) {
                c57112jm.A04(view);
            }
        }
        set.clear();
    }

    public U1Z(C18920wW c18920wW, UserSession userSession, C57112jm c57112jm) {
        AbstractC167017dG.A1R(userSession, c18920wW);
        this.A03 = c57112jm;
        this.A00 = c18920wW;
        this.A04 = new LinkedHashSet();
        C1BX A01 = C1BX.A03.A01(AbstractC62752tE.A00(userSession, "ig_search_lazy_preferences"));
        this.A01 = A01;
        this.A02 = new C66133U1a(A01, this);
    }

    public final void A02(Integer num, String str, String str2, String str3) {
        boolean A1U = AbstractC167007dF.A1U(str2);
        String str4 = str;
        if (str2.length() > 0) {
            str4 = AnonymousClass001.A0C(str, '1');
        }
        C1BX c1bx = this.A01;
        if (!c1bx.A0F(str4)) {
            this.A02.A03(new C69248VkH(num, str, str2, str3), Integer.valueOf(A1U ? 1 : 0));
            c1bx.A0C(str4, System.currentTimeMillis());
        }
    }
}
