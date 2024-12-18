package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.7Id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160697Id {
    public final C005001p A00 = new C005001p(50);
    public final Map A01;

    public final void A00(View view, C7VC c7vc, int i) {
        C160727Ig c160727Ig = (C160727Ig) this.A01.get(Integer.valueOf(i));
        if (c160727Ig != null && ((Boolean) c160727Ig.A01.getValue()).booleanValue() && (c7vc instanceof C160787Im)) {
            C57112jm A00 = AbstractC58982mw.A00(view);
            C0eB c0eB = C0eB.A00;
            String A0h = ((C160787Im) c7vc).A0e.A0h();
            C59062n7 c59062n7 = C59062n7.A07;
            C59072n8 c59072n8 = new C59072n8(c7vc, c0eB, A0h);
            c59072n8.A00(new JUU(this));
            C59062n7 A01 = c59072n8.A01();
            if (A00 != null) {
                A00.A05(view, A01);
            }
        }
    }

    public C160697Id(UserSession userSession) {
        AbstractC09440dt.A01(C160707Ie.A00);
        this.A01 = AbstractC16850sd.A0M(new C09530e4(29, new C160727Ig(new C160717If(userSession), AbstractC09440dt.A01(new C9E8(userSession, 28)))));
    }
}
