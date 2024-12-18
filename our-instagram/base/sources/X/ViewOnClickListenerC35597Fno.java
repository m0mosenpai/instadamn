package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

/* renamed from: X.Fno, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35597Fno implements View.OnClickListener {
    public final /* synthetic */ EnumC1579076z A00;
    public final /* synthetic */ EnumC33464Eqz A01;
    public final /* synthetic */ C2EE A02;
    public final /* synthetic */ AAK A03;

    public ViewOnClickListenerC35597Fno(EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, C2EE c2ee, AAK aak) {
        this.A03 = aak;
        this.A02 = c2ee;
        this.A00 = enumC1579076z;
        this.A01 = enumC33464Eqz;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String C7I;
        int A05 = C0f9.A05(-120653337);
        AnonymousClass981 anonymousClass981 = this.A03.A07;
        C2EE c2ee = this.A02;
        EnumC1579076z enumC1579076z = this.A00;
        EnumC33464Eqz enumC33464Eqz = this.A01;
        User user = (User) AbstractC166987dD.A16(c2ee.BSH());
        if (c2ee.BKb() instanceof MsysThreadId) {
            c2ee.BKb();
            C7I = "-1";
        } else {
            C7I = c2ee.C7I();
        }
        C35199Ffr c35199Ffr = new C35199Ffr(enumC1579076z, enumC33464Eqz, Boolean.valueOf(c2ee.isPending()), Boolean.valueOf(c2ee.CVQ()), anonymousClass981.A01.getModuleName(), "direct_thread", user.B7L().name(), C7I, "DEFAULT", "DEFAULT", AbstractC166997dE.A0n(), user.BJ8());
        Fragment fragment = anonymousClass981.A00;
        FragmentActivity requireActivity = fragment.requireActivity();
        UserSession userSession = anonymousClass981.A02;
        F7C.A00(requireActivity, fragment, fragment.requireActivity(), userSession, new FJ7(c2ee.Aa2().contains(userSession.userId), c2ee.C7g()), null, null, user, c35199Ffr, null, null);
        C0f9.A0C(-580002893, A05);
    }
}
