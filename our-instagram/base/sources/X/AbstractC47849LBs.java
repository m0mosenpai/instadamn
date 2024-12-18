package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.LBs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47849LBs {
    public static final void A01(AbstractC59962oe abstractC59962oe, String str) {
        A00(abstractC59962oe);
        C0w9.A01.EmO("ThreadKey is null", str, 1);
    }

    public static final void A00(AbstractC59962oe abstractC59962oe) {
        FragmentActivity requireActivity = abstractC59962oe.requireActivity();
        requireActivity.runOnUiThread(new RunnableC49859M0e(requireActivity));
    }
}
