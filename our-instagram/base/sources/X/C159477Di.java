package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159477Di extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7XQ A01;
    public final /* synthetic */ C163867Va A02;
    public final /* synthetic */ AnonymousClass982 A03;
    public final /* synthetic */ C7XR A04;
    public final /* synthetic */ InterfaceC08830cm A05;
    public final /* synthetic */ InterfaceC08830cm A06;
    public final /* synthetic */ InterfaceC08830cm A07;
    public final /* synthetic */ InterfaceC09390do A08;
    public final /* synthetic */ InterfaceC09390do A09;
    public final /* synthetic */ InterfaceC09390do A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159477Di(C7XQ c7xq, C163867Va c163867Va, AnonymousClass982 anonymousClass982, C7XR c7xr, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, int i) {
        super(0);
        this.A03 = anonymousClass982;
        this.A05 = interfaceC08830cm;
        this.A06 = interfaceC08830cm2;
        this.A09 = interfaceC09390do;
        this.A02 = c163867Va;
        this.A01 = c7xq;
        this.A08 = interfaceC09390do2;
        this.A07 = interfaceC08830cm3;
        this.A00 = i;
        this.A0A = interfaceC09390do3;
        this.A04 = c7xr;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass982 anonymousClass982 = this.A03;
        UserSession userSession = anonymousClass982.A01;
        FragmentActivity A00 = AnonymousClass982.A00(anonymousClass982);
        InterfaceC08830cm interfaceC08830cm = this.A05;
        InterfaceC08830cm interfaceC08830cm2 = this.A06;
        LEK lek = (LEK) this.A09.getValue();
        C163867Va c163867Va = this.A02;
        C7YH c7yh = (C7YH) this.A01.A0q.getValue();
        InterfaceC165187a7 interfaceC165187a7 = (InterfaceC165187a7) this.A08.getValue();
        InterfaceC08830cm interfaceC08830cm3 = this.A07;
        int i = this.A00;
        InterfaceC09390do interfaceC09390do = this.A0A;
        return new C49091LnH(A00, userSession, lek, (InterfaceC165017Zq) interfaceC09390do.getValue(), c7yh, this.A04, interfaceC165187a7, c163867Va, (InterfaceC165227aB) interfaceC09390do.getValue(), interfaceC08830cm, interfaceC08830cm2, interfaceC08830cm3, i);
    }
}
