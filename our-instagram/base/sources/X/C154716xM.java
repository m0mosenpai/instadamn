package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154716xM {
    public final UserSession A00;
    public final C57112jm A01;
    public final InterfaceC60442pS A02;
    public final C18920wW A03;

    public C154716xM(UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c57112jm, 3);
        this.A02 = interfaceC60442pS;
        this.A00 = userSession;
        this.A01 = c57112jm;
        this.A03 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
    }

    public final void A00(View view, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str6, 6);
        IMR imr = new IMR(num, str, str2, str3, str4, str5, str6, str7, str8);
        C57112jm c57112jm = this.A01;
        C0eB c0eB = C0eB.A00;
        String A00 = imr.A00();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(imr, c0eB, A00);
        UserSession userSession = this.A00;
        C18920wW c18920wW = this.A03;
        C14360o3.A0B(c18920wW, 1);
        C1BX c1bx = AbstractC62712tA.A00(userSession).A00.A00;
        C14360o3.A07(c1bx);
        c59072n8.A00(new C39108HJg(c18920wW, c1bx, C42369IpW.A00));
        c57112jm.A05(view, c59072n8.A01());
    }
}
