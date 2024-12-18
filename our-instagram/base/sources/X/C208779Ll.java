package X;

import java.util.Map;

/* renamed from: X.9Ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208779Ll extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public final C70843Fw A01;
    public final Map A02;
    public final InterfaceC06180Ui A03;
    public final C05A A04;
    public final InterfaceC15070pN A05;
    public final C0UO A06;

    public C208779Ll(C70843Fw c70843Fw) {
        C14360o3.A0B(c70843Fw, 1);
        this.A01 = c70843Fw;
        this.A02 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(5L, 200L), AbstractC166987dD.A1L(10L, 200L), AbstractC167007dF.A0p(AbstractC167007dF.A0d(), 2000L));
        C008002u c008002u = new C008002u(new C38052Gof(AbstractC44317Ji8.A00(this.A01.A00()), false, false));
        this.A04 = c008002u;
        this.A06 = AbstractC208910l.A02(c008002u);
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 0, 0);
        this.A03 = A00;
        this.A05 = new C06160Ug(null, A00);
    }

    public final void A00() {
        C05A c05a = this.A04;
        String str = ((C38052Gof) c05a.getValue()).A00;
        boolean z = ((C38052Gof) c05a.getValue()).A01;
        c05a.getValue();
        C14360o3.A0B(str, 1);
        c05a.Egh(new C38052Gof(str, false, z));
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = null;
    }
}
