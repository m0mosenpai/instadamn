package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.HjY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39702HjY {
    public Context A00;
    public UserSession A01;
    public String A02;

    public final void A00(InterfaceC11380iw interfaceC11380iw, C1P1 c1p1, C38321qM c38321qM, Integer num) {
        int i;
        int intValue = num.intValue();
        Context context = this.A00;
        if (intValue != 1) {
            i = 2131969618;
        } else {
            i = 2131969617;
        }
        String string = context.getString(i);
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0K = AbstractC31171DnF.A0K();
        A0K.A04();
        A0K.A0D = string;
        A0K.A0L = true;
        A0K.A0D(this.A00.getString(2131969619));
        A0K.A03();
        A0K.A09 = c38321qM.A1S();
        A0K.A06();
        A0K.A0A(new C42701Iuw(interfaceC11380iw, c1p1, c38321qM, this, num));
        AbstractC31178DnM.A1N(c41451vu, A0K);
    }
}
