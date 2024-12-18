package X;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FPe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34669FPe {
    public final AbstractC59962oe A00;
    public final C07270a1 A01;

    public C34669FPe(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1) {
        C14360o3.A0B(c07270a1, 1);
        this.A01 = c07270a1;
        this.A00 = abstractC59962oe;
    }

    public final void A00(C34691FQc c34691FQc, String str) {
        FragmentActivity activity;
        Window window;
        boolean z = c34691FQc != null && c34691FQc.A02;
        AbstractC31172DnG.A1A();
        C07270a1 c07270a1 = this.A01;
        Bundle A09 = AbstractC31176DnK.A09("IgSessionManager.LOGGED_OUT_TOKEN");
        A09.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str);
        A09.putBoolean("com.instagram.android.login.fragment.ARGUMENT_USER_IS_VALID", z);
        ELH elh = new ELH();
        elh.setArguments(A09);
        AbstractC59962oe abstractC59962oe = this.A00;
        AbstractC31177DnL.A16(elh, abstractC59962oe.requireActivity(), c07270a1);
        FragmentActivity activity2 = abstractC59962oe.getActivity();
        if (activity2 != null && activity2.getWindow() != null && (activity = abstractC59962oe.getActivity()) != null && (window = activity.getWindow()) != null) {
            window.clearFlags(8192);
        }
    }
}
