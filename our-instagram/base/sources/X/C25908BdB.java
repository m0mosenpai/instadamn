package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.BdB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25908BdB extends C1I4 {
    public final int A00;
    public final Object A01;

    public C25908BdB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0N;
        int i2;
        switch (this.A00) {
            case 0:
                A0N = AbstractC167017dG.A0N(recyclerView, -1746607992);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    ((C26562BoL) this.A01).A03.A0C.Egh(C29262CvJ.A00);
                }
                i2 = 233393898;
                break;
            case 1:
                A0N = C0f9.A03(-1657631769);
                C14360o3.A0B(recyclerView, 0);
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0) {
                    if (i == 1) {
                        ((C29361Cwu) this.A01).A03 = true;
                    }
                } else {
                    C29361Cwu c29361Cwu = (C29361Cwu) this.A01;
                    c29361Cwu.A03 = false;
                    if (!c29361Cwu.A04) {
                        AbstractC56932jR.A07(c29361Cwu.A0C, BE3.A00.A00(c29361Cwu.A0A, 2131967978, c29361Cwu.A01, c29361Cwu.A02));
                        c29361Cwu.A0F.Dj5(c29361Cwu);
                    }
                }
                i2 = -649596872;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
            case 6:
                A0N = C0f9.A03(-903918574);
                C14360o3.A0B(recyclerView, 0);
                super.onScrollStateChanged(recyclerView, i);
                if (recyclerView.getScrollState() == 1) {
                    AbstractC25398BLp abstractC25398BLp = (AbstractC25398BLp) this.A01;
                    AbstractC25227BEk.A1F(abstractC25398BLp.A0C, true);
                    if (!AbstractC166987dD.A1a(abstractC25398BLp.A0B.A00)) {
                        abstractC25398BLp.A08();
                    }
                } else if (i == 0) {
                    AbstractC25398BLp abstractC25398BLp2 = (AbstractC25398BLp) this.A01;
                    if (abstractC25398BLp2.A01 == 2) {
                        C2XI c2xi = abstractC25398BLp2.A0C;
                        if (AbstractC166987dD.A1a(c2xi.A00)) {
                            AbstractC25227BEk.A1F(c2xi, false);
                            abstractC25398BLp2.A04().Cm7(abstractC25398BLp2.A0D.A0E);
                        }
                    }
                }
                ((AbstractC25398BLp) this.A01).A01 = i;
                i2 = 1464580449;
                break;
        }
        C0f9.A0A(i2, A0N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b0, code lost:
    
        if ((r0 instanceof X.C38514GwZ) != false) goto L87;
     */
    @Override // X.C1I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25908BdB.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
