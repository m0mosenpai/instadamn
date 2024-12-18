package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Hby, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39472Hby extends HGG {
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FragmentActivity fragmentActivity;
        int A03 = C0f9.A03(1624098331);
        int A032 = C0f9.A03(-1996502921);
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c38321qM.A00 = 2;
            c38321qM.AEH(this.A01);
        }
        C37540Gfw c37540Gfw = this.A02;
        C37540Gfw.A02(c120985dq, c37540Gfw);
        if (C37546Gg2.A01(c37540Gfw.A20) == 0 && (fragmentActivity = c37540Gfw.A0R) != null) {
            Intent A033 = AbstractC37304Gc5.A03(c120985dq);
            A033.putExtra("media_action", AbstractC111324zv.A00(2697));
            fragmentActivity.setResult(-1, A033);
            fragmentActivity.onBackPressed();
        }
        C0f9.A0A(1014588746, A032);
        C0f9.A0A(-1934365460, A03);
    }
}
