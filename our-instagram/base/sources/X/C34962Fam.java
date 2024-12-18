package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Fam, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34962Fam {
    public View A00;
    public IgSimpleImageView A01;
    public IgTextView A02;
    public C7IK A03;
    public final Activity A04;
    public final UserSession A05;
    public final InterfaceC56392iX A06;
    public final C36297Fzr A07;

    public C34962Fam(Activity activity, View view, UserSession userSession) {
        C14360o3.A0B(view, 1);
        this.A04 = activity;
        this.A05 = userSession;
        InterfaceC56392iX A00 = AbstractC56372iV.A00(view);
        this.A06 = A00;
        this.A07 = AbstractC34062F1p.A00(userSession);
        A00.EZv(new G0Q(this, 0));
    }

    public static final void A00(C34962Fam c34962Fam, C2EE c2ee) {
        C3o9 BKb = c2ee.BKb();
        C14360o3.A0C(BKb, AbstractC111324zv.A00(242));
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = c34962Fam.A05;
        AbstractC03240Dh.A00(A0b, userSession);
        A0b.putParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY, (DirectThreadKey) BKb);
        A0b.putSerializable("prompts_tab", EnumC33420Epr.A07);
        A0b.putInt("direct_thread_sub_type", c2ee.C7g());
        A0b.putInt("direct_thread_audience_type", c2ee.AdZ());
        A0b.putSerializable("prompts_entry_point", EnumC33364Eox.A04);
        AbstractC31177DnL.A0o(c34962Fam.A04, A0b, userSession, AbstractC111324zv.A00(2252));
    }
}
