package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* loaded from: classes9.dex */
public final class P0T implements InterfaceC58169PqZ {
    public C50821Mcw A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final NK0 A05;

    public P0T(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, NK0 nk0) {
        AbstractC167027dH.A0a(1, abstractC59962oe, userSession, nk0, interfaceC58310Pt2);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A05 = nk0;
        this.A04 = interfaceC58310Pt2;
        this.A01 = C81X.A0s;
    }

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        int i;
        PendingRecipient pendingRecipient = this.A05.A03;
        Context requireContext = this.A02.requireContext();
        if (pendingRecipient != null && AbstractC53943NtG.A00(AbstractC166987dD.A1J(pendingRecipient)) == C05F.A0C && AbstractC151756sL.A01()) {
            MSX.A0t();
            i = 2131969025;
        } else {
            i = 2131955692;
        }
        C50821Mcw A00 = OOy.A00(requireContext, ViewOnClickListenerC55448Ojx.A00, Integer.valueOf(R.drawable.instagram_photo_grid_pano_outline_24), i);
        this.A00 = A00;
        ViewOnClickListenerC55466OkL.A02(A00, 35, this);
        C50821Mcw c50821Mcw = this.A00;
        if (c50821Mcw == null) {
            C14360o3.A0F("profileDisplayRow");
            throw C00O.createAndThrow();
        }
        return c50821Mcw;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 48), C07Y.A00(viewLifecycleOwner));
    }
}
