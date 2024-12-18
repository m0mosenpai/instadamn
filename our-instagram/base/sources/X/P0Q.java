package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0Q implements InterfaceC58169PqZ {
    public final C81X A00;
    public final UserSession A01;
    public final InterfaceC16660sJ A02;
    public final AbstractC59962oe A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        Integer num;
        AbstractC59962oe abstractC59962oe = this.A03;
        SpannableStringBuilder A01 = C55183Odo.A01(abstractC59962oe, this.A01, "share_reels_advanced_settings", AbstractC25227BEk.A0v(abstractC59962oe, 2131955292), "https://help.instagram.com/329208821595430");
        Context requireContext = abstractC59962oe.requireContext();
        if (this.A05) {
            num = Integer.valueOf(R.drawable.instagram_music_effects_pano_outline_24);
        } else {
            num = null;
        }
        C52369NFj A012 = OOy.A01(requireContext, AbstractC166997dE.A0b(), A01, num, 2131955293);
        A012.setChecked(this.A04);
        C52369NFj.A02(A012, this, 7);
        return A012;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A00;
    }

    public P0Q(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A03 = abstractC59962oe;
        this.A01 = userSession;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = interfaceC16660sJ;
        this.A00 = C81X.A0I;
    }
}
