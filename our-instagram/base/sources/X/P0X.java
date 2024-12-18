package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P0X implements InterfaceC58169PqZ {
    public final EnumC53380NjV A00;
    public final C81X A01;
    public final UserSession A02;
    public final C52472NJq A03;
    public final AbstractC59962oe A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        Integer num;
        AbstractC59962oe abstractC59962oe = this.A04;
        UserSession userSession = this.A02;
        String moduleName = abstractC59962oe.getModuleName();
        int i = 2131955361;
        if (this.A06) {
            i = 2131976680;
        }
        SpannableStringBuilder A01 = C55183Odo.A01(abstractC59962oe, userSession, moduleName, AbstractC25227BEk.A0v(abstractC59962oe, i), "https://help.instagram.com/225479678901832");
        Context requireContext = abstractC59962oe.requireContext();
        if (this.A05) {
            num = Integer.valueOf(R.drawable.instagram_text_bg_pano_outline_24);
        } else {
            num = null;
        }
        C52369NFj A012 = OOy.A01(requireContext, AbstractC166997dE.A0b(), A01, num, 2131954804);
        A012.setChecked(AbstractC75343a1.A06(userSession));
        C52369NFj.A02(A012, this, 5);
        return A012;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A00;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public P0X(AbstractC59962oe abstractC59962oe, UserSession userSession, C52472NJq c52472NJq, boolean z, boolean z2) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        C14360o3.A0B(c52472NJq, 5);
        this.A04 = abstractC59962oe;
        this.A02 = userSession;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = c52472NJq;
        this.A01 = C81X.A2J;
        this.A00 = EnumC53380NjV.A0J;
    }
}
