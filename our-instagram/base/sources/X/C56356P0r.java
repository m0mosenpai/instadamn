package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.P0r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56356P0r implements InterfaceC58169PqZ {
    public C52364NFc A00;
    public final C81X A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final InterfaceC58310Pt2 A04;
    public final C52469NJn A05;
    public final C50965MfY A06;
    public final InterfaceC11380iw A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        C54525O7c c54525O7c = new C54525O7c(new C54400O2g(this), this);
        AbstractC59962oe abstractC59962oe = this.A02;
        Context requireContext = abstractC59962oe.requireContext();
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A07;
        C50965MfY c50965MfY = this.A06;
        C52469NJn c52469NJn = this.A05;
        C52364NFc c52364NFc = new C52364NFc(requireContext, c50965MfY, abstractC59962oe, interfaceC11380iw, userSession, c54525O7c, c52469NJn.A01);
        AbstractC50522MSa.A0y(c52364NFc);
        c52364NFc.setOrientation(1);
        this.A00 = c52364NFc;
        String str = c52469NJn.A03;
        String str2 = c52469NJn.A02;
        if (str != null && str2 != null) {
            c52364NFc.A01(str, MSX.A0m(str2));
        }
        C52364NFc c52364NFc2 = this.A00;
        if (c52364NFc2 == null) {
            C14360o3.A0F("row");
            throw C00O.createAndThrow();
        }
        return c52364NFc2;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return null;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A01;
    }

    public C56356P0r(C50965MfY c50965MfY, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, C52469NJn c52469NJn) {
        AbstractC167027dH.A13(abstractC59962oe, userSession, c50965MfY);
        AbstractC167017dG.A1T(interfaceC58310Pt2, interfaceC11380iw);
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A06 = c50965MfY;
        this.A05 = c52469NJn;
        this.A04 = interfaceC58310Pt2;
        this.A07 = interfaceC11380iw;
        this.A01 = C81X.A1N;
    }
}
