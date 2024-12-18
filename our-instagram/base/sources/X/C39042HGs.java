package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.HGs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39042HGs extends AbstractC65806TuP {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C65722yA A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C61762rd A04;
    public final /* synthetic */ C62812tK A05;
    public final /* synthetic */ C62662t5 A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39042HGs(Fragment fragment, C65722yA c65722yA, InterfaceC11380iw interfaceC11380iw, C6FG c6fg, C102884kP c102884kP, UserSession userSession, C61762rd c61762rd, C62812tK c62812tK, C62662t5 c62662t5) {
        super(c6fg, c102884kP);
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A05 = c62812tK;
        this.A06 = c62662t5;
        this.A01 = c65722yA;
        this.A04 = c61762rd;
        this.A00 = fragment;
    }

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C62812tK c62812tK = this.A05;
        C62662t5 c62662t5 = this.A06;
        return C4E1.A00(context, null, this.A00, this.A01, interfaceC11380iw, userSession, this.A04, c62812tK, c62662t5);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        C40932IBf c40932IBf = (C40932IBf) AnonymousClass634.A06(c6fg, c102884kP);
        if (c40932IBf != null) {
            Context context = c6fg.A00;
            UserSession userSession = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            C81433kD c81433kD = (C81433kD) view.getTag();
            C76403bk c76403bk = c40932IBf.A00;
            C62812tK c62812tK = this.A05;
            C60R A01 = this.A04.A01(c76403bk);
            C65722yA c65722yA = this.A01;
            C4E1.A01(context, AbstractC167007dF.A0J(), this.A00, c65722yA, interfaceC11380iw, userSession, c76403bk, A01, c62812tK, C60S.A04, c81433kD);
            return null;
        }
        throw new RuntimeException("No Clips In Feed Unit controller found");
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
