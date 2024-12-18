package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.4E1, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4E1 {
    public static final View A00(Context context, ViewGroup viewGroup, Fragment fragment, C65722yA c65722yA, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC61782rf interfaceC61782rf, C62812tK c62812tK, C62662t5 c62662t5) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        C14360o3.A0B(c62812tK, 4);
        C14360o3.A0B(c62662t5, 5);
        C14360o3.A0B(c65722yA, 6);
        C14360o3.A0B(interfaceC61782rf, 7);
        C14360o3.A0B(fragment, 8);
        View inflate = LayoutInflater.from(context).inflate(R.layout.clips_netego_view, viewGroup, false);
        C14360o3.A0A(inflate);
        C81433kD c81433kD = new C81433kD(inflate);
        RecyclerView recyclerView = c81433kD.A01;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView.setAdapter(new C4E2(context, fragment, c65722yA, interfaceC11380iw, userSession, interfaceC61782rf, c62812tK, c62662t5));
        inflate.setTag(c81433kD);
        return inflate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x013d, code lost:
    
        if (r0 == 3) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.0e5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(final android.content.Context r32, final android.os.Handler r33, androidx.fragment.app.Fragment r34, X.C65722yA r35, X.InterfaceC11380iw r36, com.instagram.common.session.UserSession r37, X.C76403bk r38, final X.C60R r39, X.C62812tK r40, X.C60S r41, X.C81433kD r42) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4E1.A01(android.content.Context, android.os.Handler, androidx.fragment.app.Fragment, X.2yA, X.0iw, com.instagram.common.session.UserSession, X.3bk, X.60R, X.2tK, X.60S, X.3kD):void");
    }
}
