package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56364P0z implements InterfaceC58169PqZ {
    public final C81X A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final InterfaceC16660sJ A07;
    public final boolean A08;
    public final boolean A09;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A00;
    }

    public C56364P0z(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        AbstractC25234BEr.A1P(abstractC59962oe, userSession, interfaceC11380iw);
        C14360o3.A0B(interfaceC58310Pt2, 6);
        this.A01 = abstractC59962oe;
        this.A03 = userSession;
        this.A09 = z;
        this.A02 = interfaceC11380iw;
        this.A08 = z2;
        this.A04 = interfaceC58310Pt2;
        this.A07 = interfaceC16660sJ;
        this.A00 = C81X.A0J;
        this.A05 = AbstractC58442PvL.A02();
        this.A06 = C1XM.A00(C57525Pfz.A00(this, 37));
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        Integer num;
        CharSequence charSequence;
        boolean z;
        C27S.A00();
        UserSession userSession = this.A03;
        boolean A1X = AbstractC167007dF.A1X(((C47240KuD) userSession.A01(C47240KuD.class, C50184MEl.A00)).A00, C05F.A00);
        AbstractC59962oe abstractC59962oe = this.A01;
        Context requireContext = abstractC59962oe.requireContext();
        if (this.A09) {
            num = Integer.valueOf(R.drawable.instagram_gift_box_pano_outline_24);
        } else {
            num = null;
        }
        C27S.A00();
        new C50650MXp(userSession);
        new C43893Jb2(userSession);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36330527061459862L);
        if (A1X) {
            int i = 2131956694;
            if (A06) {
                i = 2131956695;
            }
            charSequence = AbstractC25227BEk.A0v(abstractC59962oe, i);
        } else {
            Context requireContext2 = abstractC59962oe.requireContext();
            String A0v = AbstractC25227BEk.A0v(abstractC59962oe, 2131956691);
            int i2 = 2131956692;
            if (A06) {
                i2 = 2131956693;
            }
            SpannableStringBuilder A08 = AbstractC31178DnM.A08(abstractC59962oe, A0v, i2);
            AnonymousClass773.A05(A08, new NY0(this, AbstractC31174DnI.A02(requireContext2)), A0v);
            charSequence = A08;
        }
        C52369NFj A01 = OOy.A01(requireContext, AbstractC166997dE.A0b(), charSequence, num, 2131955539);
        if (A1X) {
            z = this.A08;
        } else {
            z = false;
        }
        A01.setChecked(z);
        A01.setEnableSwitchView(A1X);
        C52369NFj.A02(A01, this, 14);
        return A01;
    }
}
