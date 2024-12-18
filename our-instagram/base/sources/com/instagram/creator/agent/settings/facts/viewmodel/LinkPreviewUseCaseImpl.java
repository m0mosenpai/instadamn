package com.instagram.creator.agent.settings.facts.viewmodel;

import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC26895Btw;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C26084BgD;
import com.instagram.creator.agent.settings.facts.repository.FactsRepository;

/* loaded from: classes5.dex */
public final class LinkPreviewUseCaseImpl extends AbstractC26895Btw {
    public String A00;
    public final C26084BgD A01;
    public final FactsRepository A02;
    public final C05A A03;
    public final C0UO A04;

    public LinkPreviewUseCaseImpl(FactsRepository factsRepository) {
        this.A02 = factsRepository;
        C26084BgD c26084BgD = new C26084BgD(2131957031, 3);
        this.A01 = c26084BgD;
        C008002u A1H = AbstractC25225BEi.A1H(c26084BgD);
        this.A03 = A1H;
        this.A04 = AbstractC208910l.A02(A1H);
    }
}
