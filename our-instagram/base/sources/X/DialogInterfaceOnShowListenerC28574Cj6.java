package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cj6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnShowListenerC28574Cj6 implements DialogInterface.OnShowListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ boolean A03;

    public DialogInterfaceOnShowListenerC28574Cj6(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, boolean z) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = c38321qM;
        this.A03 = z;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        InterfaceC11380iw A01;
        EnumC120795dP enumC120795dP;
        BQL bql;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String A2u = this.A02.A2u();
        boolean z = this.A03;
        if (A2u != null && (A01 = C150856qj.A01(fragmentActivity)) != null) {
            if (z) {
                enumC120795dP = EnumC120795dP.A0I;
                bql = BQL.A0d;
            } else {
                enumC120795dP = EnumC120795dP.A0X;
                bql = BQL.A0s;
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(A01, userSession), "instagram_clips_dialog_impression");
            if (A0f.isSampled()) {
                AbstractC25229BEm.A1A(A0f, A01);
                AbstractC25236BEt.A0r(A0f, A2u);
                AbstractC25229BEm.A19(A0f, 0);
                AbstractC25225BEi.A1P(A0f, "");
                A0f.A8R(bql, "action");
                AbstractC25225BEi.A1M(enumC120795dP, A0f);
                AbstractC25232BEp.A1L(A0f, "nav_chain", String.valueOf(AbstractC25225BEi.A14()));
            }
        }
    }
}
