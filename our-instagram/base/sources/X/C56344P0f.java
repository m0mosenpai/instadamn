package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.P0f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56344P0f implements InterfaceC58169PqZ {
    public C52369NFj A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final NKK A04;
    public final EnumC53380NjV A05;
    public final boolean A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        SpannableStringBuilder A01;
        AbstractC59962oe abstractC59962oe = this.A02;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A03;
        C54813OKo c54813OKo = new C54813OKo(requireContext, userSession, AbstractC63302u8.A00(userSession));
        MonetizationRepository monetizationRepository = c54813OKo.A02;
        UserMonetizationProductType userMonetizationProductType = UserMonetizationProductType.A0D;
        int i = 2131963769;
        if (!monetizationRepository.A03(userMonetizationProductType)) {
            i = 2131963768;
        }
        String A0p = AbstractC166997dE.A0p(requireContext, i);
        boolean z = this.A06;
        if (z) {
            A0p = AnonymousClass001.A0g(AbstractC166997dE.A0p(requireContext, 2131963785), " - ", A0p);
        }
        if (!monetizationRepository.A03(userMonetizationProductType)) {
            A01 = c54813OKo.A01(new C56480P5u(this, 0), "https://www.facebook.com/help/instagram/793848097773634", true);
        } else {
            A01 = c54813OKo.A01(new C56480P5u(this, 1), "https://help.instagram.com/2635536099905516", false);
        }
        Context requireContext2 = abstractC59962oe.requireContext();
        Integer num = null;
        if (z) {
            num = Integer.valueOf(R.drawable.instagram_ad_pano_outline_24);
        }
        C52369NFj c52369NFj = new C52369NFj(requireContext2);
        AbstractC50522MSa.A0y(c52369NFj);
        c52369NFj.setOrientation(1);
        c52369NFj.setTitle(A0p);
        if (num != null) {
            c52369NFj.setIcon(MSX.A07(requireContext2, num));
        }
        c52369NFj.setSubtitle(A01);
        c52369NFj.setInlineSubtitleLinkable(true);
        this.A00 = c52369NFj;
        c52369NFj.setHideSwitchView(true);
        C52369NFj c52369NFj2 = this.A00;
        if (c52369NFj2 == null) {
            C14360o3.A0F("monetizationRowView");
            throw C00O.createAndThrow();
        }
        return c52369NFj2;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A05;
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
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 42), C07Y.A00(viewLifecycleOwner));
    }

    public C56344P0f(AbstractC59962oe abstractC59962oe, UserSession userSession, NKK nkk, boolean z) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, nkk);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A06 = z;
        this.A04 = nkk;
        this.A01 = C81X.A1b;
        this.A05 = EnumC53380NjV.A0D;
    }
}
