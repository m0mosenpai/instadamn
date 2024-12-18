package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.3P5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3P5 {
    public static final void A00(final Context context, View.OnClickListener onClickListener, final InterfaceC11380iw interfaceC11380iw, final UserSession userSession, final C3G4 c3g4, final C72973Oy c72973Oy, final InterfaceC64002vL interfaceC64002vL, final List list, final int i, boolean z) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        C14360o3.A0B(c72973Oy, 3);
        C14360o3.A0B(c3g4, 4);
        C14360o3.A0B(interfaceC64002vL, 6);
        C72983Oz c72983Oz = c72973Oy.A02;
        C3P6.A00(userSession, c3g4, c72983Oz);
        Reel reel = c3g4.A03;
        boolean A0r = reel.A0r();
        C3P1 c3p1 = c72973Oy.A05;
        View A00 = c3p1.A00();
        if (A0r) {
            C0fQ.A00(onClickListener, A00);
        } else {
            A00.setOnClickListener(null);
        }
        C3P7.A00(userSession, reel.A09(userSession), c3g4, c3p1, z);
        c72973Oy.A00(userSession, reel.A0r()).A02();
        C3PF A002 = c72973Oy.A00(userSession, reel.A0r());
        View[] viewArr = {c72983Oz.A00()};
        List list2 = A002.A09;
        list2.clear();
        list2.add(new C3PA(viewArr[0]));
        c72973Oy.A00 = new C3PL() { // from class: X.3PK
            @Override // X.C3PL
            public final void De2(String str) {
                User user;
                int i2;
                Integer num;
                C3G4 c3g42 = c3g4;
                Reel reel2 = c3g42.A03;
                boolean A0d = reel2.A0d();
                boolean A0s = reel2.A0s();
                C1NB c1nb = reel2.A0W;
                if (c1nb != null) {
                    user = c1nb.CDj();
                } else {
                    user = null;
                }
                if (A0s && user != null) {
                    interfaceC64002vL.DeF(user.getId());
                    return;
                }
                UserSession userSession2 = userSession;
                if (reel2.A15(userSession2) && reel2.A0g()) {
                    interfaceC64002vL.D1e(reel2);
                    return;
                }
                if (AbstractC31206Dnp.A01(userSession2)) {
                    InterfaceC64002vL interfaceC64002vL2 = interfaceC64002vL;
                    int i3 = i;
                    AbstractC31206Dnp.A00(context, userSession2, new C56827PJx(c72973Oy, interfaceC64002vL2, str, list, i3));
                    return;
                }
                if (!A0d ? AbstractC43607JQo.A00(userSession2, C05F.A00) : AbstractC43607JQo.A00(userSession2, C05F.A0C)) {
                    C23031Ai A003 = AbstractC23021Ah.A00(userSession2);
                    InterfaceC19630xq interfaceC19630xq = A003.A01;
                    if (A0d) {
                        i2 = 224;
                    } else {
                        i2 = 98;
                    }
                    int i4 = interfaceC19630xq.getInt(AbstractC43591JPw.A00(i2), 0);
                    C1R0 C98 = C26661Qv.A00(userSession2).C98();
                    InterfaceC64002vL interfaceC64002vL3 = interfaceC64002vL;
                    int i5 = i;
                    ViewOnClickListenerC55433Oji viewOnClickListenerC55433Oji = new ViewOnClickListenerC55433Oji(A003, c72973Oy, interfaceC64002vL3, str, list, i4, i5, A0d);
                    Context context2 = context;
                    InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
                    ImageUrl A07 = reel2.A07();
                    Boolean valueOf = Boolean.valueOf(c3g42.A04(userSession2));
                    if (A0d) {
                        num = C05F.A0C;
                    } else {
                        num = C05F.A00;
                    }
                    AbstractC34362FDe.A00(context2, viewOnClickListenerC55433Oji, C98, interfaceC11380iw2, A07, valueOf, num);
                    return;
                }
                InterfaceC64002vL interfaceC64002vL4 = interfaceC64002vL;
                int i6 = i;
                interfaceC64002vL4.De7(c72973Oy, null, null, str, null, list, i6, false);
            }

            @Override // X.C3PL
            public final void Ddt(String str) {
                interfaceC64002vL.DeC(list, i, str);
            }
        };
    }
}
