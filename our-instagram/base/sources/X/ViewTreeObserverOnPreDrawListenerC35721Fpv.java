package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Fpv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC35721Fpv implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C102884kP A01;

    public ViewTreeObserverOnPreDrawListenerC35721Fpv(View view, C102884kP c102884kP) {
        this.A00 = view;
        this.A01 = c102884kP;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        EnumC58132lV enumC58132lV;
        View view = this.A00;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Activity activity = (Activity) view.getContext();
        C102884kP c102884kP = this.A01;
        String str = "";
        String A0E = c102884kP.A0E();
        if (A0E != null) {
            str = A0E;
        }
        C5SU A0Q = AbstractC31178DnM.A0Q(activity, view, str);
        String A0I = c102884kP.A0I();
        if (A0I != null && A0I.hashCode() == -2048055687 && A0I.equals("up_center")) {
            enumC58132lV = EnumC58132lV.A03;
        } else {
            enumC58132lV = EnumC58132lV.A02;
        }
        A0Q.A05 = enumC58132lV;
        String A0F = c102884kP.A0F();
        if (A0F != null && A0F.equals("always_dark")) {
            A0Q.A07(C5SV.A06);
        }
        AbstractC166997dE.A1P(A0Q);
        return true;
    }
}
