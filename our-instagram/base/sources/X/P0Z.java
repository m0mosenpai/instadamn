package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0Z implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final EnumC53380NjV A01;
    public final C81X A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final InterfaceC58310Pt2 A05;
    public final InterfaceC58190Pqw A06;

    public P0Z(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, InterfaceC58190Pqw interfaceC58190Pqw) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, interfaceC58310Pt2, interfaceC58190Pqw);
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = interfaceC58310Pt2;
        this.A06 = interfaceC58190Pqw;
        this.A02 = C81X.A1l;
        this.A01 = EnumC53380NjV.A0E;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        this.A00 = OOy.A00(this.A03.requireContext(), ViewOnClickListenerC55466OkL.A01(this, 23), Integer.valueOf(R.drawable.instagram_user_following_pano_outline_24), 2131969368);
        this.A06.CiW();
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("brandedContentRow");
            throw C00O.createAndThrow();
        }
        return c50821Mcw;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A02;
    }
}
