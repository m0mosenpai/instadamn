package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class V2S extends AbstractC70665Wel implements XLL {
    public final X8B A00;
    public final X8C A01;
    public final String A02;
    public final List A03;
    public final C68729Vb8 A04;

    @Override // X.XLL, X.XAG
    public final List AYm() {
        return this.A03;
    }

    @Override // X.XAH
    public final C68729Vb8 BOy() {
        return this.A04;
    }

    @Override // X.XLL
    public final X8B BpK() {
        return this.A00;
    }

    @Override // X.XAI
    public final X8C C6C() {
        return this.A01;
    }

    public V2S(V2J v2j) {
        super(v2j);
        this.A00 = v2j.A01;
        this.A03 = v2j.A04;
        this.A02 = v2j.A03;
        this.A04 = v2j.A00;
        this.A01 = v2j.A02;
    }
}
