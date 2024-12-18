package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationListFragment;

/* loaded from: classes11.dex */
public final class V5V extends AbstractC66412zI {
    public C70846WiC A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C69619VsM A03;
    public final C69387VmX A04;
    public final C69786VvR A05;
    public final LocationListFragment A06;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ((C66490UJs) c3oo).A00(this.A00, (C70788Wh1) interfaceC66482zP);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C69786VvR c69786VvR = this.A05;
        C69619VsM c69619VsM = this.A03;
        C69387VmX c69387VmX = this.A04;
        LocationListFragment locationListFragment = this.A06;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0B(viewGroup, 0);
        JQ0.A1O(userSession, interfaceC11380iw, c69786VvR, c69619VsM, c69387VmX);
        return new C66490UJs((ViewGroup) AbstractC31175DnJ.A07(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_location_list_item, false), interfaceC11380iw, userSession, c69619VsM, c69387VmX, c69786VvR, locationListFragment);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C70788Wh1.class;
    }

    public V5V(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C69619VsM c69619VsM, C69387VmX c69387VmX, C69786VvR c69786VvR, LocationListFragment locationListFragment, C70846WiC c70846WiC) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A00 = c70846WiC;
        this.A05 = c69786VvR;
        this.A03 = c69619VsM;
        this.A04 = c69387VmX;
        this.A06 = locationListFragment;
    }
}
