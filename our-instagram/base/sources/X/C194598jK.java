package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.8jK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194598jK {
    public A7E A00;
    public final Activity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C1810981l A04;
    public final C193958iG A05;
    public final C194478j8 A06;
    public final C193408hL A07;
    public final C194588jJ A08;
    public final InterfaceC09390do A09;
    public final boolean A0A;

    public C194598jK(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, C193958iG c193958iG, C194478j8 c194478j8, C194588jJ c194588jJ) {
        C14360o3.A0B(c193958iG, 4);
        C14360o3.A0B(c194478j8, 6);
        this.A01 = activity;
        this.A03 = userSession;
        this.A04 = c1810981l;
        this.A05 = c193958iG;
        this.A08 = c194588jJ;
        this.A06 = c194478j8;
        this.A02 = interfaceC11380iw;
        C193408hL c193408hL = new C193408hL();
        this.A07 = c193408hL;
        this.A09 = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E4(this, 0));
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318213390211106L);
        this.A0A = A06;
        if (A06) {
            A7E a7e = (A7E) userSession.A01(A7E.class, new B5y(userSession, 37));
            this.A00 = a7e;
            if (a7e != null) {
                c193408hL = a7e.A00;
            } else {
                return;
            }
        }
        WeakReference weakReference = AbstractC23451Ch.A00;
        AbstractC23451Ch.A00 = new WeakReference(c193408hL);
    }
}
