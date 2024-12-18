package X;

import android.graphics.Path;

/* loaded from: classes10.dex */
public final class Ss4 implements InterfaceC65310Thm {
    public final Path.FillType A00;
    public final QAf A01;
    public final C58801QAi A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    @Override // X.InterfaceC65310Thm
    public final InterfaceC65466Tki EqE(SQ2 sq2, Q2O q2o, AbstractC63678Srl abstractC63678Srl) {
        return new C63676Srj(q2o, this, abstractC63678Srl);
    }

    public final String toString() {
        return AnonymousClass001.A0L("ShapeFill{color=, fillEnabled=", '}', this.A05);
    }

    public Ss4(Path.FillType fillType, QAf qAf, C58801QAi c58801QAi, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A00 = fillType;
        this.A01 = qAf;
        this.A02 = c58801QAi;
        this.A04 = z2;
    }
}
