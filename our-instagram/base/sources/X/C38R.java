package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.38R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38R {
    public final InterfaceC43071ya A00;
    public final C57112jm A01;

    public C38R(FragmentActivity fragmentActivity, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(c57112jm, 1);
        C14360o3.A0B(fragmentActivity, 2);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(interfaceC60442pS, 5);
        this.A01 = c57112jm;
        this.A00 = new C38S(fragmentActivity, userSession, interfaceC60442pS, interfaceC65282xQ, str, str2, str3, z);
    }

    public final void A00(View view, C38321qM c38321qM) {
        String A0R = AnonymousClass001.A0R("shopping_feed_cta_bar_impression_", c38321qM.getId());
        C57112jm c57112jm = this.A01;
        C0eB c0eB = C0eB.A00;
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(c38321qM, c0eB, A0R);
        c59072n8.A00(this.A00);
        c57112jm.A05(view, c59072n8.A01());
    }
}
