package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;

/* renamed from: X.1Vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27601Vn {
    public static C27601Vn A00;

    public final C55852Or2 A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, SlideContentLayout slideContentLayout, InterfaceC147626kn interfaceC147626kn, Integer num) {
        InterfaceC58278PsW c71151Wom;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC147626kn, 1);
        C14360o3.A0B(slideContentLayout, 3);
        C68856VdC c68856VdC = new C68856VdC();
        Context context = slideContentLayout.getContext();
        if (num.intValue() != 0) {
            Context applicationContext = context.getApplicationContext();
            C14360o3.A07(applicationContext);
            c71151Wom = new C71152Won(applicationContext, interfaceC11380iw, new C69610VsD(slideContentLayout, false), c68856VdC);
        } else {
            Context applicationContext2 = context.getApplicationContext();
            C14360o3.A07(applicationContext2);
            c71151Wom = new C71151Wom(applicationContext2, interfaceC11380iw, new C69610VsD(slideContentLayout, true), c68856VdC);
        }
        return new C55852Or2(c71151Wom);
    }
}
