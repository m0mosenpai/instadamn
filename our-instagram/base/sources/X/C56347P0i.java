package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56347P0i implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final EnumC53380NjV A01;
    public final C81X A02;
    public final UserSession A03;
    public final C52466NJk A04;
    public final AbstractC59962oe A05;
    public final boolean A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A05;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C50122MBw(viewLifecycleOwner, c07s, this, null, 11), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        AbstractC59962oe abstractC59962oe = this.A05;
        SpannableStringBuilder A01 = C55183Odo.A01(abstractC59962oe, this.A03, abstractC59962oe.getModuleName(), AbstractC25227BEk.A0v(abstractC59962oe, 2131955951), "https://help.instagram.com/610485296790527/?helpref=search&query=template&search_session_id=258850ea2a3975246b12d955c183932b&sr=3");
        Context requireContext = abstractC59962oe.requireContext();
        Integer num = null;
        if (this.A06) {
            num = Integer.valueOf(R.drawable.instagram_templates_pano_outline_24);
        }
        C52369NFj A012 = OOy.A01(requireContext, AbstractC166997dE.A0b(), A01, num, 2131955952);
        this.A00 = A012;
        C52369NFj.A02(A012, this, 21);
        return A012;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A02;
    }

    public C56347P0i(AbstractC59962oe abstractC59962oe, UserSession userSession, C52466NJk c52466NJk, boolean z) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, c52466NJk);
        this.A05 = abstractC59962oe;
        this.A03 = userSession;
        this.A06 = z;
        this.A04 = c52466NJk;
        this.A02 = C81X.A0K;
        this.A01 = EnumC53380NjV.A06;
    }
}
