package X;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.3aP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75583aP {
    public final UserSession A00;
    public final InterfaceC690038m A01;
    public final InterfaceC75453aC A02;
    public final C1M1 A03;

    public C75583aP(UserSession userSession, InterfaceC690038m interfaceC690038m, InterfaceC75453aC interfaceC75453aC, C1M1 c1m1) {
        C14360o3.A0B(interfaceC690038m, 3);
        C14360o3.A0B(interfaceC75453aC, 4);
        this.A00 = userSession;
        this.A03 = c1m1;
        this.A01 = interfaceC690038m;
        this.A02 = interfaceC75453aC;
    }

    public static C206189Bb A00(Context context, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75583aP c75583aP, C75113Zb c75113Zb) {
        CharSequence A00;
        CharSequence charSequence;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(interfaceC60442pS, 3);
        boolean z = c75113Zb.A2a;
        UserSession userSession = c75583aP.A00;
        if (!AbstractC75433aA.A00(userSession, c38321qM, interfaceC60442pS, z)) {
            return null;
        }
        String A2m = c38321qM.A2m();
        String A2n = c38321qM.A2n();
        if (A2m == null || AbstractC001900j.A0T(A2m) || A2n == null || AbstractC001900j.A0T(A2n)) {
            String A2o = c38321qM.A2o();
            if (A2o == null) {
                A00 = "";
            } else {
                Spanned fromHtml = Html.fromHtml(A2o, 63);
                C14360o3.A07(fromHtml);
                C85383rT c85383rT = new C85383rT(new SpannableStringBuilder(fromHtml), userSession);
                c85383rT.A0L = true;
                c85383rT.A01 = AbstractC53242c7.A0F(context, R.attr.textColorBoldLink);
                c85383rT.A03(new C29296Cvr(c38321qM));
                c85383rT.A0Q = true;
                A00 = c85383rT.A00();
                C14360o3.A0A(A00);
            }
            charSequence = A00;
        } else {
            charSequence = CJ1.A00(A2m, A2n);
        }
        return new C206189Bb(new C9BW(26, new C9FY(39, interfaceC60442pS, c75583aP, c75113Zb, c38321qM), new C9FM(19, c38321qM, c75583aP, c75113Zb)), charSequence, c75113Zb.A27);
    }
}
