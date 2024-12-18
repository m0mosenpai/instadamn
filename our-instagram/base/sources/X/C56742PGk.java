package X;

import android.view.View;

/* renamed from: X.PGk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56742PGk implements InterfaceC1810781j {
    public final /* synthetic */ C52692NTd A00;

    public C56742PGk(C52692NTd c52692NTd) {
        this.A00 = c52692NTd;
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        int i;
        View A0d;
        int A05 = AbstractC25227BEk.A05((EnumC1810181d) obj2, 1);
        if (A05 != 3) {
            if (A05 == 2) {
                C52692NTd c52692NTd = this.A00;
                ((C8FP) c52692NTd.A0U.getValue()).DEo();
                C52692NTd.A03(c52692NTd);
                i = 8;
                MSW.A0q(c52692NTd.A0S).A07.setVisibility(8);
                A0d = AbstractC166987dD.A0d(c52692NTd.A0P);
            }
            C52692NTd c52692NTd2 = this.A00;
            C52692NTd.A07(c52692NTd2, c52692NTd2.A03.A0V);
        }
        C52692NTd c52692NTd3 = this.A00;
        InterfaceC09390do interfaceC09390do = c52692NTd3.A0U;
        ((C8FP) interfaceC09390do.getValue()).DDl();
        ((C8FP) interfaceC09390do.getValue()).EgG(c52692NTd3.A00);
        C52692NTd.A03(c52692NTd3);
        C55210OeT A0q = MSW.A0q(c52692NTd3.A0S);
        i = 0;
        A0q.A07.setVisibility(0);
        C55210OeT.A05(A0q, -1, C55210OeT.A02(A0q).indexOf(A0q.A02));
        A0q.A09.postDelayed(new RunnableC56913PNg(A0q), 20L);
        A0d = AbstractC166987dD.A0d(c52692NTd3.A0P);
        A0d.setVisibility(i);
        C52692NTd c52692NTd22 = this.A00;
        C52692NTd.A07(c52692NTd22, c52692NTd22.A03.A0V);
    }
}
