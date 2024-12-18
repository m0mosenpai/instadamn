package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.M3u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49953M3u implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ JR2 A01;

    public RunnableC49953M3u(View view, JR2 jr2) {
        this.A01 = jr2;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity activity;
        JR2 jr2 = this.A01;
        AbstractC59962oe abstractC59962oe = jr2.A1L;
        if (abstractC59962oe.isAdded() && (activity = abstractC59962oe.getActivity()) != null && !activity.isFinishing()) {
            C5SU A0U = AbstractC167007dF.A0U(abstractC59962oe.requireActivity(), 2131959579);
            A0U.A03(this.A00);
            A0U.A01();
            A0U.A07(C5SV.A07);
            A0U.A0A = true;
            KYR.A00(A0U, jr2, 10).A06();
        }
    }
}
