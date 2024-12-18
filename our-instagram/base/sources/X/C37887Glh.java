package X;

import java.util.List;

/* renamed from: X.Glh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37887Glh extends AbstractC154286wd {
    public final /* synthetic */ C37878GlY A00;
    public final /* synthetic */ C37866GlL A01;
    public final /* synthetic */ C15100pQ A02;
    public final /* synthetic */ boolean A03;

    public C37887Glh(C37878GlY c37878GlY, C37866GlL c37866GlL, C15100pQ c15100pQ, boolean z) {
        this.A01 = c37866GlL;
        this.A00 = c37878GlY;
        this.A03 = z;
        this.A02 = c15100pQ;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-818348083);
        InterfaceC124295jj interfaceC124295jj = (InterfaceC124295jj) obj;
        int A032 = C0f9.A03(1179818210);
        C14360o3.A0B(interfaceC124295jj, 0);
        C37866GlL c37866GlL = this.A01;
        InterfaceC111084zP BbA = interfaceC124295jj.BbA();
        C37878GlY c37878GlY = this.A00;
        String str = c37878GlY.A02;
        c37866GlL.A00 = C37866GlL.A00(BbA, str, false, false);
        List A06 = C37866GlL.A06(c37866GlL, C37866GlL.A05(interfaceC124295jj));
        C37866GlL.A08(interfaceC124295jj, c37866GlL, A06, true, false);
        C153696ve c153696ve = c37866GlL.A04;
        if (c153696ve != null) {
            c153696ve.A03();
        }
        boolean z = this.A03;
        if (!z) {
            c37866GlL.A09.A00();
            c37866GlL.A02 = false;
        }
        C37880Gla c37880Gla = c37866GlL.A09;
        C15100pQ c15100pQ = this.A02;
        int i = c15100pQ.A00;
        c15100pQ.A00 = i + 1;
        c37880Gla.A02(interfaceC124295jj, A06, i, true, c37878GlY.A06, true, z, true, false, false);
        C37866GlL.A09(c37866GlL, interfaceC124295jj.Bb1());
        C37866GlL.A07(interfaceC124295jj.BbA(), c37866GlL, str, A06, c37878GlY.A04);
        C0f9.A0A(-1997708683, A032);
        C0f9.A0A(295606116, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1420450988);
        C14360o3.A0B(abstractC115105If, 0);
        boolean z = this.A03;
        if (!z) {
            this.A01.A09.A00();
        }
        C37866GlL c37866GlL = this.A01;
        C37880Gla c37880Gla = c37866GlL.A09;
        C15100pQ c15100pQ = this.A02;
        int i = c15100pQ.A00;
        c15100pQ.A00 = i + 1;
        c37880Gla.A03(abstractC115105If, i, true, this.A00.A06, true, z, false);
        c37866GlL.A02 = false;
        C0f9.A0A(1536578841, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-2072357231);
        if (this.A03) {
            C37866GlL c37866GlL = this.A01;
            c37866GlL.A09.A00();
            c37866GlL.A02 = false;
        }
        C0f9.A0A(1766868309, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1326631060);
        C37866GlL c37866GlL = this.A01;
        c37866GlL.A09.A04(((C5R4) c37866GlL.A05).BfR(c37866GlL.A07), true, this.A00.A06, this.A03, false);
        C0f9.A0A(654606723, A03);
    }
}
