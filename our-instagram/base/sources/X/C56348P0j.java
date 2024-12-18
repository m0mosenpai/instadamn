package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56348P0j implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final NK4 A05;
    public final boolean A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A02;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 12), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A02;
        SpannableStringBuilder A01 = C55183Odo.A01(abstractC59962oe, this.A04, abstractC59962oe.getModuleName(), AbstractC25227BEk.A0v(abstractC59962oe, 2131955440), "https://help.instagram.com/520831036611383");
        Context requireContext = abstractC59962oe.requireContext();
        Integer num = null;
        if (this.A06) {
            num = Integer.valueOf(R.drawable.instagram_download_pano_outline_24);
        }
        C52369NFj A012 = OOy.A01(requireContext, AbstractC166997dE.A0b(), A01, num, 2131955251);
        this.A00 = A012;
        C52369NFj.A02(A012, this, 22);
        return A012;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public C56348P0j(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, NK4 nk4, boolean z) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC11380iw);
        C14360o3.A0B(nk4, 5);
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A06 = z;
        this.A03 = interfaceC11380iw;
        this.A05 = nk4;
        this.A01 = C81X.A0L;
    }
}
