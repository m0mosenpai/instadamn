package X;

import android.view.ViewGroup;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.Ikj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42076Ikj implements C07W {
    public final String A00;
    public final ViewGroup A01;
    public final C07T A02;
    public final C126545np A03;
    public final C6T7 A04;

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public void onDestroy() {
        this.A02.A0A(this);
        C126545np c126545np = this.A03;
        ViewGroup viewGroup = this.A01;
        C6T7 c6t7 = this.A04;
        c126545np.setVisibility(8);
        viewGroup.removeView(c126545np);
        c6t7.A03();
    }

    public C42076Ikj(ViewGroup viewGroup, C07T c07t, C126545np c126545np, C6T7 c6t7, String str) {
        this.A00 = str == null ? "" : str;
        this.A01 = viewGroup;
        this.A02 = c07t;
        this.A03 = c126545np;
        this.A04 = c6t7;
    }
}
