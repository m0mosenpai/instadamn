package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Eb2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32736Eb2 extends AbstractC32348EMv {
    public static final String __redex_internal_original_name = "DirectDailyPromptsCreationFragment";
    public C66362zD A00;
    public InterfaceC56392iX A01;
    public C36297Fzr A02;
    public C31826Dyk A03;
    public final Runnable A04 = new GLA(this);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC32348EMv, X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC32348EMv, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-660934246);
        super.onCreate(bundle);
        C31826Dyk c31826Dyk = new C31826Dyk(requireContext(), getSession(), EnumC33420Epr.A07, false);
        this.A03 = c31826Dyk;
        UserSession session = getSession();
        C14360o3.A0B(session, 0);
        AbstractC166987dD.A1Z(new MCI(c31826Dyk, session, null, 4), AbstractC141776au.A00(c31826Dyk));
        this.A02 = AbstractC34062F1p.A00(getSession());
        C0f9.A09(-1466822050, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-355403338);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.daily_prompts_creation, viewGroup, false);
        C0f9.A09(-1330636787, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1858978625);
        super.onDestroyView();
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(0);
            C0f9.A09(-334604661, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-1895046400, A02);
            throw A0g;
        }
    }
}
