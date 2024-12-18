package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class M2P implements Runnable {
    public final /* synthetic */ C149216nV A00;

    public M2P(C149216nV c149216nV) {
        this.A00 = c149216nV;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C149216nV c149216nV = this.A00;
        View view = c149216nV.A08;
        if (view != null) {
            view.setAlpha(0.0f);
            View view2 = c149216nV.A08;
            C14360o3.A0A(view2);
            view2.setVisibility(0);
            View view3 = c149216nV.A08;
            C14360o3.A0A(view3);
            view3.animate().withLayer().setStartDelay(200L).setDuration(200L).alpha(0.5f).setListener(new LLs(c149216nV, 17));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
