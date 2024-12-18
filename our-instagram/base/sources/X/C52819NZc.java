package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.NZc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52819NZc extends AbstractC52821NZe {
    public C56799PIq A00;
    public AnonymousClass195 A01;
    public final View A02;
    public final C52863NaK A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C52819NZc(android.view.View r11, X.AbstractC59962oe r12, com.instagram.common.session.UserSession r13, X.C105824pt r14) {
        /*
            r10 = this;
            r0 = 2
            r7 = r13
            X.C14360o3.A0B(r13, r0)
            r0 = 38
            X.J8h r5 = new X.J8h
            r6 = r12
            r5.<init>(r0, r13, r12, r14)
            r0 = 11
            X.PgL r2 = new X.PgL
            r2.<init>(r12, r0)
            X.0dv r1 = X.EnumC09460dv.A02
            r0 = 12
            X.0do r4 = X.C57547PgL.A01(r2, r1, r0)
            java.lang.Class<X.NaK> r0 = X.C52863NaK.class
            X.0YZ r3 = X.AbstractC25225BEi.A1D(r0)
            r0 = 13
            X.PgL r2 = new X.PgL
            r2.<init>(r4, r0)
            r1 = 0
            r0 = 28
            X.Pg6 r0 = X.C57532Pg6.A00(r1, r4, r0)
            java.lang.Object r9 = X.MSY.A0c(r2, r5, r0, r3)
            X.NaK r9 = (X.C52863NaK) r9
            r0 = 4
            X.C14360o3.A0B(r9, r0)
            X.6cg r8 = X.EnumC142806cg.A05
            r4 = r10
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A02 = r11
            r10.A03 = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52819NZc.<init>(android.view.View, X.2oe, com.instagram.common.session.UserSession, X.4pt):void");
    }

    @Override // X.AbstractC52821NZe
    public final void A07() {
        this.A03.A05();
        this.A01 = MSY.A0r(this.A01);
        super.A07();
    }

    @Override // X.PJ0, X.InterfaceC58172Pqc
    public final void DHv(C56802PIt c56802PIt) {
        C52863NaK c52863NaK = this.A03;
        AbstractC59962oe abstractC59962oe = ((PJ0) this).A04;
        Context requireContext = abstractC59962oe.requireContext();
        String moduleName = abstractC59962oe.getModuleName();
        C14360o3.A0B(moduleName, 2);
        C51709Mse c51709Mse = (C51709Mse) ((AbstractC51025MgY) c52863NaK).A07.A06.getValue();
        if (c51709Mse != null) {
            AbstractC166987dD.A1Z(new PYk(requireContext, c56802PIt, c51709Mse, c52863NaK, moduleName, null), AbstractC141776au.A00(c52863NaK));
        }
    }

    @Override // X.PJ0, X.InterfaceC58172Pqc
    public final void DWD(C56802PIt c56802PIt) {
        C52863NaK c52863NaK = this.A03;
        Object value = ((AbstractC51025MgY) c52863NaK).A07.A06.getValue();
        if (value != null) {
            AbstractC166987dD.A1Z(new C57168PZm(c56802PIt, value, c52863NaK, (InterfaceC23621Ds) null, 16), AbstractC141776au.A00(c52863NaK));
        }
    }

    @Override // X.PJ0, X.InterfaceC58172Pqc
    public final void E0R(C56802PIt c56802PIt) {
        C52863NaK c52863NaK = this.A03;
        PZE.A02(c52863NaK, AbstractC141776au.A00(c52863NaK), 48);
    }

    @Override // X.AbstractC52821NZe
    public final void A06() {
        super.A06();
        this.A03.A04();
    }

    @Override // X.AbstractC52821NZe
    public final void A08() {
        super.A08();
        C52863NaK c52863NaK = this.A03;
        c52863NaK.A04();
        if (this.A01 == null) {
            this.A01 = AbstractC18560vj.A03(AbstractC25235BEs.A0S(((PJ0) this).A04), C57167PZl.A02(this, c52863NaK.A0B, 12));
        }
    }
}
