package X;

import java.util.List;

/* renamed from: X.ItU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42611ItU implements JG6 {
    public final /* synthetic */ HEM A00;

    @Override // X.JG6
    public final AbstractC39655Hik Bsw(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        int indexOf = ((List) ((C37838Gks) this.A00.A02.A05.getValue()).A06).indexOf(c38321qM);
        if (indexOf == -1) {
            return HLT.A00;
        }
        return new HLR(indexOf + 1);
    }

    public C42611ItU(HEM hem) {
        this.A00 = hem;
    }
}
