package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class P18 implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final EnumC53380NjV A01;
    public final C81X A02;
    public final AbstractC59962oe A03;
    public final InterfaceC41501vz A04;
    public final UserSession A05;
    public final InterfaceC58310Pt2 A06;
    public final EnumC53117NeU A07;
    public final String A08;
    public final boolean A09;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    public static final String A00(P18 p18, List list, boolean z) {
        String string;
        if (z) {
            string = AbstractC166997dE.A0N(p18.A03).getQuantityString(R.plurals.on_x_countries, list.size(), AbstractC25228BEl.A1Y(list.size()));
        } else {
            string = p18.A03.getString(2131973623);
        }
        C14360o3.A07(string);
        return string;
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A03;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A05;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        String str = this.A08;
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC001800i.A0X(A00.A0I(str)));
        boolean A25 = A00.A25(str);
        ViewOnClickListenerC55407OjI viewOnClickListenerC55407OjI = new ViewOnClickListenerC55407OjI(1, A1F, this, A25);
        Integer num = null;
        if (this.A09) {
            num = Integer.valueOf(R.drawable.instagram_location_pano_outline_24);
        }
        String A002 = A00(this, A1F, A25);
        C50821Mcw c50821Mcw = new C50821Mcw(requireContext);
        c50821Mcw.setTitle(requireContext.getResources().getString(2131973624));
        c50821Mcw.setInlineSubtitle(A002);
        C0fQ.A00(viewOnClickListenerC55407OjI, c50821Mcw);
        if (num != null) {
            c50821Mcw.setIcon(MSX.A07(requireContext, num));
        }
        AbstractC50522MSa.A0z(c50821Mcw);
        this.A00 = c50821Mcw;
        c50821Mcw.setDescription(abstractC59962oe.getString(2131973622));
        if (this.A07 == EnumC53117NeU.A03) {
            AbstractC25651Mw.A00(userSession).A01(this.A04, C55974Ot7.class);
            abstractC59962oe.mLifecycleRegistry.A09(new C50623MWk(this, 2));
        }
        C50821Mcw c50821Mcw2 = this.A00;
        if (c50821Mcw2 == null) {
            C14360o3.A0F("geoGatingRow");
            throw C00O.createAndThrow();
        }
        return c50821Mcw2;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A02;
    }

    public P18(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, EnumC53117NeU enumC53117NeU, String str, boolean z) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC58310Pt2);
        this.A03 = abstractC59962oe;
        this.A05 = userSession;
        this.A09 = z;
        this.A06 = interfaceC58310Pt2;
        this.A08 = str;
        this.A07 = enumC53117NeU;
        this.A02 = C81X.A0a;
        this.A01 = EnumC53380NjV.A08;
        this.A04 = C56035Ou7.A00(this, 67);
    }
}
