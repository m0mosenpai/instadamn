package X;

import android.graphics.Path;

/* renamed from: X.Srv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63688Srv implements InterfaceC65310Thm {
    public final Path.FillType A00;
    public final C58800QAh A01;
    public final C58801QAi A02;
    public final C58802QAj A03;
    public final C58802QAj A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;

    @Override // X.InterfaceC65310Thm
    public final InterfaceC65466Tki EqE(SQ2 sq2, Q2O q2o, AbstractC63678Srl abstractC63678Srl) {
        return new C63677Srk(sq2, q2o, this, abstractC63678Srl);
    }

    public C63688Srv(Path.FillType fillType, C58800QAh c58800QAh, C58801QAi c58801QAi, C58802QAj c58802QAj, C58802QAj c58802QAj2, Integer num, String str, boolean z) {
        this.A05 = num;
        this.A00 = fillType;
        this.A01 = c58800QAh;
        this.A02 = c58801QAi;
        this.A04 = c58802QAj;
        this.A03 = c58802QAj2;
        this.A06 = str;
        this.A07 = z;
    }
}
