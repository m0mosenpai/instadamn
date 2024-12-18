package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159517Dm extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C18920wW A01;
    public final /* synthetic */ C7XQ A02;
    public final /* synthetic */ C163867Va A03;
    public final /* synthetic */ AnonymousClass982 A04;
    public final /* synthetic */ EnumC92794Ds A05;
    public final /* synthetic */ InterfaceC60442pS A06;
    public final /* synthetic */ InterfaceC08830cm A07;
    public final /* synthetic */ InterfaceC09390do A08;
    public final /* synthetic */ InterfaceC09390do A09;
    public final /* synthetic */ InterfaceC16820sZ A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159517Dm(AbstractC59962oe abstractC59962oe, C18920wW c18920wW, C7XQ c7xq, C163867Va c163867Va, AnonymousClass982 anonymousClass982, EnumC92794Ds enumC92794Ds, InterfaceC60442pS interfaceC60442pS, InterfaceC08830cm interfaceC08830cm, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC16820sZ interfaceC16820sZ) {
        super(0);
        this.A04 = anonymousClass982;
        this.A06 = interfaceC60442pS;
        this.A01 = c18920wW;
        this.A00 = abstractC59962oe;
        this.A05 = enumC92794Ds;
        this.A03 = c163867Va;
        this.A02 = c7xq;
        this.A09 = interfaceC09390do;
        this.A08 = interfaceC09390do2;
        this.A07 = interfaceC08830cm;
        this.A0A = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession = this.A04.A01;
        InterfaceC60442pS interfaceC60442pS = this.A06;
        C18920wW c18920wW = this.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        EnumC92794Ds enumC92794Ds = this.A05;
        C163867Va c163867Va = this.A03;
        C7YP c7yp = (C7YP) this.A02.A0l.getValue();
        InterfaceC09390do interfaceC09390do = this.A09;
        Object value = interfaceC09390do.getValue();
        C14360o3.A07(value);
        Object value2 = interfaceC09390do.getValue();
        C14360o3.A07(value2);
        return new G4H(abstractC59962oe, c18920wW, userSession, c7yp, c163867Va, (C7ZY) value, (InterfaceC165687av) this.A08.getValue(), (InterfaceC165457aY) value2, enumC92794Ds, interfaceC60442pS, new C64951TaW(this.A07), this.A0A);
    }
}
