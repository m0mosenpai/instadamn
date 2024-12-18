package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56354P0p implements InterfaceC58169PqZ {
    public final EnumC53380NjV A00;
    public final C81X A01;
    public final UserSession A02;
    public final InterfaceC16660sJ A03;
    public final AbstractC59962oe A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        Integer num;
        Context requireContext = this.A04.requireContext();
        if (this.A07) {
            num = Integer.valueOf(R.drawable.instagram_comments_off_pano_outline_24);
        } else {
            num = null;
        }
        C52369NFj A01 = OOy.A01(requireContext, AbstractC166997dE.A0b(), this.A05, num, 2131956097);
        A01.setChecked(this.A06);
        C52369NFj.A02(A01, this, 11);
        return A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A00;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public C56354P0p(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        AbstractC167017dG.A1P(abstractC59962oe, userSession);
        this.A04 = abstractC59962oe;
        this.A02 = userSession;
        this.A07 = z;
        this.A06 = z2;
        this.A05 = str;
        this.A03 = interfaceC16660sJ;
        this.A01 = C81X.A33;
        this.A00 = EnumC53380NjV.A0N;
    }
}
