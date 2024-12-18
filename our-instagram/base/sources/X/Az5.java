package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class Az5 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ C52145N5u A03;

    public Az5(Activity activity, View view, View view2, C52145N5u c52145N5u) {
        this.A03 = c52145N5u;
        this.A02 = view;
        this.A00 = activity;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C52145N5u c52145N5u = this.A03;
        View view = this.A02;
        C14360o3.A0C(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        C22P c22p = (C22P) c52145N5u.requireArguments().getSerializable("ARGS_CAMERA_ENTRY_POINT");
        if (c22p == null) {
            c22p = C22P.A14;
        }
        C60762q0 c60762q0 = new C60762q0();
        C81I c81i = new C81I();
        Activity activity = this.A00;
        UserSession A0r = AbstractC166987dD.A0r(c52145N5u.A03);
        AiK aiK = new AiK(this.A01);
        AbstractC167007dF.A1I(viewGroup, 1, A0r);
        C81J A01 = C81J.A01();
        C23764Afb c23764Afb = new C23764Afb(0);
        c23764Afb.getClass();
        A01.A0l = c23764Afb;
        A01.A0S = A0r;
        C81J.A03(activity, c52145N5u, A01);
        C128535rM A00 = C81J.A00(viewGroup, c60762q0, A01, c81i);
        A01.A0B = c22p;
        A01.A0O = c52145N5u;
        A01.A0f = null;
        A01.A0g = null;
        A01.A3N = false;
        A01.A47 = false;
        A01.A3M = false;
        A01.A3Q = false;
        A01.A3k = false;
        A01.A22 = true;
        A01.A3e = true;
        A01.A0V = C82R.A00(A00, new C81W[0]);
        A01.A1A = aiK;
        c52145N5u.A01 = new C81Y(A01);
    }
}
