package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Jml, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44541Jml extends AbstractC52922bZ {
    public final UserSession A00;
    public final KPU A01;
    public final C05A A02;
    public final C05A A03;
    public final C0UO A04;
    public final C0UO A05;
    public final C42221xC A06;
    public final C41761wQ A07;

    public final void A01() {
        if (((List) this.A02.getValue()).isEmpty()) {
            this.A03.F8m(AbstractC166997dE.A0b());
            JQn.A00(this.A06, this.A07, this, 6);
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A07.A01();
    }

    public C44541Jml(C42221xC c42221xC, UserSession userSession, KPU kpu) {
        AbstractC167027dH.A13(userSession, kpu, c42221xC);
        this.A00 = userSession;
        this.A01 = kpu;
        this.A06 = c42221xC;
        this.A07 = AbstractC31174DnI.A0S();
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A03 = A1A;
        this.A05 = A1A;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A02 = A0o;
        this.A04 = A0o;
    }

    public static KPU A00(InterfaceC09390do interfaceC09390do) {
        return ((C44541Jml) interfaceC09390do.getValue()).A01;
    }
}
