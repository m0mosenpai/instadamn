package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes6.dex */
public final class EO7 extends AbstractC43842Ja5 {
    public static final String __redex_internal_original_name = "RtcCowatchClosedCaptionSelectorFragment";
    public final UserSession A00;
    public final int A01;
    public final List A02;
    public final InterfaceC16660sJ A03;

    public EO7(UserSession userSession, List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        C14360o3.A0B(list, 1);
        this.A02 = list;
        this.A03 = interfaceC16660sJ;
        this.A00 = userSession;
        this.A01 = i;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "rtc_cowatch_closed_caption_selector_fragment";
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        List<QIj> list = this.A02;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (QIj qIj : list) {
            A0q.add(new C36201FyF(qIj.A05, list.indexOf(qIj) + 1, this.A01));
        }
        ArrayList A0U = AbstractC001800i.A0U(A0q);
        A0U.add(0, new C36201FyF(AbstractC166997dE.A0p(view.getContext(), 2131956915), 0, this.A01));
        A0B(A0U);
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EXA(this.A03));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37087GVw.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A00;
    }
}
