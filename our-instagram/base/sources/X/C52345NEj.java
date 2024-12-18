package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.NEj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52345NEj extends AbstractC66412zI {
    public int A00;
    public int A01;
    public final Activity A02;
    public final UserSession A03;
    public final C54602OAd A04;
    public final InterfaceC57970PnG A05;

    public C52345NEj(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC57970PnG interfaceC57970PnG, InterfaceC64002vL interfaceC64002vL, int i, int i2) {
        C14360o3.A0B(interfaceC64002vL, 2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = activity;
        this.A03 = userSession;
        this.A05 = interfaceC57970PnG;
        this.A04 = new C54602OAd(interfaceC11380iw, interfaceC57970PnG, interfaceC64002vL);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C0YR[] c0yrArr = C51366MmR.A06;
        return new C51366MmR(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_highlight_in_grid_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51366MmR c51366MmR = (C51366MmR) c3oo;
        C14360o3.A0B(c51366MmR, 1);
        AbstractC13880nE.A0g(AbstractC31171DnF.A06(c51366MmR), this.A01);
        AbstractC13880nE.A0W(AbstractC31171DnF.A06(c51366MmR), this.A00);
        C54602OAd c54602OAd = this.A04;
        Activity activity = this.A02;
        UserSession userSession = this.A03;
        AbstractC167007dF.A1D(activity, 1, userSession);
        ((View) c51366MmR.A04.CES(c51366MmR, C51366MmR.A06[0])).setVisibility(8);
        c51366MmR.A02.setVisibility(8);
        RelativeLayout relativeLayout = c51366MmR.A01;
        relativeLayout.setVisibility(0);
        Iterator it = AbstractC16960so.A1Q(relativeLayout, c51366MmR.A03).iterator();
        while (it.hasNext()) {
            ViewOnClickListenerC55459OkE.A01(AbstractC43592JPx.A09(it), activity, userSession, c54602OAd, 25);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C52355NEt.class;
    }
}
