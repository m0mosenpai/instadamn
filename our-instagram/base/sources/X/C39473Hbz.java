package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hbz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39473Hbz extends HGG {
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        FragmentActivity fragmentActivity;
        ImageUrl A1S;
        int A03 = C0f9.A03(1543284701);
        int A032 = C0f9.A03(1979397978);
        C120985dq c120985dq = this.A00;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            c38321qM.A00 = 0;
            c38321qM.A4L(C05F.A01);
            c38321qM.AEH(this.A01);
        }
        C37540Gfw c37540Gfw = this.A02;
        C37540Gfw.A02(c120985dq, c37540Gfw);
        if (C37546Gg2.A01(c37540Gfw.A20) == 0 && (fragmentActivity = c37540Gfw.A0R) != null) {
            Intent A033 = AbstractC37304Gc5.A03(c120985dq);
            A033.putExtra("media_action", AbstractC111324zv.A00(2698));
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null && (A1S = c38321qM2.A1S()) != null) {
                A033.putExtra(AbstractC111324zv.A00(1102), A1S.getUrl());
                A033.putExtra(AbstractC111324zv.A00(2708), A1S.getHeight());
                A033.putExtra(AbstractC111324zv.A00(2709), A1S.getWidth());
            }
            fragmentActivity.setResult(-1, A033);
            fragmentActivity.onBackPressed();
        }
        C0f9.A0A(598730574, A032);
        C0f9.A0A(119825064, A03);
    }
}
