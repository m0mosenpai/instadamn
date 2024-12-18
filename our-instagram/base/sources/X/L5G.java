package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.magicmediaremix.viewmodel.MagicMediaRemixViewModel;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* loaded from: classes8.dex */
public final class L5G {
    public RecyclerView A00;
    public C66362zD A01;
    public final Context A02;
    public final View A03;
    public final AbstractC59962oe A04;
    public final UserSession A05;
    public final LI1 A06;
    public final L4C A07;
    public final DirectThreadKey A08;
    public final List A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;

    public L5G(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, LI1 li1, DirectThreadKey directThreadKey) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A03 = view;
        this.A04 = abstractC59962oe;
        this.A08 = directThreadKey;
        this.A06 = li1;
        this.A02 = AbstractC166997dE.A0L(view);
        this.A0B = C50252MHh.A01(this, 5);
        this.A07 = new L4C(view);
        this.A09 = AbstractC166987dD.A1E();
        C50252MHh c50252MHh = new C50252MHh(this, 6);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50252MHh(new C50252MHh(abstractC59962oe, 2), 3));
        this.A0A = AbstractC25225BEi.A0a(new C50252MHh(A00, 4), c50252MHh, new C50170MDx(49, null, A00), AbstractC25225BEi.A1D(MagicMediaRemixViewModel.class));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCI(viewLifecycleOwner, c07s, this, null, 49), C07Y.A00(viewLifecycleOwner));
    }
}
