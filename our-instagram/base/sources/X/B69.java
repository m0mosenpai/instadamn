package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class B69 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ C164197Wi A02;
    public final /* synthetic */ AnonymousClass982 A03;
    public final /* synthetic */ InterfaceC08830cm A04;
    public final /* synthetic */ InterfaceC08830cm A05;
    public final /* synthetic */ InterfaceC08830cm A06;
    public final /* synthetic */ InterfaceC09390do A07;
    public final /* synthetic */ InterfaceC09390do A08;
    public final /* synthetic */ InterfaceC09390do A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B69(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, C164197Wi c164197Wi, AnonymousClass982 anonymousClass982, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3) {
        super(0);
        this.A03 = anonymousClass982;
        this.A00 = abstractC59962oe;
        this.A01 = interfaceC11380iw;
        this.A09 = interfaceC09390do;
        this.A02 = c164197Wi;
        this.A06 = interfaceC08830cm;
        this.A07 = interfaceC09390do2;
        this.A04 = interfaceC08830cm2;
        this.A08 = interfaceC09390do3;
        this.A05 = interfaceC08830cm3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass982 anonymousClass982 = this.A03;
        UserSession userSession = anonymousClass982.A01;
        FragmentActivity requireActivity = anonymousClass982.A00.requireActivity();
        AbstractC59962oe abstractC59962oe = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        InterfaceC164997Zo interfaceC164997Zo = (InterfaceC164997Zo) this.A09.getValue();
        C7X1 c7x1 = this.A02.A0I;
        InterfaceC08830cm interfaceC08830cm = this.A06;
        return new C49092LnI(requireActivity, abstractC59962oe, interfaceC11380iw, userSession, c7x1, (FPB) this.A08.getValue(), (LEK) this.A07.getValue(), interfaceC164997Zo, interfaceC08830cm, this.A04, this.A05);
    }
}
