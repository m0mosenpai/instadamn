package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes9.dex */
public final class PQM implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C50724MaP A01;

    public PQM(View view, C50724MaP c50724MaP) {
        this.A01 = c50724MaP;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C50724MaP c50724MaP = this.A01;
        FragmentActivity activity = c50724MaP.getActivity();
        if (activity != null) {
            C5SU A0f = AbstractC167017dG.A0f(activity, c50724MaP.requireContext().getString(2131962414));
            A0f.A02();
            A0f.A03(this.A00);
            KYR.A00(A0f, c50724MaP, 6).A07(AbstractC166987dD.A0r(c50724MaP.A0i));
        }
    }
}
