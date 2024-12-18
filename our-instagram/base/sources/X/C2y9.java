package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.2y9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2y9 extends AbstractC65632xz {
    public InterfaceC63392uM A00;
    public final Context A01;
    public final Handler A02;
    public final Fragment A03;
    public final C65722yA A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final InterfaceC61782rf A07;
    public final C62812tK A08;
    public final C62662t5 A09;

    public C2y9(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC61782rf interfaceC61782rf, C62812tK c62812tK, C62662t5 c62662t5) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(c62812tK, 4);
        C14360o3.A0B(c62662t5, 5);
        C14360o3.A0B(interfaceC61782rf, 6);
        C14360o3.A0B(fragment, 7);
        this.A01 = context;
        this.A06 = userSession;
        this.A05 = interfaceC11380iw;
        this.A08 = c62812tK;
        this.A09 = c62662t5;
        this.A07 = interfaceC61782rf;
        this.A03 = fragment;
        this.A04 = new C65722yA(interfaceC11380iw, userSession);
        this.A02 = new Handler(Looper.getMainLooper());
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "ClipsNetego";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return ((C76403bk) obj).getId().hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return Integer.MIN_VALUE;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        InterfaceC63392uM interfaceC63392uM;
        int A03 = C0f9.A03(-123916424);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        C76403bk c76403bk = (C76403bk) obj;
        Context context = this.A01;
        UserSession userSession = this.A06;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.mainfeed.clips.ClipsNetegoViewHolder");
        C62812tK c62812tK = this.A08;
        C65722yA c65722yA = this.A04;
        Handler handler = this.A02;
        C14360o3.A0B(c76403bk, 0);
        C60S c60s = new C60S(c76403bk.A06, c76403bk.A09, c76403bk.A0A, c76403bk.A0M.size());
        C4E1.A01(context, handler, this.A03, c65722yA, interfaceC11380iw, userSession, c76403bk, (C60R) obj2, c62812tK, c60s, (C81433kD) tag);
        if (c76403bk.A0P && (interfaceC63392uM = this.A00) != null) {
            interfaceC63392uM.EDV(view, (InterfaceC73233Pz) obj);
        }
        C0f9.A0A(-1634940130, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        InterfaceC63392uM interfaceC63392uM;
        C76403bk c76403bk = (C76403bk) obj;
        C60R c60r = (C60R) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c76403bk, 1);
        C14360o3.A0B(c60r, 2);
        if (new C60S(c76403bk.A06, c76403bk.A09, c76403bk.A0A, c76403bk.A0M.size()).A00()) {
            anonymousClass306.A7a(1);
        } else {
            anonymousClass306.A7a(0);
        }
        if (c76403bk.A0P && (interfaceC63392uM = this.A00) != null) {
            interfaceC63392uM.A9W(c76403bk, c60r);
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1115493596);
        C14360o3.A0B(viewGroup, 1);
        Context context = this.A01;
        UserSession userSession = this.A06;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        C62812tK c62812tK = this.A08;
        C62662t5 c62662t5 = this.A09;
        View A00 = C4E1.A00(context, viewGroup, this.A03, this.A04, interfaceC11380iw, userSession, this.A07, c62812tK, c62662t5);
        C0f9.A0A(1604633409, A03);
        return A00;
    }
}
