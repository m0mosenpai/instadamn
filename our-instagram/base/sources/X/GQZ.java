package X;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes6.dex */
public final class GQZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ C32366ENp A03;

    public GQZ(TextView textView, FragmentActivity fragmentActivity, C32366ENp c32366ENp, int i) {
        this.A02 = fragmentActivity;
        this.A00 = i;
        this.A01 = textView;
        this.A03 = c32366ENp;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = this.A02;
        C5SU A0f = AbstractC167017dG.A0f(fragmentActivity, fragmentActivity.getResources().getString(2131961568));
        A0f.A04(this.A01, 0, -this.A00, true);
        A0f.A02();
        A0f.A0B = false;
        A0f.A0A = true;
        C32366ENp c32366ENp = this.A03;
        EfP.A00(A0f, c32366ENp, 13).A07(c32366ENp.getSession());
    }
}
