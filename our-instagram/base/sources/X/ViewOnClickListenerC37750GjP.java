package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.GjP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC37750GjP implements View.OnClickListener {
    public final /* synthetic */ C37628GhN A00;

    public ViewOnClickListenerC37750GjP(C37628GhN c37628GhN) {
        this.A00 = c37628GhN;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C38321qM c38321qM;
        int A05 = C0f9.A05(541246441);
        C37628GhN c37628GhN = this.A00;
        c37628GhN.A0H.A00("back_or_exit_button");
        JI8 ji8 = c37628GhN.A0K;
        EnumC37860GlF enumC37860GlF = EnumC37860GlF.A04;
        C37624GhJ c37624GhJ = c37628GhN.A0M;
        ji8.AGM(c37624GhJ.A02(), enumC37860GlF, EnumC37861GlG.A06);
        C3DO c3do = C3DN.A00;
        FragmentActivity fragmentActivity = c37628GhN.A0D;
        C3DN A00 = c3do.A00(fragmentActivity);
        if (c37628GhN.A0E.A00() && A00 != null && ((C3DP) A00).A0h) {
            C120985dq A02 = c37624GhJ.A02();
            if (A02 != null && (c38321qM = A02.A02) != null) {
                C37635GhU.A00(c37628GhN.A0G, c38321qM, c37628GhN.A0J.A19, AbstractC111324zv.A00(2844), "dismiss");
            }
            A00.A0T(C05F.A00);
        } else {
            fragmentActivity.onBackPressed();
        }
        C0f9.A0C(-1112270737, A05);
    }
}
