package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Woa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71139Woa implements InterfaceC72018XFg {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C68251VJn A02;
    public final /* synthetic */ C1V4 A03;

    public C71139Woa(FragmentActivity fragmentActivity, UserSession userSession, C68251VJn c68251VJn, C1V4 c1v4) {
        this.A03 = c1v4;
        this.A02 = c68251VJn;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC72018XFg
    public final /* bridge */ /* synthetic */ Object DV9(C69427VnC c69427VnC, Object obj, int i) {
        C68251VJn c68251VJn = this.A02;
        new C67858Uzp().A0B(c68251VJn.A03.getChildFragmentManager(), "ProfileWizardPlugin_LoaderDialogFragmentName");
        C67887V0u c67887V0u = c68251VJn.A03;
        C1ON A06 = AbstractC152476ta.A06(this.A01);
        A06.A00 = new C66081TzI(this, 32);
        c67887V0u.schedule(A06);
        return null;
    }
}
