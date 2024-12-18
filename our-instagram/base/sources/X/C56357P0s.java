package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56357P0s implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final AbstractC59962oe A01;
    public final C50880MeB A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final NKF A05;
    public final InterfaceC16820sZ A06;
    public final C81X A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        String str;
        this.A00 = OOy.A00(this.A01.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 30), Integer.valueOf(R.drawable.instagram_link_pano_outline_24), 2131955564);
        UserSession userSession = this.A04;
        C22C A01 = AnonymousClass229.A01(userSession);
        EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0L;
        String id = AbstractC166987dD.A10(userSession).getId();
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw != null) {
            String str2 = c50821Mcw.A00;
            if (str2 != null && str2.length() != 0) {
                str = "edit_button";
            } else {
                str = "add_button";
            }
            A01.A1U(enumC50631MWs, null, id, str, this.A03.getModuleName());
            C50821Mcw c50821Mcw2 = this.A00;
            if (c50821Mcw2 != null) {
                return c50821Mcw2;
            }
        }
        C14360o3.A0F("addLinkRow");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A07;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A01;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 41), C07Y.A00(viewLifecycleOwner));
    }

    public C56357P0s(AbstractC59962oe abstractC59962oe, C50880MeB c50880MeB, InterfaceC11380iw interfaceC11380iw, UserSession userSession, NKF nkf, InterfaceC16820sZ interfaceC16820sZ) {
        JQ0.A1O(abstractC59962oe, userSession, nkf, c50880MeB, interfaceC11380iw);
        this.A01 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = nkf;
        this.A02 = c50880MeB;
        this.A03 = interfaceC11380iw;
        this.A06 = interfaceC16820sZ;
        this.A07 = C81X.A1M;
    }
}
