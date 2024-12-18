package X;

import java.util.List;

/* renamed from: X.Srq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63683Srq implements InterfaceC65535Tm7 {
    public final C58799QAg A00;
    public final C58799QAg A01;

    @Override // X.InterfaceC65535Tm7
    public final AbstractC63308ShE ALc() {
        return new QAU(AbstractC63684Srr.A00(this.A00), AbstractC63684Srr.A00(this.A01));
    }

    @Override // X.InterfaceC65535Tm7
    public final List BKm() {
        throw AbstractC166987dD.A1D("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // X.InterfaceC65535Tm7
    public final boolean Cde() {
        if (this.A00.Cde() && this.A01.Cde()) {
            return true;
        }
        return false;
    }

    public C63683Srq(C58799QAg c58799QAg, C58799QAg c58799QAg2) {
        this.A00 = c58799QAg;
        this.A01 = c58799QAg2;
    }
}
