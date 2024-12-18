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
public final class QuestionAnswerFactPreviewUseCaseImpl extends AbstractC26895Btw {
    public String A00;
    public final FactsRepository A01;
    public final C05A A02;
    public final C0UO A03;

    public QuestionAnswerFactPreviewUseCaseImpl(FactsRepository factsRepository) {
        this.A01 = factsRepository;
        C008002u A1H = AbstractC25225BEi.A1H(new C26084BgD(0, 7));
        this.A02 = A1H;
        this.A03 = AbstractC208910l.A02(A1H);
    }
}
